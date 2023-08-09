// Create cur1 and cur2 and have them point to the heads of their respective lists.
// If either val is empty, return the other value.
// Create next1 and next2 and have them point to the next node in their respective lists.
// val returnList = null
// If cur1 >= cur2
//      cur2.next = cur1
//      returnList = list2
// else
//      cur1.next = cur2
//      returnList = list1
// While (next1 != null && next2 != null)
//     if nextVal <= next2
//      cur1 = next1
//      next1 = cur1.next
//      cur1.next = next2
//      cur2 = next2
//      next2 = next2.next
// else
//      cur2 = next2
//      next2 = next2.next
//      cur1 = next1
//      cur2.next = cur1
//      next1 = next1.next
//      return returnList

class ListNode(val `val`: Int, var next: ListNode? = null) {
    override fun toString(): String {
        return "$`val`, $next "
    }
}
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    if (list1 == null) return list2
    if (list2 == null) return list1

    var cur1: ListNode = list1
    var cur2: ListNode = list2
    val returnList = if (cur1.`val` >= cur2.`val`) list2 else list1

    while (true) {
        if (cur1.`val` >= cur2.`val`){
            if(cur2.next == null){
                cur2.next = cur1
                break
            }

            if(cur1.`val` > cur2.next!!.`val`){
                cur2 = cur2.next!!
            } else{
                val next = cur2.next!!
                cur2.next = cur1
                cur2 = next
            }
        } else {
            if(cur1.next == null){
                cur1.next = cur2
                break
            }
            if(cur2.`val` > cur1.next!!.`val`){
                cur1 = cur1.next!!
            } else{
                val next = cur1.next!!
                cur1.next = cur2
                cur1 = next
            }
        }
    }

    return returnList
}
//fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//
//    if (list1 == null) return list2
//    if (list2 == null) return list1
//
//    var cur1 = list1
//    var cur2 = list2
//    var cur3 = ListNode(0)
//    val returnList = if (cur1.`val` >= cur2.`val`) list2 else list1
//
////    while (true) {
////        if (cur1 == null) {
////            cur3.next = cur2
////            break
////        }
////        if (cur2 == null) {
////            cur3.next = cur1
////            break
////        }
////        if(cur1.`val` > cur2.`val`){
////            cur3.next = cur2
////            cur2 = cur2.next
////        }else {
////            cur3.next = cur1
////            cur1 = cur1.next
////        }
////        cur3 = cur3.next!!
////    }
////
////    return returnList
//}

fun main() {

    val input1 = ListNode(-9, ListNode(-7, ListNode(-3, ListNode(-3, ListNode(-1, ListNode(2, ListNode(3)))))))
    val input2 =
        ListNode(-7, ListNode(-7, ListNode(-6, ListNode(-6, ListNode(-5, ListNode(-3, ListNode(2, ListNode(4))))))))

    val expectedOutput = "[-9,-7,-7,-7,-6,-6,-5,-3,-3,-3,-1,2,2,3,4]"
    val actualOutput = mergeTwoLists(input1, input2)
    println("Expected output is $expectedOutput and actual output is $actualOutput")

}



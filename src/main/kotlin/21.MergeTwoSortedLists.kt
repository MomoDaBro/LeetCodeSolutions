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

class ListNode(val num: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "$num, $next "


    }
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var cur1 = list1
    var cur2 = list2
    var returnList: ListNode? = null

    if (cur1 == null)
        return cur2
    else if (cur2 == null)
        return cur1

    var next1 = cur1.next
    var next2 = cur2.next

    if (cur1.num >= cur2.num) {
        cur2.next = cur1
        returnList = list2
    } else {
        cur1.next = cur2
        returnList = list1
    }

    while (next1 != null && next2 != null) {
        if (next1.num <= next2.num) {
            cur1 = next1
            next1 = cur1.next
            cur1.next = next2
            cur2 = next2
            next2 = next2.next
        } else {
            cur2 = next2
            next2 = next2.next
            cur1 = next1
            cur2.next = cur1
            next1 = next1.next
        }

    }

    return returnList
}

fun main() {

    val input1 = ListNode(1)
    val input2 = ListNode(2)
    val input3 = ListNode(4)
    input1.next = input2
    input2.next = input3

    val input4 = ListNode(1)
    val input5 = ListNode(3)
    val input6 = ListNode(4)
    input4.next = input5
    input5.next = input6

    val expectedOutput = "[1,1,2,3,4,4]"
    val actualOutput = mergeTwoLists(input1, input2)
    println("Expected output is $expectedOutput and actual output is $actualOutput")

}



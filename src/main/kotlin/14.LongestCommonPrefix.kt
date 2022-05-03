
fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = ""
    var shortestLength = strs[0].lastIndex

    for (str in strs) {
        if (str.lastIndex < shortestLength) {
            shortestLength = str.lastIndex
        }
    }

    var index = 0
    while (shortestLength >= index) {
        if (some(strs, index)) {
            prefix += strs[0][index]
        } else
            break
        index++
    }

    return prefix
}

fun some(arr: Array<String>, charIndex: Int): Boolean {
    for (str in arr)
        if (str[charIndex] != arr[0][charIndex])
            return false

    return true
}

fun main() {

    val input = arrayOf("cir", "car")
    val expectedOutput = "c"
    val actualOutput = longestCommonPrefix(input)
    println("Expected output is $expectedOutput and actual output is $actualOutput")
}


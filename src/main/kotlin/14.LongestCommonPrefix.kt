// Step 1. Identify the first character of the first string
// Step 2. Compare this first character of this first string to the first character of all of the next strings
// Step 3. If the characters match up, add the character to the variable prefix, and keep comparing until the characters do not match up
// Step 4. After the characters do not match up, return prefix.

// Objective 1: Check if the i'th character of all of the strings are the same, if this is true, add to prefix

fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = ""
    var index = 0
    while (true) {
        if (some(strs,index)){
            prefix += strs[0][index]
        }
        index++
    }

    return prefix
}

fun some(arr: Array<String>, index: Int): Boolean {
    for (str in arr)
        if (str[index] != arr[0][index])
            return false

    return true
//    return arr[0][index].toString()
}

fun main() {

    val input = arrayOf("flower", "flow", "flight")
    val otherInput = arrayOf("flower", "sflow", "flight")

    println(longestCommonPrefix(otherInput))
    println(longestCommonPrefix(input))

//    val expectedOutput = "fl"
//    val actualOutput = longestCommonPrefix(input)
//    println("Expected output is $expectedOutput and actual output is $actualOutput")
}


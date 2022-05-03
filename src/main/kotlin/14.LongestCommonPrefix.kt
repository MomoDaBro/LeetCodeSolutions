fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = ""
    var shortestLength = strs[0].lastIndex

    for (str in strs) {
        if (str.lastIndex < shortestLength) {
            shortestLength = str.lastIndex
        }
    }

    for (index in 0 .. shortestLength) {
        for (str in strs)
            if (str[index] != strs[0][index])
                return prefix

        prefix += strs[0][index]
    }

    return prefix
}



fun main() {

    val input = arrayOf("flower","flow","flight")
    val expectedOutput = "fl"
    val actualOutput = longestCommonPrefix(input)
    println("Expected output is $expectedOutput and actual output is $actualOutput")
}


// To-Do
// 1. Make two stacks test and matching
// 2. Push the first two characters into test stack
// 3. Repeat step 4-8 until s is empty
// 4. Pop two chars a, b
// 5. Identify if a and b match
// 6. If they match, push them to the matching stack
// 7. If they don't match, push them back into test stack in the order they were popped.
// 8. Push the next char
// 9. If test stack is empty, return true, otherwise return false


import java.util.Stack

fun isValid(s: String): Boolean {

    if (s.length <= 1)
        return false

    val test = Stack<Char>()

    for (c in s) {
        if (c == '(' || c == '{' || c == '[') {
            test.push(c)
            continue
        }
        if (test.isEmpty() ||!match(test.peek(), c))
            return false

        test.pop()
    }

    return test.empty()
}

fun match(a: Char, b: Char): Boolean {

    if (b == ']' && a == '[')
        return true

    if (b == ')' && a == '(')
        return true

    if (b == '}' && a == '{')
        return true

    return false
}

fun main() {

    val input = "(([]){})"
    val expectedOutput = true
    val actualOutput = isValid(input)
    println("Expected output is $expectedOutput and actual output is $actualOutput")

}
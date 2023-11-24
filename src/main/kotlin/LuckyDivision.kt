/**
 * Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
 *
 * Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.
 *
 * Input
 * The single line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.
 *
 * Output
 * In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).
 */

fun isLuckyNumber(n: Int): String {

    var index = 0

    val filteredNumbers = (1..1000).filterNot {
        it.toString().contains('1') || it.toString().contains('2') || it.toString().contains('3') || it.toString()
            .contains('5') || it.toString().contains('6') || it.toString().contains('8') || it.toString()
            .contains('9') || it.toString().contains('0')
    }

    for (number in filteredNumbers) {
        if (n % number == 0) {
            return "YES"
        }
    }

    val numberToString = n.toString()


    for (char in numberToString) {
        if (char == '4' || char == '7') {
            index++
        }
    }

    if (index == numberToString.length) {
        return "YES"
    }

    return "NO"
}

fun main() {
    val luckyNumber = readln().toInt()
    val result = isLuckyNumber(luckyNumber)
    println(result)
}
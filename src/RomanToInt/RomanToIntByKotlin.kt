fun main() {
    println(romanToInt("MCMXCIV"))
}

private fun romanToInt(s: String): Int {
    val ch = s.toCharArray()
    if (s.length == 1) {
        return getIntByChar(ch[0])
    }

    var sum = 0
    for ((index, e) in ch.withIndex()) {
        val intByChar = getIntByChar(e)
        if (index == ch.size - 1) {
            sum += intByChar
            return sum
        }

        if (intByChar >= getIntByChar(ch[index + 1])) {
            sum += intByChar
        } else {
            sum -= intByChar
        }
    }

    return sum
}

private fun getIntByChar(c: Char): Int {
    return when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}
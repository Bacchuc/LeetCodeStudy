package max_profit

fun main() {
    System.out.println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

private fun maxProfit(prices: IntArray): Int {
    var max = 0
    for ((index, e) in prices.withIndex()) {
        for (j in prices.size - 1 downTo index + 1) {
            var price = prices[j] - e
            if (price > max) {
                max = price
            }
        }
    }
    return max
}

//fun maxProfit(prices: IntArray): Int {
//    var max = 0
//    for (i in prices.indices) {
//        for (j in prices.size - 1 downTo i + 1) {
//            val price = prices[j] - prices[i]
//            if (price > max) {
//                max = price
//            }
//        }
//    }
//    return max
//}

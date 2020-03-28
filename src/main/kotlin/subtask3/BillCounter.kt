package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var annPart = 0
        for (i in bill.indices) {
            if (i != k) {
                annPart += bill[i]
            }
        }
        annPart /= 2
        return if (annPart == b) {
            "Bon Appetit"
        } else {
            Integer.toString(b - annPart)
        }
    }
}

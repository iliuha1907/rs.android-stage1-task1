package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val sb = StringBuilder(digitString)
        val last = digitString.length - 1
        var count = 0
        var extra = 0
        for (i in 0 until n / 2) {
            if (digitString[i] != digitString[last - i]) {
                count++
            }
        }
        if (count > k) {
            return "-1"
        }
        if (k > count) {
            extra = k - count
        }
        for (i in 0 until n / 2) {
            if (digitString[i] != digitString[last - i]) {
                if (digitString[i] != '9' && digitString[last - i] != '9') {
                    if (extra != 0) {
                        extra--
                        sb.setCharAt(i, '9')
                        sb.setCharAt(last - i, '9')
                    } else {
                        val max = Math.max(digitString[i] - '0', digitString[last - i] - '0')
                        sb.setCharAt(i, Character.forDigit(max, 10))
                        sb.setCharAt(last - i, Character.forDigit(max, 10))
                    }
                } else {
                    val max = Math.max(digitString[i] - '0', digitString[last - i] - '0')
                    sb.setCharAt(i, Character.forDigit(max, 10))
                    sb.setCharAt(last - i, Character.forDigit(max, 10))
                }

            }

        }
        var resString=sb.toString()
        for (i in 0 until n / 2) {
            if (resString[i] != resString[last - i]) {
                return "-1"
            }
        }

        return resString
    }
}

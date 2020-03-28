package subtask2
import java.util.*
class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val results = IntArray(2);
        Arrays.sort(input)
        var sumMax = 0
        var sumMin = 0
        sumMin += input[0]
        sumMax += input[input.size-1]
        for (i in 1 until input.size - 1) {
            sumMax += input[i]
            sumMin += input[i]
        }
        results[0] = sumMin
        results[1] = sumMax
        return results
    }
}

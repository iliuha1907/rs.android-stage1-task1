package subtask1
import java.util.ArrayList
class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var tempArray= ArrayList<Int>()
        for(i in 0 until sadArray.size){
            tempArray.add(sadArray[i]);
        }
        val results = ArrayList<Int>()
        if (sadArray.size < 3) {
            return sadArray
        }
        var flag = false
        while (!flag) {
            var over = true
            results.add(tempArray[0])
            for (i in 1 until tempArray.size - 1) {
                val sum = tempArray[i - 1] + tempArray[i + 1]
                if (tempArray[i] > sum) {
                    over = false
                    continue
                } else {
                    results.add(tempArray[i])
                }
            }
            if (over) {
                flag = true
                break
            }
            results.add(tempArray[tempArray.size - 1])
            tempArray = ArrayList(results)
            results.clear()
        }
        return tempArray.toIntArray()
    }
}

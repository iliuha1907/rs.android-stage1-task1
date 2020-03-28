package subtask4
import java.util.ArrayList
class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val isUsed = BooleanArray(inputString.length)
        val results = ArrayList<String>()
        var i = 0
        while (i < inputString.length) {
            var isOpened = false
            var close: Char = 0.toChar()
            var open: Char = 0.toChar()
            var start = 0
            var end = 0
            when (inputString[i]) {
                '(' -> {
                    open = '('
                    isOpened = true
                    start = i
                    close = ')'
                }
                '[' -> {
                    open = '['
                    isOpened = true
                    start = i
                    close = ']'
                }
                '<' -> {
                    open = '<'
                    isOpened = true
                    start = i
                    close = '>'
                }
            }
            if (isOpened) {
                var found = false
                for (j in start until inputString.length) {
                    if (found && inputString[j] == open) {
                        break
                    }
                    if (inputString[j] == close && !isUsed[j]) {
                        found = true
                        end = j
                    }
                }
                if (found) {
                    results.add(inputString.substring(start + 1, end))
                    isUsed[end] = true
                    i = start
                }
            }
            i++
        }
        val size=results.size
        val resultArray=Array<String>(size, {i -> ""})
        for(i in results.indices){
            resultArray[i]=results.get(i)
        }
        return resultArray
    }
}


class Solution {
    fun minimizedStringLength(input: String): Int {
        var bitMaskAllUniqueLetters = 0
        for (letter in input) {
            bitMaskAllUniqueLetters = bitMaskAllUniqueLetters or (1 shl (letter - 'a'))
        }

        var minimizedLength = 0
        while (bitMaskAllUniqueLetters > 0) {
            minimizedLength += bitMaskAllUniqueLetters and 1
            bitMaskAllUniqueLetters = bitMaskAllUniqueLetters shr 1
        }
        return minimizedLength
    }
}

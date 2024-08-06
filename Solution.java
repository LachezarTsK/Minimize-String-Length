
public class Solution {

    public int minimizedStringLength(String input) {
        int bitMaskAllUniqueLetters = 0;
        for (int letter : input.toCharArray()) {
            bitMaskAllUniqueLetters |= 1 << (letter - 'a');
        }

        int minimizedLength = 0;
        while (bitMaskAllUniqueLetters > 0) {
            minimizedLength += bitMaskAllUniqueLetters & 1;
            bitMaskAllUniqueLetters >>= 1;
        }
        return minimizedLength;
    }
}

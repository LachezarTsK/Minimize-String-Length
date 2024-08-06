
using System;

public class Solution
{
    public int MinimizedStringLength(string input)
    {
        int bitMaskAllUniqueLetters = 0;
        foreach (int letter in input)
        {
            bitMaskAllUniqueLetters |= 1 << (letter - 'a');
        }

        int minimizedLength = 0;
        while (bitMaskAllUniqueLetters > 0)
        {
            minimizedLength += bitMaskAllUniqueLetters & 1;
            bitMaskAllUniqueLetters >>= 1;
        }
        return minimizedLength;
    }
}

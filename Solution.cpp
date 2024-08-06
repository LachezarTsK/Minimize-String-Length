
#include <string>
using namespace std;


class Solution {

public:
    int minimizedStringLength(const string& input)const {
        int bitMaskAllUniqueLetters = 0;
        for (const auto& letter : input) {
            bitMaskAllUniqueLetters |= 1 << (letter - 'a');
        }

        int minimizedLength = 0;
        while (bitMaskAllUniqueLetters > 0) {
            minimizedLength += bitMaskAllUniqueLetters & 1;
            bitMaskAllUniqueLetters >>= 1;
        }
        return minimizedLength;
    }
};

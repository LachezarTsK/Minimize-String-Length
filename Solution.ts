
function minimizedStringLength(input: string): number {
    const ASCII_SMALL_CASE_A = 97;
    let bitMaskAllUniqueLetters = 0;
    for (let i = 0; i < input.length; ++i) {
        bitMaskAllUniqueLetters |= 1 << (input.codePointAt(i) - ASCII_SMALL_CASE_A);
    }

    let minimizedLength = 0;
    while (bitMaskAllUniqueLetters > 0) {
        minimizedLength += bitMaskAllUniqueLetters & 1;
        bitMaskAllUniqueLetters >>= 1;
    }
    return minimizedLength;
};

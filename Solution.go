
package main

import "fmt"

func minimizedStringLength(input string) int {
    bitMaskAllUniqueLetters := 0
    for _, letter := range input {
        bitMaskAllUniqueLetters |= 1 << (letter - 'a')
    }

    minimizedLength := 0
    for bitMaskAllUniqueLetters > 0 {
        minimizedLength += bitMaskAllUniqueLetters & 1
        bitMaskAllUniqueLetters = bitMaskAllUniqueLetters >> 1
    }
    return minimizedLength
}

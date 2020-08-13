package main

import "fmt"

/*
*Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
*Output: ["mee","aqq"]
*Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
*"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
*since a and b map to the same letter.
 */

func findAndReplacePattern(words []string, pattern string) []string {
	r := []string{}

	for _, v := range words {
		if isPermutation(v, pattern) {
			r = append(r, v)
		}
	}
	return r
}

func isPermutation(m string, p string) bool {
	if len(m) != len(p) {
		return false
	}
	var wMapping [26]int
	var pMapping [26]int

	for i := 0; i < len(m); i++ {
		mChar := int(m[i]) - 'a'
		pChar := int(p[i]) - 'a'
		if wMapping[mChar] != 0 || pMapping[pChar] != 0 {
			if pChar != wMapping[mChar]-1 || mChar != pMapping[pChar]-1 {
				return false
			}
		} else {
			wMapping[mChar] = pChar + 1
			pMapping[pChar] = mChar + 1
		}
	}
	return true
}

func main() {
	var input = []string{"abc", "deq", "mee", "aqq", "dkd", "ccc"}
	var pattern = "abb"
	fmt.Println(findAndReplacePattern(input, pattern))
}

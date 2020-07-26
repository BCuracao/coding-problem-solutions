package main

import (
	"fmt"
)

/*
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
*/

func partitionLabels(S string) []int {
	lastIndex := [26]int{}

	for i := 0; i < len(S); i++ {
		lastIndex[S[i]-'a'] = i
	}

	for _, k := range lastIndex {
		fmt.Println(k)
	}

	i := 0
	maxIdx := 0
	res := []int{}

	for j := 0; j < len(S); j++ {
		maxIdx = max(maxIdx, lastIndex[S[j]-'a'])
		if maxIdx == j {
			res = append(res, j-i+1)
			i = j + 1
		}
	}

	fmt.Println(res)

	return res
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}

func main() {
	s := "ababcbacadefegdehijhklij"
	partitionLabels(s)
}

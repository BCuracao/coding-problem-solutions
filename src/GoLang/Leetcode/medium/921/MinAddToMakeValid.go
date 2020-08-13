package main

import "fmt"

/*
* Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.
* Formally, a parentheses string is valid if and only if:

* It is the empty string, or
* It can be written as AB (A concatenated with B), where A and B are valid strings, or
* It can be written as (A), where A is a valid string.
* Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

* Example 4:

* Input: "()))(("
* Output: 4
 */

func minAddToMakeValid(s string) int {
	var c int = 0
	var p int = 0
	if len(s) <= 0 {
		return 0
	}

	for i := 0; i < len(s); i++ {
		if s[i] == '(' {
			c++
			p++
		} else {
			if p > 0 {
				c--
				p--
			} else {
				c++
			}
		}
	}
	return c
}

func main() {
	var input = "()))(("
	fmt.Println(minAddToMakeValid(input))
}

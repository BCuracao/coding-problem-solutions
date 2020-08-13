package main

import (
	"fmt"
	"math"
)

/*
a 1-day pass is sold for costs[0] dollars;
a 7-day pass is sold for costs[1] dollars;
a 30-day pass is sold for costs[2] dollars.
*/

func mincostTickets(days []int, costs []int) int {
	var td = make([]bool, 366)

	for _, j := range days {
		td[j] = true
	}

	var dp = make([]int, 366)

	for i := range dp {
		dp[i] = math.MaxInt16
	}
	dp[0] = 0

	for i := 1; i < 366; i++ {
		if !td[i] {
			dp[i] = dp[i-1]
			continue
		}
		dp[i] = min(dp[i], dp[i-1]+costs[0])
		if i-7 >= 0 {
			dp[i] = min(dp[i], dp[i-7]+costs[1])
		} else {
			dp[i] = min(dp[i], costs[1])
		}

		if i-30 >= 0 {
			dp[i] = min(dp[i], dp[i-30]+costs[2])
		} else {
			dp[i] = min(dp[i], costs[2])
		}
	}
	return dp[365]
}

func min(x, y int) int {
	if x < y {
		return x
	}
	return y
}

func main() {
	var days = []int{1, 4, 6, 7, 8, 20}
	var costs = []int{2, 7, 15}

	fmt.Print(mincostTickets(days, costs))
}

package main

/*
At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?

Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation:
The grid is:
[ [3, 0, 8, 4],
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
			[3, 3, 3, 3] ]
*/

func maxIncreaseKeepingSkyline(grid [][]int) int {
	res := 0
	hori := []int{}
	vert := []int{}

	for i := 0; i < len(grid); i++ { //row
		maxC := 0
		maxR := 0
		for j := 0; j < len(grid); j++ { //column
			if maxC < grid[i][j] {
				maxC = grid[i][j]
			}
			if maxR < grid[j][i] {
				maxR = grid[j][i]
			}
		}
		hori = append(hori, maxC)
		vert = append(vert, maxR)
	}

	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid); j++ {
			for grid[i][j] < hori[i] && grid[i][j] < vert[j] {
				grid[i][j]++
				res++
			}
		}
	}
	return res
}

func maximum(x, y int) int {
	if x > y {
		return x
	}
	return y
}

func main() {
	var grid = [][]int{
		{3, 0, 8, 4},
		{2, 4, 5, 7},
		{9, 2, 6, 3},
		{0, 3, 1, 0},
	}
	maxIncreaseKeepingSkyline(grid)
}

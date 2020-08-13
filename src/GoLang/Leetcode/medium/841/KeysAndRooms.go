package main

import "fmt"

func canVisitAllRooms(rooms [][]int) bool {
	var s []int
	visited := make([]bool, len(rooms))
	visited[0] = true
	if len(rooms) <= 0 {
		return true
	}
	s = push(s, 0)
	fmt.Println(s)
	var n int = 0
	for len(s) > 0 {
		s, n = pop(s)
		for _, key := range rooms[n] {
			if !visited[key] {
				visited[key] = true
				s = push(s, key)
			}
		}
	}
	for _, v := range visited {
		if !v {
			return false
		}
	}
	return true
}

func push(s []int, v int) []int {
	s = append(s, v)
	return s
}

func pop(s []int) ([]int, int) {
	return s[:len(s)-1], s[len(s)-1]
}

func main() {
	var input3 = [][]int{
		{4},
		{3},
		{},
		{2, 5, 7},
		{1},
		{},
		{8, 9},
		{},
		{},
		{6},
	}
	/*
		var input = [][]int{
			{1, 3},
			{3, 0, 1},
			{2},
			{0},
		}
	*/
	/*
		var input2 = [][]int{
			{1},
			{2},
			{3},
			{},
		}
	*/
	fmt.Println(canVisitAllRooms(input3))
}

package main

import (
	"bytes"
	"io/ioutil"
	"log"
	"strconv"
)

func main() {
	file, err := ioutil.ReadFile("input_1.txt")
	if err != nil {
		log.Fatal(err)
	}
	m := make(map[int]int, 0)
	for _, line := range bytes.Split(file, []byte("\n")) {
		n, err := strconv.Atoi(string(line))
		if err != nil {
			log.Println((err))
			continue
		}
		m[n]++
	}
	for y, _ := range m {
		x := 2020 - y
		if _, ok := m[x]; ok {
			log.Printf("%d+%d=2020 / %d*%d=%d", x, y, x, y, x*y)
			return
		}
	}
}

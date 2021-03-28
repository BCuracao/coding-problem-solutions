package main

import (
	"bytes"
	"fmt"
	"io/ioutil"
	"log"
	"strconv"
)

const YEAR = 2020

func main() {

	var empty struct{}

	f, err := ioutil.ReadFile("input_1.txt")
	if err != nil {
		log.Fatal(err)
	}
	m := make(map[int]struct{})
	for _, l := range bytes.Split(f, []byte("\n")) {
		n, err := strconv.Atoi(string(l))
		if err != nil {
			log.Println(err)
			continue
		}
		m[n] = empty
	}
	for k, _ := range m {
		for j, _ := range m {
			z := YEAR - k - j
			if _, ok := m[z]; ok {
				fmt.Printf("%d+%d+%d=2020 - %d*%d*%d=%d", k, j, z, k, j, z, k*j*z)
			}
		}
	}
}

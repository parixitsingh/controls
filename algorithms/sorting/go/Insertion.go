package main

import (
	"fmt"
	"os"
)

func main() {
	var numbers [10]int
	var num int
	for i := 0; i < 10; i++ {
		_, err := fmt.Scanf("%d", &num)
		if err == nil {
			numbers[i] = num
		} else {
			fmt.Printf("Numbers are not space seperated %v \n", err)
			os.Exit(1)
		}
	}

	for i := 0; i < 10; i++ {
		value := numbers[i]
		position := i
		for position > 0 && numbers[position-1] > value {
			numbers[position] = numbers[position-1]
			position--
		}
		numbers[position] = value
	}

	for i := 0; i < 10; i++ {
		fmt.Printf("%d ", numbers[i])
	}
}

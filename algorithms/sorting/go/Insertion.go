package main

import (
	"bufio"
	"os"
	"strconv"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	var numbers []int64
	for i := 0; i < 10; i++ {
		str, _ := reader.ReadString('\n')
		numbers[i], _ = strconv.ParseInt(str, 10, 4)
	}

	for i := 0; i < 10; i++ {
		println(numbers[i])
	}
}

package frequency

import (
	"os"
	"testing"
)

func TestWordFrequency(t *testing.T) {
	f, err := os.Open("../../../pride-and-prejudice.txt")
	if err != nil {
		t.Fatal(err)
	}
	defer f.Close()

	s, err := os.Open("../../../stop_words.txt")
	if err != nil {
		t.Fatal(err)
	}
	defer s.Close()

	result := Frequency(f, s)
}

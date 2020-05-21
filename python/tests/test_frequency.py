import os

from words.frequency import calculate_frequency

def test_word_frequency():
    assert len(calculate_frequency()) == 2

package org.codecraftuk.words

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class FrequencyTest {
    @Test fun testWordFrequency() {
        val stopWords = File("../stop_words.txt").readLines()

        assertEquals(918, stopWords.size)
    }
}

package com.joshua.ransom.advent.year_2020

import com.joshua.ransom.advent.year_2020.day1.Day2
import kotlin.test.Test
import kotlin.test.assertEquals

object Day2Test {
    @Test
    fun testPart1() {
        assertEquals("2", Day2.solvePart1(listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")))
        assertEquals("607", Day2.solvePart1(Day2.parse()))
    }

    @Test
    fun testPart2() {
        assertEquals("1", Day2.solvePart2(listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")))
        assertEquals("321", Day2.solvePart2(Day2.parse()))
    }
}

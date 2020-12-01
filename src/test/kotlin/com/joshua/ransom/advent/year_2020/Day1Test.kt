package com.joshua.ransom.advent.year_2020

import com.joshua.ransom.advent.year_2020.day1.Day1
import kotlin.test.Test
import kotlin.test.assertEquals

object Day1Test {
    @Test
    fun testPart1() {
        assertEquals("514579", Day1.solvePart1(listOf(1721, 979, 366, 299, 675, 1456)))
        assertEquals("970816", Day1.solvePart1(Day1.parse()))
    }

    @Test
    fun testPart2() {
        assertEquals("241861950", Day1.solvePart2(listOf(1721, 979, 366, 299, 675, 1456)))
        assertEquals("96047280", Day1.solvePart2(Day1.parse()))
    }
}

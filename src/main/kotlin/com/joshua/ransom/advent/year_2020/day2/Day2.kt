package com.joshua.ransom.advent.year_2020.day1

import com.joshua.ransom.advent.year_2020.Puzzle

object Day2 : Puzzle<List<String>>(2) {
    override fun parse(input: Sequence<String>): List<String> {
        return input.toList()
    }

    override fun solvePart1(input: List<String>): String? {
        var valid = 0
        for (line in input) {
            val validationRequirements = line.substringBefore(" ").split("-")
            val lowest = validationRequirements[0].toInt()
            val highest = validationRequirements[1].toInt()
            val letter = line.substringAfter(" ").substringBefore(":")
            val password = line.substringAfterLast(" ")
            val occurances = password.length - password.replace(letter, "").length
            if (occurances in lowest..highest)
                valid++
        }
        return valid.toString()
    }

    override fun solvePart2(input: List<String>): String? {
        var valid = 0
        for (line in input) {
            val validationRequirements = line.substringBefore(" ").split("-")
            val firstIndex = validationRequirements[0].toInt()
            val secondIndex = validationRequirements[1].toInt()
            val letter = line.substringAfter(" ").substringBefore(":")
            val password = line.substringAfterLast(" ")
            val letterAtFirstIndex = password[firstIndex - 1].toString()
            val letterAtSecondIndex = password[secondIndex - 1].toString()
            val isLocatedAtFirstIndex = letterAtFirstIndex == letter
            val isLocatedAtSecondIndex = letterAtSecondIndex == letter
            if (!isLocatedAtFirstIndex && isLocatedAtSecondIndex || isLocatedAtFirstIndex && !isLocatedAtSecondIndex)
                valid++
        }
        return valid.toString()
    }
}

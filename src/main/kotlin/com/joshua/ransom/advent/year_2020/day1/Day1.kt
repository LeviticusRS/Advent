package com.joshua.ransom.advent.year_2020.day1

import com.joshua.ransom.advent.year_2020.Puzzle

object Day1 : Puzzle<List<Int>>(1) {
    override fun parse(input: Sequence<String>): List<Int> {
        return input.map(Integer::parseInt).toList()
    }

    override fun solvePart1(input: List<Int>): String? {
        for (expenseOne in input) {
            for (expenseTwo in input) {
                if (expenseOne + expenseTwo == 2020) {
                    return (expenseOne * expenseTwo).toString()
                }
            }
        }
        return null
    }

    override fun solvePart2(input: List<Int>): String? {
        for (expenseOne in input) {
            for (expenseTwo in input) {
                for (expenseThree in input) {
                    if (expenseOne + expenseTwo + expenseThree == 2020) {
                        return (expenseOne * expenseTwo * expenseThree).toString()
                    }
                }
            }
        }
        return null
    }
}

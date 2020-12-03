package com.joshua.ransom.advent.year_2020

import com.joshua.ransom.advent.year_2020.day3.Day3


fun main() {
    val puzzles = listOf<Puzzle<*>>(Day3)

    for (puzzle in puzzles) {
        solve(puzzle)
    }
}

private fun <T> solve(puzzle: Puzzle<T>) {
    val input = puzzle.parse()

    val solutionPart1 = puzzle.solvePart1(input)
    if (solutionPart1 != null) {
        println("Day ${puzzle.number} Part 1: $solutionPart1")
    }
    val solutionPart2 = puzzle.solvePart2(input)
    if (solutionPart2 != null) {
        println("Day ${puzzle.number} Part 2: $solutionPart2")
    }
}

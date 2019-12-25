package day1

import java.io.File

fun main(args: Array<String>) {
    var modulesFuel: ArrayList<Int> = ArrayList()
    var modules = File("src/day1/inputs.txt").readLines()

    modules.forEach{ modulesFuel.add(CalculateFuel(it.toInt())) }

    var totalFuel = modulesFuel.sum()
    print(totalFuel)
}

fun CalculateFuel(mass: Int): Int {
    var fuel = (mass / 3) - 2
    if(fuel < 1)
        return 0
    fuel += CalculateFuel(fuel)
    return fuel
}
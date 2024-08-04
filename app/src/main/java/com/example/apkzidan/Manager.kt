package com.example.apkzidan

class Manager(name: String, id: Int, salary: Double, private var teamSize: Int) : Employee(name, id, salary) {
    override fun calculateBonus(): Double {
        return getSalary() * 0.2 + (teamSize * 100)
    }
}

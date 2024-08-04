package com.example.apkzidan

abstract class Employee(
    protected var name: String,
    protected var id: Int,
    private var salary: Double
) {
    abstract fun calculateBonus(): Double

    fun getSalary(): Double {
        return salary
    }

    fun setSalary(newSalary: Double) {
        if (newSalary > 0) {
            salary = newSalary
        }
    }
}

package com.example.apkzidan

class Developer(name: String, id: Int, salary: Double, private var programmingLanguage: String) : Employee(name, id, salary) {
    override fun calculateBonus(): Double {
        return getSalary() * 0.1 + (if (programmingLanguage == "Kotlin") 1000 else 500)
    }
}

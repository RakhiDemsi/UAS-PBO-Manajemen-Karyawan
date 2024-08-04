package com.example.apkzidan

class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

//    fun removeEmployee(id: Int) {
//        employees.removeAll {it.getId() == id}
//    }

    fun calculateTotalBonus(): Double {
        return employees.sumOf { it.calculateBonus() }
    }
}
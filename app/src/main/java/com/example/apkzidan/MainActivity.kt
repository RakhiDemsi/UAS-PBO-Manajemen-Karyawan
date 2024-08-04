package com.example.apkzidan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var resultTextView: TextView

    private val validUsername = "admin"
    private val validPassword = "password123"

    private val employeeManagementSystem = EmployeeManagementSystem()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
        resultTextView = findViewById(R.id.resultTextView)

        loginButton.setOnClickListener {

            if (usernameEditText.text.toString() == validUsername && passwordEditText.text.toString() == validPassword){
                Log.d("Login Log", "Login Success")
                initializeEmployees()
                val totalBonus = employeeManagementSystem.calculateTotalBonus()
                resultTextView.text = "Total bonus: $${String.format("%.2f", totalBonus)}"
            }
            else {
                showToast("Invalid credentials").show()
            }
        }
    }

    private fun initializeEmployees() {
        employeeManagementSystem.addEmployee(Manager("John Doe", 1, 5000.0, 5))
        employeeManagementSystem.addEmployee(Developer("Jane Smith", 2, 4000.0, "Kotlin"))
        employeeManagementSystem.addEmployee(Developer("Bob Johnson", 3, 3500.0, "Java"))
    }

    private fun showToast(response: String): Toast {
        return Toast.makeText(this, response, Toast.LENGTH_SHORT)
    }
}
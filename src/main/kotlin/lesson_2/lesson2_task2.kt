package org.exampleter.lesson_2

fun main() {
    val permanentEmployees = 50
    val salaryOfPermanentEmployees = 30000
    val interns = 30
    val salaryOfInterns = 20000
    val expensesForPermanentEmployees = permanentEmployees * salaryOfPermanentEmployees
    val expensesForInterns = interns * salaryOfInterns
    val totalSalaryExpenses = expensesForPermanentEmployees + expensesForInterns
    val theAverageSalaryOfOneEmployee = totalSalaryExpenses / (permanentEmployees + interns)
    println("Расходы на выплату зарплаты постоянным сотрудникам:${expensesForPermanentEmployees}")
    println("Общие расходы по зарплатам после прихода стажёров:${totalSalaryExpenses}")
    println("Средняя зарплата одного сотрудника:${theAverageSalaryOfOneEmployee}")

}
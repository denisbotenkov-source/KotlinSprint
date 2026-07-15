package org.exampleter.kotlinSprintLesson_16

class Order(private val orderNumber: Int, private var status: String) {
    fun sendRequest(newStatus: String) {
        updateStatus(newStatus)
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
        println("Статус $newStatus подтверждён. ")
    }
}
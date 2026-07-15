package org.exampleter.kotlinSprintLesson_16

class Player(private val name: String, health: Int, impactForce: Int) {
    var health = health
        private set
    var impactForce = impactForce
        private set

    fun healthePlayer(treatment: Int) {
        if (health > 0) {
            health += treatment
            println("Игрок подлечился на $treatment, здоровье: $health")
        }
    }

    fun dealingDamage() {
        if (health > 0) {
            health -= impactForce
            println("Удар нанёс урона игроку: $impactForce, осталось здоровья: $health")
            checkYourHealth()
        }
    }

    private fun checkYourHealth() {
        if (health <= 0) {
            println("У игрока кончилось здоровье,наступила смерть.")
            impactForce = 0
            health = 0
        }
    }
}
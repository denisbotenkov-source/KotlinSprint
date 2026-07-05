package org.exampleter.kotlinSprintLesson_15

interface Search {
    fun search(components: MusicStore) {
        val tools = this as MusicStore
        println("Выполняется поиск комплектующих: ${components.name} (${components.numberOfUnits} шт.) для инструмента: ${tools.name}")
    }
}
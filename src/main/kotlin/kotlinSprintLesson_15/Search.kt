package org.exampleter.kotlinSprintLesson_15

interface Search {
    fun search(components: MusicStore,tools: MusicStore) {
        println("Выполняется поиск комплектующих: ${components.name} (${components.numberOfUnits} шт.) для инструмента: ${tools.name}")
    }
}
package org.exampleter.kotlinSprintLesson_14

class Planet(
    name: String,
    suitableForPlanting: Boolean,
    autmosphere: Boolean,
    val spisokSputnikov: List<Satellite> = listOf(),
) : CelestialBody(name, suitableForPlanting, autmosphere) {

}
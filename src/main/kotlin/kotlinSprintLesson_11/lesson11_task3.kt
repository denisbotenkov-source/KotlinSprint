package kotlinSprintLesson_11

fun main() {
    val participant1 = Participant("Анна", Status.TALKING)
    val participant2 = Participant("Олег", Status.BANNED)
    val participant3 = Participant("Виталий", Status.MUTED)
    val room = Room("Зелёная", "Общение", mutableListOf())
    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)
    room.updateStatus("Анна", Status.MUTED)
    room.updateStatus("Олег", Status.TALKING)
    room.updateStatus("Виталий", Status.BANNED)
    println("${room.title}, ${room.cover}, ${room.participants}")
    println("${participant1.nickname}, ${participant1.status}")
    println("${participant2.nickname}, ${participant2.status}")
    println("${participant3.nickname}, ${participant3.status}")
}

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Participant>
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(nickname: String, status: Status) {
        participants.find { it.nickname == nickname }?.let { it.status = status }
    }
}

class Participant(
    val nickname: String,
    var status: Status
)

enum class Status(val description: String) {
    TALKING("Разговаривает"),
    MUTED("Микрофон выключен"),
    BANNED("Участник заглушен")
}
data class Message(val message: String, val from: String, val to: String)

fun sendMessageToAnyone(message: Message) {

    with(message) {
        println("Send message from $from to $to")
        println("Message sent: ${this.message}")
    }
}
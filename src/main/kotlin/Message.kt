data class Message(val message: String, val from: String, val to: String)

fun sendMessage(message: Message) {

    with(message) {
        println("Send message from $from to $to")
        println("Message sent: ${this.message}")
    }
}
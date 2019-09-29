package io.yassinefarich.commandsms.controllers

import io.yassinefarich.commandsms.beans.Command
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class CommandsController {

    data class Response(val products: List<Command>,
                        val currentTimestamp: LocalDateTime = LocalDateTime.now())

    @GetMapping("/")
    fun getAllCommands() : Response =
            Response(listOf(
                    Command(number = 1),
                    Command(number = 2),
                    Command(number = 3),
                    Command(number = 4)
            ))
}
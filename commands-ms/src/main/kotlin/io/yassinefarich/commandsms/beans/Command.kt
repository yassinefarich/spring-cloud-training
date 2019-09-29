package io.yassinefarich.commandsms.beans

import java.util.*

data class Command(val uuid: UUID = UUID.randomUUID(),
                   val number: Long,
                   val description: String = "No Desc")
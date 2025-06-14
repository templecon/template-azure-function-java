package com.example

import io.ktor.http.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.lang.System.getenv

fun main() {
	val port = getenv("FUNCTIONS_CUSTOMHANDLER_PORT")?.toIntOrNull() ?: 8080
	embeddedServer(Netty, port = port) {
		routing {
			get("/") {
				call.respondText("Oh, hi!", ContentType.Text.Plain)
			}
		}
	}.start(wait = true)
}
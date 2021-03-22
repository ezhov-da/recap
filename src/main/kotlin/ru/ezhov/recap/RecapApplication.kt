package ru.ezhov.recap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecapApplication

fun main(args: Array<String>) {
	runApplication<RecapApplication>(*args)
}

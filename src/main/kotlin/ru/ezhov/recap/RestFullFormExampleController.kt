package ru.ezhov.recap

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestFullFormExampleController {
    @PostMapping("/auth/phone/code")
    fun code(): String {
        return "fullForm"
    }
}
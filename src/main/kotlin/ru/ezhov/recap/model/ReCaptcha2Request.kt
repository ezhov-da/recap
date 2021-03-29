package ru.ezhov.recap.model

data class ReCaptcha2Request(
        val secret: String,
        val response: String
)
package ru.ezhov.recap.model

data class ReCaptcha2Answer(
        val success: Boolean?,
        val challenge_ts: String?,
        val hostname: String?
)
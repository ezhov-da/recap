package ru.ezhov.recap

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import ru.ezhov.recap.model.ReCaptcha2Answer
import java.lang.IllegalArgumentException


@RestController
class GoogleReCaptchaVerifyController {
    companion object {
        private const val GOOGLE_REC_URL = "https://www.google.com/recaptcha/api/siteverify"
    }

    @PostMapping("/verify/2")
    fun verify(@RequestBody token: String): String {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_FORM_URLENCODED
        val map: MultiValueMap<String, String> = LinkedMultiValueMap()

        if (true) throw IllegalArgumentException("! Set secret for reCAPTCHA on backend !")

        map.add("secret", "")
        map.add("response", token)

        val request = HttpEntity(map, headers)

        val restTemplate = RestTemplate()
        val postForEntity = restTemplate
                .postForEntity(
                        GOOGLE_REC_URL,
                        request,
                        ReCaptcha2Answer::class.java
                )

        println(postForEntity.statusCode)
        println(postForEntity.body)
        return postForEntity.body.toString()
    }
}
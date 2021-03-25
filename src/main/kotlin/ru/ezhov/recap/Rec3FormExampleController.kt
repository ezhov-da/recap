package ru.ezhov.recap

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Rec3FormExampleController(
        @Value("\${rec3Key}") val rec3Key: String,
) {
    @GetMapping("rec3")
    fun rec2Checkbox(model: Model): String {
        println(rec3Key)

        model.addAttribute("googleLink", "https://www.google.com/recaptcha/api.js?render=$rec3Key")
        model.addAttribute("rec3Key", rec3Key)
        return "rec3Form"
    }
}
package ru.ezhov.recap

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FullFormExampleController(
        @Value("\${invisibleKey}") val rec2InvisibleKey: String,
        @Value("\${checkboxKey}") val rec2CheckboxKey: String
) {
    @GetMapping("full-form")
    fun rec2Checkbox(model: Model): String {
        println(rec2InvisibleKey)
        println(rec2CheckboxKey)

        model.addAttribute("rec2InvisibleKey", rec2InvisibleKey)
        model.addAttribute("rec2CheckboxKey", rec2CheckboxKey)
        return "fullForm"
    }
}
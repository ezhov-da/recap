package ru.ezhov.recap

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ReCaptchaExampleController {
    @GetMapping("rec2-checkbox")
    fun rec2Checkbox(): String {
        return "rec2-checkbox"
    }

    @GetMapping("rec2-invisible")
    fun rec2Invisible(): String {
        return "rec2-invisible"
    }

    @GetMapping("rec2-invisible-manual")
    fun rec2InvisibleMmanual(): String {
        return "rec2-invisible-manual"
    }
}
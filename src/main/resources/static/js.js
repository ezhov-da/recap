$("#buttonShowFirst").click(function () {
    $("#firstBaseAuthInfoId").text("")
    $("#modalButtonShowFirst").addClass("is-active");
    grecaptcha.reset();
    grecaptcha.execute();
});

$("#buttonChangeNumber").click(function () {
    $("#changePhoneInfoId").text("")
    $("#modalButtonChangeNumber").addClass("is-active");
    grecaptcha.reset(recaptchaCheckBoxId)
});

$("#buttonShowFirstRec3").click(function () {
    $("#rec3InfoId").text("")
    $("#modalButtonShowFirstRec3").addClass("is-active");
});

$(".modal-background").click(function () {
    $(".modal-background").parent(".modal").removeClass("is-active")
});

$(".modal-close").click(function () {
    $(this).parent(".modal").removeClass("is-active")
});

var tokenInvisibleRecap
var reCaptchaChangePhone

function onSubmitInvisibleReCapFirst(token) {
    tokenInvisibleRecap = token
    const text = "Невидимая капча уже сработала. Есть токен для отправки на сервер: " + token
    console.log(text)
    $("#firstBaseAuthInfoId").text(text)
}

function onSubmitReCaptchaChangePhone(token) {
    reCaptchaChangePhone = token
    const text = "Капча флажок сработала. Есть токен для отправки на сервер: " + token
    console.log(text)
    $("#changePhoneInfoId").text(text)
}

$("#firstGetCodeButton").click(function () {
    event.preventDefault()

    const phone = $("#firstInputPhone").val()
    const recaptcha = $("#g-recaptcha-response").val()

    console.log(phone)
    console.log(recaptcha)
});

$("#changePhoneGetCodeButton").click(function () {
    event.preventDefault()

    const phone = $("#changeInputPhone").val()

    console.log(phone)
    console.log(reCaptchaChangePhone)
});

$("#getCodeButtonId").click(function (e) {
    e.preventDefault();
    grecaptcha.ready(function () {
        grecaptcha.execute(rec3Key, {action: 'submit'}).then(function (token) {
            const text = "Капча3 уже сработала. Есть токен для отправки на сервер: " + token
            console.log(text)
            $("#rec3InfoId").text(text)
        });
    });
})


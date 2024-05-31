package com.example.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val PLAYSTORE = "playstore.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
        const val FIGMA="figma.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.png"
        const val YAMB_PHOTO = "yamb.svg"
        const val MONKIFY_PHOTO = "monkify5.svg"
    }

    object String {
        const val NAME = "Daniel Pitropovski"
        const val PROFESSION = "Junior app developer & UI/UX Designer"
        const val ABOUT_ME =
            "Hello, I hold a Bachelor's degree in Computer Science from the Faculty of Informatics and Management in Hradec Králové, where I am currently in my third year. I am passionate about mobile app design and development for Android, utilizing the Kotlin programming language, Jetpack Compose framework, and Figma. I have proficient knowledge of mobile application development, including the use of various architectures (such as MVVM and Clean Architecture), ROOM database implementation, Firebase/Firestore, Retrofit, Navigation, Dependency Injection (Dagger Hilt), Flow, Coroutines, Material 3, etc.\n" +
                    "I'd love to join your team and see this as a chance to advance my skills and become a proficient programmer.\n"
        const val ABOUT_YAMB="This small project involves recreating the classic game of Yamb. In this interactive game, users roll the dice and record the resulting values in a table. It's a simple yet engaging activity that adds a fun twist to the traditional dice-rolling experience."
        const val ABOUT_MONKIFY="Monkify is your dedicated companion on the path to a disciplined and successful life. Unlock your potential by embracing consistency and achieving daily tasks. Define your path with clear, achievable goals, while Monkify holds you accountable, ensuring you stay on track." +
                " Cultivate lasting habits for lifelong success with this user-friendly app.  " +
                "\n This app is in the development phase..."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:danielpitropovski@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}
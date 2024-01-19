package com.example.website.pages

import androidx.compose.runtime.*
import com.example.website.components.*
import com.example.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    var colorMode by ColorMode.currentState

    LaunchedEffect(colorMode) {
        val savedTheme = localStorage.getItem(Res.String.SAVED_THEME) ?: ColorMode.LIGHT.name
        colorMode = ColorMode.valueOf(savedTheme)
    }

    ThemeSwitchButton(
        colorMode = colorMode,
        onClick = {
            colorMode = colorMode.opposite
            localStorage.setItem(Res.String.SAVED_THEME, colorMode.name)
        }
    )

    Box(
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = if (colorMode.isLight) Res.Theme.GRADIENT_ONE.color
                    else Res.Theme.GRADIENT_ONE_DARK.color,
                    to = if (colorMode.isLight) Res.Theme.GRADIENT_TWO.color
                    else Res.Theme.GRADIENT_TWO_DARK.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Box(modifier=Modifier.fillMaxWidth().padding(topBottom = 30.px))
            ProfileCard(colorMode = colorMode)
            Row( modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                SpanText(
                    text = "MY PROJECTS:",
                    modifier = Modifier
                        .margin(bottom = 20.px, top = 20.px)
                        .fontFamily(Res.String.ROBOTO_CONDENSED)
                        .color(if (colorMode.isLight) Colors.Black else Colors.White)
                        .fontSize(50.px)
                        .fontWeight(FontWeight.Bold)
                        .textAlign(
                            TextAlign.Center
                        )
                )
            }
            ProjectCard(colorMode=colorMode){ breakpoint->
                RightSide(breakpoint = breakpoint,Res.Image.YAMB_PHOTO)
                LeftSideProject(colorMode = colorMode, breakpoint = breakpoint,"Yamb Game",Res.String.ABOUT_YAMB)
            }
            Box(modifier=Modifier.fillMaxWidth().padding(topBottom = 20.px))
            ProjectCard(colorMode=colorMode){ breakpoint->
                LeftSideProject(colorMode = colorMode, breakpoint = breakpoint,"Monkify",Res.String.ABOUT_MONKIFY)
                RightSide(breakpoint = breakpoint,Res.Image.MONKIFY_PHOTO)
            }
            Box(modifier=Modifier.fillMaxWidth().padding(topBottom = 50.px))

        }

    }
}

package com.example.website.components

import androidx.compose.runtime.Composable
import com.example.website.styles.ButtonStyle
import com.example.website.styles.SocialIconStyle
import com.example.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSideProject(
    colorMode: ColorMode,
    breakpoint: Breakpoint,
    appName: String,
    aboutApp: String,
) {
    var figmaLink:String=""
    var playstoreLink:String=""
    var githubLink:String=""
    if(appName=="Yamb Game"){
        figmaLink="https://www.figma.com/file/fX0CqNTtE9srd1OJsFxfbR/YambGame?type=design&node-id=0%3A1&mode=design&t=qJhGssP41duZfI9H-1"
        playstoreLink="https://play.google.com/store/apps/details?id=com.yamb.chatgpt"
    }else if(appName=="Monkify"){
        figmaLink="https://www.figma.com/file/oiP9dYYuNp304TrvTpIhO6/MonkApp?type=design&node-id=276%3A408&mode=design&t=6z2d4uzASxCMHlqW-1"
        githubLink="https://github.com/BargoEmbargo/monkify"
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = appName,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    if (colorMode.isLight) Res.Theme.BLUE.color
                    else Res.Theme.LIGHT_BLUE.color
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(14.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = aboutApp
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            IconButton(
                modifier = SocialIconStyle.toModifier(),
                colorMode = colorMode,
                icon = SocialIcon.Figma.icon,
                link = figmaLink
            )
            if(playstoreLink.isNotEmpty()){
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    icon = SocialIcon.Playstore.icon,
                    link = playstoreLink
                )
            }
            if(githubLink.isNotEmpty()){
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    icon = SocialIcon.Github.icon,
                    link = githubLink
                )
            }


        }
    }
}
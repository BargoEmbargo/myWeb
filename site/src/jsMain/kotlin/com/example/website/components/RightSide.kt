package com.example.website.components

import androidx.compose.runtime.Composable
import com.example.website.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun RightSide(breakpoint: Breakpoint,photo:String) {
    var value =if(photo=="photo.png"){Res.Dimens.MAX_CARD_HEIGHT}else{500}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((value - 24).px)
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .objectFit(if(photo=="photo.png"){
                    ObjectFit.Cover}else{
                    ObjectFit.Cover}),
            src = photo
        )

    }
}
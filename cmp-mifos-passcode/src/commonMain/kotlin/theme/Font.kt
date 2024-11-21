package com.mifos.shared.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import io.github.akashmeruva9.cmp_mifos_passcode.generated.resources.Lato_Black
import io.github.akashmeruva9.cmp_mifos_passcode.generated.resources.Lato_Bold
import io.github.akashmeruva9.cmp_mifos_passcode.generated.resources.Lato_Regular
import io.github.akashmeruva9.cmp_mifos_passcode.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun LatoFonts() = FontFamily(
    Font(
        resource = Res.font.Lato_Bold,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.Lato_Regular,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.Lato_Black,
        weight = FontWeight.Black,
        style = FontStyle.Normal
    )
)
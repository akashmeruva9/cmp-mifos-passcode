package component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mifos.library.resources.Res
import com.mifos.library.resources.forgot_passcode_login_manually
import com.mifos.library.resources.skip
import com.mifos.library.resources.use_faceId
import com.mifos.library.resources.use_touchId
import getPlatform
import theme.forgotButtonStyle
import theme.skipButtonStyle
import theme.useTouchIdButtonStyle
import org.jetbrains.compose.resources.stringResource

@Composable
fun PasscodeSkipButton(
    onSkipButton: () -> Unit,
    hasPassCode: Boolean
) {
    if (!hasPassCode) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(
                onClick = { onSkipButton.invoke() }
            ) {
                Text(text = stringResource(Res.string.skip), style = skipButtonStyle())
            }
        }
    }

}

@Composable
fun PasscodeForgotButton(
    onForgotButton: () -> Unit,
    hasPassCode: Boolean
) {
    if (hasPassCode) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextButton(
                onClick = { onForgotButton.invoke() }
            ) {
                Text(
                    text = stringResource(Res.string.forgot_passcode_login_manually),
                    style = forgotButtonStyle()
                )
            }
        }
    }
}

@Composable
fun UseTouchIdButton(
    onClick: () -> Unit,
    hasPassCode: Boolean,
    enableBiometric: Boolean
) {
    if (hasPassCode && enableBiometric) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextButton(
                onClick = onClick
            ) {
                if(getPlatform().name == "Android")
                    Text(text = stringResource(Res.string.use_touchId), style = useTouchIdButtonStyle())
                else
                    Text(text = stringResource(Res.string.use_faceId), style = useTouchIdButtonStyle())
            }
        }
    }
}
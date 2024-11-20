package com.mifos.shared.component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.github.akashmeruva9.cmp_mifos_passcode.Res
import org.jetbrains.compose.resources.stringResource
import passcode_do_not_match
import try_again

@Composable
fun PasscodeMismatchedDialog(
    visible: Boolean,
    onDismiss: () -> Unit
) {
    if (visible) {
        AlertDialog(
            shape = MaterialTheme.shapes.large,
            containerColor = Color.White,
            title = {
                Text(
                        text = stringResource(Res.string.passcode_do_not_match),
                    color = Color.Black
                )
            },
            confirmButton = {
                TextButton(onClick = onDismiss) {
                    Text(text = stringResource(Res.string.try_again), color = Color.Black)
                }
            },
            onDismissRequest = onDismiss
        )
    }
}
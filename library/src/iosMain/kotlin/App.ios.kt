import androidx.compose.ui.window.ComposeUIViewController
import utility.BioMetricUtil
import component.PasscodeScreen
import viewmodels.BiometricAuthorizationViewModel
import platform.UIKit.UIViewController

fun MainViewController(
    bioMetricUtil: BioMetricUtil,
    biometricViewModel: BiometricAuthorizationViewModel
): UIViewController = ComposeUIViewController {
    PasscodeScreen(
        onPasscodeConfirm = {
        },
        onSkipButton = {
        },
        onForgotButton = {},
        onPasscodeRejected = {},
        bioMetricUtil = bioMetricUtil,
        biometricAuthorizationViewModel = biometricViewModel,
        onBiometricAuthSuccess = {
         },
        enableBiometric = true
    )
}
package edu.uksw.fti.pam.pam_activityintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activityintent.ui.screns.SignUpForm
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_ActivityIntentTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SignUpForm(::sendUsernameBackToLogin)
                }
            }
        }
    }
    private fun sendUsernameBackToLogin(username: String?) {
        val result = Intent().putExtra("username", username)
        setResult(Activity.RESULT_OK, result)
        finish()
    }
}
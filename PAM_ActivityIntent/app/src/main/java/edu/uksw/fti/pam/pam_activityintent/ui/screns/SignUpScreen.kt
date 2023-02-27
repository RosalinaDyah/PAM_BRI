package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserFirstName
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserLastName
import kotlinx.coroutines.launch

@Composable
fun SignUpForm(
    btnOnClickAction: (String?) -> Unit
) {
// context
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")

    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confPasswordInput by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(colorResource(id = R.color.white))
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.bribiru),
            contentDescription = "logobribiru",
            modifier = Modifier
                .size(40.dp)
                .padding(top = 10.dp)
        )
        Text(
            text = stringResource(R.string.label_signup),
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = firstnameInput.toString(),
                onValueChange = { firstnameInput = it },
                label = { Text(text = stringResource(R.string.label_first_name)) },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)
                ),
                modifier = Modifier
                    .width(180.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )

            TextField(
                value = lastnameInput.toString(),
                onValueChange = { lastnameInput = it },
                label = { Text(text = stringResource(R.string.label_last_name))},
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)
                ),
                modifier = Modifier
                    .width(180.dp)
                    .padding(start = 10.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = usernameInput.toString(),
                onValueChange = { usernameInput = it },
                label = { Text(text = stringResource(R.string.label_username)) },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = passwordInput.toString(),
                onValueChange = { passwordInput = it },
                label = { Text(text = stringResource(R.string.label_password)) },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = confPasswordInput.toString(),
                onValueChange = { confPasswordInput = it },
                label = { Text(text = stringResource(R.string.label_confirm_password)) },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xffcce2ff)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(8.dp))
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                onClick = {
                    btnOnClickAction(usernameInput)
                    scope.launch {
                        dataStore.saveFirstName(firstnameInput)
                        dataStore1.saveLastName(lastnameInput)
                    }
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                modifier = Modifier

            ) {
                Text(
                    text = stringResource(R.string.label_signup),
                    color = Color(0xfff8fbff)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    PAM_ActivityIntentTheme {
        SignUpForm({})
    }
}
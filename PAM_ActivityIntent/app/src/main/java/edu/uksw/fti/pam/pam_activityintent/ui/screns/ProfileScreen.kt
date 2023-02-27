package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.contracts.SignUpContract
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserFirstName
import edu.uksw.fti.pam.pam_activityintent.datastore.StoreUserLastName


@Composable
fun ProfileScreen() {

    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")

    val notification = rememberSaveable { mutableStateOf("") }
    if (notification.value.isNotEmpty()) {
        Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
        notification.value = ""
    }

    var usernameInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })

    Box(
        modifier = Modifier
            .height(250.dp)
            .fillMaxSize()
//            .clip(shape = RoundedCornerShape(150.dp))
            .background(Color(0xff1763ce))
//            .clip(shape = RoundedCornerShape(25.dp))

    )
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.label_profile),
                modifier = Modifier
                    .clickable { notification.value = "Cancelled" },
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
        }

        ProfileImage()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .height(300.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(5.dp, Color(0xFFE5E5E5))
                )
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 20.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(text = stringResource(R.string.label_first_name))
                Text(
                    text = ":",
                    modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp))
                Text(
                    text = savedFirstName.value!!,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp, start = 20.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(R.string.label_last_name ))
                Text(
                    text = ":",
                    modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp))
                Text(
                    text = savedLastName.value!!,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp, start = 20.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(R.string.label_username))
                Text(
                    text = ":",
                    modifier = Modifier
                        .padding(start = 15.dp, end = 4.dp))
                Text(
                    text = "admin",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 4.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 140.dp, start = 20.dp, end = 4.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "Bio"
                )
                Text(
                    text = ":",
                    modifier = Modifier
                        .padding(start = 65.dp))
                Column(
                ) {
                    Text(
                        text = "Rosalina Dyah Handika (672020045)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 4.dp)
                    )
                    Text(
                        text = "Ega Fitri Yudha Satria Utama (672020068)",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 8.dp, start = 10.dp, end = 4.dp)
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1763ce)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(start = 10.dp),
                onClick = { }) {
                Text(text = stringResource(R.string.label_logout),
                    color = Color(0xfff8fbff))
            }
        }
    }
}

@Composable
fun ProfileImage() {
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")

    val imageUri = rememberSaveable { mutableStateOf("") }
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { imageUri.value = it.toString() }
    }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)

        ) {
            Image(
                painter = painterResource(R.drawable.ucok),
                contentDescription = null,
                modifier = Modifier
//                    .wrapContentSize()
                    .fillMaxSize()
                    .clickable { launcher.launch("image/*") },
                contentScale = ContentScale.Crop
            )
        }
        Row() {
            Text(
                text = savedFirstName.value!!,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(start = 10.dp, end = 4.dp)
            )
            Text(
                text = savedLastName.value!!,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(start = 5.dp, end = 4.dp)
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    PAM_ActivityIntentTheme {
        ProfileScreen()
    }
}
package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme
import edu.uksw.fti.pam.pam_activityintent.R

@Composable
fun SetengahBunder() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val canvasWidth = size.width
            val canvasHeight = size.height
            val brush = Brush.horizontalGradient(listOf(Color(0xFF3984C9), Color(0xFFED8141)))
            val brush2 = Brush.horizontalGradient(listOf(Color(0xFF9A8B8B), Color(0xFFED8141)))
            drawCircle(
                brush,
                center = Offset(x = canvasWidth / 2, y = canvasHeight / 1000),
                radius = size.minDimension / 1
            )
            drawCircle(
                brush2,
                center = Offset(x = canvasWidth / 1, y = canvasHeight / 6),
                radius = size.minDimension / 2
            )
        }
    }
}

@Composable
//atass
fun GreetingSection(
    name: String
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp, start = 30.dp, end = 30.dp)

    ) {
        Image(
            painter = painterResource(R.drawable.elipse),
            contentDescription = "elipse",
            modifier = Modifier
                .size(17.dp)
        )
        Image(
            painter = painterResource(R.drawable.brimo),
            contentDescription = "brimo",
            modifier = Modifier
                .size(35.dp)
        )
        Icon(
            Icons.Rounded.Notifications,
            contentDescription = "Notif",
            tint = Color.White,
            modifier = Modifier
                .size(24.dp)
        )

    }
    Row(
        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 75.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            text = stringResource(R.string.label_welcome),
            style = MaterialTheme.typography.body1,
            color = Color.White
        )
        Text(
            text = "$name!",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.body1,
            color = Color.White
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 105.dp, start = 30.dp, end = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(165.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color(0xFF3984C8), shape = RoundedCornerShape(15.dp))
//                .shadow(
//                    elevation = 1.dp, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFF2F6CA3))
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 117.dp, end = 10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.bercak2),
                    contentDescription = "bercak",
                    modifier = Modifier
                        .size(70.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp, start = 75.dp, end = 10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.bercak),
                    contentDescription = "bercak",
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 185.dp, end = 10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.bri),
                    contentDescription = "bri",
                    modifier = Modifier
                        .size(18.dp)
                )
                Text(
                    text = "TABUNGAN BRI",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
        }
    }
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 162.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            text = stringResource(R.string.label_balance),
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 30.dp)
        )
    }
    Row(
        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 182.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            text = "Rp ", fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(start = 5.dp)
        )
        Text(
            text = "⚪   ⚪   ⚪   ⚪   ⚪   ⚪   ⚪   ⚪ ", fontSize = 8.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 5.dp)
        )
        Image(
            painter = painterResource(R.drawable.eye),
            contentDescription = "eye",
            modifier = Modifier
                .padding(start = 5.dp)
                .size(16.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 200.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            text = "608801027700538", fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(top = 37.dp, start = 15.dp)
        )
        Image(
            painter = painterResource(R.drawable.add),
            contentDescription = "add",
            modifier = Modifier
                .padding(top = 40.dp, end = 15.dp)
                .size(50.dp)
        )
    }
    Text(
        text = stringResource(R.string.label_menu),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .padding(top = 285.dp, start = 30.dp)
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 310.dp, start = 30.dp, end = 30.dp)
            .height(105.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .background(Color.White, shape = RoundedCornerShape(15.dp))
            .border(
                BorderStroke(2.dp, Color(0xFFE5E5E5))
            )
    )
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 328.dp, start = 50.dp, end = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.transfer),
            contentDescription = "transfer",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.briva),
            contentDescription = "briva",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.listrik),
            contentDescription = "listrik",
            modifier = Modifier
                .size(50.dp)
        )
        Image(
            painter = painterResource(R.drawable.lainnya),
            contentDescription = "lainnya",
            modifier = Modifier
                .size(50.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 385.dp, start = 50.dp, end = 55.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_transfer),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_briva),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_electricity),
            fontSize = 12.sp,
            color = Color.Black,
        )
        Text(
            textAlign = TextAlign.Center,
            text = stringResource(R.string.label_other),
            fontSize = 12.sp,
            color = Color.Black,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 425.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = stringResource(R.string.label_financial),
            fontSize = 16.sp,
            color = Color(0xFF3984C8),
        )
        Text(
            text = stringResource(R.string.label_view_details) ,
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 448.dp, start = 30.dp, end = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .width(155.dp)
                .height(60.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(start = 20.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 448.dp, start = 50.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.pemasukan),
            contentDescription = "pemasukan",
            modifier = Modifier
                .size(40.dp)
        )
        Text(
            text = "Rp. 300.000",
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp, end = 45.dp)
        )
        Image(
            painter = painterResource(R.drawable.penurunan),
            contentDescription = "pengeluaran",
            modifier = Modifier
                .size(45.dp)
        )
        Text(
            text = "Rp. 100.000",
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp)
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 470.dp, start = 50.dp, end = 50.dp)
    ) {
        Text(
            text = stringResource(R.string.label_income),
            fontSize = 14.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 10.dp, start = 25.dp)
        )
        Text(
            text = stringResource(R.string.label_expenses),
            fontSize = 14.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp, end = 15.dp)
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 515.dp, start = 30.dp, end = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(37.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 520.dp, start = 120.dp, end = 80.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.selisih),
            contentDescription = "selisih",
            modifier = Modifier
                .size(25.dp)
        )
        Text(
            text = stringResource(R.string.label_differnce),
            fontSize = 14.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp)
        )
        Text(
            text = "Rp. 200.000",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(end = 15.dp)
        )
    }


    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 563.dp, start = 30.dp, end = 30.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = stringResource(R.string.label_last_transaction),
            fontSize = 16.sp,
            color = Color(0xFF3984C8),
        )
        Text(
            text = stringResource(R.string.label_view_mutation),
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 588.dp, start = 30.dp, end = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 595.dp, start = 50.dp, end = 30.dp)
    ) {
        Text(
            text = stringResource(R.string.label_today),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF3984C8),
            modifier = Modifier
                .padding(end = 15.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 625.dp, start = 50.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.e),
            contentDescription = "e",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Erna Widyaningsih",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "+ Rp. 20.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color(0xFF27EF10),
            modifier = Modifier
                .padding(top = 5.dp, start = 64.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 670.dp, start = 50.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.s),
            contentDescription = "s",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Susana Astutininggar",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "- Rp. 30.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 5.dp, start = 46.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 715.dp, start = 50.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.spotify),
            contentDescription = "spotify",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Spotify",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "- Rp. 49.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 5.dp, start = 130.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 630.dp, start = 90.dp, end = 30.dp)
    ){
        Text(
            text = "BCA 6284935571005432",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 13.dp)
        )
        Text(
            text = "DANA 8362910384213000",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 31.dp)
        )
        Text(
            text = "Langganan Bulanan",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 28.dp)
        )
    }
    Text(
        text = stringResource(R.string.label_this_month),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF3984C8),
        modifier = Modifier
            .padding(top = 762.dp, start = 50.dp, end = 45.dp)
    )
}

//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun MyBottomNavigation() {
//
//    var bottomState by remember {
//        mutableStateOf("")
//    }
//
//    Scaffold(
//        content = {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize(),
//                Alignment.Center) {
//                Text(text = bottomState,
//                    fontSize = 25.sp,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//        },
//        bottomBar = {
//            BottomNavigation(
////                modifier = Modifier
////                    .clip(shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp)),
//                backgroundColor = Color(0xFF3984C8),
//                contentColor = Color(0xFFFFFFFF)
//            ) {
//                BottomNavigationItem(
//                    selected = bottomState == "Home",
//                    onClick = { bottomState = "Home" },
//                    label = { Text(text = "Home") },
//                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
//                    selectedContentColor = Color(0xFFED8141)
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "Mutasi",
//                    onClick = { bottomState = "Mutasi" },
//                    label = { Text(text = "Mutasi") },
//                    icon = { Icon(imageVector = Icons.Default.Menu, contentDescription = null) }
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "QRIS",
//                    onClick = { bottomState = "QRIS" },
//                    label = { Text(text = "") },
//                    icon = { Icon(imageVector = Icons.Default.Clear, contentDescription = null) },
//                    selectedContentColor = Color(0xFF3984C8)
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "Pesan",
//                    onClick = { bottomState = "Pesan" },
//                    label = { Text(text = "Pesan") },
//                    icon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "Account",
//                    onClick = { bottomState = "Account" },
//                    label = { Text(text = "Akun") },
//                    icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null
//                    )
//                    }
//                )
//            }
//        }
//    )
//}
//
//@Composable
//fun NavigationQris() {
//    Row(
////        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxWidth(1f)
//            .height(IntrinsicSize.Min)
//            .padding(top = 760.dp)
//
//    ) {
//        Image(
//            painter = painterResource(R.drawable.qriss),
//            contentDescription = "Contact profile picture",
//            modifier = Modifier
//                .size(65.dp)
//                .clip(CircleShape)
//        )
//        Spacer(modifier = Modifier.width(8.dp))
//    }
//}

@Preview(showBackground = true)
@Composable
fun HomeActivityku() {
    PAM_ActivityIntentTheme {
//        MyBottomNavigation()
        SetengahBunder()
        GreetingSection(name = String())
//        NavigationQris()
    }
}
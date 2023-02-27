package edu.uksw.fti.pam.pam_activityintent.ui.screns

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@Composable
fun ArticleScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(R.string.label_mutation),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff1763ce))
        )
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(220.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color(0xFFE5E5E5), shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFE5E5E5))
                )
        )
    }
    Box(
        modifier = Modifier
            .padding(top = 230.dp, start = 40.dp, end = 40.dp)
            .height(40.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(15.dp))
            .background(Color(0xff1763ce), shape = RoundedCornerShape(15.dp))

    )
    Text(
        text = stringResource(R.string.label_search),
        fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 18.sp,
        modifier = Modifier
            .padding(top = 235.dp, start = 180.dp)
    )
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, top = 80.dp)
    ) {
        Text(
            text = stringResource(R.string.label_search_mutation),
            fontWeight = FontWeight.Bold,
            color = Color(0xff1763ce),
            fontSize = 18.sp,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                Icons.Rounded.Menu,
                contentDescription = "pilih",
                tint = Color(0xff1763ce),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(40.dp)
            )
            Text(
                text = stringResource(R.string.label_choose_account),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color(0xFF878787),
                modifier = Modifier
                    .padding(top = 15.dp, start = 10.dp)
            )
            Text(
                text = ">",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                color = Color(0xff1763ce),
                modifier = Modifier
                    .padding( top = 20.dp, start = 135.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                Icons.Rounded.DateRange,
                contentDescription = "pilih",
                tint = Color(0xff1763ce),
                modifier = Modifier
                    .padding(top = 15.dp)
                    .size(40.dp)
            )
            Text(
                text = stringResource(R.string.label_choose_date),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color(0xFF878787),
                modifier = Modifier
                    .padding(top = 15.dp, start = 10.dp)
            )
            Text(
                text = ">",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                color = Color(0xff1763ce),
                modifier = Modifier
                    .padding( top = 20.dp, start = 160.dp, end = 60.dp)
            )
        }
    }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp, start = 80.dp)
        ) {
            Text(
                text = "6088 0102 7700 538",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 15.dp, start = 10.dp)
            )
            Text(
                text = stringResource(R.string.label_today),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 35.dp, start = 10.dp)
            )
        }
    Box(
        modifier = Modifier
            .padding(top = 310.dp, start = 20.dp, end = 20.dp)
            .fillMaxHeight()
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(15.dp))
            .background(Color.White, shape = RoundedCornerShape(15.dp))
            .border(
                BorderStroke(2.dp, Color(0xFFE5E5E5))
            )
    )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 325.dp, start = 50.dp, end = 30.dp)
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
            .padding(top = 355.dp, start = 50.dp, end = 10.dp)
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
            .padding(top = 400.dp, start = 50.dp, end = 10.dp)
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
            .padding(top = 445.dp, start = 50.dp, end = 10.dp)
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
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 520.dp, start = 50.dp, end = 10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.s),
            contentDescription = "s",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Sunaryo",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "- Rp. 200.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 5.dp, start = 125.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 790.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = "e",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Eben Heazer Eta",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "- Rp. 40.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 5.dp, start = 80.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 565.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.d),
            contentDescription = "e",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Diana Ria",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "+ Rp. 500.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color(0xFF27EF10),
            modifier = Modifier
                .padding(top = 5.dp, start = 122.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 610.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = "e",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Eben Heazer Eta",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "- Rp. 20.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 5.dp, start = 80.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 655.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = "emerah",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Eben Heazer Eta",
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
                .padding(top = 5.dp, start = 80.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 700.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.emerah),
            contentDescription = "e",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Eben Heazer Eta",
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
                .padding(top = 5.dp, start = 80.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 740.dp, start = 50.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.d),
            contentDescription = "d",
            modifier = Modifier
                .size(32.dp)
        )
        Text(
            text = "Diana Ria",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp, end = 7.dp)
        )
        Text(
            text = "+ Rp. 200.000",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = Color(0xFF27EF10),
            modifier = Modifier
                .padding(top = 5.dp, start = 122.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 360.dp, start = 92.dp, end = 30.dp)
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
        Text(
            text = "BRI 612368926400321680",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 60.dp)
        )
        Text(
            text = "DANA 7126489097432221",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Text(
            text = "BNI 88345721999035560",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Text(
            text = "BNI 88345721999035560",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Text(
            text = "BNI 88345721999035560",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Text(
            text = "BNI 88345721999035560",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 27.dp)
        )
        Text(
            text = "DANA 7126489097432221",
            fontSize = 11.sp,
            color = Color(0xFF878787),
            modifier = Modifier
                .padding(top = 30.dp)
        )
    }
    Text(
        text = stringResource(R.string.label_this_month),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color(0xFF3984C8),
        modifier = Modifier
            .padding(top = 492.dp, start = 50.dp, end = 45.dp)
    )
    
}


@Preview(showBackground = true)
@Composable
fun Artikel() {
    PAM_ActivityIntentTheme {
        ArticleScreen()
    }
}
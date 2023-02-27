package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.BottomNavItems
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun NavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Home.screen_route
    ) {
        composable(BottomNavItems.Home.screen_route) {
            SetengahBunder()
            GreetingSection(name = String())

        }
        composable(BottomNavItems.Article.screen_route) {
            ArticleScreen()
        }
        composable(BottomNavItems.Pesan.screen_route) {
            PesanScreen()
        }
        composable(BottomNavItems.Profile.screen_route) {
            ProfileScreen()
        }
    }
}

@Composable
fun BottomNavigation(
    navController: NavController
) {
    val items = listOf(
        BottomNavItems.Home,
        BottomNavItems.Article,
        BottomNavItems.Qris,
        BottomNavItems.Pesan,
        BottomNavItems.Profile
    )
    BottomAppBar(
        cutoutShape = MaterialTheme.shapes.small.copy(
            CornerSize(percent = 50)
        )
    ) {


        androidx.compose.material.BottomNavigation(

            backgroundColor = Color(0xFF3984C8),
            contentColor = Color(0xFFFFFFFF),

            ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            items.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = "${item.title} icon"
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            fontSize = 9.sp
                        )
                    },
                    selectedContentColor = Color(0xFFED8141),
                    unselectedContentColor = Color.White.copy(0.40f),
                    alwaysShowLabel = true,
                    selected = currentRoute == item.screen_route,
                    onClick = {
                        navController.navigate(item.screen_route) {
                            navController.graph.startDestinationRoute?.let { screen_route ->
                                popUpTo(screen_route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    }
}


@Composable
fun Fab(scope: CoroutineScope,
        scaffoldState: ScaffoldState){
    FloatingActionButton(
        onClick = {
            scope.launch { scaffoldState.snackbarHostState
                .showSnackbar("Apa hayo",
                    actionLabel = "Acepet",
                    duration = SnackbarDuration.Indefinite)}
        }
    ) {
        Image(
            painter = painterResource(R.drawable.qrisbunder),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(55.dp)
                .clip(CircleShape)
                .wrapContentSize(Alignment.Center)
        )
    }
}



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationMainScreenView(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavigation(
                navController = navController,
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = { Fab(scope, scaffoldState) },
        isFloatingActionButtonDocked = true
    ) {
        NavigationGraph(navController = navController)
    }
}
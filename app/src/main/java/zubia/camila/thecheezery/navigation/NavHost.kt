package zubia.camila.thecheezery.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import androidx.lifecycle.viewmodel.compose.viewModel
import zubia.camila.thecheezery.screens.ListaMenuScreen
import zubia.camila.thecheezery.screens.LoginScreen
import zubia.camila.thecheezery.screens.MenuScreen
import zubia.camila.thecheezery.screens.WelcomeScreen
import zubia.camila.mypokedex.screens.OrderScreen
import zubia.camila.thecheezery.viewmodel.ClientViewModel

@Composable
fun MyApp(innerPadding: PaddingValues){
    val navController = rememberNavController()
    val clientViewModel: ClientViewModel = viewModel()
    NavHost(navController, startDestination= Welcome){
        composable<Welcome> {
            WelcomeScreen(innerPadding, onStartedClick = {navController.navigate(Login)})
        }
        composable<Login>{
            LoginScreen(innerPadding, clientViewModel, onEntrarClick = {navController.navigate(Menu)})
        }
        composable<Menu>{
            MenuScreen(innerPadding, onSelectOption = {opcion -> navController.navigate(ListaMenu(opcion))}, onCartClick = { navController.navigate(Order) })
        }
        composable<ListaMenu>{backStackEntry ->
            val opcion = backStackEntry.toRoute<ListaMenu>().opcion
            ListaMenuScreen(innerPadding, opcion, clientViewModel)
        }
        composable<Order>{
            OrderScreen(innerPadding, clientViewModel.cart, clientViewModel.total, clientViewModel::removeProduct)
        }
    }
}

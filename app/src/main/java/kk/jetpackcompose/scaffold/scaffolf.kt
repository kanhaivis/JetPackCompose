package kk.jetpackcompose.scaffold

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable

@Composable
fun HomeScaffold() {

    Scaffold(
        topBar = {
        TopAppBar(
            title = {
                     Text(text = "Home")
                    },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Notifications, contentDescription = "Noti")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Search, contentDescription = "Search")
            }
        })

    }) {

    }
}

@Composable
fun MySectionScaffold() {
    
    Scaffold(topBar = {}) {
        TopAppBar(title = {
            Text(text = "Home App")
        },
        navigationIcon = {
            Icon(Icons.Filled.Menu, contentDescription = "" )
        },
        actions = {

            IconButton(onClick = { }) {
                Icon(Icons.Filled.Home, contentDescription = "home")
            }
            IconButton(onClick = {  }) {
                Icon(Icons.Filled.Edit, contentDescription = "edit")

            }
        })

    }
    
}
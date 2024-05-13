package com.example.bottomnavigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
import com.example.bottomnavigation.R
import com.example.bottomnavigation.component.BiodataItem
import com.example.bottomnavigation.data.DummyData
import com.example.bottomnavigation.model.Biodata
import com.example.bottomnavigation.navigation.Screen
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.Alignment

@Composable
fun SettingScreen(
    modifier: Modifier = Modifier,
    biodatas: List<Biodata> = DummyData.BiodataMentee,


){

//    LazyVerticalGrid(
//        contentPadding = PaddingValues(16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp),
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        columns = GridCells.Adaptive(140.dp),
//        modifier = modifier.fillMaxSize()
//    ) {
//        items(biodatas, key = {it.id}){
//            BiodataItem(biodata = it)
//        }
//    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        biodatas.forEach { biodata ->
            BiodataItem(
                biodata = biodata,
//                modifier = Modifier
//                    .clip(CircleShape)

            )
        }

    }

//    Box(modifier = Modifier
//        .fillMaxSize(),
//        contentAlignment = Alignment.Center){
//        Text(
//            text = "Setting Screen About",
//            fontFamily = FontFamily.Serif,
//            fontSize = 22.sp
//        )
//
//
//    }


}

@Preview(showBackground = true)
@Composable
private fun BiodataPreview(){
    BottomNavigationTheme {
        SettingScreen(
           biodatas = DummyData.BiodataMentee

        )
    }
}
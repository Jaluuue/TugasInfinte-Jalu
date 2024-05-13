package com.example.bottomnavigation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bottomnavigation.R
import com.example.bottomnavigation.model.Biodata
import com.example.bottomnavigation.screens.SettingScreen
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun BiodataItem(
    biodata: Biodata,
    modifier: Modifier = Modifier,


){

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.LightGray, )
    ){
        Column(
            modifier = modifier
                .padding(16.dp)

        ) {
            Image(
                painter = painterResource(id = biodata.photo ),
                contentDescription = biodata.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = biodata.name, style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Email: ${biodata.email}",
//                style = MaterialTheme.typography.body1,
//                color = MaterialTheme.colors.onSurface // Memberikan warna teks yang kontras dengan latar belakang
            )
            Text(
                text = "Instansi: ${biodata.instansi}",
//                style = MaterialTheme.typography.body1,
//                color = MaterialTheme.colors.onSurface // Memberikan warna teks yang kontras dengan latar belakang
            )
            Text(
                text = "Prodi: ${biodata.prodi}",
//                style = MaterialTheme.typography.body1,
//                color = MaterialTheme.colors.onSurface // Memberikan warna teks yang kontras dengan latar belakang
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun BiodataPreview(){
    BottomNavigationTheme {
        BiodataItem(
            biodata = Biodata(
                1,
                R.drawable.founder,
                "Aditya Putranto",
                "adityaputranto.acp4@gmail.com",
                "Universitas 17 Agustus 1945 Surabaya",
                "Teknik Informatika"


            )
        )
    }
}

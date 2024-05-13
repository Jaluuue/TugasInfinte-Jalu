package com.example.bottomnavigation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.bottomnavigation.model.Mentee
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme

@Composable
fun MenteeItem(
    mentee: Mentee,
    modifier: Modifier = Modifier,
){
    Box (
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clip(MaterialTheme.shapes.medium)
            .background(Color.LightGray, MaterialTheme.shapes.medium)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = mentee.photo),
                contentDescription = mentee.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(80.dp)
                    .padding(10.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = mentee.name, style = MaterialTheme.typography.titleMedium)
                Row {
                    Text(text = mentee.role, color = MaterialTheme.colorScheme.primary)
                    Text(text = " - ${mentee.batch}")
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun MenteeItemPreview(){
    BottomNavigationTheme {
        MenteeItem(
            mentee = Mentee(
                1,
                "Nama Mentee",
                R.drawable.no_profile,
                "Batch 7",
                "Mentee Mobile"

            )
        )
    }
}
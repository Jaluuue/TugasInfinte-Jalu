package com.example.bottomnavigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bottomnavigation.data.DummyData
import com.example.bottomnavigation.model.Mentor


@Composable
fun DetailMentorScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    mentorsId: Int?
){
    val newMentorList = DummyData.mobileMentors.filter { mentor ->
        mentor.id == mentorsId
    }
    Column(
        modifier = modifier
    ) {
        DetailMentorContent(newMentorList = newMentorList)
    }
}

@Composable
private fun DetailMentorContent(
    newMentorList: List<Mentor>,
    modifier: Modifier = Modifier
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ){
      Image( painter = painterResource(id = newMentorList[0].photo ),
          contentDescription = newMentorList[0].name,
          contentScale = ContentScale.Crop,
          modifier = Modifier
              .clip(CircleShape)
              .size(200.dp),)
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newMentorList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text =  "(${newMentorList[0].nickname})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Role : ${newMentorList[0].role}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun DetailMentorContentPreview(){
    DetailMentorContent(newMentorList = DummyData.mobileMentors)
}
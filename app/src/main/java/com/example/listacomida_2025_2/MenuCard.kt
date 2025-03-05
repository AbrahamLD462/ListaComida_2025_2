package com.example.listacomida_2025_2

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.DataSource
import model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier){
    Card(modifier = Modifier) {
        Column {
            Image(
                painter = painterResource(id = platillo.drawableResId),
                contentDescription = stringResource(id = platillo.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(platillo.stringResourceId),
                modifier = Modifier.padding(22.dp),
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Composable
fun MenuCardList(platillos: List<Platillo>, modifier: Modifier = Modifier){
    LazyColumn(modifier = Modifier) {
        items(platillos){
            platillo -> MenuCard(
            platillo = platillo,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuCard_Preview(){
    val dataSource = DataSource()
    val platillos = dataSource.LoadPlatillos()

    MenuCard(platillo = platillos[0])
}

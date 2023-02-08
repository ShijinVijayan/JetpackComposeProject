package com.example.myproject.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.util.BRAND_IMAGE_LIST

@Preview
@Composable
fun TopPlayers() {

        Section("Top Players") {
            LazyRow(modifier = Modifier
                .padding(start = 5.dp)
                .fillMaxWidth()) {
                items(BRAND_IMAGE_LIST) { brand ->
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier = Modifier.size(70.dp),
                        shape = CircleShape,
                        elevation = 1.dp
                    ) {
                        Icon(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(15.dp),
                            imageVector = ImageVector.vectorResource(id = brand),
                            contentDescription = "Notification icon",
                            tint = MaterialTheme.colors.onBackground)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }

}


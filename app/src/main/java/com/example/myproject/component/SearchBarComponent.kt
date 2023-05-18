package com.example.myproject.component

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.R
import com.example.myproject.ui.theme.colorBlue
import com.example.myproject.ui.theme.colorDArkGray
import com.example.myproject.ui.theme.colorGray
import com.example.myproject.ui.theme.colorRedDark


import com.example.myproject.ui.theme.colorWhite


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SearchBarCom() {

    var searchText by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp)
            .height(48.dp)
            .background(colorWhite),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(colorWhite)
    ) {
        Row(
            modifier = Modifier
                .statusBarsPadding()
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            /* Icon(
                 imageVector = Icons.Default.Search,
                 contentDescription = "profile_picture",
                 modifier = Modifier
                     .padding(start = 4.dp)
                     .size(24.dp),
                 tint = colorDArkGray
             )*/

            TextField(
                value = searchText,
                onValueChange = { },
                maxLines = 1,
                textStyle = MaterialTheme.typography.bodySmall,
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledTextColor = Color.White,
                    errorContainerColor = colorRedDark,
                    selectionColors = TextSelectionColors(colorDArkGray, colorBlue)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .weight(1f)
                    .background(colorWhite),
                placeholder = {
                    Text(
                        text = stringResource(R.string.search)
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "profile_picture",
                        modifier = Modifier
                            .padding(start = 2.dp)
                            .size(24.dp),
                        tint = colorDArkGray
                    )

                },
                trailingIcon = {
//                    if (showClearIcon) {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "profile_picture",
                                modifier = Modifier
                                    .padding(end = 4.dp)
                                    .size(24.dp),
                                tint = colorDArkGray
                            )


                        }
//                    }
                }



            )

            /*      Icon(
                      imageVector = Icons.Default.Close,
                      contentDescription = "profile_picture",
                      modifier = Modifier
                          .padding(end = 8.dp)
                          .size(24.dp),
                      tint = colorDArkGray
                  )
      */
        }

    }


}

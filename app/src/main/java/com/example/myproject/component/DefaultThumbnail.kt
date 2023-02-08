package com.example.myproject.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.myproject.data.Shoe
import com.example.myproject.data.ShoeDataSource
import com.example.myproject.data.ShoeType
import com.example.myproject.ui.theme.colorBlue
import com.example.myproject.ui.theme.colorPrimary

@Preview
@Composable
fun DefaultThumbnail(
    shoe : Shoe = ShoeDataSource().getDefaultShoe(),
    shoeType: ShoeType = ShoeDataSource().getDefaultShoe().shoeTypes[0],
    onButtonClick : (shoe : Shoe) -> Unit = {}
){
    val isLiked : Boolean = false

    Card(
        modifier = Modifier.width(160.dp), shape = RoundedCornerShape(15.dp), elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally)
        {
            /*Header*/
            Row {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add icon")
                Spacer(modifier = Modifier.weight(1f))
                if(isLiked) {
                    Icon(
                        imageVector = Icons.Outlined.Favorite,
                        contentDescription = "Favorite icon",
                        tint = Color.Red)
                } else {
                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorite icon")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            /*Image of show */

            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)) {
                if(shoeType.thumbnailImagePainter != null) {
                    Image(
                        modifier = Modifier
                            .weight(1f, fill = false)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = shoeType.thumbnailImagePainter!!),
                        contentDescription = "Thumbnail image",

                        )
                } else {
                    AsyncImage(
                        modifier = Modifier
                            .weight(1f, fill = false)
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop,
                        model = shoeType.thumbnailImage,
                        contentDescription = "Thumbnail Image")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            /*Name*/
            Text(
                text = shoe.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
//                    color = Color(0xff3d3d4e),
                    color = MaterialTheme.colors.onBackground
                )
            )
            Text(
                text = "${shoeType.price}$",
                style = TextStyle(
//                    fontWeight = FontWeight.SemiBold,
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp,
//                    color = Color(0xff3d3d4e),
                    color = MaterialTheme.colors.onBackground

                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorBlue,
                    contentColor = Color.White
                ),
                onClick = { onButtonClick(shoe) }
            ) {
                Text(text = "Buy Now")
            }
        }
    }
}
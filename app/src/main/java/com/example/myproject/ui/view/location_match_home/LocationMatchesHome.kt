package com.example.myproject.ui.view.location_match_home

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myproject.R
import com.example.myproject.data.LocationTournamentsModel
import com.example.myproject.data.listLocationTournaments
import com.example.myproject.ui.theme.*

@Composable
fun LocationMatchesHomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorGray)

    ) {
        HeaderLocationName()
        ListOfTournaments()

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderLocationName() {

    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Thrissur",
                fontWeight = FontWeight.Bold,
                color = colorBlue,
                textAlign = TextAlign.Center,
                modifier = Modifier,
                fontSize = 25.sp
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(colorWhite),
        navigationIcon = {
            Icon(
                modifier = Modifier.padding(start = 8.dp),
                painter = painterResource(id = R.drawable.ic_arrow_back),
                tint = colorBlue,
                contentDescription = ""
            )
        }
    )

}


@Composable
fun ListOfTournaments() {

    LazyColumn(
        modifier = Modifier.background(colorGray)
    ) {
        items(listLocationTournaments) {
            LocationTournamentItem(listTournament = it)
        }

    }
}

@Composable
fun LocationTournamentItem(
    listTournament: LocationTournamentsModel,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    var enabled by remember { mutableStateOf(true) }
    val alpha: Float by animateFloatAsState(if (enabled) 1f else 0.5f)
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp,
        ), colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Column(
            modifier = Modifier
              /*  .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioHighBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )*/
                .graphicsLayer(alpha = alpha)
                .background(color = colorWhite)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                TournamentImage(listTournament.imageResourceId)
                TournamentDetails(
                    listTournament.tournamentName,
                    listTournament.tournamentType,
                    listTournament.location,
                    listTournament.tournamentDateAndTime
                )
                Spacer(modifier = Modifier.weight(1f))
                TournamentsListItemClick(
                    expanded = expanded,
                    onClick = { expanded = !expanded }
                )

            }

            if (expanded) {
                TournamentInformation(tournamentInformation = listTournament.tournamentName)
            }

        }

    }
}

@Composable
fun TournamentInformation(
    tournamentInformation: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 16.dp)
    ) {
        androidx.compose.material.Text(
            text = tournamentInformation,
            style = androidx.compose.material.MaterialTheme.typography.h3
        )
        androidx.compose.material.Text(
            text = tournamentInformation,
            style = androidx.compose.material.MaterialTheme.typography.body1
        )
    }
}


@Composable
fun TournamentsListItemClick(
    expanded: Boolean,
    onClick: () -> Unit
) {

    IconButton(onClick = onClick) {

        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = androidx.compose.material.MaterialTheme.colors.secondary,
            contentDescription = stringResource(id = R.string.expand_button_content_description)
        )

    }


}


@Composable
fun TournamentImage(@DrawableRes tournamentImage: Int, modifier: Modifier = Modifier) {

    Image(
        modifier = modifier
            .padding(8.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(0, 0, 0, 0)),
        painter = painterResource(tournamentImage),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )


}

@Composable
fun TournamentDetails(
    tournamentName: String,
    tournamentType: String,
    location: String,
    tournamentDateAndTime: String,
    modifier: Modifier = Modifier
) {
    Column {
        Text(
            text = tournamentName,
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier
                .padding(top = 8.dp)
        )
        Text(
            text = tournamentType,
            style = MaterialTheme.typography.titleSmall,
            modifier = modifier
                .padding(top = 8.dp)
        )
        Text(
            text = location,
            style = MaterialTheme.typography.titleSmall,
            modifier = modifier
                .padding(top = 8.dp)
        )
        Text(
            text = tournamentDateAndTime,
            style = MaterialTheme.typography.titleSmall,
            modifier = modifier
                .padding(top = 8.dp)
        )

    }


}


@Preview(name = "Full Preview", showSystemUi = true)
@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun preViewHome() {
    LocationMatchesHomeScreen()

}
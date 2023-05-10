package com.example.myproject.data

import androidx.annotation.DrawableRes
import com.example.myproject.R

data class LocationTournamentsModel(
    @DrawableRes val imageResourceId:Int,
    val tournamentName:String,
    val tournamentType:String,
    val tournamentDateAndTime:String,
    val ageLimit:String,
    val location:String,
)

val listLocationTournaments = listOf(

    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Thrissur","Shootout","11/5/23 , 10:00 AM","No Age Limit","Thrissur"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Palakad","5","18/5/23 , 10:00 AM","No Age Limit","Palakad"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Calicut","6","19/5/23 , 10:00 AM","No Age Limit","Calicut"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Alapuzha","Shootout","25/5/23 , 10:00 AM","No Age Limit","Alapuzha"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Malapuram","3","26/5/23 , 10:00 AM","No Age Limit","Malapuram"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Ernakulam","7","1/6/23 , 10:00 AM","No Age Limit","Ernakulam"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Thrissur","Shootout","7/6/23 , 10:00 AM","No Age Limit","Thrissur"),
    LocationTournamentsModel(R.drawable.user,"1st All India Tournament,Palakad","Shootout","15/6/23 , 10:00 AM","No Age Limit","Palakad"),
)
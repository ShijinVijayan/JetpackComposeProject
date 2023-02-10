package com.example.myproject.data

//@Entity(tableName = "product_table")
data class TournamentData(
    val tournamentId: String,
    val tournamentCategory: String,
    val detailText: String,
    val imgUrl: String,
    val material: String,
    val name: String,
    val price: String,
    val soldItem: String,
    val tags: String,
    val quantity: String?
)

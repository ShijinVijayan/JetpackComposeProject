package com.example.myproject.data

import java.util.*
import kotlin.collections.ArrayList

data class Shoe(var name : String,
                var isForMan : Boolean = true,
                var rating : Double = 0.0,
                var numberOfVotes : Int = 0,
                var shoeTypes : ArrayList<ShoeType> = arrayListOf(),
                val brand : String,
                var id : UUID = UUID.randomUUID(),
)

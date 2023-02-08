package com.example.myproject.data

import java.util.*
import kotlin.collections.ArrayList

class ShoeDataSource {
    fun getShoeList(): ArrayList<Shoe> {
        return SHOE_LIST
    }

    fun getShoeById(id : UUID) : Shoe? {
        val shoe =  SHOE_LIST.filter { shoe ->  shoe.id == id}
        return if(shoe.isEmpty()) null else shoe[0]
    }
    fun getDefaultShoe() : Shoe {
        return Shoe(brand = "Puma", name = "Roma Basic Sneakers", shoeTypes = roma_basic_sneakers, rating = 4.0, numberOfVotes = 165)
    }

}

val SHOE_LIST = arrayListOf(
    Shoe(brand = "Puma", name = "Roma Basic Sneakers", shoeTypes = roma_basic_sneakers, rating = 4.0, numberOfVotes = 165),
    Shoe(brand = "Puma", name = "Rider Future Vintage", shoeTypes = rider_future),
    Shoe(brand = "Puma", name = "Deviate NITRO 2", isForMan = false, shoeTypes = deviate_nitro),
    Shoe(brand = "Puma", name = "Scuderia Ferrari TRC Blaze", shoeTypes = scuderia_ferrari),
    Shoe(brand = "Puma", name = "BMW M Motorsport RS-Fast", shoeTypes = bmw_m_motorsport),
    Shoe(brand = "Puma", name = "RS-X T3CH RIZE", shoeTypes = rs_x_t3ch_rize),
    Shoe(brand = "Puma", name = "RS-X T3CH New Heritage", shoeTypes = rs_x_t3ch_rize_new_heritage, rating = 5.0, numberOfVotes = 1),
    Shoe(brand = "Puma", name = "RS-X T3CH SPEC", shoeTypes = rs_x_t3ch_spec, rating = 4.1, numberOfVotes = 4),
    Shoe(brand = "Puma", name = "Porsche Legacy TRC", shoeTypes = porsche_legacy_trc),
    Shoe(brand = "Puma", name = "PUMA x FIRST MILE Deviate Nitro", shoeTypes = first_mile_deviate_nitro, isForMan = false),
    Shoe(brand = "Puma", name = "Deviate NITRO Elite Fireglow", shoeTypes = deviate_nitro_elite_fireglow, isForMan = false),
)
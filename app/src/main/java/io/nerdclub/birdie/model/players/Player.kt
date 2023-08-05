package io.nerdclub.birdie.model.players

import io.nerdclub.birdie.model.countries.Country

data class Player(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val fullName: String,
    val headshot: String,
    val gender: String,
    val country: Country,
    val rank: Int
)

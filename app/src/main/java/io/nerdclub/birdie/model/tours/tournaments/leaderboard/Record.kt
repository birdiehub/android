package io.nerdclub.birdie.model.tours.tournaments.leaderboard

import io.nerdclub.birdie.model.players.Player

data class Record(
    val id: Int,
    val player: Player,
    val rank: Int,
    val pointsTotal: Float
)

package io.nerdclub.birdie.model.worldrank

import io.nerdclub.birdie.model.players.Player

data class Leaderboard(
    val records: List<Player>
)

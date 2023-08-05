package io.nerdclub.birdie.model.tours.tournaments.leaderboard

import io.nerdclub.birdie.model.tours.tournaments.Tournament

data class Leaderboard(
    val tournament: Tournament,
    val records: List<Record>
)

package io.nerdclub.birdie.model.tours.tournaments

import io.nerdclub.birdie.model.courses.Course
import io.nerdclub.birdie.model.tours.Tour
import java.time.LocalDateTime
import java.time.Year

data class Tournament(
    val id: Int,
    val Tour: Tour,
    val name: String,
    val year: Year,
    val course: Course,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime
)

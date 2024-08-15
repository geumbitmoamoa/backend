package com.anys34.moamoa.dto.meet.request

import com.anys34.moamoa.domain.festival.Festival
import com.anys34.moamoa.domain.meet.Meet
import java.time.LocalDate

data class MeetRequest(
    val title: String,
    val spot: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val content: String,
    val purpose: String,
    val budget: Long,
    val profitPlan: String,
    val connect: String
) {
    fun toEntity()
    = Meet(
        title = title,
        spot = spot,
        startDate = startDate,
        endDate = endDate,
        content = content,
        purpose = purpose,
        budget = budget,
        profitPlan = profitPlan,
        connect = connect
    )
}
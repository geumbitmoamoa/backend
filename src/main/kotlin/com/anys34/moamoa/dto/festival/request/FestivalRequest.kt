package com.anys34.moamoa.dto.festival.request

import com.anys34.moamoa.domain.festival.Festival
import java.time.LocalDate

data class FestivalRequest(
    val title: String,
    val date: LocalDate,
    val content: String,
    val purpose: String,
    val budget: Long,
    val job: Long,
    val plan: String,
    val profitPlan: String,
    val connect: String,
    val name: String,
    val account: String,
    val sum: Long
) {
    fun toEntity()
    = Festival(
        title = title,
        date = date,
        content = content,
        purpose = purpose,
        budget = budget,
        job = job,
        plan = plan,
        profitPlan = profitPlan,
        connect = connect,
        name = name,
        account = account,
        sum = sum
    )
}
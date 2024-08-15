package com.anys34.moamoa.domain.meet

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Meet(
    title: String,
    spot: String,
    startDate: LocalDate,
    endDate: LocalDate,
    content: String,
    purpose: String,
    budget: Long,
    profitPlan: String,
    connect: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    var title: String = title
        protected set

    var spot: String = spot
        protected set

    var startDate: LocalDate = startDate
        protected set

    var endDate: LocalDate = endDate
        protected set

    var content: String = content
        protected set

    var purpose: String = purpose
        protected set

    var budget: Long = budget
        protected set

    var profitPlan: String = profitPlan
        protected set

    var connect: String = connect
        protected set

    val type: String = "meetings"
}

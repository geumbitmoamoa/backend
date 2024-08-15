package com.anys34.moamoa.domain.festival

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Festival(
    title: String,
    date: LocalDate,
    content: String,
    purpose: String,
    budget: Long,
    job: Long,
    plan: String,
    profitPlan: String,
    connect: String,
    name: String,
    account: String,
    sum: Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    var title: String = title
        protected set

    var date: LocalDate = date
        protected set

    var content: String = content
        protected set

    var purpose: String = purpose
        protected set

    var budget: Long = budget
        protected set

    var job: Long = job
        protected set

    var plan: String = plan
        protected set

    var profitPlan: String = profitPlan
        protected set

    var connect: String = connect
        protected set

    var name: String = name
        protected set

    var account: String = account
        protected set

    var sum: Long = sum
        protected set

    fun updateMoney(money: Long): Long {
        val temp = sum + money
        if (budget == sum) {
            return budget
        } else if (temp >= budget) {
            sum = budget
            return sum
        }
        sum = temp
        return sum
    }
}

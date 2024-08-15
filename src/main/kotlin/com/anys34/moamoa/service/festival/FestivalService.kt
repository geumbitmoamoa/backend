package com.anys34.moamoa.service.festival

import com.anys34.moamoa.domain.festival.Festival
import com.anys34.moamoa.domain.festival.FestivalRepository
import com.anys34.moamoa.dto.festival.request.FestivalRequest
import com.anys34.moamoa.dto.festival.request.FundingRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class FestivalService(
    val festivalRepository: FestivalRepository
) {
    @Transactional
    fun save(request: FestivalRequest)
        = festivalRepository.save(request.toEntity()).id

    @Transactional
    fun findById(id: Long)
        = festivalRepository.findById(id)

    @Transactional
    fun findAll(): List<Festival> = festivalRepository.findAll()

    @Transactional
    fun funding(request: FundingRequest): Long {
        val festival = festivalRepository.findByIdOrNull(request.contestId)
            ?: throw IllegalArgumentException()
        return festival.updateMoney(request.money)
    }
}
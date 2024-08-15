package com.anys34.moamoa.service.meet

import com.anys34.moamoa.domain.meet.Meet
import com.anys34.moamoa.domain.meet.MeetRepository
import com.anys34.moamoa.dto.meet.request.MeetRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MeetService(
    private val meetRepository: MeetRepository
) {
    @Transactional
    fun save(request: MeetRequest)
            = meetRepository.save(request.toEntity()).id

    @Transactional
    fun findById(id: Long)
            = meetRepository.findById(id)

    @Transactional
    fun findAll(): List<Meet> = meetRepository.findAll()
}
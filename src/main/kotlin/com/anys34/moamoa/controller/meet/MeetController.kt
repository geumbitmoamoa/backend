package com.anys34.moamoa.controller.meet

import com.anys34.moamoa.dto.meet.request.MeetRequest
import com.anys34.moamoa.service.meet.MeetService
import org.springframework.web.bind.annotation.*

@RequestMapping("/meet")
@RestController
class MeetController(
    private val meetService: MeetService
) {
    @PostMapping
    fun save(@RequestBody request: MeetRequest)
            = meetService.save(request)

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long)
            = meetService.findById(id)

    @GetMapping
    fun findAll()
            = meetService.findAll()
}
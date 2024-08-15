package com.anys34.moamoa.controller.festival

import com.anys34.moamoa.dto.festival.request.FestivalRequest
import com.anys34.moamoa.dto.festival.request.FundingRequest
import com.anys34.moamoa.service.festival.FestivalService
import org.springframework.web.bind.annotation.*

@RequestMapping("/festival")
@RestController
class FestivalController(
    private val festivalService: FestivalService
) {
    @PostMapping
    fun save(@RequestBody request: FestivalRequest)
        = festivalService.save(request)

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long)
        = festivalService.findById(id)

    @GetMapping
    fun findAll()
        = festivalService.findAll()

    @GetMapping("/money/{id}")
    fun getMoney(@PathVariable id: Long)
        = festivalService.getMoney(id)

    @PostMapping("/funding")
    fun funding(@RequestBody request: FundingRequest) = festivalService.funding(request)

    @GetMapping("/job/{id}")
    fun job(@PathVariable id: Long)
        = festivalService.job(id)
}
package com.sili.do_music.business.datasources.network.main.home


import com.sili.do_music.business.model.main.Vocal

data class GetVocalsResponse(
    val rows: List<Vocal>,
    val total: Int
)
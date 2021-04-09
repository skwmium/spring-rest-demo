package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @Value("\${app.serverName}")
    lateinit var serverName: String

    @GetMapping("/test")
    fun f(): String {
        return "$serverName:Ok"
    }
}
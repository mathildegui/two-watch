package com.gui.twowatch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
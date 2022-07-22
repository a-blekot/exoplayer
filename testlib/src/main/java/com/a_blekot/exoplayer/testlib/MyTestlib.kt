package com.a_blekot.exoplayer.testlib

import com.a_blekot.exoplayer.calculator.DummyCalculator

fun testCalculator() {
    DummyCalculator().minus(10, 3)
    DummyCalculator().plus(10, 3)
}
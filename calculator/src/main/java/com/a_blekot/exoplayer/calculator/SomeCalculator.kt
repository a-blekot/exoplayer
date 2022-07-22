package com.a_blekot.exoplayer.calculator

import android.util.Log

class DummyCalculator {
    fun plus(a: Int, b: Int, silently: Boolean = false) =
        (a + b).also {
            if (!silently) {
                Log.d("DummyCalculator", "plus($a, $b) = ${a + b})")
            }
        }

    fun minus(a: Int, b: Int, silently: Boolean = false) =
        (a - b).also {
            if (!silently) {
                Log.d("DummyCalculator", "minus($a, $b) = ${a - b})")
            }
        }
}
package com.example.pettestproject.kakaoTest

import android.support.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.screen.Screen.Companion.idle
import com.example.pettestproject.MainActivity
import org.junit.Rule
import org.junit.Test

class SecondTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)


    private val mainActivity = mainActivityScreen()

    @Test
    fun mainTestFirst() {
        mainActivity.lable.hasText("Hello Test!")
        mainActivity.buttonClear.click()
        mainActivity.lable.hasText("")
    }

    @Test
    fun mainTestSecond() {
        mainActivity.lable.hasText("Hello Test!")
        idle(5000L)
        mainActivity.buttonText.click()
        mainActivity.lable.hasText("Change your *** pussy")
    }
}
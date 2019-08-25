package com.example.pettestproject.kakaoTest


import com.agoda.kakao.screen.Screen.Companion.idle
import com.example.pettestproject.MainActivity
import org.junit.Rule
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestMainActivity {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)


    private val mainActivity = mainActivityScreen()

    @Test
    fun mainTest() {
        mainActivity.lable.hasText("Hello Test!")
        mainActivity.buttonText.click()
        mainActivity.lable.hasText("Change your *** pussy")
        mainActivity.buttonClear.click()
        mainActivity.lable.hasText("")
        idle(10000L)
    }
}
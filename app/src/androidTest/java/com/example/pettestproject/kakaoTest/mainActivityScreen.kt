package com.example.pettestproject.kakaoTest

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.pettestproject.R
import kotlinx.android.synthetic.main.activity_main.view.*

class mainActivityScreen : Screen<mainActivityScreen>() {

    val buttonText = KButton { withId(R.id.buttonChange) }
    val buttonClear = KButton { withId(R.id.buttonClear) }
    val lable = KTextView { withId(R.id.labelText) }


}
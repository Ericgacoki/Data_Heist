package com.ericg.dataheist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashOut()
    }

    private fun splashOut(){

        Handler().postDelayed({
            // do something here
        },300)
    }

}

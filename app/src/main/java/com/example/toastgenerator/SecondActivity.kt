package com.example.toastgenerator

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val toast: ArrayList<String> = arrayListOf(
            resources.getString(R.string.toast0),
            resources.getString(R.string.toast1),
            resources.getString(R.string.toast2),
            resources.getString(R.string.toast3),
            resources.getString(R.string.toast4),
            resources.getString(R.string.toast5),
            resources.getString(R.string.toast6),
            resources.getString(R.string.toast7),
            resources.getString(R.string.toast8),
            resources.getString(R.string.toast9),
            resources.getString(R.string.toast10),
            resources.getString(R.string.toast11),
            resources.getString(R.string.toast12),
            resources.getString(R.string.toast13),
            resources.getString(R.string.toast14),
            resources.getString(R.string.toast15),
            resources.getString(R.string.toast16),
            resources.getString(R.string.toast17),
            resources.getString(R.string.toast18),
            resources.getString(R.string.toast19),
            resources.getString(R.string.toast20),
            resources.getString(R.string.toast21),
            resources.getString(R.string.toast22),
            resources.getString(R.string.toast23),
            resources.getString(R.string.toast24),
            resources.getString(R.string.toast25),
            resources.getString(R.string.toast26),
            resources.getString(R.string.toast27),
            resources.getString(R.string.toast28),
            resources.getString(R.string.toast29),
            resources.getString(R.string.toast30)
        )

        var i : Int = 0




           btToast.setOnClickListener {
               var mediaPlayer = MediaPlayer.create(this, R.raw.clinking)
               mediaPlayer.start()
                var  random : Int =(i..(toast.size-1)).random()
                tvToast.text = toast[random]
                toast.add(i, toast[random])

                toast.remove(toast[random+1])

               i++
               if (i == toast.size  ) i = 0
               Log.d("MyLog",random.toString())
               Log.d("MyLog",toast[random])

        }

    }


}
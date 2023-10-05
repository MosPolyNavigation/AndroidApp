package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.mospolytechgid.R
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class AvtCorpus5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avt_corpus5)

        showText();

        var flag: Int = 1
        val button2: AppCompatButton = findViewById(R.id.button2)
        val bmtoil: AppCompatButton = findViewById(R.id.bmtoil)

        val btnCorpus: ImageButton = findViewById(R.id.btnCorpus)
        val btnPath: ImageButton = findViewById(R.id.btnPath)
        val btnSettings: ImageButton = findViewById(R.id.btnSettings)


        btnCorpus.setOnClickListener {
            intent = Intent(this, CampusActivity::class.java)
            startActivity(intent)
        }
        btnSettings.setOnClickListener {
            intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val btnFlor1: Button = findViewById(R.id.btn_flor_1)
        val btnFlor2: Button = findViewById(R.id.btn_flor_2)
        val btnFlor3: Button = findViewById(R.id.btn_flor_3)
        val btnFlor4: Button = findViewById(R.id.btn_flor_4)
        val btnFlor5: Button = findViewById(R.id.btn_flor_5)
        val btnFlor6: Button = findViewById(R.id.btn_flor_6)
        val btnFlor7: Button = findViewById(R.id.btn_flor_7)
        val btnFlor8: Button = findViewById(R.id.btn_flor_8)
        val btnFlor9: Button = findViewById(R.id.btn_flor_9)
        val imageView: ImageView = findViewById(R.id.ImageView)
//        btnFlor1.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 1
//        }
//        btnFlor2.setOnClickListener {
//            imageView.setImageResource(R.drawable.av_5_2_)
//            flag = 2
//        }
//        btnFlor3.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 3
//        }
//        btnFlor4.setOnClickListener {
//            imageView.setImageResource(R.drawable.av_5_4)
//            flag = 4
//        }
//        btnFlor5.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 5
//        }
//        btnFlor6.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 6
//        }
//        btnFlor7.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 7
//        }
//        btnFlor8.setOnClickListener {
//            imageView.setImageResource(R.drawable.map)
//            flag = 8
//        }
//        btnFlor9.setOnClickListener {
//            imageView.setImageResource(R.drawable.av_5_9_png)
//            flag = 9
//        }

//        button2.setOnClickListener {
//            if (flag == 1)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 2)
//                imageView.setImageResource(R.drawable.av_wtoil_5_2)
//            else if (flag == 3)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 4)
//                imageView.setImageResource(R.drawable.av_wtoil_5_4)
//            else if (flag == 5)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 6)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 7)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 8)
//                imageView.setImageResource(R.drawable.wtoil)
//            else if (flag == 9)
//                imageView.setImageResource(R.drawable.av_wtoil_5_9)
//        }

//        bmtoil.setOnClickListener {
//            if (flag == 1)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 2)
//                imageView.setImageResource(R.drawable.av_mtoil_5_2)
//            else if (flag == 3)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 4)
//                imageView.setImageResource(R.drawable.av_mtoil_5_4)
//            else if (flag == 5)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 6)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 7)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 8)
//                imageView.setImageResource(R.drawable.mtoil)
//            else if (flag == 9)
//                imageView.setImageResource(R.drawable.av_mtoil_5_9)
//        }
        val flor: ImageView = findViewById(R.id.ImageView)
        val btnZoomIn = findViewById<Button>(R.id.zoom_in_button)
        val btnZoomOut = findViewById<Button>(R.id.zoom_out_button)
        btnZoomIn.setOnClickListener {
            val scaleFactor = 1.1f
            val currentScaleX = flor.scaleX
            val currentScaleY = flor.scaleY
            flor.scaleX = currentScaleX * scaleFactor
            flor.scaleY = currentScaleY * scaleFactor
        }
        btnZoomOut.setOnClickListener {
            val scaleFactor = 0.9f
            val currentScaleX = flor.scaleX
            val currentScaleY = flor.scaleY
            flor.scaleX = currentScaleX * scaleFactor
            flor.scaleY = currentScaleY * scaleFactor
        }
    }

    fun readJson() {
        var json: String? = null

        try {
            val inputStream: InputStream = assets.open("first.json")
            json = inputStream.bufferedReader().use { it.readText() }

            var jsonarr = JSONArray(json)

            var s: String =
                jsonarr.getJSONObject(1006).getString("desc").toString() // погрешность - 26
            Toast.makeText(this, s, Toast.LENGTH_LONG).show()
            //json_text.text= json
        } catch (e: IOException) {

        }
    }

    fun clearFrom(view: View) {
        findViewById<EditText>(R.id.etRoomFrom).text.clear()
    }

    fun clearTo(view: View) {
        findViewById<EditText>(R.id.etRoomTo).text.clear()
    }

    fun showText() {
        val showButton: ImageButton = findViewById(R.id.btnShowText)
        showButton.setOnClickListener {
            val editText1 = findViewById<EditText>(R.id.etRoomFrom)
            val editText2 = findViewById<EditText>(R.id.etRoomTo)
            val text1 = editText1.text
            val text2 = editText2.text
            val text = editText2.text
            editText2.text = editText1.text
            editText1.text = text
        }
    }

}
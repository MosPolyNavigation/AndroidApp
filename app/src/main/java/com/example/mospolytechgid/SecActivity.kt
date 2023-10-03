package com.example.mospolytechgid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        ShowText();

        var flagg: Int = 1
        val button2: AppCompatButton = findViewById(R.id.button2)
        val bmtoil: AppCompatButton = findViewById(R.id.bmtoil)

        val btnCorpus: ImageButton =  findViewById(R.id.btnCorpus)
        val btnPath: ImageButton =  findViewById(R.id.btnPath)
        val btnSettings: ImageButton =  findViewById(R.id.btnSettings)


        btnCorpus.setOnClickListener {
            intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        /*btnPath.setOnClickListener {
            intent  = Intent(this, SecActivity::class.java)
            startActivity(intent)
            //TODO() сейчас она бесполезна, но по идее можно сделать так чтобы при нажатии выдвигалась вверх менюшка
        }*/
        btnSettings.setOnClickListener {
            intent  = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        /*val button9: Button =  findViewById(R.id.button9)
        button9.setOnClickListener {
            read_json();
        }*/

        //Я запрещаю это трогать
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
        btnFlor1.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 1
        }
        btnFlor2.setOnClickListener {
            imageView.setImageResource(R.drawable.av_5_2_)
            flagg = 2
        }
        btnFlor3.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 3
        }
        btnFlor4.setOnClickListener {
            imageView.setImageResource(R.drawable.av_5_4)
            flagg = 4
        }
        btnFlor5.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 5
        }
        btnFlor6.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 6
        }
        btnFlor7.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 7
        }
        btnFlor8.setOnClickListener {
            imageView.setImageResource(R.drawable.map)
            flagg = 8
        }
        btnFlor9.setOnClickListener {
            imageView.setImageResource(R.drawable.av_5_9_png)
            flagg = 9
        }

        //Можно трогать

        button2.setOnClickListener {
            if (flagg == 1)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 2)
                imageView.setImageResource(R.drawable.av_wtoil_5_2)
            else if (flagg == 3)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 4)
                imageView.setImageResource(R.drawable.av_wtoil_5_4)
            else if (flagg == 5)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 6)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 7)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 8)
                imageView.setImageResource(R.drawable.wtoil)
            else if (flagg == 9)
                imageView.setImageResource(R.drawable.av_wtoil_5_9)
        }

        bmtoil.setOnClickListener {
            if (flagg == 1)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 2)
                imageView.setImageResource(R.drawable.av_mtoil_5_2)
            else if (flagg == 3)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 4)
                imageView.setImageResource(R.drawable.av_mtoil_5_4)
            else if (flagg == 5)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 6)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 7)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 8)
                imageView.setImageResource(R.drawable.mtoil)
            else if (flagg == 9)
                imageView.setImageResource(R.drawable.av_mtoil_5_9)
        }
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

    fun read_json(){
        var json:String? =null

        try {
            val inputStream: InputStream = assets.open("first.json")
            json = inputStream.bufferedReader().use{it.readText()}

            var jsonarr = JSONArray(json)

            var s:String =jsonarr.getJSONObject(1006).getString("desc").toString() // погрешность - 26
            Toast.makeText(this, s, Toast.LENGTH_LONG).show()
            //json_text.text= json
        }
        catch(e: IOException){

        }
    }

    fun clearFrom(view: View) {
        findViewById<EditText>(R.id.etRoomFrom).text.clear()
    }

    fun clearTo(view: View) {
        findViewById<EditText>(R.id.etRoomTo).text.clear()
    }


    fun ShowText() {
        val showButton: ImageButton =  findViewById(R.id.btnShowText)
        showButton.setOnClickListener {
            val editText1 = findViewById<EditText>(R.id.etRoomFrom)
            val editText2 = findViewById<EditText>(R.id.etRoomTo)
            val text1 = editText1.text
            //Toast.makeText(this, text1, Toast.LENGTH_SHORT).show()
            val text2 = editText2.text
            //Toast.makeText(this, text2, Toast.LENGTH_SHORT).show()
            val text = editText2.text
            editText2.text = editText1.text
            editText1.text = text
        }
    }

}
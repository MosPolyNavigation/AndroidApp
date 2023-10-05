package com.example.mospolytechgid.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class AvtCorpusListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avt_corpus_list)

        /*val btn_Avt1: Button = findViewById(R.id.btn_Avt1)
        btn_Avt1.setOnClickListener {

            intent = Intent(this, SecActivity::class.java)
            startActivity(intent)
        }

        val btn_Avt2: Button = findViewById(R.id.btn_Avt2)
        btn_Avt2.setOnClickListener {

            intent = Intent(this, SecActivity::class.java)
            startActivity(intent)
        }

        val btn_Avt3: Button = findViewById(R.id.btn_Avt3)
        btn_Avt3.setOnClickListener {

            intent = Intent(this, SecActivity::class.java)
            startActivity(intent)
        }

        val btn_Avt4: Button = findViewById(R.id.btn_Avt4)
        btn_Avt4.setOnClickListener {

            intent = Intent(this, SecActivity::class.java)
            startActivity(intent)
        }*/

        val btn_Avt5: Button = findViewById(R.id.btn_Avt5)
        btn_Avt5.setOnClickListener {

            intent = Intent(this, AvtCorpus5Activity::class.java)
            startActivity(intent)
        }

        /*val btn_Avt6: Button = findViewById(R.id.btn_Avt6)
        btn_Avt6.setOnClickListener {

            intent = Intent(this, SecActivity::class.java)
            startActivity(intent)
        }*/


        val btnSettings: ImageButton = findViewById(R.id.btnSettings)
        btnSettings.setOnClickListener {
            intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }


        val btnCorpus: ImageButton = findViewById(R.id.btnCorpus)
        btnCorpus.setOnClickListener {
            intent = Intent(this, CampusActivity::class.java)
            startActivity(intent)
        }
    }
}
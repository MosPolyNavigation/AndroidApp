package com.example.mospolytechgid.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class CampusActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campus)

//        model = CampusModel()

//автаз
        val btn_Avt: Button = findViewById(R.id.btn_Avt)
        btn_Avt.setOnClickListener {

            intent = Intent(this, AvtCorpusListActivity::class.java)
            startActivity(intent)
        }
//БС
        val btn_Sem: Button = findViewById(R.id.btn_Sem)
        btn_Sem.setOnClickListener {
            intent = Intent(this, WebViewActivity::class.java)
//            intent = Intent(this, BSCorpusListActivity::class.java)
            startActivity(intent)
        }
//ПК
        val btn_Pvl: Button = findViewById(R.id.btn_Pvl)
        btn_Pvl.setOnClickListener {
            intent = Intent(this, PKCorpusListActivity::class.java)
            startActivity(intent)
        }
//михалковская
        val btn_Mih: Button = findViewById(R.id.btn_Mih)
        btn_Mih.setOnClickListener {

            intent = Intent(this, MikhCorpusListActivity::class.java)
            startActivity(intent)
        }
//пряники
        val btn_Pray: Button = findViewById(R.id.btn_Pray)
        btn_Pray.setOnClickListener {

            intent = Intent(this, PrCorpusListActivity::class.java)
            startActivity(intent)
        }
//настройки
        val btnSettings: ImageButton = findViewById(R.id.btnSettings)
        btnSettings.setOnClickListener {
            intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        //нажата кнопка назад
    }
    //денис был здесь!
}
package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class BSCorpusListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bs_corpus_list)
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
package com.example.mospolytechgid

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class SettingsActivity : AppCompatActivity(){
    @SuppressLint("MissingInflatedId", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_MospolytechGid)
        } else {
            setTheme(R.style.Theme_MospolytechGid)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        /*val btn = findViewById<Switch>(R.id.switch1)
        btn.setOnCheckedChangeListener { _, isChecked ->
            if (btn.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                //btn.text = "Темный режим включен"
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                //btn.text = "Темный режим выключен"
            }
        }*/




    }
}
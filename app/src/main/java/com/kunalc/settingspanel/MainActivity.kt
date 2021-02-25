package com.kunalc.settingspanel

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Shows Settings Panel for Volume
        btnVolume.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_VOLUME)
            startActivityForResult(panelIntent, 1)
        }

        // Shows Settings Panel for NFC
        btnNfc.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_NFC)
            startActivityForResult(panelIntent, 2)
        }

        // Shows Settings Panel for Internet Connectivity
        btnNetwork.setOnClickListener {
            startActivity(Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY))
        }

        // Shows Settings Panel for WiFi
        btnWiFi.setOnClickListener {
            startActivity(Intent(Settings.Panel.ACTION_WIFI))
        }
    }
}
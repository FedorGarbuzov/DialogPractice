package ru.surftudio.dialog_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.show_dialog_btn)

        button.setOnClickListener {
            HelloDialogFragment().show(supportFragmentManager, "ru.surftudio.dialog_practice.HelloDialogFragment")
        }
    }
}
package com.example.ejercicio2prueba2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_event)

        supportActionBar?.title = getString(R.string.register_event)

        val etName: EditText = findViewById(R.id.etEventName)
        val etDescription: EditText = findViewById(R.id.etEventDescription)
        val etPrice: EditText = findViewById(R.id.etEventPrice)
        val etDate: EditText = findViewById(R.id.etEventDate)
        val etPass: EditText = findViewById(R.id.etEventPass)
        val etDireccion: EditText = findViewById(R.id.etEventDireccion)
        val btnSave: Button = findViewById(R.id.btnSaveEvent)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val description = etDescription.text.toString()
            val price = etPrice.text.toString()
            val date = etDate.text.toString()
            val pass = etPass.text.toString()
            val direccion = etDireccion.text.toString()

            if (name.isEmpty() || description.isEmpty() || price.isEmpty() || date.isEmpty() || pass.isEmpty() || direccion.isEmpty()) {
                Toast.makeText(this, "Por favor, rellena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val event = Evento(name, description, price.toDoubleOrNull() ?: 0.0, date, pass.toIntOrNull() ?: 0, direccion)

                val intent = Intent()
                intent.putExtra("event", event)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
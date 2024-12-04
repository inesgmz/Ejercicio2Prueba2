package com.example.ejercicio2prueba2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val events = mutableListOf<Evento>()
    private lateinit var adapter: EventAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Eventos"

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewEvents)
        val btnAddEvent: Button = findViewById(R.id.btnAddEvent)

        adapter = EventAdapter(events)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnAddEvent.setOnClickListener {
            val intent = Intent(this, RegisterEventActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            val event = data?.getSerializableExtra("event") as? Evento
            if (event != null) {
                events.add(event)
                adapter.notifyDataSetChanged()
            }
        }
    }
}
package com.example.ejercicio2prueba2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventAdapter(private val events: List<Evento>) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    class EventViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNombre: TextView = view.findViewById(R.id.tvNombreEvento)
        val tvDescripcion: TextView = view.findViewById(R.id.tvDescripcionEvento)
        val tvPrecio: TextView = view.findViewById(R.id.tvPrecioEvento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = events[position]
        holder.tvNombre.text = event.name
        holder.tvDescripcion.text = event.description
        holder.tvPrecio.text = if (event.price == 0.0) "Gratis" else "€${event.price}"
    }

    override fun getItemCount(): Int = events.size
}
# Ejercicio2Prueba2

Este proyecto es una aplicación de Android para gestionar eventos. Los usuarios pueden agregar nuevos eventos y verlos en una lista. La aplicación está construida usando Kotlin y RecyclerView de Android para mostrar la lista de eventos.

## Estructura del Proyecto

### MainActivity

`MainActivity` es el punto de entrada principal de la aplicación. Inicializa el RecyclerView y configura el botón para agregar nuevos eventos.

- **onCreate**: Inicializa el RecyclerView y configura el listener del botón para iniciar `RegisterEventActivity`.
- **onActivityResult**: Maneja el resultado de `RegisterEventActivity` y actualiza la lista de eventos.

### RegisterEventActivity

`RegisterEventActivity` es responsable de registrar nuevos eventos. Recoge los detalles del evento del usuario y devuelve el resultado a `MainActivity`.

- **onCreate**: Configura los elementos de la interfaz de usuario y el listener del botón de guardar.
- **btnSave.setOnClickListener**: Recoge los datos de entrada, crea un objeto `Evento` y lo devuelve a `MainActivity`.

### EventAdapter

`EventAdapter` es un adaptador de RecyclerView que enlaza los datos del evento con las vistas en la lista.

- **onCreateViewHolder**: Infla el diseño del elemento y crea un `EventViewHolder`.
- **onBindViewHolder**: Enlaza los datos del evento con las vistas.
- **getItemCount**: Devuelve el número total de eventos.

### EventAdapter.EventViewHolder

`EventViewHolder` contiene las vistas para cada elemento de evento en el RecyclerView.

- **tvNombre**: TextView para el nombre del evento.
- **tvDescripcion**: TextView para la descripción del evento.
- **tvPrecio**: TextView para el precio del evento.

### Evento

`Evento` es una clase de datos que representa un evento.

- **name**: El nombre del evento.
- **description**: La descripción del evento.
- **price**: El precio del evento.
- **date**: La fecha del evento.
- **pass**: El código de acceso para el evento.
- **direccion**: La dirección del evento.
- **isFree**: Devuelve true si el evento es gratuito (precio es 0.0).

## Archivos de Diseño

### activity_main.xml

Define el diseño para `MainActivity`, incluyendo el RecyclerView y el botón para agregar nuevos eventos.

### activity_register_event.xml

Define el diseño para `RegisterEventActivity`, incluyendo EditTexts para los detalles del evento y un botón de guardar.

### item_event.xml

Define el diseño para cada elemento de evento en el RecyclerView.

URL: https://github.com/inesgmz/Ejercicio2Prueba2.git

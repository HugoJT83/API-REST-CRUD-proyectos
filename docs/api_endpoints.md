# API ENDPOINTs del proyecto

---

**GET /api/tareas** - Lista las tareas de la BD

* URL: "/", "listado.html"
    * Respuesta: 200 OK
    * Body: Array de objetos en formato JSON de tipo TareaDTO

* Ejemplo de respuesta:

```json
[
    {
        "id_tarea": 1,
        "titulo": "Actualizar kernel",
        "descripcion": "holaaaaaajkghjghjh",
        "estado": "POR_HACER",
        "fecha_creacion": "2026-03-01T08:00:00",
        "fecha_fin": "2026-03-01T10:00:00",
        "ultima_mod": "2026-03-11T09:08:47.737195"
    },
    {
        "id_tarea": 2,
        "titulo": "Crear índices",
        "descripcion": "Optimización de tablafghfgh transacciones",
        "estado": "POR_HACER",
        "fecha_creacion": "2026-03-01T09:00:00",
        "fecha_fin": "1970-01-07T00:00:00",
        "ultima_mod": "2026-03-11T09:08:12.439172"
    }
]
```

**GET /api/tareas/{idTarea}** - Obtiene los datos de una tarea concreta

* URL:"/listado.html","/form.html?id=${idTarea}"
    * Respuesta: 200 OK
    * Body: Elemento JSON de tipo TareaDTO

* Ejemplo de respuesta:

```json
    {
        "id_tarea": 2,
        "titulo": "Crear índices",
        "descripcion": "Optimización de tablafghfgh transacciones",
        "estado": "POR_HACER",
        "fecha_creacion": "2026-03-01T09:00:00",
        "fecha_fin": "1970-01-07T00:00:00",
        "ultima_mod": "2026-03-11T09:08:12.439172"
    }
```

**POST /api/tareas** - Introduce una instancia de tarea en la BD

* URL:"/form_new.html"
    * Respuesta: 200 OK
    * Body: Elemento JSON de tipo TareaDTO

* Ejemplo de respuesta: 

```json
{
    "id_tarea": 52,
    "titulo": "Cosas",
    "descripcion": "Optimización de transacciones",
    "estado": "POR_HACER",
    "fecha_creacion": "2026-12-12T09:00:00",
    "fecha_fin": "2026-12-12T00:00:00",
    "ultima_mod": "2026-03-11T11:30:04.3393611"
}
```

**PUT /api/tareas/{idTarea}** - Actualiza los datos de una tarea en la BD

* URL:"/form.html?id=${idTarea}"
    * Respuesta: 200 OK
    * Body: Elemento JSON de tipo TareaDTO

* Ejemplo de respuesta: 

```json
{
    "id_tarea": 52,
    "titulo": "Cosas",
    "descripcion": "Optimización de transacciones",
    "estado": "POR_HACER",
    "fecha_creacion": "2026-12-12T09:00:00",
    "fecha_fin": "2026-12-12T00:00:00",
    "ultima_mod": "2026-03-11T11:30:04.3393611"
}
```

**PATCH /api/tareas/{idTarea}/{campo}** - Modifica un campo de una de las tareas de la BD; este también actualiza obligatoriamente el campo "ultima modificacion"

* URL:"/listado.html"
    * Respuesta: 200 OK
    * Body: valor nuevo a modificar

* Ejemplo de respuesta: 
```json
{
    "id_tarea": 52,
    "titulo": "Cosas",
    "descripcion": "Optimización de transacciones",
    "estado": "POR_HACER",
    "fecha_creacion": "2026-12-12T09:00:00",
    "fecha_fin": "2026-12-12T00:00:00",
    "ultima_mod": "2026-03-11T11:30:04.3393611"
}
```


**DELETE /api/tareas/{idTarea}** - Borra una tarea de la BD


* URL:"/listado.html"
    * Respuesta: 200 OK
    * Body: valor nuevo a modificar

* Ejemplo de respuesta: "Tarea borrada correctamente"

---

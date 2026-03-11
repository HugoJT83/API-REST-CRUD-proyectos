TODO

# SCHEMA del proyecto

---

### Tabla principal

```sql
CREATE TABLE `tareas` (
   `id_tarea` int NOT NULL AUTO_INCREMENT,
   `titulo` varchar(45) NOT NULL,
   `descripcion` varchar(200) NOT NULL,
   `estado` enum('POR_HACER','HECHO') NOT NULL,
   `fecha_creacion` datetime NOT NULL,
   `fecha_fin` datetime NOT NULL,
   `ultima_mod` datetime NOT NULL,
   PRIMARY KEY (`id_tarea`),
   UNIQUE KEY `id_tarea_UNIQUE` (`id_tarea`)
 ) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


---

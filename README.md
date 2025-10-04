# Compose Carreras App

Aplicación Android desarrollada en Kotlin utilizando Jetpack Compose, que muestra un catálogo de carreras y sus materias. La app implementa navegación entre pantallas con Jetpack Navigation Compose y utiliza un ViewModel para manejar el estado y los datos.

---

## Descripción

La app consta de tres pantallas principales:

- **CarrerasListScreen**: Muestra una lista de carreras disponibles.
- **CarreraDetailScreen**: Al seleccionar una carrera, muestra las materias asociadas.
- **MateriaDetailScreen**: Al seleccionar una materia, muestra su detalle completo.

El flujo de navegación es:  
`CarrerasListScreen → CarreraDetailScreen → MateriaDetailScreen`

---

## Arquitectura y componentes

- **MainActivity**: Punto de entrada, inicia la app con ComposeCarrerasApp.
- **ComposeCarrerasApp**: Configura el tema y la navegación.
- **AppNavHost**: Controla las rutas y pantallas dentro de la app.
- **CarrerasViewModel**: Mantiene el estado de las carreras y materias, y provee funciones para acceder a datos, como buscar una materia por código.
- **Datos iniciales**: Se utilizan datos de prueba (`sampleCarreras`), un `Map<String, List<Materia>>` que contiene las carreras y sus materias.

---

## Modelo de datos

```kotlin
data class Materia(
    val nombre: String,
    val uvs: Int,
    val codigo: String,
    val descripcion: String,
    val temas: List<String>
)

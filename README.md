# Compose Carreras App

Aplicación Android desarrollada en Kotlin utilizando Jetpack Compose, que muestra un catálogo de carreras y sus materias. La app implementa navegación entre pantallas con Jetpack Navigation Compose y utiliza un ViewModel para manejar el estado y los datos.

Realizada : 04.10.2025 , version : 
- **Android Studio Meerkat Feature Drop | 2024.3.2 Patch 1.
- **Build #AI-243.26053.27.2432.13536105, built on May 22, 2025.
- **Runtime version: 21.0.6+-13368085-b895.109 amd64.
- **VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
- **Toolkit: sun.awt.windows.WToolkit.
- **Windows 11.0.
- **Kotlin plugin: K2 mode.
- **GC: G1 Young Generation, G1 Concurrent GC, G1 Old Generation.
- **Memory: 2048M.
- **Cores: 20.
- **Registry:ide.experimental.ui=true.


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

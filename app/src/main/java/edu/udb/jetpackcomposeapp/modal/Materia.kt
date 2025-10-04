package edu.udb.jetpackcomposeapp.modal

data class Materia(
    val nombre: String,
    val uvs: Int,
    val codigo: String,
    val descripcion: String,
    val temas: List<String>
)
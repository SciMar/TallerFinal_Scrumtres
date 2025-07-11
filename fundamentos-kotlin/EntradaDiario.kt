import java.time.LocalDate

// ✅ Clase de datos
data class EntradaDiario(
    val titulo: String,
    val contenido: String,
    val fecha: LocalDate
)
//arriba ya
// ✅ Lista de ejemplo
val listaEntradas = listOf(
    EntradaDiario("Viaje", "Hoy fuimos a la montaña", LocalDate.of(2025, 7, 10)),
    EntradaDiario("Escuela", "Clase de Kotlin", LocalDate.of(2025, 7, 11)),
    EntradaDiario("Deportes", "Jugamos fútbol", LocalDate.of(2025, 7, 11))
)

// ✅ Búsquedas con lambdas
fun buscarPorTitulo(titulo: String): List<EntradaDiario> {
    return listaEntradas.filter { it.titulo.contains(titulo, ignoreCase = true) }
}

fun buscarPorFecha(fecha: LocalDate): List<EntradaDiario> {
    return listaEntradas.filter { it.fecha == fecha }
}

// ✅ Funciones de extensión
fun LocalDate.formatoBonito(): String {
    return this.toString().replace("-", "/")
}

fun String.previsualizar(): String {
    return if (this.length > 20) this.take(20) + "..." else this
}

// ✅ Simulación de mini-menú en consola
fun main() {
    println("=== Mi Diario Digital ===")
    println("1. Ver todas las entradas")
    println("2. Buscar por título")
    println("3. Buscar por fecha")

    val opcion = 1  // Cambia a 2 o 3 para probar

    when (opcion) {
        1 -> {
            println("\n--- Todas las entradas ---")
            listaEntradas.forEach {
                println("• ${it.titulo} (${it.fecha.formatoBonito()}): ${it.contenido.previsualizar()}")
            }
        }
        2 -> {
            val resultados = buscarPorTitulo("viaje")
            println("\n--- Resultados de búsqueda por título ---")
            resultados.forEach {
                println("✓ ${it.titulo}: ${it.contenido.previsualizar()}")
            }

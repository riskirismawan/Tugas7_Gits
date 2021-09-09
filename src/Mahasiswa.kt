class Mahasiswa(_name: String, _university: String, _msib_program: String = "Kotlin") {
    val name = _name
    val university = _university
    val msib_program = _msib_program

    fun tampil() {
        println("Nama\t\t: $name")
        println("Universitas : $university")
        println("Program \t: $msib_program\n")
    }
}
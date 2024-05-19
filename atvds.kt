
fun CountWords(Lista: List<String>, Palavra: String): Int {
    return Lista.count { it == Palavra }
}

fun AddPares(Lista: List<Int>): Int {
    return Lista.filter{ it % 2 == 0 }.sum()
}
fun PareImpar(Lista: List<Int>): String {
    val Par = Lista.filter { it % 2 == 0 }
    val Impa = Lista.filter { it % 2 != 0 }
    return "Lista de Numero Pares ${Par} \nLista de Numero Impares ${Impa}"
}
fun CheckPass(Pass: String): String {
    if (Pass.length < 8) return "Senha tem nem 8 digitos,vai ser hackeado facil"
    var Maiuscula = false
    var Minuscula = false
    var Digito = false

    for (Caractere in Pass) {
        when {
            Caractere.isUpperCase() -> Maiuscula = true
            Caractere.isLowerCase() -> Minuscula = true
            Caractere.isDigit() -> Digito = true
        }
    }
    if(Maiuscula && Minuscula && Digito) return "Senha liberada with SUCESS mai Friend"
    else return "Burro , tem que ter Letra with caps and without caps e numeros"
}
fun BigWords(Lista: List<String> , Tamanho : Int): List<String> {
    return Lista.filter { it.length > Tamanho }
}
fun Descnto(Value: Double): String {
    return if (Value > 100) "Obteve o desconto de ${Value * 0.10}" else  "NÃO Obteve desconto VALOR : ${Value }"
}
fun IMC(Peso: Double, Altura: Double): String {
    return "IMC = ${Peso / (Altura * Altura)}"
}
fun ContadorDePalavras(Frase: String): Int {
    return Frase.split("\\s+".toRegex()).size
}
fun AnoBi(Ano: Int): String {
    if(Ano % 4 == 0 && Ano % 100 != 0)
    return "Ano é Bi"
    else return "Ano é hetero"

}
fun TabuadaDo3ouDo5(Lista: List<Int>): Int {
    return Lista.filter { it % 3 == 0 || it % 5 == 0 }.sum()
}
fun Inversor(Numero: Int): Int {
    return Numero.toString().reversed().toInt()
}
fun main() {
    //COMEÇANDO A ATIVIDADE DO PAULISTA
    println(AddPares(arrayListOf(1,2,4,1,3,9,11,12)))
    println(CountWords(arrayListOf("buceta", "preto","gay","viado","viado"), "viado" ))
    println(CheckPass("SouGay123"))
    println(BigWords(arrayListOf("buceta", "preto","gay","viado","viado") , 4))
    println(Descnto(100.0))
    println(IMC(100.0 , 1.80))
    println(PareImpar(arrayListOf(1,2,4,1,3,9,11,12)))
    println(ContadorDePalavras("Jose Paulo Eh Viadao"))
    println(AnoBi(2024))
    println(Inversor(2024))
    println(TabuadaDo3ouDo5(arrayListOf(3,5,10,1,15)))
}

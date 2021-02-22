fun main(){
    var month : Int? = null
    var a = 5
    var b = 2

    println(month)
    // Operadores
    println("--------------------Adição-----------------------")
    a = a + b
    println("Valor de a = a + b  " + a)
    a +=b
    println("Valor de a + = b  " + a)
    a.plus(b)
    println("Valor de a.plus(b)  " + a)
    println("--------------------Subtração--------------------")
    a = a - b
    println("Valor de a = a - b  " + a)
    a -=b
    println("Valor de a - = b  " + a)
    a.minus(b)
    println("Valor de a.minus(b)  " + a)
    println("--------------------Multiplicação-----------------")
    a = a*b
    println("Valor de a = a*b  " + a)
    a *=b
    println("Valor de a *=b  " + a)
    a.times(b)
    println("Valor de a.times(b)  " + a)
    println("--------------------Divisão------------------------")
    a = a/b
    println("Valor de a = a/b  "+  a)
    a /= b
    println("Valor de a /= b  " + a)
    a.div(b)
    println("Valor de a.div(b)  " + a)
}
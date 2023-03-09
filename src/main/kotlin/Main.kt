fun main(){
greet()
numbers()
    string()
//var math = calculator(4,7,2,5,9)

}
fun greet():String{
    var greeting = "Hello there"
    var greet1 = greeting[0]
    println(greet1)
    return greeting
}
fun numbers():Array<Int>{
    var num = arrayOf(9,12,3,7,2)
    var num1 = num.min()
    println(num1)
    var num2 = num.max()
    println(num2)
    var num3 = num.average()
    println(num3)
    return num
}
fun string():String{
    var word = "chair"
    println(word[0])
    println(word[1])
    println(word[2])
    println(word[3])
    println(word[4])
    return word
}
fun stmt():Array<String>{
    var statement = arrayOf("I","love","pets")
    return statement
}
class calculator(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int){
    var math = calculator(4,2,3,7,5)
}
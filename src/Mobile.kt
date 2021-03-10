fun main() {
    name("akirachix")
    var sentence = T("Chantal", "30")
    println(sentence)
    var N = Lastname("Chantal")
    println(N)
    P("Chantal")
    P("Emma")

}
fun name(fname:String) {
    print(fname[0])
    print(fname[2])
    println(fname[3])
}
fun T(x:String,y:String):String{
    var sentence="Hi, My name is $x and I am $y years old."
    return sentence
}
fun Lastname(lname:String):Int{
    var N=lname.length
    return N
}
fun P(name:String){
    if (name=="Chantal"){
        println("that's me!")
    } else {
        println("I don't know who that is")
    }
}
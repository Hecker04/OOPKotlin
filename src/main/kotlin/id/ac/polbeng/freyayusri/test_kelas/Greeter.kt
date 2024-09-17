package id.ac.polbeng.freyayusri.test_kelas

class Greeter {
    var text: String = ""
    fun greet(){
        println("hai mantull")
    }
 fun greet(name: String){
     println("$text $name")
 }
    fun with_ret_val(name: String):String{
        return "$text$name"
    }
}
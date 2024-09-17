package id.ac.polbeng.freyayusri.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text ="hi"
    greeter.greet("anton")
    greeter.greet("budi")
    greeter.text="hello minna"
    println(greeter.with_ret_val("dono"))
}
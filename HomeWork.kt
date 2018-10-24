

class HomeWork(){

    var score = 4// some score
    var grade = when (score) {
        9, 10 -> "Excellent"
        in 6..8 -> "Good"
        4, 5 -> "OK"
        in 1..3 -> "Fail"
        else -> "Fail"
    }

    val listOfNumber = listOf(1, 2, 3, 4)
    val keyValue = mapOf(1 to "Amit",
            2 to "Ali",
            3 to "Mindorks")

    fun sum1(listOfNumber: Number){

    }
}
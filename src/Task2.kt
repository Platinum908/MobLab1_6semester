//11.54. Дан массив. Найти:
//а) сумму элементов массива, значение которых не превышает 20;
//б) сумму элементов массива, больших числа a.
fun main() {
    val arr = intArrayOf(5, 25, 18, 30, 20, 7, 40, 12)

    var sumA = 0
    for (i in 0 until arr.size) {
        if (arr[i] <= 20) {
            sumA += arr[i]
        }
    }
    println("Сумма элементов, не превышающих 20: $sumA")

    println("Введите число a:")
    val a = readLine()!!.toInt()

    var sumB = 0
    for (i in 0 until arr.size) {
        if (arr[i] > a) {
            sumB += arr[i]
        }
    }
    println("Сумма элементов, больших $a: $sumB")
}
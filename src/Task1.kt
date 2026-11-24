//12.51. Дан двумерный массив. Определить:
//а) среднее арифметическое элементов n-го столбца массива;
//б) среднее арифметическое элементов первой строки массива.
fun main() {
    val arr = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )

    println("Введите номер столбца:")
    val n = readLine()!!.toInt()

    var sumColumn = 0
    for (i in 0 until arr.size) {
        sumColumn += arr[i][n - 1]
    }
    val avgColumn = sumColumn.toDouble() / arr.size
    println("Среднее арифметическое столбца: $avgColumn")

    var sumFirstRow = 0
    for (j in 0 until arr[0].size) {
        sumFirstRow += arr[0][j]
    }
    val avgRow = sumFirstRow.toDouble() / arr[0].size
    println("Среднее арифметическое первой строки: $avgRow")
}
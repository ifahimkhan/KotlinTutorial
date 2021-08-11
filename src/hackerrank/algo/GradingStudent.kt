package hackerrank.algo

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */
/*HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
*/
fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    // grades.set(1, 70)
    // print(grades.joinToString("\n"))
    val roundedGrades: Array<Int> = Array<Int>(grades.size) { 0 }
    var count = 0;
    var diff = 0;
    var sum = 0;
    for (i in grades.indices) {
        if (grades.get(i) >= 40) {
            if (grades.get(i) % 5 == 0) {
                roundedGrades.set(count++, grades.get(i))
            } else {
                diff = grades.get(i) % 5 - 5
                diff = Math.abs(diff)
                if (diff < 3) {
                    sum = grades.get(i) + diff
                    roundedGrades.set(count++, sum)
                } else {
                    roundedGrades.set(count++, grades.get(i))
                }
            }
        } else {
            diff = grades.get(i) % 5 - 5
            diff = Math.abs(diff)
            sum = diff + grades.get(i)
            if (sum >= 40 && diff < 3) {
                roundedGrades.set(count++, sum)
            } else {
                roundedGrades.set(count++, grades.get(i))
            }
        }
    }
    return roundedGrades;

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}

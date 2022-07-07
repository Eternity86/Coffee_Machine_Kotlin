enum class DaysOfTheWeek {
    // write here
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main() {
    // write here
    for (e in DaysOfTheWeek.values()) {
        println(e.name)
    }
}
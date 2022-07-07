fun main() {
    // put your code here
    val (country1, country2) = readln().split(" ")

    if (findCountry(country1) == Country.NULL || findCountry(country2) == Country.NULL) {
        println(false)
        return
    }
    println(Country.valueOf(country1.uppercase()).currency == Country.valueOf(country2.uppercase()).currency)

}

fun findCountry(country: String): Country {
    for (enum in Country.values()) {
        if (country == enum.country) return enum
    }
    return Country.NULL
}

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");
}
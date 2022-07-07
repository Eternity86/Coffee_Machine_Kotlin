// write your class here
class LewisCarrollBook {
    var name = ""
        set(value) {
            field = value
            println("Now, a book called $value")
        }
        get() {
            println("The name of the book is $field")
            return field
        }
    var author = "Lewis Carroll"
        get() {
            println("The author of the book is $field")
            return field
        }
    var price = 0
        set(value) {
            println("Putting a new price...")
            field = value
            println("The new price is $field")
        }
}

fun f(x: Double): Double {
    // call your implemented functions here
    when {
        x <= 0 -> return f1(x)
        x > 0 && x < 1 -> return f2(x)
    }
    return f3(x)
}

// implement your functions here
fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1 / (x * x)
}

fun f3(x: Double): Double {
    return x * x - 1
}
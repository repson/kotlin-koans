fun foo(
	name: String,
	number: Int = 42,
	toUpperCase: Boolean = false
): String {
	if (toUpperCase) {
		return name.uppercase() + number
	} else {
		return name + number
	}
}

fun useFoo() = listOf(
    foo("a"),
	foo("b", number = 1),
	foo("c", toUpperCase = true),
	foo(name = "d", number = 2, toUpperCase = true)
)

fun Int.r(): RationalNumber {
	return RationalNumber(this, 1)
}

fun Pair<Int, Int>.r(): RationalNumber {
	return RationalNumber(this.first, this.second)
}

data class RationalNumber(val numerator: Int, val denominator: Int)

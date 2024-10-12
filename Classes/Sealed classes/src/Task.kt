sealed interface Expr
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
        }

data class Num(val value: Int) : Expr
data class Sum(val left: Expr, val right: Expr) : Expr
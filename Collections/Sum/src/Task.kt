// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double =
        customer.orders
                .filter { it.isDelivered }
                .flatMap { it.products }
                .map { it.price }
                .sum()

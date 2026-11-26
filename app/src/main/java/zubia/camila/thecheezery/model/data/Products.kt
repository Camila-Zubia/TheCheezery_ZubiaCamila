package zubia.camila.thecheezery.model.data

import zubia.camila.thecheezery.R
import zubia.camila.thecheezery.model.data.database.Product

object InitialProducts {
    fun all(): List<Product> = listOf(
        Product(name = "Caramel Frap", price = 5.0f, image = R.drawable.caramel_frap, description = "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", category = "cold"),
        Product(name = "Chocolate Frap", price = 6f, image = R.drawable.chocolate_frap, description = "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", category = "cold"),
        Product(name = "Cold Brew", price = 3f, image = R.drawable.coldbrew, description = "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", category = "cold"),
        Product(name = "Matcha Latte", price = 4f, image = R.drawable.matcha, description = "Leafy taste of matcha green tea powder with creamy milk and a little sugar.", category = "cold"),
        Product(name = "Oreo Milkshake", price = 7f, image = R.drawable.oreomilkshake, description = "Chocolate ice cream, and oreo cookies.", category = "cold"),
        Product(name = "Peanut Milkshake", price = 7f, image = R.drawable.peanutmilkshake, description = "Vanilla ice cream, mixed with peanut butter and chocolate.", category = "cold"),

        Product(name = "Latte", price = 6f, image = R.drawable.latte, description = "Coffee drink made with espresso and steamed milk", category = "hot"),
        Product(name = "Hot chocolate", price = 5f, image = R.drawable.hotchocolate, description = "Heated drink consisting of shaved chocolate, topped with marshmallows.", category = "hot"),
        Product(name = "Espresso", price = 4f, image = R.drawable.espresso, description = "Full-flavored, concentrated form of coffee.", category = "hot"),
        Product(name = "Chai Latte", price = 6f, image = R.drawable.chailatte, description = "Spiced tea concentrate with milk", category = "hot"),
        Product(name = "Capuccino", price = 7f, image = R.drawable.capuccino, description = "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", category = "hot"),
        Product(name = "American coffee", price = 2f, image = R.drawable.americano, description = "Espresso with hot water", category = "hot"),

        Product(name = "Blueberry cake", price = 6f, image = R.drawable.blueberrycake, description = "Vanilla cake flavor, topped with cheese topping and blueberries.", category = "sweets"),
        Product(name = "Chocolate cupcake", price = 3f, image = R.drawable.chocolatecupcake, description = "Chocolate cupcakes topped with butter cream and cherries", category = "sweets"),
        Product(name = "Lemon tartalette", price = 4f, image = R.drawable.lemontartalette, description = "Pastry shell with a lemon flavored filling", category = "sweets"),
        Product(name = "Red Velvet cake", price = 6f, image = R.drawable.redvelvetcake, description = "Soft, moist, buttery cake topped with an easy cream cheese frosting.", category = "sweets"),
        Product(name = "Cherry cheesecake", price = 7f, image = R.drawable.strawberrycheesecake, description = "This cherry topped cheesecake is positively creamy and delicious.", category = "sweets"),
        Product(name = "Tiramisu", price = 6f, image = R.drawable.tiramisu, description = "Coffee-flavored Italian dessert", category = "sweets"),

        Product(name = "Chicken crepes", price = 6f, image = R.drawable.chickencrepes, description = "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", category = "salties"),
        Product(name = "Club Sandwich", price = 5f, image = R.drawable.clubsandwich, description = "A delicious sandwich served with french fries.", category = "salties"),
        Product(name = "Panini", price = 4f, image = R.drawable.ic_panini, description = "Sandwich made with Italian bread served warmed by grilling.", category = "salties"),
        Product(name = "Philly cheese steak", price = 6f, image = R.drawable.phillycheesesteak, description = "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", category = "salties"),
        Product(name = "Nachos", price = 7f, image = R.drawable.nachos, description = "Tortilla chips layered with beef and melted cheddar cheese.", category = "salties")
    )
}
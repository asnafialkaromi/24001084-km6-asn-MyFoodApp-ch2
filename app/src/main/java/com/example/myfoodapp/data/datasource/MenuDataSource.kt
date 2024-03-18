package com.example.myfoodapp.data.datasource

import com.example.myfoodapp.R
import com.example.myfoodapp.data.model.Menu

interface MenuDataSource {
    fun getMenuData(): List<Menu>
}

class MenuDataSourceImpl : MenuDataSource {
    override fun getMenuData(): List<Menu> {
        return mutableListOf(
            Menu(
                image = R.drawable.img_fried_rice,
                name = "Nasi Goreng",
                rating = 4.9,
                price = 15000.0,
                description = "Nasi goreng, meaning 'fried rice' in Indonesian, is a flavorful rice dish stir-fried in a blend of sweet soy sauce, garlic, shallots, tamarind, and chili, mixed with meats, seafood, and/or vegetables.",
                location = "Warung Mama Putri, Jalan Gatot Subroto No. 25, Jakarta",
                latitude = -6.2340557,
                longitude = 106.8584281
            ),
            Menu(
                image = R.drawable.img_fried_noodle,
                name = "Mie Goreng",
                rating = 4.3,
                price = 10000.0,
                description = "Mie goreng, or fried noodles, is an Indonesian dish made from stir-frying noodles in a spiced soy-based sauce with garlic, onions, shallots, chili, and choice of chicken, shrimp, or beef.",
                location = "Warung Sate Kambing, Jalan Malioboro No. 10, Yogyakarta",
                latitude = -7.7956,
                longitude = 110.3695
            ),
            Menu(
                image = R.drawable.img_choco_drink,
                name = "Es Coklat",
                rating = 4.7,
                price = 5000.0,
                description = "Es coklat is a delightful Indonesian chocolate drink made from rich cocoa powder mixed with condensed milk and ice, offering a refreshing yet indulgent treat.",
                location = "Kedai Es Krim Bu Tini, Jalan Dago No. 15, Bandung",
                latitude = -6.9175,
                longitude = 107.6191
            ),
            Menu(
                image = R.drawable.img_burger,
                name = "Burger",
                rating = 4.9,
                price = 20000.0,
                description = "A classic American-style burger featuring a juicy beef patty topped with melted cheese, crisp lettuce, ripe tomato, onions, pickles, and special sauce, all sandwiched between a soft sesame seed bun.",
                location = "Burger & Grill Shack, Jalan Raya Kupang Jaya No. 8, Surabaya",
                latitude = -7.2575,
                longitude = 112.7521
            ),
            Menu(
                image = R.drawable.img_boiled_noodle,
                name = "Mie Rebus",
                rating = 4.4,
                price = 12000.0,
                description = "Mie rebus, or boiled noodles, is an Indonesian dish consisting of egg noodles served in a flavorful broth made from chicken or beef, garnished with bean sprouts, fried shallots, and green onions.",
                location = "Warung Makan Bu Tati, Jalan Setiabudi No. 123, Bandung",
                latitude = -6.9016,
                longitude = 107.6186
            ),
            Menu(
                image = R.drawable.img_fried_chiken,
                name = "Ayam Geprek",
                rating = 4.9,
                price = 8000.0,
                description = "Ayam geprek is an Indonesian fried chicken dish known for its crispy battered chicken that's been smashed and coated with spicy sambal, resulting in a delightful explosion of flavors.",
                location = "Ayam Geprek Bude, Jalan Pandanaran No. 21, Semarang",
                latitude = -6.9932,
                longitude = 110.4203
            ),
            Menu(
                image = R.drawable.img_sushi,
                name = "Sushi",
                rating = 4.7,
                price = 40000.0,
                description = "Sushi is a Japanese delicacy consisting of bite-sized rolls of vinegared rice topped with fresh seafood, vegetables, or other ingredients, often served with soy sauce, wasabi, and pickled ginger.",
                location = "Sushi Bar Sakura, Plaza Indonesia, Jakarta",
                latitude = -6.1926,
                longitude = 106.8228
            ),
            Menu(
                image = R.drawable.img_snack_pack,
                name = "Doritos",
                rating = 4.5,
                price = 4000.0,
                description = "Doritos are crunchy corn tortilla chips flavored with zesty cheese seasoning, perfect for snacking on their own or dipping into salsa or cheese sauce.",
                location = "Mini Mart, Jalan Sudirman No. 45, Jakarta",
                latitude = -6.2088,
                longitude = 106.8456
            )
        )
    }
}
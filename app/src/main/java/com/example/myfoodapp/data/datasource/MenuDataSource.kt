package com.example.myfoodapp.data.datasource

import com.example.myfoodapp.R
import com.example.myfoodapp.data.model.Menu

interface MenuDataSource {
    fun getMenuData(): List<Menu>
}

class MenuDataSourceImpl : MenuDataSource {
    override fun getMenuData(): List<Menu> {
        return mutableListOf(
            return mutableListOf(
                Menu(
                    image = R.drawable.img_fried_rice,
                    name = "Nasi Goreng",
                    rating = 4.9,
                    price = 15000.0,
                    description = "Nasi goreng, meaning 'fried rice' in Indonesian, is a flavorful rice dish stir-fried in a blend of sweet soy sauce, garlic, shallots, tamarind, and chili, mixed with meats, seafood, and/or vegetables.",
                    location = "VW53+RH4, Jl. Rawa Sengon X, RT.3/RW.022, Klp. Gading Bar., Kec. Klp. Gading, Jkt Utara, Daerah Khusus Ibukota Jakarta 14240",
                    mapLink = "https://www.google.com/maps/place/Warung+Mama+Putri/@-6.2017199,106.8355434,12z/data=!4m10!1m2!2m1!1sWarung+Mama+Putri+Jakarta!3m6!1s0x2e69f551065dad77:0x80cc9c58ef0835cd!8m2!3d-6.1404828!4d106.9039447!15sChlXYXJ1bmcgTWFtYSBQdXRyaSBKYWthcnRhWhsiGXdhcnVuZyBtYW1hIHB1dHJpIGpha2FydGGSAQpyZXN0YXVyYW504AEA!16s%2Fg%2F11fyzcspqc?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_fried_noodle,
                    name = "Mie Goreng",
                    rating = 4.3,
                    price = 10000.0,
                    description = "Mie goreng, or fried noodles, is an Indonesian dish made from stir-frying noodles in a spiced soy-based sauce with garlic, onions, shallots, chili, and choice of chicken, shrimp, or beef.",
                    location = "Jl. Beringin Raya No.66, RT.004/RW.003, Nusa Jaya, Kec. Karawaci, Kota Tangerang, Banten 15116",
                    mapLink = "https://www.google.com/maps/place/Bakmi+Jogja+%22KERATON%22/@-6.2018448,106.4625097,12z/data=!4m10!1m2!2m1!1swarung+mie+goreng+yogyakarta!3m6!1s0x2e69ff3282b8a1d3:0xc2121d8c9dcec670!8m2!3d-6.2018448!4d106.614945!15sChx3YXJ1bmcgbWllIGdvcmVuZyB5b2d5YWthcnRhWh4iHHdhcnVuZyBtaWUgZ29yZW5nIHlvZ3lha2FydGGSAQtub29kbGVfc2hvcJoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VOd05WQm1hMnRSUlJBQuABAA!16s%2Fg%2F11hzxsc_2g?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_choco_drink,
                    name = "Es Coklat",
                    rating = 4.7,
                    price = 5000.0,
                    description = "Es coklat is a delightful Indonesian chocolate drink made from rich cocoa powder mixed with condensed milk and ice, offering a refreshing yet indulgent treat.",
                    location = "Jl. Titimplik No.27-33, Sadang Serang, Kecamatan Coblong, Kota Bandung, Jawa Barat 40133",
                    mapLink = "https://www.google.com/maps/place/Kedai+Es+Krim/@-6.9178269,107.5967721,13z/data=!4m10!1m2!2m1!1sKedai+Es+Krim+Bu+Tini+Bandung!3m6!1s0x2e68e652bb99164d:0x6b30a5ef3b2e8eda!8m2!3d-6.8961358!4d107.6205768!15sCh1LZWRhaSBFcyBLcmltIEJ1IFRpbmkgQmFuZHVuZ1ofIh1rZWRhaSBlcyBrcmltIGJ1IHRpbmkgYmFuZHVuZ5IBDmljZV9jcmVhbV9zaG9wmgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVVI0WjNGNVpUTjNSUkFC4AEA!16s%2Fg%2F11bwqfwz1n?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_burger,
                    name = "Burger",
                    rating = 4.9,
                    price = 20000.0,
                    description = "A classic American-style burger featuring a juicy beef patty topped with melted cheese, crisp lettuce, ripe tomato, onions, pickles, and special sauce, all sandwiched between a soft sesame seed bun.",
                    location = "Loop Graha Famili, Container, Jl. Mayjend. Jonosewojo, Pradahkalikendal, Dukuhpakis, Surabaya, East Java 60227",
                    mapLink = "https://www.google.com/maps/place/Five+Monkeys+Burger+-+Surabaya+Barat/@-7.2935592,112.6002004,13z/data=!4m10!1m2!2m1!1sBurger+%26+Grill+Shack+Surabaya!3m6!1s0x2dd7fdcb083c31bd:0xf38c3f1226f4a3a4!8m2!3d-7.2935592!4d112.6764181!15sCh1CdXJnZXIgJiBHcmlsbCBTaGFjayBTdXJhYmF5YVofIh1idXJnZXIgJiBncmlsbCBzaGFjayBzdXJhYmF5YZIBFGhhbWJ1cmdlcl9yZXN0YXVyYW504AEA!16s%2Fg%2F11pf8hl9v1?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_boiled_noodle,
                    name = "Mie Rebus",
                    rating = 4.4,
                    price = 12000.0,
                    description = "Mie rebus, or boiled noodles, is an Indonesian dish consisting of egg noodles served in a flavorful broth made from chicken or beef, garnished with bean sprouts, fried shallots, and green onions.",
                    location = "827Q+WH2, Rejanegara, Gumilir, Kec. Cilacap Utara, Kabupaten Cilacap, Jawa Tengah 53231",
                    mapLink = "https://www.google.com/maps/place/Warung+Kelontong+Bu+Tati/@-7.3052505,108.5250385,9z/data=!4m10!1m2!2m1!1sWarung+Makan+Bu+Tati+Bandung!3m6!1s0x2e656d2f49a3501b:0xaa3bd00883cc00c5!8m2!3d-7.6852263!4d109.0388965!15sChxXYXJ1bmcgTWFrYW4gQnUgVGF0aSBCYW5kdW5nWh4iHHdhcnVuZyBtYWthbiBidSB0YXRpIGJhbmR1bmeSARNqYXZhbmVzZV9yZXN0YXVyYW504AEA!16s%2Fg%2F11f4qcx112?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_fried_chiken,
                    name = "Ayam Geprek",
                    rating = 4.9,
                    price = 8000.0,
                    description = "Ayam geprek is an Indonesian fried chicken dish known for its crispy battered chicken that's been smashed and coated with spicy sambal, resulting in a delightful explosion of flavors.",
                    location = "Kp. Gendong Utara No.1060, Sarirejo, Kec. Semarang Tim., Kota Semarang, Jawa Tengah 50124",
                    mapLink = "https://www.google.com/maps/place/warung+ayam+gepreK+budhe/@-7.0042336,110.425817,14z/data=!4m10!1m2!2m1!1sAyam+Geprek+Bude+Semarang!3m6!1s0x2e708d886729bbef:0x4f444c9c960bbf93!8m2!3d-6.9829343!4d110.4339548!15sChlBeWFtIEdlcHJlayBCdWRlIFNlbWFyYW5nWhsiGWF5YW0gZ2VwcmVrIGJ1ZGUgc2VtYXJhbmeSAQ9uYXNpX3Jlc3RhdXJhbnTgAQA!16s%2Fg%2F11tww48t9v?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_sushi,
                    name = "Sushi",
                    rating = 4.7,
                    price = 40000.0,
                    description = "Sushi is a Japanese delicacy consisting of bite-sized rolls of vinegared rice topped with fresh seafood, vegetables, or other ingredients, often served with soy sauce, wasabi, and pickled ginger.",
                    location = "Jl. Palem Raya No.24, RT.5/RW.8, Petukangan Utara, Kec. Pesanggrahan, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12260",
                    mapLink = "https://www.google.com/maps/place/Sakura+Bento+and+Sushi/@-6.2276656,106.6050276,12z/data=!4m10!1m2!2m1!1sSushi+Bar+Sakura+Jakarta!3m6!1s0x2e69f114ae13f2f5:0x865530e21fcbc78!8m2!3d-6.2276656!4d106.7574629!15sChhTdXNoaSBCYXIgU2FrdXJhIEpha2FydGFaGiIYc3VzaGkgYmFyIHNha3VyYSBqYWthcnRhkgETamFwYW5lc2VfcmVzdGF1cmFudOABAA!16s%2Fg%2F11qg15rp2s?entry=ttu"
                ),
                Menu(
                    image = R.drawable.img_snack_pack,
                    name = "Doritos",
                    rating = 4.5,
                    price = 4000.0,
                    description = "Doritos are crunchy corn tortilla chips flavored with zesty cheese seasoning, perfect for snacking on their own or dipping into salsa or cheese sauce.",
                    location = "Jl. Tabah Raya A No.13 2, RT.2/RW.9, Klp. Gading Bar., Kec. Klp. Gading, Jkt Utara, Daerah Khusus Ibukota Jakarta 14240",
                    mapLink = "https://www.google.com/maps/place/Mini+Market+Pipal/@-6.2131585,106.8106851,12z/data=!4m10!1m2!2m1!1sMini+Mart+Jakarta!3m6!1s0x2e69f515cbd5c0b5:0xec1ef84fb8b34b4f!8m2!3d-6.1581587!4d106.886041!15sChFNaW5pIE1hcnQgSmFrYXJ0YVoTIhFtaW5pIG1hcnQgamFrYXJ0YZIBDWdyb2Nlcnlfc3RvcmXgAQA!16s%2Fg%2F11df4wc_q1?entry=ttu"
                )
            )
        )
    }
}
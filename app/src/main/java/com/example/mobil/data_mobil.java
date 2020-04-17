package com.example.mobil;

import java.util.ArrayList;

public class data_mobil {

    private static String[] mobilNames = {
            "alphard",
            "bmw",
            "lamborghini",
            "pajero"

    };

    private static String[] mobilDetails = {
            "Dominasi dari All New Alphard di kelas MPV premium diakibatkan oleh design yang elegan yang dilengkapi dengan fitur-fitur interior mewah maupun eksterior luar dari mobil.",
            "BMW Indonesia menyediakan hingga 23 model kendaraan penumpang di Indonesia dari berbagai jenis. BMW menyediakan 8 Crossover, 6 Sedan, 5 Coupe, 2 convertible, dan 1 station wagon di sini. Mobil BMW termurah yaitu X1 seharga Rp 739 juta dan termahal yaitu BMW i8 Roadster seharga Rp 4,41 miliar. BMW membuka 22 jaringan dealer di 15 kota di Indonesia. Anda yang mencari mobil baru BMW silakan kunjungi dealer terdekat dan dapatkan promo menarik.",
            "Saat ini ada 3 model mobil Lamborghini yang tersedia di Indonesia. Lamborghini Aventador, Lamborghini Urus, Lamborghini Huracan adalah mobil Lamborghini paling populer.",
            "Produksi dimulai di Jepang tahun 1996 dan mulai diekspor tahun 1997. Mobil ini dinamai berbagai macam antara lain Challenger, Pajero Sport di Eropa, Montero Sport di Amerika Utara, Amerika Selatan, Filipina, Nativa di Amerika Latin, Karibia, dan Timur Tengah, Shogun Sport di Inggris,[1] dan G-Wagon di Thailand. Seperti Pajero, mobil ini dilengkapi dengan suspensi depan independen."

    };

    private static int[] mobilImages = {
            R.drawable.alphard,
            R.drawable.bmw,
            R.drawable.lamborghini,
            R.drawable.pajero

    };

    static ArrayList<mobil> getListData() {
        ArrayList<mobil> list = new ArrayList<>();
        for (int position = 0; position < mobilNames.length; position++) {
            mobil mobil = new mobil();
            mobil.setName(mobilNames[position]);
            mobil.setDetail(mobilDetails[position]);
            mobil.setPhoto(mobilImages[position]);
            list.add(mobil);
        }
        return list;
    }
}
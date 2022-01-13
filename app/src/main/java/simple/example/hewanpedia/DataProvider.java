package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anggrek;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kaktus;
import simple.example.hewanpedia.model.Mawar;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anggrek> initDataAngrek(Context ctx) {
        List<Anggrek> Anggreks = new ArrayList<>();
        Anggreks.add(new Anggrek("diuris", "Turki",
                "angggrek diuris merupak anggrek dengan warna putih", R.drawable.anggrek1));
        Anggreks.add(new Anggrek("hitam", "Inggris",
                "anggrek hitam merupakn anggrek yang berciri khas dengan warna hitam", R.drawable.anggrek2));
        Anggreks.add(new Anggrek("vanilla", "Birma/Myanmar",
                "anggrek ini identik dengan bentuknya yang menyerupai vanilla", R.drawable.anggrek3));
        Anggreks.add(new Anggrek("Persia", "Iran",
                "anggrek ini sangat terkenal dikalangan pecinta anggrek", R.drawable.anggrek4));
        return Anggreks;
    }

    private static List<Kaktus> initDataKaktus(Context ctx) {
        List<Kaktus> Kaktuss = new ArrayList<>();
        Kaktuss.add(new Kaktus ("kaktus", "Inggris",
                "kaktus adalah tanaman berduri yang banyak peminatnya", R.drawable.kaktus1));
        Kaktuss.add(new Kaktus("kubis", "Alaska,Siberia ",
                "kaktus ini bernama kubis karena bentuknya yang menyerupai kubis ", R.drawable.kaktus3));
        Kaktuss.add(new Kaktus("kursimertua", "Indonesia",
                "kaktus ini menyerupai kursi mertua ", R.drawable.kaktus4));
        return Kaktuss;
    }

    private static List<Mawar> initDataMawar(Context ctx) {
        List<Mawar> mawars = new ArrayList<>();
        mawars.add(new Mawar("mawar", "Inggris",
                "mawar adalah tumbuhan yang memiliki bungan yang sangat indah", R.drawable.mawar1));
        mawars.add(new Mawar("peace", "Alaska, ",
                "mawar ini disebut peace karna warnanya yang bagus", R.drawable.mawar2));
        mawars.add(new Mawar("ratualizabet", "Indonesia",
                "mawar ini disebut ratu elizabet karena merupakam kesukaan ratu elizabet", R.drawable.mawar3));
        mawars.add(new Mawar("ratumalam", "Rusia",
                " mawar ini dikatakan ratu malam karna hanya berkembang pada malam hari", R.drawable.mawar4));
        return mawars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKaktus(ctx));
        hewans.addAll(initDataMawar(ctx));
        hewans.addAll(initDataAngrek(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

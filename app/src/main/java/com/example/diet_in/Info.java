package com.example.diet_in;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Info extends AppCompatActivity {

    ListView listView;
    String mJudul[] = {"Alasan Mengapa Semua Orang Sebut Diet Mediterania Bermanfaat","Kisah Sukses Turun Berat Badan 24 Kilogram Selama Pandemi","Jangan Asal, Ini Waktu yang Tepat untuk Konsumsi Makanan Ringan hingga Berat","Waspadai Sejumlah Menu Diet yang Justru Bisa Sebabkan Jerawat","Apa Diet Terbaik untuk 2021?"};
    String mDeskripsi[] = {"Diet Mediterania terinspirasi oleh masakan Spanyol, Italia, dan Yunani ini dinobatkan sebagai diet keseluruhan terbaik oleh US News & World Report selama empat tahun berturut-turut. Dengan fokus pada ikan, lemak sehat, dan biji-bijian yang tidak diolah, ada bukti bagus bahwa berpegang pada pola makan ini dapat menghasilkan umur yang lebih panjang.\n" +
            "\n" + "Sekarang bukti semakin meningkat bahwa diet Mediterania mungkin memiliki manfaat seperti umur panjang. “Ketika orang berpikir tentang diet Mediterania, mereka memikirkan diet yang menyehatkan jantung,” kata Dr. Timothy Harlan, Pemimpin Redaksi Health Meet Food: the Culinary Medicine Curriculum, seperti dikutip dari laman abcnews, Senin, 18 Januari 2021. “Tapi sungguh, diet Mediterania telah terbukti mencegah penyakit Alzheimer, degenerasi makula, dan kanker juga.”",

            "Hari-hari berbeda selama pandemi COVID-19 nyaris setahun terakhir menjadi tantangan sekaligus peluang. Kegiatan rutin terkendala dengan segala keterbatasan seiring pandemi. Namun, momen ini juga memberi peluang untuk meraih target yang relatif lebih sulit digapai pada masa normal, seperti mendapatkan berat badan ideal.\n" +
            "\n" + "Salah satu kisah sukses datang dari Chrysanthi, seorang profesional di Jakarta. Ia berhasil menurunkan berat badan secara signifikan dengan stabil. Pada Juni 2020 berat badannya 75 kilogram, di akhir Desember 2020 timbangan menunjukkan angka 51 kilogram.",

            "Tentunya kondisi tersebut sangat memudahkan semua orang untuk konsumsi makanan bergizi. Jika tubuh sedang dalam keadaan diet, hal itu harus dibarengi dengan aktivitas olahraga yang rutin.\n" +
             "\n" + "Kini, masyarakat sudah banyak yang menyadari untuk sering konsumsi makanan bergizi Mengingat banyak sekali manfaat yang didapat jika tubuh sering konsumsi makanan yang sehat. Salah satunya tubuh akan terhindar dari risiko penyakit berbahaya, seperti diabetes, masalah pencernaan, penyakit jantung, obesitas, hipertensi, kanker, dan lain-lain.\n" +
             "\n" + "Sebenarnya, sangat mudah untuk kita rutin mengonsumsi makanan sehat setiap hari. Selain memiliki niat, Anda harus benar-benar menjalankannya. Tak hanya memperhatikan kandungan di dalamnya, Anda juga harus mengetahui kapan waktu yang tepat untuk mengonsumsinya.",

            "Selesai satu, tapi justru harus menyelesaikan masalah lain. Anda tentu tak ingin tertimpa keadaan tersebut ketika sedang diet, bukan? Masalah di sini tentu bisa bermacam-macam, tak terkecuali munculnya jerawat di kulit.\n" +
            "\n" + "Entah Anda lebih suka melakukan 10 langkah K-beauty skincare routine atau menyukai rejimen sederhana khas drugstore, rencana perjalanan guna meningkatkan kualitas kulit setiap orang sedikit berbeda. Ini jadi sedikit rumit dan jauh lebih mengecewakan begitu menyadari kulit wajah masih saja breakout.\n" +
            "\n" + "Pasalnya, perawatan kulit dimulai dari luar ke dalam, termasuk apa yang dimakan dan kualitas diet Anda. Jika menghadapi jerawat tak terduga, sederet menu diet ini mungkin jadi penyebab masalah jerawat Anda, seperti dilansir dari Insider, Senin, 11 Januari 2021.",

            "Selama empat tahun berturut-turut, diet Mediterania menempati peringkat pertama dalam diet terbaik secara keseluruhan, menurut daftar tahunan U.S. News & World Report. DASH (Dietary Approaches to Stop Hypertension) dan diet flexitarian menempati posisi kedua dalam diet keseluruhan.\n" +
            "\n" + "Diet DASH berfokus pada penurunan tekanan darah seseorang, sedangkan diet flexitarian adalah pola makan vegetarian yang dimodifikasi. Para ahli mengatakan peringkat seperti itu tidak mengherankan karena ketiga diet tersebut memiliki kesamaan.\n" +
            "\n" + "Diet-diet itu mudah diikuti dan fokus pada makanan apa yang dapat dimasukkan, bukan dikecualikan, dilansir dari Today, Selasa, 5 Januari 2021. “Pola makan Mediterania adalah pola makan yang benar-benar berpusat pada makanan apa yang Anda tambahkan, bukan makanan yang Anda singkirkan,” Maya Feller, ahli diet terdaftar di Brooklyn."};

    int Gambars[] = {R.drawable.buah, R.drawable.diet1, R.drawable.diet2, R.drawable.diet4, R.drawable.diet3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        listView = findViewById(R.id.listArtikel);

        ArtikelAdapter adapter = new ArtikelAdapter(this, mJudul, mDeskripsi, Gambars);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Info.this, "Alasan Mengapa Semua Orang Sebut Diet Mediterania Bermanfaat", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), AnotherArtikel.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("gambar", Gambars[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("judul", mJudul[0]);
                    intent.putExtra("deskripsi", mDeskripsi[0]);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);
                }
                if (position == 1) {
                    Toast.makeText(Info.this, "Kisah Sukses Turun Berat Badan 24 Kilogram Selama Pandemi", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), AnotherArtikel.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("gambar", Gambars[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("judul", mJudul[1]);
                    intent.putExtra("deskripsi", mDeskripsi[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Toast.makeText(Info.this, "Jangan Asal, Ini Waktu yang Tepat untuk Konsumsi Makanan Ringan hingga Berat", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), AnotherArtikel.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("gambar", Gambars[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("judul", mJudul[2]);
                    intent.putExtra("deskripsi", mDeskripsi[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Toast.makeText(Info.this, "Waspadai Sejumlah Menu Diet yang Justru Bisa Sebabkan Jerawat", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), AnotherArtikel.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("gambar", Gambars[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("judul", mJudul[3]);
                    intent.putExtra("deskripsi", mDeskripsi[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Toast.makeText(Info.this, "Apa Diet Terbaik untuk 2021?", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), AnotherArtikel.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("gambar", Gambars[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("judul", mJudul[4]);
                    intent.putExtra("deskripsi", mDeskripsi[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
            }
        });
    }

    class ArtikelAdapter extends ArrayAdapter<String>{
        Context context;
        String rJudul[];
        String rDeskripsi[];
        int rGambar[];

        ArtikelAdapter (Context c, String judul[], String deskripsi[], int gambar[]){
            super(c, R.layout.rowartikel, R.id.textJudul, judul);
            this.context = c;
            this.rJudul = judul;
            this.rDeskripsi = deskripsi;
            this.rGambar = gambar;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowartikel = layoutInflater.inflate(R.layout.rowartikel, parent, false);
            ImageView Gambars = rowartikel.findViewById(R.id.gambar);
            TextView myJudul = rowartikel.findViewById(R.id.textJudul);
            TextView myDeskripsi = rowartikel.findViewById(R.id.textDesc);

            Gambars.setImageResource(rGambar[position]);
            myJudul.setText(rJudul[position]);
            myDeskripsi.setText(rDeskripsi[position]);

            return rowartikel;
        }

    }
}
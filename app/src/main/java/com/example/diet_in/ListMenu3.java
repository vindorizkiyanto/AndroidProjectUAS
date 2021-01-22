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
import android.widget.TextView;

public class ListMenu3 extends AppCompatActivity {

        android.widget.ListView ListView;
        String mTitle[]= {"Day1","Day 2","Day 3", "Day 4","Day 5", "Day 6", "Day 7","Day 8","Day 9","Day 10", "Day 11","Day 12"};
        String mDescription[]= {"\n"+"Sarapan: \n" +
                "1 buah pisang, 1 cangkir sereal, 1 cangkir susu tanpa lemak, teh herbal.\n" +
                "\n"+"Makan siang: \n" +
                "2 helai roti gandum, 110 gr tuna/dada ayam, 1 sdm mayonaise, ½ sdt bubuk kari, seledri, daun selada, 300gr baby carrot dan paprika\n" +
                "\n"+"Makan malam: \n" +
                "Ikan kod dengan lemon, 115 gr buncis kukus, 75 gr buah bit, salad dengan minyak zaitun, 1 buah jeruk, air lemon\n" +
                "\n"+"Cemilan: \n" +
                "1 buah pear kecil (kapan saja)\n",

                "\n"+"Sarapan: \n" +
                        "Setengah cangkir oatmeal yang dicampur dengan 1 cangkir susu dan 2 sdm kismis, minuman tanpa kalori\n" +
                        "\n"+"Makan siang: \n" +
                        "quiona dan kue ubi manis, salad dengan dressing tanpa lemak, minuman tanpa kalori\n" +
                        "\n"+"Makan malam: \n" +
                        "1 potong pizza, 115 gr cangkir buah campur, minuman tanpa kalori\n" +
                        "\n"+"Cemilan: \n" +
                        "1 cangkir paprika\n",

                "\n"+"Sarapan: \n" +
                        "1 gelas kopi atau teh (boleh dengan gula) tanpa susu\n" +
                        "\n"+"Makan siang: \n" +
                        "2 butir telur rebus, 1 buah tomat, dan 1 ikat bayam kukus/ rebus\n" +
                        "\n"+"Makan malam: \n" +
                        "57 gr daging sapi (tenderloin) panggang, 100 gr buncis kukus, 3 buah baby potato yang dibumbui dengan 1 sdt margarin tanpa lemak, salad, minuman bebas kalori\n" +
                        "\n"+"Cemilan: \n" +
                        "buah/ sayur\n",

                "\n"+"Sarapan:\n" +
                        "1 buah wortel besar mentah, parut kasar, bumbui dengan jeruk nipis atau lemon\n" +
                        "\n"+"Makan siang: \n" +
                        "2,5 ons ayam kukus, bumbui dengan sedikit mentega tanpa garam.\n" +
                        "\n"+"Makan malam: \n" +
                        "1 mangkok buah pepaya yang dibumbui dengan jeruk nipis, dan 1 gelas susu tanpa lemak.\n" +
                        "\n"+"Cemilan: \n" +
                        "1 cangkir baby carrot\n",

                "\n"+"Sarapan: \n" +
                        "115 gr blueberry dengan ½ cangkir jus jeruk\n" +
                        "\n"+"Makan siang: \n" +
                        "Makaroni panggang dicampir dengan bayam dan saus kare\n" +
                        "\n"+"Makan malam: \n" +
                        "Bakso bakar dicampur dengan jamur dan saus tomat, puding\n" +
                        "\n"+"Cemilan: \n" +
                        "Aneka sayuran\n",

                "\n"+"Sarapan:\n" +
                        "75 gr strawberry dengan ½ cangkir jus jeruk\n" +
                        "\n"+"Makan siang: \n" +
                        "Ayam katsu, kue kentang, dan buah segar\n" +
                        "\n"+"Makan malam: \n" +
                        "Telur rebus, saus kare, puding buah segar\n" +
                        "\n"+"Cemilan: \n" +
                        "Buah atau sayuran\n",

                "\n"+"Sarapan: \n" +
                        "1 buah pisang, 1 cangkir sereal, 1 cangkir susu tanpa lemak, teh herbal\n" +
                        "\n"+"Makan siang: \n" +
                        "2 helai roti gandum, 110 gr tuna/dada ayam, 1 sdm mayonaise, ½ sdt bubuk kari, seledri, daun selada, 300 gr baby carrot dan paprika\n" +
                        "\n"+"Makan malam: \n" +
                        "Ikan kod dengan lemon, 115 gr buncis kukus, 75 gr buah bit, salad dengan minyak zaitun, 1 buah jeruk, air lemon\n" +
                        "\n"+"Cemilan: \n" +
                        "1 buah pear kecil (kapan saja)\n",

                "\n"+"Sarapan: \n" + "Setengah cangkir oatmeal yang dicampur dengan 1 cangkir susu dan 2 sdm kismis, minuman tanpa kalori\n" + "\n"+"Makan siang: \n" + "Quiona dan kue ubi manis, salad dengan dressing tanpa lemak, minuman tanpa kalori\n" +
                        "\n"+"Makan malam: \n" +
                        "1 potong pizza, 115 gr cangkir buah campur, minuman tanpa kalori\n" +
                        "\n"+"Cemilan: \n" +
                        "1 cangkir paprika\n",

                "\n"+"Sarapan: \n" +
                        "1 gelas kopi atau teh (boleh dengan gula) tanpa susu\n" +
                        "\n"+"Makan siang: \n" +
                        "2 butir telur rebus, 1 buah tomat, dan 1 ikat bayam kukus/ rebus\n" +
                        "\n"+"Makan malam: \n" +
                        "57 gr daging sapi (tenderloin) panggang, 100 gr buncis kukus, 3 buah baby potato yang dibumbui dengan 1 sdt margarin tanpa lemak, salad, minuman bebas kalori\n" +
                        "\n"+"Cemilan: \n" +
                        "buah/ sayur\n",

                "\n"+"Sarapan:\n" +
                        "1 buah wortel besar mentah, parut kasar, bumbui dengan jeruk nipis atau lemon\n" +
                        "\n"+"Makan siang: \n" +
                        "2,5 ons ayam kukus, bumbui dengan sedikit mentega tanpa garam.\n" +
                        "\n"+"Makan malam: \n" +
                        "1 mangkok buah pepaya yang dibumbui dengan jeruk nipis, dan 1 gelas susu tanpa lemak.\n" +
                        "\n"+"Cemilan: \n" +
                        "1 cangkir baby carrot\n",

                "\n"+"Sarapan: \n" +
                        "115 gr blueberry dengan ½ cangkir jus jeruk\n" +
                        "\n"+"Makan siang: \n" +
                        "Makaroni panggang dicampir dengan bayam dan saus kare\n" +
                        "\n"+"Makan malam: \n" +
                        "Bakso bakar dicampur dengan jamur dan saus tomat, puding\n" +
                        "\n"+"Cemilan: \n" +
                        "Aneka sayuran\n",

                "\n"+"Sarapan:\n" +
                        "75 gr strawberry dengan ½ cangkir jus jeruk\n" +
                        "\n"+"Makan siang: \n" +
                        "Ayam katsu, kue kentang, dan buah segar\n" +
                        "\n"+"Makan malam: \n" +
                        "Telur rebus, saus kare, puding buah segar\n" +
                        "\n"+"Cemilan: \n" +
                        "Buah atau sayuran\n"};
        int images[] = {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6, R.drawable.d7, R.drawable.d8, R.drawable.d9, R.drawable.d10, R.drawable.d11, R.drawable.d12};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_menu);
            ListView = findViewById(R.id.ListView);
           ListMenu3.MyAdapter adapter = new ListMenu3.MyAdapter( this, mTitle, mDescription, images);
            ListView.setAdapter(adapter);

            ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position == 0) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[0]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[0]);
                        intent.putExtra( "description", mDescription[0]);
                        intent.putExtra("position", ""+0);
                        startActivity(intent);
                    }
                    if(position == 1) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[1]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[1]);
                        intent.putExtra( "description", mDescription[1]);
                        intent.putExtra("position", ""+1);
                        startActivity(intent);
                    }
                    if(position == 2) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[2]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[2]);
                        intent.putExtra( "description", mDescription[2]);
                        intent.putExtra("position", ""+2);
                        startActivity(intent);
                    }
                    if(position == 3) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[3]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[3]);
                        intent.putExtra( "description", mDescription[3]);
                        intent.putExtra("position", ""+3);
                        startActivity(intent);
                    }
                    if(position == 4) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[4]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[4]);
                        intent.putExtra( "description", mDescription[4]);
                        intent.putExtra("position", ""+4);
                        startActivity(intent);
                    }
                    if(position == 5) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[5]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[5]);
                        intent.putExtra( "description", mDescription[5]);
                        intent.putExtra("position", ""+5);
                        startActivity(intent);
                    }
                    if(position == 6) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putInt("image", images[6]);
                        intent.putExtras(bundle);
                        intent.putExtra("title", mTitle[6]);
                        intent.putExtra("description", mDescription[6]);
                        intent.putExtra("position", "" + 6);
                        startActivity(intent);
                    }
                    if(position == 7) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[7]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[7]);
                        intent.putExtra( "description", mDescription[7]);
                        intent.putExtra("position", ""+7);
                        startActivity(intent);
                    }
                    if(position == 8) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[8]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[8]);
                        intent.putExtra( "description", mDescription[8]);
                        intent.putExtra("position", ""+8);
                        startActivity(intent);
                    }
                    if(position == 9) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle ();
                        bundle.putInt("image",images[9]);
                        intent.putExtras(bundle);
                        intent.putExtra( "title", mTitle[9]);
                        intent.putExtra( "description", mDescription[9]);
                        intent.putExtra("position", ""+9);
                        startActivity(intent);
                    }
                    if(position == 10) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putInt("image", images[10]);
                        intent.putExtras(bundle);
                        intent.putExtra("title", mTitle[10]);
                        intent.putExtra("description", mDescription[10]);
                        intent.putExtra("position", "" +10);
                        startActivity(intent);
                    }
                    if(position == 11) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putInt("image", images[11]);
                        intent.putExtras(bundle);
                        intent.putExtra("title", mTitle[11]);
                        intent.putExtra("description", mDescription[11]);
                        intent.putExtra("position", "" +11);
                        startActivity(intent);
                    }

                }
            });
        }

        class MyAdapter extends ArrayAdapter<String> {
            Context context;
            String rTitle[];
            String rDescription[];
            int rImgs[];

            MyAdapter(Context c, String title[], String description[], int imgs[]) {
                super(c, R.layout.row, R.id.textView1, title);
                this.context = c;
                this.rTitle = title;
                this.rDescription = description;
                this.rImgs = imgs;

            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.row, parent, false);
                ImageView images = row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.textView1);
                TextView myDescription = row.findViewById(R.id.textView2);

                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);

                return row;

            }
        }
    }
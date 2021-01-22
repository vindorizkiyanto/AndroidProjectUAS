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

public class ListMenu2 extends AppCompatActivity {

    android.widget.ListView ListView;
    String mTitle[]= {"Day 1","Day 2","Day 3", "Day 4","Day 5"};
    String mDescription[]= {"Sarapan :\n" +
            "2 telur, 1 potong roti bakar, 1 buah alpukat \n" +
            "\n" +
            "Makan Siang :\n" +
            "40 gr bayam, 1 potong ayam bakar, 120 gr buncis , 25 mg wortel parut, 28 gram keju kambing, Minyak zaitun \n" +
            "\n" +
            "Makan Malam :\n" +
            "140 gram ikan kod panggang, 1 sdm minyak zaitun, 138 gram quinoa, 175 gram brokoli panggang\n",

            "\n" +"Sarapan :\n" +
                    "1 iris roti gandum dengan 1 sendok mentega almond, 1 telur rebus, 1 cangkir kopi atau teh tanpa gula \n" +
                    "\n" + "Makan Siang :\n" +
                    "2 potong roti gandum dengan 2 ons daging sapi panggang, 1 iris keju, 1 sdm mustard, 1 ½ cangkir irisan wortel , 1 cangkir susu tanpa lemak \n" +
                    "\n" + "Makan Malam :\n" +
                    "1 fillet dada ayam dengan 2 sendok saus salad, 1 cangkir brokoli dimasak dengan jus lemon, 1 cangkir kacang merah atau kacang hitam, 1 potong roti gandum utuh, boleh diolesi mentega \n",

            "\n" + "Sarapan :\n" +
                    "81 gram oatmeal dimasak menggunakan 1 gelas susu almond, 62 gr irisan apel,  setengah sdt bubuk kayu manis, dan selai kacang \n" +
                    "\n" +"Makan Siang :\n" +
                    "1 lembar tortilla gandum utuh, 1 buah alpukat, 2 iris tomat , 20 gram selada, dan 1 ons keju\n" +
                    "\n" + "Makan Malam :\n" +
                    "84 gram ayam giling, 120 gram kacang hitam, 120 gr kacang merah, 224 gr tomat yang dihancurkan \n",

            "\n" + "Sarapan : \n" +
                    "2 butir telur goreng, 1 potong roti gandum panggang, selai kacang, dan 1 iris pisang \n" +
                    "\n" + "Makan Siang :\n" +
                    " 1 sushi roll dari alpukat, mentimun, dan nasi merah 1 gulung sayuran roll dengan nasi merah, 2 potong salmon sashimi dan salad hijau \n" +
                    "\n" + "Makan Malam :\n" +
                    "1 ubi jalar kecil, mentega, 112 gram salmon, dan 88 gr kecambah \n",

            "\n" +"Sarapan :\n" +
                    "1 cangkir oatmeal dengan kenari, 1 cangkir susu tanpa lemak, 1 buah jeruk \n" +
                    "\n" +"Makan Siang :\n" +
                    "Salad yang terdiri dari 1 cangkir bayam, 1 ons keju feta, 1 cangkir tomat ceri, 2 sendok makan perasan lemon, 3 ons salmon panggang \n" +
                    "\n" + "Makan Malam :\n" +
                    "6 ons udang kupas ditumis dengan paprika hijau, bawang putih, 1 sdm minyak zaitun, 1 cangkir nasi merah,  Air dengan potongan lemon atau jeruk nipis.\n"};
    int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        ListView = findViewById(R.id.ListView);
        ListMenu2.MyAdapter adapter = new ListMenu2.MyAdapter( this, mTitle, mDescription, images);
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
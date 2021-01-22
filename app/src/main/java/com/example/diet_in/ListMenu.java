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

public class ListMenu extends AppCompatActivity {
    android.widget.ListView ListView;
    String mTitle[]= {"Day 1","Day 2","Day 3", "Day 4","Day 5", "Day 6", "Day 7"};
    String mDescription[]= {"\n"+ "Sarapan : \n" +
            "Segelas jus jambu dan semangkuk oatmeal (tambahkan potongan pisang)\n" +
            "\n"+"Makan Siang : \n" +
            "Segelas jus jambu, sepiring kecil nasi merah, sup ayam tanpa lemak dan sambal kecap\n" +
            "\n"+"Makan Malam : \n" +
            "Segelas air putih, sepiring kecil nasi merah , orak-arik sayur  dan sambal kecap/tomat\n",

            "\n"+"Makan Pagi : \n" +
                    "Segelas susu rendah lemak , roti (gandum) bakar + selai kacang\n" +
                    "\n"+ "Makan Siang :\n" +
                    " Jus jeruk, sepiring kecil nasi merah,  pepes ikan bandeng ,dan mentimun\n" +
                    "\n"+"Makan Malam : \n" +
                    "Salad buah, yogurt rendah lemak, dan beberapa keping biskuit gandum\n",

            "\n"+"Makan Pagi : \n" +
                    "Segelas jus strawberi dan semangkuk oatmeal (tambahkan potongan strawberi)\n" +
                    "\n"+ "Makan Siang : \n" +
                    "Segelas jus strawberi , capcai kuah (sayuran + telur + potongan ayam tanpa lemak) , dan sambal kecap sebagai pelengkap\n" +
                    "\n"+ "Makan Malam : \n" +
                    "Segelas air putih, roti (gandum) bakar dengan selai kacang\n",

            "\n"+ "Makan Pagi : \n" +
                    "Segelas jus alpukat dan beberapa keping biskuit gandum\n" +
                    "\n"+"Makan Siang : \n" +
                    "Semangkuk es buah,  sepiring kecil nasi merah,  dada ayam bakar, sambal bawang , lalapan.\n" +
                    "\n"+ "Makan Malam : \n" +
                    "Segelas air putih , capcay kuah\n",

            "\n"+"Makan Pagi : \n" +
                    "Segelas susu rendah lemak,  roti (gandum) bakar (tambahkan potongan pisang)\n" +
                    "\n"+ "Makan Siang : \n" +
                    "Segelas jus strawberi , sepiring kecil nasi merah,  cah kangkung, dan sebutir telur rebus\n" +
                    "\n"+ "Makan Malam : \n" +
                    "Segelas air putih,  salad buah, dan yogurt rendah lemak\n",

            "\n"+ "Makan Pagi : \n" +
                    "Segelas jus alpukat , sepiring kecil omelet sayur\n" +
                    "\n"+"Makan Siang : \n" +
                    "Semangkuk es buah, sepiring kecil nasi merah , ikan bakar, sambal trasi, dan lalapan\n" +
                    "\n"+ "Makan Malam : \n" +
                    "Segelas air putih, sepiring kecil fu yung hay sayur\n",

            "\n"+"Makan Pagi : \n" +
                    "Segelas jus jambu dan oatmeal (tambahkan potongan pisang dan strawberi)\n" +
                    "\n"+ "Makan Siang : \n" +
                    "Segelas jus jambu, sepiring kecil nasi merah , sup sayur, tempe mendoan,  sambal kecap\n" +
                    "\n"+ "Makan Malam : \n" +
                    "Segelas susu rendah lemak , beberapa keping biskuit gandum ,dan 1 buah pir\n"};

    int images[] = {R.drawable.day1, R.drawable.day2, R.drawable.day3, R.drawable.day4, R.drawable.day5, R.drawable.day6, R.drawable.day7};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        ListView = findViewById(R.id.ListView);
        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images);
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
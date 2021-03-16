package yunusaslanhan.com.boom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GirisEkranActivity extends AppCompatActivity {

    Button btnOyna;
    EditText editTextArtis, editTextBoomSayi;

    public static int artisSayisi, boomSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_ekran);

        btnOyna = (Button) findViewById(R.id.btnOyna);
        editTextArtis = (EditText) findViewById(R.id.editTextArtıs);
        editTextBoomSayi = (EditText) findViewById(R.id.editTextBoomSayi);

        btnOyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean kontrol = true;
                String artis = editTextArtis.getText().toString();
                String boom = editTextBoomSayi.getText().toString();
               if(artis.equals("") || artis.equals("0")) {
                    editTextArtis.setError("1-9 Arası Sayı Giriniz!");
                    kontrol = false;
                }
                if(boom.equals("") || boom.equals("0")) {
                    editTextBoomSayi.setError("1-9 Arası Sayı Giriniz!");
                    kontrol = false;
                }

                if(kontrol) {
                    boomSayi = Integer.parseInt(boom);
                    artisSayisi = Integer.parseInt(artis);
                    Intent gecis = new Intent(GirisEkranActivity.this, OyunEkranActivity.class);

                    startActivity(gecis);
                    finish();
               }
           }
        });

    }

}

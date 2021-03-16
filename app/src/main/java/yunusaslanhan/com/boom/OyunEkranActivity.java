package yunusaslanhan.com.boom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OyunEkranActivity extends AppCompatActivity  {

        TextView txtPc, txtUser;
        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSil,btnBoom, btnKontrol;

        String sayi = " ";
        int pcCevap = 1, canSayisi = 3;
        int artis, boom;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_oyun_ekran);

            artis = GirisEkranActivity.artisSayisi;
            boom = GirisEkranActivity.boomSayi;

            txtPc = (TextView) findViewById(R.id.txtPc);
            txtUser = (TextView) findViewById(R.id.txtUser);


            btnKontrol =(Button)findViewById(R.id.btnKontrol);
            btn0 =(Button)findViewById(R.id.btn0);
            btn1 = (Button)findViewById(R.id.btn1);
            btn2 = (Button) findViewById(R.id.btn2);
            btn3 = (Button) findViewById(R.id.btn3);
            btn4 =(Button)findViewById(R.id.btn4);
            btn5 = (Button)findViewById(R.id.btn5);
            btn6 = (Button) findViewById(R.id.btn6);
            btn7 = (Button) findViewById(R.id.btn7);
            btn8 =(Button)findViewById(R.id.btn8);
            btn9 = (Button)findViewById(R.id.btn9);
            btnSil = (Button) findViewById(R.id.btnSil);
            btnBoom = (Button) findViewById(R.id.btnBoom);

            txtPc.setText(pcCevap + "");

            btnKontrol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean sart = false;
                    int olmasiGereken = pcCevap + artis;
                    if(olmasiGereken % boom == 0) {
                        if(sayi.equals("BOOM")) {
                            sayi = " ";
                            txtUser.setText(sayi);
                            sart = true;
                        }
                    } else {
                        if(!sayi.equals(" ") && !sayi.equals("BOOM")) {
                            int gelenSayi = Integer.parseInt(sayi.trim());
                            if (gelenSayi == olmasiGereken) {
                                sayi = " ";
                                txtUser.setText(sayi);
                                sart = true;
                            }
                        }
                    }
                    if(sart == false) {
                        canSayisi--;
                        sayi = " ";
                        txtUser.setText(sayi);
                        if(canSayisi == 2)
                            Toast.makeText(getApplicationContext(), "2 Canınız Kaldı!", Toast.LENGTH_SHORT).show();
                        else if(canSayisi == 1)
                            Toast.makeText(getApplicationContext(), "1 Canınız Kaldı!", Toast.LENGTH_SHORT).show();
                        else if(canSayisi <= 0) {
                            Toast.makeText(getApplicationContext(), "Kaybettiniz", Toast.LENGTH_LONG).show();
                            finish();
                            Intent gecis = new Intent(OyunEkranActivity.this, GirisEkranActivity.class);

                            startActivity(gecis);
                        }
                    } else {
                        pcCevap += artis * 2;
                        if (pcCevap % boom == 0)
                            txtPc.setText("BOOM");
                        else
                            txtPc.setText(pcCevap + "");
                    }
                }
            });

            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "0";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "1";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "2";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "3";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "4";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "5";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "6";
                        txtUser.setText(sayi);
                    }
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "7";
                        txtUser.setText(sayi);
                    }
                }
            });

            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "8";
                        txtUser.setText(sayi);
                    }
                }
            });

            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!sayi.equals("BOOM")) {
                        sayi += "9";
                        txtUser.setText(sayi);
                    }
                }
            });

            btnSil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String yeniSayi =  "";
                    if(sayi.equals("BOOM")) {
                        sayi = " ";
                    } else {
                        if (sayi.length() == 1)
                            sayi = " ";
                        else {
                            for (int i = 0; i < sayi.length(); i++) {
                                if (i == (sayi.length() - 1))
                                    break;
                                yeniSayi += sayi.charAt(i);
                            }
                            sayi = yeniSayi;
                        }
                    }
                    txtUser.setText(sayi);
                }
            });

            btnSil.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    sayi = " ";
                    txtUser.setText(sayi);
                    Toast.makeText(getApplicationContext()," cok uzun bastın", Toast.LENGTH_SHORT).show();
                    return false;
                }
            });

            btnBoom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi = "BOOM";
                    txtUser.setText(sayi);
                }
            });
        }

}



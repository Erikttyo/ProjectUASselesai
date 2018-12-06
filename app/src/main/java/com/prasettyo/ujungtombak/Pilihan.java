package com.prasettyo.ujungtombak;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Pilihan extends AppCompatActivity {

    Button btnpesanan, btncredit,btndetail, btnlaporan;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnpesanan = (Button) findViewById(R.id.btnPesanan);
        btncredit = (Button) findViewById(R.id.btnCredit);
        btndetail = (Button) findViewById(R.id.btnDetail);
        btnlaporan = (Button) findViewById(R.id.btnLaporan);

        btnlaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pilihan.this, Laporan.class);
                Pilihan.this.startActivity(intent);
            }
        });

        btndetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pilihan.this, Detail.class);
                Pilihan.this.startActivity(intent);
            }
        });

        btncredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pilihan.this, Credit.class);
                Pilihan.this.startActivity(intent);
            }
        });

        btnpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pilihan.this, Pesanan.class);
                Pilihan.this.startActivity(intent);
            }
        });

    }

        @Override
        public void onBackPressed() {
            new AlertDialog.Builder(this)
                    .setTitle("Keluar")
                    .setMessage("Yakin mau keluar nih?")
                    .setNegativeButton(android.R.string.no, null)
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {
                            Intent a = new Intent(Intent.ACTION_MAIN);
                            a.addCategory(Intent.CATEGORY_HOME);
                            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(a);

                            onBackPressed();
                            finish();
                        }
                    }).create().show();

    }
}
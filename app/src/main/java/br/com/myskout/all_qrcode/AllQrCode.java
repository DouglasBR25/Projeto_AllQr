package br.com.myskout.all_qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AllQrCode extends AppCompatActivity {
    Button btnMenos, btnMais, btnAplicarCupom, btnAdicionarItens, btnCombos, btnItem;
    EditText edtQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_qr_code);
        btnMenos = findViewById(R.id.btnMenos);
        btnMais = findViewById(R.id.btnMais);
        btnAplicarCupom = findViewById(R.id.btnAplicarCupom);
        btnAdicionarItens = findViewById(R.id.btnAdicionarItens);
        btnCombos = findViewById(R.id.btnCombos);
        btnItem = findViewById(R.id.btnItem);
        edtQuantidade = findViewById(R.id.edtQuantidade);


    }



}
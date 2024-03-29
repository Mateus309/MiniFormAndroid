package com.teste.miniform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private CheckBox l1, l2, l3;
    private String texto;
    private RadioButton sM, sF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editName);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        sM = findViewById(R.id.sM);
        sF = findViewById(R.id.sF);
    }

    public void sexo(){
        if(sM.isChecked()){
            texto = "Masculino";
        }else{
            texto = "Feminino";
        }
    }



    public void programacaoSelec(){
        if(l1.isChecked()){
            texto = " Java";
        }
        if(l2.isChecked()){
            texto += " PHP";
        }
        if(l3.isChecked()){
            texto += " C#";
        }
    }


    public void result(View view){
        TextView result = findViewById(R.id.Result);
        sexo();
        programacaoSelec();
        result.setText("nome: "+campoNome.getText().toString()+" "+texto);
            Toast.makeText(
                    getApplicationContext(),
                    "Salvo com sucesso",
                    Toast.LENGTH_LONG
            ).show();
        }
    }



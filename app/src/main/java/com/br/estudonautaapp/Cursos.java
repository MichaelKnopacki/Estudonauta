package com.br.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cursos extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clickVoltar(View view) {
        finish();
    }

    public void clickCursoPortugol(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }

    public void clickCursoC(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }

    public void clickCursoPHP(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }

    public void clickCursoCSharp(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }

    public void clickCursoKotlin(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }

    public void clickCursoVideo(View view) {
        nav=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com"));
        startActivity(nav);
    }
}
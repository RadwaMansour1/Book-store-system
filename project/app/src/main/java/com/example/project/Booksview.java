package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Booksview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_book);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        PDFView pdfView =findViewById(R.id.pdfView);
        pdfView.fromAsset(getIntent().getExtras().getString("pdf")).load();
    }
}
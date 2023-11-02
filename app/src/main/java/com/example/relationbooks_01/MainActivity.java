package com.example.relationbooks_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText isbn,title,abstract_bk,prize,year,editorial,author;

    Button register, filter_1, filter_2, filter_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isbn=findViewById(R.id.editTextISBN);
        title=findViewById(R.id.editTextTitle);
        abstract_bk=findViewById(R.id.editTextAbstract);
        prize=findViewById(R.id.editTextPrize);
        year=findViewById(R.id.editTextYear);
        editorial=findViewById(R.id.editTextEditorial);
        author=findViewById(R.id.editTextAuthor);

        register=findViewById(R.id.button);
        filter_1=findViewById(R.id.button2);
        filter_2=findViewById(R.id.button3);
        filter_3=findViewById(R.id.button4);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validación de datos
                //Que lleguen los campos
                String isbnText= isbn.getText().toString();
                String titleText= title.getText().toString();
                String abstractText= abstract_bk.getText().toString();
                String prizeText= prize.getText().toString();
                String yearText= year.getText().toString();
                String editorialText= editorial.getText().toString();
                String authorText= author.getText().toString();

                if ( isbnText.isEmpty() || titleText.isEmpty()
                || abstractText.isEmpty() || prizeText.isEmpty()
                || yearText.isEmpty() || editorialText.isEmpty()
                        || authorText.isEmpty()
                ){
                    Toast.makeText(getApplicationContext(),
                            "Todos los cmapos deben diligenciarse",
                        Toast.LENGTH_LONG).show();

                }else{
                    //Validar que el resumen tiene menos de 150 carácteres
                    if(abstractText.length()>=150){
                        Toast.makeText(getApplicationContext(),
                                "El resumen debe ser de menos de 150 carácteres",
                                Toast.LENGTH_LONG).show();
                    }else{

                    }

                }




            }
        });




    }
}
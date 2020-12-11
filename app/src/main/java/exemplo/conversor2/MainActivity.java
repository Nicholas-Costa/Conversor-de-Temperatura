package exemplo.conversor2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Teste de Som...
    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Abre a tela.xml
        setContentView(R.layout.tela);

        //Buscando os Dados...
        final EditText campo1 = (EditText) findViewById(R.id.edit1);
        final EditText campo2 = (EditText) findViewById(R.id.edit2);
        final EditText resultado = (EditText) findViewById(R.id.edit3);
        Button botao1 = (Button) findViewById(R.id.btn1);
        Button botao2 = (Button) findViewById(R.id.btn2);

        //Click do Botão 1...
        botao1.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){

                //Convertendo de Text para Double...
                double celsius = Double.parseDouble(campo1.getText().toString());

                //Cálculo...
                double calculofahrenheit = ((1.8*celsius)+32);
                resultado.setText(calculofahrenheit+" (ºF)");
            }
        });

        //Click do Botão 2...
        botao2.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){

                //Convertendo de Text para Double...
                double fahrenheit = Double.parseDouble(campo2.getText().toString());

                //Cálculo...
                double calculocelsius = ((fahrenheit-32)/1.8);
                resultado.setText(calculocelsius+" (ºC)");
            }
        });
    }
}

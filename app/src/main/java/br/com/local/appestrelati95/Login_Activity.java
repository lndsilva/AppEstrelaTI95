//Pacote do projeto

package br.com.local.appestrelati95;

//As bibliotecas que serão utilizadas pelo projeto

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Classe do projeto
public class Login_Activity extends AppCompatActivity {
    //Criar uma variável / atributo global do mesmo tipo do componente/view
    Button btnEntrar;
    EditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //chamada de método utilizada para carregar o layout.
        setContentView(R.layout.login_layout);

        //Ligar a variável ao componente no xml
        btnEntrar = findViewById(R.id.btnSignIn);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        //Criando evento de click no botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Cliquei em entrar", Toast.LENGTH_SHORT).show();

                //Conversão de tipos - EditText para String
                String email = txtEmail.getText().toString();
                String senha = txtSenha.getText().toString();

                if (email.equals("sac@sp.senac.br") && senha.equals("senac")) {
                    //Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                    //Abrir uma janela a partir do login
                    Intent abrirJanela = new Intent(Login_Activity.this, MenuPrincipal_Activity.class);
                    startActivity(abrirJanela);
                    //fechando a janela onde estou...
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    //método que irá executar o onclick no botão criar conta no xml
    public void criarConta(View view) {
        //Criando uma janela de mensagem para o usuário
        //Toast.makeText(getApplicationContext(), "Cliquei no botão criar conta!!!", Toast.LENGTH_SHORT).show();

        //outra forma de abrir uma janela
        startActivity(new Intent(getApplicationContext(),Cadastro_Activity.class));

    }
}
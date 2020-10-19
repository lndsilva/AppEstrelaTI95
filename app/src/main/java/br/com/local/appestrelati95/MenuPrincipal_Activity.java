package br.com.local.appestrelati95;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuPrincipal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
    }

    //Adicionando o menu criado no xml na janela de aplicação (Activity)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Adicionar o menu xml na barra do app
        //inflar o menu xml na barra ou instânciar o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Criando o evento de clique no menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //criando os itens de menu
        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no salvar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mVoltar:
                //ação de voltar para janela de login. Fechando a janela de menu principal.
                startActivity(new Intent(getApplicationContext(),
                        Login_Activity.class));
                finish();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
package com.br.teste.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.br.teste.R;
import com.br.teste.dao.AlunoDAO;
import com.br.teste.model.Aluno;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setTitle("Cadastro");

        final AlunoDAO alunoDAO = new AlunoDAO();

        final EditText nomeAluno = findViewById(R.id.nome_aluno);
        final EditText telefoneAluno = findViewById(R.id.telefone_aluno);
        final EditText emailAluno = findViewById(R.id.email_aluno);

        Button salvaAluno = findViewById(R.id.salvar_aluno);
        salvaAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = nomeAluno.getText().toString();
                String telefone = telefoneAluno.getText().toString();
                String email = emailAluno.getText().toString();

                Aluno alunoCriado = new Aluno(nome, telefone, email);

                alunoDAO.salva(alunoCriado);

                startActivity(new Intent(CadastroActivity.this,
                        ListadeAlunosActivity.class));
            }
        });
    }

}
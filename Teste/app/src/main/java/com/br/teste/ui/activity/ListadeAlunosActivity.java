package com.br.teste.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.br.teste.R;
import com.br.teste.dao.AlunoDAO;
import com.br.teste.model.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class ListadeAlunosActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlunoDAO dao = new AlunoDAO();
        setTitle("Lista de ALunos");
   //     List<Aluno> alunos = dao.todos();
        ListView listaDeAlunos = findViewById(R.id.activity_lista_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, simple_list_item_1, dao.todos()));
//        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, simple_list_item_1, dao.todos()));
//        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, simple_list_item_1, dao.todos()));
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, dao.todos());
//        ArrayAdapter<Aluno> adapter = new ArrayAdapter<Aluno> (this, android.R.layout.simple_list_item_1, alunos);
//        listaDeAlunos.setAdapter(adapter);
    }
}

package com.lucassalbu.simulator.domain.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lucassalbu.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupFloatingActionButton() {
        //TODO Criar evento de clik e simulação de partida
    }

    private void setupMatchesRefresh() {
        //TODO Atualizar as partidas na ação de swipe.
    }

    private void setupMatchesList() {
        //TODO listar as partidas, consumindo nossa API.
    }
}

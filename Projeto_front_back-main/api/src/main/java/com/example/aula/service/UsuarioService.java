package com.example.aula.service;

import com.example.aula.exception.JogadorJaCadastradoException;
import com.example.aula.model.Jogador;
import com.example.aula.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Jogador> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Jogador salvar(@Valid Jogador usuario) {
        if (usuarioRepository.findByCamisa(usuario.getCamisa()).isPresent()) {
            throw new JogadorJaCadastradoException("Usuário já cadastrado.");
        }

        return usuarioRepository.save(usuario);
    }

    public Jogador atualizar(@Valid Jogador usuario) {
        Jogador usuarioAtualizar = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado."));

        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setSexo(usuario.getSexo());
        usuarioAtualizar.setIdade(usuario.getIdade());
        usuarioAtualizar.setAltura(usuario.getAltura());
        usuarioAtualizar.setAltura(usuario.getAltura());
        usuarioAtualizar.setPeso(usuario.getPeso());
        usuarioAtualizar.setCamisa(usuario.getCamisa());

        return usuarioRepository.save(usuarioAtualizar);
    }

    public void excluir(Long id) {
        Jogador usuarioExcluir = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuarioRepository.deleteById(usuarioExcluir.getId());
    }

}

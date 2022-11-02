package com.miportfolioweb.Portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miportfolioweb.Portfolio.entity.Usuario;
import com.miportfolioweb.Portfolio.repository.UsuarioRepository;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nu){
        return usuarioRepository.findByNombreUsuario(nu);
    }

    public boolean existePorNombre(String nu){
        return usuarioRepository.existsByNombreUsuario(nu);
    }

    public void guardar(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
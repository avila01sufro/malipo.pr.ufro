package com.ufro.Malipo.repository;

import com.ufro.Malipo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
}

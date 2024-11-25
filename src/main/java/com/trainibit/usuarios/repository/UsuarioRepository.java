package com.trainibit.usuarios.repository;

import com.trainibit.usuarios.entity.Usuario;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UsuarioRepository extends AuditableRepository<Usuario, Long> {
    @Override
    default void deleteByIdActive(Long id){
        Usuario entity = findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
        entity.setActive(false);
        save(entity);
  }

    @Override
    default Usuario UpdateAudit(Usuario entity){
        entity.setUpdatedat(LocalDate.now());
        return save(entity);
  }

}

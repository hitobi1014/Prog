package com.backend.prog.domain.manager.dao;

import com.backend.prog.domain.manager.domain.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends JpaRepository<Code, Integer> {
    Code findByName(String name);
}

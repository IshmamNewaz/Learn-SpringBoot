package com.assignment.assignment.repository;
import com.assignment.assignment.model.Module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
    List<Module> findByName(String name);
}

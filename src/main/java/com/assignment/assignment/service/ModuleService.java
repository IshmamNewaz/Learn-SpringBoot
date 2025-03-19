package com.assignment.assignment.service;
import com.assignment.assignment.model.Module;
import com.assignment.assignment.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ModuleService {

    @Autowired
    private ModuleRepository repository;

    public List<Module> getAllModules() {
        return repository.findAll();
    }

    public Module getModuleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Module> getModulesByName(String name) {
        return repository.findByName(name);
    }

    public Module addModule(Module module) {
        return repository.save(module);
    }

    public Module updateModule(Long id, Module updatedModule) {
        updatedModule.setId(id);
        return repository.save(updatedModule);
    }

    public void deleteModule(Long id) {
        repository.deleteById(id);
    }
}
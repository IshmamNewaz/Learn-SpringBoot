package com.assignment.assignment.controller;
import com.assignment.assignment.model.Module;
import com.assignment.assignment.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modules")
public class ModuleController {

    @Autowired
    private ModuleService service;

    @GetMapping
    public List<Module> getAllModules() {
        return service.getAllModules();
    }

    @GetMapping("/{id}")
    public Module getModuleById(@PathVariable Long id) {
        return service.getModuleById(id);
    }

    @GetMapping("/name/{name}")
    public List<Module> getModulesByName(@PathVariable String name) {
        return service.getModulesByName(name);
    }

    @PostMapping
    public Module createModule(@RequestBody Module module) {
        return service.addModule(module);
    }

    @PutMapping("/{id}")
    public Module updateModule(@PathVariable Long id, @RequestBody Module module) {
        return service.updateModule(id, module);
    }

    @DeleteMapping("/{id}")
    public String deleteModule(@PathVariable Long id) {
        service.deleteModule(id);
        return "{ \"message\": \"Module deleted successfully\" }";
    }
}

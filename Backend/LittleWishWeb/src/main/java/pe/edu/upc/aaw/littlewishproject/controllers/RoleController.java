package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.RoleDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Role;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void registrar(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<RoleDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

}

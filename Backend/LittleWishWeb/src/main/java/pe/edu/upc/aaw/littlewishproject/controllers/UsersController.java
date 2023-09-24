package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.UsersDTO;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUserService;
import pe.edu.upc.aaw.littlewishproject.dtos.Puntuacion_UsersDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUserService uS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void Registrar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<UsersDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @GetMapping("/UsuariosMejorPuntuados")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<Puntuacion_UsersDTO> usersPorpuntuacion() {
        List<String[]> lista = uS.usernameBypuntuacion();
        List<Puntuacion_UsersDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            Puntuacion_UsersDTO dto = new Puntuacion_UsersDTO();
            dto.setUsername(data[0]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/findByDNI")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public UsersDTO findByDNI(@RequestParam int dni) {
        Users user = uS.findByDNI(dni);
        if (user != null) {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(user, UsersDTO.class);
        } else {
            // Manejo de usuario no encontrado
            return null;
        }
    }

    @GetMapping("/findByRole")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public List<String> findByRole(@RequestParam String rol) {
        return uS.findUsersByRole(rol);
    }

    @GetMapping("/findCVByUsername")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public CurriculumVitaeDTO findCVByUsername(@RequestParam("username") String username) {
        CurriculumVitae cv = uS.findCVByUsername(username);
        if (cv != null) {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(cv, CurriculumVitaeDTO.class);
        } else {

            return null;
        }
    }
    @GetMapping("/countByRole")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public int contarUsuariosPorRol(@RequestParam String rol) {
        return uS.contarUsuariosPorRol(rol);
    }


}
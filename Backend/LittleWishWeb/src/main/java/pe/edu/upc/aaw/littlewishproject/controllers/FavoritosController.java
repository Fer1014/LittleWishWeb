package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.FavoritosDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Favoritos;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IFavoritosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/favoritos")
public class FavoritosController {

    @Autowired
    private IFavoritosService fS;
    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void insertar(@RequestBody FavoritosDTO dto){
        ModelMapper m = new ModelMapper();
        Favoritos u = m.map(dto, Favoritos.class);
        fS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public List<FavoritosDTO> listar() {
        return fS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FavoritosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void eliminar(@PathVariable("id") Integer id){
        fS.delete(id);
    }
}

package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CarrerasDTO;
import pe.edu.upc.aaw.littlewishproject.dtos.TarjetaDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Carreras;
import pe.edu.upc.aaw.littlewishproject.entities.Tarjeta;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tS;

    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void Registrar(@RequestBody TarjetaDTO dto){
        ModelMapper m=new ModelMapper();
        Tarjeta t=m.map(dto,Tarjeta.class);
        tS.insert(t);
    }
    @GetMapping//obtener
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public List<TarjetaDTO> listar(){
        return  tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TarjetaDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void modificar(@RequestParam int id, @RequestBody TarjetaDTO dto) {
        ModelMapper m = new ModelMapper();
        Tarjeta t = m.map(dto, Tarjeta.class);
        t.setIdTarjeta(id); // Establecer el ID del objeto que se va a modificar
        tS.insert(t);
    }
    @DeleteMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void eliminar(@RequestParam("id") Integer id) {
        tS.delete(id);
    }


}

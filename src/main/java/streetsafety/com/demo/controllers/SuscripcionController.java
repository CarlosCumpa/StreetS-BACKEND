package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.SuscripcionDTO;
import streetsafety.com.demo.entities.Suscripcion;
import streetsafety.com.demo.services.ISuscripcionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService sS;

    @PostMapping
    public void insert(@RequestBody SuscripcionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripcion s=m.map(dto,Suscripcion.class);
        sS.insert(s);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SuscripcionDTO>list(){
        return sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){sS.delete(id);}

    @GetMapping("/{id}")
    public SuscripcionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        SuscripcionDTO dto=m.map(sS.listId(id),SuscripcionDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody SuscripcionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripcion s=m.map(dto,Suscripcion.class);
        sS.insert(s);
    }
}

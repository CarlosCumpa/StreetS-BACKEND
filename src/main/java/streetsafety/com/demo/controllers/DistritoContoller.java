package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.AlertaDTO;
import streetsafety.com.demo.dtos.DistritoDTO;
import streetsafety.com.demo.entities.Alerta;
import streetsafety.com.demo.entities.Distrito;
import streetsafety.com.demo.services.IDistritoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distritos")
public class DistritoContoller {
    @Autowired
    private IDistritoService dS;
    @PostMapping
    public void insert(@RequestBody AlertaDTO dto){
        ModelMapper m=new ModelMapper();
        Distrito d=m.map(dto,Distrito.class);
        dS.insert(d);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DistritoDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, DistritoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){dS.delete(id);}
    @GetMapping("/{id}")
    public DistritoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        DistritoDTO dto=m.map(dS.listId(id),DistritoDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody DistritoDTO dto){
        ModelMapper m=new ModelMapper();
        Distrito d=m.map(dto,Distrito.class);
        dS.insert(d);
    }

}

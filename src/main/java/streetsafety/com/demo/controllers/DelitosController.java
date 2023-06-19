package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.DelitosDTO;
import streetsafety.com.demo.dtos.SuscripcionDTO;
import streetsafety.com.demo.entities.Delitos;
import streetsafety.com.demo.services.IDelitoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/delitos")
public class DelitosController {
    @Autowired
    private IDelitoService dS;
    @PostMapping
    public void insert (@RequestBody DelitosDTO dto){
        ModelMapper m =new ModelMapper();
        Delitos d=m.map(dto,Delitos.class);
        dS.insert(d);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DelitosDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DelitosDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){dS.delete(id);}
    @GetMapping("/{id}")
    public DelitosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        DelitosDTO dto=m.map(dS.listId(id),DelitosDTO.class);
        return dto;
    }
    @PutMapping
    public void  goUpdate(@RequestBody DelitosDTO dto){
        ModelMapper m=new ModelMapper();
        Delitos d=m.map(dto,Delitos.class);
        dS.insert(d);
    }

}

package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.AlertaDTO;
import streetsafety.com.demo.dtos.SuscripcionDTO;
import streetsafety.com.demo.entities.Alerta;
import streetsafety.com.demo.entities.Suscripcion;
import streetsafety.com.demo.services.IAlertaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alertas")
public class AlertaController {
    @Autowired
    private IAlertaService aS;
    @PostMapping
    public void insert(@RequestBody AlertaDTO dto){
        ModelMapper m=new ModelMapper();
        Alerta a=m.map(dto,Alerta.class);
        aS.insert(a);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<AlertaDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AlertaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){aS.delete(id);}
    @GetMapping("/{id}")
    public AlertaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        AlertaDTO dto=m.map(aS.listId(id),AlertaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody AlertaDTO dto){
        ModelMapper m=new ModelMapper();
        Alerta s=m.map(dto,Alerta.class);
        aS.insert(s);
    }


}

package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.DelitosDTO;
import streetsafety.com.demo.dtos.TipoDelitosDTO;
import streetsafety.com.demo.entities.Delitos;
import streetsafety.com.demo.entities.TipoDelitos;
import streetsafety.com.demo.services.IDelitoService;
import streetsafety.com.demo.services.ITipoDelitosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoodelitos")
public class TipoDelitosController {
    @Autowired
    private  ITipoDelitosService dS;
    @PostMapping
    public void insert (@RequestBody TipoDelitosDTO dto){
        ModelMapper m =new ModelMapper();
        TipoDelitos d=m.map(dto,TipoDelitos.class);
        dS.insert(d);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TipoDelitosDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoDelitosDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){dS.delete(id);}
    @GetMapping("/{id}")
    public TipoDelitosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TipoDelitosDTO dto=m.map(dS.listId(id),TipoDelitosDTO.class);
        return dto;
    }
    @PutMapping
    public void  goUpdate(@RequestBody TipoDelitosDTO dto){
        ModelMapper m=new ModelMapper();
       TipoDelitos d=m.map(dto,TipoDelitos.class);
        dS.insert(d);
    }
}

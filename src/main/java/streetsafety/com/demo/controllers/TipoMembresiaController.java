package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.TipoMembresiaDTO;
import streetsafety.com.demo.entities.TipoMembresia;
import streetsafety.com.demo.services.ITipoMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposmembresias")
public class TipoMembresiaController {
    @Autowired
    private ITipoMembresiaService tmS;

    //INSERTAR
    @PostMapping
    public void insert(@RequestBody TipoMembresiaDTO dto){
        ModelMapper m=new ModelMapper();
        TipoMembresia tm=m.map(dto,TipoMembresia.class);
        tmS.insert(tm);
    }

    //LIST
    @GetMapping
    public List<TipoMembresiaDTO>list(){
        return tmS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoMembresiaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    List<TipoMembresiaDTO>search(@RequestBody Integer tmembresia){
        return tmS.findByTMembresia(tmembresia).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoMembresiaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){tmS.delete(id);}
}

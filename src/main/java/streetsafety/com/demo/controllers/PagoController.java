package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.PagoDTO;
import streetsafety.com.demo.dtos.PagoTotalDTO;
import streetsafety.com.demo.entities.Pago;
import streetsafety.com.demo.services.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pS;

    @PostMapping
    public void insert(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago p=m.map(dto,Pago.class);
        pS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<PagoDTO>list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){pS.delete(id);}

    @GetMapping("/total")
    PagoTotalDTO pdt(){return pS.pdt();}
}

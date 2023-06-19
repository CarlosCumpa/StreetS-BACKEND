package streetsafety.com.demo.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import streetsafety.com.demo.dtos.UsersDto;
import streetsafety.com.demo.entities.Users;
import streetsafety.com.demo.services.IUserService;

import javax.validation.Valid;


@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private PasswordEncoder bcrypt;

    @Autowired
    private IUserService uService;

    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)throws Exception{
            if(result.hasErrors()){
                return "usersecurity/user";
            }else{
                String bcryptpassword=bcrypt.encode(user.getPassword());
                user.setPassword(bcryptpassword);
                int rpta=uService.insert(user);
                if(rpta>0){
                    model.addAttribute("mensaje","Ya existe");
                    return "usersecurity/user";
                }else{
                    model.addAttribute("mensaje","Se guardó correctamente");
                    status.setComplete();
                }
            }
            model.addAttribute("listaUsuarios",uService.list());
            return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable("id")Long id){
        uService.delete(Math.toIntExact(id));
    }
    @GetMapping("/{id}")
    public UsersDto listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsersDto  dto = m.map(uService.listId(id), UsersDto.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UsersDto dto){
        ModelMapper m=new ModelMapper();
        Users p=m.map(dto,Users.class);
        uService.insert(p);
    }
}









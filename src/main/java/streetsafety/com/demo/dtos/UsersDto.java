package streetsafety.com.demo.dtos;

import streetsafety.com.demo.entities.Suscripcion;


import java.time.LocalDate;

public class UsersDto {
    private Long id;

   private String username;

    private String password;
    private String email;
    private String nombres_usuario;

    private String apellidos_usuario;
    private LocalDate fecha_nacimiento;

    private Suscripcion sub;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Suscripcion getSub() {
        return sub;
    }

    public void setSub(Suscripcion sub) {
        this.sub = sub;
    }
}

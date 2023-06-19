package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    List<Role> list();
}

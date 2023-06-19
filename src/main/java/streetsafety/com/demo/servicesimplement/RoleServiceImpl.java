package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Role;
import streetsafety.com.demo.repositories.RoleRepository;
import streetsafety.com.demo.services.IRoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role){rR.save(role);}

    @Override
    public List<Role>list(){
        return rR.findAll();
    }
}

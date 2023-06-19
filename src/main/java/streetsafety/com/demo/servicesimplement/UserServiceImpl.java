package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Users;
import streetsafety.com.demo.repositories.UserRepository;
import streetsafety.com.demo.services.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public Integer insert(Users user) {
        int rpta=uR.buscarUsername(user.getUsername());
        if(rpta==0){
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idU) {
        uR .deleteById((long) idU);
    }

    @Override
    public Users listId(int IdU) {
        return  uR.findById((long) IdU).orElse(new Users());
    }
}

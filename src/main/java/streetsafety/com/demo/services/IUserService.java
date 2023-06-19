package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Users;

import java.util.List;

public interface IUserService {

    public Integer insert(Users user);
    List<Users> list();
    public  void delete(int idU);
    public  Users listId(int IdU);
}

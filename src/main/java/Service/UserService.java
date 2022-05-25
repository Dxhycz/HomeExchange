package main.java.Service;

import main.java.Dao.UserDao;
import main.java.Interface.UserInterface;
import main.java.Model.User;

public class UserService implements UserInterface {
    UserDao ud = new UserDao();

    @Override
    public boolean login(String name, String password) {
        System.out.println(ud.login(name, password));
        return ud.login(name, password);
    }
    @Override
    public boolean register(User user) {
        return ud.register(user);
    }

}


package main.java.Interface;

import main.java.Model.User;

import java.util.Map;

public interface UserInterface {
    public boolean login(String name,String password);

    public Map<String,Object> loginUser(String name, String password);
    // 处理注册
    public boolean register(User user);
}

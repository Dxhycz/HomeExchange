package main.java.Interface;

import main.java.Model.User;

public interface UserInterface {
    public boolean login(String name,String password);
    // 处理注册
    public boolean register(User user);
}

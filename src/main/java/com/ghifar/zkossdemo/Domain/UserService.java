package com.ghifar.zkossdemo.Domain;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public List<User> search(String name);
}

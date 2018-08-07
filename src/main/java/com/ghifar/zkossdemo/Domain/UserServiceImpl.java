package com.ghifar.zkossdemo.Domain;

import org.zkoss.zul.ext.Selectable;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UserServiceImpl implements UserService {

    private List<User> userList= new LinkedList<User>();
    private static Integer id=1;

    public UserServiceImpl() {
        userList.add(new User(id++, "ghifar", "Men","/images/pasfoto.JPG"));
        userList.add(new User(id++, "ghifar1", "Women","/images/account.png"));
        userList.add(new User(id++, "ghifar2", "Men","/images/account.png"));
        userList.add(new User(id++, "ghifar3", "Women","/images/account.png"));
        userList.add(new User(id++, "ghifar4", "Men","/images/account.png"));
        userList.add(new User(id++, "ghifar5", "Women","/images/account.png"));
        userList.add(new User(id++, "ghifar6", "Women","/images/account.png"));
        userList.add(new User(id++, "ghifar7", "Women","/images/account.png"));
        userList.add(new User(id++, "ghifar8", "Men","/images/account.png"));

    }

    public List<User> findAll() {
        return userList;
    }

    public List<User> search(String name) {
        List<User> result= new LinkedList<User>();
        if(name== null || "".equals(name)){
            result= userList;
        }else{
            for (User u: userList){
                if (u.getUsername().toLowerCase().contains(name.toLowerCase())){
                    result.add(u);
                }
            }
        }
        return result;
    }

}

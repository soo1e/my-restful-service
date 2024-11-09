package kr.co.soo1e.myrestfulservice.dao;

import kr.co.soo1e.myrestfulservice.bean.User;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 2;

    static {
        users.add(new User(1, "Soo1e", new Date()));
        users.add(new User(2, "Jingnny", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }

        if (user.getJoinDate() == null) {
            user.setJoinDate(new Date());
        }

        users.add(user);

        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}

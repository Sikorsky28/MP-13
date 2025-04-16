package ru.mentee.power;

import java.util.ArrayList;
import java.util.List;




    public class UserService {
        private List<String> users;

        public UserService() {
            users = new ArrayList<>();
        }

        public void addUser(String username) {
            users.add(username);
            System.out.println("Пользователь добавлен: " + username);
        }
    }

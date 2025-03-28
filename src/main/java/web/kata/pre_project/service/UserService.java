package web.kata.pre_project.service;


import web.kata.pre_project.model.User;

import java.util.List;

public interface UserService {
    public void save(User user);

    public User findById(Long id);

    public List<User> findAll();

    public void update(User user);

    public void delete(Long id);
}

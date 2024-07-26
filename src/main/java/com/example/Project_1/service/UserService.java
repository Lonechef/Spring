    package com.example.Project_1.service;
    import java.util.List;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import com.example.Project_1.model.User;
    import com.example.Project_1.repositry.UserRepositry;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;

    @Service
    public class UserService {
        @Autowired
        private UserRepositry userRepositry;

        public List<User> findAll() {
            return userRepositry.findAll();
        }

        public User findById(String id) {
            return userRepositry.findById(id).orElse(null);
        }

        public User save(User user) {
            return userRepositry.save(user);
        }

        public void deleteById(String id) {
            userRepositry.deleteById(id);
        }
        public User update(String id, User user) {
            if (userRepositry.existsById(id)) {
                user.setId(id);
                return userRepositry.save(user);
            }
            return null;
        }
    }

        package com.example.Project_1.controller;

        import java.util.List;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import com.example.Project_1.model.User;
        import com.example.Project_1.service.UserService;

        @RestController
        @RequestMapping("/users")
        public class UserController {
            @Autowired
            private UserService userService;

            @GetMapping
            public List<User> getAllusers(){
                return  userService.findAll();
            }
            @GetMapping("/{id}")
                public User getUserById(@PathVariable String id){
                    return  userService.findById(id);

            }
            @PostMapping
            public User createUser(@RequestBody User user){
                return userService.save(user);
            }

            @DeleteMapping("/{id}")
            public void deleteUserById(@PathVariable String id){
                userService.deleteById(id);
            }

        }

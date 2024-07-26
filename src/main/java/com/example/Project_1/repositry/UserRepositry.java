        package com.example.Project_1.repositry;

        import org.springframework.data.mongodb.repository.MongoRepository;
        import com.example.Project_1.model.User;

        public interface UserRepositry extends MongoRepository<User,String>{

        }

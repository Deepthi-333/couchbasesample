package com.example.couchbasesample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Components of the type CommandLineRunner are called right after
 * the application start up. So the method *run* is called as soon as
 * the application starts.
 */
@Component
public class CmdRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... strings) throws Exception {

        UserEntity u1 = createUser("user::0001", "Perry", "Manson", "perry.mason@acme.com", "Who can we get on the case?");
        userRepository.save(u1);

        UserEntity u2 = createUser("user::0002", "Major", "Tom", "major.tom@acme.com", "Send me up a drink");
        userRepository.save(u2);


        UserEntity u3 = createUser("user::0003", "Jerry", "Wasaracecardriver", "jerry.wasaracecardriver@acme.com", "el sob number one");
        userRepository.save(u3);

        Optional<UserEntity> user = userRepository.findById("user::0001");
        System.out.println("User found = "+user.get().getFirstName());

        List<UserEntity> result = userRepository.findByEmailLike("%@acme.com");

        System.out.println( "Total of @acme.com users = "+result.size()  );

    }

    public static UserEntity createUser(String id, String firstName, String lastName,
                                  String email, String tagLine) {
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setTagLine(tagLine);
        return user;
    }

}
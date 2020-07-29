package de.hsba.bi.einkaufshelfer.web.account;

import de.hsba.bi.einkaufshelfer.user.User;
import de.hsba.bi.einkaufshelfer.user.UserRepository;
import de.hsba.bi.einkaufshelfer.user.UserService;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.transaction.Transactional;
import static org.junit.jupiter.api.Assertions.*;



@Transactional
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private  UserService userService;

    @BeforeEach
    void setUp(){
        userRepository.deleteAll();
    }

    @Test
    void CreateNewUserTest(){


        assertTrue(userService.findAll().isEmpty());
        userService.createUser("Tom","pw1234", User.NEEDY_ROLE);
        assertFalse(userService.findAll().isEmpty());


    }
}
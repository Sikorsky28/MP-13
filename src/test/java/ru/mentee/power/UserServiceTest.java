package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testAddUser_ThrowsNullPointerException() {
        UserService service = new UserService();
        // Это вызовет NullPointerException, потому что список users не инициализирован
        assertThrows(NullPointerException.class, () -> service.addUser("John"));
    }

}
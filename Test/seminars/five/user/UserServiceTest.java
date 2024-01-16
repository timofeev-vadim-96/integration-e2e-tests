package seminars.five.user;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private static UserRepository userRepository;
    private static UserService userService;

    @BeforeAll
    static void setUp() {
        userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,4})
    void getUserName(int id) {
        assertTrue(userService.getUserName(id).contains(String.valueOf(id)));
    }
}
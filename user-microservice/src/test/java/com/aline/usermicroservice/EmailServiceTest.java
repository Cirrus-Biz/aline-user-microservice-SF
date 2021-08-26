package com.aline.usermicroservice;

import com.aline.core.aws.email.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.HashMap;
import java.util.Map;

@ActiveProfiles("test")
@SpringBootTest
@Slf4j(topic = "Email Service Test")
class EmailServiceTest {

    @Autowired
    EmailService emailService;

    @Test
    void test_interpolateVariablesInLine() {
        String message = "Hello, ${name}! My favorite color is ${color}.";
        Map<String, String> variables = new HashMap<>();
        variables.put("name", "Test Boy");
        variables.put("color", "red");
        log.info(emailService.interpolateVariablesInLine(message, variables));
    }

}

package com.example.keyvaluespring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private TestProperties testProperties;
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public MyController(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    @GetMapping
    public String getAllValues() throws JsonProcessingException {
        return MAPPER.writeValueAsString(testProperties);
    }
}

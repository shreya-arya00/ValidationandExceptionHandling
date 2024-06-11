package com.example.validation;

import com.example.validation.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenInvalidInput_thenReturns400WithErrors() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setUsername(""); // Invalid username
        userDto.setEmail("invalid-email");
        userDto.setPassword("123");

        String jsonResponse = mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\":\"\",\"email\":\"invalid-email\",\"password\":\"123\"}"))
                .andDo(MockMvcResultHandlers.print()) // Print the response for debugging
                .andExpect(status().isBadRequest())
                .andReturn()
                .getResponse()
                .getContentAsString();

        System.out.println("JSON Response: " + jsonResponse);
    }
}

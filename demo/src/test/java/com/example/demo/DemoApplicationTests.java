package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Test
	void contextLoads() throws Exception {
	}





	@Test
	public void getUsers(@Autowired MockMvc mvc) throws Exception {
		mvc.perform(get("/").accept(MediaType.APPLICATION_JSON)).andDo(print());
	}


}

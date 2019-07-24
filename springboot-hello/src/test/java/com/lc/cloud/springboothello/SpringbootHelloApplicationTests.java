package com.lc.cloud.springboothello;

import com.lc.cloud.springboothello.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * HelloController的测试类.
 *
 * @author zyz.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootHelloApplication.class)
@WebAppConfiguration
public class SpringbootHelloApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    /**
     * Function: index()方法测试.
     *
     * @throws Exception
     */
    @Test
    public void testHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello world")));
    }

}

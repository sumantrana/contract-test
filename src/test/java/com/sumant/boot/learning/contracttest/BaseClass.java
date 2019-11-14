package com.sumant.boot.learning.contracttest;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContractTestApplication.class)
public abstract class BaseClass {

    @Autowired
    BookRestController bookRestController;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(bookRestController);
    }

}


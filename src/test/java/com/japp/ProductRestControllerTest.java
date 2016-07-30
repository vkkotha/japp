package com.japp;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.japp.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ProductRestControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        Collection<Product> products = this.restTemplate.getForObject("/api/products", (Class<? extends Collection<Product>>)Collection.class);
        assertThat(products.size() > 1);
    }
}

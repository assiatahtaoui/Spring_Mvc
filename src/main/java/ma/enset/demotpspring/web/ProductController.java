package ma.enset.demotpspring.web;

import ma.enset.demotpspring.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;

@Controller
public class ProductController {
    @Autowired
    private Productrepo productrepo;

    @GetMapping( "/index")

            public String index() {
        return "products";
    }



}

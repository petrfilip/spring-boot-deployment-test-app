package cz.tix.upce.deployment;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  Faker faker = new Faker();

  @GetMapping
  public DtoOut getChuckNorrisFact() {
    String fact = faker.chuckNorris().fact();
    return new DtoOut(fact);
  }

}

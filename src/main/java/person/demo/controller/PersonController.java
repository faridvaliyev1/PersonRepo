package person.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import person.demo.Repository.IPersonRepository;
import person.demo.models.Person;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
    @Autowired
    private IPersonRepository personRepository;

    @GetMapping(value="/person")
    public @ResponseBody List<Person> getPersons(@RequestParam("search") String name){
       return personRepository.Search(name.toLowerCase());
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }
}

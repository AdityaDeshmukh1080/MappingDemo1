package MappingDemo1.MappingDemo1.Controller;

import MappingDemo1.MappingDemo1.Model.Passport;
import MappingDemo1.MappingDemo1.Model.Person;
import MappingDemo1.MappingDemo1.PayLoad.PersonPassport;
import MappingDemo1.MappingDemo1.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonPassportController {
    @Autowired
    private Service service;

    @PostMapping("/saveData")
    public void saveInformation(@RequestBody PersonPassport temp){
        service.saveData(temp);
    }

    @GetMapping("/getData")
    public List<Person> getData(){
        return service.getData();
    }
    @GetMapping("/getPassportInfo")
    public List<Passport> getPassportInformation(){
        return  service.getPassportInformation();
    }
}

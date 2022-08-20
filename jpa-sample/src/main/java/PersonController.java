//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import sample.jpatemplate.model.Singer;
//
//import java.util.List;
//
//@RestController
//public class PersonController {
//
//    @Autowired
//    PersonService personService;
//
//    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
//    public @ResponseBody Singer getAllUsers(@PathVariable Long id) {
//        return personService.getById(id);
//    }
//
//    @RequestMapping(value = "/personByName/{name}", method = RequestMethod.GET)
//    public List<Singer> getPersoneByName(@PathVariable String name) {
//        return personService.findByName(name);
//    }
//
//    @RequestMapping(value = "/person", method = RequestMethod.GET)
//    public List<Singer> getAll() {
//        return personService.getAllPersons();
//    }
//
//    @RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
//    public HttpStatus deletePersnone(@PathVariable Long id) {
//        personService.deletePerson(id);
//        return HttpStatus.NO_CONTENT;
//    }
//
//    @RequestMapping(value = "/person", method = RequestMethod.POST)
//    public HttpStatus insertPersone(@RequestBody Singer person) {
//        return personService.addPerson(person) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
//    }
//
//    @RequestMapping(value = "/person", method = RequestMethod.PUT)
//    public HttpStatus updatePerson(@RequestBody Singer person) {
//        return personService.updatePerson(person) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
//    }
//
//}
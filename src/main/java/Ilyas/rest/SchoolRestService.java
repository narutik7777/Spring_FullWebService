package Ilyas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Ilyas.service.SchoolService;
import java.security.Principal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@RestController
@RequestMapping("/public/rest/schools")
public class SchoolRestService {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(schoolService.listAll());
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id, @AuthenticationPrincipal Principal principal) {

        if (principal == null) {
            throw new ForbiddenException();
        }
//        MyLogin activeUser = (MyLogin) ((Authentication) principal).getPrincipal();
//        activeUser.getUsername();

        schoolService.delete(id);
    }

    @RequestMapping(value = "/mockdelete/{id}", method = RequestMethod.GET)
    public void mockdelete(@PathVariable("id") Integer id, @AuthenticationPrincipal Principal principal) {
        if (principal == null) {
            throw new ForbiddenException();
        }
//        MyLogin activeUser = (MyLogin) ((Authentication) principal).getPrincipal();
//        activeUser.getUsername();

        schoolService.delete(id);
    }

    @RequestMapping(value = "/add/{number}/{name}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("number") Integer number, @PathVariable("name") String name, @AuthenticationPrincipal Principal principal) {
        if (principal == null) {
            throw new ForbiddenException();
        }
//        MyLogin activeUser = (MyLogin) ((Authentication) principal).getPrincipal();
//        activeUser.getUsername();

        return ResponseEntity.ok(schoolService.add(number, name));
    }

}

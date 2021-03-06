package ru.esbt.adres1;

/**
 *
 * @author ДНС
 */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Adres1Controller {

    @RequestMapping(method = RequestMethod.GET)
    public String halloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String halloName(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }
}
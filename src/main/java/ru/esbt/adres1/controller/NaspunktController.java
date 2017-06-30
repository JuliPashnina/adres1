package ru.esbt.adres1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.esbt.adres1.domain.Naspunkt;
import ru.esbt.adres1.repository.DataRepositoryImpl;
import ru.esbt.adres1.repository.NaspunktRepository;
import ru.esbt.adres1.service.DataService;
/**
 *
 * @author ДНС
 */
@RestController
//@RequestMapping(value = "/naspunkt")
public class NaspunktController {


    @Autowired
    @Qualifier("dataService")
    private DataService dataService;
   /* DataRepositoryImpl naspunktRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Naspunkt> getAll() {
        return naspunktRepository.getData();
    }*/
    @RequestMapping(value = "/naspunkt", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getRandomData() throws RestException {
        try {
            Set<String> result = dataService.getRandomData();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }
}
    

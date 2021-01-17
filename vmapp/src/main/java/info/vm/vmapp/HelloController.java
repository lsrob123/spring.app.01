package info.vm.vmapp;

import org.springframework.web.bind.annotation.RestController;

import java.time.*;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello " + LocalDateTime.now();
    }
}

package com.example.now;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * @author Alex Bostan (alex.bostan@hostelworld.com)
 * @version $Id$
 * @since 1.0
 */
@RestController
@EnableAutoConfiguration
public class NowController {
    @RequestMapping("/")
    public String test() {
        return DateTimeFormatter.ISO_DATE.format(LocalDate.now());
    }
}

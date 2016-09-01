package org.thehecklers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mark Heckler (mark.heckler@gmail.com, @mkheck)
 */
@RestController
public class ReadingController {
    @Autowired
    Reading lastReading;

    @RequestMapping("/lastreading")
    public Reading getLastReading() {
        return lastReading;
    }
}

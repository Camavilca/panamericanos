package com.panamericano;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("index")
public class PanamericanoController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "panamericano";
    }
}

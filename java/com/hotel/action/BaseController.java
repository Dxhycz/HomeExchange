package com.hotel.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/baseapi")
public class BaseController {

    @RequestMapping("/test")
    public Object value(){
        return Collections.singletonMap("success","true");
    }
}

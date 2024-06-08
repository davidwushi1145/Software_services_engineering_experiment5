package wushi.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @RequestMapping("/fallback")
    public String fallback() {
        return "Service is unavailable at the moment. Please try again later.";
    }
}


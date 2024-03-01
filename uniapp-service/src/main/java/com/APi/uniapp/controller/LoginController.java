package com.APi.uniapp.controller;
import com.APi.uniapp.until.WeChatAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private WeChatAuthService weChatAuthService;

    @GetMapping("/user")
    public Mono<String> loginWithWeChat(@RequestParam("js_code") String js_code) {
        System.out.println("js_code:" + js_code);
        System.out.println(weChatAuthService.getSessionInfo(js_code));




        return weChatAuthService.getSessionInfo(js_code);
    }
    @GetMapping("/user2")
    public String loginWithWeChat2() {

        return "123";
    }
}
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class DemoController {

    @GetMapping("/myDemo")
    public String test(){
        System.out.println("fhfshgdfsjfgshfdshj");
        System.out.println("kkkkkkk");
        System.out.println("第二次提交");
        System.out.println("111111111111111");
        System.out.println(222222222);
        return "1111";
    }


}

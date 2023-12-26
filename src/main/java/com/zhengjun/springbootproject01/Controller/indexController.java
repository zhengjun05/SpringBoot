package com.zhengjun.springbootproject01.Controller;

import com.zhengjun.springbootproject01.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class indexController {
    @ResponseBody
    @RequestMapping("/id")
    public String getPathVariable(@PathVariable("id") long id){

        return  "id=:"+id;

    }
}

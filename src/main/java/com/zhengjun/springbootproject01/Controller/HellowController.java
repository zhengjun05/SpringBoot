package com.zhengjun.springbootproject01.Controller;

import com.zhengjun.springbootproject01.ServiceImpliment.ServiceInterfaceImpliment;
import com.zhengjun.springbootproject01.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Controller
@RequestMapping("/test")
public class HellowController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hellow(){
        return "hello start!!!";
    }
    @ResponseBody
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public String queryAll() throws SQLException, ClassNotFoundException {
        ServiceInterfaceImpliment impl=new ServiceInterfaceImpliment();
        impl.queryAllPersons();
        return "查询所有用户信息";
    }

    @RequestMapping(value = "/variableParam/{id}",consumes = "application/json")
    @ResponseBody
    //PathVariablez注解，表示参数来源于路径中
    public String variable(@PathVariable int id){
        return "获取路径中的参数值为："+id;

    }

   @ResponseBody
   @RequestMapping(value = "/save", method =RequestMethod.POST )
    public String save(@RequestBody Student student ){
        int id=student.getId();
        String name=student.getName();
        return "id="+id +"\r\n"+"name="+name;
    }

    @ResponseBody
    @RequestMapping(value = "/query/{id}")
    public String queryPersonById(@PathVariable int id) throws SQLException, ClassNotFoundException {
        ServiceInterfaceImpliment imp=new ServiceInterfaceImpliment();
        imp.queryPersonById(id);
        return "SSS";

    }
}

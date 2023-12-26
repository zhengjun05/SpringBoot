package com.zhengjun.springbootproject01.ServiceImpliment;

import com.zhengjun.springbootproject01.Service.ServiceInterface;
import com.zhengjun.springbootproject01.repositories.DataAccess;

import java.sql.SQLException;


public class ServiceInterfaceImpliment implements ServiceInterface {
    @Override
    public void addPerson() {
    }

    @Override
    public void deletePersonById() {
    }

    @Override
    public void updatePersonById() {
    }

    @Override
    public void queryPersonById(int id) throws SQLException, ClassNotFoundException {
        DataAccess da=new DataAccess();
        da.queryPersonById(id);

    }

    @Override
    public void queryAllPersons() throws SQLException, ClassNotFoundException {
        DataAccess da=new DataAccess();
        da.queryAllPersons();


    }
}

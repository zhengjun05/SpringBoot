package com.zhengjun.springbootproject01.Service;

import java.sql.SQLException;

public interface ServiceInterface {
    public void addPerson();
    public void deletePersonById();
    public void updatePersonById();
    public void queryPersonById(int id) throws SQLException, ClassNotFoundException;
    public void queryAllPersons() throws SQLException, ClassNotFoundException;
}

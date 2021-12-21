package test;

import dao.StudentDao;
import dao.StudentDaoImpl.StudentDaoImpl;

import static org.junit.Assert.*;

public class StudentDaoTest {

    @org.junit.Test
    public void add() {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.add();
    }

    @org.junit.Test
    public void delete() {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.delete();
    }
}
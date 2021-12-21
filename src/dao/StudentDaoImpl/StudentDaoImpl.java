package dao.StudentDaoImpl;

import dao.StudentDao;

/**
 * @ProjectName: Git
 * @PackageName: dao.StudentDaoImpl
 * @Author: cyss
 * @CreatTime: 2021-12-21 19:21
 * @Description:
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public void add() {
        System.out.println("添加学生");
    }

    @Override
    public void delete() {
        System.out.println("删除学生");
    }
}

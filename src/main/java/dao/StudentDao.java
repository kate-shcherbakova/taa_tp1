package dao;

import jpa.business.Student;


public class StudentDao extends AbstractJpaDao<Long, Student> {

    public StudentDao() {
        super(Student.class);
    }
}

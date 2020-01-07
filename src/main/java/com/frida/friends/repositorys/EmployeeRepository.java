package com.frida.friends.repositorys;

import com.frida.friends.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //通过手机号来查询一个员工的信息
    public Employee findByPhone(String phone);
}

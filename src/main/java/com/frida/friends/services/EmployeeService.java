package com.frida.friends.services;

import com.frida.friends.models.Employee;
import com.frida.friends.repositorys.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void employeeTwo(){
        Employee employee = new Employee();
        employee.setEmployee_id("455656");
        employee.setDisplay_name("付志亮5");
        employee.setCard_number("nnnnnnnnnn");
        employee.setPhone("18811726639");
        employee.setEmpl_class("101");
        employee.setEmail_addr("fuzhiliang@xiaomi.com");
        employee.setLast_hire_date(new Date());
        employee.setEducation("本科");
        employee.setEstab_id("CHN0010012");
        employee.setEstab_name("三期E栋");
        employee.setMi_cost("C312070001");
        employee.setMi_cost_name("智米电子生产经营部成本中心");
        employee.setDep_code("DK");
        employee.setDep_name("电视部");
        employee.setJob_code("PO0003");
        employee.setJob_name("软件工程师");
        employee.setPosition_nbr("10000010");
        employee.setPosition_name("软件工程师");
        employee.setEmpl_class("101");
        employee.setPerson_id("666666");
        employee.setHr_status("A");
        employee.setIs_stat("1");
        employee.setUpdate_date(new Date());
        employee.setUpdate_time("1520861668");
        employee.setUpdate_user_id("0");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setEmployee_id("346789");
        employee1.setDisplay_name("付志亮6");
        employee1.setCard_number("nnnnnnnnnn");
        employee1.setPhone("18811726639");
        employee1.setEmpl_class("101");
        employee1.setEmail_addr("fuzhiliang@xiaomi.com");
        employee1.setLast_hire_date(new Date());
        employee1.setEducation("本科");
        employee1.setEstab_id("CHN0010012");
        employee1.setEstab_name("三期E栋");
        employee1.setMi_cost("C312070001");
        employee1.setMi_cost_name("智米电子生产经营部成本中心");
        employee1.setDep_code("DK");
        employee1.setDep_name("电视部");
        employee1.setJob_code("PO0003");
        employee1.setJob_name("软件工程师");
        employee1.setPosition_nbr("10000010");
        employee1.setPosition_name("软件工程师");
        employee1.setEmpl_class("101");
        employee1.setPerson_id("666666");
        employee1.setHr_status("A");
        employee1.setIs_stat("1");
        employee1.setUpdate_date(new Date());
        employee1.setUpdate_time("1520861668");
        employee1.setUpdate_user_id("0");
        employeeRepository.save(employee1);

    }
}

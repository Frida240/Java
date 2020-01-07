package com.frida.friends.controllers;

import com.frida.friends.models.Employee;
import com.frida.friends.repositorys.EmployeeRepository;
import com.frida.friends.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    //查询类表
    @GetMapping(value = "/getemployees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }


    //新增一个员工
    @PostMapping(value = "/addemployees")
    public Employee AddEmployee(Employee employee) {

        employee.setEmployee_id(employee.getEmployee_id());
        employee.setDisplay_name(employee.getDisplay_name());
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
        return employeeRepository.save(employee);
    }

    //根据Id来查询一个女生
    @GetMapping(value = "/getemployee/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return employeeRepository.findById(id).get();
    }


    //更新一个员工信息（由于数据库）
    @PutMapping(value = "/employeeupdate/{id}")
    public Employee employeeUpdate(@PathVariable("id") Integer id, @RequestParam("employee_id") String employee_id,
                                   @RequestParam("display_name") String display_name) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmployee_id(employee_id);
        employee.setDisplay_name(display_name);
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
        return employeeRepository.save(employee);
    }


    @DeleteMapping(value = "/employeedelete/{id}")
    public void employeeDelete(@PathVariable("id") Integer id) {
        employeeRepository.deleteById(id);
        return;
    }

    //通过手机号来查询一个员工的信息
    @GetMapping(value = "/employee/phone/{phone}")
    public Employee getEmployeeByEmplyeeId(@PathVariable("phone") String  phone) {
        return employeeRepository.findByPhone(phone);
    }


    @PostMapping(value = "/employees/insertwo")
    public void  employeeTwo(){
        employeeService.employeeTwo();
    }

}

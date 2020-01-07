package com.frida.friends.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    private String employee_id;

    private String display_name;

    private String email_addr;//'公司邮箱'

    private String phone;

    private String card_number;

    private Date last_hire_date;

    private String education;

    private String estab_id;//办公地点Id

    private String estab_name;//办公地点

    private String mi_cost;//'成本中心'

    private String mi_cost_name;//''成本中心描述''

    private String dep_code;//'部门ID'

    private String dep_name;//'部门名称'

    private String job_code;//'职务代码'

    private String job_name;//'职务名称'

    private String position_nbr;//'职位号码'

    private String position_name;//'职位名称'

    private String empl_class;//'员工类别（101 正式；102 实习 ；103 外包；104 派遣；105 兼职'

    private String person_id;

    private String hr_status;//A-有效；I-无效

    private String is_stat;//是否加入统计1加入0不加入

    private Date update_date;//'数据刷新日期'

    private String update_time;//'最后更新时间'

    private String update_user_id;//''最后更新人''

    public Date getLast_hire_date() {
        return last_hire_date;
    }

    public void setLast_hire_date(Date last_hire_date) {
        this.last_hire_date = last_hire_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail_addr() {
        return email_addr;
    }

    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }


    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEstab_id() {
        return estab_id;
    }

    public void setEstab_id(String estab_id) {
        this.estab_id = estab_id;
    }

    public String getEstab_name() {
        return estab_name;
    }

    public void setEstab_name(String estab_name) {
        this.estab_name = estab_name;
    }

    public String getMi_cost() {
        return mi_cost;
    }

    public void setMi_cost(String mi_cost) {
        this.mi_cost = mi_cost;
    }

    public String getMi_cost_name() {
        return mi_cost_name;
    }

    public void setMi_cost_name(String mi_cost_name) {
        this.mi_cost_name = mi_cost_name;
    }

    public String getDep_code() {
        return dep_code;
    }

    public void setDep_code(String dep_code) {
        this.dep_code = dep_code;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getJob_code() {
        return job_code;
    }

    public void setJob_code(String job_code) {
        this.job_code = job_code;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getPosition_nbr() {
        return position_nbr;
    }

    public void setPosition_nbr(String position_nbr) {
        this.position_nbr = position_nbr;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public String getEmpl_class() {
        return empl_class;
    }

    public void setEmpl_class(String empl_class) {
        this.empl_class = empl_class;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getHr_status() {
        return hr_status;
    }

    public void setHr_status(String hr_status) {
        this.hr_status = hr_status;
    }

    public String getIs_stat() {
        return is_stat;
    }

    public void setIs_stat(String is_stat) {
        this.is_stat = is_stat;
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id;
    }
}

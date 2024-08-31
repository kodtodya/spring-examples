package com.kodtodya.practice.controllers;

import com.kodtodya.practice.bean.Emp;
import com.kodtodya.practice.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    EmpDao dao;//will inject dao from xml file  

    /*It displays a form to input data, here "command" is a reserved request attribute
     *which is used to display object data into form
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showform(Model m) {
        m.addAttribute("command", new Emp());
        System.out.println("------------inside add operation--------------");
        return "AddEmployee";
    }

    /*It saves object into database. The @ModelAttribute puts request data
     *  into model object. You need to mention RequestMethod.POST method
     *  because default request is GET*/
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") Emp emp) {
        dao.save(emp);
        return "redirect:/view";//will redirect to view request mapping
    }

    /* It provides list of employees in model object */
    @RequestMapping("/view")
    public String view(Model m) {
        List<Emp> list = dao.getEmployees();
        m.addAttribute("list", list);
        return "ViewEmployee";
    }

    /* It displays object data into form for the given id.
     * The @PathVariable puts URL data into variable.*/
    @RequestMapping(value = "/edit/{id}")
    public String edit(@PathVariable int id, Model m) {
        Emp emp = dao.getEmpById(id);
        m.addAttribute("command", emp);
        return "UpdateEmployee";
    }

    /* It updates model object. */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("emp") Emp emp) {
        dao.update(emp);
        return "redirect:/view";
    }

    /* It deletes record for the given id in URL and redirects to /view */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/view";
    }
}  
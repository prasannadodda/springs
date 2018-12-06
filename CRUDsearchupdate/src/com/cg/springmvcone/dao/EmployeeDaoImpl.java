package com.cg.springmvcone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcone.dto.Employee;
@Repository("employeedao")
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public int addEmployeeData(Employee emp) {
		entitymanager.persist(emp);
		entitymanager.flush();
		return emp.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() {
		Query queryOne=entitymanager.createQuery("FROM Employee");
		List<Employee> myList=queryOne.getResultList();
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) {
		Query queryTwo=entitymanager.createQuery("DELETE FROM Employee WHERE empId=:eid");
		queryTwo.setParameter("eid", empId);
		queryTwo.executeUpdate();

	}

	@Override
	public boolean updateEmployee(Employee emp) {
		try {
            entitymanager.merge(emp);
            entitymanager.flush();
            return true;
     } catch (Exception e) {
            return false;
     }



	}

	@Override
    public Employee searchEmployee(int empId) {
           // TODO Auto-generated method stub
           Query queryThree = entitymanager.createQuery("SELECT  e FROM Employee e WHERE empId=:eid");
           queryThree.setParameter("eid", empId);
           Employee e = (Employee) queryThree.getSingleResult();
           return e;
    }


}

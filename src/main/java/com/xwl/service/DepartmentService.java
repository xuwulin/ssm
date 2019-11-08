package com.xwl.service;

import java.util.List;

import com.xwl.bean.Department;
import com.xwl.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public List<Department> getDepts() {
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}

}

/*package com.etc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etc.dao.PersonMapper;
import com.etc.entity.JsonResult;
import com.etc.entity.Person;
import com.etc.entity.PersonExample;
import com.etc.enums.ErrorEnum;
import com.etc.exception.MyException;
import com.etc.service.PersonService;
import com.github.pagehelper.PageHelper;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	@Autowired
	private PersonMapper personMapper;
	
	@GetMapping("/person")
	public JsonResult<Person> findAll(){
		PageHelper.startPage(2,3);
		return new JsonResult<Person>(personService.findAll());
	}
	
	@GetMapping("/person/id/{id}")
	public JsonResult<Person> findById(@PathVariable int id){
		return new JsonResult<Person>(personService.findById(id));
	}
	
	@GetMapping("/person/age/{age}")
	public JsonResult<Person> findByAge(@PathVariable int age){
		return new JsonResult<Person>(personService.findByAge(age));
	}
	
	@GetMapping("/person/age/{age}/name/{name}")
	public JsonResult<Person> findByAgeAndName(@PathVariable int age,@PathVariable String name){
		PersonExample pe = new PersonExample();
		pe.createCriteria().andAgeGreaterThan(age).andNameLike("%"+name+"%");
		return new JsonResult<Person>(personMapper.selectByExample(pe));
	}
	
	@PostMapping("/person")
	public JsonResult doAdd(@Valid Person person,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			throw new MyException(ErrorEnum.CHECK_ERROR,bindingResult.getFieldError().getDefaultMessage());
		}
		if(!personService.addPerson(person)){
			throw new MyException(ErrorEnum.ADD_ERROR);
		}
		
		return new JsonResult("添加成功");
	}
	
	@PutMapping("/person")
	public JsonResult doUpdate(Person person){
		if(!personService.updatePerson(person)){
			throw new MyException(ErrorEnum.EDIT_ERROR);
		}
		return new JsonResult("修改成功");
	}
	
	@DeleteMapping("/person/{id}")
	public JsonResult doDelete(@PathVariable int id){
		if(!personService.deletePerson(id)){
			throw new MyException(ErrorEnum.REMOVE_ERROR);
		}
		return new JsonResult("删除成功");
	}
}
*/
package com.boot_camp.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot_camp.Dao.StudentResponse;

@FeignClient(name="Student",url = "http://localhost:8082/student/api")
public interface StudentFeign {

	@GetMapping("/getStudent/{id}")
	StudentResponse getStudentDetailsOnSongId(@PathVariable("id") int id);
	
	@GetMapping("/getAllStudents")
	List<StudentResponse> getAllStudents();
}

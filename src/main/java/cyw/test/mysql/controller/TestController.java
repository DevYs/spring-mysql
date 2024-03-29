package cyw.test.mysql.controller;

import cyw.test.mysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public Object test() {
		return testService.testList();
	}

}

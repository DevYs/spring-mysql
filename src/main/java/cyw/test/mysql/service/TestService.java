package cyw.test.mysql.service;

import cyw.test.mysql.service.domain.Test;
import cyw.test.mysql.service.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;

	public Test addTest(Test test) {
		int result = testMapper.addTest(test);
		return test;
	}

	public List<Test> testList() {
		return testMapper.testList();
	}

}

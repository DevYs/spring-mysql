package cyw.test.mysql.service.mapper;

import cyw.test.mysql.service.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

	int addTest(Test test);

	List<Test> testList();
}

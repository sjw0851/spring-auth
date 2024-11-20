package com.sparta.springauth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.sparta.springauth.food.Food;

@SpringBootTest
public class BeanTest {

	@Autowired
	@Qualifier("pizza")
	Food food;

	@Test
	@DisplayName("테스트")
	void test() {
		food.eat();

	}
}

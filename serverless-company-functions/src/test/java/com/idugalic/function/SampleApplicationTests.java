package com.idugalic.function;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.idugalic.function.domain.UppercaseRequest;
import com.idugalic.function.domain.UppercaseResponse;
import com.idugalic.function.functions.UppercaseFunction;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

	@Autowired
	private UppercaseFunction uppercaseFunction;

	@Test
	public void testUppercase() {
		UppercaseRequest uppercaseRequest = new UppercaseRequest();
		uppercaseRequest.setInput("foobar");
		
		UppercaseResponse response = this.uppercaseFunction.apply(uppercaseRequest);
		assertEquals("FOOBAR", response.getResult());
	}
}
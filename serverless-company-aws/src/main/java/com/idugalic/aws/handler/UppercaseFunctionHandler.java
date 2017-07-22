package com.idugalic.aws.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.idugalic.function.domain.UppercaseRequest;
import com.idugalic.function.domain.UppercaseResponse;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}

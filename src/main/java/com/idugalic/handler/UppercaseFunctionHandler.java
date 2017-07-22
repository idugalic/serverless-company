package com.idugalic.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.idugalic.domain.UppercaseRequest;
import com.idugalic.domain.UppercaseResponse;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}

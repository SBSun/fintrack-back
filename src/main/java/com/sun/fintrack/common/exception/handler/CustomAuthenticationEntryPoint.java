package com.sun.fintrack.common.exception.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.fintrack.common.response.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * 인증 예외 핸들러
 */
@Slf4j
@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response,
      AuthenticationException authException) {
    ErrorResponse errorResponse = new ErrorResponse(HttpStatus.UNAUTHORIZED.value(), "인증되지 않은 사용자입니다.");
    response.setContentType("application/json;charset=UTF-8");
    response.setStatus(errorResponse.status());

    try {
      response.getWriter().print(new ObjectMapper().writeValueAsString(errorResponse));
    } catch (Exception e) {
      log.error(e.getMessage());
    }
  }
}

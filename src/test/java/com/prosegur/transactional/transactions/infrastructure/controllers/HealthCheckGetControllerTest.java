package com.prosegur.transactional.transactions.infrastructure.controllers;

import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerTest extends RequestTestCase {

  @Test
  void health_check_endpoint_is_working() throws Exception {
    assertResponse("/health-check", 200, "");
  }

  @Test
  void health_check_endpoint_is_working_2() throws Exception {
    assertResponse("/health-check-2", 200, "{'message':'Llamando!'}");
  }

}

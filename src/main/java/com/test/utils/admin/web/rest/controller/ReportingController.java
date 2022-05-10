package com.test.utils.admin.web.rest.controller;

import com.test.utils.admin.service.ReportingService;
import com.security.logging.encryption.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test_endpoint", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReportingController {

  private ReportingService reportingService;

  private Encryption encryption;

  @Autowired
  public ReportingController(ReportingService reportingService, Encryption encryption) {
    this.reportingService = reportingService;
    this.encryption = encryption;
  }

}


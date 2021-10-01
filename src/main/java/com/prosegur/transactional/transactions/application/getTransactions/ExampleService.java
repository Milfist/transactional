package com.prosegur.transactional.transactions.application.getTransactions;

import com.prosegur.sharedKernel.domain.Service;

@Service
public class ExampleService {

  public BasicResponse exampleCall() {
    return new BasicResponse("Llamando!");
  }

}


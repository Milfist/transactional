package com.prosegur.transactional.transactions.infrastructure.persistence;

import com.prosegur.sharedKernel.domain.Service;
import com.prosegur.transactional.transactions.domain.Transaction;
import com.prosegur.transactional.transactions.domain.TransactionRepository;

import java.util.Optional;

@Service
public class PostgresTransactionRepository implements TransactionRepository {

  private final TransactionPostgreRepository repository;

  public PostgresTransactionRepository(TransactionPostgreRepository repository) {
    this.repository = repository;
  }

  @Override
  public void save(Transaction transaction) {
    repository.save(transaction);
  }

  @Override
  public Optional<Transaction> getById(String value) {
    return repository.findById(value);
  }
}

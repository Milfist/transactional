package com.prosegur.transactional.transactions.infrastructure.persistence;

import com.prosegur.transactional.transactions.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionPostgreRepository extends JpaRepository<Transaction, String> {
}

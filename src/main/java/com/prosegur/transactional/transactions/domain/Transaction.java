package com.prosegur.transactional.transactions.domain;

import java.util.Objects;

public class Transaction {

  private ActualId actualId;
  private DeviceId deviceId;
  private TransactionType transactionType;

  public Transaction(ActualId actualId, DeviceId deviceId, TransactionType transactionType) {
    this.actualId = actualId;
    this.deviceId = deviceId;
    this.transactionType = transactionType;
  }

  public ActualId getActualId() {
    return actualId;
  }

  public DeviceId getDeviceId() {
    return deviceId;
  }

  public TransactionType getTransactionType() {
    return transactionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Transaction that = (Transaction) o;
    return Objects.equals(actualId, that.actualId) && Objects.equals(deviceId, that.deviceId) && Objects.equals(transactionType, that.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualId, deviceId, transactionType);
  }
}

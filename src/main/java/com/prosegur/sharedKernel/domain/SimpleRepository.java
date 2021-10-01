package com.prosegur.sharedKernel.domain;

import java.util.Optional;

public interface SimpleRepository<T> {
  void save(T t);
  Optional<T> getById(String value);
}

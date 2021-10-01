package com.prosegur.sharedKernel.domain;

import java.lang.annotation.*;

/**
 * Anotación propia para marcar los servicios
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Service {
}

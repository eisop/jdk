package org.checkerframework.checker.lock.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The bottom type in the GuardedBy type system. Programmers should rarely write this type.
 *
 * <p>If a variable {@code x} has type {@code @GuardedByBottom}, then the value referred to by
 * {@code x} is {@code null} (or dead code) and can never be dereferenced.
 *
 * @checker_framework.manual #lock-checker Lock Checker
 * @checker_framework.manual #bottom-type the bottom type
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({TypeUseLocation.LOWER_BOUND, TypeUseLocation.UPPER_BOUND})
@SubtypeOf({NewObject.class})
public @interface GuardedByBottom {}

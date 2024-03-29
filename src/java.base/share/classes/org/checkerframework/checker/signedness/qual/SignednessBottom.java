package org.checkerframework.checker.signedness.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The bottom type in the Signedness type system. Programmers should rarely write this type.
 *
 * <p>This is the type of the {@code null} literal.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 * @checker_framework.manual #bottom-type the bottom type
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({
    TypeUseLocation.LOWER_BOUND,
    TypeUseLocation.UPPER_BOUND,
})
@SubtypeOf({SignedPositive.class})
public @interface SignednessBottom {}

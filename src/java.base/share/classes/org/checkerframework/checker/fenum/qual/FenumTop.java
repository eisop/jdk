package org.checkerframework.checker.fenum.qual;

import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The top of the fake enumeration type hierarchy.
 *
 * @checker_framework.manual #fenum-checker Fake Enum Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({
    TypeUseLocation.LOWER_BOUND,
    TypeUseLocation.UPPER_BOUND,
    TypeUseLocation.LOCAL_VARIABLE,
    TypeUseLocation.RESOURCE_VARIABLE
})
@SubtypeOf({})
@DefaultFor({TypeUseLocation.LOCAL_VARIABLE, TypeUseLocation.RESOURCE_VARIABLE})
public @interface FenumTop {}

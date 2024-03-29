package org.checkerframework.checker.initialization.qual;

import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The bottom type in the initialization type system. Programmers should rarely write this type.
 *
 * <p>The "FBC" in the name stands for "Freedom Before Commitment", an approach that the
 * Initialization Checker builds upon.
 *
 * @checker_framework.manual #initialization-checker Initialization Checker
 * @checker_framework.manual #bottom-type the bottom type
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({TypeUseLocation.LOWER_BOUND, TypeUseLocation.UPPER_BOUND})
@SubtypeOf({UnderInitialization.class, Initialized.class})
@QualifierForLiterals(LiteralKind.NULL)
public @interface FBCBottom {}

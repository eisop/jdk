package org.checkerframework.checker.signature.qual;

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
 * The bottom type in the Signature String type system. Programmers should rarely write this type.
 *
 * @checker_framework.manual #signature-checker Signature Checker
 * @checker_framework.manual #bottom-type the bottom type
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({TypeUseLocation.LOWER_BOUND, TypeUseLocation.UPPER_BOUND})
@SubtypeOf({
    FieldDescriptorForPrimitive.class,
    PrimitiveType.class,
    CanonicalNameAndBinaryName.class,
    MethodDescriptor.class
})
@DefaultFor({TypeUseLocation.LOWER_BOUND})
public @interface SignatureBottom {}

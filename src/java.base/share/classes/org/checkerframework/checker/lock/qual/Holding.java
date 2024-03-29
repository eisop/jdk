package org.checkerframework.checker.lock.qual;

import org.checkerframework.framework.qual.PreconditionAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates a method precondition: the specified expressions must be held when the annotated method
 * is invoked.
 *
 * <p>The argument is a string or set of strings that indicates the expression(s) that must be held,
 * using the <a href="https://eisop.github.io/cf/manual/#java-expressions-as-arguments">syntax of
 * Java expressions</a> described in the manual. The expressions evaluate to an intrinsic (built-in,
 * synchronization) monitor, or an explicit {@link java.util.concurrent.locks.Lock}.
 *
 * @see GuardedBy
 * @checker_framework.manual #lock-checker Lock Checker
 * @checker_framework.manual #lock-examples-holding Example use of @Holding
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PreconditionAnnotation(qualifier = LockHeld.class)
public @interface Holding {
    /**
     * The Java expressions that need to be held.
     *
     * @see <a href="https://eisop.github.io/cf/manual/#java-expressions-as-arguments">Syntax of
     *     Java expressions</a>
     */
    String[] value();
}

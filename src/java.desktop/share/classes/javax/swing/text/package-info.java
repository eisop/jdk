/*
 * Copyright (c) 1998, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/**
 * Provides classes and interfaces that deal with editable and noneditable text
 * components. Examples of text components are text fields and text areas, of
 * which password fields and document editors are special instantiations.
 * Features that are supported by this package include selection/highlighting,
 * editing, style, and key mapping.
 * <p>
 * <strong>Note:</strong>
 * Most of the Swing API is <em>not</em> thread safe. For details, see
 * <a
 * href="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html"
 * target="_top">Concurrency in Swing</a>,
 * a section in
 * <em><a href="https://docs.oracle.com/javase/tutorial/"
 * target="_top">The Java Tutorial</a></em>.
 *
 * <h2>Related Documentation</h2>
 * For overviews, tutorials, examples, guides, and tool documentation,
 * please see:
 * <ul>
 *     <li><a href="https://docs.oracle.com/javase/tutorial/uiswing/components/text.html"
 *     target="_top">Using Text Components</a>,
 *     a section in <em>The Java Tutorial</em></li>
 * </ul>
 *
 * @since 1.2
 * @serial exclude
 */
@UIPackage
package javax.swing.text;

import org.checkerframework.checker.guieffect.qual.UIPackage;

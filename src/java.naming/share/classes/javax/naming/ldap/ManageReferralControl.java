/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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

package javax.naming.ldap;

import org.checkerframework.checker.interning.qual.Interned;
import org.checkerframework.framework.qual.AnnotatedFor;

/**
 * Requests that referral and other special LDAP objects be manipulated
 * as normal LDAP objects. It enables the requestor to interrogate or
 * update such objects.
 *<p>
 * This class implements the LDAPv3 Request Control for ManageDsaIT
 * as defined in
 * <a href="http://www.ietf.org/rfc/rfc3296.txt">RFC 3296</a>.
 *
 * The control has no control value.
 *
 * @since 1.5
 * @author Vincent Ryan
 */
@AnnotatedFor({"interning"})
public final class ManageReferralControl extends BasicControl {

    /**
     * The ManageReferral control's assigned object identifier
     * is 2.16.840.1.113730.3.4.2.
     */
    public static final @Interned String OID = "2.16.840.1.113730.3.4.2";

    private static final long serialVersionUID = 3017756160149982566L;

    /**
     * Constructs a critical ManageReferral control.
     */
    public ManageReferralControl() {
        super(OID, true, null);
    }

    /**
     * Constructs a ManageReferral control.
     *
     * @param   criticality The control's criticality setting.
     */
    public ManageReferralControl(boolean criticality) {
        super(OID, criticality, null);
    }
}

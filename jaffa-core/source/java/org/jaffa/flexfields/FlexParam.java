/*
 * ====================================================================
 * JAFFA - Java Application Framework For All
 *
 * Copyright (C) 2002 JAFFA Development Group
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Redistribution and use of this software and associated documentation ("Software"),
 * with or without modification, are permitted provided that the following conditions are met:
 * 1.	Redistributions of source code must retain copyright statements and notices.
 *         Redistributions must also contain a copy of this document.
 * 2.	Redistributions in binary form must reproduce the above copyright notice,
 * 	this list of conditions and the following disclaimer in the documentation
 * 	and/or other materials provided with the distribution.
 * 3.	The name "JAFFA" must not be used to endorse or promote products derived from
 * 	this Software without prior written permission. For written permission,
 * 	please contact mail to: jaffagroup@yahoo.com.
 * 4.	Products derived from this Software may not be called "JAFFA" nor may "JAFFA"
 * 	appear in their names without prior written permission.
 * 5.	Due credit should be given to the JAFFA Project (http://jaffa.sourceforge.net).
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 */
package org.jaffa.flexfields;

import java.io.Serializable;

/**
 * A general purpose class to hold name/value pairs.
 */
public class FlexParam implements Cloneable, Comparable, Serializable {

    private String name;
    private String value;

    /**
     * Creates a new instance.
     */
    public FlexParam() {
    }

    /**
     * Creates a new instance.
     * @param name the name.
     * @param value the value.
     */
    public FlexParam(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Getter for property name.
     * @return Value of property name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property name.
     * @param name New value of property name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for property value.
     * @return Value of property value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter for property value.
     * @param value New value of property value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns diagnostic information.
     * @return diagnostic information.
     */
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("<Param>");
        if (getName() != null)
            buf.append("<name>").append(getName()).append("</name>");
        if (getValue() != null)
            buf.append("<value>").append(getValue()).append("</value>");
        buf.append("</Param>");
        return buf.toString();
    }

    /**
     * Returns true if the fields of the input match the fields of this object.
     * @param obj the object to match.
     * @return true if the fields of the input match the fields of this object.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FlexParam other = (FlexParam) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name))
            return false;
        if ((this.value == null) ? (other.value != null) : !this.value.equals(other.value))
            return false;
        return true;
    }

    /**
     * Returns the sum of hashCodes of all the fields in this object.
     * @return the sum of hashCodes of all the fields in this object.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.value != null ? this.value.hashCode() : 0);
        return hash;
    }

    /**
     * Returns a clone of the object.
     * @return a clone of the object.
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
            // no more processing required since the fields are immutable
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            return null;
        }
    }

    /**
     * Compares this object with the input.
     * @param o the object to compare to.
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    public int compareTo(Object o) {
        int i = o == null ? 1 : 0;
        if (i == 0) {
            FlexParam t = (FlexParam) o;
            i = this.name == null ? (t.name == null ? 0 : -1) : (t.name == null ? 1 : this.name.compareTo(t.name));
            if (i == 0)
                i = this.value == null ? (t.value == null ? 0 : -1) : (t.value == null ? 1 : this.value.compareTo(t.value));
        }
        return i;
    }
}

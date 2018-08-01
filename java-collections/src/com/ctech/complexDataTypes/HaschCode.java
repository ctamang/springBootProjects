package com.ctech.complexDataTypes;

import java.util.HashSet;
import java.util.Set;

public class HaschCode {
	private final String first, last;
    public HaschCode(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    public boolean equals(Object o)
    {
        if (!(o instanceof HaschCode))
            return false;
        HaschCode n = (HaschCode)o;
        return n.first.equals(first) && n.last.equals(last);
    }
    public int hashCode() {
    	return 63 * first.hashCode() + last.hashCode();
    	}
    public static void main(String[] args)
    {
        Set<HaschCode> s = new HashSet<HaschCode>();
        s.add(new HaschCode("Shubham", "Juneja"));
        System.out.println(
            s.contains(new HaschCode("Shubham", "Juneja")));
    }
}

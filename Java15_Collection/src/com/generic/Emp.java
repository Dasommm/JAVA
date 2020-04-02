package com.generic;

// <T> : Type 
// <E> : Element
// <K> : Key
// <V> : Value

public class Emp<T> {

	private T empno;
	private String ename;
	
	public Emp() {				// shift+ alt + s
		super();				// generate constructor from superclass
	}

	public Emp(T empno, String ename) {
		super();
		this.empno = empno;		// generate constructor using fields 
		this.ename = ename;
	}

	public T getEmpno() {
		return empno;
	}

	public void setEmpno(T empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {			 // ctl+space로도 가능 
		return "[" + empno + "]"+ ename;
	}
	
}

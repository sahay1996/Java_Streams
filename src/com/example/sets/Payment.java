package com.example.sets;

public class Payment  implements Comparable<Payment>{
	String refId;

	public Payment(String refId) {
		super();
		this.refId = refId;
	}

	@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		return this.refId.compareTo(o.refId);
	}
	
}

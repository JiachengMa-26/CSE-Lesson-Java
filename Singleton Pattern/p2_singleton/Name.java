package p2_singleton;

public class Name {
	private String fn;
	private String ln;

	public Name(String fn, String ln) {
		super();
		this.fn = fn;
		this.ln = ln;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	@Override
	public String toString() {
		return "Name [fn=" + fn + ", ln=" + ln + "]";
	}

}

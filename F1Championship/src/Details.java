import java.util.Objects;

/**
 * 
 */

/**
 * @author P17200246
 *
 */
public class Details {
	
	private String fullName;  /** Fields **/
	private String address;
	
	
	/**
	 * @param fullName
	 * @param address
	 */
	public Details(String fullName, String address) {  /** Constructor **/
		
		this.fullName = fullName;
		this.address = address;
	}


	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}


	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return Too String Function
	 */
	@Override
	public String toString() {
		return "Details [fullName=" + fullName + ", address=" + address + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(address, fullName);
	}

	/**
	 * @return Equals Function
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Details other = (Details) obj;
		return Objects.equals(address, other.address) && Objects.equals(fullName, other.fullName);
	}
}

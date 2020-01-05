package edu.bjtu.android.entity;

import java.io.Serializable;

public class Customers implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customers.username
	 * @mbg.generated
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customers.password
	 * @mbg.generated
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customers.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customers
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customers.username
	 * @return  the value of customers.username
	 * @mbg.generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customers.username
	 * @param username  the value for customers.username
	 * @mbg.generated
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customers.password
	 * @return  the value of customers.password
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customers.password
	 * @param password  the value for customers.password
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customers.email
	 * @return  the value of customers.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customers.email
	 * @param email  the value for customers.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", username=").append(username);
		sb.append(", password=").append(password);
		sb.append(", email=").append(email);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
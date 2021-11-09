package ies.tc.crudapp.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "user")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "Name is mandatory")
	private String name;

	@NotBlank(message = "Email is mandatory")
	private String email;

	@NotBlank(message = "Phone number is mandatory")
	private String phone;

	public User() {}

	public User(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
	}
}

package Application.DataTypes;


public class Admin {

    //fields
    private String first_name, last_name, password,admin_id,role,email;

	//constructors
    public Admin() {}

    public Admin(String admin_id, String first_name, String last_name, String password, String role,String email) {
        this.admin_id = admin_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.role = role;
        this.email = email;
    }


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//getters, setters
    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


    //toString method
    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                 ", email='" + email + '\'' +
                '}';
    }

}

package ce.mnu.site;
import jakarta.persistence.*;

@Entity
public class SiteUser {
	@Id @Column(length=50)
	private String email;
	private String password;
	private String confirm_password;
	
	public String getEmail() {return email;}
	public void setEmail(String e) { email = e;}
	
	public String getPassword() {return password;}
	public void setPaswword(String p) { password = p;}
	
	public String getConfirm_password() {return confirm_password;}
	public void setConfirm_password(String c) { confirm_password = c;}
}

package bean;

import application.LoginCustomer;
import application.entity.Customer;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import static org.rapidoid.http.Current.username;
import org.rapidoid.http.Req;
import static org.rapidoid.setup.On.req;






@ManagedBean(name = "login", eager =true)
@RequestScoped
public class LoginCustomerBean {
	


		private String name;
		private String password;
		private boolean rememberMe = false;
		
                private Req req;

		public LoginCustomerBean() {
			ExternalContext context = (ExternalContext) FacesContext.getCurrentInstance().getExternalContext();
			HttpServletRequest request = (HttpServletRequest) context.getRequest();
			if (request.getParameter("log") != null && request.getParameter("log").equals("out")) {
				try {
					
					context.redirect("default.xhtml");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name.trim();
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isRememberMe() {
			return rememberMe;
		}

		public void setRememberMe(boolean rememberMe) {
			this.rememberMe = rememberMe;
		}

		

		public void validateLogin() throws IOException {
			if (LoginCustomer.login(req,name,password)) {
                            
				ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
                                externalContext.redirect("tickets.xhtml");
			} else {
				ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
                                externalContext.redirect("tickets.xhtml");
			}
		}
}

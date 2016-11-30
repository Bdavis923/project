package application;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.security.Role;
import org.rapidoid.security.annotation.Administrator;
import org.rapidoid.security.annotation.Roles;
import org.rapidoid.u.U;
 
@Controller
public class MyCtrl {
 
    @GET
    @Administrator
    @Roles({"manager", Role.MODERATOR})
    public Object hi() {
        return U.map("msg", "hi!");
    }
 
}

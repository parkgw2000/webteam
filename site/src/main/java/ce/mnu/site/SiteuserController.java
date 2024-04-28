package ce.mnu.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/siteuser")
public class SiteuserController {
	@Autowired
	private SiteUserRepository userRepository;
	
	@GetMapping(path="/signup")
	public String signup(Model model) {
		model.addAttribute("siteuser", new SiteUser());
		return "signup";
	}
	
	@PostMapping(path="/signup")
	public String signup(@ModelAttribute SiteUser user, Model model) {
		userRepository.save(user);
		model.addAttribute("name", user.getEmail());
		return "login";
	}
}

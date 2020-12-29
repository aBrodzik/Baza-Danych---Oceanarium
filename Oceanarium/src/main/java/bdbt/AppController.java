package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@Autowired
	private AdressDAO dao;

	@RequestMapping("/")
	public String viewHomePage(Model model) {

		List<Adress> listAdress = dao.list();
		model.addAttribute("listAdress", listAdress);
		return "index";
	}

	@RequestMapping("/new")
	public String showNewForm(Model model) {

		Adress adress = new Adress();
		model.addAttribute("adress", adress);
		return "new_form";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("adress") Adress adress) {
		dao.save(adress);
		return "redirect:/";

	}
}

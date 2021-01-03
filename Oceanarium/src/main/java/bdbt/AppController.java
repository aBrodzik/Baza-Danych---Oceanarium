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
	private AdressDAO daoAdres;
	@Autowired
	private AttractionDAO daoAttraction;
	@Autowired
	private DolphinDAO daoDolphin;
	@Autowired
	private SealDAO daoSeal;
	@Autowired
	private ClientDAO daoClient;
	@Autowired
	private OceanariumDAO daoOceanarium;
	@Autowired
	private WaterTankKeeperDAO daoWaterTankKeeper;
	@Autowired
	private PostDAO daoPost;

	@RequestMapping("/")
	public String viewHomePage() {
		return "index";

	}

	
	
	/* Adresy */

	@RequestMapping("/adresy")
	public String viewHAdresy(Model model) {

		List<Adress> listAdress = daoAdres.list();
		model.addAttribute("listAdress", listAdress);
		return "adresy";

	}

	@RequestMapping("/newAdress")
	public String showNewForm(Model model) {

		Adress adress = new Adress();
		model.addAttribute("adress", adress);
		return "new_adress";
	}

	@RequestMapping(value = "/saveAdres", method = RequestMethod.POST)
	public String save(@ModelAttribute("adress") Adress adress) {
		daoAdres.save(adress);
		return "redirect:/";

	}
	
	/* Atrakcje */
	
	@RequestMapping("/atrakcje")
	public String viewAtrakcje(Model model) {

		List<Attraction> listAttraction = daoAttraction.list();
		model.addAttribute("listAttraction", listAttraction);
		return "atrakcje";

	}
	
	@RequestMapping("/newAttraction")
	public String showNewAttraction(Model model) {

		Attraction attraction = new Attraction();
		model.addAttribute("attraction", attraction);
		return "new_attraction";
	}

	@RequestMapping(value = "/saveAttraction", method = RequestMethod.POST)
	public String saveAttraction(@ModelAttribute("attraction") Attraction attraction) {
		daoAttraction.save(attraction);
		return "redirect:/";

	}
	
	
	/*Delfiny*/
	
	@RequestMapping("/delfiny")
	public String viewDelfiny(Model model) {

		List<Dolphin> listDolphin = daoDolphin.list();
		model.addAttribute("listDolphin", listDolphin);
		return "delfiny";

	}
	
	@RequestMapping("/newDolphin")
	public String showNewDolphin(Model model) {

		Dolphin dolphin = new Dolphin();
		model.addAttribute("dolphin", dolphin);
		return "new_dolphin";
	}
	
	@RequestMapping(value = "/saveDolphin", method = RequestMethod.POST)
	public String saveDolphin(@ModelAttribute("dolphin") Dolphin dolphin) {
		daoDolphin.save(dolphin);
		return "redirect:/";

	}
	
	
	/*Foki*/
	
	@RequestMapping("/foki")
	public String viewFoki(Model model) {

		List<Seal> listSeal = daoSeal.list();
		model.addAttribute("listSeal", listSeal);
		return "foki";

	}
	
	@RequestMapping("/newSeal")
	public String showNewSeal(Model model) {

		Seal seal = new Seal();
		model.addAttribute("seal", seal);
		return "new_seal";
	}
	
	@RequestMapping(value = "/saveSeal", method = RequestMethod.POST)
	public String saveSeal(@ModelAttribute("seal") Seal seal) {
		daoSeal.save(seal);
		return "redirect:/";

	}
	
	
	/*klienci*/
	

	@RequestMapping("/klienci")
	public String viewKlienci(Model model) {

		List<Client> listClient = daoClient.list();
		model.addAttribute("listClient", listClient);
		return "klienci";

	}
	
	@RequestMapping("/newClient")
	public String showNewClient(Model model) {

		Client client = new Client();
		model.addAttribute("client", client);
		return "new_client";
	}
	
	@RequestMapping(value = "/saveClient", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		daoClient.save(client);
		return "redirect:/";

	}
	
	
	/*oceanaria*/
	
	@RequestMapping("/oceanaria")
	public String viewOceanaria(Model model) {

		List<Oceanarium> listOceanarium = daoOceanarium.list();
		model.addAttribute("listOceanarium", listOceanarium);
		return "oceanaria";

	}
	
	@RequestMapping("/newOceanarium")
	public String showNewOceanarium(Model model) {

		Oceanarium oceanarium = new Oceanarium();
		model.addAttribute("oceanarium", oceanarium);
		return "new_oceanarium";
	}
	
	@RequestMapping(value = "/saveOceanarium", method = RequestMethod.POST)
	public String saveOceanarium(@ModelAttribute("oceanarium") Oceanarium oceanarium) {
		daoOceanarium.save(oceanarium);
		return "redirect:/";

	}
	
	
	
	/*opiekunowie zbiorniki wodne*/
	@RequestMapping("/opiekunowie_zbiorniki_wodne")
	public String viewWaterTankKeepers(Model model) {

		List<WaterTankKeeper> listWaterTankKeeper = daoWaterTankKeeper.list();
		model.addAttribute("listWaterTankKeeper", listWaterTankKeeper);
		return "opiekunowie_zbiorniki_wodne";

	}
	
	@RequestMapping("/newWaterTankKeeper")
	public String showNewWaterTankKeeper(Model model) {

		WaterTankKeeper waterTankKeeper = new WaterTankKeeper();
		model.addAttribute("watertankkeeper", waterTankKeeper);
		return "new_waterTankKeeper";
	}
	
	@RequestMapping(value = "/saveWaterTankKeeper", method = RequestMethod.POST)
	public String saveWaterTankKeeper(@ModelAttribute("watertankkeeper") WaterTankKeeper waterTankKeeper) {
		daoWaterTankKeeper.save(waterTankKeeper);
		return "redirect:/";

	}
	
	/*poczty */
	@RequestMapping("/poczty")
	public String viewPost(Model model) {

		List<Post> listPost = daoPost.list();
		model.addAttribute("listPost", listPost);
		return "poczty";

	}
	
	@RequestMapping("/newPost")
	public String showNewPost(Model model) {

		Post post = new Post();
		model.addAttribute("post", post);
		return "new_post";
	}
	
	@RequestMapping(value = "/savePost", method = RequestMethod.POST)
	public String savePost(@ModelAttribute("post") Post post) {
		daoPost.save(post);
		return "redirect:/";

	}
	
	
	
}

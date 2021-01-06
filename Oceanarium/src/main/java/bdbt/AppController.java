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
	@Autowired
	private EmployeeDAO daoEmployee;
	@Autowired
	private ImplementationDAO daoImplementation;
	@Autowired
	private SharkDAO daoShark;
	@Autowired
	private PositionDAO daoPosition;
	@Autowired
	private TransactionDAO daoTransaction;
	@Autowired
	private PaymentDAO daoPayment;
	@Autowired
	private WaterTankDAO daoWaterTank;
	@Autowired
	private WaterTankImplementationDAO daoWaterTankImplementation;
	@Autowired
	private AnimalDAO daoAnimal;

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

	@RequestMapping("/pracownicy")
	public String viewPracownicy(Model model) {

		List<Employee> listEmployee = daoEmployee.list();
		model.addAttribute("listEmployee", listEmployee);
		return "pracownicy";

	}
    /* Pracownicy*/
	@RequestMapping("/newEmployee")
	public String showNewEmployee(Model model) {

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee) {
		daoEmployee.save(employee);
		return "redirect:/";

	}
	
	/* Realizacje */
	@RequestMapping("/realizacje")
	public String viewRealizacje(Model model) {

		List<Implementation> listImplementation = daoImplementation.list();
		model.addAttribute("listImplementation", listImplementation);
		return "realizacje";

	}

	
	@RequestMapping("/newImplementation")
	public String showNewImplementation(Model model) {

		Implementation implementation = new Implementation();
		model.addAttribute("implementation", implementation);
		return "new_implementation";
	}

	@RequestMapping(value = "/saveImplementation", method = RequestMethod.POST)
	public String save(@ModelAttribute("implementation") Implementation implementation) {
		daoImplementation.save(implementation);
		return "redirect:/";

	}
	
	/* Rekiny */
	@RequestMapping("/rekiny")
	public String viewRekiny(Model model) {

		List<Shark> listShark = daoShark.list();
		model.addAttribute("listShark", listShark);
		return "rekiny";

	}

	
	@RequestMapping("/newShark")
	public String showNewShark(Model model) {

		Shark shark= new Shark();
		model.addAttribute("shark", shark);
		return "new_shark";
	}

	@RequestMapping(value = "/saveShark", method = RequestMethod.POST)
	public String save(@ModelAttribute("shark") Shark shark) {
		daoShark.save(shark);
		return "redirect:/";

	}
	
	/* Stanowiska */
	@RequestMapping("/stanowiska")
	public String viewStanowiska(Model model) {

		List<Position> listPosition = daoPosition.list();
		model.addAttribute("listPosition", listPosition);
		return "stanowiska";

	}

	
	@RequestMapping("/newPosition")
	public String showNewPosition(Model model) {

		Position position= new Position();
		model.addAttribute("position", position);
		return "new_position";
	}

	@RequestMapping(value = "/savePosition", method = RequestMethod.POST)
	public String save(@ModelAttribute("position") Position position) {
		daoPosition.save(position);
		return "redirect:/";

	}
	
	/* Transakcje*/
	@RequestMapping("/transakcje")
	public String viewTransakcje(Model model) {

		List<Transaction> listTransaction = daoTransaction.list();
		model.addAttribute("listTransaction", listTransaction);
		return "transakcje";

	}

	
	@RequestMapping("/newTransaction")
	public String showNewTransaction(Model model) {

		Transaction transaction= new Transaction();
		model.addAttribute("transaction", transaction);
		return "new_transaction";
	}

	@RequestMapping(value = "/saveTransaction", method = RequestMethod.POST)
	public String save(@ModelAttribute("transaction") Transaction transaction) {
		daoTransaction.save(transaction);
		return "redirect:/";

	}
	
	
	/* Wynagrodzenia*/
	@RequestMapping("/wynagrodzenia")
	public String viewWynagrodzenia(Model model) {

		List<Payment> listPayment = daoPayment.list();
		model.addAttribute("listPayment", listPayment);
		return "wynagrodzenia";

	}

	
	@RequestMapping("/newPayment")
	public String showNewPayment(Model model) {

		Payment payment= new Payment();
		model.addAttribute("payment", payment);
		return "new_payment";
	}

	@RequestMapping(value = "/savePayment", method = RequestMethod.POST)
	public String save(@ModelAttribute("payment") Payment payment) {
		daoPayment.save(payment);
		return "redirect:/";

	}
	
	/* Zbiorniki_wodne*/
	@RequestMapping("/zbiorniki_wodne")
	public String viewZbiorniki_wodne(Model model) {

		List<WaterTank> listWaterTank = daoWaterTank.list();
		model.addAttribute("listWaterTank", listWaterTank);
		return "zbiorniki_wodne";

	}

	
	@RequestMapping("/newWaterTank")
	public String showNewWaterTank(Model model) {

		WaterTank watertank= new WaterTank();
		model.addAttribute("watertank", watertank);
		return "new_watertank";
	}

	@RequestMapping(value = "/saveWaterTank", method = RequestMethod.POST)
	public String save(@ModelAttribute("watertank") WaterTank watertank) {
		daoWaterTank.save(watertank);
		return "redirect:/";

	}
	
	/* Zbiorniki_wodne_realizacje*/
	@RequestMapping("/zbiorniki_wodne_realizacje")
	public String viewZbiorniki_wodne_realizacje(Model model) {

		List<WaterTankImplementation> listWaterTankImplementation = daoWaterTankImplementation.list();
		model.addAttribute("listWaterTankImplementation", listWaterTankImplementation);
		return "zbiorniki_wodne_realizacje";

	}

	
	@RequestMapping("/newWaterTankImplementation")
	public String showNewWaterTankImplementation(Model model) {

		WaterTankImplementation watertankimplementation= new WaterTankImplementation();
		model.addAttribute("watertankimplementation", watertankimplementation);
		return "new_water_tank_implementation";
	}

	@RequestMapping(value = "/saveWaterTankImplementation", method = RequestMethod.POST)
	public String save(@ModelAttribute("watertankimplementation") WaterTankImplementation watertankimplementation) {
		daoWaterTankImplementation.save(watertankimplementation);
		return "redirect:/";

	}
	
	/* Zwierzeta*/
	@RequestMapping("/zwierzeta")
	public String viewZwierzeta(Model model) {

		List<Animal> listAnimal = daoAnimal.list();
		model.addAttribute("listAnimal", listAnimal);
		return "zwierzeta";

	}

	
	@RequestMapping("/newAnimal")
	public String showNewAnimal(Model model) {

		Animal animal= new Animal();
		model.addAttribute("animal", animal);
		return "new_animal";
	}

	@RequestMapping(value = "/saveAnimal", method = RequestMethod.POST)
	public String save(@ModelAttribute("animal") Animal animal) {
		daoAnimal.save(animal);
		return "redirect:/";

	}
	
	
	
}

package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/edit_adress/{id}")
	public ModelAndView showEditAdress(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_adress");
		Adress adress = daoAdres.get(id);
		mav.addObject("adress", adress);
		return mav;
	}

	@RequestMapping(value = "/updateAdress", method = RequestMethod.POST)
	public String updateAdress(@ModelAttribute("adress") Adress adress) {
		daoAdres.update(adress);
		return "redirect:/";
	}

	@RequestMapping("/deleteAdress/{id}")
	public String deleteAdress(@PathVariable(name = "id") int id) {
		daoAdres.delete(id);

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

	@RequestMapping("/edit_attraction/{id}")
	public ModelAndView showEditAttraction(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_attraction");
		Attraction attraction = daoAttraction.get(id);
		mav.addObject("attraction", attraction);
		return mav;
	}

	@RequestMapping(value = "/updateAttraction", method = RequestMethod.POST)
	public String updateAtrakcje(@ModelAttribute("attraction") Attraction attraction) {
		daoAttraction.update(attraction);

		return "redirect:/";
	}

	@RequestMapping("/deleteAttraction/{id}")
	public String deleteAttraction(@PathVariable(name = "id") int id) {
		daoAttraction.delete(id);

		return "redirect:/";
	}
	/* Delfiny */

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

	@RequestMapping("/edit_dolphin/{id}")
	public ModelAndView showEditDolphin(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_dolphin");
		Dolphin dolphin = daoDolphin.get(id);
		mav.addObject("dolphin", dolphin);
		return mav;
	}

	@RequestMapping(value = "/updateDolphin", method = RequestMethod.POST)
	public String updateDolphin(@ModelAttribute("dolphin") Dolphin dolphin) {
		daoDolphin.update(dolphin);

		return "redirect:/";
	}

	@RequestMapping("/deleteDolphin/{id}")
	public String deleteDolphin(@PathVariable(name = "id") int id) {
		daoDolphin.delete(id);

		return "redirect:/";
	}
	/* Foki */

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

	@RequestMapping("/edit_seal/{id}")
	public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_seal");
		Seal seal = daoSeal.get(id);
		mav.addObject("seal", seal);
		return mav;
	}

	@RequestMapping(value = "/updateSeal", method = RequestMethod.POST)
	public String updateSeal(@ModelAttribute("seal") Seal seal) {
		daoSeal.update(seal);

		return "redirect:/";
	}

	@RequestMapping("/deleteSeal/{id}")
	public String deleteSeal(@PathVariable(name = "id") int id) {
		daoSeal.delete(id);

		return "redirect:/";
	}

	/* klienci */

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

	@RequestMapping("/edit_client/{id}")
	public ModelAndView showEditClient(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_client");
		Client client = daoClient.get(id);
		mav.addObject("client", client);
		return mav;
	}

	@RequestMapping(value = "/updateClient", method = RequestMethod.POST)
	public String updateClient(@ModelAttribute("client") Client client) {
		daoClient.update(client);

		return "redirect:/";
	}

	@RequestMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable(name="id") int id) {
		daoClient.delete(id);
		
		return "redirect:/";
	}
	
	/* oceanaria */

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

	@RequestMapping("/edit_oceanarium/{id}")
	public ModelAndView showEditOceanarium(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_oceanarium");
		Oceanarium oceanarium = daoOceanarium.get(id);
		mav.addObject("oceanarium", oceanarium);
		return mav;
	}

	@RequestMapping(value = "/updateOceanarium", method = RequestMethod.POST)
	public String updateOceanarium(@ModelAttribute("oceanarium") Oceanarium oceanarium) {
		daoOceanarium.update(oceanarium);

		return "redirect:/";
	}

	@RequestMapping("/deleteOceanarium/{id}")
	public String deleteOceanarium(@PathVariable(name="id") int id) {
		daoOceanarium.delete(id);
		
		return "redirect:/";
	}
	
	
	/* opiekunowie zbiorniki wodne */
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

	@RequestMapping("/edit_watertankkeeper/{p}/{z}")
	public ModelAndView showEditWTK(@PathVariable(name = "p") int p, @PathVariable(name = "z") int z) {
		ModelAndView mav = new ModelAndView("edit_watertankkeeper");
		WaterTankKeeper waterTankKeeper = daoWaterTankKeeper.get(p, z);
		mav.addObject("watertankkeeper", waterTankKeeper);
		return mav;
	}

	@RequestMapping(value = "/updateWaterTankKeeper/{z}", method = RequestMethod.POST)
	public String updateWTK(@ModelAttribute("watertankkeeper") WaterTankKeeper wtk, @PathVariable(name = "z") int z) {
		daoWaterTankKeeper.update(wtk, z);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteWaterTankKeeper/{p}/{z}")
	public String deleteAdress(@PathVariable(name="p") int p, @PathVariable(name="z") int z) {
		daoWaterTankKeeper.delete(p,z);
		
		return "redirect:/";
	}

	/* poczty */
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

	@RequestMapping("/edit_post/{id}")
	public ModelAndView showEditPost(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_post");
		Post post = daoPost.get(id);
		mav.addObject("post", post);
		return mav;
	}

	@RequestMapping(value = "/updatePost", method = RequestMethod.POST)
	public String updatePost(@ModelAttribute("post") Post post) {
		daoPost.update(post);

		return "redirect:/";
	}
	
	@RequestMapping("/deletePost/{id}")
	public String deletePost(@PathVariable(name="id") int id) {
		daoPost.delete(id);
		
		return "redirect:/";
	}

	/* Pracownicy */
	@RequestMapping("/pracownicy")
	public String viewPracownicy(Model model) {

		List<Employee> listEmployee = daoEmployee.list();
		model.addAttribute("listEmployee", listEmployee);
		return "pracownicy";

	}

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
	@RequestMapping("/edit_employee/{id}")
	public ModelAndView showEditEmployee(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_employee");
		Employee employee = daoEmployee.get(id);
		mav.addObject("employee", employee);

		return mav;
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") Employee employee) {
		daoEmployee.update(employee);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(name = "id") int id) {
		daoEmployee.delete(id);

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

	@RequestMapping("/edit_implementation/{id}")
	public ModelAndView showEditImplementation(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_implementation");
		Implementation implementation = daoImplementation.get(id);
		mav.addObject("implementation", implementation);

		return mav;
	}

	@RequestMapping(value = "/updateImplementation", method = RequestMethod.POST)
	public String updateImplementation(@ModelAttribute("implementation") Implementation implementation) {
		daoImplementation.update(implementation);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteImplementation/{id}")
	public String deleteImplementation(@PathVariable(name="id") int id) {
		daoImplementation.delete(id);
		
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

		Shark shark = new Shark();
		model.addAttribute("shark", shark);
		return "new_shark";
	}

	@RequestMapping(value = "/saveShark", method = RequestMethod.POST)
	public String save(@ModelAttribute("shark") Shark shark) {
		daoShark.save(shark);
		return "redirect:/";

	}

	@RequestMapping("/edit_shark/{id}")
	public ModelAndView showEditShark(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_shark");
		Shark shark = daoShark.get(id);
		mav.addObject("shark", shark);

		return mav;
	}

	@RequestMapping(value = "/updateShark", method = RequestMethod.POST)
	public String updateShark(@ModelAttribute("shark") Shark shark) {
		daoShark.update(shark);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteShark/{id}")
	public String deleteShark(@PathVariable(name="id") int id) {
		daoShark.delete(id);
		
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

		Position position = new Position();
		model.addAttribute("position", position);
		return "new_position";
	}

	@RequestMapping(value = "/savePosition", method = RequestMethod.POST)
	public String save(@ModelAttribute("position") Position position) {
		daoPosition.save(position);
		return "redirect:/";

	}

	@RequestMapping("/edit_position/{id}")
	public ModelAndView showEditPosition(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_position");
		Position position = daoPosition.get(id);
		mav.addObject("position", position);

		return mav;
	}

	@RequestMapping(value = "/updatePosition", method = RequestMethod.POST)
	public String updatePosition(@ModelAttribute("position") Position position) {
		daoPosition.update(position);

		return "redirect:/";
	}
	
	@RequestMapping("/deletePosition/{id}")
	public String deletePosition(@PathVariable(name="id") int id) {
		daoPosition.delete(id);
		
		return "redirect:/";
	}

	/* Transakcje */
	@RequestMapping("/transakcje")
	public String viewTransakcje(Model model) {

		List<Transaction> listTransaction = daoTransaction.list();
		model.addAttribute("listTransaction", listTransaction);
		return "transakcje";

	}

	@RequestMapping("/newTransaction")
	public String showNewTransaction(Model model) {

		Transaction transaction = new Transaction();
		model.addAttribute("transaction", transaction);
		return "new_transaction";
	}

	@RequestMapping(value = "/saveTransaction", method = RequestMethod.POST)
	public String save(@ModelAttribute("transaction") Transaction transaction) {
		daoTransaction.save(transaction);
		return "redirect:/";

	}

	@RequestMapping("/edit_transaction/{p}/{z}")
	public ModelAndView showEditTransaction(@PathVariable(name = "p") int p, @PathVariable(name = "z") int z) {
		ModelAndView mav = new ModelAndView("edit_transaction");
		Transaction transaction = daoTransaction.get(p, z);
		mav.addObject("transaction", transaction);
		return mav;
	}

	@RequestMapping(value = "/updateTransaction/{z}", method = RequestMethod.POST)
	public String updateTransaction(@ModelAttribute("transaction") Transaction transaction, @PathVariable(name = "z") int z) {
		daoTransaction.update(transaction, z);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteTransaction/{p}/{z}")
	public String deleteTransaction(@PathVariable(name="p") int p, @PathVariable(name="z") int z) {
		daoTransaction.delete(p,z);
		
		return "redirect:/";
	}

	/* Wynagrodzenia */
	@RequestMapping("/wynagrodzenia")
	public String viewWynagrodzenia(Model model) {

		List<Payment> listPayment = daoPayment.list();
		model.addAttribute("listPayment", listPayment);
		return "wynagrodzenia";

	}

	@RequestMapping("/newPayment")
	public String showNewPayment(Model model) {

		Payment payment = new Payment();
		model.addAttribute("payment", payment);
		return "new_payment";
	}

	@RequestMapping(value = "/savePayment", method = RequestMethod.POST)
	public String save(@ModelAttribute("payment") Payment payment) {
		daoPayment.save(payment);
		return "redirect:/";

	}

	@RequestMapping("/edit_payment/{id}")
		public ModelAndView showEditPayment(@PathVariable(name = "id") int id) {
			ModelAndView mav = new ModelAndView("edit_payment");
			Payment payment = daoPayment.get(id);
			mav.addObject("payment", payment);
			
			return mav;
		}
		
		@RequestMapping(value = "/updatePayment", method = RequestMethod.POST)
		public String updatePayment(@ModelAttribute("payment") Payment payment) {
			daoPayment.update(payment);
			
			return "redirect:/";
		}
		
		@RequestMapping("/deletePayment/{id}")
		public String deletePayment(@PathVariable(name="id") int id) {
			daoPayment.delete(id);
			
			return "redirect:/";
		}

	/* Zbiorniki_wodne */
	@RequestMapping("/zbiorniki_wodne")
	public String viewZbiorniki_wodne(Model model) {

		List<WaterTank> listWaterTank = daoWaterTank.list();
		model.addAttribute("listWaterTank", listWaterTank);
		return "zbiorniki_wodne";

	}

	@RequestMapping("/newWaterTank")
	public String showNewWaterTank(Model model) {

		WaterTank watertank = new WaterTank();
		model.addAttribute("watertank", watertank);
		return "new_watertank";
	}

	@RequestMapping(value = "/saveWaterTank", method = RequestMethod.POST)
	public String save(@ModelAttribute("watertank") WaterTank watertank) {
		daoWaterTank.save(watertank);
		return "redirect:/";

	}

	@RequestMapping("/edit_watertank/{id}")
	public ModelAndView showEditWaterTank(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_watertank");
		WaterTank watertank = daoWaterTank.get(id);
		mav.addObject("watertank", watertank);
		
		return mav;
	}
	
	@RequestMapping(value = "/updateWaterTank", method = RequestMethod.POST)
	public String updateWaterTank(@ModelAttribute("watertank") WaterTank watertank) {
		daoWaterTank.update(watertank);
		
		return "redirect:/";
	}
	
	@RequestMapping("/deleteWaterTank/{id}")
	public String deleteWaterTank(@PathVariable(name="id") int id) {
		daoWaterTank.delete(id);
		
		return "redirect:/";
	}

	/* Zbiorniki_wodne_realizacje */
	@RequestMapping("/zbiorniki_wodne_realizacje")
	public String viewZbiorniki_wodne_realizacje(Model model) {

		List<WaterTankImplementation> listWaterTankImplementation = daoWaterTankImplementation.list();
		model.addAttribute("listWaterTankImplementation", listWaterTankImplementation);
		return "zbiorniki_wodne_realizacje";

	}

	@RequestMapping("/newWaterTankImplementation")
	public String showNewWaterTankImplementation(Model model) {

		WaterTankImplementation watertankimplementation = new WaterTankImplementation();
		model.addAttribute("watertankimplementation", watertankimplementation);
		return "new_water_tank_implementation";
	}

	@RequestMapping(value = "/saveWaterTankImplementation", method = RequestMethod.POST)
	public String save(@ModelAttribute("watertankimplementation") WaterTankImplementation watertankimplementation) {
		daoWaterTankImplementation.save(watertankimplementation);
		return "redirect:/";

	}

	@RequestMapping("/edit_watertankimplementation/{p}/{z}")
	public ModelAndView showEditWaterTankImplementation(@PathVariable(name = "p") int p, @PathVariable(name = "z") int z) {
		ModelAndView mav = new ModelAndView("edit_watertankimplementation");
		WaterTankImplementation watertankimplementation = daoWaterTankImplementation.get(p, z);
		mav.addObject("watertankimplementation", watertankimplementation);
		return mav;
	}

	@RequestMapping(value = "/updateWaterTankImplementation/{z}", method = RequestMethod.POST)
	public String updateWaterTankImplementation(@ModelAttribute("watertankimplementation") WaterTankImplementation watertankimplementation, @PathVariable(name = "z") int z) {
		daoWaterTankImplementation.update(watertankimplementation, z);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteWaterTankImplementation/{p}/{z}")
	public String deleteWaterTankImplementation(@PathVariable(name="p") int p, @PathVariable(name="z") int z) {
		daoWaterTankImplementation.delete(p,z);
		
		return "redirect:/";
	}

	/* Zwierzeta */
	@RequestMapping("/zwierzeta")
	public String viewZwierzeta(Model model) {

		List<Animal> listAnimal = daoAnimal.list();
		model.addAttribute("listAnimal", listAnimal);
		return "zwierzeta";

	}

	@RequestMapping("/newAnimal")
	public String showNewAnimal(Model model) {

		Animal animal = new Animal();
		model.addAttribute("animal", animal);
		return "new_animal";
	}

	@RequestMapping(value = "/saveAnimal", method = RequestMethod.POST)
	public String save(@ModelAttribute("animal") Animal animal) {
		daoAnimal.save(animal);
		return "redirect:/";

	}

	@RequestMapping("/edit_animal/{id}")
	public ModelAndView showEditAnimal(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_animal");
		Animal animal = daoAnimal.get(id);
		mav.addObject("animal", animal);

		return mav;
	}

	@RequestMapping(value = "/updateAnimal", method = RequestMethod.POST)
	public String updateAnimal(@ModelAttribute("animal") Animal animal) {
		daoAnimal.update(animal);

		return "redirect:/";
	}
	
	@RequestMapping("/deleteAnimal/{id}")
	public String deleteAnimal(@PathVariable(name="id") int id) {
		daoAnimal.delete(id);
		
		return "redirect:/";
	}

}

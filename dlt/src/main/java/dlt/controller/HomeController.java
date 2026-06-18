package dlt.controller;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import dlt.PasswordHasher;
import dlt.entity.Products;
import dlt.entity.User;
import dlt.repository.ProductRepository;
import dlt.repository.UserRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private UserRepository useerRepo;
	
	@GetMapping({"", "/"})
	public String viewHomePage(Model m) {
		List<User> list = useerRepo.findAll();
		m.addAttribute("all_users", list);
		return "index";
	}
		
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		char[] charArray = user.getPassword().toCharArray();
		int number = 123456;
        byte[] bytes = ByteBuffer.allocate(4).putInt(number).array();
        
        try {
        	user.setPassword(PasswordHasher.hashPassword(charArray, bytes));
        } catch (Exception e) {
			// TODO: handle exception
		}
            
		useerRepo.save(user);
		return "redirect:/register";
	}

	@GetMapping("/delete/{id}")
	public String deleteProducts(@PathVariable(value = "id") long id, HttpSession session) {
		useerRepo.deleteById(id);
//		session.setAttribute("msg", "Product Delete Sucessfully..");
		return "redirect:/";
	}
	
	@GetMapping("/edit_form/{id}")
	public String editForm(@PathVariable(value="id") long id, Model m) {
		Optional<User> user = useerRepo.findById(id);
		User pro = user.get();
		m.addAttribute("user", pro);
		return "edit";
	}
	
	@PostMapping("/update_user")
	public String updateProducts(@ModelAttribute User user, HttpSession session) {
		char[] charArray = user.getPassword().toCharArray();
		int number = 123456;
        byte[] bytes = ByteBuffer.allocate(4).putInt(number).array();
        
        try {
        	user.setPassword(PasswordHasher.hashPassword(charArray, bytes));
        } catch (Exception e) {
			// TODO: handle exception
		}
        
        useerRepo.save(user);
//		session.setAttribute("msg", "Product Update Sucessfully..");
		return "redirect:/";	
	}
	
//	@GetMapping({"", "/"})
//	public String index(Model m) {
//		List<Products> list = productRepo.findAll();
//		m.addAttribute("all_products", list);
//		return "index";
//	}
//	
//	@GetMapping({"/contact"})
//	public String contact() {
//		return "contact";
//	}
//	
//	@GetMapping({"/privacy"})
//	public String privacy() {
//		return "privacy";
//	}
//	
//	@GetMapping("/load_form")
//	public String loadForm() {
//		return "add";
//	}
//	
//	@GetMapping("/edit_form/{id}")
//	public String editForm(@PathVariable(value="id") long id, Model m) {
//		
//		Optional<Products> product = productRepo.findById(id);
//		
//		Products pro = product.get();
//		m.addAttribute("product", pro);
//		return "edit";
//	}
//
//	@PostMapping("/save_products")
//	public String saveProducts(@ModelAttribute Products products, HttpSession session) {
//		productRepo.save(products);
//		session.setAttribute("msg", "Product Added Sucessfully..");
//		return "redirect:/load_form";	
//	}
//	
//	@PostMapping("/update_products")
//	public String updateProducts(@ModelAttribute Products products, HttpSession session) {
//		productRepo.save(products);
//		session.setAttribute("msg", "Product Update Sucessfully..");
//		return "redirect:/";	
//	}
//	
//	@GetMapping("/delete/{id}")
//	public String deleteProducts(@PathVariable(value = "id") long id, HttpSession session) {
//		productRepo.deleteById(id);
//		session.setAttribute("msg", "Product Delete Sucessfully..");
//		return "redirect:/";
//	}
}

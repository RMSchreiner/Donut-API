package API.Donuts.Donuts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import API.Donuts.Donuts.Model.Donut;
import API.Donuts.Donuts.Model.DonutApiService;
import API.Donuts.Donuts.Model.Extras;
import API.Donuts.Donuts.Model.Ref;
import API.Donuts.Donuts.Model.Results;

@Controller
public class DonutController {

	
	@Autowired
	private DonutApiService donuts;
	
	@Autowired 
	private DonutApiService refs;
	
	@RequestMapping("/home")
	public String donutHome(Model model) {
		
		Donut donut = donuts.getDonuts();
		
		List<Results> stuff =  donut.getResults();
		
        model.addAttribute("results", stuff);		

		return "home";
	}
	
	@RequestMapping("/donut-details")
	public String donutDetails(@RequestParam(value = "id",required = true) int idref,
		                                                    	Model model) {
		   Ref ref = refs.getDetails(idref);
		
		    int calories =  ref.getCalories();
		   // List<Extras> extras  =  ref.getExtras();
		            String name  =  ref.getName();
		            String photo =  ref.getPhoto();
		               // System.out.print(extras);
		            model.addAttribute("calories",calories);
		          //  model.addAttribute("extras",extras);
		            model.addAttribute("name",name);
		            model.addAttribute("photo",photo);
		
		return "donut-details";
	}
	
	
	
	
	
}

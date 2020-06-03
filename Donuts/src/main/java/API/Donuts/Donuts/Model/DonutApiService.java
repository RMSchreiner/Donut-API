package API.Donuts.Donuts.Model;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DonutApiService {
	
		private   RestTemplate rest = new RestTemplate();
		
		public Donut getDonuts () {

	     String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
			
		Donut donuts = rest.getForObject(url, Donut.class);	
		
		return donuts;
		}
	
		
		public Ref getDetails(int idref) {
			
			String irl = "https://grandcircusco.github.io/demo-apis/donuts/" + idref + ".json";
			
			Ref refs = rest.getForObject(irl, Ref.class, idref);
			
			return refs;
		}
		
		
}
	


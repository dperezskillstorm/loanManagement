package loanManager.api.loanDetails;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	  public static final String GET_TRANSACTIONS_URL = "http://localhost:8080/api/v1/loanTransactions/";
	  
	   static RestTemplate restTemplate = new RestTemplate();
	  //Create restTemplate Object
	  public static void main(String[] args) {
		  callGetAllTransactions();
	  }
		  
		  private static void callGetAllTransactions() {
			  // info gets sent through headers
			  //create header obj
			  HttpHeaders headers = new HttpHeaders();
			  //set headers to accept json
			  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			  
			  //Create an enty that contains the HTTP
			  HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
			  
			  ResponseEntity<String> result = restTemplate.exchange(GET_TRANSACTIONS_URL, HttpMethod.GET, entity, String.class);
			  System.out.println(result.toString());
			
			  
			 
		  }
		  
		  
		  
		  
	  

}

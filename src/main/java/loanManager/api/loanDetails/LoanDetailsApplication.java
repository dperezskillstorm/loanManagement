package loanManager.api.loanDetails;

import java.io.IOException;
import java.net.URI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import antlr.collections.List;

@SpringBootApplication
@EnableJpaAuditing
public class LoanDetailsApplication {
	
//	static HttpClient client;


	public static void main(String[] args) throws IOException {
		SpringApplication.run(LoanDetailsApplication.class, args);
		
//		//going to test a http res, req
//		
//		//client = HttpClient.newHttpClient();
//		client = HttpClient.newBuilder()
//				.connectTimeout(Duration.ofSeconds(3))
//				.followRedirects(HttpClient.Redirect.NORMAL)
//				.build();
//		
////		
////		
////		Files.lines(Path.of("links.txt"))
////		.map(LoanDetailsApplication::validateLink)
////		.forEach(System.out::println);
////		
////		
//
////		var futures = Files.lines(Path.of("links.txt"))
////				.map(LoanDetailsApplication::validateLink)
////				.collect(Collectors.toList());
////				
//		//to make sure our progream doesnt execute bofore the links are async completed
////		futures.stream()
////		.map(CompletableFuture::join)
////		.forEach(System.out:: println);
//		
////		var futuresAmounts =Files.lines(Path.of("amount.txt"))
////				.map(LoanDetailsApplication:: postToSite)
////				.collect(Collectors.toList());
//		
//		postToSite();
//		
//		
//		
//		
////		Runnable r2  = ()-> System.out.println("print lmabda in runnable");
////	r2.run();
	}
}
	
//	private static CompletableFuture<String> validateLink(String link) {
//		//buid a request 
//
//		HttpRequest req = HttpRequest.newBuilder(URI.create(link))
//				.timeout(Duration.ofSeconds(2))
//				.GET()
//				.build();
//		
//		// now we build a response
////		try {
////			HttpResponse<Void> res = client.send(req, HttpResponse.BodyHandlers.discarding());
////			return responseToString(res);
////		} catch (IOException| InterruptedException e) {
////			return String.format("%s-> %s (status: %s)",link,false);
////
////		}
//		return client.sendAsync(req, HttpResponse.BodyHandlers.discarding())
//				.thenApply(LoanDetailsApplication:: responseToString)
//				.exceptionally(e-> String.format(" %s-> %s (status: )",link,false));
//		
//		
//	}
//	
//	
//	public static void postToSite(){
//		HttpRequest req = HttpRequest.newBuilder(URI.create( "http://localhost:8080/api/v1/loanDetails"))
//				.GET()
//				.build();
//		
//		
//		
//		HttpResponse<String> response;
//		try {
//			response = client.send(req, BodyHandlers.ofString());
//			System.out.println(response.body());
//
//		
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//								
//			
//				
//	}
//	
//
//	
//	public static String responseToString(HttpResponse<Void> response) {
//		int status = response.statusCode();
//		boolean success = status >= 200 && status <=299;
//		return String.format("%s -> %s (status: %s)",response.uri(), success, status);
//	}
//	
//	
//
//	
//	
//
//}

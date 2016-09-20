#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BouquetApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BouquetApplication.class, args);
	}
}

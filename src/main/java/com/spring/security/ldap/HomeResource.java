/**
 * 
 */
package com.spring.security.ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evaristosrodrigues
 *
 */
@RestController
public class HomeResource {
	@GetMapping("/")
	public String index() {
		return "Home Page";
	}

}

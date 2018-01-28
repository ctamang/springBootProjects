//package demoApp.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//	
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user1").password("userpassword").roles("USER").and().withUser("admin1")
//				.password("adminpassword").roles("USER", "ADMIN");
//	}
//	
//	protected void configure(HttpSecurity http) throws Exception {
//		http.httpBasic().and().authorizeRequests().antMatchers("/api/**").hasRole("USER").antMatchers("/**")
//				.hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
//
//	}
//
//}

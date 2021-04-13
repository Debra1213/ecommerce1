package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class WebMvcConfiguration {
	@Configuration
	public class WebMovcConfiguration {
		@Bean
		public BCryptPasswordEncoder passwordEncoder () {
			return new BCryptPasswordEncoder();
		}
	}

}

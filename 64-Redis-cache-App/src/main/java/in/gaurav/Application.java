package in.gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Application {

	@Bean
	LettuceConnectionFactory lettuceConnectionFactory() {
		LettuceConnectionFactory lcf=new LettuceConnectionFactory();
//		lcf.setHostName(null);
//		lcf.setPassword(null);
//		lcf.setPort(0);
		return lcf;
	}
	
	@Bean
	JedisConnectionFactory connectionFactory() {
		JedisConnectionFactory jedisConnectionFactory=new JedisConnectionFactory();
//		jedisConnectionFactory.setHostName(null);
//		jedisConnectionFactory.setPassword(null);
//		jedisConnectionFactory.setPort(0);
		return jedisConnectionFactory;
	}
	
	@Bean
	RedisTemplate<String, User> redisTemplate(){
		RedisTemplate<String, User> redisTemplate=new RedisTemplate<>();
		redisTemplate.setConnectionFactory(lettuceConnectionFactory());
		return redisTemplate;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

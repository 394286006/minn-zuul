package p.minn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration  
@EnableRedisHttpSession
public class AppConfig {

	@Bean
	public RedisTemplate<Object, Object> sessionRedisTemplate(
			JedisConnectionFactory connectionFactory) {
	    RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
	    //template.setKeySerializer(new StringRedisSerializer());
	    //template.setHashKeySerializer(new StringRedisSerializer());
	    //template.setValueSerializer(new StringRedisSerializer());
	   // template.setDefaultSerializer(new StringRedisSerializer());
	  //  template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());

	    template.setConnectionFactory(connectionFactory);
	    return template;
	}
}

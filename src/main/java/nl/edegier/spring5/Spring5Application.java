package nl.edegier.spring5;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class Spring5Application  extends AbstractReactiveMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(Spring5Application.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "reactive";
	}

	@Override
	@Bean
	public MongoClient reactiveMongoClient() {
		return MongoClients.create(String.format("mongodb://localhost:%d", 27017));
	}
}

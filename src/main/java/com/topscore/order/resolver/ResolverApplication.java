package com.topscore.order.resolver;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResolverApplication.class, args);
	}

    @Bean
    public Queue queue() {
        return QueueBuilder.durable("order-vip").build();
    }
}

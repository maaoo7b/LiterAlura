package com.gutendex.gutendex;

import com.gutendex.gutendex.model.GeneralData;
import com.gutendex.gutendex.service.APIConsumption;
import com.gutendex.gutendex.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GutendexApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GutendexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new APIConsumption();
		var json = consumoApi.getData("https://gutendex.com/books/");
		System.out.println(json);

		ConvertData converter = new ConvertData();
		var data = converter.getData(json, GeneralData.class);
		System.out.println(data);

	}
}

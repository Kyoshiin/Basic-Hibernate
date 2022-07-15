package com.cts.main;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
import com.cts.model.Bike;
import com.cts.model.Car;
import com.cts.repository.BikeRepository;
import com.cts.repository.CarRepository;
import com.cts.repository.VechileRepository;
 
@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class InheritanceMappingApplication implements CommandLineRunner {
 
    @Autowired
    VechileRepository vr;
 
    @Autowired
    CarRepository cr;
 
    @Autowired
    BikeRepository br;
 
    public static void main(String[] args) {
        SpringApplication.run(InheritanceMappingApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        Bike bike1 = new Bike();
        bike1.setEngineNumber("E3235S321654");
        bike1.setChasisNumber("C2135AA32165");
        bike1.setFuelType("Petrol/Electic");
        br.save(bike1);
 
        Car car1 = new Car();
        car1.setEngineNumber("ED658AA659874");
        car1.setChasisNumber("CA3265AS65498");
        car1.setFuelType("Petrol/Diedel/Gas/Electic");
        cr.save(car1);
 
        List<Bike> bikes = br.findAll();
        for (Bike bike : bikes) {
            System.out.println(bike);
        }
 
        List<Car> cars = cr.findAll();
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
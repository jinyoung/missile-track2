package gov.dod.missile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MissileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissileApplication.class, args);
	}

	static Missile missile = new Missile();

	@RequestMapping(path="/missile", method = RequestMethod.GET)
	public Missile getMissile(){

		System.out.println("now the missile info has been requested");

		return missile;
	}

	@RequestMapping(path="/missile", method = RequestMethod.POST)
	public Missile setMissile(@RequestBody  Missile missile_){
		missile = missile_;

		return missile;
	}

	@RequestMapping(path="/missile", method = RequestMethod.DELETE)
	public Missile deleteMissile(){
		missile = new Missile();

		return missile;
	}

	@RequestMapping(path="/estimate", method = {RequestMethod.POST, RequestMethod.GET})
	public Missile estimate(){

		System.out.println("estimated");

		return missile;
	}


	@RequestMapping(path="/estimate", method = {RequestMethod.POST, RequestMethod.GET})
	public Battery selectBattery(){

		System.out.println("battery selected");


		//missile 기반으로 포대를 선택.

		return new Battery();
	}

}

package demo;

import demo.domain.UnitInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunningLocationServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(RunningLocationServiceApplication.class, args);
        UnitInfo unitInfo = new UnitInfo();
        unitInfo.setCustomerNmae("zhuo");
    }
}

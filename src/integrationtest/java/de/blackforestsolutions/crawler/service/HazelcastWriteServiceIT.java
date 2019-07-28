package de.blackforestsolutions.crawler.service;

import de.blackforestsolutions.crawler.ObjectMothers.ApiTokenAndUrlInformationObjectMother;
import de.blackforestsolutions.crawler.model.ApiTokenAndUrlInformation;
import de.blackforestsolutions.crawler.service.communicationservice.HazelcastWriteService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HazelcastWriteServiceIT {

    @Autowired
    HazelcastWriteService hazelcastWriteService;

    @Test
    public void test_write_and_read_and_check_result() throws MalformedURLException {
        ApiTokenAndUrlInformation testData = ApiTokenAndUrlInformationObjectMother.getHazelcastTokenAndUrl();

        hazelcastWriteService.writeToHazelcast("franz", "tafel", testData);
        String result = hazelcastWriteService.readFromHazelcast("franz", testData);

        Assertions.assertThat(result).isEqualTo("tafel");
    }

    @Test
    public void test_read_all_data() throws MalformedURLException {
        ApiTokenAndUrlInformation testData = ApiTokenAndUrlInformationObjectMother.getHazelcastTokenAndUrl();

        hazelcastWriteService.writeToHazelcast("william", "baer", testData);
        Map<String, String> frst = hazelcastWriteService.readAllFromHazelcast(testData);


        Assertions.assertThat(frst.get("william")).isEqualTo("baer");
    }

}

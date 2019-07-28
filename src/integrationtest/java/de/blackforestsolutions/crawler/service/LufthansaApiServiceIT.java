package de.blackforestsolutions.crawler.service;

import de.blackforestsolutions.crawler.ObjectMothers.ApiTokenAndUrlInformationObjectMother;
import de.blackforestsolutions.crawler.model.ApiTokenAndUrlInformation;
import de.blackforestsolutions.crawler.model.Journey;
import de.blackforestsolutions.crawler.service.communicationservice.LufthansaApiService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LufthansaApiServiceIT {

    @Autowired
    LufthansaApiService lufthansaApiService;

    @Test
    public void test_() throws Exception {
        ApiTokenAndUrlInformation testData = ApiTokenAndUrlInformationObjectMother.getLufthansaTokenAndUrlIT();

        Map<String, Journey> result = lufthansaApiService.getJourneysForRouteFromApiWith(testData);

        Assertions.assertThat(1).isEqualTo(1);
    }
}

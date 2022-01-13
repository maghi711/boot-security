package com.maghi711.bootsecuritydemo.timeofday.service;

import com.maghi711.bootsecuritydemo.timeofday.repo.TimeOfDayRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

class TestTimeofDayService {

    @Test
    void testTimeOfday() {
        // Mocking the dependency
        TimeOfDayRepo timeOfDayRepo = Mockito.mock(TimeOfDayRepo.class);
        Mockito.when(timeOfDayRepo.timeOfDay()).thenReturn(LocalTime.now().toString());

        TimeofDayService service = new TimeofDayService();
        service.setTimeOfDayRepo(timeOfDayRepo);
        String timeofDay = service.timeOfDay();
        assertThat(timeofDay).isNotEmpty().isNotNull();
    }
}

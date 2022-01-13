package com.maghi711.bootsecuritydemo.timeofday.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestTimeofDayService {

    @Test
    void testTimeOfday() {
        TimeofDayService service = new TimeofDayService();
        String timeofDay = service.timeOfDay();
        assertThat(timeofDay).isNotEmpty();
    }
}

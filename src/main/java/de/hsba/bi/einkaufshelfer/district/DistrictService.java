package de.hsba.bi.einkaufshelfer.district;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

public class DistrictService {

       private final DistrictRepository districtRepository;

        @EventListener(ApplicationStartedEvent.class)
        public void initDistricts() {
            // Engage the initialization of all postalcodes
            createDistrict("Allermöhe",21035);
        }

        public void createDistrict (String districtname, Integer postalcode){
            DistrictRepository.save(new District(districtname,postalcode));
        }

    }



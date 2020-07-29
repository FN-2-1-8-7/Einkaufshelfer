package de.hsba.bi.einkaufshelfer.district;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Basic;
import javax.persistence.Entity;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    public class District  {


        @Basic(optional = false)
        private String districtname;

        @Basic(optional = false)
        private Integer postalcode;


        public District(String districtname, Integer postalcode) {
            this.districtname = districtname;
            this.postalcode = postalcode;
        }

    }


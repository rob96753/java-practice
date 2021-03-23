package tech.robnelson.demo;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;


public class Donor {
    // the methods in Optional are static
    private Optional<String> lastName = Optional.empty();
    private Optional<String> ssn = Optional.empty();
    private Optional<LocalDate> dob = Optional.empty();
    private Optional<LocalDate> lastDonation = Optional.of(Donor.getDate());
    public static int NUMBER_OF_DAYS = 56;

    public Donor(String lastName, String ssn, LocalDate dob) {
        this.lastName = Optional.of(lastName);
        // could use a regular expression to determine if the name contains lower case.
        if (this.lastName.isPresent()) {
            this.lastName = Optional.of(lastName.toUpperCase());
        }
        this.ssn = Optional.of(ssn);
        this.dob = Optional.of(dob);
    }

    public Optional<String> getLastName() {
        return this.lastName;
    }

    public Optional<String> getSsn() {
        return this.ssn;
    }

    public Optional<LocalDate> getDob() {
        return this.dob;
    }

    public Optional<LocalDate> getLastDonation() {       
        //Supplier <Optional<LocalDate>> supplier = () -> Optional.of(LocalDate.now().minusDays(NUMBER_OF_DAYS));
        //return this.lastDonation.orElseGet(1);
        return this.lastDonation;
    }

    public static LocalDate getDate() {     
        return LocalDate.now().minusDays(NUMBER_OF_DAYS);
    }

    public void setLastDonation(LocalDate lastDonation) {
        this.lastDonation = Optional.of(lastDonation);
    }

    
}


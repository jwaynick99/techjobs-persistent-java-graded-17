package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 40, message = "Must have between 3 and 40 characters")
    private String location;

    public @NotNull @Size(min = 3, max = 40, message = "Must have between 3 and 40 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(min = 3, max = 40, message = "Must have between 3 and 40 characters") String location) {
        this.location = location;
    }

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){};
}

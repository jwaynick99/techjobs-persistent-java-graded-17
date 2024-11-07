package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 100, message = "Must have between 3 and 100 characters")
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public @NotNull @Size(min = 3, max = 100, message = "Must have between 3 and 100 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull @Size(min = 3, max = 100, message = "Must have between 3 and 100 characters") String description) {
        this.description = description;
    }
}

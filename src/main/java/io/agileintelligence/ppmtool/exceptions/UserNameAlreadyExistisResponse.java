package io.agileintelligence.ppmtool.exceptions;

public class UserNameAlreadyExistisResponse {

    private String username;

    public UserNameAlreadyExistisResponse(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

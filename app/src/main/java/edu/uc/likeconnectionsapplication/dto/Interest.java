package edu.uc.likeconnectionsapplication.dto;

/**
 * A dto representing a user interest
 * has a category, name, type, isMultiplayer, and season (optional)
 * Example: an interest object representing football
 * category = sports, name = football, type = outdoors, isMultiPlayer = true.
 */

public class Interest {

    private String category;
    private String name;
    private String type;
    private boolean isMultiplayer;
    private String season;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsMultiplayer() {
        return isMultiplayer;
    }

    public void setMultiplayer(boolean multilayer) {
        this.isMultiplayer = multilayer;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}

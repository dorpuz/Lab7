public enum CardinalPoints {
    NORTH("N","North","Północ"),
    NORTHEAST("NE","North east","Północny wschód"),
    EAST("E","East","Wschód"),
    SOUTHEAST("SE","South east","Południowy wschód"),
    SOUTH("S","South","Południe"),
    SOUTHWEST("SW","South west","Południowy zachód"),
    WEST("W","West","Zachód"),
    NORTHWEST("NW","North west","Północny zachód");

    private String abbrev;
    private String engName;
    private String polName;

    CardinalPoints(String abbrev, String engName, String polName) {
        this.abbrev = abbrev;
        this.engName = engName;
        this.polName = polName;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public String getEngName() {
        return engName;
    }

    public String getPolName() {
        return polName;
    }
}

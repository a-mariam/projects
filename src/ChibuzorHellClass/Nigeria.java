package ChibuzorHellClass;

public enum Nigeria {

    NORTHCENTRAL("Benue","FCT","Kogi","Kwara", "Nasarawa","Niger", "Plateau"),
    NORTHEAST("Adamawa","Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto","Jigawa","Zamfara"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTHSOUTH("Akwa-ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTHWEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");
    private String[] geoPoliticalZone;

    Nigeria(String... geoPoliticalZone){
        this.geoPoliticalZone = geoPoliticalZone;
    }
    public String[] getGeoPoliticalZone(){
        return geoPoliticalZone;
    }

}

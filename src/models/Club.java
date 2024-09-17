package models;

public class Club {
    String Clubtype;
    String Clubname;
    String ClubId;

    public Club(String clubtype, String clubname, String clubId) {
        Clubtype = clubtype;
        Clubname = clubname;
        ClubId = clubId;
    }

    public String getClubtype() {
        return Clubtype;
    }

    public void setClubtype(String clubtype) {
        Clubtype = clubtype;
    }

    public String getClubname() {
        return Clubname;
    }

    public void setClubname(String clubname) {
        Clubname = clubname;
    }

    public String getClubId() {
        return ClubId;
    }

    public void setClubId(String clubId) {
        ClubId = clubId;
    }
}

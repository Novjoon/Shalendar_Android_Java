package kr.ac.smu.cs.shalendar_java;

public class BoardTeamItem {

    private String teammate_name;
    private int teammate_pic;

    public BoardTeamItem() {
    }

    public BoardTeamItem(String teammate_name, int teammate_pic) {
        this.teammate_name = teammate_name;
        this.teammate_pic = teammate_pic;
    }

    public String getTeammate_name() {
        return teammate_name;
    }

    public void setTeammate_name(String teammate_name) {
        this.teammate_name = teammate_name;
    }

    public int getTeammate_pic() {
        return teammate_pic;
    }

    public void setTeammate_pic(int teammate_pic) {
        this.teammate_pic = teammate_pic;
    }
}

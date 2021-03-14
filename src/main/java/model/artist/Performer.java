package model.artist;

import model.enums.VoiceType;

public class Performer extends Artist {
    private String stageName;
    private VoiceType voice;

    public Performer(String firstname, String lastname, int birthYear, String birthPlace, String label, String stageName, VoiceType voice) {
        super(firstname, lastname, birthYear, birthPlace, label);
        this.stageName = stageName;
        this.voice = voice;
    }

    public Performer(String firstname, String lastname, int birthYear, String birthPlace) {
        super(firstname, lastname, birthYear, birthPlace);
    }

    public Performer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public String getStageName() {
        return stageName;
    }

    public VoiceType getVoice() {
        return voice;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public void setVoice(VoiceType voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "stageName='" + stageName + '\'' +
                ", voice=" + voice +
                '}';
    }
}

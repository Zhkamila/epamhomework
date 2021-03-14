package model.enums;

public enum VoiceType {
    SOPRANO("Soprano"),
    ALTO("Alto"),
    TENOR("Tenor"),
    BASS("Bass"),
    BARITONE("Baritone"),
    MEZZOSOPRANO("Mezzo-soprano");

    private String voice;

    VoiceType(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public String toString() {
        return voice;
    }
}

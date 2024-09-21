// Target
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee
class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

class Mp3Player {
    public void playMp3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

// Adapter
class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;
    private Mp3Player mp3Player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player = new Mp3Player();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.playMp3(fileName);
        }
    }
}

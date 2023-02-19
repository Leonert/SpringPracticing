public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    void playMusic() {
        System.out.println(music.playMysic() + " is playing");
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}

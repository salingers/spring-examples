package onlyfun.caterpillar;

public class MusicBoxFactory {
    public static IMusicBox createMusicBox() {
        return new IMusicBox() {
            public void play() {
                System.out.println("������^���֡K");
            }
        };
    }
}

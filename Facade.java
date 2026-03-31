class HomeTheaterFacade {
    private TV tv = new TV();
    private AudioSystem audio = new AudioSystem();
    private DVDPlayer dvd = new DVDPlayer();
    private GameConsole console = new GameConsole();

    public void watchMovie() {
        System.out.println("=== Смотреть фильм ===");
        tv.on();
        tv.setChannel("HDMI");
        audio.on();
        audio.setVolume(20);
        dvd.play();
    }

    public void playGame() {
        System.out.println("=== Играть ===");
        tv.on();
        audio.on();
        console.on();
        console.playGame("FIFA");
    }

    public void listenMusic() {
        System.out.println("=== Слушать музыку ===");
        tv.on();
        audio.on();
        audio.setVolume(15);
    }

    public void setVolume(int v) {
        audio.setVolume(v);
    }

    public void turnOffAll() {
        System.out.println("=== Выключение ===");
        dvd.stop();
        audio.off();
        tv.off();
    }
}

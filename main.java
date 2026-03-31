public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();

        facade.watchMovie();
        facade.playGame();
        facade.listenMusic();
        facade.setVolume(10);
        facade.turnOffAll();
    }
}

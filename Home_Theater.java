class TV {
    public void on() { System.out.println("TV включен"); }
    public void off() { System.out.println("TV выключен"); }
    public void setChannel(String channel) {
        System.out.println("Канал: " + channel);
    }
}

class AudioSystem {
    public void on() { System.out.println("Аудио включено"); }
    public void off() { System.out.println("Аудио выключено"); }
    public void setVolume(int volume) {
        System.out.println("Громкость: " + volume);
    }
}

class DVDPlayer {
    public void play() { System.out.println("DVD воспроизведение"); }
    public void pause() { System.out.println("DVD пауза"); }
    public void stop() { System.out.println("DVD стоп"); }
}

class GameConsole {
    public void on() { System.out.println("Консоль включена"); }
    public void playGame(String game) {
        System.out.println("Запуск игры: " + game);
    }
}

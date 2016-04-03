import teamtreehouse.KaraokeMachine;
import teamtreehouse.model.SongBook;

public class Lab6_Karaoke {
  
  public static void main(String[] args) {
    SongBook songBook = new SongBook();
    KaraokeMachine machine = new KaraokeMachine(songBook);
    machine.run();
  }
}

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Musica {
    public static Clip clip;
    
    public static void musica(){
        try {
            //escolhe um arquivo de audio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/OtherSources/bgm.wav"));//src/OtherSources/filename.wav
            clip = AudioSystem.getClip();   //coloca o audio no clip
            clip.open(audioInputStream);    //toca o clip
            clip.loop(Clip.LOOP_CONTINUOUSLY);  //deixa o clip em loop infinito
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void pararMusica(){
        //para a execuçao da bgm
        clip.stop();
    }
    
    public static void mudarVolume(float volume) {
        //metodo para mudar o volume da musica pelo slider
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        float dB = (float) (Math.log10(volume) * 20);   //converte o valor pra escala de db
        gainControl.setValue(dB);
    }
}
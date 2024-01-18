
package texttospeech;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;


/**
 *
 * @author shiva
 */
public class TextToSpeech {

    
    public static void main(String[] args) 
    {
      System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
      Voice voice = VoiceManager.getInstance().getVoice("kevin16"); 
      
      Voice []voicelist = VoiceManager.getInstance().getVoices();
      for(int i=0;i<voicelist.length;i++)
      {
          System.out.println("# Voice: "+voicelist[i].getName());
      }
      
      if(voice!=null)
      {
       voice.allocate();
       System.out.println("Voice rate: "+voice.getRate());
       System.out.println("Voice Pitch: "+voice.getPitch());
       System.out.println("Voice Volume: "+voice.getVolume()); 
       
       boolean status = voice.speak("Hello Shubham");
       System.out.println("Status: "+status);
       
       voice.deallocate();
      }
      else
      {
          System.out.println("Error in Getting Voices");
      }
          
    }
    
}

package CofeeMachine;

import java.util.Date;

/**
 * Created by User on 17.03.2016.
 */
public class Model {
    private int value;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     * @param valueInt
     * @return sum
     */
    public class Cofee {


            WatchMaker maker = getMakerByName("Digital");
            Watch watch = maker.createWatch();
            watch.showTime();


        public static WatchMaker getMakerByName(String maker){
            if(maker.equals("Digital"))
                return new DigitalWatchMaker();
            else if (maker.equals("Digital"))
                return new RomeWatchMaker();

            throw new RuntimeException("No watch"+ maker);
        }
    }

    interface Watch{
        void showTime();
    }

    class DigitalWatch implements Watch{
        public void showTime(){
            System.out.println(new Date());
        }
    }

    class RomeWatch implements Watch{
        public void showTime(){
            System.out.println("VII-XX");
        }
    }

    interface WatchMaker{
        Watch createWatch();
    }

    class DigitalWatchMaker implements WatchMaker{
        public Watch createWatch(){
            return new DigitalWatch();
        }
    }

    class RomeWatchMaker implements WatchMaker{
        public Watch createWatch(){
            return new RomeWatch();
        }
    }

}

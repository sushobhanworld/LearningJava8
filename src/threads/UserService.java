package threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserService {
    public String birthDate(int userId){
        Date birthDay= birthDayFromDB(userId);
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(birthDay);
    }

    private static Date birthDayFromDB(int userId){
        return new Date();
    }

    public static void main(String[] args) {
        new Thread(()->{
            String birthDate = new UserService().birthDate(100);
            System.out.println(birthDate);
        }).start();

        new Thread(()->{
            String birthDate = new UserService().birthDate(100);
            System.out.println(birthDate);
        }).start();
    }
}

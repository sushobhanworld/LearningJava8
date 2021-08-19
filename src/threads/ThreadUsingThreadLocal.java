package threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadUsingThreadLocal {
    public static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal= ThreadLocal.withInitial(
            ()->new SimpleDateFormat("yyyy-MM-dd")
    );

    public String birthDate(int userId){
        Date birthDay= birthDayFromDB(userId);
        new ThreadUsingThreadLocal();
        final SimpleDateFormat simpleDateFormat= simpleDateFormatThreadLocal.get();
        return simpleDateFormat.format(birthDay);
    }

    private static Date birthDayFromDB(int userId){
        return new Date();
    }

    public static void main(String[] args) {
        // ...Based on which thread is called on get(), that thread will have its own copy of SimpleDateFormat object.
        ThreadUsingThreadLocal threadUsingThreadLocal= new ThreadUsingThreadLocal();
        threadUsingThreadLocal.birthDate(100);
    }
}

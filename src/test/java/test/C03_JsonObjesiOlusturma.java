package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

    /*
           Asagidaki JSON Objesini olusturup
       konsolda yazdirin.
       {
       "title":"Ahmet",
       "body":"Merhaba",
       "userId":1
       }

     */

    @Test
    public void jsonObje01(){

        JSONObject ilkJsonObje = new JSONObject();

        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId",1);

        System.out.println("Ilk Json Objemiz : " +ilkJsonObje);
        /*
        Ilk Json Objemiz : {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
        }
         */


    }

    @Test
    public void jsonObje02(){

        /*
        Asagidaki JSON Objesini olusturup konsolda yazdirin.
                   {
           "firstname":"Jim",
           "additionalneeds":"Breakfast",
           "bookingdates":{
           "checkin":"2018-01-01",
           "checkout":"2019-01-01"
                          },
           "totalprice":111,
           "depositpaid":true,
           "lastname":"Brown"
           }

         */

        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        JSONObject outerjson = new JSONObject();

        outerjson.put("firstname","Jim");
        outerjson.put("additionalneeds","Breakfast");
        outerjson.put("totalprice",111);
        outerjson.put("depositpaid",true);
        outerjson.put("lastname","Brown");
        outerjson.put("bookingdates",bookingDates);

        System.out.println("Booking Json Objemiz : "+ outerjson);

        /*
        Booking Json Objemiz : {"firstname":"Jim",
        "additionalneeds":"Breakfast",
        "bookingdates":{
        "checkin":"2018-01-01","checkout":"2019-01-01"
                       },
                       "totalprice":111,
                       "depositpaid":true,"lastname":"Brown"}

         */
    }
}

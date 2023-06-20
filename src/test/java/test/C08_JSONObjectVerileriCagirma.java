package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C08_JSONObjectVerileriCagirma {

    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
                },
    "phoneNumbers": [
                    {
                        "type": "iPhone",
                        "number": "0123-4567-8888"
                    },
                    {
                        "type": "home",
                        "number": "0123-4567-8910"
                    }
                    ]
    }
     */

    @Test
    public void jsonTest01(){
       /*
        "phoneNumbers": [
        {
            "type": "iPhone",
                "number": "0123-4567-8888"
        },
        {
            "type": "home",
                "number": "0123-4567-8910"
        }
                    ]
        */

        JSONObject cepTel = new JSONObject();
        JSONObject evTel = new JSONObject();

        cepTel.put("type", "iPhone");
        cepTel.put("number", "0123-4567-8888");

        evTel.put("type", "home");
        evTel.put("number", "0123-4567-8910");

        JSONArray phoneNumbers = new JSONArray();

        phoneNumbers.put(0,cepTel);
        phoneNumbers.put(1,evTel);


        /*
         "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
                }
         */

        JSONObject address= new JSONObject();

        address.put("streetAddress", "naist street");
        address.put("city", "Nara");
        address.put("postalCode", "630-0192");


        JSONObject kisiBilgisi = new JSONObject();

        kisiBilgisi.put("firstName", "John");
        kisiBilgisi.put("lastName", "doe");
        kisiBilgisi.put("age", 26);
        kisiBilgisi.put("address", address);
        kisiBilgisi.put("phoneNumbers", phoneNumbers);

        System.out.println("kisiBilgisi : " + kisiBilgisi);


        System.out.println("Isim : " +kisiBilgisi.get("firstName") );//Isim : John

        System.out.println("SoyIsim : " +kisiBilgisi.get("lastName") );

        System.out.println("Yas : " +kisiBilgisi.get("age") );
        // icinde data turu farklı olan bir cok obje oldugu için getJSONObject ile get diyip ilgili kısmı yazıyoruz
        System.out.println("Sokak Adi : " +kisiBilgisi.getJSONObject("address").get("streetAddress"));
        System.out.println("Sehir : " +kisiBilgisi.getJSONObject("address").get("city"));
        System.out.println("Posta : " +kisiBilgisi.getJSONObject("address").get("postalCode"));

        System.out.println("Tel no : " +kisiBilgisi
                .getJSONArray("phoneNumbers")
                .getJSONObject(0)
                .get("number"));

        System.out.println("Tel no : " +kisiBilgisi
                .getJSONArray("phoneNumbers")
                .getJSONObject(0)
                .get("type"));

    }


}

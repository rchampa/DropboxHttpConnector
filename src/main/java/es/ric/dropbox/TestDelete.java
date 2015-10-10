package es.ric.dropbox;

/**
 * Created by Ricardo on 10/10/15.
 */
public class TestDelete {


    public static void main(String[] args){
        String access_token = "GJtZoMeO0nAAAAAAAAAADoUbKsXxXqwYBltWxDqnta6MpBgw3k6Kh19CvtIoDAI6";
        DropboxOkHttp dropbox = new DropboxOkHttp(access_token);
        try {

            String response = dropbox.deleteFile("/upload/collage2.jpg");
            System.out.println(response);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}

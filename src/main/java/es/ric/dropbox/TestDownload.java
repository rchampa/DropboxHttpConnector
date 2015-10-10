package es.ric.dropbox;

/**
 * Created by Ricardo on 10/10/15.
 */
public class TestDownload {

    public static void main(String[] args){
        String access_token = "GJtZoMeO0nAAAAAAAAAADoUbKsXxXqwYBltWxDqnta6MpBgw3k6Kh19CvtIoDAI6";
        DropboxOkHttp dropbox = new DropboxOkHttp(access_token);
        try{
            dropbox.download("/upload/collage.jpg","collage.jpg");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

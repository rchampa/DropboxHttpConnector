package es.ric.dropbox;

/**
 * Created by Ricardo Champa on 10/10/15.
 */
public class TestCreateFolder {


    public static void main(String[] args){
        String access_token = "GJtZoMeO0nAAAAAAAAAADoUbKsXxXqwYBltWxDqnta6MpBgw3k6Kh19CvtIoDAI6";
        DropboxOkHttp dropbox = new DropboxOkHttp(access_token);
        try {

            String response = dropbox.createFolder("/upload/newfolder");
            System.out.println(response);
            //Posible response
            //{"name": "newfolder", "path_lower": "/upload/newfolder", "id": "id:GKtLyTal3OAAAAAAAAAADA"}
            //{"error_summary": "path/conflict/folder/", "error": {".tag": "path", "path": {".tag": "conflict", "conflict": {".tag": "folder"}}}}

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}

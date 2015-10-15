package es.ric.dropbox;

/**
 * Created by Ricardo Champa on 10/10/15.
 */
public class TestSearch {


    public static void main(String[] args){
        String access_token = "GJtZoMeO0nAAAAAAAAAADoUbKsXxXqwYBltWxDqnta6MpBgw3k6Kh19CvtIoDAI6";
        DropboxOkHttp dropbox = new DropboxOkHttp(access_token);
        try {

            /*
            The value will be one of the following datatypes:
            filename Void Search file and folder names.
            filename_and_content Void Search file and folder names as well as file contents.
            deleted_filename Void Search for deleted file and folder names.
             */

            String response = dropbox.search("/upload","paper",0,100,"filename");
            System.out.println(response);

            /*
            Posible response
            {"matches": [
                {"match_type": {".tag": "filename"}, "metadata": {".tag": "folder", "name": "paper_folder", "path_lower": "/upload/paper_folder", "id": "id:GKtLyTal3OAAAAAAAAAADg"}},
                {"match_type": {".tag": "filename"}, "metadata": {".tag": "file", "name": "paper.jpg", "path_lower": "/upload/paper.jpg", "id": "id:GKtLyTal3OAAAAAAAAAACQ", "client_modified": "2015-10-10T00:27:54Z", "server_modified": "2015-10-10T00:27:54Z", "rev": "d3dcb771e", "size": 45602}},
                {"match_type": {".tag": "filename"}, "metadata": {".tag": "file", "name": "paper2.jpg", "path_lower": "/upload/paper2.jpg", "id": "id:GKtLyTal3OAAAAAAAAAADQ", "client_modified": "2015-10-10T00:27:54Z", "server_modified": "2015-10-15T19:41:29Z", "rev": "183dcb771e", "size": 45602}}
                ],
             "more": false,
             "start": 3}
             */

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}

package es.ric.dropbox;

/**
 * Created by Ricardo on 10/10/15.
 */
public class TestListFolder {


    public static void main(String[] args){
        String access_token = "GJtZoMeO0nAAAAAAAAAADoUbKsXxXqwYBltWxDqnta6MpBgw3k6Kh19CvtIoDAI6";
        DropboxOkHttp dropbox = new DropboxOkHttp(access_token);
        try {

            String response = dropbox.listFolder("/upload", false);
            System.out.println(response);
            /*
            {"entries": [
                {".tag": "file", "name": "story.txt", "path_lower": "/upload/story.txt", "id": "id:GKtLyTal3OAAAAAAAAAABQ", "client_modified": "2015-10-09T01:08:43Z", "server_modified": "2015-10-09T01:08:43Z", "rev": "63dcb771e", "size": 65},
                {".tag": "file", "name": "collage.jpg", "path_lower": "/upload/collage.jpg", "id": "id:GKtLyTal3OAAAAAAAAAABw", "client_modified": "2015-10-09T19:17:05Z", "server_modified": "2015-10-09T19:17:21Z", "rev": "a3dcb771e", "size": 81334},
                {".tag": "file", "name": "paper.jpg", "path_lower": "/upload/paper.jpg", "id": "id:GKtLyTal3OAAAAAAAAAACQ", "client_modified": "2015-10-10T00:27:54Z", "server_modified": "2015-10-10T00:27:54Z", "rev": "d3dcb771e", "size": 45602},
                {".tag": "folder", "name": "newfolder", "path_lower": "/upload/newfolder", "id": "id:GKtLyTal3OAAAAAAAAAADA"}],
                "cursor": "1AAHlmQSXb93ddPSoC6xjTHYHcqgOojVJNHhxtvYqGDSESzfzyll5rM7bb9Luf0UF-dp2uZodw1GL5wZbhyXtb6ILXD-o7NsvAXGh3Df6FXtylavMrIT4PhdYykM0oeh8OMc-yWO0lbzBwlijuql7Gim0", "has_more": false}
             */
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}

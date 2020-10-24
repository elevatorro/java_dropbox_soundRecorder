package com.company;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import java.io.IOException;

public class Main {
    private static final String ACCESS_TOKEN = "Dropbox_Token";

    public static void main(String args[]) {
        DbxRequestConfig config = new DbxRequestConfig("dropbox/");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        JavaSoundRecorder jsv = new JavaSoundRecorder(client);
        jsv.recordAudio(10000);

    }
}
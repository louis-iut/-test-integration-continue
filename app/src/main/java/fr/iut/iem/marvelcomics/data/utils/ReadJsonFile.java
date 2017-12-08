package fr.iut.iem.marvelcomics.data.utils;

import android.content.Context;
import android.util.Log;

import java.io.InputStream;

import fr.iut.iem.marvelcomics.R;

/**
 * Created by louis on 05/12/2017.
 */

public class ReadJsonFile {

    public static String readJsonFile(Context context, String fileName) {
        String json = null;

        try {
            InputStream inputStream = context.getAssets().open(fileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            inputStream.close();

            json =  new String(buffer, context.getString(R.string.charset_name));
        } catch (Exception e) {
            Log.e(context.getString(R.string.read_json_file_error), e.getMessage());
        }

        return json;
    }
}

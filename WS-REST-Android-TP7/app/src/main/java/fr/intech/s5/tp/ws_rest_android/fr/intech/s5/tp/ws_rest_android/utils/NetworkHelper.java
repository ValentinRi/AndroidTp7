package fr.intech.s5.tp.ws_rest_android.fr.intech.s5.tp.ws_rest_android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/**
 * Created by vprig on 26/09/2017.
 */

public class NetworkHelper {

    public static boolean hasNetworkAcces(Context context) {
        ConnectivityManager cm = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        try {
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

            return null != activeNetwork && activeNetwork.isConnectedOrConnecting();

        } catch (Exception e) {
            e.printStackTrace ();
            return false;
        }
    }
}

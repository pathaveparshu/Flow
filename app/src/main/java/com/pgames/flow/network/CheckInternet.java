package com.pgames.flow.network;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;


public class CheckInternet {
//    private static boolean responded = false;
//    public static void isNetworkAvailable(final Handler handler, final int timeout) {
//        // ask fo message '0' (not connected) or '1' (connected) on 'handler'
//        // the answer must be send before before within the 'timeout' (in milliseconds)
//
//        new Thread() {
//
//            @Override
//            public void run() {
//                // set 'responded' to TRUE if is able to connect with google mobile (responds fast)
//                new Thread() {
//                    @Override
//                    public void run() {
//                        isOnline();
//                    }
//                }.start();
//
//                try {
//                    int waited = 0;
//                    while(!responded && (waited < timeout)) {
//                        sleep(100);
//                        if(!responded ) {
//                            waited += 100;
//                        }
//                    }
//                }
//                catch(InterruptedException e) {} // do nothing
//                finally {
//                    if (!responded) { handler.sendEmptyMessage(0); }
//                    else { handler.sendEmptyMessage(1); }
//                }
//            }
//        }.start();
//    }
    public static boolean isOnline() {
        try {
            int timeoutMs = 1500;
            Socket sock = new Socket();
            SocketAddress sockaddr = new InetSocketAddress("8.8.8.8", 53);

            sock.connect(sockaddr, timeoutMs);
            sock.close();
            //responded = true;
            return true;
        } catch (IOException e) { return false; }
    }
}


class InternetCheck extends AsyncTask<Void,Void,Boolean> {

    private Consumer mConsumer;
    public  interface Consumer { void accept(Boolean internet); }

    public  InternetCheck(Consumer consumer) { mConsumer = consumer; execute(); }

    @Override protected Boolean doInBackground(Void... voids) { try {
        Socket sock = new Socket();
        sock.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
        sock.close();
        return true;
    } catch (IOException e) { return false; } }

    @Override protected void onPostExecute(Boolean internet) { mConsumer.accept(internet); }
}
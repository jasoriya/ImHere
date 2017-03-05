package fr.Launcher.ImHere.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import fr.Launcher.ImHere.KissApplication;
import fr.Launcher.ImHere.dataprovider.AppProvider;

/**
 * Created by nmitsou on 16.10.16.
 */

public class LocaleChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context ctx, Intent intent) {
        // If new locale, then reset tags to load the correct aliases
        KissApplication.getDataHandler(ctx).resetTagsHandler();

        // Reload application list
        final AppProvider provider = KissApplication.getDataHandler(ctx).getAppProvider();
        if (provider != null) {
            provider.reload();
        }
    }
}

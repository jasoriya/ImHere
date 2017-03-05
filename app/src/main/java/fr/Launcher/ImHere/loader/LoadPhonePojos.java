package fr.Launcher.ImHere.loader;

import android.content.Context;

import java.util.ArrayList;

import fr.Launcher.ImHere.dataprovider.PhoneProvider;
import fr.Launcher.ImHere.pojo.PhonePojo;

public class LoadPhonePojos extends LoadPojos<PhonePojo> {

    public LoadPhonePojos(Context context) {
        super(context, PhoneProvider.PHONE_SCHEME);
    }

    @Override
    protected ArrayList<PhonePojo> doInBackground(Void... params) {
        return null;
    }
}

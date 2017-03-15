package fr.launcher.ImHere.loader;

import android.content.Context;

import java.util.ArrayList;

import fr.launcher.ImHere.dataprovider.PhoneProvider;
import fr.launcher.ImHere.pojo.PhonePojo;

public class LoadPhonePojos extends LoadPojos<PhonePojo> {

    public LoadPhonePojos(Context context) {
        super(context, PhoneProvider.PHONE_SCHEME);
    }

    @Override
    protected ArrayList<PhonePojo> doInBackground(Void... params) {
        return null;
    }
}

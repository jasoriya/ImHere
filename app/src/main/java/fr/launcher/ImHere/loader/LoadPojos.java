package fr.launcher.ImHere.loader;

import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;

import fr.launcher.ImHere.dataprovider.Provider;
import fr.launcher.ImHere.pojo.Pojo;

public abstract class LoadPojos<T extends Pojo> extends AsyncTask<Void, Void, ArrayList<T>> {

    final Context context;
    String pojoScheme = "(none)://";
    private Provider<T> provider;

    LoadPojos(Context context, String pojoScheme) {
        super();
        this.context = context;
        this.pojoScheme = pojoScheme;
    }

    public void setProvider(Provider<T> provider) {
        this.provider = provider;
    }

    public String getPojoScheme() {
        return pojoScheme;
    }

    @Override
    protected void onPostExecute(ArrayList<T> result) {
        super.onPostExecute(result);
        provider.loadOver(result);
    }

}

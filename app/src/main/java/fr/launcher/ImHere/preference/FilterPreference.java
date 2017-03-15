package fr.launcher.ImHere.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import fr.launcher.ImHere.DrawOverAppService;
import fr.launcher.ImHere.SwitchPreference;

/**
 * Created by Shreyans on 08-03-2017.
 */

public class FilterPreference extends SwitchPreference{

    public FilterPreference(Context context) {this(context, null);}

    public FilterPreference(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.switchPreferenceStyle);
    }

    public FilterPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @Override
    protected void onClick() {
        Intent intent = new Intent(getContext(), DrawOverAppService.class);
        if (!isChecked()) {
            FilterPreference.super.onClick();
            getContext().startService(intent);
        }
        else {
            FilterPreference.super.onClick();
            getContext().stopService(intent);
        }
    }

}

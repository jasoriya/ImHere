package fr.launcher.ImHere.searcher;

import java.util.List;

import fr.launcher.ImHere.ImHereApplication;
import fr.launcher.ImHere.MainActivity;
import fr.launcher.ImHere.pojo.Pojo;

/**
 * Returns the list of all applications on the system
 */
public class ApplicationsSearcher extends Searcher {
    public ApplicationsSearcher(MainActivity activity) {
        super(activity);
    }

    @Override
    protected List<Pojo> doInBackground(Void... voids) {
        // Ask for records
        return ImHereApplication.getDataHandler(activity).getApplications();
    }
}

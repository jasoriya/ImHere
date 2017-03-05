package fr.Launcher.ImHere.searcher;

import java.util.List;

import fr.Launcher.ImHere.KissApplication;
import fr.Launcher.ImHere.MainActivity;
import fr.Launcher.ImHere.pojo.Pojo;

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
        return KissApplication.getDataHandler(activity).getApplications();
    }
}

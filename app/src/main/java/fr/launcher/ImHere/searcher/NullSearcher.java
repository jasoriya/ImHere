package fr.launcher.ImHere.searcher;

import java.util.ArrayList;
import java.util.List;

import fr.launcher.ImHere.MainActivity;
import fr.launcher.ImHere.pojo.Pojo;

/**
 * Retrieve pojos from history
 */
public class NullSearcher extends Searcher {

    public NullSearcher(MainActivity activity) {
        super(activity);
    }

    @Override
    protected List<Pojo> doInBackground(Void... voids) {
        return new ArrayList<>();
    }
}

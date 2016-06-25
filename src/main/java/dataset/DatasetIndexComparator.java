package dataset;

import java.util.Comparator;

/**
 * Created by Piotrek on 25.06.2016.
 */
public class DatasetIndexComparator implements Comparator<Dataset> {


    @Override
    public int compare(Dataset o1, Dataset o2) {
        return Double.compare(o1.getIndex(), o2.getIndex());
    }
}

package app.chalo.stoptripdetails.domain;

import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class GetRelevantScheduledTripFromStopTripsList$invoke$$inlined$compareBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        Integer num2 = 3;
        StopTripDetailsAppModel stopTripDetailsAppModel = (StopTripDetailsAppModel) obj;
        if (stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FrequencyTrip) {
            num = 1;
        } else if (stopTripDetailsAppModel instanceof StopTripDetailsAppModel.FixedTime) {
            num = 2;
        } else {
            if (!(stopTripDetailsAppModel instanceof StopTripDetailsAppModel.UnknownTiming)) {
                throw new NoWhenBranchMatchedException();
            }
            num = num2;
        }
        StopTripDetailsAppModel stopTripDetailsAppModel2 = (StopTripDetailsAppModel) obj2;
        if (stopTripDetailsAppModel2 instanceof StopTripDetailsAppModel.FrequencyTrip) {
            num2 = 1;
        } else if (stopTripDetailsAppModel2 instanceof StopTripDetailsAppModel.FixedTime) {
            num2 = 2;
        } else if (!(stopTripDetailsAppModel2 instanceof StopTripDetailsAppModel.UnknownTiming)) {
            throw new NoWhenBranchMatchedException();
        }
        return ComparisonsKt.a(num, num2);
    }
}

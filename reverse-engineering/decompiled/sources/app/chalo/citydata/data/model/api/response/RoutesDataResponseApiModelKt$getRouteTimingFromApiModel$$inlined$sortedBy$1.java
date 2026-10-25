package app.chalo.citydata.data.model.api.response;

import app.chalo.citydata.data.model.app.RouteTiming;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class RoutesDataResponseApiModelKt$getRouteTimingFromApiModel$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        RouteTiming routeTiming = (RouteTiming) obj;
        if (!(routeTiming instanceof RouteTiming.FixedTiming) && !(routeTiming instanceof RouteTiming.FrequencyTiming)) {
            throw new NoWhenBranchMatchedException();
        }
        long j = routeTiming.f1719a;
        Long lValueOf = Long.valueOf(j);
        RouteTiming routeTiming2 = (RouteTiming) obj2;
        if (!(routeTiming2 instanceof RouteTiming.FixedTiming) && !(routeTiming2 instanceof RouteTiming.FrequencyTiming)) {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = routeTiming2.f1719a;
        return ComparisonsKt.a(lValueOf, Long.valueOf(j2));
    }
}

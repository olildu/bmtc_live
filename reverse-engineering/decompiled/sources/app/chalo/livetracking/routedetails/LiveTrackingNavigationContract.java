package app.chalo.livetracking.routedetails;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/LiveTrackingNavigationContract;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveTrackingNavigationContract {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a();

    void b(StopAppModel stopAppModel, StopAppModel stopAppModel2, Source source);

    void c(Source source);

    void d(StopAppModel stopAppModel, StopAppModel stopAppModel2, List list, Source source, long j);

    void e(StopAppModel stopAppModel, StopAppModel stopAppModel2, Source source);
}

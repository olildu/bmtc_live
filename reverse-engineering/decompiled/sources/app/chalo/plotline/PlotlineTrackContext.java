package app.chalo.plotline;

import app.chalo.compose.utils.CommonContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/plotline/PlotlineTrackContext;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlotlineTrackContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonContext f6842a;

    public PlotlineTrackContext(CommonContext commonContext) {
        this.f6842a = commonContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlotlineTrackContext) && Intrinsics.d(this.f6842a, ((PlotlineTrackContext) obj).f6842a);
    }

    public final int hashCode() {
        return this.f6842a.hashCode();
    }

    public final String toString() {
        return "PlotlineTrackContext(context=" + this.f6842a + ")";
    }
}

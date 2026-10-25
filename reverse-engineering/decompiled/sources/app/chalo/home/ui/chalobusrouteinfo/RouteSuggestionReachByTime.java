package app.chalo.home.ui.chalobusrouteinfo;

import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionReachByTime;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSuggestionReachByTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3369a;
    public final int b;
    public final String c;

    public RouteSuggestionReachByTime(int i, int i2, String amOrPM) {
        Intrinsics.i(amOrPM, "amOrPM");
        this.f3369a = i;
        this.b = i2;
        this.c = amOrPM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSuggestionReachByTime)) {
            return false;
        }
        RouteSuggestionReachByTime routeSuggestionReachByTime = (RouteSuggestionReachByTime) obj;
        return this.f3369a == routeSuggestionReachByTime.f3369a && this.b == routeSuggestionReachByTime.b && Intrinsics.d(this.c, routeSuggestionReachByTime.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f3369a * 31) + this.b) * 31);
    }

    public final String toString() {
        return vo1.p(uf0.s(this.f3369a, this.b, "RouteSuggestionReachByTime(hour=", ", minute=", ", amOrPM="), this.c, ")");
    }
}

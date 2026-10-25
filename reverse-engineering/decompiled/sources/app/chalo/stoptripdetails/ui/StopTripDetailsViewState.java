package app.chalo.stoptripdetails.ui;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9520a;
    public final ChaloTransitMode b;
    public final String c;
    public final String d;
    public final TripScheduleScreenType e;
    public final List f;

    public StopTripDetailsViewState(String str, ChaloTransitMode transitMode, String str2, String str3, TripScheduleScreenType screenType, List trips) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(trips, "trips");
        this.f9520a = str;
        this.b = transitMode;
        this.c = str2;
        this.d = str3;
        this.e = screenType;
        this.f = trips;
    }

    public static StopTripDetailsViewState a(StopTripDetailsViewState stopTripDetailsViewState, String str, ChaloTransitMode chaloTransitMode, String str2, String str3, TripScheduleScreenType screenType, List list, int i) {
        if ((i & 1) != 0) {
            str = stopTripDetailsViewState.f9520a;
        }
        String stopId = str;
        if ((i & 2) != 0) {
            chaloTransitMode = stopTripDetailsViewState.b;
        }
        ChaloTransitMode transitMode = chaloTransitMode;
        if ((i & 4) != 0) {
            str2 = stopTripDetailsViewState.c;
        }
        String stopName = str2;
        if ((i & 8) != 0) {
            str3 = stopTripDetailsViewState.d;
        }
        String str4 = str3;
        if ((i & 32) != 0) {
            list = stopTripDetailsViewState.f;
        }
        List trips = list;
        stopTripDetailsViewState.getClass();
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(trips, "trips");
        return new StopTripDetailsViewState(stopId, transitMode, stopName, str4, screenType, trips);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsViewState)) {
            return false;
        }
        StopTripDetailsViewState stopTripDetailsViewState = (StopTripDetailsViewState) obj;
        return Intrinsics.d(this.f9520a, stopTripDetailsViewState.f9520a) && this.b == stopTripDetailsViewState.b && Intrinsics.d(this.c, stopTripDetailsViewState.c) && Intrinsics.d(this.d, stopTripDetailsViewState.d) && this.e == stopTripDetailsViewState.e && Intrinsics.d(this.f, stopTripDetailsViewState.f);
    }

    public final int hashCode() {
        int iE = nf1.e(n21.c(this.b, this.f9520a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopTripDetailsViewState(stopId=");
        sb.append(this.f9520a);
        sb.append(", transitMode=");
        sb.append(this.b);
        sb.append(", stopName=");
        cb0.t(sb, this.c, ", stopDistanceText=", this.d, ", screenType=");
        sb.append(this.e);
        sb.append(", trips=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import defpackage.yh1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerItineraryUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerItineraryUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4753a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final SeatAvailabilityLevel f;
    public final List g;
    public final int h;
    public final String i;
    public final StringEnum j;
    public final String k;
    public final Lazy l;

    public TripPlannerItineraryUiModel(String localId, String travelTimeString, int i, String str, String str2, SeatAvailabilityLevel seatAvailabilityLevel, List legs, int i2, String str3, StringEnum stringEnum, String str4) {
        Intrinsics.i(localId, "localId");
        Intrinsics.i(travelTimeString, "travelTimeString");
        Intrinsics.i(legs, "legs");
        this.f4753a = localId;
        this.b = travelTimeString;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = seatAvailabilityLevel;
        this.g = legs;
        this.h = i2;
        this.i = str3;
        this.j = stringEnum;
        this.k = str4;
        this.l = LazyKt.b(new yh1(this, 5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerItineraryUiModel)) {
            return false;
        }
        TripPlannerItineraryUiModel tripPlannerItineraryUiModel = (TripPlannerItineraryUiModel) obj;
        return Intrinsics.d(this.f4753a, tripPlannerItineraryUiModel.f4753a) && Intrinsics.d(this.b, tripPlannerItineraryUiModel.b) && this.c == tripPlannerItineraryUiModel.c && Intrinsics.d(this.d, tripPlannerItineraryUiModel.d) && Intrinsics.d(this.e, tripPlannerItineraryUiModel.e) && this.f == tripPlannerItineraryUiModel.f && Intrinsics.d(this.g, tripPlannerItineraryUiModel.g) && this.h == tripPlannerItineraryUiModel.h && Intrinsics.d(this.i, tripPlannerItineraryUiModel.i) && this.j == tripPlannerItineraryUiModel.j && Intrinsics.d(this.k, tripPlannerItineraryUiModel.k);
    }

    public final int hashCode() {
        int iE = nf1.e((nf1.e(this.f4753a.hashCode() * 31, 31, this.b) + this.c) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        SeatAvailabilityLevel seatAvailabilityLevel = this.f;
        int iB = (r30.b((iHashCode + (seatAvailabilityLevel == null ? 0 : seatAvailabilityLevel.hashCode())) * 31, 31, this.g) + this.h) * 31;
        String str2 = this.i;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        StringEnum stringEnum = this.j;
        int iHashCode3 = (iHashCode2 + (stringEnum == null ? 0 : stringEnum.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPlannerItineraryUiModel(localId=", this.f4753a, ", travelTimeString=", this.b, ", changeCount=");
        pk0.t(this.c, ", fareString=", this.d, ", etaString=", sbE);
        sbE.append(this.e);
        sbE.append(", seatAvailabilityLevel=");
        sbE.append(this.f);
        sbE.append(", legs=");
        sbE.append(this.g);
        sbE.append(", rank=");
        sbE.append(this.h);
        sbE.append(", scheduledStringFromFirstLeg=");
        sbE.append(this.i);
        sbE.append(", fromLegHeaderText=");
        sbE.append(this.j);
        sbE.append(", firstModeFromStopName=");
        return vo1.p(sbE, this.k, ")");
    }
}

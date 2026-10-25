package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUISize;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/SeatAvailabilityUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatAvailabilityUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4946a;
    public final ChaloPadding b;
    public final ImageUISize c;

    public SeatAvailabilityUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().c, 0.0f, 9);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().c, 0.0f, 0.0f, 13);
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().k);
        this.f4946a = chaloPadding;
        this.b = chaloPadding2;
        this.c = imageUISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatAvailabilityUISpec)) {
            return false;
        }
        SeatAvailabilityUISpec seatAvailabilityUISpec = (SeatAvailabilityUISpec) obj;
        return Intrinsics.d(this.f4946a, seatAvailabilityUISpec.f4946a) && Intrinsics.d(this.b, seatAvailabilityUISpec.b) && Intrinsics.d(this.c, seatAvailabilityUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f4946a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("SeatAvailabilityUISpec(imgPadding=", this.f4946a, ", textPadding=", this.b, ", imgSize=");
        sbM.append(this.c);
        sbM.append(")");
        return sbM.toString();
    }
}

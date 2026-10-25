package app.chalo.mticket.ui.tripinfo;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketTripInfoUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5784a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public MTicketTripInfoUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().i, 1);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        this.f5784a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripInfoUISpec)) {
            return false;
        }
        MTicketTripInfoUISpec mTicketTripInfoUISpec = (MTicketTripInfoUISpec) obj;
        return Intrinsics.d(this.f5784a, mTicketTripInfoUISpec.f5784a) && Intrinsics.d(this.b, mTicketTripInfoUISpec.b) && Intrinsics.d(this.c, mTicketTripInfoUISpec.c) && Intrinsics.d(this.d, mTicketTripInfoUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f5784a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("MTicketTripInfoUISpec(paddingAround=", this.f5784a, ", paddingAroundNextBtn=", this.b, ", paddingAroundFreeRideBanner=");
        sbM.append(this.c);
        sbM.append(", paddingAroundAgency=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}

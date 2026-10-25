package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/TicketCardContentSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketCardContentSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10737a;
    public final float b;

    public TicketCardContentSpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        float f2 = ChaloThemeHelper.a().g;
        this.f10737a = chaloPadding;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketCardContentSpec)) {
            return false;
        }
        TicketCardContentSpec ticketCardContentSpec = (TicketCardContentSpec) obj;
        return Intrinsics.d(this.f10737a, ticketCardContentSpec.f10737a) && Dp.m7283equalsimpl0(this.b, ticketCardContentSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f10737a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("TicketCardContentSpec(contentPadding=", this.f10737a, ", detailsContainerAndDividerSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }
}

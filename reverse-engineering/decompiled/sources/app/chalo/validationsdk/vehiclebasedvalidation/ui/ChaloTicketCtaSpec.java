package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/ChaloTicketCtaSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTicketCtaSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10719a;
    public final float b;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloTicketCtaSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().b;
        this.f10719a = chaloPadding;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTicketCtaSpec)) {
            return false;
        }
        ChaloTicketCtaSpec chaloTicketCtaSpec = (ChaloTicketCtaSpec) obj;
        return Intrinsics.d(this.f10719a, chaloTicketCtaSpec.f10719a) && Dp.m7283equalsimpl0(this.b, chaloTicketCtaSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f10719a.hashCode() * 29791);
    }

    public final String toString() {
        return t8.h("ChaloTicketCtaSpec(contentSpacing=", this.f10719a, ", shape=null, borderColor=null, borderThickness=", Dp.m7289toStringimpl(this.b), ")");
    }
}

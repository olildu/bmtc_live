package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackHeaderUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackHeaderUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f9145a;
    public final UiAlignment.Vertical b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloPadding f;

    public RideFeedbackHeaderUISpecs() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().n, 0.0f, 0.0f, ChaloThemeHelper.a().l, 6);
        this.f9145a = UiAlignment.Horizontal.Center.f9884a;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackHeaderUISpecs)) {
            return false;
        }
        RideFeedbackHeaderUISpecs rideFeedbackHeaderUISpecs = (RideFeedbackHeaderUISpecs) obj;
        return Intrinsics.d(this.f9145a, rideFeedbackHeaderUISpecs.f9145a) && Intrinsics.d(this.b, rideFeedbackHeaderUISpecs.b) && Dp.m7283equalsimpl0(this.c, rideFeedbackHeaderUISpecs.c) && Dp.m7283equalsimpl0(this.d, rideFeedbackHeaderUISpecs.d) && Dp.m7283equalsimpl0(this.e, rideFeedbackHeaderUISpecs.e) && Intrinsics.d(this.f, rideFeedbackHeaderUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.e(this.b, this.f9145a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("RideFeedbackHeaderUISpecs(contentAlignment=");
        sb.append(this.f9145a);
        sb.append(", driverAndVehicleImageAlignment=");
        sb.append(this.b);
        sb.append(", vehicleDriverImgAndStatusMsgSpacing=");
        cb0.t(sb, strM7289toStringimpl, ", statusMsgAndAmountSpacing=", strM7289toStringimpl2, ", amountAndCtaSpacing=");
        sb.append(strM7289toStringimpl3);
        sb.append(", contentPadding=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

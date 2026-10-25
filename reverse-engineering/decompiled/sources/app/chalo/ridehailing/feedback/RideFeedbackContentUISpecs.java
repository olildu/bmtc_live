package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackContentUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackContentUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f9137a;
    public final ChaloPadding b;
    public final float c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RideFeedbackContentUISpecs() {
        UIShape.Rectangle shape = UIShape.j;
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().k;
        Intrinsics.i(shape, "shape");
        this.f9137a = shape;
        this.b = chaloPadding;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackContentUISpecs)) {
            return false;
        }
        RideFeedbackContentUISpecs rideFeedbackContentUISpecs = (RideFeedbackContentUISpecs) obj;
        return Intrinsics.d(this.f9137a, rideFeedbackContentUISpecs.f9137a) && Intrinsics.d(this.b, rideFeedbackContentUISpecs.b) && Dp.m7283equalsimpl0(this.c, rideFeedbackContentUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.c(this.b, this.f9137a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("RideFeedbackContentUISpecs(shape=");
        sb.append(this.f9137a);
        sb.append(", padding=");
        sb.append(this.b);
        sb.append(", ratingCardAndReasonCardSpacing=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}

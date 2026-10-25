package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.card.CardUISpec;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackCtaUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackCtaUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9139a;
    public final CardUISpec b;
    public final ChaloPadding c;

    public RideFeedbackCtaUISpecs() {
        float f = ChaloThemeHelper.a().g;
        CardUISpec cardUISpec = new CardUISpec(null, ChaloThemeHelper.b().f, 0.0f, 5);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        this.f9139a = f;
        this.b = cardUISpec;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackCtaUISpecs)) {
            return false;
        }
        RideFeedbackCtaUISpecs rideFeedbackCtaUISpecs = (RideFeedbackCtaUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f9139a, rideFeedbackCtaUISpecs.f9139a) && Intrinsics.d(this.b, rideFeedbackCtaUISpecs.b) && Intrinsics.d(this.c, rideFeedbackCtaUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Dp.m7284hashCodeimpl(this.f9139a) * 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f9139a);
        StringBuilder sb = new StringBuilder("RideFeedbackCtaUISpecs(ctaSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", cardUISpec=");
        sb.append(this.b);
        sb.append(", padding=");
        return py.e(sb, this.c, ")");
    }
}

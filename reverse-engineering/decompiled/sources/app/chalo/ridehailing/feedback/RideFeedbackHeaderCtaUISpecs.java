package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackHeaderCtaUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackHeaderCtaUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9144a;
    public final ChaloColorToken b;
    public final BorderUISpec c;
    public final float d;

    public RideFeedbackHeaderCtaUISpecs() {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.Gray85.f9798a, UIShape.c);
        float f2 = ChaloThemeHelper.a().f;
        this.f9144a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = borderUISpec;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackHeaderCtaUISpecs)) {
            return false;
        }
        RideFeedbackHeaderCtaUISpecs rideFeedbackHeaderCtaUISpecs = (RideFeedbackHeaderCtaUISpecs) obj;
        return Intrinsics.d(this.f9144a, rideFeedbackHeaderCtaUISpecs.f9144a) && Intrinsics.d(this.b, rideFeedbackHeaderCtaUISpecs.b) && Intrinsics.d(this.c, rideFeedbackHeaderCtaUISpecs.c) && Dp.m7283equalsimpl0(this.d, rideFeedbackHeaderCtaUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + z40.b(this.b, this.f9144a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f9144a, this.b, "RideFeedbackHeaderCtaUISpecs(padding=", ", cardBackgroundColor=", ", border=");
        sbL.append(this.c);
        sbL.append(", ctaSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}

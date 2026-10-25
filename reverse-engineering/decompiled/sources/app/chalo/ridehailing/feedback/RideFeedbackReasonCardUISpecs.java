package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackReasonCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackReasonCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f9147a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final BorderUISpec h;

    public RideFeedbackReasonCardUISpecs() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().l;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f6, f5, f5, f6);
        float f7 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(f7, f7, f7, f7);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.ShadyGray.f9851a, UIShape.e);
        this.f9147a = UiAlignment.Horizontal.Start.f9886a;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = chaloPadding;
        this.g = chaloPadding2;
        this.h = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackReasonCardUISpecs)) {
            return false;
        }
        RideFeedbackReasonCardUISpecs rideFeedbackReasonCardUISpecs = (RideFeedbackReasonCardUISpecs) obj;
        return Intrinsics.d(this.f9147a, rideFeedbackReasonCardUISpecs.f9147a) && Dp.m7283equalsimpl0(this.b, rideFeedbackReasonCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, rideFeedbackReasonCardUISpecs.c) && Dp.m7283equalsimpl0(this.d, rideFeedbackReasonCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, rideFeedbackReasonCardUISpecs.e) && Intrinsics.d(this.f, rideFeedbackReasonCardUISpecs.f) && Intrinsics.d(this.g, rideFeedbackReasonCardUISpecs.g) && Intrinsics.d(this.h, rideFeedbackReasonCardUISpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + r30.c(this.g, r30.c(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f9147a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("RideFeedbackReasonCardUISpecs(contentAlignment=");
        sb.append(this.f9147a);
        sb.append(", horizontalSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", verticalSpacing=");
        cb0.t(sb, strM7289toStringimpl2, ", headerAndReasonListSpacing=", strM7289toStringimpl3, ", reasonListAndOtherTextFieldSpacing=");
        sb.append(strM7289toStringimpl4);
        sb.append(", reasonCardPadding=");
        sb.append(this.f);
        sb.append(", textFieldPadding=");
        sb.append(this.g);
        sb.append(", textFieldBorder=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

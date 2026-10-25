package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.card.CardUISpec;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/OfficeInfoComponentSpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfficeInfoComponentSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f1229a;
    public final CardUISpec b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public OfficeInfoComponentSpecs() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        CardUISpec cardUISpec = new CardUISpec(ChaloThemeHelper.d.g, ChaloThemeHelper.a().c, 0.0f, 4);
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().i;
        float f5 = ChaloThemeHelper.a().f;
        this.f1229a = chaloPadding;
        this.b = cardUISpec;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfficeInfoComponentSpecs)) {
            return false;
        }
        OfficeInfoComponentSpecs officeInfoComponentSpecs = (OfficeInfoComponentSpecs) obj;
        return Intrinsics.d(this.f1229a, officeInfoComponentSpecs.f1229a) && Intrinsics.d(this.b, officeInfoComponentSpecs.b) && Dp.m7283equalsimpl0(this.c, officeInfoComponentSpecs.c) && Dp.m7283equalsimpl0(this.d, officeInfoComponentSpecs.d) && Dp.m7283equalsimpl0(this.e, officeInfoComponentSpecs.e) && Dp.m7283equalsimpl0(this.f, officeInfoComponentSpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, (this.b.hashCode() + (this.f1229a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("OfficeInfoComponentSpecs(contentPadding=");
        sb.append(this.f1229a);
        sb.append(", cardUISpec=");
        sb.append(this.b);
        sb.append(", spaceBtwIconAndTitle=");
        cb0.t(sb, strM7289toStringimpl, ", spaceBtwTitleAndTimeTextField=", strM7289toStringimpl2, ", spaceBtwTimeTextFieldAndVariabilityTitle=");
        return r30.i(sb, strM7289toStringimpl3, ", spaceBtwVariabilityTitleAndOptions=", strM7289toStringimpl4, ")");
    }
}

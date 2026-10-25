package app.chalo.locationdisclaimer;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5172a;
    public final ChaloPadding b;
    public final float c;
    public final ChaloPadding d;
    public final ChaloColorToken e;

    public LocationDisclaimerUISpecs() {
        float f = ChaloThemeHelper.a().k;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f4, f4, f3);
        this.f5172a = f;
        this.b = chaloPadding;
        this.c = f2;
        this.d = chaloPadding2;
        this.e = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerUISpecs)) {
            return false;
        }
        LocationDisclaimerUISpecs locationDisclaimerUISpecs = (LocationDisclaimerUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f5172a, locationDisclaimerUISpecs.f5172a) && Intrinsics.d(this.b, locationDisclaimerUISpecs.b) && Dp.m7283equalsimpl0(this.c, locationDisclaimerUISpecs.c) && Intrinsics.d(this.d, locationDisclaimerUISpecs.d) && Intrinsics.d(this.e, locationDisclaimerUISpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, uf0.a(this.c, r30.c(this.b, Dp.m7284hashCodeimpl(this.f5172a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f5172a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("LocationDisclaimerUISpecs(screenTopSpace=");
        sb.append(strM7289toStringimpl);
        sb.append(", contentPadding=");
        sb.append(this.b);
        sb.append(", spaceBtnHeaderAndInstructions=");
        sb.append(strM7289toStringimpl2);
        sb.append(", btnPadding=");
        sb.append(this.d);
        sb.append(", screenBackgroundColor=");
        return pk0.j(sb, this.e, ")");
    }
}

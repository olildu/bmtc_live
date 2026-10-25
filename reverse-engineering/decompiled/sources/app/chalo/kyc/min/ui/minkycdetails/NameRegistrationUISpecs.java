package app.chalo.kyc.min.ui.minkycdetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.BorderUISpec;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/NameRegistrationUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NameRegistrationUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4131a;
    public final float b;
    public final BorderUISpec c;
    public final ChaloPadding d;

    public NameRegistrationUISpecs(BorderUISpec borderUISpec) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().p;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        this.f4131a = chaloPadding;
        this.b = f;
        this.c = borderUISpec;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameRegistrationUISpecs)) {
            return false;
        }
        NameRegistrationUISpecs nameRegistrationUISpecs = (NameRegistrationUISpecs) obj;
        return Intrinsics.d(this.f4131a, nameRegistrationUISpecs.f4131a) && Dp.m7283equalsimpl0(this.b, nameRegistrationUISpecs.b) && Intrinsics.d(this.c, nameRegistrationUISpecs.c) && Intrinsics.d(this.d, nameRegistrationUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + uf0.a(this.b, this.f4131a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("NameRegistrationUISpecs(horizontalPadding=", this.f4131a, ", height=", Dp.m7289toStringimpl(this.b), ", borderUISpec=");
        sbN.append(this.c);
        sbN.append(", padding=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}

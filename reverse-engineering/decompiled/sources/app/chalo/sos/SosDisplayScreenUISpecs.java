package app.chalo.sos;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosDisplayScreenUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SosDisplayScreenUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9400a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloColorToken d;
    public final float e;
    public final ChaloPadding f;
    public final ChaloColorToken g;
    public final ChaloColorToken h;
    public final ChaloPadding i;

    public SosDisplayScreenUISpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f4, f4, f3);
        float f5 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        float f6 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding4 = new ChaloPadding(f6, f6, f6, f6);
        this.f9400a = ChaloColorToken.ActivityBackground.f9755a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        this.d = white;
        this.e = f5;
        this.f = chaloPadding3;
        this.g = white;
        this.h = white;
        this.i = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosDisplayScreenUISpecs)) {
            return false;
        }
        SosDisplayScreenUISpecs sosDisplayScreenUISpecs = (SosDisplayScreenUISpecs) obj;
        return Intrinsics.d(this.f9400a, sosDisplayScreenUISpecs.f9400a) && Intrinsics.d(this.b, sosDisplayScreenUISpecs.b) && Intrinsics.d(this.c, sosDisplayScreenUISpecs.c) && Intrinsics.d(this.d, sosDisplayScreenUISpecs.d) && Dp.m7283equalsimpl0(this.e, sosDisplayScreenUISpecs.e) && Intrinsics.d(this.f, sosDisplayScreenUISpecs.f) && Intrinsics.d(this.g, sosDisplayScreenUISpecs.g) && Intrinsics.d(this.h, sosDisplayScreenUISpecs.h) && Intrinsics.d(this.i, sosDisplayScreenUISpecs.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + z40.b(this.h, z40.b(this.g, r30.c(this.f, uf0.a(this.e, z40.b(this.d, r30.c(this.c, r30.c(this.b, this.f9400a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sbI = py.i(this.b, this.f9400a, "SosDisplayScreenUISpecs(screenBackgroundColor=", ", paddingAroundDescription=", ", paddingAroundSosMsg=");
        sbI.append(this.c);
        sbI.append(", sosMsgBackgroundColor=");
        sbI.append(this.d);
        sbI.append(", spaceBetweenAddContactItems=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", addContactBtnInternalPadding=");
        sbI.append(this.f);
        sbI.append(", addContactBtnBackgroundColor=");
        sbI.append(this.g);
        sbI.append(", sendAlertBackgroundColor=");
        sbI.append(this.h);
        sbI.append(", sendAlertBtnPadding=");
        return py.e(sbI, this.i, ")");
    }
}

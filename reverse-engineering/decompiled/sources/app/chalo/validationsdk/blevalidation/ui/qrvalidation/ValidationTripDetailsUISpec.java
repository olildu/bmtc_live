package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiArrangement;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/ValidationTripDetailsUISpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationTripDetailsUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10661a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final UiArrangement.HorizontalOrVertical g;
    public final ChaloPadding h;
    public final ChaloPadding i;
    public final float j;
    public final ChaloColorToken k;

    public ValidationTripDetailsUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().f, 7);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding4 = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding6 = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().g, 0.0f, ChaloThemeHelper.a().d, 4);
        ChaloPadding chaloPadding7 = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().g, 0.0f, ChaloThemeHelper.a().d, 4);
        float f2 = ChaloThemeHelper.a().c;
        this.f10661a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = chaloPadding4;
        this.f = chaloPadding5;
        this.g = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
        this.h = chaloPadding6;
        this.i = chaloPadding7;
        this.j = f2;
        this.k = ChaloColorToken.Black.f9759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationTripDetailsUISpec)) {
            return false;
        }
        ValidationTripDetailsUISpec validationTripDetailsUISpec = (ValidationTripDetailsUISpec) obj;
        return Intrinsics.d(this.f10661a, validationTripDetailsUISpec.f10661a) && Intrinsics.d(this.b, validationTripDetailsUISpec.b) && Intrinsics.d(this.c, validationTripDetailsUISpec.c) && Intrinsics.d(this.d, validationTripDetailsUISpec.d) && Intrinsics.d(this.e, validationTripDetailsUISpec.e) && Intrinsics.d(this.f, validationTripDetailsUISpec.f) && Intrinsics.d(this.g, validationTripDetailsUISpec.g) && Intrinsics.d(this.h, validationTripDetailsUISpec.h) && Intrinsics.d(this.i, validationTripDetailsUISpec.i) && Dp.m7283equalsimpl0(this.j, validationTripDetailsUISpec.j) && Intrinsics.d(this.k, validationTripDetailsUISpec.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + uf0.a(this.j, r30.c(this.i, r30.c(this.h, (this.g.hashCode() + r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, z40.b(this.b, this.f10661a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.j);
        StringBuilder sbL = gf.l(this.f10661a, this.b, "ValidationTripDetailsUISpec(internalPadding=", ", background=", ", paddingAroundTitle=");
        r30.o(sbL, this.c, ", paddingAroundRouteName=", this.d, ", paddingAroundNamingScheme=");
        r30.o(sbL, this.e, ", paddingAroundFromToStopIcon=", this.f, ", fromToStopVerticalArrangement=");
        sbL.append(this.g);
        sbL.append(", paddingAroundFromStop=");
        sbL.append(this.h);
        sbL.append(", paddingAroundToStop=");
        py.u(sbL, this.i, ", indicatorSeparatorWidth=", strM7289toStringimpl, ", indicatorSeparatorColor=");
        return pk0.j(sbL, this.k, ")");
    }
}

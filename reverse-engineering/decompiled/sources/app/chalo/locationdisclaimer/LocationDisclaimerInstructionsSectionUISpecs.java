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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerInstructionsSectionUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationDisclaimerInstructionsSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5167a;
    public final ChaloPadding b;
    public final float c;
    public final ChaloColorToken d;

    public LocationDisclaimerInstructionsSectionUISpecs() {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().h;
        this.f5167a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f3;
        this.d = ChaloColorToken.GreyColor.f9806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDisclaimerInstructionsSectionUISpecs)) {
            return false;
        }
        LocationDisclaimerInstructionsSectionUISpecs locationDisclaimerInstructionsSectionUISpecs = (LocationDisclaimerInstructionsSectionUISpecs) obj;
        return Intrinsics.d(this.f5167a, locationDisclaimerInstructionsSectionUISpecs.f5167a) && Intrinsics.d(this.b, locationDisclaimerInstructionsSectionUISpecs.b) && Dp.m7283equalsimpl0(this.c, locationDisclaimerInstructionsSectionUISpecs.c) && Intrinsics.d(this.d, locationDisclaimerInstructionsSectionUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f5167a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbM = pk0.m("LocationDisclaimerInstructionsSectionUISpecs(outerPadding=", this.f5167a, ", contentPadding=", this.b, ", spaceBtnLottieAndDisclaimerSteps=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", backgroundColor=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}

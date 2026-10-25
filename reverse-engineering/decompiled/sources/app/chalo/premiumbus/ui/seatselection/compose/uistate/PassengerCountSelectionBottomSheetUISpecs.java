package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PassengerCountSelectionBottomSheetUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerCountSelectionBottomSheetUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f7775a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public PassengerCountSelectionBottomSheetUISpecs() {
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, ChaloThemeHelper.d.g);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().W;
        float f4 = ChaloThemeHelper.a().j;
        float f5 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f5, f5, f5, f5);
        float f6 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(f6, f6, f6, f6);
        this.f7775a = borderUISpec;
        this.b = chaloPadding;
        this.c = f3;
        this.d = f4;
        this.e = chaloPadding2;
        this.f = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerCountSelectionBottomSheetUISpecs)) {
            return false;
        }
        PassengerCountSelectionBottomSheetUISpecs passengerCountSelectionBottomSheetUISpecs = (PassengerCountSelectionBottomSheetUISpecs) obj;
        return Intrinsics.d(this.f7775a, passengerCountSelectionBottomSheetUISpecs.f7775a) && Intrinsics.d(this.b, passengerCountSelectionBottomSheetUISpecs.b) && Dp.m7283equalsimpl0(this.c, passengerCountSelectionBottomSheetUISpecs.c) && Dp.m7283equalsimpl0(this.d, passengerCountSelectionBottomSheetUISpecs.d) && Intrinsics.d(this.e, passengerCountSelectionBottomSheetUISpecs.e) && Intrinsics.d(this.f, passengerCountSelectionBottomSheetUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f7775a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("PassengerCountSelectionBottomSheetUISpecs(borderUISpec=");
        sb.append(this.f7775a);
        sb.append(", counterInternalPadding=");
        sb.append(this.b);
        sb.append(", spaceBtwTitleAndCounter=");
        cb0.t(sb, strM7289toStringimpl, ", spaceBtwCounterBtnAndText=", strM7289toStringimpl2, ", counterCardInternalPadding=");
        sb.append(this.e);
        sb.append(", counterCardOuterPadding=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

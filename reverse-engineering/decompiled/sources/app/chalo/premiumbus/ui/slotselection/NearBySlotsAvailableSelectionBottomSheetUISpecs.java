package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearBySlotsAvailableSelectionBottomSheetUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearBySlotsAvailableSelectionBottomSheetUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7806a;
    public final float b;
    public final float c;
    public final float d;

    public NearBySlotsAvailableSelectionBottomSheetUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().k;
        this.f7806a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearBySlotsAvailableSelectionBottomSheetUISpecs)) {
            return false;
        }
        NearBySlotsAvailableSelectionBottomSheetUISpecs nearBySlotsAvailableSelectionBottomSheetUISpecs = (NearBySlotsAvailableSelectionBottomSheetUISpecs) obj;
        return Intrinsics.d(this.f7806a, nearBySlotsAvailableSelectionBottomSheetUISpecs.f7806a) && Dp.m7283equalsimpl0(this.b, nearBySlotsAvailableSelectionBottomSheetUISpecs.b) && Dp.m7283equalsimpl0(this.c, nearBySlotsAvailableSelectionBottomSheetUISpecs.c) && Dp.m7283equalsimpl0(this.d, nearBySlotsAvailableSelectionBottomSheetUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f7806a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("NearBySlotsAvailableSelectionBottomSheetUISpecs(contentPadding=", this.f7806a, ", spaceBtwTitleAndSubTitle=", strM7289toStringimpl, ", spaceBtwSubTitleAndCards="), Dp.m7289toStringimpl(this.c), ", spaceBtwCardsAndConfirmBtn=", Dp.m7289toStringimpl(this.d), ")");
    }
}

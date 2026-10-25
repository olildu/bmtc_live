package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.cb0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionDateAndTimePickerUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionDateAndTimePickerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7860a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public PremiumBusSlotSelectionDateAndTimePickerUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().h;
        this.f7860a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionDateAndTimePickerUISpecs)) {
            return false;
        }
        PremiumBusSlotSelectionDateAndTimePickerUISpecs premiumBusSlotSelectionDateAndTimePickerUISpecs = (PremiumBusSlotSelectionDateAndTimePickerUISpecs) obj;
        return Intrinsics.d(this.f7860a, premiumBusSlotSelectionDateAndTimePickerUISpecs.f7860a) && Dp.m7283equalsimpl0(this.b, premiumBusSlotSelectionDateAndTimePickerUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusSlotSelectionDateAndTimePickerUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusSlotSelectionDateAndTimePickerUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusSlotSelectionDateAndTimePickerUISpecs.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f7860a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbN = t10.n("PremiumBusSlotSelectionDateAndTimePickerUISpecs(contentPadding=", this.f7860a, ", spaceBtwCloseIconAndTitle=", strM7289toStringimpl, ", spaceBtwTitleAndSelectDateText=");
        cb0.t(sbN, strM7289toStringimpl2, ", spaceBtwTimePickerAndContinueBtn=", strM7289toStringimpl3, ", spaceBtwContinueBtnAndCancelBtn=");
        return vo1.p(sbN, strM7289toStringimpl4, ")");
    }
}

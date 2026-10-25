package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/ViewAllSlotsBottomSheetUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewAllSlotsBottomSheetUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7904a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final UIShape i;
    public final ChaloColorToken j;
    public final ChaloPadding k;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ViewAllSlotsBottomSheetUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().k;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().n;
        float f6 = ChaloThemeHelper.c.c;
        UIShape confirmBtnCardShape = ChaloThemeHelper.d.f1923a;
        float f7 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f7, f7, f7, f7);
        Intrinsics.i(confirmBtnCardShape, "confirmBtnCardShape");
        this.f7904a = chaloPadding;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        this.b = white;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = confirmBtnCardShape;
        this.j = white;
        this.k = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAllSlotsBottomSheetUISpec)) {
            return false;
        }
        ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec = (ViewAllSlotsBottomSheetUISpec) obj;
        return Intrinsics.d(this.f7904a, viewAllSlotsBottomSheetUISpec.f7904a) && Intrinsics.d(this.b, viewAllSlotsBottomSheetUISpec.b) && Dp.m7283equalsimpl0(this.c, viewAllSlotsBottomSheetUISpec.c) && Dp.m7283equalsimpl0(this.d, viewAllSlotsBottomSheetUISpec.d) && Dp.m7283equalsimpl0(this.e, viewAllSlotsBottomSheetUISpec.e) && Dp.m7283equalsimpl0(this.f, viewAllSlotsBottomSheetUISpec.f) && Dp.m7283equalsimpl0(this.g, viewAllSlotsBottomSheetUISpec.g) && Dp.m7283equalsimpl0(this.h, viewAllSlotsBottomSheetUISpec.h) && Intrinsics.d(this.i, viewAllSlotsBottomSheetUISpec.i) && Intrinsics.d(this.j, viewAllSlotsBottomSheetUISpec.j) && Intrinsics.d(this.k, viewAllSlotsBottomSheetUISpec.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + z40.b(this.j, pk0.b(this.i, uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, z40.b(this.b, this.f7904a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.h);
        StringBuilder sbL = gf.l(this.f7904a, this.b, "ViewAllSlotsBottomSheetUISpec(contentPadding=", ", backgroundColor=", ", spaceBtwTitleAndSlotList=");
        cb0.t(sbL, strM7289toStringimpl, ", spaceBtwSlots=", strM7289toStringimpl2, ", spaceBtwSlotListAndCantFindPreferredTiming=");
        cb0.t(sbL, strM7289toStringimpl3, ", spaceBtwCantFindPreferredTimingAndBtn=", strM7289toStringimpl4, ", confirmBtnHeight=");
        cb0.t(sbL, strM7289toStringimpl5, ", confirmBtnElevation=", strM7289toStringimpl6, ", confirmBtnCardShape=");
        sbL.append(this.i);
        sbL.append(", confirmBtnBackgroundColor=");
        sbL.append(this.j);
        sbL.append(", confirmBtnPadding=");
        return py.e(sbL, this.k, ")");
    }
}

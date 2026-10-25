package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/MultiSelectDatePickerSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiSelectDatePickerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10008a;
    public final ChaloPadding b;
    public final float c;
    public final ChaloPadding d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public MultiSelectDatePickerSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        float f = ChaloThemeHelper.a().w;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().h;
        float f7 = ChaloThemeHelper.a().d;
        float f8 = ChaloThemeHelper.a().g;
        this.f10008a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
        this.d = chaloPadding2;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectDatePickerSpec)) {
            return false;
        }
        MultiSelectDatePickerSpec multiSelectDatePickerSpec = (MultiSelectDatePickerSpec) obj;
        return Intrinsics.d(this.f10008a, multiSelectDatePickerSpec.f10008a) && Intrinsics.d(this.b, multiSelectDatePickerSpec.b) && Dp.m7283equalsimpl0(this.c, multiSelectDatePickerSpec.c) && Intrinsics.d(this.d, multiSelectDatePickerSpec.d) && Dp.m7283equalsimpl0(this.e, multiSelectDatePickerSpec.e) && Dp.m7283equalsimpl0(this.f, multiSelectDatePickerSpec.f) && Dp.m7283equalsimpl0(this.g, multiSelectDatePickerSpec.g) && Dp.m7283equalsimpl0(this.h, multiSelectDatePickerSpec.h) && Dp.m7283equalsimpl0(this.i, multiSelectDatePickerSpec.i) && Dp.m7283equalsimpl0(this.j, multiSelectDatePickerSpec.j) && Dp.m7283equalsimpl0(this.k, multiSelectDatePickerSpec.k);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.k) + uf0.a(this.j, uf0.a(this.i, uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, r30.c(this.d, uf0.a(this.c, r30.c(this.b, this.f10008a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl7 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl8 = Dp.m7289toStringimpl(this.k);
        StringBuilder sbI = py.i(this.b, this.f10008a, "MultiSelectDatePickerSpec(backgroundColor=", ", contentPadding=", ", monthSectionHeight=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", subSectionsContentPadding=");
        sbI.append(this.d);
        sbI.append(", spaceBtwLegends=");
        cb0.t(sbI, strM7289toStringimpl2, ", spaceBtwButtons=", strM7289toStringimpl3, ", spaceBtwDividerAndProceedButton=");
        cb0.t(sbI, strM7289toStringimpl4, ", spaceBtwLegendListAndDivider=", strM7289toStringimpl5, ", spaceBtwContentAndLegendList=");
        cb0.t(sbI, strM7289toStringimpl6, ", spaceBtwTitleAndSubtitle=", strM7289toStringimpl7, ", spaceBtwSubtitleAndDivider=");
        return vo1.p(sbI, strM7289toStringimpl8, ")");
    }
}

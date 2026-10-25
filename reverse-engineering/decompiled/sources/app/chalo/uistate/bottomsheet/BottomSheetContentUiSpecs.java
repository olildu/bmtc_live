package app.chalo.uistate.bottomsheet;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetContentUiSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetContentUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9900a;
    public final UiAlignment.Horizontal b;
    public final UiAlignment.Horizontal c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public BottomSheetContentUiSpecs(ChaloPadding chaloPadding, UiAlignment.Horizontal horizontal, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            float f4 = ChaloThemeHelper.a().i;
            float f5 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f4, f5, f5, f4);
        }
        int i2 = i & 4;
        UiAlignment.Horizontal.Center center = UiAlignment.Horizontal.Center.f9884a;
        horizontal = i2 != 0 ? center : horizontal;
        float f6 = ChaloThemeHelper.a().k;
        float f7 = ChaloThemeHelper.a().f;
        f = (i & 32) != 0 ? ChaloThemeHelper.a().k : f;
        f2 = (i & 64) != 0 ? ChaloThemeHelper.a().h : f2;
        float f8 = ChaloThemeHelper.a().n;
        f3 = (i & 256) != 0 ? ChaloThemeHelper.a().h : f3;
        this.f9900a = chaloPadding;
        this.b = center;
        this.c = horizontal;
        this.d = f6;
        this.e = f7;
        this.f = f;
        this.g = f2;
        this.h = f8;
        this.i = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetContentUiSpecs)) {
            return false;
        }
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs = (BottomSheetContentUiSpecs) obj;
        return Intrinsics.d(this.f9900a, bottomSheetContentUiSpecs.f9900a) && Intrinsics.d(this.b, bottomSheetContentUiSpecs.b) && Intrinsics.d(this.c, bottomSheetContentUiSpecs.c) && Dp.m7283equalsimpl0(this.d, bottomSheetContentUiSpecs.d) && Dp.m7283equalsimpl0(this.e, bottomSheetContentUiSpecs.e) && Dp.m7283equalsimpl0(this.f, bottomSheetContentUiSpecs.f) && Dp.m7283equalsimpl0(this.g, bottomSheetContentUiSpecs.g) && Dp.m7283equalsimpl0(this.h, bottomSheetContentUiSpecs.h) && Dp.m7283equalsimpl0(this.i, bottomSheetContentUiSpecs.i);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.i) + uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.d(this.c, uf0.d(this.b, this.f9900a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.i);
        StringBuilder sb = new StringBuilder("BottomSheetContentUiSpecs(contentPadding=");
        sb.append(this.f9900a);
        sb.append(", contentAlignment=");
        sb.append(this.b);
        sb.append(", titleAndMessageAlignment=");
        sb.append(this.c);
        sb.append(", spaceBetweenIconAndTitle=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceBetweenTitleAndSubText=");
        cb0.t(sb, strM7289toStringimpl2, ", spaceBetweenTextAndButton=", strM7289toStringimpl3, ", spaceBetweenButtons=");
        cb0.t(sb, strM7289toStringimpl4, ", buttonHeight=", strM7289toStringimpl5, ", closeIconAndContentSpacing=");
        return vo1.p(sb, strM7289toStringimpl6, ")");
    }
}

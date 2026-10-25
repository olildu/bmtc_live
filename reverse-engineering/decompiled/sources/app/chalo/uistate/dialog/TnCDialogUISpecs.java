package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/TnCDialogUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TnCDialogUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10013a;
    public final UIShape b;
    public final UiAlignment.Horizontal c;
    public final float d;
    public final ChaloPadding e;
    public final float f;
    public final ChaloPadding g;
    public final float h;

    public TnCDialogUISpecs() {
        UIShape.Rectangle shape = UIShape.d;
        float f = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().i;
        Intrinsics.i(shape, "shape");
        this.f10013a = ChaloColorToken.White.f9870a;
        this.b = shape;
        this.c = UiAlignment.Horizontal.Center.f9884a;
        this.d = f;
        this.e = chaloPadding;
        this.f = f2;
        this.g = chaloPadding2;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TnCDialogUISpecs)) {
            return false;
        }
        TnCDialogUISpecs tnCDialogUISpecs = (TnCDialogUISpecs) obj;
        return Intrinsics.d(this.f10013a, tnCDialogUISpecs.f10013a) && Intrinsics.d(this.b, tnCDialogUISpecs.b) && Intrinsics.d(this.c, tnCDialogUISpecs.c) && Dp.m7283equalsimpl0(this.d, tnCDialogUISpecs.d) && Intrinsics.d(this.e, tnCDialogUISpecs.e) && Dp.m7283equalsimpl0(this.f, tnCDialogUISpecs.f) && Intrinsics.d(this.g, tnCDialogUISpecs.g) && Dp.m7283equalsimpl0(this.h, tnCDialogUISpecs.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + r30.c(this.g, uf0.a(this.f, r30.c(this.e, uf0.a(this.d, uf0.d(this.c, pk0.b(this.b, this.f10013a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.h);
        StringBuilder sb = new StringBuilder("TnCDialogUISpecs(backgroundColor=");
        sb.append(this.f10013a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", horizontal=");
        sb.append(this.c);
        sb.append(", topSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", titlePadding=");
        py.u(sb, this.e, ", titleAndTermListSpacing=", strM7289toStringimpl2, ", termTextPadding=");
        sb.append(this.g);
        sb.append(", termListAndBtnSpacing=");
        sb.append(strM7289toStringimpl3);
        sb.append(")");
        return sb.toString();
    }
}

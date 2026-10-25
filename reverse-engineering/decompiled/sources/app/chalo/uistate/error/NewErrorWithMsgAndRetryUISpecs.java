package app.chalo.uistate.error;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.image.ImageUISize;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/NewErrorWithMsgAndRetryUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewErrorWithMsgAndRetryUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10022a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final UiAlignment.BiasAlignment e;
    public final UiAlignment.Horizontal f;
    public final UiArrangement.HorizontalOrVertical g;
    public final ImageUISize h;
    public final UiAlignment.BiasAlignment i;
    public final float j;
    public final float k;
    public final float l;

    public NewErrorWithMsgAndRetryUISpecs() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().m, 0.0f, 2);
        float f3 = 150;
        ImageUISize imageUISize = new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f3)), Dp.m7276boximpl(Dp.m7278constructorimpl(f3)));
        float f4 = ChaloThemeHelper.a().j;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().n;
        this.f10022a = f;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = UiAlignment.BiasAlignment.Center.f9878a;
        this.f = UiAlignment.Horizontal.Center.f9884a;
        this.g = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.h = imageUISize;
        this.i = UiAlignment.BiasAlignment.BottomCenter.f9875a;
        this.j = f4;
        this.k = f5;
        this.l = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewErrorWithMsgAndRetryUISpecs)) {
            return false;
        }
        NewErrorWithMsgAndRetryUISpecs newErrorWithMsgAndRetryUISpecs = (NewErrorWithMsgAndRetryUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f10022a, newErrorWithMsgAndRetryUISpecs.f10022a) && Intrinsics.d(this.b, newErrorWithMsgAndRetryUISpecs.b) && Intrinsics.d(this.c, newErrorWithMsgAndRetryUISpecs.c) && Intrinsics.d(this.d, newErrorWithMsgAndRetryUISpecs.d) && Intrinsics.d(this.e, newErrorWithMsgAndRetryUISpecs.e) && Intrinsics.d(this.f, newErrorWithMsgAndRetryUISpecs.f) && Intrinsics.d(this.g, newErrorWithMsgAndRetryUISpecs.g) && Intrinsics.d(this.h, newErrorWithMsgAndRetryUISpecs.h) && Intrinsics.d(this.i, newErrorWithMsgAndRetryUISpecs.i) && Dp.m7283equalsimpl0(this.j, newErrorWithMsgAndRetryUISpecs.j) && Dp.m7283equalsimpl0(this.k, newErrorWithMsgAndRetryUISpecs.k) && Dp.m7283equalsimpl0(this.l, newErrorWithMsgAndRetryUISpecs.l);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.l) + uf0.a(this.k, uf0.a(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + uf0.d(this.f, (this.e.hashCode() + r30.c(this.d, r30.c(this.c, z40.b(this.b, Dp.m7284hashCodeimpl(this.f10022a) * 31, 31), 31), 31)) * 31, 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f10022a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.k);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.l);
        StringBuilder sb = new StringBuilder("NewErrorWithMsgAndRetryUISpecs(spaceBetweenTitleAndMsg=");
        sb.append(strM7289toStringimpl);
        sb.append(", containerColor=");
        sb.append(this.b);
        sb.append(", containerPadding=");
        r30.o(sb, this.c, ", contentPadding=", this.d, ", contentAlignment=");
        sb.append(this.e);
        sb.append(", horizontalAlignment=");
        sb.append(this.f);
        sb.append(", verticalArrangement=");
        sb.append(this.g);
        sb.append(", gifSize=");
        sb.append(this.h);
        sb.append(", buttonAlignment=");
        sb.append(this.i);
        sb.append(", spaceBetweenImageAndMsg=");
        sb.append(strM7289toStringimpl2);
        sb.append(", spaceBetweenBtns=");
        return r30.i(sb, strM7289toStringimpl3, ", buttonHeight=", strM7289toStringimpl4, ")");
    }
}

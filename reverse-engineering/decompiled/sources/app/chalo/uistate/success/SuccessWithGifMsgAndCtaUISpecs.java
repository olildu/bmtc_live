package app.chalo.uistate.success;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.cb0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/success/SuccessWithGifMsgAndCtaUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuccessWithGifMsgAndCtaUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10074a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final UiAlignment.BiasAlignment d;
    public final UiAlignment.Horizontal e;
    public final UiArrangement.HorizontalOrVertical f;
    public final UiAlignment.BiasAlignment g;
    public final float h;
    public final float i;
    public final float j;
    public final UiAlignment.Vertical k;
    public final UiArrangement.HorizontalOrVertical l;
    public final float m;

    public SuccessWithGifMsgAndCtaUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().m, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().f1916a;
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().n;
        this.f10074a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = UiAlignment.BiasAlignment.Center.f9878a;
        this.e = UiAlignment.Horizontal.Center.f9884a;
        UiArrangement.HorizontalOrVertical.Center center = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.f = center;
        this.g = UiAlignment.BiasAlignment.BottomCenter.f9875a;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = UiAlignment.Vertical.Center.f9888a;
        this.l = center;
        this.m = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessWithGifMsgAndCtaUISpecs)) {
            return false;
        }
        SuccessWithGifMsgAndCtaUISpecs successWithGifMsgAndCtaUISpecs = (SuccessWithGifMsgAndCtaUISpecs) obj;
        return Intrinsics.d(this.f10074a, successWithGifMsgAndCtaUISpecs.f10074a) && Intrinsics.d(this.b, successWithGifMsgAndCtaUISpecs.b) && Intrinsics.d(this.c, successWithGifMsgAndCtaUISpecs.c) && Intrinsics.d(this.d, successWithGifMsgAndCtaUISpecs.d) && Intrinsics.d(this.e, successWithGifMsgAndCtaUISpecs.e) && Intrinsics.d(this.f, successWithGifMsgAndCtaUISpecs.f) && Intrinsics.d(this.g, successWithGifMsgAndCtaUISpecs.g) && Dp.m7283equalsimpl0(this.h, successWithGifMsgAndCtaUISpecs.h) && Dp.m7283equalsimpl0(this.i, successWithGifMsgAndCtaUISpecs.i) && Dp.m7283equalsimpl0(this.j, successWithGifMsgAndCtaUISpecs.j) && Intrinsics.d(this.k, successWithGifMsgAndCtaUISpecs.k) && Intrinsics.d(this.l, successWithGifMsgAndCtaUISpecs.l) && Dp.m7283equalsimpl0(this.m, successWithGifMsgAndCtaUISpecs.m);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.m) + ((this.l.hashCode() + uf0.e(this.k, uf0.a(this.j, uf0.a(this.i, uf0.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + uf0.d(this.e, (this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f10074a.hashCode() * 31, 31), 31)) * 31, 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.m);
        StringBuilder sbI = py.i(this.b, this.f10074a, "SuccessWithGifMsgAndCtaUISpecs(containerColor=", ", containerPadding=", ", contentPadding=");
        sbI.append(this.c);
        sbI.append(", contentAlignment=");
        sbI.append(this.d);
        sbI.append(", horizontalAlignment=");
        sbI.append(this.e);
        sbI.append(", verticalArrangement=");
        sbI.append(this.f);
        sbI.append(", buttonAlignment=");
        sbI.append(this.g);
        sbI.append(", spaceBetweenGifAndMsg=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", spaceBetweenMsgAndDesc=");
        cb0.t(sbI, strM7289toStringimpl2, ", spaceBetweenBtns=", strM7289toStringimpl3, ", descriptionImageRowAlignment=");
        sbI.append(this.k);
        sbI.append(", descriptionImageRowArrangement=");
        sbI.append(this.l);
        sbI.append(", buttonHeight=");
        return vo1.p(sbI, strM7289toStringimpl4, ")");
    }
}

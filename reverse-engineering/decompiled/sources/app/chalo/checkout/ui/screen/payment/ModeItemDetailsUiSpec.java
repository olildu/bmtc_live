package app.chalo.checkout.ui.screen.payment;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.UIContentScale;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/ModeItemDetailsUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ModeItemDetailsUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f1517a;
    public final float b;
    public final float c;
    public final UiAlignment.Vertical d;
    public final UiArrangement.HorizontalOrVertical e;
    public final UiArrangement.HorizontalOrVertical f;
    public final ChaloPadding g;
    public final ImageUISize h;
    public final UIContentScale i;
    public final float j;
    public final UiAlignment.Vertical k;
    public final UiAlignment.Vertical l;
    public final float m;
    public final float n;

    public ModeItemDetailsUiSpec(float f, ChaloPadding chaloPadding, int i) {
        float f2 = ChaloThemeHelper.a().d;
        f = (i & 4) != 0 ? 1.0f : f;
        chaloPadding = (i & 64) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding;
        ImageUISize imageUISize = new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().k), Dp.m7276boximpl(ChaloThemeHelper.a().k));
        UIContentScale imageScale = UIContentScale.Fit;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().d;
        Intrinsics.i(imageScale, "imageScale");
        this.f1517a = ChaloColorToken.White.f9870a;
        this.b = f2;
        this.c = f;
        UiAlignment.Vertical.Center center = UiAlignment.Vertical.Center.f9888a;
        this.d = center;
        this.e = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;
        this.f = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.g = chaloPadding;
        this.h = imageUISize;
        this.i = imageScale;
        this.j = f3;
        this.k = center;
        this.l = center;
        this.m = f4;
        this.n = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeItemDetailsUiSpec)) {
            return false;
        }
        ModeItemDetailsUiSpec modeItemDetailsUiSpec = (ModeItemDetailsUiSpec) obj;
        return Intrinsics.d(this.f1517a, modeItemDetailsUiSpec.f1517a) && Dp.m7283equalsimpl0(this.b, modeItemDetailsUiSpec.b) && Float.compare(this.c, modeItemDetailsUiSpec.c) == 0 && Intrinsics.d(this.d, modeItemDetailsUiSpec.d) && Intrinsics.d(this.e, modeItemDetailsUiSpec.e) && Intrinsics.d(this.f, modeItemDetailsUiSpec.f) && Intrinsics.d(this.g, modeItemDetailsUiSpec.g) && Intrinsics.d(this.h, modeItemDetailsUiSpec.h) && this.i == modeItemDetailsUiSpec.i && Dp.m7283equalsimpl0(this.j, modeItemDetailsUiSpec.j) && Intrinsics.d(this.k, modeItemDetailsUiSpec.k) && Intrinsics.d(this.l, modeItemDetailsUiSpec.l) && Dp.m7283equalsimpl0(this.m, modeItemDetailsUiSpec.m) && Dp.m7283equalsimpl0(this.n, modeItemDetailsUiSpec.n);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.n) + uf0.a(this.m, uf0.e(this.l, uf0.e(this.k, uf0.a(this.j, (this.i.hashCode() + ((this.h.hashCode() + r30.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + uf0.e(this.d, r30.a(this.c, uf0.a(this.b, this.f1517a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.m);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.n);
        StringBuilder sb = new StringBuilder("ModeItemDetailsUiSpec(backgroundColorToken=");
        sb.append(this.f1517a);
        sb.append(", warningMsgSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", verticalAlignment=");
        sb.append(this.d);
        sb.append(", horizontalArrangement=");
        sb.append(this.e);
        sb.append(", verticalArrangement=");
        sb.append(this.f);
        sb.append(", dividerPadding=");
        sb.append(this.g);
        sb.append(", imageUISize=");
        sb.append(this.h);
        sb.append(", imageScale=");
        sb.append(this.i);
        sb.append(", spaceBetweenImageAndText=");
        sb.append(strM7289toStringimpl2);
        sb.append(", cardTextContentAlignment=");
        sb.append(this.k);
        sb.append(", headingAndLabelAlignment=");
        sb.append(this.l);
        sb.append(", headingAndLabelSpacing=");
        return r30.i(sb, strM7289toStringimpl3, ", headingAndDescSpacing=", strM7289toStringimpl4, ")");
    }
}

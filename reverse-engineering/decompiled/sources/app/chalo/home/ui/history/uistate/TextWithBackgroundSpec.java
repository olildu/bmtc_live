package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/TextWithBackgroundSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextWithBackgroundSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3487a;
    public final UIShape b;
    public final ChaloColorToken.Custom c;
    public final float d;
    public final float e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TextWithBackgroundSpec(ChaloPadding chaloPadding, UIShape shape, ChaloColorToken.Custom custom, float f, float f2) {
        Intrinsics.i(shape, "shape");
        this.f3487a = chaloPadding;
        this.b = shape;
        this.c = custom;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithBackgroundSpec)) {
            return false;
        }
        TextWithBackgroundSpec textWithBackgroundSpec = (TextWithBackgroundSpec) obj;
        return this.f3487a.equals(textWithBackgroundSpec.f3487a) && Intrinsics.d(this.b, textWithBackgroundSpec.b) && this.c.equals(textWithBackgroundSpec.c) && Dp.m7283equalsimpl0(this.d, textWithBackgroundSpec.d) && Dp.m7283equalsimpl0(this.e, textWithBackgroundSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, nf1.c(pk0.b(this.b, this.f3487a.hashCode() * 31, 31), 31, this.c.f9781a), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("TextWithBackgroundSpec(contentPadding=");
        sb.append(this.f3487a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", leadingImageAndTextSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", textAndTrailingImageSpacing=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }
}

package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ChaloRecentlySearchedCardSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloRecentlySearchedCardSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9932a;
    public final float b;
    public final ChaloColorToken c;
    public final float d;
    public final UIShape e;
    public final BorderUISpec f;

    public ChaloRecentlySearchedCardSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().d, ChaloThemeHelper.a().g, ChaloThemeHelper.a().f);
        float f = ChaloThemeHelper.a().v;
        float f2 = ChaloThemeHelper.a().d;
        UIShape.Rectangle shape = UIShape.d;
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.h);
        Intrinsics.i(shape, "shape");
        this.f9932a = chaloPadding;
        this.b = f;
        this.c = ChaloColorToken.White.f9870a;
        this.d = f2;
        this.e = shape;
        this.f = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloRecentlySearchedCardSpec)) {
            return false;
        }
        ChaloRecentlySearchedCardSpec chaloRecentlySearchedCardSpec = (ChaloRecentlySearchedCardSpec) obj;
        return Intrinsics.d(this.f9932a, chaloRecentlySearchedCardSpec.f9932a) && Dp.m7283equalsimpl0(this.b, chaloRecentlySearchedCardSpec.b) && Intrinsics.d(this.c, chaloRecentlySearchedCardSpec.c) && Dp.m7283equalsimpl0(this.d, chaloRecentlySearchedCardSpec.d) && Intrinsics.d(this.e, chaloRecentlySearchedCardSpec.e) && Intrinsics.d(this.f, chaloRecentlySearchedCardSpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + pk0.b(this.e, uf0.a(this.d, z40.b(this.c, uf0.a(this.b, this.f9932a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("ChaloRecentlySearchedCardSpec(contentPadding=", this.f9932a, ", maxWidth=", strM7289toStringimpl, ", backgroundColorToken=");
        sbN.append(this.c);
        sbN.append(", iconAndTextSpacing=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", shape=");
        sbN.append(this.e);
        sbN.append(", borderUISpec=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}

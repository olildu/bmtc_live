package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ChaloCitySelectedContainerSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCitySelectedContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3463a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;
    public final float e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloCitySelectedContainerSpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().l;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        float f4 = ChaloThemeHelper.a().c;
        float f5 = ChaloThemeHelper.a().e;
        this.f3463a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = rectangle;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCitySelectedContainerSpec)) {
            return false;
        }
        ChaloCitySelectedContainerSpec chaloCitySelectedContainerSpec = (ChaloCitySelectedContainerSpec) obj;
        return Intrinsics.d(this.f3463a, chaloCitySelectedContainerSpec.f3463a) && Intrinsics.d(this.b, chaloCitySelectedContainerSpec.b) && Intrinsics.d(this.c, chaloCitySelectedContainerSpec.c) && Dp.m7283equalsimpl0(this.d, chaloCitySelectedContainerSpec.d) && Dp.m7283equalsimpl0(this.e, chaloCitySelectedContainerSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, pk0.b(this.c, z40.b(this.b, this.f3463a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbL = gf.l(this.f3463a, this.b, "ChaloCitySelectedContainerSpec(contentPadding=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", leadingIconAndTextSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", trailingIconAndTextSpacing=");
        return vo1.p(sbL, strM7289toStringimpl2, ")");
    }
}

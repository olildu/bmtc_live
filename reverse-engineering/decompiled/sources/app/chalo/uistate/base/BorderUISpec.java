package app.chalo.uistate.base;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.UIShape;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/BorderUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BorderUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9753a;
    public final ChaloColorToken b;
    public final UIShape c;

    public BorderUISpec(float f, ChaloColorToken color, UIShape shape) {
        Intrinsics.i(color, "color");
        Intrinsics.i(shape, "shape");
        this.f9753a = f;
        this.b = color;
        this.c = shape;
    }

    public static BorderUISpec a(BorderUISpec borderUISpec, ChaloColorToken chaloColorToken) {
        float f = borderUISpec.f9753a;
        UIShape shape = borderUISpec.c;
        borderUISpec.getClass();
        Intrinsics.i(shape, "shape");
        return new BorderUISpec(f, chaloColorToken, shape);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderUISpec)) {
            return false;
        }
        BorderUISpec borderUISpec = (BorderUISpec) obj;
        return Dp.m7283equalsimpl0(this.f9753a, borderUISpec.f9753a) && Intrinsics.d(this.b, borderUISpec.b) && Intrinsics.d(this.c, borderUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, Dp.m7284hashCodeimpl(this.f9753a) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f9753a);
        StringBuilder sb = new StringBuilder("BorderUISpec(width=");
        sb.append(strM7289toStringimpl);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", shape=");
        return gf.j(sb, this.c, ")");
    }
}

package app.chalo.uistate.userprofile;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/userprofile/GenderCardSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderCardSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f10126a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloColorToken e;
    public final BorderUISpec f;

    public GenderCardSpec(float f, float f2, ChaloPadding chaloPadding, UIShape shape, BorderUISpec borderUISpec, ChaloColorToken backgroundColor) {
        Intrinsics.i(shape, "shape");
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f10126a = shape;
        this.b = chaloPadding;
        this.c = f;
        this.d = f2;
        this.e = backgroundColor;
        this.f = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCardSpec)) {
            return false;
        }
        GenderCardSpec genderCardSpec = (GenderCardSpec) obj;
        return Intrinsics.d(this.f10126a, genderCardSpec.f10126a) && Intrinsics.d(this.b, genderCardSpec.b) && Dp.m7283equalsimpl0(this.c, genderCardSpec.c) && Dp.m7283equalsimpl0(this.d, genderCardSpec.d) && Intrinsics.d(this.e, genderCardSpec.e) && Intrinsics.d(this.f, genderCardSpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + z40.b(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f10126a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("GenderCardSpec(shape=");
        sb.append(this.f10126a);
        sb.append(", contentPadding=");
        sb.append(this.b);
        sb.append(", titleAndImageSpacing=");
        cb0.t(sb, strM7289toStringimpl, ", imageSize=", strM7289toStringimpl2, ", backgroundColor=");
        sb.append(this.e);
        sb.append(", borderUISpec=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

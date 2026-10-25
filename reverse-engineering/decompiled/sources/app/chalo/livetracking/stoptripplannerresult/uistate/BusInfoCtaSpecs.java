package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusInfoCtaSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusInfoCtaSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4573a;
    public final UIShape b;
    public final BorderUISpec c;
    public final ChaloColorToken d;

    public BusInfoCtaSpecs(int i, BorderUISpec borderUISpec, ChaloColorToken chaloColorToken) {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle shape = UIShape.c;
        borderUISpec = (i & 4) != 0 ? new BorderUISpec(ChaloThemeHelper.a().f1916a, ChaloColorToken.Transparent.f9864a, shape) : borderUISpec;
        Intrinsics.i(shape, "shape");
        this.f4573a = chaloPadding;
        this.b = shape;
        this.c = borderUISpec;
        this.d = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusInfoCtaSpecs)) {
            return false;
        }
        BusInfoCtaSpecs busInfoCtaSpecs = (BusInfoCtaSpecs) obj;
        return Intrinsics.d(this.f4573a, busInfoCtaSpecs.f4573a) && Intrinsics.d(this.b, busInfoCtaSpecs.b) && Intrinsics.d(this.c, busInfoCtaSpecs.c) && Intrinsics.d(this.d, busInfoCtaSpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + pk0.b(this.b, this.f4573a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BusInfoCtaSpecs(contentPadding=" + this.f4573a + ", shape=" + this.b + ", borderUISpec=" + this.c + ", backgroundColor=" + this.d + ")";
    }
}

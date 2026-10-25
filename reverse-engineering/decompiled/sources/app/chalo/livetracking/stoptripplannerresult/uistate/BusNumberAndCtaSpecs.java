package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusNumberAndCtaSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusNumberAndCtaSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4575a;
    public final UIShape b;
    public final List c;
    public final float d;

    public BusNumberAndCtaSpecs() {
        float f = ChaloThemeHelper.a().e;
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle shape = UIShape.c;
        List backgroundGradient = CollectionsKt.S(ChaloColorToken.LightGrey.f9815a, ChaloColorToken.White.f9870a);
        float f3 = ChaloThemeHelper.a().f1916a;
        Intrinsics.i(shape, "shape");
        Intrinsics.i(backgroundGradient, "backgroundGradient");
        this.f4575a = chaloPadding;
        this.b = shape;
        this.c = backgroundGradient;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusNumberAndCtaSpecs)) {
            return false;
        }
        BusNumberAndCtaSpecs busNumberAndCtaSpecs = (BusNumberAndCtaSpecs) obj;
        return Intrinsics.d(this.f4575a, busNumberAndCtaSpecs.f4575a) && Intrinsics.d(this.b, busNumberAndCtaSpecs.b) && Intrinsics.d(this.c, busNumberAndCtaSpecs.c) && Dp.m7283equalsimpl0(this.d, busNumberAndCtaSpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + r30.b(pk0.b(this.b, this.f4575a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "BusNumberAndCtaSpecs(busLabelAndNumberOuterSpacing=" + this.f4575a + ", shape=" + this.b + ", backgroundGradient=" + this.c + ", labelAndNameSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}

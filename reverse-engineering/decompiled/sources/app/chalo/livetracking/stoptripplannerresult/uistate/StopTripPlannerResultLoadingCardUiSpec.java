package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopTripPlannerResultLoadingCardUiSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripPlannerResultLoadingCardUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f4617a;
    public final float b;
    public final UIShape c;
    public final ChaloPadding d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final ChaloColorToken j;
    public final ChaloColorToken k;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public StopTripPlannerResultLoadingCardUiSpec() {
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        float f = ChaloThemeHelper.a().h;
        UIShape.Rectangle itemShape = UIShape.d;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().j;
        float f5 = ChaloThemeHelper.a().o;
        float f6 = ChaloThemeHelper.a().o;
        float f7 = ChaloThemeHelper.a().i;
        Intrinsics.i(itemShape, "itemShape");
        this.f4617a = cardUISpec;
        this.b = f;
        this.c = itemShape;
        this.d = chaloPadding;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = ChaloColorToken.ShimmerColor.f9853a;
        this.k = ChaloColorToken.SectionDividerColor.f9849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripPlannerResultLoadingCardUiSpec)) {
            return false;
        }
        StopTripPlannerResultLoadingCardUiSpec stopTripPlannerResultLoadingCardUiSpec = (StopTripPlannerResultLoadingCardUiSpec) obj;
        return Intrinsics.d(this.f4617a, stopTripPlannerResultLoadingCardUiSpec.f4617a) && Dp.m7283equalsimpl0(this.b, stopTripPlannerResultLoadingCardUiSpec.b) && Intrinsics.d(this.c, stopTripPlannerResultLoadingCardUiSpec.c) && Intrinsics.d(this.d, stopTripPlannerResultLoadingCardUiSpec.d) && Dp.m7283equalsimpl0(this.e, stopTripPlannerResultLoadingCardUiSpec.e) && Dp.m7283equalsimpl0(this.f, stopTripPlannerResultLoadingCardUiSpec.f) && Dp.m7283equalsimpl0(this.g, stopTripPlannerResultLoadingCardUiSpec.g) && Dp.m7283equalsimpl0(this.h, stopTripPlannerResultLoadingCardUiSpec.h) && Dp.m7283equalsimpl0(this.i, stopTripPlannerResultLoadingCardUiSpec.i) && Intrinsics.d(this.j, stopTripPlannerResultLoadingCardUiSpec.j) && Intrinsics.d(this.k, stopTripPlannerResultLoadingCardUiSpec.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + z40.b(this.j, uf0.a(this.i, uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, r30.c(this.d, pk0.b(this.c, uf0.a(this.b, this.f4617a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.i);
        StringBuilder sb = new StringBuilder("StopTripPlannerResultLoadingCardUiSpec(cardSpecs=");
        sb.append(this.f4617a);
        sb.append(", cardsSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", itemShape=");
        sb.append(this.c);
        sb.append(", contentPadding=");
        sb.append(this.d);
        sb.append(", cardItemSpacing=");
        cb0.t(sb, strM7289toStringimpl2, ", cardBusItemHeight=", strM7289toStringimpl3, ", cardFromToItemHeight=");
        cb0.t(sb, strM7289toStringimpl4, ", cardEtaAndStopInfoItemHeight=", strM7289toStringimpl5, ", cardCtaItemHeight=");
        sb.append(strM7289toStringimpl6);
        sb.append(", shimmerColor=");
        sb.append(this.j);
        sb.append(", shimmerBackgroundColor=");
        return pk0.j(sb, this.k, ")");
    }
}

package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.card.CardUISpec;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/ItineraryListItemSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryListItemSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4586a;
    public final ChaloPadding b;
    public final float c;
    public final CardUISpec d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final UiAlignment.BiasAlignment g;
    public final UiAlignment.BiasAlignment h;

    public ItineraryListItemSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().k, 0.0f, ChaloThemeHelper.a().h, 4);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().f1916a, 0.0f, 11);
        float f = ChaloThemeHelper.a().h;
        CardUISpec cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        float f2 = ChaloThemeHelper.a().k;
        float f3 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding3 = new ChaloPadding(f3, f2, f2, f3);
        float f4 = ChaloThemeHelper.a().f1916a;
        float f5 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding4 = new ChaloPadding(f4, f5, f5, f4);
        this.f4586a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f;
        this.d = cardUISpec;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = UiAlignment.BiasAlignment.TopStart.f9883a;
        this.h = UiAlignment.BiasAlignment.BottomStart.f9877a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryListItemSpecs)) {
            return false;
        }
        ItineraryListItemSpecs itineraryListItemSpecs = (ItineraryListItemSpecs) obj;
        return Intrinsics.d(this.f4586a, itineraryListItemSpecs.f4586a) && Intrinsics.d(this.b, itineraryListItemSpecs.b) && Dp.m7283equalsimpl0(this.c, itineraryListItemSpecs.c) && Intrinsics.d(this.d, itineraryListItemSpecs.d) && Intrinsics.d(this.e, itineraryListItemSpecs.e) && Intrinsics.d(this.f, itineraryListItemSpecs.f) && Intrinsics.d(this.g, itineraryListItemSpecs.g) && Intrinsics.d(this.h, itineraryListItemSpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + r30.c(this.f, r30.c(this.e, (this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f4586a.hashCode() * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbM = pk0.m("ItineraryListItemSpecs(headerTextPadding=", this.f4586a, ", singleLegExternalPadding=", this.b, ", legCardSpacing=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", card=");
        sbM.append(this.d);
        sbM.append(", bottomCtaPadding=");
        r30.o(sbM, this.e, ", cardContentPadding=", this.f, ", headerAlignment=");
        sbM.append(this.g);
        sbM.append(", bottomCtaAlignment=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }
}

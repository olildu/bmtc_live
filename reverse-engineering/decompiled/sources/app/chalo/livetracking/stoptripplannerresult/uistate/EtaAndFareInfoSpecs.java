package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.color.ColorGradiantUiState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/EtaAndFareInfoSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EtaAndFareInfoSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4579a;
    public final UIShape b;
    public final ColorGradiantUiState.Linear c;

    public EtaAndFareInfoSpecs(ColorGradiantUiState.Linear linear, int i) {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle shape = UIShape.d;
        if ((i & 4) != 0) {
            ChaloColorToken.SectionDividerColor sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
            linear = new ColorGradiantUiState.Linear(CollectionsKt.S(sectionDividerColor, sectionDividerColor));
        }
        Intrinsics.i(shape, "shape");
        this.f4579a = chaloPadding;
        this.b = shape;
        this.c = linear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtaAndFareInfoSpecs)) {
            return false;
        }
        EtaAndFareInfoSpecs etaAndFareInfoSpecs = (EtaAndFareInfoSpecs) obj;
        return Intrinsics.d(this.f4579a, etaAndFareInfoSpecs.f4579a) && Intrinsics.d(this.b, etaAndFareInfoSpecs.b) && Intrinsics.d(this.c, etaAndFareInfoSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, this.f4579a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EtaAndFareInfoSpecs(contentPadding=" + this.f4579a + ", shape=" + this.b + ", backgroundGradiant=" + this.c + ")";
    }
}

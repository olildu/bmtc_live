package app.chalo.uistate.userprofile;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.components.ProductGridContainerSpec;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/userprofile/GenderCardSelectionSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderCardSelectionSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10122a;
    public final ChaloPadding b;
    public final ProductGridContainerSpec c;

    public GenderCardSelectionSpec(ProductGridContainerSpec genderSelectionGridSpec) {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
        Intrinsics.i(genderSelectionGridSpec, "genderSelectionGridSpec");
        this.f10122a = f;
        this.b = chaloPadding;
        this.c = genderSelectionGridSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCardSelectionSpec)) {
            return false;
        }
        GenderCardSelectionSpec genderCardSelectionSpec = (GenderCardSelectionSpec) obj;
        return Dp.m7283equalsimpl0(this.f10122a, genderCardSelectionSpec.f10122a) && Intrinsics.d(this.b, genderCardSelectionSpec.b) && Intrinsics.d(this.c, genderCardSelectionSpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, Dp.m7284hashCodeimpl(this.f10122a) * 31, 31);
    }

    public final String toString() {
        return "GenderCardSelectionSpec(cardsSpacing=" + Dp.m7289toStringimpl(this.f10122a) + ", titlePadding=" + this.b + ", genderSelectionGridSpec=" + this.c + ")";
    }
}

package app.chalo.livetracking.search.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchedItemSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentSearchedItemSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4517a;
    public final float b;
    public final float c;
    public final float d;

    public RecentSearchedItemSpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().h;
            float f2 = ChaloThemeHelper.a().i;
            chaloPadding = new ChaloPadding(f2, f, f, f2);
        }
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().d;
        float f5 = ChaloThemeHelper.a().i;
        this.f4517a = chaloPadding;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearchedItemSpec)) {
            return false;
        }
        RecentSearchedItemSpec recentSearchedItemSpec = (RecentSearchedItemSpec) obj;
        return Intrinsics.d(this.f4517a, recentSearchedItemSpec.f4517a) && Dp.m7283equalsimpl0(this.b, recentSearchedItemSpec.b) && Dp.m7283equalsimpl0(this.c, recentSearchedItemSpec.c) && Dp.m7283equalsimpl0(this.d, recentSearchedItemSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f4517a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("RecentSearchedItemSpec(contentPadding=", this.f4517a, ", iconAndTextSpacing=", strM7289toStringimpl, ", titleAndDescriptionSpacing="), Dp.m7289toStringimpl(this.c), ", descriptionAndDividerSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}

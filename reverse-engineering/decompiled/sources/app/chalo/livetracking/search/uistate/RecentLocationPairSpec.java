package app.chalo.livetracking.search.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentLocationPairSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentLocationPairSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4511a;
    public final ChaloPadding b;
    public final float c;

    public RecentLocationPairSpec(ChaloPadding chaloPadding) {
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().h;
        this.f4511a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentLocationPairSpec)) {
            return false;
        }
        RecentLocationPairSpec recentLocationPairSpec = (RecentLocationPairSpec) obj;
        return Intrinsics.d(this.f4511a, recentLocationPairSpec.f4511a) && Intrinsics.d(this.b, recentLocationPairSpec.b) && Dp.m7283equalsimpl0(this.c, recentLocationPairSpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.c(this.b, this.f4511a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(pk0.m("RecentLocationPairSpec(contentPadding=", this.f4511a, ", dividerPadding=", this.b, ", descriptionAndDividerSpacing="), Dp.m7289toStringimpl(this.c), ")");
    }
}

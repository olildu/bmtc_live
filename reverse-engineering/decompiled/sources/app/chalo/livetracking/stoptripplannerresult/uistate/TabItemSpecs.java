package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TabItemSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabItemSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4622a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;

    public TabItemSpecs(ChaloColorToken chaloColorToken, int i) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, Dp.m7278constructorimpl(14), 1);
        chaloColorToken = (i & 4) != 0 ? ChaloColorToken.Orange2.f9830a : chaloColorToken;
        this.f4622a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabItemSpecs)) {
            return false;
        }
        TabItemSpecs tabItemSpecs = (TabItemSpecs) obj;
        return Intrinsics.d(this.f4622a, tabItemSpecs.f4622a) && Intrinsics.d(this.b, tabItemSpecs.b) && Intrinsics.d(this.c, tabItemSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f4622a.hashCode() * 31, 31);
    }

    public final String toString() {
        return pk0.j(gf.l(this.f4622a, this.b, "TabItemSpecs(padding=", ", tabBackground=", ", indicatorColor="), this.c, ")");
    }
}

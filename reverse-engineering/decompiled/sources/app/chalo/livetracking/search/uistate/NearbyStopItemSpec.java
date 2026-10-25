package app.chalo.livetracking.search.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/NearbyStopItemSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopItemSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4506a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final ChaloColorToken g;

    public NearbyStopItemSpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        }
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().c;
        float f5 = ChaloThemeHelper.a().o;
        this.f4506a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = ChaloColorToken.GreyColor.f9806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopItemSpec)) {
            return false;
        }
        NearbyStopItemSpec nearbyStopItemSpec = (NearbyStopItemSpec) obj;
        return Intrinsics.d(this.f4506a, nearbyStopItemSpec.f4506a) && Dp.m7283equalsimpl0(this.b, nearbyStopItemSpec.b) && Dp.m7283equalsimpl0(this.c, nearbyStopItemSpec.c) && Dp.m7283equalsimpl0(this.d, nearbyStopItemSpec.d) && Dp.m7283equalsimpl0(this.e, nearbyStopItemSpec.e) && Dp.m7283equalsimpl0(this.f, nearbyStopItemSpec.f) && Intrinsics.d(this.g, nearbyStopItemSpec.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f4506a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("NearbyStopItemSpec(contentPadding=", this.f4506a, ", contentAndDividerSpacing=", strM7289toStringimpl, ", iconAndContentSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", contentAndArrowSpacing=", strM7289toStringimpl3, ", titleAndSubtitleSpacing=");
        cb0.t(sbN, strM7289toStringimpl4, ", minItemHeight=", strM7289toStringimpl5, ", backgroundColor=");
        return pk0.j(sbN, this.g, ")");
    }
}

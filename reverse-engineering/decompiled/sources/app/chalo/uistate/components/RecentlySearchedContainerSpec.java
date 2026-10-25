package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RecentlySearchedContainerSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentlySearchedContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9941a;
    public final ChaloColorToken b;
    public final float c;

    public RecentlySearchedContainerSpec(ChaloPadding chaloPadding) {
        float f = ChaloThemeHelper.a().f;
        this.f9941a = chaloPadding;
        this.b = ChaloColorToken.Transparent.f9864a;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlySearchedContainerSpec)) {
            return false;
        }
        RecentlySearchedContainerSpec recentlySearchedContainerSpec = (RecentlySearchedContainerSpec) obj;
        return Intrinsics.d(this.f9941a, recentlySearchedContainerSpec.f9941a) && Intrinsics.d(this.b, recentlySearchedContainerSpec.b) && Dp.m7283equalsimpl0(this.c, recentlySearchedContainerSpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + z40.b(this.b, this.f9941a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(gf.l(this.f9941a, this.b, "RecentlySearchedContainerSpec(contentPadding=", ", backgroundColor=", ", itemSpacing="), Dp.m7289toStringimpl(this.c), ")");
    }
}

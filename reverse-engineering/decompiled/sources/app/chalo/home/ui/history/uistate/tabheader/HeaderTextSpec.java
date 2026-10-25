package app.chalo.home.ui.history.uistate.tabheader;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/tabheader/HeaderTextSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeaderTextSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3526a;
    public final float b;

    public HeaderTextSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().I;
        this.f3526a = chaloPadding;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextSpec)) {
            return false;
        }
        HeaderTextSpec headerTextSpec = (HeaderTextSpec) obj;
        return Intrinsics.d(this.f3526a, headerTextSpec.f3526a) && Dp.m7283equalsimpl0(this.b, headerTextSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f3526a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("HeaderTextSpec(contentPadding=", this.f3526a, ", maxWidth=", Dp.m7289toStringimpl(this.b), ")");
    }
}

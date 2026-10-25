package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.b3;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/SingleStopItemUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SingleStopItemUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4950a;
    public final ChaloPadding b;
    public final boolean c;

    public SingleStopItemUISpec(float f, boolean z) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().l, 0.0f, 0.0f, 13);
        this.f4950a = f;
        this.b = chaloPadding;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleStopItemUISpec)) {
            return false;
        }
        SingleStopItemUISpec singleStopItemUISpec = (SingleStopItemUISpec) obj;
        return Float.compare(this.f4950a, singleStopItemUISpec.f4950a) == 0 && Intrinsics.d(this.b, singleStopItemUISpec.b) && this.c == singleStopItemUISpec.c;
    }

    public final int hashCode() {
        return r30.c(this.b, Float.floatToIntBits(this.f4950a) * 31, 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleStopItemUISpec(alpha=");
        sb.append(this.f4950a);
        sb.append(", stopNamePadding=");
        sb.append(this.b);
        sb.append(", shouldSkipClickIndication=");
        return b3.g(")", sb, this.c);
    }
}

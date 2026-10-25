package app.chalo.uistate.components.map;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.vo1;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/uistate/components/map/PolylinePointUIState;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolylinePointUIState {
    public static final float d = Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9963a;
    public final ChaloColorToken b;
    public final float c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/map/PolylinePointUIState$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PolylinePointUIState(List points, ChaloColorToken chaloColorToken, float f) {
        Intrinsics.i(points, "points");
        this.f9963a = points;
        this.b = chaloColorToken;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolylinePointUIState)) {
            return false;
        }
        PolylinePointUIState polylinePointUIState = (PolylinePointUIState) obj;
        return Intrinsics.d(this.f9963a, polylinePointUIState.f9963a) && Intrinsics.d(this.b, polylinePointUIState.b) && Dp.m7283equalsimpl0(this.c, polylinePointUIState.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + z40.b(this.b, this.f9963a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("PolylinePointUIState(points=");
        sb.append(this.f9963a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", width=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }

    public /* synthetic */ PolylinePointUIState(List list) {
        this(list, ChaloColorToken.Black.f9759a, d);
    }
}

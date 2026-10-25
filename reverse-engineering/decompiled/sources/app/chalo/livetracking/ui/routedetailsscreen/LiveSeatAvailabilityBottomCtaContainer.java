package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.uf0;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomCtaContainer;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveSeatAvailabilityBottomCtaContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4813a;
    public final float b;
    public final float c;

    public LiveSeatAvailabilityBottomCtaContainer(List bottomCtasList) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        Intrinsics.i(bottomCtasList, "bottomCtasList");
        this.f4813a = bottomCtasList;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveSeatAvailabilityBottomCtaContainer)) {
            return false;
        }
        LiveSeatAvailabilityBottomCtaContainer liveSeatAvailabilityBottomCtaContainer = (LiveSeatAvailabilityBottomCtaContainer) obj;
        return Intrinsics.d(this.f4813a, liveSeatAvailabilityBottomCtaContainer.f4813a) && Dp.m7283equalsimpl0(this.b, liveSeatAvailabilityBottomCtaContainer.b) && Dp.m7283equalsimpl0(this.c, liveSeatAvailabilityBottomCtaContainer.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f4813a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("LiveSeatAvailabilityBottomCtaContainer(bottomCtasList=");
        sb.append(this.f4813a);
        sb.append(", spaceBeforeCtas=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceBetweenCtas=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }
}

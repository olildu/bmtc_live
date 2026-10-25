package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.button.ButtonUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/LiveTrackingNotSupportedBottomSheetCtaContainer;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveTrackingNotSupportedBottomSheetCtaContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveTrackingNotSupportedBottomSheetCtaContainerUISpec f4593a;
    public final ButtonUIState b;
    public final ButtonUIState c;

    public LiveTrackingNotSupportedBottomSheetCtaContainer(ButtonUIState positiveCta, ButtonUIState buttonUIState) {
        LiveTrackingNotSupportedBottomSheetCtaContainerUISpec liveTrackingNotSupportedBottomSheetCtaContainerUISpec = new LiveTrackingNotSupportedBottomSheetCtaContainerUISpec();
        Intrinsics.i(positiveCta, "positiveCta");
        this.f4593a = liveTrackingNotSupportedBottomSheetCtaContainerUISpec;
        this.b = positiveCta;
        this.c = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTrackingNotSupportedBottomSheetCtaContainer)) {
            return false;
        }
        LiveTrackingNotSupportedBottomSheetCtaContainer liveTrackingNotSupportedBottomSheetCtaContainer = (LiveTrackingNotSupportedBottomSheetCtaContainer) obj;
        return Intrinsics.d(this.f4593a, liveTrackingNotSupportedBottomSheetCtaContainer.f4593a) && Intrinsics.d(this.b, liveTrackingNotSupportedBottomSheetCtaContainer.b) && Intrinsics.d(this.c, liveTrackingNotSupportedBottomSheetCtaContainer.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.d(this.b, this.f4593a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveTrackingNotSupportedBottomSheetCtaContainer(spec=");
        sb.append(this.f4593a);
        sb.append(", positiveCta=");
        sb.append(this.b);
        sb.append(", negativeCta=");
        return hq0.j(sb, this.c, ")");
    }
}

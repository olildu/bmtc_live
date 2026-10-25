package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoLoadingUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoLoadingUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3322a;
    public final ChaloColorToken b;

    public ChaloBusRouteInfoLoadingUISpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().i;
        this.f3322a = new ChaloPadding(f2, f, f, f2);
        this.b = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoLoadingUISpec)) {
            return false;
        }
        ChaloBusRouteInfoLoadingUISpec chaloBusRouteInfoLoadingUISpec = (ChaloBusRouteInfoLoadingUISpec) obj;
        return Intrinsics.d(this.f3322a, chaloBusRouteInfoLoadingUISpec.f3322a) && Intrinsics.d(this.b, chaloBusRouteInfoLoadingUISpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3322a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloBusRouteInfoLoadingUISpec(contentPadding=" + this.f3322a + ", backgroundColor=" + this.b + ")";
    }
}

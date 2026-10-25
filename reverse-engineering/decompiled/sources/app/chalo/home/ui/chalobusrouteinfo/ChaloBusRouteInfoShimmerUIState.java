package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoShimmerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoShimmerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f3332a;
    public final ChaloColorToken b;
    public final ImageUIState c;
    public final ImageUIState d;

    public ChaloBusRouteInfoShimmerUIState() {
        IconType iconType = IconType.IC_ARROW_RIGHT;
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().h);
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ImageUIState imageUIState = new ImageUIState(iconType, (String) null, black, imageUISize, (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_NEXT, (String) null, black, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178);
        this.f3332a = ChaloColorToken.ShimmerColor.f9853a;
        this.b = ChaloColorToken.ShimmerBackground.f9852a;
        this.c = imageUIState;
        this.d = imageUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoShimmerUIState)) {
            return false;
        }
        ChaloBusRouteInfoShimmerUIState chaloBusRouteInfoShimmerUIState = (ChaloBusRouteInfoShimmerUIState) obj;
        return Intrinsics.d(this.f3332a, chaloBusRouteInfoShimmerUIState.f3332a) && Intrinsics.d(this.b, chaloBusRouteInfoShimmerUIState.b) && Intrinsics.d(this.c, chaloBusRouteInfoShimmerUIState.c) && Intrinsics.d(this.d, chaloBusRouteInfoShimmerUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.e(this.c, z40.b(this.b, this.f3332a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ChaloBusRouteInfoShimmerUIState(shimmerColor=" + this.f3332a + ", shimmerBackgroundColor=" + this.b + ", arrowIconUIState=" + this.c + ", dropDownIconUIState=" + this.d + ")";
    }
}

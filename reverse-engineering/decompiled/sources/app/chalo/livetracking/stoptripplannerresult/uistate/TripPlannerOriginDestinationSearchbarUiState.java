package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TripPlannerOriginDestinationSearchbarUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerOriginDestinationSearchbarUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OriginDestinationSearchbarSpecs f4625a;
    public final VerticalDashedLineUIState b;
    public final ImageUIState c;
    public final SearchStopItemUiState d;
    public final SearchStopItemUiState e;
    public final ImageUIState f;

    public TripPlannerOriginDestinationSearchbarUiState(SearchStopItemUiState origin, SearchStopItemUiState destination, ImageUIState imageUIState, int i) {
        OriginDestinationSearchbarSpecs originDestinationSearchbarSpecs = new OriginDestinationSearchbarSpecs();
        VerticalDashedLineUIState verticalDashedLineUIState = new VerticalDashedLineUIState(ChaloThemeHelper.a().c, ChaloColorToken.ShadyGray.f9851a);
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_BUS_STOP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        ImageUIState imageUIState3 = (i & 32) != 0 ? null : imageUIState;
        Intrinsics.i(origin, "origin");
        Intrinsics.i(destination, "destination");
        this.f4625a = originDestinationSearchbarSpecs;
        this.b = verticalDashedLineUIState;
        this.c = imageUIState2;
        this.d = origin;
        this.e = destination;
        this.f = imageUIState3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerOriginDestinationSearchbarUiState)) {
            return false;
        }
        TripPlannerOriginDestinationSearchbarUiState tripPlannerOriginDestinationSearchbarUiState = (TripPlannerOriginDestinationSearchbarUiState) obj;
        return Intrinsics.d(this.f4625a, tripPlannerOriginDestinationSearchbarUiState.f4625a) && Intrinsics.d(this.b, tripPlannerOriginDestinationSearchbarUiState.b) && Intrinsics.d(this.c, tripPlannerOriginDestinationSearchbarUiState.c) && Intrinsics.d(this.d, tripPlannerOriginDestinationSearchbarUiState.d) && Intrinsics.d(this.e, tripPlannerOriginDestinationSearchbarUiState.e) && Intrinsics.d(this.f, tripPlannerOriginDestinationSearchbarUiState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + r30.e(this.c, (this.b.hashCode() + (this.f4625a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        ImageUIState imageUIState = this.f;
        return iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode());
    }

    public final String toString() {
        return "TripPlannerOriginDestinationSearchbarUiState(specs=" + this.f4625a + ", dashedLineUIState=" + this.b + ", sideIndicatorIcon=" + this.c + ", origin=" + this.d + ", destination=" + this.e + ", swapImage=" + this.f + ")";
    }
}

package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.home.ui.savedplacesandrides.ConfirmationDialogUIState;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesScreenKt;
import app.chalo.home.ui.selectride.SelectRideViewState;
import app.chalo.home.ui.selectridescreen.SelectRideMainScreenKt;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInputKt;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUIState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityBannerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsAlertTextKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListHeaderKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.ShimmerViewsKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SingleStopItemKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteTimeTableKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableTimingUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.BusEtaWithSeatAvailabilityAndBonnet;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.FromStopAndBusIconUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsAlertTextUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsOptionsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteNameAndSchemeDetailsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteUserDestinationStopUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteWithBookingDetailsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SeatAvailabilityUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.SingleStopItemUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopNameAndEtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopNameRouteScreenUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopsListBusIconUIState;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRouteSearchViewItemLayoutUiModel;
import app.chalo.livetracking.universalsearch.ui.compose.SearchRouteItemComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.SeeMoreOrLessPickRouteComposableKt;
import app.chalo.ncmc.ui.landing.ChaloCardActivePassDetailsUiModel;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.premiumbus.ui.slotselectionlist.SlotCardUIState;
import app.chalo.premiumbus.ui.slotselectionlist.compose.SlotSelectionListMainScreenKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.pickroutelocation.RouteItemUiState;
import app.chalo.productbooking.pickroutelocation.ui.RouteSearchItemComposableKt;
import app.chalo.sos.SosScreenUIKt;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.HeaderTextUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k31 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17461a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k31(int i, int i2, Modifier modifier, Object obj) {
        this.f17461a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17461a) {
            case 0:
                ((Integer) obj2).getClass();
                RouteAvailabilityBannerKt.b((RouteAvailabilityDialogUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                RouteDetailsAlertTextKt.b((RouteDetailsAlertTextUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                RouteDetailsMainScreenKt.a((RouteDetailsComponent) this.d, (ChaloBuildConfig) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                RouteDetailsStopListHeaderKt.e((RouteUserDestinationStopUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                RouteDetailsStopListHeaderKt.d((RouteWithBookingDetailsUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                RouteDetailsStopListHeaderKt.a((RouteDetailsOptionsUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                RouteDetailsStopListHeaderKt.c((Modifier) this.b, (RouteNameAndSchemeDetailsUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                RouteSearchItemComposableKt.e((Modifier) this.b, (RouteItemUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                RouteSearchItemComposableKt.c((HeaderTextUIState) this.d, (List) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                RouteSelectionInputKt.a((RouteSelectionInputUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                RouteSelectionInputKt.c((String) this.d, (List) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                RouteSelectionInputKt.d((String) this.d, (ProductBookingRouteSpecialFeatureTagType) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                RouteTimeTableKt.b((TimeTableTimingUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                SavedPlacesAndRidesScreenKt.f((ConfirmationDialogUIState) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                int iIntValue = ((Integer) obj2).intValue();
                return SearchBarKt.DetectClickFromInteractionSource$lambda$73((InteractionSource) this.d, (Function0) this.b, this.c, (Composer) obj, iIntValue);
            case 15:
                ((Integer) obj2).intValue();
                SearchRouteItemComposableKt.b((UniversalSearchRouteSearchViewItemLayoutUiModel) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).getClass();
                SeatAvailabilityKt.a((BusEtaWithSeatAvailabilityAndBonnet) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                SeatAvailabilityKt.d((SeatAvailabilityUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                SeeMoreOrLessPickRouteComposableKt.a((String) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                SelectRideMainScreenKt.c((SelectRideViewState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 20:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SheetDefaultsKt.DragHandleWithTooltip$lambda$1((ColumnScope) this.d, (Function2) this.b, this.c, (Composer) obj, iIntValue2);
            case 21:
                ((Integer) obj2).getClass();
                ShimmerViewsKt.b((RouteEtaStatusUIState.Shimmer) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                SingleCardDetailsScreenKt.d((Modifier) this.b, (ChaloCardActivePassDetailsUiModel) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                SingleStopItemKt.c((SingleStopItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                SingleStopItemKt.e((StopNameRouteScreenUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                SingleStopItemKt.d((StopNameAndEtaUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                SingleStopItemKt.a((FromStopAndBusIconUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                SingleStopItemKt.b((StopsListBusIconUIState.IconWithBusNumber) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                SlotSelectionListMainScreenKt.a((Modifier) this.b, (SlotCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                SosScreenUIKt.c((ImageUIState) this.d, (DropDownMenuUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ k31(Object obj, Object obj2, int i, int i2) {
        this.f17461a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}

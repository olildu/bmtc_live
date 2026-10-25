package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.components.PassengerCounterKt;
import app.chalo.compose.components.noneditablesearch.NonEditableSearchFieldKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.history.compose.components.NotificationTurnOnExplainerScreenUIKt;
import app.chalo.home.ui.history.uistate.EmptyScreenUiState;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonUiState;
import app.chalo.home.ui.history.uistate.MyTicketsHeaderUiState;
import app.chalo.home.ui.history.uistate.MyTicketsLoginNudgeUIState;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.compose.PayForTicketComposableKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopsResultsSectionKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerHeaderUIState;
import app.chalo.metro.ui.regular.compose.PassengerSelectionKt;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionContainerUiState;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionItemUIState;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldComponentUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldWithSwapButtonCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchItemUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PBRouteSearchComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelUiState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapMarkerUIState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMapMarkerInfoWindowKt;
import app.chalo.productpurchase.passselection.ui.PassCategorySectionItemUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productpurchase.passselection.ui.PassPlanAnnouncementUIState;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenTypeUIState;
import app.chalo.productpurchase.passselection.ui.ProductDisabledBannerUIState;
import app.chalo.productpurchase.passselection.ui.SubCategoryBubbleUIState;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.productsummary.ui.data.TripHistoryCardUIState;
import app.chalo.productsummary.ui.pass.PassDetailUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.passengercounter.PassengerCounterUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zk0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20207a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zk0(int i, int i2, Modifier modifier, Object obj) {
        this.f20207a = i2;
        this.d = obj;
        this.b = modifier;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20207a) {
            case 0:
                ((Integer) obj2).getClass();
                MyTicketsScreenUIKt.c((Modifier) this.b, (MyTicketFloatingButtonUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                MyTicketsScreenUIKt.b((Modifier) this.b, (EmptyScreenUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                MyTicketsScreenUIKt.h((MyTicketsLoginNudgeUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                MyTicketsScreenUIKt.d((Modifier) this.b, (MyTicketsHeaderUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                MyTicketsScreenUIKt.f((Modifier) this.b, (ProductReclaimUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DrawerPredictiveBackHandler$lambda$62((DrawerState) this.b, (Function3) this.d, this.c, (Composer) obj, iIntValue);
            case 6:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationItemKt.IndicatorRipple$lambda$42((InteractionSource) this.b, (Shape) this.d, this.c, (Composer) obj, iIntValue2);
            case 7:
                ((Integer) obj2).intValue();
                NearbyStopsMapScreenKt.c((PaddingValues) this.b, (Function0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                NearbyStopsResultsSectionKt.a((Modifier) this.b, (NearbyStopResultsContainerHeaderUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                NetworkInspectorScreenKt.c((NetworkCallInfo) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                NonEditableSearchFieldKt.a((Modifier) this.b, (NonEditableSearchFieldUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                NotificationTurnOnExplainerScreenUIKt.a((Modifier) this.b, (StandardErrorScreenUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                PBProductCardComposableKt.a((Modifier) this.b, (ProductLabelUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                PBRouteSearchComposableKt.a((Modifier) this.b, (SearchFieldWithSwapButtonCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                PBRouteSearchComposableKt.b((Modifier) this.b, (SearchFieldComponentUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                PBRouteSearchComposableKt.c((Modifier) this.b, (SearchItemUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).getClass();
                PBStopDetailsMapMarkerInfoWindowKt.a((PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.c((PassSelectionScreenTypeUIState.CategorySelection) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.i((PassSelectionScreenTypeUIState.SubCategorySelection) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.d((PassCategorySelectionTabScreen) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.a((PassCategorySectionItemUIState.BookableConfigItemUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.h((SubCategoryBubbleUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.e((PassPlanAnnouncementUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                PassSelectionScreenKt.j((ProductDisabledBannerUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                PassSummarySuccessMainScreenKt.h((Modifier) this.b, (TripHistoryCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                PassSummarySuccessMainScreenKt.c((Modifier) this.b, (PassDetailUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                PassengerCounterKt.a((Modifier) this.b, (PassengerCounterUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                PassengerSelectionKt.a((Modifier) this.b, (PassengerSelectionContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).getClass();
                PassengerSelectionKt.b((Modifier) this.b, (PassengerSelectionItemUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                PayForTicketComposableKt.a((RegularBusPageDisplayItemData) this.b, (Function0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ zk0(Object obj, Object obj2, int i, int i2) {
        this.f20207a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}

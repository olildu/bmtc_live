package defpackage;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.instantticket.ui.instantticketscreen.WalletSubTextProperties;
import app.chalo.mticket.domain.MTicketFareContainer;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionContainer;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.ncmc.data.LinkCardConfig;
import app.chalo.ncmc.ui.landing.ChaloCardInfoScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.usecase.LoadMoneyFailureReason;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19123a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qi(Object obj, Object obj2, boolean z, int i) {
        this.f19123a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19123a;
        boolean z = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                LinkCardConfig linkCardConfig = (LinkCardConfig) obj3;
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, ChaloCardInfoScreenLayoutType.ALL_CARDS, null, false, linkCardConfig.c, linkCardConfig.d, linkCardConfig.b, null, false, null, false, (List) obj2, this.b, null, false, 6784767);
            case 1:
                FareDetailsIntent.InitialIntent initialIntent = (FareDetailsIntent.InitialIntent) obj3;
                String str = (String) obj2;
                FareDetailsViewState it = (FareDetailsViewState) obj;
                Intrinsics.i(it, "it");
                FareDetailsData fareDetailsData = initialIntent.f3933a;
                FareDetailsScreenType fareDetailsScreenType = initialIntent.b;
                String str2 = fareDetailsData.f8185a.f8187a;
                String str3 = fareDetailsData.b.b;
                String str4 = fareDetailsData.c.b;
                List list = fareDetailsData.d;
                List list2 = fareDetailsData.f;
                List list3 = list2 == null ? EmptyList.f17557a : list2;
                boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
                FareDetailsData fareDetailsData2 = initialIntent.f3933a;
                String str5 = fareDetailsData2.g;
                RouteNamingSchemeType routeNamingSchemeType = fareDetailsData2.h;
                fareDetailsScreenType.getClass();
                boolean z3 = !(fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket);
                return FareDetailsViewState.a(it, str2, str3, str4, false, false, false, list, null, null, false, false, str, false, fareDetailsScreenType, list3, z2, null, null, str5, routeNamingSchemeType, z3, z3, null, null, null, false, null, this.b, null, null, null, null, null, null, -1103734856, 31);
            case 2:
                InstantTicketWalletAccessState oldState = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(oldState, "oldState");
                return InstantTicketWalletAccessState.a(oldState, null, false, false, (WalletSubTextProperties) obj3, (String) obj2, this.b, null, null, false, false, null, false, false, 8135);
            case 3:
                MTicketPassengerSelectionDataState it2 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it2, "it");
                return MTicketPassengerSelectionDataState.a(it2, null, null, null, this.b, null, null, null, false, false, null, null, false, (MTicketPassengerSelectionContainer) obj3, (MTicketFareContainer) obj2, null, false, 53239);
            case 4:
                List children = (List) obj2;
                ActiveQrState activeQrState = new ActiveQrState();
                ((MultiProductValidationDataState) obj).getClass();
                Intrinsics.i(children, "children");
                return new MultiProductValidationDataState((MultiProductValidationData) obj3, children, null, activeQrState, this.b);
            case 5:
                MyTicketsDataState myTicketsDataState = (MyTicketsDataState) obj;
                Boolean bool = (Boolean) ((MyTicketsComponent) obj3).t.getG().getValue();
                bool.getClass();
                return MyTicketsDataState.a(myTicketsDataState, null, (List) obj2, null, false, false, null, null, null, null, false, null, this.b, null, false, false, bool, false, null, null, null, false, 33347579);
            case 6:
                String str6 = (String) obj2;
                OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) obj;
                String str7 = ((LoadMoneyFailureReason) ((ChaloUseCaseResult.Failure) obj3).f10418a).b;
                if (!z) {
                    str7 = null;
                }
                return OfflineCardRechargeViewState.a(offlineCardRechargeViewState, null, null, null, null, null, null, null, null, null, false, false, false, false, str7, str6, false, false, null, 2068479);
            case 7:
                return PagerKt.pagerSemantics$lambda$0(z, (PagerState) obj3, (CoroutineScope) obj2, (SemanticsPropertyReceiver) obj);
            case 8:
                PremiumReserveTicketPostBookingActionState it3 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it3, "it");
                return PremiumReserveTicketPostBookingActionState.a(it3, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.TripCancellationConfirmation((PremiumBusProductOptionsAppModel) obj3, z, (PremiumBusProductOptionsAppModel) obj2), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 9:
                return SearchBarDefaults.InputField$lambda$9$lambda$8(z, (CoroutineScope) obj3, (SearchBarState) obj2, (FocusState) obj);
            case 10:
                return SegmentedButtonKt.interactionZIndex$lambda$19$lambda$18((State) obj3, z, (Placeable) obj2, (Placeable.PlacementScope) obj);
            case 11:
                StopBasedRouteSearchViewState it4 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedRouteSearchViewState.a(it4, ((StopAppModel) obj3).b, ((StopAppModel) obj2).b, null, this.b, false, null, false, null, null, null, null, null, null, null, 16372);
            default:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, (String) obj3, (IconType) obj2, this.b, null, null, null, 29183);
        }
    }

    public /* synthetic */ qi(Object obj, boolean z, Object obj2, int i) {
        this.f19123a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ qi(boolean z, Object obj, Object obj2, int i) {
        this.f19123a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}

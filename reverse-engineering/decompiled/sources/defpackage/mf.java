package defpackage;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.MapOverlayColor;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerType;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.core.Premium_reserve_ticket_ack_tableQueries;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoAppModel;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailComponent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewIntent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionErrorDialog;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.titoridedetail.ui.TITORideDetailMapUiModel;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.components.map.PolylinePointUIState;
import app.chalo.userprofile.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18393a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mf(CardTransactionDetailViewIntent.InitializationIntent initializationIntent, CardPassPurchaseTransactionAppModel cardPassPurchaseTransactionAppModel, CardTransactionDetailComponent cardTransactionDetailComponent, String str, boolean z) {
        this.f18393a = 0;
        this.c = initializationIntent;
        this.d = cardPassPurchaseTransactionAppModel;
        this.e = cardTransactionDetailComponent;
        this.f = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18393a) {
            case 0:
                CardTransactionDetailViewIntent.InitializationIntent initializationIntent = (CardTransactionDetailViewIntent.InitializationIntent) this.c;
                CardPassPurchaseTransactionAppModel cardPassPurchaseTransactionAppModel = (CardPassPurchaseTransactionAppModel) this.d;
                CardTransactionDetailComponent cardTransactionDetailComponent = (CardTransactionDetailComponent) this.e;
                String str = (String) this.f;
                Intrinsics.i((CardTransactionDetailViewState) obj, "it");
                CardTransactionTypeUiModel cardTransactionTypeUiModel = initializationIntent.b;
                String str2 = cardPassPurchaseTransactionAppModel.f6170a;
                String strJ = cardTransactionDetailComponent.k.j(cardPassPurchaseTransactionAppModel.b);
                CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel = cardPassPurchaseTransactionAppModel.c;
                List list = cardTransactionFareInfoAppModel != null ? cardTransactionFareInfoAppModel.b : null;
                String str3 = cardPassPurchaseTransactionAppModel.d;
                String str4 = cardPassPurchaseTransactionAppModel.e;
                String str5 = cardPassPurchaseTransactionAppModel.j;
                return new CardTransactionDetailViewState(cardTransactionTypeUiModel, str2, strJ, list, str3, str4, str, cardPassPurchaseTransactionAppModel.k, str5, cardTransactionFareInfoAppModel != null ? cardTransactionDetailComponent.m.a(cardTransactionFareInfoAppModel.f6190a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING) : null, this.b, null);
            case 1:
                return MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4(this.b, (MutableTransitionState) this.c, (MutableState) this.d, (State) this.e, (State) this.f, (GraphicsLayerScope) obj);
            case 2:
                NearbyStopsMapIntent.InitializationIntent initializationIntent2 = (NearbyStopsMapIntent.InitializationIntent) this.c;
                return NearbyStopsMapState.a((NearbyStopsMapState) obj, false, initializationIntent2.f3151a, null, null, this.b, new MapCameraViewState.InitialState.CustomPosition((LatLng) this.d, 12.0f, 12), null, null, new ChaloMapOverlayConfig.AdaptiveRadius(1000.0f, (MapOverlayColor) this.e, (MapOverlayColor) this.f, IconType.MAP_CENTER_PIN), initializationIntent2.b, null, false, 25499);
            case 3:
                PremiumBusSeatSelectionIntent.InitializationIntent initializationIntent3 = (PremiumBusSeatSelectionIntent.InitializationIntent) this.c;
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = (PremiumBusSeatSelectionComponent) this.d;
                Gender gender = (Gender) this.e;
                GenderPreferenceSelectionStates genderPreferenceSelectionStates = (GenderPreferenceSelectionStates) this.f;
                PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState = (PremiumBusSeatSelectionDataState) obj;
                PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = initializationIntent3.b;
                return PremiumBusSeatSelectionDataState.a(premiumBusSeatSelectionDataState, true, premiumBusSeatSelectionFlowType, null, null, null, false, null, null, false, genderPreferenceSelectionStates, this.b ? PremiumBusSeatSelectionComponent.H0(premiumBusSeatSelectionComponent, gender, genderPreferenceSelectionStates, initializationIntent3.b) : null, gender, premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase ? 1 : null, 18293);
            case 4:
                Premium_reserve_ticket_ack_tableQueries premium_reserve_ticket_ack_tableQueries = (Premium_reserve_ticket_ack_tableQueries) this.c;
                PremiumReserveTicketAckType premiumReserveTicketAckType = (PremiumReserveTicketAckType) this.d;
                String str6 = (String) this.f;
                String str7 = (String) this.e;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.b(0, Boolean.valueOf(this.b));
                execute.bindString(1, (String) premium_reserve_ticket_ack_tableQueries.b.f1982a.encode(premiumReserveTicketAckType));
                execute.bindString(2, str6);
                execute.bindString(3, str7);
                return Unit.f17538a;
            case 5:
                SuperPass superPass = (SuperPass) this.c;
                String str8 = (String) this.f;
                String str9 = (String) this.d;
                BookableSuperPassConfiguration bookableSuperPassConfiguration = (BookableSuperPassConfiguration) this.e;
                ProductSelectionDataState it = (ProductSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return ProductSelectionDataState.a(it, null, false, false, null, new ProductSelectionErrorDialog.SuperPassRenewError(this.b, superPass, str8, str9, bookableSuperPassConfiguration), false, null, null, null, 991);
            case 6:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$0((Ref.LongRef) this.c, (TextFieldSelectionState) this.d, this.b, (Handle) this.e, (Ref.LongRef) this.f, (Offset) obj);
            default:
                TitoRideDetailsComponent titoRideDetailsComponent = (TitoRideDetailsComponent) this.c;
                RouteAppModel routeAppModel = (RouteAppModel) this.d;
                LatLngBounds latLngBounds = (LatLngBounds) this.e;
                StopAppModel stopAppModel = (StopAppModel) this.f;
                TitoRideDetailsViewState titoRideDetailsViewState = (TitoRideDetailsViewState) obj;
                titoRideDetailsComponent.getClass();
                String str10 = routeAppModel.m;
                List list2 = routeAppModel.e;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((StopAppModel) it2.next()).c);
                }
                TITORideDetailMapUiModel tITORideDetailMapUiModel = new TITORideDetailMapUiModel(CollectionsKt.R(new PolylinePointUIState(MapUtilsKt.a(str10, titoRideDetailsComponent.z, arrayList), ChaloColorToken.Black.f9759a, PolylinePointUIState.d)), this.b, new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(latLngBounds, 340)));
                String str11 = routeAppModel.b;
                Intrinsics.i(list2, "<this>");
                int iIndexOf = list2.indexOf(stopAppModel);
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj2 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    StopAppModel stopAppModel2 = (StopAppModel) obj2;
                    if (i == 0) {
                        arrayList2.add(titoRideDetailsComponent.N0(str11, stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.c, ChaloMapMarkerType.START_STOP, false));
                    } else if (i == list2.size() - 1) {
                        arrayList2.add(titoRideDetailsComponent.N0(str11, stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.c, ChaloMapMarkerType.END_STOP, false));
                    } else if (i == iIndexOf) {
                        arrayList2.add(titoRideDetailsComponent.N0(str11, stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.c, ChaloMapMarkerType.STOP_SELECTED, true));
                    } else {
                        arrayList2.add(titoRideDetailsComponent.N0(str11, stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.c, ChaloMapMarkerType.STOP, false));
                    }
                    i = i2;
                }
                return TitoRideDetailsViewState.a(titoRideDetailsViewState, null, null, null, false, tITORideDetailMapUiModel, arrayList2, null, null, 0.0d, false, 1951);
        }
    }

    public /* synthetic */ mf(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.f18393a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ mf(Object obj, boolean z, Object obj2, Enum r4, Enum r5, int i) {
        this.f18393a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = r4;
        this.f = r5;
    }

    public /* synthetic */ mf(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2) {
        this.f18393a = 1;
        this.b = z;
        this.c = mutableTransitionState;
        this.d = mutableState;
        this.e = state;
        this.f = state2;
    }

    public /* synthetic */ mf(boolean z, Premium_reserve_ticket_ack_tableQueries premium_reserve_ticket_ack_tableQueries, PremiumReserveTicketAckType premiumReserveTicketAckType, String str, String str2) {
        this.f18393a = 4;
        this.b = z;
        this.c = premium_reserve_ticket_ack_tableQueries;
        this.d = premiumReserveTicketAckType;
        this.f = str;
        this.e = str2;
    }

    public /* synthetic */ mf(boolean z, SuperPass superPass, String str, String str2, BookableSuperPassConfiguration bookableSuperPassConfiguration) {
        this.f18393a = 5;
        this.b = z;
        this.c = superPass;
        this.f = str;
        this.d = str2;
        this.e = bookableSuperPassConfiguration;
    }
}

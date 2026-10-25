package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.datastore.preferences.core.Preferences;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.constants.Source;
import app.chalo.core.Multi_modal_group_ticket_child_table;
import app.chalo.core.Multi_modal_group_ticket_child_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.Recent_place_tableQueries;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.core.Recent_stop_tableQueries;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl;
import app.chalo.home.data.model.app.response.CorridorAppModel;
import app.chalo.home.data.model.app.response.CorridorRouteInfoAppModel;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeComponent$changeTab$$inlined$bringToFront$default$2;
import app.chalo.home.ui.base.HomeComponent$changeTab$$inlined$replaceAll$default$2;
import app.chalo.home.ui.base.HomeScreenBottomTabConfiguration;
import app.chalo.home.ui.base.HomeScreenBottomTabConfigurationKt;
import app.chalo.home.ui.base.HomeScreenConfigLayoutType;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.chalobus.ChaloBusPageDisplayItemData;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoErrorType;
import app.chalo.home.ui.chalobusrouteinfo.CorridorUiModel;
import app.chalo.home.ui.chalobusrouteinfo.RouteUiModel;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsPageErrorImage;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetData;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetNegativeCtaType;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetPositiveCtaType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModelKt;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsBottomSheetType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.kyc.min.ui.minkycotp.KycErrorBottomSheetData;
import app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycScreenBottomSheetType;
import app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.options.LoginOptionsCountry;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.login.ui.options.LoginOptionsIntent;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.ui.transactionhistory.compose.ComposableSingletons$ChaloCardTransactionsScreenKt;
import app.chalo.ondc.model.app.response.OndcBookingAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImageType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImagesDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarState;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.slotselection.SelectedPassInfo;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionErrorDialog;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.decompose.router.stack.DefaultStackNavigation;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.JobKt;
import okio.BufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18448a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n3(LazyPagingItems lazyPagingItems, CardTransactionHistoryViewState cardTransactionHistoryViewState, Function0 function0, Function1 function1) {
        this.f18448a = 3;
        this.c = lazyPagingItems;
        this.e = cardTransactionHistoryViewState;
        this.d = function0;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v10, types: [app.chalo.homescreen.data.model.app.NavigationTabAppModel] */
    /* JADX WARN: Type inference failed for: r2v26, types: [app.chalo.homescreen.data.model.app.NavigationTabAppModel] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [T, app.chalo.homescreen.data.model.app.NavigationTabAppModel] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v78 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        LazyListScope lazyListScope;
        CombinedLoadStates loadState;
        Object objA;
        int i = this.f18448a;
        int i2 = 10;
        Unit unit = Unit.f17538a;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                return AnchoredDraggableState.Companion.Saver$lambda$1((Function1) obj5, (Function0) obj3, (Function0) obj2, (Function1) obj4, obj);
            case 1:
                List list = (List) obj4;
                ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType = (ChaloBusRouteInfoErrorType) obj3;
                ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = (ChaloBusRouteInfoComponent) obj2;
                ChaloBusRouteInfoDataState chaloBusRouteInfoDataState = (ChaloBusRouteInfoDataState) obj;
                List<CorridorAppModel> list2 = (List) obj5;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (CorridorAppModel corridorAppModel : list2) {
                    chaloBusRouteInfoComponent.getClass();
                    String str = corridorAppModel.f2959a;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str + CLConstants.SALT_DELIMETER + corridorAppModel.b + CLConstants.SALT_DELIMETER + corridorAppModel.c;
                    String str3 = corridorAppModel.f2959a;
                    String str4 = corridorAppModel.b;
                    String str5 = corridorAppModel.c;
                    List<CorridorRouteInfoAppModel> list3 = corridorAppModel.d;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                    for (CorridorRouteInfoAppModel corridorRouteInfoAppModel : list3) {
                        arrayList2.add(new RouteUiModel(corridorRouteInfoAppModel.d, corridorRouteInfoAppModel.e, corridorRouteInfoAppModel.f, corridorRouteInfoAppModel.f2961a, corridorRouteInfoAppModel.b, corridorRouteInfoAppModel.c));
                    }
                    arrayList.add(new CorridorUiModel(str2, str3, str4, str5, arrayList2));
                }
                return ChaloBusRouteInfoDataState.a(chaloBusRouteInfoDataState, null, false, null, null, list, arrayList, null, chaloBusRouteInfoErrorType, null, 269);
            case 2:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj4;
                ChaloBusPageDisplayItemData chaloBusPageDisplayItemData = (ChaloBusPageDisplayItemData) obj3;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj2;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                if (Dp.m7277compareTo0680j_4(((Density) obj5).mo401toDpu2uoSUM((int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    String str6 = chaloBusPageDisplayItemData.b;
                    Boolean bool = Boolean.TRUE;
                    snapshotStateMap.put(str6, bool);
                    snapshotStateMap2.put(chaloBusPageDisplayItemData.b, bool);
                } else {
                    String str7 = chaloBusPageDisplayItemData.b;
                    Boolean bool2 = Boolean.FALSE;
                    snapshotStateMap.put(str7, bool2);
                    snapshotStateMap2.put(chaloBusPageDisplayItemData.b, bool2);
                }
                return unit;
            case 3:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj4;
                CardTransactionHistoryViewState cardTransactionHistoryViewState = (CardTransactionHistoryViewState) obj2;
                Function0 function0 = (Function0) obj3;
                Function1 function1 = (Function1) obj5;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                if (!(((lazyPagingItems == null || (loadState = lazyPagingItems.getLoadState()) == null) ? null : loadState.getRefresh()) instanceof LoadState.NotLoading)) {
                    lazyListScope = LazyColumn;
                } else if (lazyPagingItems.getItemCount() == 0) {
                    lazyListScope = LazyColumn;
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-423383921, true, new ob(6, cardTransactionHistoryViewState, function0, function1)), 3, null);
                } else {
                    lazyListScope = LazyColumn;
                    g0 g0Var = new g0(function1, 24);
                    String str8 = cardTransactionHistoryViewState.e;
                    ii iiVar = new ii(function1, 22);
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableSingletons$ChaloCardTransactionsScreenKt.f6441a, 3, null);
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableSingletons$ChaloCardTransactionsScreenKt.b, 3, null);
                    if (str8 != null) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1456893020, true, new d0(i2, str8, iiVar)), 3, null);
                    }
                    LazyListScope.CC.o(lazyListScope, lazyPagingItems.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(431346734, true, new rb(2, lazyPagingItems, g0Var)), 6, null);
                    if (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Loading) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableSingletons$ChaloCardTransactionsScreenKt.c, 3, null);
                    }
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1306598497, true, new gj(function0, 0)), 3, null);
                }
                LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(294648857, true, new ob(5, lazyPagingItems, cardTransactionHistoryViewState, function1)), 3, null);
                return unit;
            case 4:
                return PostPaymentDataState.a((PostPaymentDataState) obj, false, null, new PaymentStatusAlertDetails((String) obj5, (String) obj4, null, (IconType) obj3, (String) obj2, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 196), 2);
            case 5:
                return CoreTextFieldKt.CoreTextField$lambda$22$0((LegacyTextFieldState) obj5, (TextInputService) obj4, (TextFieldValue) obj3, (ImeOptions) obj2, (DisposableEffectScope) obj);
            case 6:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, (String) obj4, false, false, null, false, null, (List) obj3, false, null, (FareDetailsBottomSheetType) obj2, null, null, false, false, null, ((OndcBookingAppModel) ((ChaloUseCaseResult.Success) ((ChaloUseCaseResult) obj5)).f10419a).f6779a, null, false, null, false, null, null, null, null, null, null, -67404049, 31);
            case 7:
                HomeScreenFragmentViewState it2 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it2, "it");
                return HomeScreenFragmentViewState.a(it2, null, (NavigationTabAppModel) obj4, (HomeScreenConfigAppModel) obj3, (String) obj2, null, null, CityProviderKt.b(((HomeComponent) obj5).m), HomeScreenConfigLayoutType.SUCCESS, null, null, null, null, false, 31973);
            case 8:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj4;
                HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj3;
                HomeComponent homeComponent = (HomeComponent) obj2;
                HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj;
                ?? r2 = homeScreenFragmentViewState.f3225a;
                NavigationTabAppModel navigationTabAppModel = homeScreenFragmentViewState.b;
                Iterator it3 = ((HomeScreenConfigAppModel) obj5).c.iterator();
                while (true) {
                    NavigationTabAppModel navigationTabAppModel2 = navigationTabAppModel;
                    do {
                        if (!it3.hasNext()) {
                            if (r2 != 0 && !(r2 instanceof NavigationTabAppModel.SearchTab)) {
                                DefaultStackNavigation defaultStackNavigation = homeComponent.Q0;
                                BottomNavTabType bottomNavTabTypeA = BottomNavTabAppModelKt.a(r2);
                                final HomeScreenBottomTabConfiguration homeScreenBottomTabConfigurationA = HomeScreenBottomTabConfigurationKt.a(bottomNavTabTypeA);
                                if (homeScreenBottomTabConfigurationA == null) {
                                    throw new IllegalStateException((bottomNavTabTypeA + " not supported for bottom tab navigation").toString());
                                }
                                HomeScreenBottomTabConfiguration homeScreenBottomTabConfiguration = (HomeScreenBottomTabConfiguration) ((ChildStack) homeComponent.b1.a()).f12382a.f12283a;
                                if (homeScreenBottomTabConfigurationA.getClass() != homeScreenBottomTabConfiguration.getClass()) {
                                    if (homeScreenBottomTabConfiguration.equals(HomeScreenBottomTabConfiguration.HomeTab.INSTANCE) || homeScreenBottomTabConfiguration.equals(HomeScreenBottomTabConfiguration.RegularBusTab.INSTANCE) || homeScreenBottomTabConfiguration.equals(HomeScreenBottomTabConfiguration.ChaloBusTab.INSTANCE) || homeScreenBottomTabConfiguration.equals(HomeScreenBottomTabConfiguration.MyTicketsTab.INSTANCE)) {
                                        defaultStackNavigation.b(new Function1<List<? extends HomeScreenBottomTabConfiguration>, List<? extends HomeScreenBottomTabConfiguration>>() { // from class: app.chalo.home.ui.base.HomeComponent$changeTab$$inlined$bringToFront$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                List stack = (List) obj6;
                                                Intrinsics.i(stack, "stack");
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it4 = stack.iterator();
                                                while (true) {
                                                    boolean zHasNext = it4.hasNext();
                                                    HomeScreenBottomTabConfiguration homeScreenBottomTabConfiguration2 = homeScreenBottomTabConfigurationA;
                                                    if (!zHasNext) {
                                                        return CollectionsKt.d0(homeScreenBottomTabConfiguration2, arrayList3);
                                                    }
                                                    Object next = it4.next();
                                                    if (next.getClass() != homeScreenBottomTabConfiguration2.getClass()) {
                                                        arrayList3.add(next);
                                                    }
                                                }
                                            }
                                        }, new HomeComponent$changeTab$$inlined$bringToFront$default$2());
                                    } else {
                                        if (!homeScreenBottomTabConfiguration.equals(HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        final HomeScreenBottomTabConfiguration[] homeScreenBottomTabConfigurationArr = {homeScreenBottomTabConfigurationA};
                                        defaultStackNavigation.b(new Function1<List<? extends HomeScreenBottomTabConfiguration>, List<? extends HomeScreenBottomTabConfiguration>>() { // from class: app.chalo.home.ui.base.HomeComponent$changeTab$$inlined$replaceAll$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                List it4 = (List) obj6;
                                                Intrinsics.i(it4, "it");
                                                return ArraysKt.h0(homeScreenBottomTabConfigurationArr);
                                            }
                                        }, new HomeComponent$changeTab$$inlined$replaceAll$default$2());
                                    }
                                }
                            }
                            objectRef.element = r2;
                            return HomeScreenFragmentViewState.a(homeScreenFragmentViewState, r2, navigationTabAppModel2, null, null, null, null, null, null, null, null, null, null, false, 32764);
                        }
                        navigationTabAppModel = (NavigationTabAppModel) it3.next();
                        if (BottomNavTabAppModelKt.a(navigationTabAppModel) == homeTabScreensRetainedState.f3175a) {
                            r2 = r2;
                            r2 = navigationTabAppModel;
                        }
                        r2 = r2;
                    } while (BottomNavTabAppModelKt.a(navigationTabAppModel) != homeTabScreensRetainedState.b);
                }
                break;
            case 9:
                return LazyLayoutKt.LazyLayout$lambda$1$2$0((LazyLayoutPrefetchState) obj5, (LazyLayoutItemContentFactory) obj4, (SubcomposeLayoutState) obj3, (PrefetchScheduler) obj2, (DisposableEffectScope) obj);
            case 10:
                CountryPhoneNumberConfig countryPhoneNumberConfig = (CountryPhoneNumberConfig) obj3;
                LoginAfterCitySelectionRemoteConfigModel loginAfterCitySelectionRemoteConfigModel = (LoginAfterCitySelectionRemoteConfigModel) obj2;
                LoginOptionsDataState loginOptionsDataState = (LoginOptionsDataState) obj;
                Source source = ((LoginOptionsIntent.InitializationIntent) obj5).f5305a;
                List<CountryPhoneNumberConfig> list4 = (List) ((LoginOptionsComponent) obj4).Q.getValue();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list4, 10));
                for (CountryPhoneNumberConfig countryPhoneNumberConfig2 : list4) {
                    arrayList3.add(new LoginOptionsCountry(countryPhoneNumberConfig2.f1937a, countryPhoneNumberConfig2.b, countryPhoneNumberConfig2.c));
                }
                return LoginOptionsDataState.a(loginOptionsDataState, null, countryPhoneNumberConfig, null, false, null, false, null, source, loginAfterCitySelectionRemoteConfigModel, arrayList3, false, false, 26237);
            case 11:
                MTicketPassengerSelectionDataState it4 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it4, "it");
                return MTicketPassengerSelectionDataState.a(it4, (ProductBookingRouteDetails) obj5, (ProductBookingStopDetails) obj4, (ProductBookingStopDetails) obj3, false, null, null, (Source) obj2, false, false, null, null, false, null, null, null, false, 65208);
            case 12:
                MinKycOtpDataState it5 = (MinKycOtpDataState) obj;
                Intrinsics.i(it5, "it");
                return MinKycOtpDataState.a(it5, null, new KycErrorBottomSheetData((String) obj5, (String) obj4, (String) obj3, (KycErrorPositiveCtaType) obj2), null, false, false, 0L, false, null, null, null, MinKycScreenBottomSheetType.GENERAL_ERROR, null, 12267);
            case 13:
                return MouseWheelScrollingLogic.animateMouseWheelScroll$lambda$0((Ref.FloatRef) obj4, (MouseWheelScrollingLogic) obj3, (NestedScrollScope) obj2, (Function1) obj5, (AnimationScope) obj);
            case 14:
                MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl = (MultiModalGroupTicketDaoImpl) obj5;
                MultiModalGroupTicketEntity multiModalGroupTicketEntity = (MultiModalGroupTicketEntity) obj4;
                List list5 = (List) obj3;
                List list6 = (List) obj2;
                String str9 = multiModalGroupTicketEntity.f5792a;
                Multi_modal_group_ticket_child_tableQueries multi_modal_group_ticket_child_tableQueries = multiModalGroupTicketDaoImpl.b;
                Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries = multiModalGroupTicketDaoImpl.f2055a;
                List listB = multi_modal_group_ticket_child_tableQueries.Y(str9).b();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : listB) {
                    int i4 = i3;
                    if (Intrinsics.d(((Multi_modal_group_ticket_child_table) obj6).e, "instantTicket")) {
                        arrayList4.add(obj6);
                    }
                    i3 = i4;
                }
                int i5 = i3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
                int size = arrayList4.size();
                while (i3 < size) {
                    Object obj7 = arrayList4.get(i3);
                    i3++;
                    arrayList5.add(((Multi_modal_group_ticket_child_table) obj7).c);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : listB) {
                    if (Intrinsics.d(((Multi_modal_group_ticket_child_table) obj8).e, "ondcMetroTicket")) {
                        arrayList6.add(obj8);
                    }
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(arrayList6, 10));
                int size2 = arrayList6.size();
                int i6 = i5;
                while (i6 < size2) {
                    Object obj9 = arrayList6.get(i6);
                    i6++;
                    arrayList7.add(((Multi_modal_group_ticket_child_table) obj9).c);
                }
                if (!arrayList5.isEmpty()) {
                    multiModalGroupTicketDaoImpl.c.W(arrayList5);
                }
                if (!arrayList7.isEmpty()) {
                    multiModalGroupTicketDaoImpl.d.W(arrayList7);
                }
                multi_modal_group_ticket_child_tableQueries.f697a.A0(818650045, "DELETE FROM multi_modal_group_ticket_child_table\nWHERE groupId = ?", new hj0(str9, 1));
                multi_modal_group_ticket_child_tableQueries.T(818650045, new lj0(15));
                multi_modal_group_ticket_tableQueries.getClass();
                multi_modal_group_ticket_tableQueries.f697a.A0(1641921492, "DELETE FROM multi_modal_group_ticket_table\nWHERE groupId = ?", new hj0(str9, 2));
                multi_modal_group_ticket_tableQueries.T(1641921492, new lj0(22));
                for (MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity : multiModalGroupTicketEntity.s) {
                    multiModalGroupTicketDaoImpl.b.a0(new Multi_modal_group_ticket_child_table(multiModalGroupTicketChildEntity.f5791a, multiModalGroupTicketChildEntity.c, multiModalGroupTicketChildEntity.d, multiModalGroupTicketChildEntity.e, multiModalGroupTicketChildEntity.b));
                }
                multi_modal_group_ticket_tableQueries.Z(MultiModalGroupTicketDaoImpl.i(multiModalGroupTicketDaoImpl, multiModalGroupTicketEntity));
                MultiModalGroupTicketDaoImpl.h(multiModalGroupTicketDaoImpl, list5, list6);
                return unit;
            case 15:
                MyTicketsDataState it6 = (MyTicketsDataState) obj;
                Intrinsics.i(it6, "it");
                return MyTicketsDataState.a(it6, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.PRODUCT_USE, (String) obj5, "", (String) obj4, (String) obj3), null, null, (ChaloUserBookingType) obj2, TicketsPageInfoBottomSheetPositiveCtaType.TICKET_USE, TicketsPageInfoBottomSheetNegativeCtaType.PRODUCT_USE, 6), null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 16:
                HttpRequestData httpRequestData = (HttpRequestData) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) obj2;
                try {
                    ((Ref.IntRef) obj5).element = ((BufferedSource) obj4).read((ByteBuffer) obj);
                    return unit;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    try {
                        objA = JobKt.f(coroutineContext).u0();
                        break;
                    } catch (Throwable th3) {
                        objA = ResultKt.a(th3);
                    }
                    CancellationException cancellationException = (CancellationException) (objA instanceof Result.Failure ? null : objA);
                    if (cancellationException != null) {
                        th2 = cancellationException;
                    }
                    if (th2 instanceof SocketTimeoutException) {
                        throw HttpTimeoutKt.a(httpRequestData, (IOException) th2);
                    }
                    throw th2;
                }
            case 17:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails((String) obj5, (String) obj4, (LottieType) obj3, null, (String) obj2, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200)), null, false, false, false, null, false, null, 2096119);
            case 18:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails((String) obj5, (String) obj4, LottieType.PAYMENT_FAILED_ERROR, null, (String) obj3, (PaymentStatusCTAActionType) ((Ref.ObjectRef) obj2).element, null, null, 200)), null, false, false, false, null, false, null, 2096127);
            case 19:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) obj5);
                execute.bindString(1, (String) obj4);
                execute.bindString(2, (String) obj3);
                execute.bindString(3, (String) obj2);
                return unit;
            case 20:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.d(0, (Long) obj5);
                execute2.bindString(1, (String) obj4);
                execute2.bindString(2, (String) obj3);
                execute2.bindString(3, (String) obj2);
                return unit;
            case 21:
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, false, null, null, (List) obj5, (Map) obj4, (Long) obj3, null, (String) obj2, null, null, null, null, null, false, false, 32583);
            case 22:
                PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState = (PremiumBusSeatSelectionDataState) obj;
                ((PremiumBusSeatSelectionComponent) obj3).getClass();
                return PremiumBusSeatSelectionDataState.a(premiumBusSeatSelectionDataState, false, null, (ArrayList) obj5, null, (List) obj4, false, null, null, PremiumBusSeatSelectionComponent.M0((ArrayList) obj2), null, null, null, null, 64429);
            case 23:
                PremiumBusSlotSelectionIntent.SlotClickedIntent slotClickedIntent = (PremiumBusSlotSelectionIntent.SlotClickedIntent) obj4;
                PremiumBusSlotSelectionDataState it7 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusSlotSelectionDataState.a(it7, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.ViewAllSlots(((PBSlotSelectionScreenBottomSheetType.ViewAllSlots) obj5).f7826a, slotClickedIntent.f7886a, ((PremiumBusSlotSelectionComponent) obj3).n.getP(), (List) obj2, slotClickedIntent.b), null, null, slotClickedIntent.f7886a, slotClickedIntent.b, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -801);
            case 24:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(new MultipleSlotSelectionCalendarState.LoadingState(vo1.n(((PremiumBusSlotSelectionComponent) obj5).q.e(((PBAvailableSlotsTripAppModel) obj4).g), " ", (String) obj3))), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, (SelectedPassInfo) obj2, null, null, null, -268435489);
            case 25:
                String str10 = ((PremiumStopDetailsAppModel) obj5).f7121a;
                PBStopImageType.FetchInProgress fetchInProgress = PBStopImageType.FetchInProgress.f7399a;
                return PremiumReserveTicketPostBookingActionState.a((PremiumReserveTicketPostBookingActionState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CollectionsKt.R(new PBStopImagesDetails(str10, (String) obj4, fetchInProgress)), CollectionsKt.R(new PBStopImagesDetails(((PremiumStopDetailsAppModel) obj3).f7121a, (String) obj2, fetchInProgress)), null, null, null, null, false, null, false, null, null, null, null, null, null, -6291457, 31);
            case 26:
                ProductSelectionDataState it8 = (ProductSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return ProductSelectionDataState.a(it8, null, false, false, null, new ProductSelectionErrorDialog.SuperPassRenewError(false, (SuperPass) obj5, (String) obj4, (String) obj3, (BookableSuperPassConfiguration) obj2), false, null, null, null, 991);
            case 27:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, (String) ((Recent_place_tableQueries) obj5).b.b.encode((RecentsSpecialEntityStatus) obj4));
                execute3.bindString(1, (String) obj3);
                execute3.bindString(2, (String) obj2);
                return unit;
            case 28:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, (String) ((Recent_route_tableQueries) obj5).b.c.encode((RecentsSpecialEntityStatus) obj4));
                execute4.bindString(1, (String) obj3);
                execute4.bindString(2, (String) obj2);
                return unit;
            default:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, (String) ((Recent_stop_tableQueries) obj5).b.b.encode((RecentsSpecialEntityStatus) obj4));
                execute5.bindString(1, (String) obj3);
                execute5.bindString(2, (String) obj2);
                return unit;
        }
    }

    public /* synthetic */ n3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18448a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ n3(Function0 function0, Function1 function1, Function1 function2, Function0 function3) {
        this.f18448a = 0;
        this.b = function1;
        this.d = function0;
        this.e = function3;
        this.c = function2;
    }

    public /* synthetic */ n3(Ref.FloatRef floatRef, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, Function1 function1) {
        this.f18448a = 13;
        this.c = floatRef;
        this.d = mouseWheelScrollingLogic;
        this.e = nestedScrollScope;
        this.b = function1;
    }
}

package app.chalo.mticket.ui.passengerselection;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.ProductPurchaseMinProfileDecision;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.mticket.domain.CalculateMTicketFareUseCase;
import app.chalo.mticket.domain.CreateMTicketOrderUseCase;
import app.chalo.mticket.domain.FetchMTicketFareBetweenStopsUseCase;
import app.chalo.mticket.domain.MTicketFareContainer;
import app.chalo.mticket.domain.MTicketFareFetchResult;
import app.chalo.mticket.domain.MTicketOrderCreationResult;
import app.chalo.mticket.ui.MTicketSjtConfigSelectorKt;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareBreakdownResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.KUUID;
import app.chalo.utils.MobileTicketingConverters;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.ag0;
import defpackage.gd0;
import defpackage.n3;
import defpackage.qi;
import defpackage.t60;
import defpackage.tg0;
import defpackage.ud;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionDataState;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionUIState;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketPassengerSelectionComponent extends ChaloBaseStateMviComponent<MTicketPassengerSelectionIntent, MTicketPassengerSelectionDataState, MTicketPassengerSelectionUIState, MTicketPassengerSelectionEffect> {
    public static final Preferences.Key D = PreferencesKeys.booleanKey("isTermsAndConditionSeen");
    public final MobileTicketingConverters A;
    public final MTicketPassengerSelectionUIStateFactory B;
    public final ProductPurchaseMinProfileDecisionHelper C;
    public final MTicketSelectionArgs k;
    public final ProductPurchaseRepository l;
    public final AnalyticsContract m;
    public final FetchProductConfigsUseCase n;
    public final FetchMTicketFareBetweenStopsUseCase o;
    public final TicketRepository p;
    public final CalculateMTicketFareUseCase q;
    public final LocalDataStore r;
    public final KotlinToastManager s;
    public final StringProvider t;
    public final CreateMTicketOrderUseCase u;
    public final MTicketUtilsHelper v;
    public final ChaloNavigationManager w;
    public final ResolveProductPurchaseMinProfileDecisionUseCase x;
    public final MinProfileUpdateResultStateManager y;
    public final UserProfileDetailsProvider z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionComponent$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "isTncSeen", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "MTICKET_TNC_DATASTORE_NAME", "Ljava/lang/String;", "STATE_KEEPER_KEY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MTicketPassengerSelectionComponent(MTicketSelectionArgs mTicketSelectionArgs, ComponentContext componentContext, ProductPurchaseRepository productPurchaseRepository, AnalyticsContract analyticsContract, FetchProductConfigsUseCase fetchProductConfigsUseCase, FetchMTicketFareBetweenStopsUseCase fetchMTicketFareBetweenStopsUseCase, TicketRepository ticketRepository, CalculateMTicketFareUseCase calculateMTicketFareUseCase, LocalDataStore localDataStore, KotlinToastManager kotlinToastManager, StringProvider stringProvider, CreateMTicketOrderUseCase createMTicketOrderUseCase, MTicketUtilsHelper mTicketUtilsHelper, ChaloNavigationManager chaloNavigationManager, ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, UserProfileDetailsProvider userProfileDetailsProvider, MobileTicketingConverters mobileTicketingConverters, MTicketPassengerSelectionUIStateFactory mTicketPassengerSelectionUIStateFactory, ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper, MinProfileAnalyticsHelper minProfileAnalyticsHelper) {
        super(componentContext);
        this.k = mTicketSelectionArgs;
        this.l = productPurchaseRepository;
        this.m = analyticsContract;
        this.n = fetchProductConfigsUseCase;
        this.o = fetchMTicketFareBetweenStopsUseCase;
        this.p = ticketRepository;
        this.q = calculateMTicketFareUseCase;
        this.r = localDataStore;
        this.s = kotlinToastManager;
        this.t = stringProvider;
        this.u = createMTicketOrderUseCase;
        this.v = mTicketUtilsHelper;
        this.w = chaloNavigationManager;
        this.x = resolveProductPurchaseMinProfileDecisionUseCase;
        this.y = minProfileUpdateResultStateManager;
        this.z = userProfileDetailsProvider;
        this.A = mobileTicketingConverters;
        this.B = mTicketPassengerSelectionUIStateFactory;
        this.C = productPurchaseMinProfileDecisionHelper;
        StateKeeper b = componentContext.getB();
        MTicketPassengerSelectionRestoredState.Companion companion = MTicketPassengerSelectionRestoredState.INSTANCE;
        MTicketPassengerSelectionRestoredState mTicketPassengerSelectionRestoredState = (MTicketPassengerSelectionRestoredState) b.a("mticket_passenger_selection_component", companion.serializer());
        componentContext.getB().d("mticket_passenger_selection_component", companion.serializer(), new gd0(this, 9));
        if (mTicketPassengerSelectionRestoredState != null) {
            N0(new MTicketPassengerSelectionIntent.RestoreFromProcessDeathIntent(mTicketPassengerSelectionRestoredState));
            return;
        }
        Json json = ChaloJson.b;
        String str = mTicketSelectionArgs.b;
        json.getClass();
        ProductBookingRouteDetails productBookingRouteDetails = (ProductBookingRouteDetails) json.b(str, ProductBookingRouteDetails.INSTANCE.serializer());
        String str2 = mTicketSelectionArgs.c;
        ProductBookingStopDetails.Companion companion2 = ProductBookingStopDetails.INSTANCE;
        N0(new MTicketPassengerSelectionIntent.InitialisationIntent(productBookingRouteDetails, (ProductBookingStopDetails) json.b(str2, companion2.serializer()), (ProductBookingStopDetails) json.b(mTicketSelectionArgs.d, companion2.serializer()), mTicketSelectionArgs.e, mTicketSelectionArgs.f));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object F0(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, ContinuationImpl continuationImpl) throws Throwable {
        MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1 mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1;
        mTicketPassengerSelectionComponent.getClass();
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1) {
            mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1 = (MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1 = new MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1(mTicketPassengerSelectionComponent, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1 = new MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1(mTicketPassengerSelectionComponent, continuationImpl);
        }
        MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1 mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2 = mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$1;
        Object objA = mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase = mTicketPassengerSelectionComponent.x;
            Source source = Source.MTICKET_SELECTION_ACTIVITY;
            String ruleId = UserProfilingHookSlot.MTICKET_MIN_PROFILE_FLOW.getRuleId();
            mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.label = 1;
            objA = resolveProductPurchaseMinProfileDecisionUseCase.a(source, ruleId, mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.label = 3;
            if (mTicketPassengerSelectionComponent.J0(mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2) == obj) {
                return obj;
            }
        }
        return unit;
        String strA = KUUID.a();
        ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper = mTicketPassengerSelectionComponent.C;
        Source source2 = Source.MTICKET_SELECTION_ACTIVITY;
        t60 t60Var = new t60(19, mTicketPassengerSelectionComponent, strA);
        MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$canProceed$2 mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$canProceed$2 = new MTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$canProceed$2(mTicketPassengerSelectionComponent, strA, null);
        mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.label = 2;
        objA = productPurchaseMinProfileDecisionHelper.a((ProductPurchaseMinProfileDecision) objA, source2, t60Var, mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$canProceed$2, mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2);
        if (objA != obj) {
            if (((Boolean) objA).booleanValue()) {
                mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2.label = 3;
                if (mTicketPassengerSelectionComponent.J0(mTicketPassengerSelectionComponent$attemptOrderCreationWithMinProfileGate$2) == obj) {
                }
            }
            return unit;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object G0(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, String str, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, Source source, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$performInitialisation$1 mTicketPassengerSelectionComponent$performInitialisation$1;
        ProductBookingStopDetails productBookingStopDetails3;
        ProductBookingStopDetails productBookingStopDetails4;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2;
        mTicketPassengerSelectionComponent.getClass();
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$performInitialisation$1) {
            mTicketPassengerSelectionComponent$performInitialisation$1 = (MTicketPassengerSelectionComponent$performInitialisation$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$performInitialisation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$performInitialisation$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$performInitialisation$1 = new MTicketPassengerSelectionComponent$performInitialisation$1(mTicketPassengerSelectionComponent, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$performInitialisation$1 = new MTicketPassengerSelectionComponent$performInitialisation$1(mTicketPassengerSelectionComponent, continuationImpl);
        }
        Object objL0 = mTicketPassengerSelectionComponent$performInitialisation$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$performInitialisation$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objL0);
            productBookingStopDetails3 = productBookingStopDetails;
            productBookingStopDetails4 = productBookingStopDetails2;
            mTicketPassengerSelectionComponent.E0(new n3(productBookingRouteDetails, productBookingStopDetails3, productBookingStopDetails4, source, 11));
            String str2 = productBookingRouteDetails.c;
            mTicketPassengerSelectionComponent$performInitialisation$1.L$0 = productBookingRouteDetails;
            mTicketPassengerSelectionComponent$performInitialisation$1.L$1 = productBookingStopDetails3;
            mTicketPassengerSelectionComponent$performInitialisation$1.L$2 = productBookingStopDetails4;
            mTicketPassengerSelectionComponent$performInitialisation$1.L$3 = mTicketPassengerSelectionContainer;
            mTicketPassengerSelectionComponent$performInitialisation$1.label = 1;
            objL0 = mTicketPassengerSelectionComponent.L0(str, str2, mTicketPassengerSelectionComponent$performInitialisation$1);
            if (objL0 != obj) {
                mTicketPassengerSelectionContainer2 = mTicketPassengerSelectionContainer;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL0);
            return unit;
        }
        mTicketPassengerSelectionContainer2 = (MTicketPassengerSelectionContainer) mTicketPassengerSelectionComponent$performInitialisation$1.L$3;
        ProductBookingStopDetails productBookingStopDetails5 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$performInitialisation$1.L$2;
        ProductBookingStopDetails productBookingStopDetails6 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$performInitialisation$1.L$1;
        ProductBookingRouteDetails productBookingRouteDetails2 = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$performInitialisation$1.L$0;
        ResultKt.b(objL0);
        productBookingStopDetails4 = productBookingStopDetails5;
        productBookingStopDetails3 = productBookingStopDetails6;
        productBookingRouteDetails = productBookingRouteDetails2;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) objL0;
        if (singleJourneyTicketAppModel == null) {
            mTicketPassengerSelectionComponent.E0(new ag0(19));
            return unit;
        }
        mTicketPassengerSelectionComponent.E0(new tg0(singleJourneyTicketAppModel, 0));
        mTicketPassengerSelectionComponent.E0(new tg0(singleJourneyTicketAppModel, 1));
        MTicketPassengerSelectionContainer.Companion companion = MTicketPassengerSelectionContainer.INSTANCE;
        ArrayList arrayList = singleJourneyTicketAppModel.z;
        companion.getClass();
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainerA = MTicketPassengerSelectionContainer.Companion.a(mTicketPassengerSelectionContainer2, arrayList);
        mTicketPassengerSelectionComponent$performInitialisation$1.L$0 = null;
        mTicketPassengerSelectionComponent$performInitialisation$1.L$1 = null;
        mTicketPassengerSelectionComponent$performInitialisation$1.L$2 = null;
        mTicketPassengerSelectionComponent$performInitialisation$1.L$3 = null;
        mTicketPassengerSelectionComponent$performInitialisation$1.label = 2;
        return mTicketPassengerSelectionComponent.K0(singleJourneyTicketAppModel, productBookingRouteDetails, productBookingStopDetails3, productBookingStopDetails4, mTicketPassengerSelectionContainerA, mTicketPassengerSelectionComponent$performInitialisation$1) == obj ? obj : unit;
    }

    public static Object S0(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, ContinuationImpl continuationImpl) {
        return mTicketPassengerSelectionComponent.R0(mTicketPassengerSelectionContainer, ((MTicketPassengerSelectionDataState) mTicketPassengerSelectionComponent.f.getValue()).k, continuationImpl);
    }

    public final void H0(LinkedHashMap linkedHashMap, ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, MTicketFareContainer mTicketFareContainer, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2) {
        Map map = mTicketFareContainer.f5726a.h;
        this.A.getClass();
        linkedHashMap.put("passengerTypes", MobileTicketingConverters.j(map));
        MTicketUtilsHelper helper = this.v;
        Intrinsics.i(helper, "helper");
        MTicket mTicket = mTicketFareContainer.f5726a;
        linkedHashMap.put("fare", Double.valueOf(helper.i(mTicket)));
        linkedHashMap.put("city", singleJourneyTicketAppModel.k);
        linkedHashMap.put("agency", singleJourneyTicketAppModel.t);
        linkedHashMap.put("upTripRouteId", productBookingRouteDetails.f8194a);
        linkedHashMap.put("upTripStartStopId", productBookingStopDetails.f8199a);
        linkedHashMap.put("upTripEndStopId", productBookingStopDetails2.f8199a);
        Boolean bool = mTicket.s;
        linkedHashMap.put("isFreeRide", String.valueOf(bool != null ? bool.booleanValue() : false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(String str, List list, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1 mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1;
        double dDoubleValue;
        double dDoubleValue2;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1) {
            mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1 = (MTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1 = new MTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1 = new MTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1(this, continuationImpl);
        }
        Object objH = mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.L$0 = list;
            mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.label = 1;
            objH = this.p.h(str, mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) mTicketPassengerSelectionComponent$checkIfFaresChangedFromLastTime$1.L$0;
            ResultKt.b(objH);
        }
        MTicket mTicket = (MTicket) objH;
        if (mTicket == null) {
            return Boolean.FALSE;
        }
        List list2 = list;
        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj : list2) {
            linkedHashMap.put(((MTicketPassengerFareResponseAppModel) obj).f8636a, obj);
        }
        for (Map.Entry entry : mTicket.h.entrySet()) {
            String str2 = (String) entry.getKey();
            MTicketPassengerInfo mTicketPassengerInfo = (MTicketPassengerInfo) entry.getValue();
            MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel = (MTicketPassengerFareResponseAppModel) linkedHashMap.get(str2);
            if (mTicketPassengerFareResponseAppModel != null) {
                Double d = mTicketPassengerInfo.b;
                if (d == null || Double.isNaN(d.doubleValue())) {
                    double d2 = 100;
                    dDoubleValue = mTicketPassengerInfo.f5621a * ((d2 - mTicketPassengerInfo.c) / d2);
                } else {
                    dDoubleValue = d.doubleValue();
                }
                double d3 = mTicketPassengerFareResponseAppModel.b;
                Double d4 = mTicketPassengerFareResponseAppModel.c;
                double d5 = mTicketPassengerFareResponseAppModel.d;
                MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel = mTicketPassengerFareResponseAppModel.e;
                if (mTicketPassengerFareBreakdownResponseAppModel != null) {
                    MapsKt.u(mTicketPassengerFareBreakdownResponseAppModel.f8635a);
                }
                if (mTicketPassengerFareBreakdownResponseAppModel != null) {
                    MapsKt.u(mTicketPassengerFareBreakdownResponseAppModel.b);
                }
                if (d4 == null || Double.isNaN(d4.doubleValue())) {
                    double d6 = 100;
                    dDoubleValue2 = ((d6 - d5) / d6) * d3;
                } else {
                    dDoubleValue2 = d4.doubleValue();
                }
                if (dDoubleValue2 != dDoubleValue) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0255  */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0291  */
    /* JADX WARN: Code duplicated, block: B:110:0x0323  */
    /* JADX WARN: Code duplicated, block: B:112:0x032d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0348  */
    /* JADX WARN: Code duplicated, block: B:118:0x0357  */
    /* JADX WARN: Code duplicated, block: B:120:0x035b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0365  */
    /* JADX WARN: Code duplicated, block: B:124:0x037d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x037e  */
    /* JADX WARN: Code duplicated, block: B:129:0x039e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0202  */
    /* JADX WARN: Code duplicated, block: B:84:0x022b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0234  */
    /* JADX WARN: Code duplicated, block: B:89:0x0238  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x024d  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final Object J0(ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$createOrderAndNavigate$1 mTicketPassengerSelectionComponent$createOrderAndNavigate$1;
        char c;
        KotlinToastManager kotlinToastManager;
        Object obj;
        int i;
        Object objA;
        MTicketFareContainer mTicketFareContainer;
        ProductBookingRouteDetails productBookingRouteDetails;
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel;
        MTicketOrderCreationResult mTicketOrderCreationResult;
        ProductBookingRouteDetails productBookingRouteDetails2;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel2;
        MTicketFareContainer mTicketFareContainer2;
        boolean z;
        StringProvider stringProvider;
        String str;
        Object objB;
        MTicketFareContainer mTicketFareContainer3;
        ProductBookingStopDetails productBookingStopDetails3;
        ProductBookingRouteDetails productBookingRouteDetails3;
        ProductBookingStopDetails productBookingStopDetails4;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        ProductBookingRouteDetails productBookingRouteDetails4;
        int i2;
        ?? r14;
        ProductBookingRouteDetails productBookingRouteDetails5;
        MTicketOrderCreationResult mTicketOrderCreationResult2;
        UserProfileAppModel userProfileAppModel;
        String str2;
        String str3;
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC;
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA;
        String str4;
        String str5;
        String str6;
        String str7;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig;
        String str8;
        String str9;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$createOrderAndNavigate$1) {
            mTicketPassengerSelectionComponent$createOrderAndNavigate$1 = (MTicketPassengerSelectionComponent$createOrderAndNavigate$1) continuationImpl;
            int i3 = mTicketPassengerSelectionComponent$createOrderAndNavigate$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$createOrderAndNavigate$1.label = i3 - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$createOrderAndNavigate$1 = new MTicketPassengerSelectionComponent$createOrderAndNavigate$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$createOrderAndNavigate$1 = new MTicketPassengerSelectionComponent$createOrderAndNavigate$1(this, continuationImpl);
        }
        MTicketPassengerSelectionComponent$createOrderAndNavigate$1 mTicketPassengerSelectionComponent$createOrderAndNavigate$2 = mTicketPassengerSelectionComponent$createOrderAndNavigate$1;
        Object objL = mTicketPassengerSelectionComponent$createOrderAndNavigate$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label;
        char c2 = 5;
        KotlinToastManager kotlinToastManager3 = this.s;
        Unit unit = Unit.f17538a;
        switch (i4) {
            case 0:
                ResultKt.b(objL);
                StateFlow stateFlow = this.f;
                MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState = (MTicketPassengerSelectionDataState) stateFlow.getValue();
                MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1 mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1 = new MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1(this, null);
                ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel3 = mTicketPassengerSelectionDataState.f;
                if (singleJourneyTicketAppModel3 == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 1;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                MTicketFareContainer mTicketFareContainer4 = mTicketPassengerSelectionDataState.n;
                if (mTicketFareContainer4 == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 2;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                ProductBookingRouteDetails productBookingRouteDetails6 = mTicketPassengerSelectionDataState.f5743a;
                if (productBookingRouteDetails6 == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 3;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                ProductBookingStopDetails productBookingStopDetails5 = mTicketPassengerSelectionDataState.b;
                if (productBookingStopDetails5 == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 4;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                ProductBookingStopDetails productBookingStopDetails6 = mTicketPassengerSelectionDataState.c;
                if (productBookingStopDetails6 == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 5;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                MTicketFareResponseAppModel mTicketFareResponseAppModel = mTicketPassengerSelectionDataState.k;
                if (mTicketFareResponseAppModel == null) {
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 6;
                    if (mTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1.invoke(mTicketPassengerSelectionComponent$createOrderAndNavigate$2) != coroutineSingletons) {
                        return unit;
                    }
                } else {
                    E0(new ag0(26));
                    Source source = ((MTicketPassengerSelectionDataState) stateFlow.getValue()).g;
                    if (source == null) {
                        source = Source.MTICKET_SELECTION_ACTIVITY;
                    }
                    Source source2 = source;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c = 2;
                    H0(linkedHashMap, singleJourneyTicketAppModel3, mTicketFareContainer4, productBookingRouteDetails6, productBookingStopDetails5, productBookingStopDetails6);
                    AnalyticsContractImplKt.b(this.m, "mticket pay button clicked", source2, linkedHashMap, false, 24);
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = singleJourneyTicketAppModel3;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketFareContainer4;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = productBookingRouteDetails6;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = productBookingStopDetails5;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = productBookingStopDetails6;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 7;
                    kotlinToastManager = kotlinToastManager3;
                    obj = null;
                    i = 6;
                    objA = this.u.a(singleJourneyTicketAppModel3, mTicketFareContainer4, productBookingRouteDetails6, productBookingStopDetails5, productBookingStopDetails6, mTicketFareResponseAppModel, mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                    mTicketFareContainer = mTicketFareContainer4;
                    if (objA != coroutineSingletons) {
                        productBookingRouteDetails = productBookingRouteDetails6;
                        productBookingStopDetails = productBookingStopDetails5;
                        productBookingStopDetails2 = productBookingStopDetails6;
                        singleJourneyTicketAppModel = singleJourneyTicketAppModel3;
                        mTicketOrderCreationResult = (MTicketOrderCreationResult) objA;
                        E0(new ag0(27));
                        if (mTicketOrderCreationResult instanceof MTicketOrderCreationResult.Success) {
                            CreateOrderResponseAppModel createOrderResponseAppModel = ((MTicketOrderCreationResult.Success) mTicketOrderCreationResult).f5732a;
                            productBookingRouteDetails4 = productBookingRouteDetails;
                            i2 = i;
                            r14 = 0;
                            O0(singleJourneyTicketAppModel, mTicketFareContainer, productBookingRouteDetails4, productBookingStopDetails, productBookingStopDetails2, true, createOrderResponseAppModel.f, createOrderResponseAppModel.g);
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = productBookingRouteDetails4;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketOrderCreationResult;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = obj;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = obj;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = obj;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 8;
                            objL = this.z.l(mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                            if (objL != coroutineSingletons) {
                                productBookingRouteDetails5 = productBookingRouteDetails4;
                                mTicketOrderCreationResult2 = mTicketOrderCreationResult;
                                userProfileAppModel = (UserProfileAppModel) objL;
                                CreateOrderResponseAppModel orderData = ((MTicketOrderCreationResult.Success) mTicketOrderCreationResult2).f5732a;
                                String agencyName = productBookingRouteDetails5.c;
                                if (userProfileAppModel != null || (str2 = userProfileAppModel.i) == null) {
                                    str2 = "";
                                }
                                if (userProfileAppModel != null || (str3 = userProfileAppModel.e) == null) {
                                    str3 = "";
                                }
                                Intrinsics.i(orderData, "orderData");
                                Intrinsics.i(agencyName, "agencyName");
                                providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData);
                                merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData);
                                String str10 = orderData.f;
                                String str11 = orderData.g;
                                String str12 = orderData.b;
                                String strValueOf = String.valueOf(orderData.f5638a);
                                String str13 = orderData.d;
                                String str14 = orderData.e;
                                if (providerConfigAppModelC != null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) {
                                    str4 = null;
                                } else {
                                    str4 = orderPaymentProviderCustomerDetailsAppModel.f5646a;
                                }
                                if (providerConfigAppModelC != null) {
                                    str5 = providerConfigAppModelC.f;
                                } else {
                                    str5 = null;
                                }
                                if (providerConfigAppModelC != null || (str9 = providerConfigAppModelC.g) == null) {
                                    str6 = "";
                                } else {
                                    str6 = str9;
                                }
                                if (providerConfigAppModelC != null || (str8 = providerConfigAppModelC.h) == null) {
                                    str7 = "";
                                } else {
                                    str7 = str8;
                                }
                                CheckoutOrderData checkoutOrderData = new CheckoutOrderData(str10, str11, strValueOf, str13, str14, str4, str5, str12, str6, str7, null);
                                CheckoutUserDetails checkoutUserDetails = new CheckoutUserDetails(str3, str2);
                                String lowerCase = agencyName.toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = orderData.h;
                                if (merchantUPIConfigAppModelA != null) {
                                    checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
                                } else {
                                    checkoutPaymentProviderVpaConfig = null;
                                }
                                CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(checkoutOrderData, checkoutUserDetails, lowerCase, orderPaymentProviderInfoAppModel, checkoutPaymentProviderVpaConfig);
                                CheckoutProductType checkoutProductType = CheckoutProductType.M_TICKET;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Pair pair = new Pair("bookingId", str12);
                                Pair pair2 = new Pair(PaymentConstants.ORDER_ID_CAMEL, str10);
                                Pair pair3 = new Pair("chaloOrderId", str11);
                                Pair pair4 = new Pair("paymentMode", CustomTabsCallback.ONLINE_EXTRAS_KEY);
                                Pair pair5 = new Pair("productType", checkoutProductType.getType());
                                Pair pair6 = new Pair("productSubType", checkoutProductType.getType());
                                Pair[] pairArr = new Pair[i2];
                                pairArr[r14] = pair;
                                pairArr[1] = pair2;
                                pairArr[c] = pair3;
                                pairArr[3] = pair4;
                                pairArr[4] = pair5;
                                pairArr[c2] = pair6;
                                linkedHashMap2.putAll(MapsKt.i(pairArr));
                                CheckoutIntentModel checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, r14, new CheckoutAnalyticsData("Confirm Mticket Screen", linkedHashMap2)));
                                String strA = KUUID.a();
                                Json json = ChaloJson.b;
                                json.getClass();
                                ChaloNavigationManagerKt.e(this.w, new CheckoutPaymentMainArgs(strA, json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel)), null, i2);
                                return unit;
                            }
                        } else {
                            productBookingRouteDetails2 = productBookingRouteDetails;
                            singleJourneyTicketAppModel2 = singleJourneyTicketAppModel;
                            mTicketFareContainer2 = mTicketFareContainer;
                            z = mTicketOrderCreationResult instanceof MTicketOrderCreationResult.GeneralError;
                            stringProvider = this.t;
                            if (z) {
                                if (mTicketOrderCreationResult instanceof MTicketOrderCreationResult.ServerError) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = ((MTicketOrderCreationResult.ServerError) mTicketOrderCreationResult).f5731a;
                                if (str.length() == 0) {
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = singleJourneyTicketAppModel2;
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketFareContainer2;
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = productBookingRouteDetails2;
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = productBookingStopDetails;
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = productBookingStopDetails2;
                                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 10;
                                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                                    if (objB != coroutineSingletons) {
                                        ProductBookingStopDetails productBookingStopDetails7 = productBookingStopDetails2;
                                        mTicketFareContainer3 = mTicketFareContainer2;
                                        productBookingStopDetails3 = productBookingStopDetails7;
                                        ProductBookingStopDetails productBookingStopDetails8 = productBookingStopDetails;
                                        productBookingRouteDetails3 = productBookingRouteDetails2;
                                        productBookingStopDetails4 = productBookingStopDetails8;
                                        str = (String) objB;
                                        MTicketFareContainer mTicketFareContainer5 = mTicketFareContainer3;
                                        productBookingStopDetails2 = productBookingStopDetails3;
                                        mTicketFareContainer2 = mTicketFareContainer5;
                                        ProductBookingRouteDetails productBookingRouteDetails7 = productBookingRouteDetails3;
                                        productBookingStopDetails = productBookingStopDetails4;
                                        productBookingRouteDetails2 = productBookingRouteDetails7;
                                    }
                                }
                                KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
                                O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                                return unit;
                            }
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = singleJourneyTicketAppModel2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketFareContainer2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = productBookingRouteDetails2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = productBookingStopDetails;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = productBookingStopDetails2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$5 = kotlinToastManager;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 9;
                            objB2 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                            if (objB2 != coroutineSingletons) {
                                kotlinToastManager2 = kotlinToastManager;
                                objL = objB2;
                                KotlinToastManagerKt.a(kotlinToastManager2, (String) objL, ToastLength.LONG);
                                O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(objL);
                return unit;
            case 2:
                ResultKt.b(objL);
                return unit;
            case 3:
                ResultKt.b(objL);
                return unit;
            case 4:
                ResultKt.b(objL);
                return unit;
            case 5:
                ResultKt.b(objL);
                return unit;
            case 6:
                ResultKt.b(objL);
                return unit;
            case 7:
                ProductBookingStopDetails productBookingStopDetails9 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4;
                ProductBookingStopDetails productBookingStopDetails10 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3;
                productBookingRouteDetails = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2;
                mTicketFareContainer = (MTicketFareContainer) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1;
                singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0;
                ResultKt.b(objL);
                c = 2;
                i = 6;
                objA = objL;
                obj = null;
                productBookingStopDetails = productBookingStopDetails10;
                kotlinToastManager = kotlinToastManager3;
                productBookingStopDetails2 = productBookingStopDetails9;
                mTicketOrderCreationResult = (MTicketOrderCreationResult) objA;
                E0(new ag0(27));
                if (mTicketOrderCreationResult instanceof MTicketOrderCreationResult.Success) {
                    CreateOrderResponseAppModel createOrderResponseAppModel2 = ((MTicketOrderCreationResult.Success) mTicketOrderCreationResult).f5732a;
                    productBookingRouteDetails4 = productBookingRouteDetails;
                    i2 = i;
                    r14 = 0;
                    O0(singleJourneyTicketAppModel, mTicketFareContainer, productBookingRouteDetails4, productBookingStopDetails, productBookingStopDetails2, true, createOrderResponseAppModel2.f, createOrderResponseAppModel2.g);
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = productBookingRouteDetails4;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketOrderCreationResult;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = obj;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = obj;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = obj;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 8;
                    objL = this.z.l(mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                    if (objL != coroutineSingletons) {
                        productBookingRouteDetails5 = productBookingRouteDetails4;
                        mTicketOrderCreationResult2 = mTicketOrderCreationResult;
                        userProfileAppModel = (UserProfileAppModel) objL;
                        CreateOrderResponseAppModel orderData2 = ((MTicketOrderCreationResult.Success) mTicketOrderCreationResult2).f5732a;
                        String agencyName2 = productBookingRouteDetails5.c;
                        if (userProfileAppModel != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        if (userProfileAppModel != null) {
                            str3 = "";
                        } else {
                            str3 = "";
                        }
                        Intrinsics.i(orderData2, "orderData");
                        Intrinsics.i(agencyName2, "agencyName");
                        providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData2);
                        merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData2);
                        String str15 = orderData2.f;
                        String str16 = orderData2.g;
                        String str17 = orderData2.b;
                        String strValueOf2 = String.valueOf(orderData2.f5638a);
                        String str18 = orderData2.d;
                        String str19 = orderData2.e;
                        if (providerConfigAppModelC != null) {
                            str4 = null;
                        } else {
                            str4 = null;
                        }
                        if (providerConfigAppModelC != null) {
                            str5 = providerConfigAppModelC.f;
                        } else {
                            str5 = null;
                        }
                        if (providerConfigAppModelC != null) {
                            str6 = "";
                        } else {
                            str6 = "";
                        }
                        if (providerConfigAppModelC != null) {
                            str7 = "";
                        } else {
                            str7 = "";
                        }
                        CheckoutOrderData checkoutOrderData2 = new CheckoutOrderData(str15, str16, strValueOf2, str18, str19, str4, str5, str17, str6, str7, null);
                        CheckoutUserDetails checkoutUserDetails2 = new CheckoutUserDetails(str3, str2);
                        String lowerCase2 = agencyName2.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase2, "toLowerCase(...)");
                        OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel2 = orderData2.h;
                        if (merchantUPIConfigAppModelA != null) {
                            checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
                        } else {
                            checkoutPaymentProviderVpaConfig = null;
                        }
                        CheckoutPaymentData checkoutPaymentData2 = new CheckoutPaymentData(checkoutOrderData2, checkoutUserDetails2, lowerCase2, orderPaymentProviderInfoAppModel2, checkoutPaymentProviderVpaConfig);
                        CheckoutProductType checkoutProductType2 = CheckoutProductType.M_TICKET;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        Pair pair7 = new Pair("bookingId", str17);
                        Pair pair8 = new Pair(PaymentConstants.ORDER_ID_CAMEL, str15);
                        Pair pair9 = new Pair("chaloOrderId", str16);
                        Pair pair10 = new Pair("paymentMode", CustomTabsCallback.ONLINE_EXTRAS_KEY);
                        Pair pair11 = new Pair("productType", checkoutProductType2.getType());
                        Pair pair12 = new Pair("productSubType", checkoutProductType2.getType());
                        Pair[] pairArr2 = new Pair[i2];
                        pairArr2[r14] = pair7;
                        pairArr2[1] = pair8;
                        pairArr2[c] = pair9;
                        pairArr2[3] = pair10;
                        pairArr2[4] = pair11;
                        pairArr2[c2] = pair12;
                        linkedHashMap3.putAll(MapsKt.i(pairArr2));
                        CheckoutIntentModel checkoutIntentModel2 = new CheckoutIntentModel(checkoutPaymentData2, new CheckoutProductData(checkoutProductType2, r14, new CheckoutAnalyticsData("Confirm Mticket Screen", linkedHashMap3)));
                        String strA2 = KUUID.a();
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        ChaloNavigationManagerKt.e(this.w, new CheckoutPaymentMainArgs(strA2, json2.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel2)), null, i2);
                        return unit;
                    }
                } else {
                    productBookingRouteDetails2 = productBookingRouteDetails;
                    singleJourneyTicketAppModel2 = singleJourneyTicketAppModel;
                    mTicketFareContainer2 = mTicketFareContainer;
                    z = mTicketOrderCreationResult instanceof MTicketOrderCreationResult.GeneralError;
                    stringProvider = this.t;
                    if (z) {
                        if (mTicketOrderCreationResult instanceof MTicketOrderCreationResult.ServerError) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((MTicketOrderCreationResult.ServerError) mTicketOrderCreationResult).f5731a;
                        if (str.length() == 0) {
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = singleJourneyTicketAppModel2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketFareContainer2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = productBookingRouteDetails2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = productBookingStopDetails;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = productBookingStopDetails2;
                            mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 10;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                            if (objB != coroutineSingletons) {
                                ProductBookingStopDetails productBookingStopDetails11 = productBookingStopDetails2;
                                mTicketFareContainer3 = mTicketFareContainer2;
                                productBookingStopDetails3 = productBookingStopDetails11;
                                ProductBookingStopDetails productBookingStopDetails12 = productBookingStopDetails;
                                productBookingRouteDetails3 = productBookingRouteDetails2;
                                productBookingStopDetails4 = productBookingStopDetails12;
                                str = (String) objB;
                                MTicketFareContainer mTicketFareContainer6 = mTicketFareContainer3;
                                productBookingStopDetails2 = productBookingStopDetails3;
                                mTicketFareContainer2 = mTicketFareContainer6;
                                ProductBookingRouteDetails productBookingRouteDetails8 = productBookingRouteDetails3;
                                productBookingStopDetails = productBookingStopDetails4;
                                productBookingRouteDetails2 = productBookingRouteDetails8;
                            }
                        }
                        KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
                        O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                        return unit;
                    }
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0 = singleJourneyTicketAppModel2;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1 = mTicketFareContainer2;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2 = productBookingRouteDetails2;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3 = productBookingStopDetails;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4 = productBookingStopDetails2;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$5 = kotlinToastManager;
                    mTicketPassengerSelectionComponent$createOrderAndNavigate$2.label = 9;
                    objB2 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketPassengerSelectionComponent$createOrderAndNavigate$2);
                    if (objB2 != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager;
                        objL = objB2;
                        KotlinToastManagerKt.a(kotlinToastManager2, (String) objL, ToastLength.LONG);
                        O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 8:
                mTicketOrderCreationResult2 = (MTicketOrderCreationResult) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1;
                productBookingRouteDetails5 = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0;
                ResultKt.b(objL);
                c = 2;
                c2 = 5;
                i2 = 6;
                r14 = 0;
                userProfileAppModel = (UserProfileAppModel) objL;
                CreateOrderResponseAppModel orderData3 = ((MTicketOrderCreationResult.Success) mTicketOrderCreationResult2).f5732a;
                String agencyName3 = productBookingRouteDetails5.c;
                if (userProfileAppModel != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                if (userProfileAppModel != null) {
                    str3 = "";
                } else {
                    str3 = "";
                }
                Intrinsics.i(orderData3, "orderData");
                Intrinsics.i(agencyName3, "agencyName");
                providerConfigAppModelC = CheckoutIntentModelHelperKt.c(orderData3);
                merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(orderData3);
                String str110 = orderData3.f;
                String str111 = orderData3.g;
                String str112 = orderData3.b;
                String strValueOf3 = String.valueOf(orderData3.f5638a);
                String str113 = orderData3.d;
                String str114 = orderData3.e;
                if (providerConfigAppModelC != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (providerConfigAppModelC != null) {
                    str5 = providerConfigAppModelC.f;
                } else {
                    str5 = null;
                }
                if (providerConfigAppModelC != null) {
                    str6 = "";
                } else {
                    str6 = "";
                }
                if (providerConfigAppModelC != null) {
                    str7 = "";
                } else {
                    str7 = "";
                }
                CheckoutOrderData checkoutOrderData3 = new CheckoutOrderData(str110, str111, strValueOf3, str113, str114, str4, str5, str112, str6, str7, null);
                CheckoutUserDetails checkoutUserDetails3 = new CheckoutUserDetails(str3, str2);
                String lowerCase3 = agencyName3.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase3, "toLowerCase(...)");
                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel3 = orderData3.h;
                if (merchantUPIConfigAppModelA != null) {
                    checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
                } else {
                    checkoutPaymentProviderVpaConfig = null;
                }
                CheckoutPaymentData checkoutPaymentData3 = new CheckoutPaymentData(checkoutOrderData3, checkoutUserDetails3, lowerCase3, orderPaymentProviderInfoAppModel3, checkoutPaymentProviderVpaConfig);
                CheckoutProductType checkoutProductType3 = CheckoutProductType.M_TICKET;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Pair pair13 = new Pair("bookingId", str112);
                Pair pair14 = new Pair(PaymentConstants.ORDER_ID_CAMEL, str110);
                Pair pair15 = new Pair("chaloOrderId", str111);
                Pair pair16 = new Pair("paymentMode", CustomTabsCallback.ONLINE_EXTRAS_KEY);
                Pair pair17 = new Pair("productType", checkoutProductType3.getType());
                Pair pair18 = new Pair("productSubType", checkoutProductType3.getType());
                Pair[] pairArr3 = new Pair[i2];
                pairArr3[r14] = pair13;
                pairArr3[1] = pair14;
                pairArr3[c] = pair15;
                pairArr3[3] = pair16;
                pairArr3[4] = pair17;
                pairArr3[c2] = pair18;
                linkedHashMap4.putAll(MapsKt.i(pairArr3));
                CheckoutIntentModel checkoutIntentModel3 = new CheckoutIntentModel(checkoutPaymentData3, new CheckoutProductData(checkoutProductType3, r14, new CheckoutAnalyticsData("Confirm Mticket Screen", linkedHashMap4)));
                String strA3 = KUUID.a();
                Json json3 = ChaloJson.b;
                json3.getClass();
                ChaloNavigationManagerKt.e(this.w, new CheckoutPaymentMainArgs(strA3, json3.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel3)), null, i2);
                return unit;
            case 9:
                kotlinToastManager2 = (KotlinToastManager) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$5;
                ProductBookingStopDetails productBookingStopDetails13 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4;
                ProductBookingStopDetails productBookingStopDetails14 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3;
                ProductBookingRouteDetails productBookingRouteDetails9 = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2;
                MTicketFareContainer mTicketFareContainer7 = (MTicketFareContainer) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1;
                singleJourneyTicketAppModel2 = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0;
                ResultKt.b(objL);
                productBookingStopDetails2 = productBookingStopDetails13;
                mTicketFareContainer2 = mTicketFareContainer7;
                productBookingStopDetails = productBookingStopDetails14;
                productBookingRouteDetails2 = productBookingRouteDetails9;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objL, ToastLength.LONG);
                O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                return unit;
            case 10:
                productBookingStopDetails3 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$4;
                productBookingStopDetails4 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$3;
                productBookingRouteDetails3 = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$2;
                mTicketFareContainer3 = (MTicketFareContainer) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$1;
                singleJourneyTicketAppModel2 = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) mTicketPassengerSelectionComponent$createOrderAndNavigate$2.L$0;
                ResultKt.b(objL);
                objB = objL;
                kotlinToastManager = kotlinToastManager3;
                str = (String) objB;
                MTicketFareContainer mTicketFareContainer8 = mTicketFareContainer3;
                productBookingStopDetails2 = productBookingStopDetails3;
                mTicketFareContainer2 = mTicketFareContainer8;
                ProductBookingRouteDetails productBookingRouteDetails10 = productBookingRouteDetails3;
                productBookingStopDetails = productBookingStopDetails4;
                productBookingRouteDetails2 = productBookingRouteDetails10;
                KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
                O0(singleJourneyTicketAppModel2, mTicketFareContainer2, productBookingRouteDetails2, productBookingStopDetails, productBookingStopDetails2, false, null, null);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object K0(ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$fetchFares$1 mTicketPassengerSelectionComponent$fetchFares$1;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel2;
        ProductBookingRouteDetails productBookingRouteDetails2;
        ProductBookingStopDetails productBookingStopDetails3;
        ProductBookingStopDetails productBookingStopDetails4;
        boolean z;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel3;
        MTicketFareFetchResult mTicketFareFetchResult;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$fetchFares$1) {
            mTicketPassengerSelectionComponent$fetchFares$1 = (MTicketPassengerSelectionComponent$fetchFares$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$fetchFares$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$fetchFares$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$fetchFares$1 = new MTicketPassengerSelectionComponent$fetchFares$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$fetchFares$1 = new MTicketPassengerSelectionComponent$fetchFares$1(this, continuationImpl);
        }
        MTicketPassengerSelectionComponent$fetchFares$1 mTicketPassengerSelectionComponent$fetchFares$2 = mTicketPassengerSelectionComponent$fetchFares$1;
        Object obj = mTicketPassengerSelectionComponent$fetchFares$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$fetchFares$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            E0(new ag0(18));
            singleJourneyTicketAppModel2 = singleJourneyTicketAppModel;
            mTicketPassengerSelectionComponent$fetchFares$2.L$0 = singleJourneyTicketAppModel2;
            productBookingRouteDetails2 = productBookingRouteDetails;
            mTicketPassengerSelectionComponent$fetchFares$2.L$1 = productBookingRouteDetails2;
            productBookingStopDetails3 = productBookingStopDetails;
            mTicketPassengerSelectionComponent$fetchFares$2.L$2 = productBookingStopDetails3;
            productBookingStopDetails4 = productBookingStopDetails2;
            mTicketPassengerSelectionComponent$fetchFares$2.L$3 = productBookingStopDetails4;
            mTicketPassengerSelectionComponent$fetchFares$2.label = 1;
            if (S0(this, mTicketPassengerSelectionContainer, mTicketPassengerSelectionComponent$fetchFares$2) != obj2) {
            }
        }
        if (i2 == 1) {
            ProductBookingStopDetails productBookingStopDetails5 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$fetchFares$2.L$3;
            productBookingStopDetails3 = (ProductBookingStopDetails) mTicketPassengerSelectionComponent$fetchFares$2.L$2;
            ProductBookingRouteDetails productBookingRouteDetails3 = (ProductBookingRouteDetails) mTicketPassengerSelectionComponent$fetchFares$2.L$1;
            ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel4 = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) mTicketPassengerSelectionComponent$fetchFares$2.L$0;
            ResultKt.b(obj);
            productBookingStopDetails4 = productBookingStopDetails5;
            productBookingRouteDetails2 = productBookingRouteDetails3;
            singleJourneyTicketAppModel2 = singleJourneyTicketAppModel4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            singleJourneyTicketAppModel3 = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) mTicketPassengerSelectionComponent$fetchFares$2.L$0;
            ResultKt.b(obj);
            z = true;
        }
        mTicketFareFetchResult = (MTicketFareFetchResult) obj;
        if (!(mTicketFareFetchResult instanceof MTicketFareFetchResult.GeneralError) || (mTicketFareFetchResult instanceof MTicketFareFetchResult.ServerError)) {
            AnalyticsContractImplKt.b(this.m, "mticket fare fetched", Source.MTICKET_SELECTION_ACTIVITY, vo1.s("response", String.valueOf(false)), false, 24);
            E0(new ag0(21));
            return unit;
        }
        if (!(mTicketFareFetchResult instanceof MTicketFareFetchResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContractImplKt.b(this.m, "mticket fare fetched", Source.MTICKET_SELECTION_ACTIVITY, vo1.s("response", String.valueOf(z)), false, 24);
        MTicketFareResponseAppModel mTicketFareResponseAppModel = ((MTicketFareFetchResult.Success) mTicketFareFetchResult).f5729a;
        mTicketPassengerSelectionComponent$fetchFares$2.L$0 = 0;
        mTicketPassengerSelectionComponent$fetchFares$2.label = 3;
        return M0(mTicketFareResponseAppModel, singleJourneyTicketAppModel3, mTicketPassengerSelectionComponent$fetchFares$2) == obj2 ? obj2 : unit;
        String str = singleJourneyTicketAppModel2.k;
        String str2 = productBookingRouteDetails2.c;
        String str3 = productBookingRouteDetails2.f8194a;
        String str4 = productBookingRouteDetails2.b;
        String str5 = productBookingStopDetails3.f8199a;
        String str6 = productBookingStopDetails3.b;
        String str7 = productBookingStopDetails4.f8199a;
        String str8 = productBookingStopDetails4.b;
        List list = productBookingRouteDetails2.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBookingSpecialFeature) it.next()).f8197a);
        }
        mTicketPassengerSelectionComponent$fetchFares$2.L$0 = singleJourneyTicketAppModel2;
        mTicketPassengerSelectionComponent$fetchFares$2.L$1 = null;
        mTicketPassengerSelectionComponent$fetchFares$2.L$2 = null;
        mTicketPassengerSelectionComponent$fetchFares$2.L$3 = null;
        mTicketPassengerSelectionComponent$fetchFares$2.label = 2;
        z = true;
        Object objA = this.o.a(str, str2, str3, str4, str5, str6, str7, str8, arrayList, mTicketPassengerSelectionComponent$fetchFares$2);
        if (objA != obj2) {
            singleJourneyTicketAppModel3 = singleJourneyTicketAppModel2;
            obj = objA;
            mTicketFareFetchResult = (MTicketFareFetchResult) obj;
            if (mTicketFareFetchResult instanceof MTicketFareFetchResult.GeneralError) {
            }
            AnalyticsContractImplKt.b(this.m, "mticket fare fetched", Source.MTICKET_SELECTION_ACTIVITY, vo1.s("response", String.valueOf(false)), false, 24);
            E0(new ag0(21));
            return unit;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(String str, String str2, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1 mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1;
        String str3;
        String str4;
        Object objP0;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1) {
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1 = (MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1 = new MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1 = new MTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1(this, continuationImpl);
        }
        Object objQ0 = mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objQ0);
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0 = str;
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1 = str2;
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label = 1;
            objQ0 = str != null ? Q0(str, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1) : P0(str2, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1);
            if (objQ0 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str2 = (String) mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1;
            str = (String) mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0;
            ResultKt.b(objQ0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objQ0);
                return objQ0;
            }
            str4 = (String) mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1;
            str3 = (String) mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0;
            ResultKt.b(objQ0);
        }
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0 = null;
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1 = null;
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label = 3;
        if (str3 != null) {
            objP0 = Q0(str3, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1);
        } else {
            objP0 = P0(str4, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1);
        }
        if (objP0 != obj) {
            return obj;
        }
        return objP0;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) objQ0;
        if (singleJourneyTicketAppModel != null) {
            return singleJourneyTicketAppModel;
        }
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0 = str;
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1 = str2;
        mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label = 2;
        if (this.n.a(mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1) != obj) {
            String str5 = str2;
            str3 = str;
            str4 = str5;
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$0 = null;
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.L$1 = null;
            mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1.label = 3;
            if (str3 != null) {
                objP0 = Q0(str3, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1);
            } else {
                objP0 = P0(str4, mTicketPassengerSelectionComponent$initialiseRelevantProductConfig$1);
            }
            if (objP0 != obj) {
                return objP0;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        if (r3 == r5) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel r24, app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel.SingleJourneyTicketAppModel r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent.M0(app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel, app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel$SingleJourneyTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void N0(MTicketPassengerSelectionIntent intent) {
        List list;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof MTicketPassengerSelectionIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        List list2 = null;
        if (z) {
            MTicketPassengerSelectionIntent.InitialisationIntent initialisationIntent = (MTicketPassengerSelectionIntent.InitialisationIntent) intent;
            Source source = initialisationIntent.e;
            if (source == null) {
                source = Source.UNKNOWN;
            }
            AnalyticsContractImplKt.b(this.m, "mticket selection screen opened", source, null, false, 28);
            E0(new ag0(22));
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleInitialisationIntent$2(this, initialisationIntent, null), 3);
            return;
        }
        if (intent instanceof MTicketPassengerSelectionIntent.RestoreFromProcessDeathIntent) {
            E0(new ag0(24));
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2((MTicketPassengerSelectionIntent.RestoreFromProcessDeathIntent) intent, this, null), 3);
            return;
        }
        if (intent.equals(MTicketPassengerSelectionIntent.RetryFareFetchIntent.f5750a)) {
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleRetryFareFetchIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof MTicketPassengerSelectionIntent.IncrementPassengerCount) {
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleIncrementPassengerCount$1(this, (MTicketPassengerSelectionIntent.IncrementPassengerCount) intent, null), 3);
            return;
        }
        if (intent instanceof MTicketPassengerSelectionIntent.DecrementPassengerCount) {
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1(this, (MTicketPassengerSelectionIntent.DecrementPassengerCount) intent, null), 3);
            return;
        }
        if (intent.equals(MTicketPassengerSelectionIntent.PayClickedIntent.f5748a)) {
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handlePayClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(MTicketPassengerSelectionIntent.TncClickedIntent.f5753a)) {
            ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = ((MTicketPassengerSelectionDataState) this.f.getValue()).f;
            if (singleJourneyTicketAppModel != null && (list = singleJourneyTicketAppModel.C) != null && !list.isEmpty()) {
                list2 = list;
            }
            if (list2 != null) {
                E0(new ud(list2, 9));
                return;
            }
            return;
        }
        if (intent instanceof MTicketPassengerSelectionIntent.TncActionClicked) {
            BuildersKt.d(contextScope, null, null, new MTicketPassengerSelectionComponent$handleTncActionClicked$1(this, (MTicketPassengerSelectionIntent.TncActionClicked) intent, null), 3);
            return;
        }
        if (!intent.equals(MTicketPassengerSelectionIntent.RetryProductFetchIntent.f5751a)) {
            if (intent.equals(MTicketPassengerSelectionIntent.ToggleTripDetailsVisibility.f5754a)) {
                E0(new ag0(25));
                return;
            } else {
                if (!intent.equals(MTicketPassengerSelectionIntent.DismissFareChangedDialog.f5745a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new ag0(23));
                return;
            }
        }
        Json json = ChaloJson.b;
        MTicketSelectionArgs mTicketSelectionArgs = this.k;
        String str = mTicketSelectionArgs.b;
        json.getClass();
        ProductBookingRouteDetails productBookingRouteDetails = (ProductBookingRouteDetails) json.b(str, ProductBookingRouteDetails.INSTANCE.serializer());
        String str2 = mTicketSelectionArgs.c;
        ProductBookingStopDetails.Companion companion = ProductBookingStopDetails.INSTANCE;
        N0(new MTicketPassengerSelectionIntent.InitialisationIntent(productBookingRouteDetails, (ProductBookingStopDetails) json.b(str2, companion.serializer()), (ProductBookingStopDetails) json.b(mTicketSelectionArgs.d, companion.serializer()), mTicketSelectionArgs.e, mTicketSelectionArgs.f));
    }

    public final void O0(ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, MTicketFareContainer mTicketFareContainer, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, boolean z, String str, String str2) {
        Source source = ((MTicketPassengerSelectionDataState) this.f.getValue()).g;
        if (source == null) {
            source = Source.MTICKET_SELECTION_ACTIVITY;
        }
        Source source2 = source;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("paymentMode", CustomTabsCallback.ONLINE_EXTRAS_KEY), new Pair("response", String.valueOf(z)));
        if (str != null) {
            linkedHashMapK.put(PaymentConstants.ORDER_ID_CAMEL, str);
        }
        if (str2 != null) {
            linkedHashMapK.put("chaloOrderId", str2);
        }
        H0(linkedHashMapK, singleJourneyTicketAppModel, mTicketFareContainer, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2);
        AnalyticsContractImplKt.b(this.m, "mticket booking response received", source2, linkedHashMapK, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(String str, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$sjtProductConfigForAgency$1 mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$sjtProductConfigForAgency$1) {
            mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1 = (MTicketPassengerSelectionComponent$sjtProductConfigForAgency$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1 = new MTicketPassengerSelectionComponent$sjtProductConfigForAgency$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1 = new MTicketPassengerSelectionComponent$sjtProductConfigForAgency$1(this, continuationImpl);
        }
        Object objE = mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.L$0 = str;
            mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.label = 1;
            objE = this.l.e(mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) mTicketPassengerSelectionComponent$sjtProductConfigForAgency$1.L$0;
            ResultKt.b(objE);
        }
        List list = (List) objE;
        if (list != null) {
            return MTicketSjtConfigSelectorKt.a(str, list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(String str, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$sjtProductConfigForId$1 mTicketPassengerSelectionComponent$sjtProductConfigForId$1;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$sjtProductConfigForId$1) {
            mTicketPassengerSelectionComponent$sjtProductConfigForId$1 = (MTicketPassengerSelectionComponent$sjtProductConfigForId$1) continuationImpl;
            int i = mTicketPassengerSelectionComponent$sjtProductConfigForId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$sjtProductConfigForId$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$sjtProductConfigForId$1 = new MTicketPassengerSelectionComponent$sjtProductConfigForId$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$sjtProductConfigForId$1 = new MTicketPassengerSelectionComponent$sjtProductConfigForId$1(this, continuationImpl);
        }
        Object objH = mTicketPassengerSelectionComponent$sjtProductConfigForId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionComponent$sjtProductConfigForId$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            mTicketPassengerSelectionComponent$sjtProductConfigForId$1.label = 1;
            objH = this.l.h(str, mTicketPassengerSelectionComponent$sjtProductConfigForId$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) objH;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel ? (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel : null;
        if (singleJourneyTicketAppModel != null && singleJourneyTicketAppModel.E) {
            return singleJourneyTicketAppModel;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[EDGE_INSN: B:32:0x0070->B:33:0x0071 BREAK  A[LOOP:0: B:25:0x005a->B:59:0x005a]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object R0(MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, MTicketFareResponseAppModel mTicketFareResponseAppModel, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1 mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1;
        int i;
        MTicketFareContainer mTicketFareContainer;
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        Object obj;
        List list;
        if (continuationImpl instanceof MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1) {
            mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1 = (MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1) continuationImpl;
            int i2 = mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1 = new MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1 = new MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1(this, continuationImpl);
        }
        MTicketPassengerSelectionComponent$updateStateWithPassengerCount$1 mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2 = mTicketPassengerSelectionComponent$updateStateWithPassengerCount$1;
        Object obj2 = mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.label;
        if (i3 == 0) {
            ResultKt.b(obj2);
            if (mTicketPassengerSelectionContainer != null && (list = mTicketPassengerSelectionContainer.f5741a) != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        MTicketPassengerItem mTicketPassengerItem = (MTicketPassengerItem) it.next();
                        if (mTicketPassengerItem.f && mTicketPassengerItem.c > 0) {
                            i = 1;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
            } else {
                i = 0;
                break;
            }
            MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState = (MTicketPassengerSelectionDataState) this.f.getValue();
            ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = mTicketPassengerSelectionDataState.f;
            mTicketFareContainer = null;
            if (singleJourneyTicketAppModel != null) {
                ProductBookingRouteDetails productBookingRouteDetails = mTicketPassengerSelectionDataState.f5743a;
                if (productBookingRouteDetails == null || (productBookingStopDetails = mTicketPassengerSelectionDataState.b) == null || (productBookingStopDetails2 = mTicketPassengerSelectionDataState.c) == null || mTicketFareResponseAppModel == null) {
                    mTicketFareContainer = null;
                } else {
                    mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.L$0 = mTicketPassengerSelectionContainer;
                    mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.I$0 = i;
                    mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.label = 1;
                    Object objA = this.q.a(singleJourneyTicketAppModel, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, mTicketPassengerSelectionContainer, mTicketFareResponseAppModel, mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objA;
                    mTicketPassengerSelectionContainer = mTicketPassengerSelectionContainer;
                }
            }
            E0(new qi(i != 0, mTicketPassengerSelectionContainer, mTicketFareContainer, 3));
            return Unit.f17538a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.I$0;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2 = (MTicketPassengerSelectionContainer) mTicketPassengerSelectionComponent$updateStateWithPassengerCount$2.L$0;
        ResultKt.b(obj2);
        i = i4;
        mTicketPassengerSelectionContainer = mTicketPassengerSelectionContainer2;
        obj = obj2;
        mTicketFareContainer = (MTicketFareContainer) obj;
        E0(new qi(i != 0, mTicketPassengerSelectionContainer, mTicketFareContainer, 3));
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionComponent$convertToUiState$2 mTicketPassengerSelectionComponent$convertToUiState$2 = new MTicketPassengerSelectionComponent$convertToUiState$2(1, this, MTicketPassengerSelectionComponent.class, "processIntent", "processIntent(Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;)V", 0);
        return this.B.a((MTicketPassengerSelectionDataState) obj, mTicketPassengerSelectionComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new MTicketPassengerSelectionDataState(null, null, null, false, ProductBookingBranding.None.INSTANCE, null, null, false, false, null, null, false, null, null, null, true);
    }
}

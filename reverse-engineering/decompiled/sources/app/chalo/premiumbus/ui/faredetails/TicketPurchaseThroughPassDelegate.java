package app.chalo.premiumbus.ui.faredetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.domain.ReserveSeatThroughPassUseCase;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDelegateRestoredState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.utils.SystemHelper;
import defpackage.pg1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/TicketPurchaseThroughPassDelegate;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsDelegate;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketPurchaseThroughPassDelegate implements PremiumBusFareDetailsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusFareDetailsFlowType.PurchaseThroughPass f7557a;
    public final ReserveSeatThroughPassUseCase b;
    public final SuperPassDataWrapper c;
    public final AnalyticsContract d;
    public final CheckIsUserLoggedInUseCase e;
    public final ChaloNavigationManager f;
    public final KotlinToastManager g;
    public final StringProvider h;
    public final SystemHelper i;
    public final ChaloTimeProvider j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public CoroutineScope m;
    public final LinkedHashSet n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/TicketPurchaseThroughPassDelegate$Companion;", "", "", "TAG", "Ljava/lang/String;", "PREMIUM_RESERVE_TICKET_THROUGH_PASS_FLOW_TYPE", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TicketPurchaseThroughPassDelegate(PremiumBusFareDetailsFlowType.PurchaseThroughPass flowType, ReserveSeatThroughPassUseCase reserveSeatThroughPassUseCase, SuperPassDataWrapper superPassDataWrapper, AnalyticsContract analyticsContract, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, SystemHelper systemHelper, ChaloTimeProvider chaloTimeProvider) {
        Intrinsics.i(flowType, "flowType");
        this.f7557a = flowType;
        this.b = reserveSeatThroughPassUseCase;
        this.c = superPassDataWrapper;
        this.d = analyticsContract;
        this.e = checkIsUserLoggedInUseCase;
        this.f = chaloNavigationManager;
        this.g = kotlinToastManager;
        this.h = stringProvider;
        this.i = systemHelper;
        this.j = chaloTimeProvider;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PremiumBusFareDetailsDataState());
        this.k = mutableStateFlowA;
        this.l = FlowKt.c(mutableStateFlowA);
        this.n = new LinkedHashSet();
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final /* bridge */ PremiumBusFareDetailsDelegateRestoredState b() {
        return null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void dispose() {
        LinkedHashSet linkedHashSet = this.n;
        Iterator it = CollectionsKt.D0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        linkedHashSet.clear();
        this.m = null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void e(PremiumBusFareDetailsIntent intent) {
        Object value;
        Object value2;
        Object value3;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext;
        Object value4;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        Object value5;
        Object value6;
        Object value7;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA;
        Intrinsics.i(intent, "intent");
        boolean zEquals = intent.equals(PremiumBusFareDetailsIntent.InitializationIntent.f7592a);
        MutableStateFlow mutableStateFlow = this.k;
        if (zEquals) {
            do {
                value7 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataStateA = (PremiumBusFareDetailsDataState) value7;
                if (!premiumBusFareDetailsDataStateA.g) {
                    premiumBusFareDetailsDataStateA = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431);
                }
            } while (!mutableStateFlow.c(value7, premiumBusFareDetailsDataStateA));
            return;
        }
        boolean z = intent instanceof PremiumBusFareDetailsIntent.OnPayButtonClicked;
        ChaloNavigationManager chaloNavigationManager = this.f;
        if (z) {
            if (this.m == null || (premiumBusFareDetailsSharedContext = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t) == null) {
                return;
            }
            String str = this.f7557a.c;
            AnalyticsContractImplKt.b(this.d, "find my ticket fare fare details pay button clicked", Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT, MapsKt.l(MapsKt.i(new Pair(PaymentConstants.AMOUNT, Long.valueOf(((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).d)), new Pair("flowType", "premiumReserveTicketThroughPass")), ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).l), false, 24);
            do {
                value4 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value4;
            } while (!mutableStateFlow.c(value4, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, true, null, 786431)));
            if (premiumBusFareDetailsDataState.s) {
                return;
            }
            if (!this.e.a()) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, true), null, null, 6));
                do {
                    value6 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value6, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value6, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
                return;
            }
            do {
                value5 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value5, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value5, false, null, 0L, null, false, true, true, null, null, null, null, null, null, 0, null, null, null, false, null, 1048383)));
            FareDetailsData fareDetailsData = premiumBusFareDetailsSharedContext.c;
            TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3 ticketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3 = new TicketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3(this, new PBTicketSelectedTripDetailsApiRequestModel(fareDetailsData.f8185a.b, fareDetailsData.b.f8199a, fareDetailsData.c.f8199a), premiumBusFareDetailsSharedContext, str, null);
            CoroutineScope coroutineScope = this.m;
            if (coroutineScope != null) {
                Job jobD = BuildersKt.d(coroutineScope, null, null, ticketPurchaseThroughPassDelegate$handleOnPayButtonClickedIntent$3, 3);
                this.n.add(jobD);
                ((JobSupport) jobD).w(new pg1(10, this, jobD));
                return;
            }
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.NavigateToHomeScreenIntent.f7593a)) {
            PremiumBusFareDetailsDelegateSharedActionsKt.b(chaloNavigationManager);
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.TermsAndConditionsTextClickedIntent.f7605a)) {
            PremiumBusFareDetailsBottomSheetType.TncSection tncSectionD = PremiumBusFareDetailsDelegateSharedActionsKt.d(((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).j);
            if (tncSectionD == null) {
                return;
            }
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, tncSectionD, null, false, null, 983039)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OrderCreationErrorDialogOkClickedIntent.f7599a)) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 917503)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OnChangeSeatClickedIntent.f7594a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.BottomSheetDismissedIntent.f7586a)) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 983039)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.SeeUpsellDetailsClickedIntent.f7602a) || intent.equals(PremiumBusFareDetailsIntent.RetryFareFetchClicked.f7601a)) {
            return;
        }
        PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent switchErrorDismissedIntent = PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent.f7604a;
        if (!intent.equals(switchErrorDismissedIntent) && !intent.equals(PremiumBusFareDetailsIntent.OnStoppedIntent.f7598a) && !intent.equals(PremiumBusFareDetailsIntent.CancelOrderApiIntent.f7587a) && !(intent instanceof PremiumBusFareDetailsIntent.OnPaymentCompletedIntent) && !intent.equals(PremiumBusFareDetailsIntent.OnReadMoreFareNoteIntent.f7597a) && !intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f7589a) && !intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f7590a) && !(intent instanceof PremiumBusFareDetailsIntent.IncreasePassengerCountClicked) && !(intent instanceof PremiumBusFareDetailsIntent.DecreasePassengerCountClicked) && !(intent instanceof PremiumBusFareDetailsIntent.OnPassengerCategorySelectedIntent) && !(intent instanceof PremiumBusFareDetailsIntent.SelectPassUpsellOfferIntent) && !intent.equals(PremiumBusFareDetailsIntent.RemoveUpsellPassIntent.f7600a) && !intent.equals(switchErrorDismissedIntent)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void g(ContextScope scope, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext) {
        TicketPurchaseThroughPassDelegate ticketPurchaseThroughPassDelegate = this;
        PremiumBusFareDetailsSharedContext context = premiumBusFareDetailsSharedContext;
        Intrinsics.i(scope, "scope");
        Intrinsics.i(context, "context");
        ticketPurchaseThroughPassDelegate.m = scope;
        while (true) {
            MutableStateFlow mutableStateFlow = ticketPurchaseThroughPassDelegate.k;
            Object value = mutableStateFlow.getValue();
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value;
            List list = context.c.f;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            if (mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, list, null, null, null, null, 0, null, null, null, false, premiumBusFareDetailsSharedContext, 523696))) {
                return;
            }
            ticketPurchaseThroughPassDelegate = this;
            context = premiumBusFareDetailsSharedContext;
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getL() {
        return this.l;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final /* bridge */ void a(PremiumBusFareDetailsDelegateRestoredState premiumBusFareDetailsDelegateRestoredState) {
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void c(a aVar) {
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void d(CheckoutResultState checkoutResultState) {
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void f(a aVar) {
    }
}

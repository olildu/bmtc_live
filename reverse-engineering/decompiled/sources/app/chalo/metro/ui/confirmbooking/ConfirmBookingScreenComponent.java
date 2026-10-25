package app.chalo.metro.ui.confirmbooking;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.metro.data.api.MetroTicketTripDetails;
import app.chalo.metro.data.app.MetroFinalFareAppModel;
import app.chalo.metro.domain.CreateMetroTicketOrderUseCase;
import app.chalo.metro.domain.GetMetroFinalFareUseCase;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingScreenViewState;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ConfirmBookingScreenArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.cp;
import defpackage.fi;
import defpackage.qp;
import defpackage.vo1;
import defpackage.wn;
import java.util.ArrayList;
import java.util.List;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenDataState;", "Lapp/chalo/metro/ui/confirmbooking/uistate/ConfirmBookingScreenViewState;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmBookingScreenComponent extends ChaloBaseStateMviComponent<ConfirmBookingScreenViewIntent, ConfirmBookingScreenDataState, ConfirmBookingScreenViewState, ConfirmBookingScreenSideEffect> {
    public final StringProvider k;
    public final AnalyticsContract l;
    public final ConfirmBookingUIStateFactory m;
    public final GetMetroFinalFareUseCase n;
    public final CreateMetroTicketOrderUseCase o;
    public final UserProfileDetailsProvider p;
    public final TimeUtilsContract q;
    public final CheckoutResultStateManager r;
    public final KotlinToastManager s;
    public final ChaloNavigationManager t;
    public String u;
    public Job v;

    public ConfirmBookingScreenComponent(ComponentContext componentContext, ConfirmBookingScreenArgs confirmBookingScreenArgs, StringProvider stringProvider, AnalyticsContract analyticsContract, ConfirmBookingUIStateFactory confirmBookingUIStateFactory, GetMetroFinalFareUseCase getMetroFinalFareUseCase, CreateMetroTicketOrderUseCase createMetroTicketOrderUseCase, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, CheckoutResultStateManager checkoutResultStateManager, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = stringProvider;
        this.l = analyticsContract;
        this.m = confirmBookingUIStateFactory;
        this.n = getMetroFinalFareUseCase;
        this.o = createMetroTicketOrderUseCase;
        this.p = userProfileDetailsProvider;
        this.q = timeUtilsContract;
        this.r = checkoutResultStateManager;
        this.s = kotlinToastManager;
        this.t = chaloNavigationManager;
        Json json = ChaloJson.b;
        String str = confirmBookingScreenArgs.b;
        json.getClass();
        I0(new ConfirmBookingScreenViewIntent.InitialisationIntent((ConfirmationBookingScreenData) json.b(str, ConfirmationBookingScreenData.INSTANCE.serializer())));
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("ConfirmBookingScreen_SK_Key", b, companion.serializer(), companion.serializer(), new fi(this, 22));
        if (resultStateRecoveredDataA != null) {
            this.v = BuildersKt.d(this.j, null, null, new ConfirmBookingScreenComponent$1$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object F0(ConfirmBookingScreenComponent confirmBookingScreenComponent, ContinuationImpl continuationImpl) {
        ConfirmBookingScreenComponent$fetchFinalFareDetails$1 confirmBookingScreenComponent$fetchFinalFareDetails$1;
        List list;
        StateFlow stateFlow = confirmBookingScreenComponent.f;
        if (continuationImpl instanceof ConfirmBookingScreenComponent$fetchFinalFareDetails$1) {
            confirmBookingScreenComponent$fetchFinalFareDetails$1 = (ConfirmBookingScreenComponent$fetchFinalFareDetails$1) continuationImpl;
            int i = confirmBookingScreenComponent$fetchFinalFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmBookingScreenComponent$fetchFinalFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmBookingScreenComponent$fetchFinalFareDetails$1 = new ConfirmBookingScreenComponent$fetchFinalFareDetails$1(confirmBookingScreenComponent, continuationImpl);
            }
        } else {
            confirmBookingScreenComponent$fetchFinalFareDetails$1 = new ConfirmBookingScreenComponent$fetchFinalFareDetails$1(confirmBookingScreenComponent, continuationImpl);
        }
        ConfirmBookingScreenComponent$fetchFinalFareDetails$1 confirmBookingScreenComponent$fetchFinalFareDetails$2 = confirmBookingScreenComponent$fetchFinalFareDetails$1;
        Object objA = confirmBookingScreenComponent$fetchFinalFareDetails$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = confirmBookingScreenComponent$fetchFinalFareDetails$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            confirmBookingScreenComponent.E0(new cp(26));
            String str = ((ConfirmBookingScreenDataState) stateFlow.getValue()).d;
            if (str != null && (list = ((ConfirmBookingScreenDataState) stateFlow.getValue()).g) != null) {
                List<ConfirmBookingPassengerDetails> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (ConfirmBookingPassengerDetails confirmBookingPassengerDetails : list2) {
                    arrayList.add(new PassengerDetailData(confirmBookingPassengerDetails.c, confirmBookingPassengerDetails.f5461a, confirmBookingPassengerDetails.b));
                }
                ConfirmationScreenTripDetails confirmationScreenTripDetails = ((ConfirmBookingScreenDataState) stateFlow.getValue()).f;
                if (confirmationScreenTripDetails != null) {
                    MetroTicketTripDetails metroTicketTripDetails = new MetroTicketTripDetails(confirmationScreenTripDetails.f5472a, confirmationScreenTripDetails.b);
                    GetMetroFinalFareUseCase getMetroFinalFareUseCase = confirmBookingScreenComponent.n;
                    ChaloTicketBookingMode chaloTicketBookingMode = ((ConfirmBookingScreenDataState) stateFlow.getValue()).b;
                    confirmBookingScreenComponent$fetchFinalFareDetails$2.label = 1;
                    objA = getMetroFinalFareUseCase.a(chaloTicketBookingMode, str, arrayList, metroTicketTripDetails, confirmBookingScreenComponent$fetchFinalFareDetails$2);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            AnalyticsContractImplKt.b(confirmBookingScreenComponent.l, "confirm final fare fetch failed", Source.CONFIRM_BOOKING_SCREEN, vo1.s("error", String.valueOf(((ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f8097a)), false, 24);
            confirmBookingScreenComponent.E0(new cp(27));
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContract analyticsContract = confirmBookingScreenComponent.l;
        Source source = Source.CONFIRM_BOOKING_SCREEN;
        MetroFinalFareAppModel metroFinalFareAppModel = (MetroFinalFareAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        AnalyticsContractImplKt.b(analyticsContract, "confirm final fare fetch success", source, vo1.s("fare", String.valueOf(metroFinalFareAppModel.b)), false, 24);
        List list3 = metroFinalFareAppModel.c;
        if (list3.isEmpty()) {
            list3 = null;
        }
        if (list3 == null) {
            list3 = ((ConfirmBookingScreenDataState) stateFlow.getValue()).j;
        }
        confirmBookingScreenComponent.E0(new wn(12, metroFinalFareAppModel, list3));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d7, code lost:
    
        if (r1 == r3) goto L101;
     */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent.G0(app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void H0(ConfirmBookingScreenComponent confirmBookingScreenComponent, ResultStateData resultStateData) {
        confirmBookingScreenComponent.u = null;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            return;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
        if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
            if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            String str = ((CheckoutResultState.Success) checkoutResultState).d;
            if (str != null) {
                confirmBookingScreenComponent.I0(new ConfirmBookingScreenViewIntent.OnPaymentCompletedIntent(str));
            }
        }
    }

    public final void I0(ConfirmBookingScreenViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ConfirmBookingScreenViewIntent.InitialisationIntent;
        int i = 3;
        ContextScope contextScope = this.j;
        if (z) {
            ConfirmationBookingScreenData confirmationBookingScreenData = ((ConfirmBookingScreenViewIntent.InitialisationIntent) intent).f5464a;
            if (this.d) {
                return;
            }
            AnalyticsContractImplKt.b(this.l, "confirm screen opened", Source.CONFIRM_BOOKING_SCREEN, MapsKt.i(new Pair("bookingMode", confirmationBookingScreenData.b.name()), new Pair("passengerTypes", confirmationBookingScreenData.f.toString()), new Pair("tripDetails", confirmationBookingScreenData.e.toString())), false, 24);
            E0(new qp(confirmationBookingScreenData, i));
            BuildersKt.d(contextScope, null, null, new ConfirmBookingScreenComponent$handleInitialisationIntent$2(this, null), 3);
            this.d = true;
            return;
        }
        if (intent.equals(ConfirmBookingScreenViewIntent.OnProceedButtonClicked.f5466a)) {
            BuildersKt.d(contextScope, null, null, new ConfirmBookingScreenComponent$processIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(ConfirmBookingScreenViewIntent.OnRetryFareFetchClicked.f5467a)) {
            AnalyticsContractImplKt.b(this.l, "retry button clicked", Source.CONFIRM_BOOKING_SCREEN, null, false, 28);
            BuildersKt.d(contextScope, null, null, new ConfirmBookingScreenComponent$handleOnFareRetryButtonClicked$1(this, null), 3);
        } else if (intent instanceof ConfirmBookingScreenViewIntent.OnPaymentCompletedIntent) {
            this.t.b(new ChaloNavigationRequest.Navigate(new ProductActivationArgs(((ConfirmBookingScreenViewIntent.OnPaymentCompletedIntent) intent).f5465a, "mobileTicket", "metroTicket", Source.CONFIRM_BOOKING_SCREEN, null, null, null, 1008), null, null, 6));
        } else if (intent.equals(ConfirmBookingScreenViewIntent.TnCAcceptClickIntent.f5469a)) {
            E0(new cp(28));
        } else {
            if (!intent.equals(ConfirmBookingScreenViewIntent.OnTermsAndConditionsClicked.f5468a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new cp(29));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        ConfirmBookingScreenComponent$convertToUiState$2 confirmBookingScreenComponent$convertToUiState$2 = new ConfirmBookingScreenComponent$convertToUiState$2(1, this, ConfirmBookingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenViewIntent;)V", 0);
        return this.m.a((ConfirmBookingScreenDataState) obj, confirmBookingScreenComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ConfirmBookingScreenDataState(ChaloTransitMode.BUS, ChaloTicketBookingMode.Unknown, false, null, null, null, null, null, null, null, false, false, false);
    }
}

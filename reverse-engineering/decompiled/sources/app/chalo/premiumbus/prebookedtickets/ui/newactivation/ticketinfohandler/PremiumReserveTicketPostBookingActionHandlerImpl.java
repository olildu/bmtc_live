package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TrafficSignalAppModel;
import app.chalo.citydata.domain.FetchStopImagesUseCase;
import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$fromLambda$1;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerType;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.data.PremiumProductionModificationAdditionalInfoCtaActionType;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.domain.GetTrimmedPolylineUseCase;
import app.chalo.domain.PolylineTrimRequest;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.provider.tracking.RouteDetailsResult;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider;
import app.chalo.livetracking.provider.tracking.model.LiveVehicleDataAppModel;
import app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.livetracking.routedetails.RouteDetailsUtils;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusAnalyticsHelper;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.data.models.app.WomenAdjacencyPromiseState;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase;
import app.chalo.premiumbus.domains.PremiumTicketActivationStatus;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingTripTimeInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingVehicleInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusTicketsUpdateOptionsUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTicketForAckDataUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusTripTimeInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ProcessPremiumBusVehicleInfoUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.BusPassedDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveBusMarkerUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopMarkerUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusTrafficSignalMarkerUIState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridefeedback.data.app.RideFeedbackEntryPoint;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.ridefeedback.domain.PremiumReserveTicketFeedbackMapperKt;
import app.chalo.ridefeedback.domain.RecordPendingFeedbackUseCase;
import app.chalo.uistate.components.map.PolylinePointUIState;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.GeometryUtils;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import defpackage.et0;
import defpackage.eu0;
import defpackage.lu0;
import defpackage.o3;
import defpackage.qd;
import defpackage.qi;
import defpackage.ud;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.wb;
import defpackage.y20;
import defpackage.za0;
import defpackage.zv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionHandlerImpl;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionHandler;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketPostBookingActionHandlerImpl implements PremiumReserveTicketPostBookingActionHandler {
    public static int l0 = 200;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase A;
    public final ShouldShowRescheduleAckForTicketUseCase B;
    public final PremiumBusInAppCommunicationBottomSheetDataUseCase C;
    public final SystemHelper D;
    public final UserProfileDetailsProvider E;
    public final PremiumBusDataStoreWrapper F;
    public final RecordPendingFeedbackUseCase G;
    public final MutableStateFlow H = StateFlowKt.a(new PremiumReserveTicketPostBookingActionState());
    public final BufferedChannel I = ChannelKt.a(-2, 6, null);
    public final ContextScope J;
    public PremiumReserveTicketAppModel K;
    public Job L;
    public Job M;
    public Job N;
    public RouteAppModel O;
    public Job P;
    public Job Q;
    public String R;
    public Job S;
    public String T;
    public Job U;
    public boolean V;
    public MapCameraUpdate W;
    public PremiumBusNativeCityWiseConfigAppModel X;
    public PostBookingHandlerConfig Y;
    public List Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetPremiumReserveTicketByIdUseCase f7449a;
    public final MutableStateFlow a0;
    public final BasicInfoContract b;
    public Job b0;
    public final StringProvider c;
    public Job c0;
    public final FetchPremiumBusTripDetailsAndLiveEtaUseCase d;
    public boolean d0;
    public final ProcessPremiumBusTripTimeInfoUseCase e;
    public Job e0;
    public final GetPremiumBusCurrentCityConfigUseCase f;
    public String f0;
    public final GetRegularBusProductValidationMethodUseCase g;
    public String g0;
    public final IsBluetoothFeatureAvailableUseCase h;
    public boolean h0;
    public final FetchPremiumBusTicketsUpdateOptionsUseCase i;
    public boolean i0;
    public final AcknowledgePremiumReserveTicketCancellationUseCase j;
    public long j0;
    public final GetLatestPremiumReserveTicketFromFirstBookingIdUseCase k;
    public final long k0;
    public final TimeUtilsContract l;
    public final CheckLiveBusDelayedUseCase m;
    public final ChaloMapMarkerIconProvider n;
    public final GetTrimmedPolylineUseCase o;
    public final ChaloLocationManager p;
    public final CityProvider q;
    public final GetTodayOrTomorrowOrDateUseCase r;
    public final ArePermissionsGrantedUseCase s;
    public final PremiumBusAnalyticsHelper t;
    public final FetchStopImagesUseCase u;
    public final RouteTrackingDataProvider v;
    public final PremiumBusRepository w;
    public final ChaloMapMarkerInfoWindowProvider x;
    public final PolylineUtils y;
    public final LatLngBoundsUtils z;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {235, 243}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PremiumReserveTicketPostBookingActionHandlerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 == r2) goto L14
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L14:
                kotlin.ResultKt.b(r5)
                goto L52
            L18:
                kotlin.ResultKt.b(r5)
                goto L2c
            L1c:
                kotlin.ResultKt.b(r5)
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r5 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.this
                app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase r5 = r5.A
                r4.label = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L2c
                goto L51
            L2c:
                app.chalo.data.MiscellaneousCityWiseConfigForCity r5 = (app.chalo.data.MiscellaneousCityWiseConfigForCity) r5
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r1 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.this
                boolean r3 = r5.o
                r1.i0 = r3
                boolean r3 = r5.n
                r1.h0 = r3
                int r5 = r5.p
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.l0 = r5
                app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider r5 = r1.v
                kotlinx.coroutines.flow.StateFlow r5 = r5.c()
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$1$1 r1 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$1$1
                app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r3 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.this
                r1.<init>()
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$2", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {252}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PremiumReserveTicketPostBookingActionHandlerImpl.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl2 = PremiumReserveTicketPostBookingActionHandlerImpl.this;
                GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase = premiumReserveTicketPostBookingActionHandlerImpl2.f;
                this.L$0 = premiumReserveTicketPostBookingActionHandlerImpl2;
                this.label = 1;
                Object objA = getPremiumBusCurrentCityConfigUseCase.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                premiumReserveTicketPostBookingActionHandlerImpl = premiumReserveTicketPostBookingActionHandlerImpl2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                premiumReserveTicketPostBookingActionHandlerImpl = (PremiumReserveTicketPostBookingActionHandlerImpl) this.L$0;
                ResultKt.b(obj);
            }
            premiumReserveTicketPostBookingActionHandlerImpl.X = (PremiumBusNativeCityWiseConfigAppModel) obj;
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionHandlerImpl$Companion;", "", "", "NO_VALUE", "Ljava/lang/String;", "", "GPS_POLLING_FREQUENCY_IN_MILLIS", "J", "THRESHOLD_TO_CONSIDER_TRIP_ENDED_IF_NO_ETA_AVAILABLE", "THRESHOLD_TO_CONSIDER_FOR_GPS_UNAVAILABLE", "", "busDistanceThresholdToShowTrafficSignal", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7451a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PremiumProductionModificationAdditionalInfoCtaActionType.values().length];
            try {
                iArr[PremiumProductionModificationAdditionalInfoCtaActionType.CALL_CUSTOMER_CARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7451a = iArr;
            int[] iArr2 = new int[PremiumReserveTicketOptionAction.values().length];
            try {
                iArr2[PremiumReserveTicketOptionAction.CANCEL_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.RESCHEDULE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CALL_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHAT_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHANGE_SEAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PremiumReserveTicketOptionAction.CHANGE_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[RideFeedbackFillStatus.values().length];
            try {
                iArr3[RideFeedbackFillStatus.NOT_FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[RideFeedbackFillStatus.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[RideFeedbackFillStatus.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[RideFeedbackFillStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[RideFeedbackFillStatus.DISMISSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
        }
    }

    public PremiumReserveTicketPostBookingActionHandlerImpl(CoroutineContextProvider coroutineContextProvider, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, BasicInfoContract basicInfoContract, StringProvider stringProvider, FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase, ProcessPremiumBusTripTimeInfoUseCase processPremiumBusTripTimeInfoUseCase, ProcessPremiumBusVehicleInfoUseCase processPremiumBusVehicleInfoUseCase, ProcessPremiumBusTicketForAckDataUseCase processPremiumBusTicketForAckDataUseCase, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, IsBluetoothFeatureAvailableUseCase isBluetoothFeatureAvailableUseCase, FetchPremiumBusTicketsUpdateOptionsUseCase fetchPremiumBusTicketsUpdateOptionsUseCase, AcknowledgePremiumReserveTicketCancellationUseCase acknowledgePremiumReserveTicketCancellationUseCase, GetLatestPremiumReserveTicketFromFirstBookingIdUseCase getLatestPremiumReserveTicketFromFirstBookingIdUseCase, TimeUtilsContract timeUtilsContract, CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase, ChaloMapMarkerIconProvider chaloMapMarkerIconProvider, GetTrimmedPolylineUseCase getTrimmedPolylineUseCase, ChaloLocationManager chaloLocationManager, CityProvider cityProvider, GetTodayOrTomorrowOrDateUseCase getTodayOrTomorrowOrDateUseCase, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, PremiumBusAnalyticsHelper premiumBusAnalyticsHelper, FetchStopImagesUseCase fetchStopImagesUseCase, RouteTrackingDataProvider routeTrackingDataProvider, PremiumBusRepository premiumBusRepository, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, PolylineUtils polylineUtils, LatLngBoundsUtils latLngBoundsUtils, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, ShouldShowRescheduleAckForTicketUseCase shouldShowRescheduleAckForTicketUseCase, PremiumBusInAppCommunicationBottomSheetDataUseCase premiumBusInAppCommunicationBottomSheetDataUseCase, SystemHelper systemHelper, UserProfileDetailsProvider userProfileDetailsProvider, PremiumBusDataStoreWrapper premiumBusDataStoreWrapper, RecordPendingFeedbackUseCase recordPendingFeedbackUseCase) {
        this.f7449a = getPremiumReserveTicketByIdUseCase;
        this.b = basicInfoContract;
        this.c = stringProvider;
        this.d = fetchPremiumBusTripDetailsAndLiveEtaUseCase;
        this.e = processPremiumBusTripTimeInfoUseCase;
        this.f = getPremiumBusCurrentCityConfigUseCase;
        this.g = getRegularBusProductValidationMethodUseCase;
        this.h = isBluetoothFeatureAvailableUseCase;
        this.i = fetchPremiumBusTicketsUpdateOptionsUseCase;
        this.j = acknowledgePremiumReserveTicketCancellationUseCase;
        this.k = getLatestPremiumReserveTicketFromFirstBookingIdUseCase;
        this.l = timeUtilsContract;
        this.m = checkLiveBusDelayedUseCase;
        this.n = chaloMapMarkerIconProvider;
        this.o = getTrimmedPolylineUseCase;
        this.p = chaloLocationManager;
        this.q = cityProvider;
        this.r = getTodayOrTomorrowOrDateUseCase;
        this.s = arePermissionsGrantedUseCase;
        this.t = premiumBusAnalyticsHelper;
        this.u = fetchStopImagesUseCase;
        this.v = routeTrackingDataProvider;
        this.w = premiumBusRepository;
        this.x = chaloMapMarkerInfoWindowProvider;
        this.y = polylineUtils;
        this.z = latLngBoundsUtils;
        this.A = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.B = shouldShowRescheduleAckForTicketUseCase;
        this.C = premiumBusInAppCommunicationBottomSheetDataUseCase;
        this.D = systemHelper;
        this.E = userProfileDetailsProvider;
        this.F = premiumBusDataStoreWrapper;
        this.G = recordPendingFeedbackUseCase;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.a().plus(SupervisorKt.b()));
        this.J = contextScopeA;
        this.R = "NO_VALUE";
        this.T = "NO_VALUE";
        this.Y = new PostBookingHandlerConfig(false, false, false);
        this.a0 = StateFlowKt.a(-1L);
        this.k0 = 60000L;
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object A(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1 premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1;
        premiumReserveTicketPostBookingActionHandlerImpl.getClass();
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
        }
        Object objK = premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1.label = 1;
            objK = premiumReserveTicketPostBookingActionHandlerImpl.K(premiumReserveTicketAppModel, premiumReserveTicketPostBookingActionHandlerImpl$handleRescheduledTicket$1);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType = (PremiumBusPostBookingBottomSheetType) objK;
        PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(premiumReserveTicketPostBookingActionHandlerImpl.H).getValue()).o;
        if (premiumBusPostBookingBottomSheetType != null) {
            premiumReserveTicketPostBookingActionHandlerImpl.f0(new et0(premiumBusPostBookingBottomSheetType, 28));
            if (!premiumBusPostBookingBottomSheetType.equals(premiumBusPostBookingBottomSheetType2)) {
                premiumReserveTicketPostBookingActionHandlerImpl.J(PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a);
            }
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, RouteDetailsResult routeDetailsResult, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1 premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1;
        premiumReserveTicketPostBookingActionHandlerImpl.getClass();
        if (continuation instanceof PremiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1) continuation;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1(premiumReserveTicketPostBookingActionHandlerImpl, continuation);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1(premiumReserveTicketPostBookingActionHandlerImpl, continuation);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (routeDetailsResult instanceof RouteDetailsResult.Success) {
                premiumReserveTicketPostBookingActionHandlerImpl.O = ((RouteDetailsResult.Success) routeDetailsResult).f4346a;
                premiumReserveTicketPostBookingActionHandlerImpl.T();
                premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1.label = 1;
                if (premiumReserveTicketPostBookingActionHandlerImpl.a0(premiumReserveTicketPostBookingActionHandlerImpl$handleRoueDetailsResult$1) == obj2) {
                    return obj2;
                }
            } else if (routeDetailsResult instanceof RouteDetailsResult.Error) {
                premiumReserveTicketPostBookingActionHandlerImpl.J(PremiumReserveTicketPostBookingActionEffect.RouteDataFetchFailed.f7447a);
                CityAppModel cityAppModel = (CityAppModel) premiumReserveTicketPostBookingActionHandlerImpl.q.getE().getValue();
                if (cityAppModel != null) {
                    LatLng latLng = cityAppModel.d;
                    LatLng latLng2 = new LatLng(latLng.f5134a, latLng.b);
                    PremiumBusLiveTrackingState premiumBusLiveTrackingState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(premiumReserveTicketPostBookingActionHandlerImpl.H).getValue()).r;
                    premiumReserveTicketPostBookingActionHandlerImpl.f0(new et0(premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, null, null, null, null, new MapCameraViewState.InitialState.CustomPosition(latLng2, 0.0f, 14), 63) : new PremiumBusLiveTrackingState(null, null, null, null, new MapCameraViewState.InitialState.CustomPosition(latLng2, 0.0f, 14), 63), 29));
                }
            } else if (!Intrinsics.d(routeDetailsResult, RouteDetailsResult.FetchInProgress.f4345a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        premiumReserveTicketPostBookingActionHandlerImpl.S();
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object C(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1 premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1;
        premiumReserveTicketPostBookingActionHandlerImpl.getClass();
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
        }
        Object objB = premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation premiumReserveTicketValidation = new ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation(premiumReserveTicketAppModel.f7113a.f7114a);
            GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase = premiumReserveTicketPostBookingActionHandlerImpl.g;
            premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1.label = 1;
            objB = getRegularBusProductValidationMethodUseCase.b(premiumReserveTicketValidation, premiumReserveTicketPostBookingActionHandlerImpl$isBLEValidationEnabledForAppVer$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        RegularBusSlBleConfig regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) objB).b;
        return Boolean.valueOf(regularBusSlBleConfig != null && regularBusSlBleConfig.a(premiumReserveTicketPostBookingActionHandlerImpl.b.h()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r7.W(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1
            if (r0 == 0) goto L16
            r0 = r8
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$markTripEndedForUser$1
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            kotlin.Unit r4 = kotlin.Unit.f17538a
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r8)
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r8)
            goto L64
        L3b:
            kotlin.ResultKt.b(r8)
            boolean r8 = r7.U()
            if (r8 != 0) goto L45
            goto L7e
        L45:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r8 = r7.K
            if (r8 == 0) goto L7e
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r8 = r8.f7113a
            java.lang.String r8 = r8.f7114a
            java.lang.String r2 = "updating trip to completed for bookingId: "
            java.lang.String r2 = r2.concat(r8)
            java.lang.String r6 = "message"
            kotlin.jvm.internal.Intrinsics.i(r2, r6)
            app.chalo.premiumbus.data.repository.PremiumBusRepository r2 = r7.w
            r0.label = r5
            java.lang.Object r8 = r2.q(r8, r0)
            if (r8 != r1) goto L64
            goto L6c
        L64:
            r0.label = r3
            java.lang.Object r8 = r7.W(r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r8 = r7.K
            if (r8 == 0) goto L7e
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r0 = r8.f7113a
            java.lang.String r0 = r0.f7114a
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel r8 = r8.b
            java.lang.String r8 = r8.f7117a
            app.chalo.premiumbus.PremiumBusAnalyticsHelper r7 = r7.t
            r7.c(r0, r8)
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.D(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r6.e0(r8, r7, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r6, app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$processLiveVehicleDetails$1
            if (r0 == 0) goto L16
            r0 = r8
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$processLiveVehicleDetails$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$processLiveVehicleDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$processLiveVehicleDetails$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$processLiveVehicleDetails$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.Unit r3 = kotlin.Unit.f17538a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r8)
            return r3
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.b(r8)
            goto L64
        L3b:
            kotlin.ResultKt.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "liveVehicleData: "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.i(r8, r2)
            boolean r8 = r7 instanceof app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult.LiveData
            if (r8 == 0) goto L6b
            app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult$LiveData r7 = (app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult.LiveData) r7
            java.util.List r8 = r7.f4341a
            java.util.Map r7 = r7.b
            r0.label = r5
            java.lang.Object r7 = r6.e0(r8, r7, r0)
            if (r7 != r1) goto L64
            goto L7b
        L64:
            boolean r7 = r6.V
            if (r7 != 0) goto L7c
            r6.V = r5
            return r3
        L6b:
            boolean r8 = r7 instanceof app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult.VehicleGPSData
            if (r8 == 0) goto L7d
            app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult$VehicleGPSData r7 = (app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult.VehicleGPSData) r7
            app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData r7 = r7.f4342a
            r0.label = r4
            java.lang.Object r6 = r6.g0(r7, r5, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r3
        L7d:
            boolean r6 = r7 instanceof app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult.Error
            if (r6 == 0) goto L82
            return r3
        L82:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.E(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl, app.chalo.livetracking.provider.tracking.LiveVehicleDetailsResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1 premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1;
        premiumReserveTicketPostBookingActionHandlerImpl.getClass();
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
        }
        Object objL = premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1.label = 1;
            objL = premiumReserveTicketPostBookingActionHandlerImpl.L(premiumReserveTicketPostBookingActionHandlerImpl$showGpsStartedInfoMsg$1);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        premiumReserveTicketPostBookingActionHandlerImpl.f0(new eu0((String) objL, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r6 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl r5, app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkAndGetNewBookingIfCurrentBookingIsRescheduledAndNewBookingIsAvailable$1
            if (r0 == 0) goto L16
            r0 = r7
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkAndGetNewBookingIfCurrentBookingIsRescheduledAndNewBookingIsAvailable$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkAndGetNewBookingIfCurrentBookingIsRescheduledAndNewBookingIsAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkAndGetNewBookingIfCurrentBookingIsRescheduledAndNewBookingIsAvailable$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$checkAndGetNewBookingIfCurrentBookingIsRescheduledAndNewBookingIsAvailable$1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r7)
            goto L62
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.b(r7)
            if (r6 == 0) goto L49
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r7 = r6.f7113a
            app.chalo.premiumbus.data.models.app.FirstBookingAppModel r7 = r7.l
            if (r7 == 0) goto L49
            java.lang.String r7 = r7.f7082a
            if (r7 != 0) goto L47
            goto L49
        L47:
            r6 = r7
            goto L54
        L49:
            if (r6 == 0) goto L50
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r6 = r6.f7113a
            java.lang.String r6 = r6.f7114a
            goto L51
        L50:
            r6 = r4
        L51:
            if (r6 != 0) goto L54
            goto L71
        L54:
            app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase r5 = r5.k
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r5 = r6
        L62:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r7
            if (r7 == 0) goto L71
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r6 = r7.f7113a
            java.lang.String r6 = r6.f7114a
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L71
            return r7
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.x(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl, app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1 premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1;
        premiumReserveTicketPostBookingActionHandlerImpl.getClass();
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1(premiumReserveTicketPostBookingActionHandlerImpl, continuationImpl);
        }
        Object objO = premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1.label = 1;
            objO = premiumReserveTicketPostBookingActionHandlerImpl.O(premiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingNotStartedInfoMsgNeedsToBeShown$1);
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
        }
        String str = (String) objO;
        if (((PremiumReserveTicketPostBookingActionState) FlowKt.c(premiumReserveTicketPostBookingActionHandlerImpl.H).getValue()).p instanceof PremiumReserveTicketTrackingState.Unknown) {
            premiumReserveTicketPostBookingActionHandlerImpl.f0(new eu0(str, 5));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:114:0x0322  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1 A[EDGE_INSN: B:142:0x01c1->B:53:0x01c1 BREAK  A[LOOP:0: B:51:0x01a3->B:76:0x0249], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x019a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x020d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0212  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:74:0x023c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0249 A[LOOP:0: B:51:0x01a3->B:76:0x0249, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01d1, please report this as an issue */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.Integer, java.lang.Number] */
    public static final Object z(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, String str, PremiumReserveTicketStatus premiumReserveTicketStatus, PremiumBusBookingVehicleInfoAppModel premiumBusBookingVehicleInfoAppModel, PremiumBusBookingTripTimeInfoAppModel premiumBusBookingTripTimeInfoAppModel, List list, List list2, boolean z, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel, Continuation continuation) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1 premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1;
        Ref.ObjectRef objectRefV;
        Ref.BooleanRef booleanRef;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState;
        List list3;
        List list4;
        String str2;
        boolean z2;
        PremiumBusBookingVehicleInfoAppModel vehicleInfo;
        Ref.ObjectRef objectRef;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel2;
        PremiumReserveTicketStatus premiumReserveTicketStatus2;
        Ref.BooleanRef booleanRef2;
        boolean z3;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel3;
        PremiumBusBookingTripTimeInfoAppModel premiumBusBookingTripTimeInfoAppModel2;
        List list5;
        Ref.ObjectRef objectRef2;
        String str3;
        Ref.BooleanRef booleanRef3;
        PremiumReserveTicketStatus premiumReserveTicketStatus3;
        Ref.BooleanRef booleanRef4;
        List list6;
        List list7;
        String str4;
        boolean z4;
        PremiumBusBookingTripTimeInfoAppModel premiumBusBookingTripTimeInfoAppModel3;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel4;
        PremiumBusBookingVehicleInfoAppModel premiumBusBookingVehicleInfoAppModel2;
        Ref.ObjectRef objectRef3;
        PremiumBusBookingTripTimeInfoAppModel.LiveEta liveEta;
        ?? r11;
        Object obj;
        ProcessPremiumBusTripTimeInfoUseCase processPremiumBusTripTimeInfoUseCase;
        boolean z5;
        MutableStateFlow mutableStateFlow;
        Object value;
        Ref.BooleanRef booleanRef5;
        Ref.ObjectRef objectRef4;
        ProcessPremiumBusTripTimeInfoUseCase processPremiumBusTripTimeInfoUseCase2;
        long j;
        long j2;
        long j3;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState2;
        PremiumBusTripScheduleTag f7414a;
        Object objE;
        Object obj2;
        Object obj3;
        Ref.ObjectRef objectRef5;
        Ref.BooleanRef booleanRef6;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        String str5;
        boolean z6;
        int iIntValue;
        PremiumBusBookingVehicleInfoState vehicleNotAssigned;
        Object objB;
        List list8;
        Ref.BooleanRef booleanRef7;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel5;
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState3;
        PremiumReserveTicketStatus premiumReserveTicketStatus4;
        List list9;
        Ref.ObjectRef objectRef6;
        boolean z7;
        String str6 = str;
        List list10 = list;
        List list11 = list2;
        ProcessPremiumBusTripTimeInfoUseCase processPremiumBusTripTimeInfoUseCase3 = premiumReserveTicketPostBookingActionHandlerImpl.e;
        MutableStateFlow mutableStateFlow2 = premiumReserveTicketPostBookingActionHandlerImpl.H;
        if (continuation instanceof PremiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1) continuation;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1(premiumReserveTicketPostBookingActionHandlerImpl, continuation);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1(premiumReserveTicketPostBookingActionHandlerImpl, continuation);
        }
        Object objV = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.result;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label;
        if (i2 == 0) {
            objectRefV = uf0.v(objV);
            booleanRef = new Ref.BooleanRef();
            if (premiumBusBookingTripTimeInfoAppModel instanceof PremiumBusBookingTripTimeInfoAppModel.LiveEta) {
                if (((PremiumBusBookingTripTimeInfoAppModel.LiveEta) premiumBusBookingTripTimeInfoAppModel).b) {
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str6;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = premiumBusBookingVehicleInfoAppModel;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = premiumBusBookingTripTimeInfoAppModel;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list10;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = list11;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = vehicleBreakdownAppResponseModel;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = objectRefV;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8 = booleanRef;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 1;
                    if (premiumReserveTicketPostBookingActionHandlerImpl.R(premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1) == obj4) {
                        return obj4;
                    }
                    premiumReserveTicketStatus3 = premiumReserveTicketStatus;
                    booleanRef4 = booleanRef;
                    list6 = list10;
                    list7 = list11;
                    str4 = str6;
                    z4 = z;
                    premiumBusBookingTripTimeInfoAppModel3 = premiumBusBookingTripTimeInfoAppModel;
                    vehicleBreakdownAppResponseModel4 = vehicleBreakdownAppResponseModel;
                    premiumBusBookingVehicleInfoAppModel2 = premiumBusBookingVehicleInfoAppModel;
                    objectRef3 = objectRefV;
                    str3 = str4;
                    z3 = z4;
                    booleanRef3 = booleanRef4;
                    objectRef2 = objectRef3;
                    vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel4;
                    list5 = list7;
                    list10 = list6;
                    premiumBusBookingTripTimeInfoAppModel2 = premiumBusBookingTripTimeInfoAppModel3;
                    vehicleInfo = premiumBusBookingVehicleInfoAppModel2;
                    premiumReserveTicketStatus2 = premiumReserveTicketStatus3;
                } else {
                    premiumBusBookingTripTimeInfoAppModel2 = premiumBusBookingTripTimeInfoAppModel;
                    list5 = list11;
                    z3 = z;
                    vehicleInfo = premiumBusBookingVehicleInfoAppModel;
                    vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel;
                    premiumReserveTicketStatus2 = premiumReserveTicketStatus;
                    objectRef2 = objectRefV;
                    str3 = str6;
                    booleanRef3 = booleanRef;
                }
                liveEta = (PremiumBusBookingTripTimeInfoAppModel.LiveEta) premiumBusBookingTripTimeInfoAppModel2;
                r11 = liveEta.e;
                objectRef2.element = r11;
                if (r11 != 0) {
                    obj = obj4;
                    processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase3;
                    z5 = false;
                } else {
                    obj = obj4;
                    processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase3;
                    z5 = false;
                }
                booleanRef3.element = z5;
                mutableStateFlow = premiumReserveTicketPostBookingActionHandlerImpl.a0;
                while (true) {
                    value = mutableStateFlow.getValue();
                    ((Number) value).longValue();
                    booleanRef5 = booleanRef3;
                    objectRef4 = objectRef2;
                    processPremiumBusTripTimeInfoUseCase2 = processPremiumBusTripTimeInfoUseCase;
                    if (mutableStateFlow.c(value, new Long(liveEta.c))) {
                        break;
                        break;
                    }
                    objectRef2 = objectRef4;
                    processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase2;
                    booleanRef3 = booleanRef5;
                }
                j = premiumReserveTicketPostBookingActionHandlerImpl.D.j();
                j2 = premiumReserveTicketPostBookingActionHandlerImpl.j0;
                j3 = j - j2;
                if (j3 > premiumReserveTicketPostBookingActionHandlerImpl.k0) {
                    PremiumBusAnalyticsHelper premiumBusAnalyticsHelper = premiumReserveTicketPostBookingActionHandlerImpl.t;
                    premiumReserveTicketAppModel = premiumReserveTicketPostBookingActionHandlerImpl.K;
                    if (premiumReserveTicketAppModel != null) {
                        str5 = premiumReserveTicketAppModel.f7113a.f7114a;
                    } else {
                        str5 = "";
                    }
                    String str7 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f7117a : "";
                    if (j2 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    premiumBusAnalyticsHelper.j(str5, str7, j2, z6, j, j3);
                }
                premiumReserveTicketPostBookingActionHandlerImpl.j0 = j;
                premiumBusBookingTripTimeInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
                if (premiumBusBookingTripTimeInfoState2 != null) {
                    f7414a = premiumBusBookingTripTimeInfoState2.getF7414a();
                } else {
                    f7414a = null;
                }
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus2;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = vehicleInfo;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = list10;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list5;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = vehicleBreakdownAppResponseModel3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = objectRef4;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = booleanRef5;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 2;
                objE = processPremiumBusTripTimeInfoUseCase2.e(premiumBusBookingTripTimeInfoAppModel2, f7414a, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                obj2 = obj;
                if (objE == obj2) {
                    return obj2;
                }
                obj3 = objE;
                objectRef5 = objectRef4;
                booleanRef6 = booleanRef5;
                premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) obj3;
                String str8 = str3;
                objectRefV = objectRef5;
                str6 = str8;
                booleanRef = booleanRef6;
                obj4 = obj2;
                list11 = list5;
            } else {
                if ((premiumBusBookingTripTimeInfoAppModel instanceof PremiumBusBookingTripTimeInfoAppModel.ExpectedTime) || Intrinsics.d(premiumBusBookingTripTimeInfoAppModel, PremiumBusBookingTripTimeInfoAppModel.NotFetched.f7290a)) {
                    premiumBusBookingTripTimeInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
                    if (premiumBusBookingTripTimeInfoState == null || (!(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.BusPassedPickupStop))) {
                        PremiumBusTripScheduleTag f7414a2 = premiumBusBookingTripTimeInfoState != null ? premiumBusBookingTripTimeInfoState.getF7414a() : null;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str6;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = premiumBusBookingVehicleInfoAppModel;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = list10;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list11;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = vehicleBreakdownAppResponseModel;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = objectRefV;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = booleanRef;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z;
                        premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 3;
                        Object objE2 = processPremiumBusTripTimeInfoUseCase3.e(premiumBusBookingTripTimeInfoAppModel, f7414a2, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                        if (objE2 == obj4) {
                            return obj4;
                        }
                        list3 = list10;
                        list4 = list11;
                        str2 = str6;
                        z2 = z;
                        vehicleInfo = premiumBusBookingVehicleInfoAppModel;
                        objectRef = objectRefV;
                        objV = objE2;
                        vehicleBreakdownAppResponseModel2 = vehicleBreakdownAppResponseModel;
                        premiumReserveTicketStatus2 = premiumReserveTicketStatus;
                        booleanRef2 = booleanRef;
                        List list12 = list3;
                        list11 = list4;
                        list10 = list12;
                        z3 = z2;
                        booleanRef = booleanRef2;
                        str6 = str2;
                        premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) objV;
                        objectRefV = objectRef;
                        vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel2;
                    }
                } else {
                    if (!Intrinsics.d(premiumBusBookingTripTimeInfoAppModel, PremiumBusBookingTripTimeInfoAppModel.LiveEtaNotAvailable.f7289a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    premiumBusBookingTripTimeInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
                }
                z3 = z;
                vehicleInfo = premiumBusBookingVehicleInfoAppModel;
                vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel;
                premiumReserveTicketStatus2 = premiumReserveTicketStatus;
            }
            Intrinsics.i(vehicleInfo, "vehicleInfo");
            if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                new PremiumBusBookingVehicleInfoState.NotFetched(null);
                throw null;
            }
            if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned.f7291a, vehicleAssigned.b, vehicleAssigned.c, vehicleAssigned.d);
            } else {
                if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                    throw new NoWhenBranchMatchedException();
                }
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
            }
            PremiumBusDataStoreWrapper premiumBusDataStoreWrapper = premiumReserveTicketPostBookingActionHandlerImpl.F;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
            objB = premiumBusDataStoreWrapper.b(str6);
            obj4 = obj4;
            if (objB == obj4) {
                return obj4;
            }
            list8 = list11;
            booleanRef7 = booleanRef;
            vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
            premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
            list9 = list10;
            objectRef6 = objectRefV;
            objV = objB;
            z7 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
            objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            if (objV == obj4) {
                return obj4;
            }
        } else if (i2 == 1) {
            z4 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0;
            booleanRef4 = (Ref.BooleanRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8;
            objectRef3 = (Ref.ObjectRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7;
            vehicleBreakdownAppResponseModel4 = (VehicleBreakdownAppResponseModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6;
            list7 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5;
            list6 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4;
            premiumBusBookingTripTimeInfoAppModel3 = (PremiumBusBookingTripTimeInfoAppModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3;
            premiumBusBookingVehicleInfoAppModel2 = (PremiumBusBookingVehicleInfoAppModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2;
            premiumReserveTicketStatus3 = (PremiumReserveTicketStatus) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1;
            str4 = (String) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0;
            ResultKt.b(objV);
            str3 = str4;
            z3 = z4;
            booleanRef3 = booleanRef4;
            objectRef2 = objectRef3;
            vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel4;
            list5 = list7;
            list10 = list6;
            premiumBusBookingTripTimeInfoAppModel2 = premiumBusBookingTripTimeInfoAppModel3;
            vehicleInfo = premiumBusBookingVehicleInfoAppModel2;
            premiumReserveTicketStatus2 = premiumReserveTicketStatus3;
            liveEta = (PremiumBusBookingTripTimeInfoAppModel.LiveEta) premiumBusBookingTripTimeInfoAppModel2;
            r11 = liveEta.e;
            objectRef2.element = r11;
            if (r11 != 0 || (iIntValue = r11.intValue()) < 0) {
                obj = obj4;
            } else {
                obj = obj4;
                if (iIntValue < 501) {
                    processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase3;
                    if (liveEta.f7288a >= 0 && !premiumReserveTicketPostBookingActionHandlerImpl.i0) {
                        z5 = true;
                    }
                    booleanRef3.element = z5;
                    mutableStateFlow = premiumReserveTicketPostBookingActionHandlerImpl.a0;
                    while (true) {
                        value = mutableStateFlow.getValue();
                        ((Number) value).longValue();
                        booleanRef5 = booleanRef3;
                        objectRef4 = objectRef2;
                        processPremiumBusTripTimeInfoUseCase2 = processPremiumBusTripTimeInfoUseCase;
                        if (mutableStateFlow.c(value, new Long(liveEta.c))) {
                            break;
                        }
                        objectRef2 = objectRef4;
                        processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase2;
                        booleanRef3 = booleanRef5;
                    }
                    j = premiumReserveTicketPostBookingActionHandlerImpl.D.j();
                    j2 = premiumReserveTicketPostBookingActionHandlerImpl.j0;
                    j3 = j - j2;
                    if (j3 > premiumReserveTicketPostBookingActionHandlerImpl.k0) {
                        PremiumBusAnalyticsHelper premiumBusAnalyticsHelper2 = premiumReserveTicketPostBookingActionHandlerImpl.t;
                        premiumReserveTicketAppModel = premiumReserveTicketPostBookingActionHandlerImpl.K;
                        if (premiumReserveTicketAppModel != null) {
                            str5 = premiumReserveTicketAppModel.f7113a.f7114a;
                        } else {
                            str5 = "";
                        }
                        String str9 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f7117a : "";
                        if (j2 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        premiumBusAnalyticsHelper2.j(str5, str9, j2, z6, j, j3);
                    }
                    premiumReserveTicketPostBookingActionHandlerImpl.j0 = j;
                    premiumBusBookingTripTimeInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
                    if (premiumBusBookingTripTimeInfoState2 != null) {
                        f7414a = premiumBusBookingTripTimeInfoState2.getF7414a();
                    } else {
                        f7414a = null;
                    }
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus2;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = vehicleInfo;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = list10;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list5;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = vehicleBreakdownAppResponseModel3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = objectRef4;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = booleanRef5;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8 = null;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 2;
                    objE = processPremiumBusTripTimeInfoUseCase2.e(premiumBusBookingTripTimeInfoAppModel2, f7414a, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                    obj2 = obj;
                    if (objE == obj2) {
                        return obj2;
                    }
                    obj3 = objE;
                    objectRef5 = objectRef4;
                    booleanRef6 = booleanRef5;
                    premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) obj3;
                    String str10 = str3;
                    objectRefV = objectRef5;
                    str6 = str10;
                    booleanRef = booleanRef6;
                    obj4 = obj2;
                    list11 = list5;
                    Intrinsics.i(vehicleInfo, "vehicleInfo");
                    if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                        new PremiumBusBookingVehicleInfoState.NotFetched(null);
                        throw null;
                    }
                    if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                        PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned2 = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                        vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned2.f7291a, vehicleAssigned2.b, vehicleAssigned2.c, vehicleAssigned2.d);
                    } else {
                        if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
                    }
                    PremiumBusDataStoreWrapper premiumBusDataStoreWrapper2 = premiumReserveTicketPostBookingActionHandlerImpl.F;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
                    objB = premiumBusDataStoreWrapper2.b(str6);
                    obj4 = obj4;
                    if (objB == obj4) {
                        return obj4;
                    }
                    list8 = list11;
                    booleanRef7 = booleanRef;
                    vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
                    premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
                    premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
                    list9 = list10;
                    objectRef6 = objectRefV;
                    objV = objB;
                    z7 = z3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
                    premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
                    objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                    if (objV == obj4) {
                        return obj4;
                    }
                }
                z5 = false;
                booleanRef3.element = z5;
                mutableStateFlow = premiumReserveTicketPostBookingActionHandlerImpl.a0;
                while (true) {
                    value = mutableStateFlow.getValue();
                    ((Number) value).longValue();
                    booleanRef5 = booleanRef3;
                    objectRef4 = objectRef2;
                    processPremiumBusTripTimeInfoUseCase2 = processPremiumBusTripTimeInfoUseCase;
                    if (mutableStateFlow.c(value, new Long(liveEta.c))) {
                        break;
                        break;
                    }
                    objectRef2 = objectRef4;
                    processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase2;
                    booleanRef3 = booleanRef5;
                }
                j = premiumReserveTicketPostBookingActionHandlerImpl.D.j();
                j2 = premiumReserveTicketPostBookingActionHandlerImpl.j0;
                j3 = j - j2;
                if (j3 > premiumReserveTicketPostBookingActionHandlerImpl.k0) {
                    PremiumBusAnalyticsHelper premiumBusAnalyticsHelper3 = premiumReserveTicketPostBookingActionHandlerImpl.t;
                    premiumReserveTicketAppModel = premiumReserveTicketPostBookingActionHandlerImpl.K;
                    if (premiumReserveTicketAppModel != null) {
                        str5 = premiumReserveTicketAppModel.f7113a.f7114a;
                    } else {
                        str5 = "";
                    }
                    String str11 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f7117a : "";
                    if (j2 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    premiumBusAnalyticsHelper3.j(str5, str11, j2, z6, j, j3);
                }
                premiumReserveTicketPostBookingActionHandlerImpl.j0 = j;
                premiumBusBookingTripTimeInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
                if (premiumBusBookingTripTimeInfoState2 != null) {
                    f7414a = premiumBusBookingTripTimeInfoState2.getF7414a();
                } else {
                    f7414a = null;
                }
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus2;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = vehicleInfo;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = list10;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list5;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = vehicleBreakdownAppResponseModel3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = objectRef4;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = booleanRef5;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 2;
                objE = processPremiumBusTripTimeInfoUseCase2.e(premiumBusBookingTripTimeInfoAppModel2, f7414a, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                obj2 = obj;
                if (objE == obj2) {
                    return obj2;
                }
                obj3 = objE;
                objectRef5 = objectRef4;
                booleanRef6 = booleanRef5;
                premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) obj3;
                String str12 = str3;
                objectRefV = objectRef5;
                str6 = str12;
                booleanRef = booleanRef6;
                obj4 = obj2;
                list11 = list5;
                Intrinsics.i(vehicleInfo, "vehicleInfo");
                if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                    new PremiumBusBookingVehicleInfoState.NotFetched(null);
                    throw null;
                }
                if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                    PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned3 = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                    vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned3.f7291a, vehicleAssigned3.b, vehicleAssigned3.c, vehicleAssigned3.d);
                } else {
                    if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
                }
                PremiumBusDataStoreWrapper premiumBusDataStoreWrapper3 = premiumReserveTicketPostBookingActionHandlerImpl.F;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
                objB = premiumBusDataStoreWrapper3.b(str6);
                obj4 = obj4;
                if (objB == obj4) {
                    return obj4;
                }
                list8 = list11;
                booleanRef7 = booleanRef;
                vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
                premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
                premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
                list9 = list10;
                objectRef6 = objectRefV;
                objV = objB;
                z7 = z3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
                premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
                objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
                if (objV == obj4) {
                    return obj4;
                }
            }
            processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase3;
            z5 = false;
            booleanRef3.element = z5;
            mutableStateFlow = premiumReserveTicketPostBookingActionHandlerImpl.a0;
            while (true) {
                value = mutableStateFlow.getValue();
                ((Number) value).longValue();
                booleanRef5 = booleanRef3;
                objectRef4 = objectRef2;
                processPremiumBusTripTimeInfoUseCase2 = processPremiumBusTripTimeInfoUseCase;
                if (mutableStateFlow.c(value, new Long(liveEta.c))) {
                    break;
                    break;
                }
                objectRef2 = objectRef4;
                processPremiumBusTripTimeInfoUseCase = processPremiumBusTripTimeInfoUseCase2;
                booleanRef3 = booleanRef5;
            }
            j = premiumReserveTicketPostBookingActionHandlerImpl.D.j();
            j2 = premiumReserveTicketPostBookingActionHandlerImpl.j0;
            j3 = j - j2;
            if (j3 > premiumReserveTicketPostBookingActionHandlerImpl.k0) {
                PremiumBusAnalyticsHelper premiumBusAnalyticsHelper4 = premiumReserveTicketPostBookingActionHandlerImpl.t;
                premiumReserveTicketAppModel = premiumReserveTicketPostBookingActionHandlerImpl.K;
                if (premiumReserveTicketAppModel != null) {
                    str5 = premiumReserveTicketAppModel.f7113a.f7114a;
                } else {
                    str5 = "";
                }
                String str13 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f7117a : "";
                if (j2 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                premiumBusAnalyticsHelper4.j(str5, str13, j2, z6, j, j3);
            }
            premiumReserveTicketPostBookingActionHandlerImpl.j0 = j;
            premiumBusBookingTripTimeInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow2).getValue()).k;
            if (premiumBusBookingTripTimeInfoState2 != null) {
                f7414a = premiumBusBookingTripTimeInfoState2.getF7414a();
            } else {
                f7414a = null;
            }
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = str3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = premiumReserveTicketStatus2;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = vehicleInfo;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = list10;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = list5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = vehicleBreakdownAppResponseModel3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = objectRef4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = booleanRef5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$8 = null;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 2;
            objE = processPremiumBusTripTimeInfoUseCase2.e(premiumBusBookingTripTimeInfoAppModel2, f7414a, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            obj2 = obj;
            if (objE == obj2) {
                return obj2;
            }
            obj3 = objE;
            objectRef5 = objectRef4;
            booleanRef6 = booleanRef5;
            premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) obj3;
            String str14 = str3;
            objectRefV = objectRef5;
            str6 = str14;
            booleanRef = booleanRef6;
            obj4 = obj2;
            list11 = list5;
            Intrinsics.i(vehicleInfo, "vehicleInfo");
            if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                new PremiumBusBookingVehicleInfoState.NotFetched(null);
                throw null;
            }
            if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned4 = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned4.f7291a, vehicleAssigned4.b, vehicleAssigned4.c, vehicleAssigned4.d);
            } else {
                if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                    throw new NoWhenBranchMatchedException();
                }
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
            }
            PremiumBusDataStoreWrapper premiumBusDataStoreWrapper4 = premiumReserveTicketPostBookingActionHandlerImpl.F;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
            objB = premiumBusDataStoreWrapper4.b(str6);
            obj4 = obj4;
            if (objB == obj4) {
                return obj4;
            }
            list8 = list11;
            booleanRef7 = booleanRef;
            vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
            premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
            list9 = list10;
            objectRef6 = objectRefV;
            objV = objB;
            z7 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
            objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            if (objV == obj4) {
                return obj4;
            }
        } else if (i2 == 2) {
            boolean z8 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0;
            booleanRef6 = (Ref.BooleanRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7;
            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6;
            VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel6 = (VehicleBreakdownAppResponseModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5;
            List list13 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4;
            List list14 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3;
            vehicleInfo = (PremiumBusBookingVehicleInfoAppModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2;
            premiumReserveTicketStatus2 = (PremiumReserveTicketStatus) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1;
            String str15 = (String) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0;
            ResultKt.b(objV);
            obj3 = objV;
            str3 = str15;
            z3 = z8;
            objectRef5 = objectRef7;
            vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel6;
            list5 = list13;
            list10 = list14;
            obj2 = obj4;
            premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) obj3;
            String str16 = str3;
            objectRefV = objectRef5;
            str6 = str16;
            booleanRef = booleanRef6;
            obj4 = obj2;
            list11 = list5;
            Intrinsics.i(vehicleInfo, "vehicleInfo");
            if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                new PremiumBusBookingVehicleInfoState.NotFetched(null);
                throw null;
            }
            if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned5 = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned5.f7291a, vehicleAssigned5.b, vehicleAssigned5.c, vehicleAssigned5.d);
            } else {
                if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                    throw new NoWhenBranchMatchedException();
                }
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
            }
            PremiumBusDataStoreWrapper premiumBusDataStoreWrapper5 = premiumReserveTicketPostBookingActionHandlerImpl.F;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
            objB = premiumBusDataStoreWrapper5.b(str6);
            obj4 = obj4;
            if (objB == obj4) {
                return obj4;
            }
            list8 = list11;
            booleanRef7 = booleanRef;
            vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
            premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
            list9 = list10;
            objectRef6 = objectRefV;
            objV = objB;
            z7 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
            objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            if (objV == obj4) {
                return obj4;
            }
        } else if (i2 == 3) {
            z2 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0;
            booleanRef2 = (Ref.BooleanRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7;
            objectRef = (Ref.ObjectRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6;
            vehicleBreakdownAppResponseModel2 = (VehicleBreakdownAppResponseModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5;
            list4 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4;
            list3 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3;
            vehicleInfo = (PremiumBusBookingVehicleInfoAppModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2;
            premiumReserveTicketStatus2 = (PremiumReserveTicketStatus) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1;
            str2 = (String) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0;
            ResultKt.b(objV);
            List list15 = list3;
            list11 = list4;
            list10 = list15;
            z3 = z2;
            booleanRef = booleanRef2;
            str6 = str2;
            premiumBusBookingTripTimeInfoState = (PremiumBusBookingTripTimeInfoState) objV;
            objectRefV = objectRef;
            vehicleBreakdownAppResponseModel3 = vehicleBreakdownAppResponseModel2;
            Intrinsics.i(vehicleInfo, "vehicleInfo");
            if (!(vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.NotFetched)) {
                new PremiumBusBookingVehicleInfoState.NotFetched(null);
                throw null;
            }
            if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) {
                PremiumBusBookingVehicleInfoAppModel.VehicleAssigned vehicleAssigned6 = (PremiumBusBookingVehicleInfoAppModel.VehicleAssigned) vehicleInfo;
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleAssigned(vehicleAssigned6.f7291a, vehicleAssigned6.b, vehicleAssigned6.c, vehicleAssigned6.d);
            } else {
                if (vehicleInfo instanceof PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) {
                    throw new NoWhenBranchMatchedException();
                }
                vehicleNotAssigned = new PremiumBusBookingVehicleInfoState.VehicleNotAssigned(((PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned) vehicleInfo).f7292a);
            }
            PremiumBusDataStoreWrapper premiumBusDataStoreWrapper6 = premiumReserveTicketPostBookingActionHandlerImpl.F;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus2;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list10;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list11;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRefV;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 4;
            objB = premiumBusDataStoreWrapper6.b(str6);
            obj4 = obj4;
            if (objB == obj4) {
                return obj4;
            }
            list8 = list11;
            booleanRef7 = booleanRef;
            vehicleBreakdownAppResponseModel5 = vehicleBreakdownAppResponseModel3;
            premiumBusBookingTripTimeInfoState3 = premiumBusBookingTripTimeInfoState;
            premiumReserveTicketStatus4 = premiumReserveTicketStatus2;
            list9 = list10;
            objectRef6 = objectRefV;
            objV = objB;
            z7 = z3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
            objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            if (objV == obj4) {
                return obj4;
            }
        } else if (i2 == 4) {
            z7 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0;
            vehicleNotAssigned = (PremiumBusBookingVehicleInfoState) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7;
            premiumBusBookingTripTimeInfoState3 = (PremiumBusBookingTripTimeInfoState) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6;
            booleanRef7 = (Ref.BooleanRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5;
            objectRef6 = (Ref.ObjectRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4;
            vehicleBreakdownAppResponseModel5 = (VehicleBreakdownAppResponseModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3;
            list8 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2;
            list9 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1;
            premiumReserveTicketStatus4 = (PremiumReserveTicketStatus) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0;
            ResultKt.b(objV);
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0 = premiumReserveTicketStatus4;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1 = list9;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2 = list8;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3 = vehicleBreakdownAppResponseModel5;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4 = objectRef6;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5 = booleanRef7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6 = premiumBusBookingTripTimeInfoState3;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7 = vehicleNotAssigned;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0 = z7;
            premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.label = 5;
            objV = FlowKt.v((Flow) objV, premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1);
            if (objV == obj4) {
                return obj4;
            }
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.Z$0;
            vehicleNotAssigned = (PremiumBusBookingVehicleInfoState) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$7;
            premiumBusBookingTripTimeInfoState3 = (PremiumBusBookingTripTimeInfoState) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$6;
            booleanRef7 = (Ref.BooleanRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$5;
            objectRef6 = (Ref.ObjectRef) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$4;
            vehicleBreakdownAppResponseModel5 = (VehicleBreakdownAppResponseModel) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$3;
            list8 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$2;
            list9 = (List) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$1;
            premiumReserveTicketStatus4 = (PremiumReserveTicketStatus) premiumReserveTicketPostBookingActionHandlerImpl$handlePremiumBusTripDetailsPollingResult$1.L$0;
            ResultKt.b(objV);
        }
        boolean zD = Intrinsics.d(objV, Boolean.TRUE);
        UserProfileAppModel userProfileAppModelF = premiumReserveTicketPostBookingActionHandlerImpl.E.f();
        Gender gender = userProfileAppModelF != null ? userProfileAppModelF.d : Gender.MALE;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = premiumReserveTicketPostBookingActionHandlerImpl.K;
        premiumReserveTicketPostBookingActionHandlerImpl.f0(new y20(premiumBusBookingTripTimeInfoState3, vehicleNotAssigned, booleanRef7, objectRef6, list9, list8, new WomenAdjacencyPromiseState(z7, list8, premiumReserveTicketStatus4, gender, zD, premiumReserveTicketAppModel2 != null && premiumReserveTicketAppModel2.e()), vehicleBreakdownAppResponseModel5));
        if (vehicleBreakdownAppResponseModel5 == null || !premiumReserveTicketPostBookingActionHandlerImpl.U()) {
            premiumReserveTicketPostBookingActionHandlerImpl.b0();
        } else {
            Job job = premiumReserveTicketPostBookingActionHandlerImpl.S;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
        }
        return Unit.f17538a;
    }

    public final void G() {
        Job job = this.M;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.M = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$checkIfTrackingAllowedOrStartCheckingJob$1(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    public final Object H(String str, LatLng latLng, long j, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1 premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1;
        LatLng latLng2;
        String str2;
        boolean z3;
        Object obj;
        boolean z4;
        LiveBusDelayedState liveBusDelayedState;
        boolean z5;
        String str3;
        String str4;
        ?? arrayList;
        List list;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1(this, continuationImpl);
        }
        Object objA = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$0 = str;
            latLng2 = latLng;
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$1 = latLng2;
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$0 = z;
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$1 = z2;
            premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.label = 1;
            Object objA2 = this.m.a(j, premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1);
            if (objA2 != coroutineSingletons) {
                str2 = str;
                z3 = z2;
                obj = objA2;
                z4 = z;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            boolean z6 = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$1;
            z4 = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$0;
            LatLng latLng3 = (LatLng) premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$1;
            str2 = (String) premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$0;
            ResultKt.b(objA);
            obj = objA;
            z3 = z6;
            latLng2 = latLng3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$0;
            latLng2 = (LatLng) premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$2;
            str3 = (String) premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$1;
            liveBusDelayedState = (LiveBusDelayedState) premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$0;
            ResultKt.b(objA);
        }
        return new PremiumBusLiveBusMarkerUIState(str3, latLng2, (PlatformMapMarkerBitmap) objA, z5, liveBusDelayedState instanceof LiveBusDelayedState.Delayed, this.x);
        LiveBusDelayedState liveBusDelayedState2 = (LiveBusDelayedState) obj;
        Float f = null;
        if (z3) {
            RouteAppModel routeAppModel = this.O;
            if (routeAppModel == null || (str4 = routeAppModel.m) == null) {
                str4 = "";
            }
            if (routeAppModel == null || (list = routeAppModel.e) == null) {
                arrayList = EmptyList.f17557a;
            } else {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StopAppModel) it.next()).c);
                }
            }
            LatLng latLngA = RouteDetailsUtils.a(latLng2, MapUtilsKt.a(str4, this.y, arrayList));
            if (latLngA != null) {
                f = new Float((float) GeometryUtils.a(latLng2, latLngA));
            }
        }
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$0 = liveBusDelayedState2;
        premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$1 = str2;
        premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.L$2 = latLng2;
        premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.Z$0 = z4;
        premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1.label = 2;
        objA = this.n.a(fFloatValue, liveBusDelayedState2, z4, z3, premiumReserveTicketPostBookingActionHandlerImpl$createLiveBusMarker$1);
        liveBusDelayedState = liveBusDelayedState2;
        if (objA != coroutineSingletons) {
            z5 = z4;
            str3 = str2;
            return new PremiumBusLiveBusMarkerUIState(str3, latLng2, (PlatformMapMarkerBitmap) objA, z5, liveBusDelayedState instanceof LiveBusDelayedState.Delayed, this.x);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1 premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1;
        PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1(this, continuationImpl);
        }
        Object objA = premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel = this.X;
            if (premiumBusNativeCityWiseConfigAppModel != null) {
                return premiumBusNativeCityWiseConfigAppModel;
            }
            premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.L$0 = this;
            premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.label = 1;
            objA = this.f.a(premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            premiumReserveTicketPostBookingActionHandlerImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketPostBookingActionHandlerImpl = (PremiumReserveTicketPostBookingActionHandlerImpl) premiumReserveTicketPostBookingActionHandlerImpl$currentCityConfig$1.L$0;
            ResultKt.b(objA);
        }
        PremiumBusNativeCityWiseConfigAppModel premiumBusNativeCityWiseConfigAppModel2 = (PremiumBusNativeCityWiseConfigAppModel) objA;
        premiumReserveTicketPostBookingActionHandlerImpl.X = premiumBusNativeCityWiseConfigAppModel2;
        return premiumBusNativeCityWiseConfigAppModel2;
    }

    public final void J(PremiumReserveTicketPostBookingActionEffect premiumReserveTicketPostBookingActionEffect) {
        BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$emitSideEffect$1(this, premiumReserveTicketPostBookingActionEffect, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[PHI: r7
      0x0084: PHI (r7v1 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r7v0 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r7v2 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:19:0x0050, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r8 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$getDialogTypeForTicket$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$getDialogTypeForTicket$1 r0 = (app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$getDialogTypeForTicket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$getDialogTypeForTicket$1 r0 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$getDialogTypeForTicket$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L75
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L91
        L41:
            java.lang.Object r7 = r0.L$0
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r7 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L5f
        L49:
            kotlin.ResultKt.b(r8)
            boolean r8 = r7.d()
            if (r8 != 0) goto L84
            r0.L$0 = r7
            r0.label = r5
            app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase r8 = r6.B
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L5f
            goto L90
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L68
            goto L84
        L68:
            r0.L$0 = r7
            r0.label = r3
            app.chalo.contract.BasicInfoContract r8 = r6.b
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L75
            goto L90
        L75:
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            boolean r7 = r7.c(r0)
            if (r7 == 0) goto La6
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType$Expired r7 = app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType.Expired.f7421a
            return r7
        L84:
            r0.L$0 = r7
            r0.label = r4
            app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase r8 = r6.C
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData r8 = (app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData) r8
            if (r8 == 0) goto La6
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r7 = r7.f7113a
            java.lang.String r0 = r7.f7114a
            app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus r7 = r7.h
            app.chalo.premiumbus.PremiumBusAnalyticsHelper r1 = r6.t
            r1.h(r0, r7)
            app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType$BookingAckRequired r7 = new app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType$BookingAckRequired
            r7.<init>(r8)
            return r7
        La6:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl.K(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1 premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1;
        long j;
        int i;
        Object[] objArr;
        StringEnum stringEnum;
        Object[] objArr2;
        TimeUtilsContract timeUtilsContract;
        StringProvider stringProvider;
        Object objB;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1) continuationImpl;
            int i2 = premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1(this, continuationImpl);
        }
        Object objC = premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label;
        BasicInfoContract basicInfoContract = this.b;
        if (i3 == 0) {
            ResultKt.b(objC);
            PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).k;
            if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
                j = ((PremiumBusBookingTripTimeInfoState.ExpectedTime) premiumBusBookingTripTimeInfoState).d;
            } else {
                if (!Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) && !Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.NotFetched.b) && premiumBusBookingTripTimeInfoState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
                j = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.c : -1L;
            }
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.J$0 = j;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = 1;
            objC = basicInfoContract.c(premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            j = premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.J$0;
            ResultKt.b(objC);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    ResultKt.b(objC);
                    return objC;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return objC;
            }
            i = premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.I$0;
            timeUtilsContract = (TimeUtilsContract) premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$4;
            objArr = (Object[]) premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$3;
            stringEnum = (StringEnum) premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$2;
            stringProvider = (StringProvider) premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$1;
            objArr2 = (Object[]) premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$0;
            ResultKt.b(objC);
        }
        objArr[i] = timeUtilsContract.e(((Number) objC).longValue() + 60000);
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$0 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$1 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$2 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$3 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$4 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = 3;
        objB = stringProvider.b(stringEnum, objArr2, premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1);
        if (objB != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objB;
        long jLongValue = ((Number) objC).longValue();
        i = 0;
        TimeUtilsContract timeUtilsContract2 = this.l;
        StringProvider stringProvider2 = this.c;
        if (jLongValue > j) {
            StringEnum stringEnum2 = StringEnum.PREMIUM_BUS_ETA_AVL_AFTER_TRIP_START_MSG;
            objArr = new Object[1];
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$0 = objArr;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$1 = stringProvider2;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$2 = stringEnum2;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$3 = objArr;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$4 = timeUtilsContract2;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.I$0 = 0;
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = 2;
            Object objC2 = basicInfoContract.c(premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1);
            if (objC2 != coroutineSingletons) {
                stringEnum = stringEnum2;
                objC = objC2;
                objArr2 = objArr;
                timeUtilsContract = timeUtilsContract2;
                stringProvider = stringProvider2;
                objArr[i] = timeUtilsContract.e(((Number) objC).longValue() + 60000);
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$0 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$1 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$2 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$3 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.L$4 = null;
                premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = 3;
                objB = stringProvider.b(stringEnum, objArr2, premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1);
                if (objB != coroutineSingletons) {
                    return objB;
                }
            }
        } else {
            StringEnum stringEnum3 = StringEnum.PREMIUM_BUS_ETA_AVL_AFTER_TRIP_START_MSG;
            Object[] objArr3 = {timeUtilsContract2.e(j)};
            premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1.label = 4;
            Object objB2 = stringProvider2.b(stringEnum3, objArr3, premiumReserveTicketPostBookingActionHandlerImpl$getEtaAvlAfterTripStartMsg$1);
            if (objB2 != coroutineSingletons) {
                return objB2;
            }
        }
        return coroutineSingletons;
    }

    public final StopAppModel M(String str) {
        List list;
        RouteAppModel routeAppModel = this.O;
        Object obj = null;
        if (routeAppModel == null || (list = routeAppModel.e) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (Intrinsics.d(((StopAppModel) obj2).f1727a, str)) {
                obj = obj2;
                break;
            }
        }
        return (StopAppModel) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1 premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1;
        long j;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1(this, continuationImpl);
        }
        Object objI = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
            if (premiumReserveTicketAppModel == null) {
                return new Long(-1L);
            }
            long j2 = premiumReserveTicketAppModel.b.c;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.J$0 = j2;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.label = 1;
            objI = I(premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1);
            if (objI == obj) {
                return obj;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingAllowedTimestamp$1.J$0;
            ResultKt.b(objI);
        }
        return new Long(j - ((PremiumBusNativeCityWiseConfigAppModel) objI).e.g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1 premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1;
        StringEnum stringEnum;
        Object[] objArr;
        StringProvider stringProvider;
        int i;
        TimeUtilsContract timeUtilsContract;
        Object[] objArr2;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1) continuationImpl;
            int i2 = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            stringEnum = StringEnum.PREMIUM_BUS_TRACKING_UNAVAILABLE;
            objArr = new Object[1];
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$0 = objArr;
            stringProvider = this.c;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$1 = stringProvider;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$2 = stringEnum;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$3 = objArr;
            TimeUtilsContract timeUtilsContract2 = this.l;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$4 = timeUtilsContract2;
            i = 0;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.I$0 = 0;
            premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.label = 1;
            Object objN = N(premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1);
            if (objN != obj2) {
                timeUtilsContract = timeUtilsContract2;
                obj = objN;
                objArr2 = objArr;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        i = premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.I$0;
        timeUtilsContract = (TimeUtilsContract) premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$4;
        objArr = (Object[]) premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$3;
        stringEnum = (StringEnum) premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$2;
        stringProvider = (StringProvider) premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$1;
        objArr2 = (Object[]) premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$0;
        ResultKt.b(obj);
        objArr[i] = timeUtilsContract.e(((Number) obj).longValue());
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$0 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$1 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$2 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$3 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.L$4 = null;
        premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1.label = 2;
        Object objB = stringProvider.b(stringEnum, objArr2, premiumReserveTicketPostBookingActionHandlerImpl$getTrackingUnavailableInfoMsg$1);
        return objB == obj2 ? obj2 : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(LatLng latLng, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1 premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1;
        String str;
        RouteAppModel routeAppModel;
        List list;
        Object next;
        LatLng latLng2;
        StopAppModel stopAppModel;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PremiumStopDetailsAppModel premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).d;
            if (premiumStopDetailsAppModel != null && (str = premiumStopDetailsAppModel.f7121a) != null && (routeAppModel = this.O) != null && (list = routeAppModel.e) != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((StopAppModel) next).f1727a, str));
                StopAppModel stopAppModel2 = (StopAppModel) next;
                if (stopAppModel2 != null) {
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.L$0 = latLng;
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.L$1 = stopAppModel2;
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.label = 1;
                    Object objA = this.p.a(premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    latLng2 = latLng;
                    stopAppModel = stopAppModel2;
                    obj = objA;
                }
            }
            return MapCameraViewState.UpdatedState.NoChange.b;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        stopAppModel = (StopAppModel) premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.L$1;
        latLng2 = (LatLng) premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewState$1.L$0;
        ResultKt.b(obj);
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(stopAppModel.c);
        if (latLng2 != null) {
            arrayList.add(latLng2);
        }
        if (latLngA != null) {
            LatLng latLng3 = CityProviderKt.a(this.q, latLngA) ? latLngA : null;
            if (latLng3 != null) {
                arrayList.add(latLng3);
            }
        }
        LatLngBounds latLngBoundsA = this.z.a(arrayList);
        float f = PlatformFeature.f10436a;
        return new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(latLngBoundsA, 200));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(LatLng latLng, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1 premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1;
        String str;
        RouteAppModel routeAppModel;
        List list;
        Object next;
        LatLng latLng2;
        StopAppModel stopAppModel;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PremiumStopDetailsAppModel premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).e;
            if (premiumStopDetailsAppModel != null && (str = premiumStopDetailsAppModel.f7121a) != null && (routeAppModel = this.O) != null && (list = routeAppModel.e) != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((StopAppModel) next).f1727a, str));
                StopAppModel stopAppModel2 = (StopAppModel) next;
                if (stopAppModel2 != null) {
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.L$0 = latLng;
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.L$1 = stopAppModel2;
                    premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.label = 1;
                    Object objA = this.p.a(premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    latLng2 = latLng;
                    stopAppModel = stopAppModel2;
                    obj = objA;
                }
            }
            return MapCameraViewState.UpdatedState.NoChange.b;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        stopAppModel = (StopAppModel) premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.L$1;
        latLng2 = (LatLng) premiumReserveTicketPostBookingActionHandlerImpl$getUpdateMapCameraViewStateForPostActivation$1.L$0;
        ResultKt.b(obj);
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        ArrayList arrayListB0 = CollectionsKt.b0(stopAppModel.c);
        if (latLng2 != null) {
            arrayListB0.add(latLng2);
        }
        if (latLngA != null) {
            LatLng latLng3 = CityProviderKt.a(this.q, latLngA) ? latLngA : null;
            if (latLng3 != null) {
                arrayListB0.add(latLng3);
            }
        }
        LatLngBounds latLngBoundsA = this.z.a(arrayListB0);
        float f = PlatformFeature.f10436a;
        return new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(latLngBoundsA, 200));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1 premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel;
        String str;
        String str2;
        PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl;
        String str3;
        String str4;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.label;
        MutableStateFlow mutableStateFlow = this.H;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Job job = this.e0;
            if ((job == null || !((AbstractCoroutine) job).isActive()) && (premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).e) != null && (str = premiumStopDetailsAppModel.f7121a) != null) {
                premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.L$0 = this;
                premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.L$1 = str;
                premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.label = 1;
                Object objI = I(premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                obj = objI;
                premiumReserveTicketPostBookingActionHandlerImpl = this;
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.L$1;
        premiumReserveTicketPostBookingActionHandlerImpl = (PremiumReserveTicketPostBookingActionHandlerImpl) premiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$1.L$0;
        ResultKt.b(obj);
        int i3 = ((PremiumBusNativeCityWiseConfigAppModel) obj).k;
        RouteAppModel routeAppModel = premiumReserveTicketPostBookingActionHandlerImpl.O;
        if (routeAppModel == null) {
            str3 = null;
        } else {
            List list = routeAppModel.e;
            if (i3 >= list.size()) {
                str3 = ((StopAppModel) CollectionsKt.P(list)).f1727a;
            } else {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str2)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    str3 = null;
                } else {
                    int i5 = i4 + i3;
                    str3 = i5 >= CollectionsKt.K(list) ? ((StopAppModel) CollectionsKt.P(list)).f1727a : ((StopAppModel) list.get(i5)).f1727a;
                }
            }
        }
        if (str3 != null) {
            String message = "stopIdToConsiderToEndTrip: ".concat(str3);
            Intrinsics.i(message, "message");
            PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
            PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState : null;
            if (vehicleAssigned != null && (str4 = vehicleAssigned.b) != null) {
                this.e0 = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$handleTripEndProcess$2(this, str3, str4, null), 3);
            }
        }
        return unit;
    }

    public final void S() {
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        String str;
        List list;
        StopAppModel stopAppModel;
        if (U()) {
            Job job = this.b0;
            if ((job != null && ((AbstractCoroutine) job).isActive()) || (premiumReserveTicketAppModel = this.K) == null || (str = premiumReserveTicketAppModel.b.h.f7121a) == null) {
                return;
            }
            RouteAppModel routeAppModel = this.O;
            String str2 = (routeAppModel == null || (list = routeAppModel.e) == null || (stopAppModel = (StopAppModel) CollectionsKt.Q(list)) == null) ? null : stopAppModel.f1727a;
            if (str2 != null ? str2.equals(str) : true) {
                this.b0 = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$initDropStopEtaTsProcessIfRequired$1(this, null), 3);
            }
        }
    }

    public final void T() {
        List listR;
        List list;
        RouteAppModel routeAppModel = this.O;
        if (routeAppModel == null) {
            return;
        }
        List list2 = routeAppModel.e;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        if (premiumReserveTicketAppModel == null) {
            return;
        }
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        String str = premiumReserveTicketTripPropertiesAppModel.g.f7121a;
        String str2 = premiumReserveTicketTripPropertiesAppModel.h.f7121a;
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                break;
            } else {
                i++;
            }
        }
        Iterator it2 = list2.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.d(((StopAppModel) it2.next()).f1727a, str2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i == -1 || i2 == -1) {
            J(PremiumReserveTicketPostBookingActionEffect.Exit.f7432a);
            return;
        }
        List<StopAppModel> listSubList = list2.subList(i, i2 + 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList.add(((StopAppModel) it3.next()).b);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(listSubList, 10));
        for (StopAppModel stopAppModel : listSubList) {
            arrayList2.add(new PremiumBusPostActivationStopDetails(stopAppModel.f1727a, stopAppModel.b, false, StopLiveEtaUiModel.NotAvailable.f4377a, new BusPassedDetails(false, false)));
        }
        final StopAppModel stopAppModel2 = (StopAppModel) list2.get(i);
        final StopAppModel stopAppModel3 = (StopAppModel) list2.get(i2);
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).i;
        if (premiumBusPostBookingStopSchedule instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable) {
            String str3 = ((PremiumBusPostBookingStopSchedule.ScheduleAvailable) premiumBusPostBookingStopSchedule).f7428a;
            String str4 = stopAppModel2.b;
            LatLng latLng = stopAppModel2.c;
            String str5 = stopAppModel2.f1727a;
            StopLiveEtaUiModel.SpecificScheduledTime specificScheduledTime = new StopLiveEtaUiModel.SpecificScheduledTime(str3);
            boolean z = !U();
            ChaloMapMarkerType chaloMapMarkerType = ChaloMapMarkerType.PREMIUM_BUS_PICKUP;
            ChaloMapMarkerIconProvider chaloMapMarkerIconProvider = this.n;
            IconType iconTypeB = chaloMapMarkerIconProvider.b(chaloMapMarkerType);
            PremiumBusStopType premiumBusStopType = PremiumBusStopType.PICKUP;
            ChaloMapMarkerUIEventHandler.Companion companion = ChaloMapMarkerUIEventHandler.f1869a;
            final int i3 = 0;
            Function0 function0 = new Function0(this) { // from class: sw0
                public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            this.b.w(stopAppModel2.f1727a, false);
                            break;
                        default:
                            this.b.w(stopAppModel2.f1727a, false);
                            break;
                    }
                    return Boolean.FALSE;
                }
            };
            wb wbVar = new wb(8);
            final int i4 = 0;
            Function0 function1 = new Function0(this) { // from class: tw0
                public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            this.b.d0();
                            break;
                        default:
                            this.b.d0();
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            companion.getClass();
            ChaloMapMarkerUIEventHandler$Companion$fromLambda$1 chaloMapMarkerUIEventHandler$Companion$fromLambda$1A = ChaloMapMarkerUIEventHandler.Companion.a(function0, wbVar, function1);
            ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider = this.x;
            PremiumBusStopMarkerUIState premiumBusStopMarkerUIState = new PremiumBusStopMarkerUIState(str4, str5, latLng, specificScheduledTime, z, iconTypeB, premiumBusStopType, chaloMapMarkerInfoWindowProvider, chaloMapMarkerUIEventHandler$Companion$fromLambda$1A);
            if (U()) {
                ArrayList arrayList3 = new ArrayList();
                final int i5 = 1;
                final int i6 = 1;
                PremiumBusStopMarkerUIState premiumBusStopMarkerUIState2 = new PremiumBusStopMarkerUIState(stopAppModel3.b, stopAppModel3.f1727a, stopAppModel3.c, StopLiveEtaUiModel.Unknown.f4379a, true, chaloMapMarkerIconProvider.b(ChaloMapMarkerType.PREMIUM_BUS_DROP), PremiumBusStopType.DROP, chaloMapMarkerInfoWindowProvider, ChaloMapMarkerUIEventHandler.Companion.a(new Function0(this) { // from class: sw0
                    public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                this.b.w(stopAppModel3.f1727a, false);
                                break;
                            default:
                                this.b.w(stopAppModel3.f1727a, false);
                                break;
                        }
                        return Boolean.FALSE;
                    }
                }, new wb(8), new Function0(this) { // from class: tw0
                    public final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                this.b.d0();
                                break;
                            default:
                                this.b.d0();
                                break;
                        }
                        return Unit.f17538a;
                    }
                }));
                arrayList3.add(premiumBusStopMarkerUIState);
                arrayList3.add(premiumBusStopMarkerUIState2);
                listR = arrayList3;
            } else {
                listR = CollectionsKt.R(premiumBusStopMarkerUIState);
            }
            List list3 = listR;
            if (U()) {
                String str6 = routeAppModel.m;
                List list4 = list2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((StopAppModel) it4.next()).c);
                }
                ChaloUseCaseResult chaloUseCaseResultA = this.o.a(str6, arrayList4, new PolylineTrimRequest.FromPointToPoint(latLng, stopAppModel3.c));
                if (chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure) {
                    list = EmptyList.f17557a;
                } else {
                    if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResultA).f10419a;
                    this.Z = list;
                }
            } else {
                list = EmptyList.f17557a;
            }
            f0(new o3(this, arrayList2, new PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable(stopAppModel2.f1727a, stopAppModel2.b, latLng), new PremiumBusLiveTrackingState(CollectionsKt.R(new PolylinePointUIState(list)), list3, premiumBusStopMarkerUIState, EmptyList.f17557a, new MapCameraViewState.InitialState.CustomPosition(stopAppModel2.c, 0.0f, 14), 32), arrayList, 10));
        }
    }

    public final boolean U() {
        return CollectionsKt.w(CollectionsKt.S(PremiumReserveTicketStatus.USED, PremiumReserveTicketStatus.PUNCHED), ((PremiumReserveTicketPostBookingActionState) this.H.getValue()).c);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1 premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1;
        long j;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1(this, continuationImpl);
        }
        Object objC = premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (this.Y.b) {
                premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.label = 1;
                objC = this.b.c(premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1);
                if (objC != obj) {
                }
                return obj;
            }
            return Boolean.valueOf(z);
        }
        if (i2 == 1) {
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.J$0;
            ResultKt.b(objC);
        }
        boolean z = j < ((Number) objC).longValue() && (((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).m instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned);
        return Boolean.valueOf(z);
        long jLongValue = ((Number) objC).longValue();
        premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.J$0 = jLongValue;
        premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1.label = 2;
        objC = N(premiumReserveTicketPostBookingActionHandlerImpl$isTrackingBusGpsLocationAllowed$1);
        if (objC != obj) {
            j = jLongValue;
            if (j < ((Number) objC).longValue()) {
            }
            return Boolean.valueOf(z);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object W(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1 premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        PostRideFeedbackEntity postRideFeedbackEntity;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        RideFeedbackFillStatus rideFeedbackFillStatus;
        int i;
        String str;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel;
        String str2;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1) continuationImpl;
            int i2 = premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(obj);
            PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = this.K;
            if (premiumReserveTicketAppModel3 != null) {
                premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$0 = premiumReserveTicketAppModel3;
                premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.label = 1;
                Object objC = this.b.c(premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1);
                if (objC != coroutineSingletons) {
                    premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
                    obj = objC;
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i3 == 1) {
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            postRideFeedbackEntity = (PostRideFeedbackEntity) premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$1;
            premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$0;
            ResultKt.b(obj);
        }
        rideFeedbackFillStatus = (RideFeedbackFillStatus) obj;
        if (this.Y.b) {
            i = WhenMappings.c[rideFeedbackFillStatus.ordinal()];
            if (i != 1 || i == 2) {
                str = this.g0;
                premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
                str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                if (!Intrinsics.d(str, premiumReserveTicketBookingPropertiesAppModel.f7114a)) {
                    this.g0 = str2;
                    Json json = ChaloJson.b;
                    String str3 = premiumReserveTicketBookingPropertiesAppModel.g;
                    String str4 = premiumReserveTicketBookingPropertiesAppModel.f;
                    PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel2.b;
                    RideFeedbackBookingData rideFeedbackBookingData = new RideFeedbackBookingData(str2, str3, str4, premiumReserveTicketTripPropertiesAppModel.f7117a, premiumReserveTicketTripPropertiesAppModel.e, premiumReserveTicketTripPropertiesAppModel.g.b, premiumReserveTicketTripPropertiesAppModel.h.b, postRideFeedbackEntity.i, RideFeedbackTriggerType.FULLSCREEN, null, RideFeedbackEntryPoint.ACTIVATION_SCREEN, null);
                    json.getClass();
                    J(new PremiumReserveTicketPostBookingActionEffect.NavigateToPostRideFeedback(json.a(RideFeedbackBookingData.INSTANCE.serializer(), rideFeedbackBookingData), premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e));
                    return unit;
                }
            } else if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return unit;
        PostRideFeedbackEntity postRideFeedbackEntityA = PremiumReserveTicketFeedbackMapperKt.a(premiumReserveTicketAppModel, ((Number) obj).longValue(), premiumReserveTicketAppModel.b.d);
        if (postRideFeedbackEntityA != null) {
            premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$0 = premiumReserveTicketAppModel;
            premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.L$1 = postRideFeedbackEntityA;
            premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1.label = 2;
            Enum enumA = this.G.a(postRideFeedbackEntityA, premiumReserveTicketPostBookingActionHandlerImpl$maybeRecordAndOpenPostRideFeedback$1);
            if (enumA != coroutineSingletons) {
                postRideFeedbackEntity = postRideFeedbackEntityA;
                obj = enumA;
                premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                rideFeedbackFillStatus = (RideFeedbackFillStatus) obj;
                if (this.Y.b) {
                    i = WhenMappings.c[rideFeedbackFillStatus.ordinal()];
                    if (i != 1) {
                        str = this.g0;
                        premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
                        str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                        if (!Intrinsics.d(str, premiumReserveTicketBookingPropertiesAppModel.f7114a)) {
                            this.g0 = str2;
                            Json json2 = ChaloJson.b;
                            String str5 = premiumReserveTicketBookingPropertiesAppModel.g;
                            String str6 = premiumReserveTicketBookingPropertiesAppModel.f;
                            PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel2 = premiumReserveTicketAppModel2.b;
                            RideFeedbackBookingData rideFeedbackBookingData2 = new RideFeedbackBookingData(str2, str5, str6, premiumReserveTicketTripPropertiesAppModel2.f7117a, premiumReserveTicketTripPropertiesAppModel2.e, premiumReserveTicketTripPropertiesAppModel2.g.b, premiumReserveTicketTripPropertiesAppModel2.h.b, postRideFeedbackEntity.i, RideFeedbackTriggerType.FULLSCREEN, null, RideFeedbackEntryPoint.ACTIVATION_SCREEN, null);
                            json2.getClass();
                            J(new PremiumReserveTicketPostBookingActionEffect.NavigateToPostRideFeedback(json2.a(RideFeedbackBookingData.INSTANCE.serializer(), rideFeedbackBookingData2), premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e));
                            return unit;
                        }
                    } else {
                        str = this.g0;
                        premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
                        str2 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                        if (!Intrinsics.d(str, premiumReserveTicketBookingPropertiesAppModel.f7114a)) {
                            this.g0 = str2;
                            Json json3 = ChaloJson.b;
                            String str7 = premiumReserveTicketBookingPropertiesAppModel.g;
                            String str8 = premiumReserveTicketBookingPropertiesAppModel.f;
                            PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel3 = premiumReserveTicketAppModel2.b;
                            RideFeedbackBookingData rideFeedbackBookingData3 = new RideFeedbackBookingData(str2, str7, str8, premiumReserveTicketTripPropertiesAppModel3.f7117a, premiumReserveTicketTripPropertiesAppModel3.e, premiumReserveTicketTripPropertiesAppModel3.g.b, premiumReserveTicketTripPropertiesAppModel3.h.b, postRideFeedbackEntity.i, RideFeedbackTriggerType.FULLSCREEN, null, RideFeedbackEntryPoint.ACTIVATION_SCREEN, null);
                            json3.getClass();
                            J(new PremiumReserveTicketPostBookingActionEffect.NavigateToPostRideFeedback(json3.a(RideFeedbackBookingData.INSTANCE.serializer(), rideFeedbackBookingData3), premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e));
                            return unit;
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return unit;
    }

    public final void X(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, boolean z, boolean z2) {
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        this.t.a(MapsKt.i(new Pair("bookingId", String.valueOf(premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null)), new Pair("activeBookingActionType", premiumReserveTicketOptionAction.name()), new Pair("isActionAllowed", Boolean.valueOf(z)), new Pair("isFromCancellationConfirmationBottomSheet", Boolean.valueOf(z2))));
    }

    public final void Y(String str) {
        List list;
        String str2;
        Job job = this.Q;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.R = str;
        MutableStateFlow mutableStateFlow = this.H;
        PremiumBusLiveTrackingState premiumBusLiveTrackingState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).r;
        if (premiumBusLiveTrackingState == null || (list = premiumBusLiveTrackingState.b) == null) {
            return;
        }
        List<PremiumBusStopMarkerUIState> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (PremiumBusStopMarkerUIState premiumBusStopMarkerUIState : list2) {
            arrayList.add(Intrinsics.d(premiumBusStopMarkerUIState.b, str) ? PremiumBusStopMarkerUIState.f(premiumBusStopMarkerUIState, StopLiveEtaUiModel.EtaFetchInProgress.f4376a, true, 487) : PremiumBusStopMarkerUIState.f(premiumBusStopMarkerUIState, null, false, 495));
        }
        f0(new qd(16, arrayList));
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
        PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState : null;
        if (vehicleAssigned == null || (str2 = vehicleAssigned.b) == null) {
            return;
        }
        this.Q = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startFetchingLiveStopEtaDetailsForMap$2(this, str, str2, null), 3);
    }

    public final void Z(String str) {
        String str2;
        Job job = this.S;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.T = str;
        MutableStateFlow mutableStateFlow = this.H;
        List<PremiumBusPostActivationStopDetails> list = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails : list) {
            arrayList.add(Intrinsics.d(premiumBusPostActivationStopDetails.f7403a, str) ? PremiumBusPostActivationStopDetails.a(premiumBusPostActivationStopDetails, true, StopLiveEtaUiModel.EtaFetchInProgress.f4376a, null, 19) : PremiumBusPostActivationStopDetails.a(premiumBusPostActivationStopDetails, false, null, null, 27));
        }
        f0(new qd(14, arrayList));
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
        PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState : null;
        if (vehicleAssigned == null || (str2 = vehicleAssigned.b) == null) {
            return;
        }
        this.S = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startFetchingLiveStopEtaDetailsForStopList$2(this, str, str2, null), 3);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void a() {
        CoroutineScopeKt.b(this.J, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1 premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1;
        String str;
        Job job;
        boolean z;
        ContextScope contextScope;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1(this, continuationImpl);
        }
        Object objL = premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.label = 1;
            objL = L(premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1);
            if (objL != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objL);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.L$0;
            ResultKt.b(objL);
        }
        if (((Boolean) objL).booleanValue()) {
            return Boolean.FALSE;
        }
        job = this.P;
        if (job != null || !((AbstractCoroutine) job).isActive()) {
            z = this.d0;
            contextScope = this.J;
            if (!z) {
                this.c0 = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1(this, null), 3);
            }
            this.P = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2(this, null), 3);
        }
        f0(new eu0(str, 4));
        return Boolean.TRUE;
        String str2 = (String) objL;
        premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.L$0 = str2;
        premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1.label = 2;
        Object objV = V(premiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationTrackingIfNeeded$1);
        if (objV != obj) {
            str = str2;
            objL = objV;
            if (((Boolean) objL).booleanValue()) {
                return Boolean.FALSE;
            }
            job = this.P;
            if (job != null) {
                z = this.d0;
                contextScope = this.J;
                if (!z) {
                    this.c0 = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1(this, null), 3);
                }
                this.P = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2(this, null), 3);
            } else {
                z = this.d0;
                contextScope = this.J;
                if (!z) {
                    this.c0 = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$1(this, null), 3);
                }
                this.P = BuildersKt.d(contextScope, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startGpsLocationFetchForVehicle$2(this, null), 3);
            }
            f0(new eu0(str, 4));
            return Boolean.TRUE;
        }
        return obj;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final Flow b() {
        return FlowKt.D(this.I);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    public final boolean b0() {
        Job job;
        Job job2;
        Job job3;
        String str;
        String str2;
        boolean z = false;
        if (this.Y.b) {
            MutableStateFlow mutableStateFlow = this.H;
            PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
            if (premiumBusBookingVehicleInfoState != null && PremiumBusTripInfoContractKt.a(premiumBusBookingVehicleInfoState)) {
                Job job4 = this.U;
                if ((job4 != null && ((AbstractCoroutine) job4).isActive()) || (((job = this.Q) != null && ((AbstractCoroutine) job).isActive()) || (((job2 = this.S) != null && ((AbstractCoroutine) job2).isActive()) || ((job3 = this.P) != null && ((AbstractCoroutine) job3).isActive())))) {
                    z = true;
                }
                PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
                String str3 = null;
                String strN = premiumReserveTicketAppModel != null ? vo1.n(premiumReserveTicketAppModel.f7113a.f7114a, ":", premiumReserveTicketAppModel.b.f7117a) : null;
                Job job5 = this.M;
                if (job5 != null) {
                    ((JobSupport) job5).cancel(null);
                }
                if (this.Y.b) {
                    Job job6 = this.P;
                    if (job6 != null) {
                        ((JobSupport) job6).cancel(null);
                    }
                    Job job7 = this.U;
                    if (job7 == null || !((AbstractCoroutine) job7).isActive()) {
                        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
                        PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState2 instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState2 : null;
                        if (vehicleAssigned != null && (str = vehicleAssigned.b) != null) {
                            this.U = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startFetchingLiveVehicleDetails$1(this, str, null), 3);
                        }
                    }
                    if (this.Q == null) {
                        if (Intrinsics.d(this.R, "NO_VALUE")) {
                            if (U()) {
                                PremiumStopDetailsAppModel premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).e;
                                if (premiumStopDetailsAppModel != null) {
                                    str2 = premiumStopDetailsAppModel.f7121a;
                                } else {
                                    str2 = null;
                                }
                            } else {
                                PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).d;
                                if (premiumStopDetailsAppModel2 != null) {
                                    str2 = premiumStopDetailsAppModel2.f7121a;
                                } else {
                                    str2 = null;
                                }
                            }
                            if (str2 != null) {
                            }
                        } else {
                            str2 = this.R;
                        }
                        Y(str2);
                    }
                    if (this.S == null) {
                        if (Intrinsics.d(this.T, "NO_VALUE")) {
                            if (U()) {
                                PremiumStopDetailsAppModel premiumStopDetailsAppModel3 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).e;
                                if (premiumStopDetailsAppModel3 != null) {
                                    str3 = premiumStopDetailsAppModel3.f7121a;
                                }
                            } else {
                                PremiumStopDetailsAppModel premiumStopDetailsAppModel4 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).d;
                                if (premiumStopDetailsAppModel4 != null) {
                                    str3 = premiumStopDetailsAppModel4.f7121a;
                                }
                            }
                            if (str3 != null) {
                            }
                        } else {
                            str3 = this.T;
                        }
                        Z(str3);
                    }
                    f0(new zv0(21));
                }
                if (strN != null && (!z || !Intrinsics.d(this.f0, strN))) {
                    this.f0 = strN;
                    PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = this.K;
                    if (premiumReserveTicketAppModel2 != null) {
                        this.t.g(premiumReserveTicketAppModel2.f7113a.f7114a, premiumReserveTicketAppModel2.b.f7117a, U());
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void c(PremiumBusProductOptionsAppModel item, int i) {
        Intrinsics.i(item, "item");
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        String str = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null;
        String str2 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.d : null;
        String str3 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.e : null;
        X(item.f2387a, item.e, true);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        J(new PremiumReserveTicketPostBookingActionEffect.NavigateToCancellationFlow(str, str2, str3, i));
    }

    public final void c0(PremiumReserveTicketAppModel premiumReserveTicketAppModel, Source source) {
        boolean zD = premiumReserveTicketAppModel.d();
        String str = premiumReserveTicketAppModel.f7113a.f7114a;
        if (zD) {
            return;
        }
        Job job = this.L;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.L = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$startTripVehicleAndTimeFetchingJob$1(this, U() ? new PremiumTicketActivationStatus.Post(str, premiumReserveTicketAppModel.b.h.f7121a) : new PremiumTicketActivationStatus.Pre(str), source, premiumReserveTicketAppModel, null), 3);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void d(PremiumBusProductOptionsAppModel item, int i) {
        Intrinsics.i(item, "item");
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        String str = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null;
        String str2 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.d : null;
        String str3 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.e : null;
        X(item.f2387a, item.e, true);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        J(new PremiumReserveTicketPostBookingActionEffect.NavigateToRescheduleFlow(str, str2, str3, i));
    }

    public final void d0() {
        List list;
        Job job = this.Q;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        PremiumBusLiveTrackingState premiumBusLiveTrackingState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).r;
        if (premiumBusLiveTrackingState == null || (list = premiumBusLiveTrackingState.b) == null) {
            return;
        }
        f0(new ud(list, 23));
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void e() {
        this.v.a(this.Y.f7412a);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl] */
    /* JADX WARN: Type inference failed for: r2v14, types: [app.chalo.domain.GetTrimmedPolylineUseCase] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object e0(List list, Map map, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1 premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1;
        Object next;
        Map map2;
        LiveVehicleDataAppModel liveVehicleDataAppModel;
        PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState;
        String str;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel;
        StopAppModel stopAppModelM;
        ?? arrayList;
        List listR;
        List list2;
        ArrayList arrayList2;
        ?? arrayList3;
        List list3;
        Map map3;
        List list4;
        String str2;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2;
        StopAppModel stopAppModelM2;
        ?? arrayList4;
        List list5;
        ?? r2;
        MapCameraViewState.UpdatedState updatedState;
        ?? r3;
        Map mapD;
        Long l;
        ?? r4;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1(this, continuationImpl);
        }
        PremiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1 premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2 = premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$1;
        Object objH = premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.label;
        Unit unit = Unit.f17538a;
        MutableStateFlow mutableStateFlow = this.H;
        if (i2 == 0) {
            ResultKt.b(objH);
            String message = "busPassedFromStopMap: " + map;
            Intrinsics.i(message, "message");
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long j = ((LiveVehicleDataAppModel) next).c;
                    do {
                        Object next2 = it.next();
                        long j2 = ((LiveVehicleDataAppModel) next2).c;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            LiveVehicleDataAppModel liveVehicleDataAppModel2 = (LiveVehicleDataAppModel) next;
            if (liveVehicleDataAppModel2 != null) {
                String str3 = liveVehicleDataAppModel2.f4369a;
                LatLng latLng = liveVehicleDataAppModel2.d;
                long j3 = liveVehicleDataAppModel2.c;
                boolean z = liveVehicleDataAppModel2.e;
                premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0 = map;
                premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1 = liveVehicleDataAppModel2;
                premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.label = 1;
                objH = H(str3, latLng, j3, z, true, premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2);
                if (objH != coroutineSingletons) {
                    map2 = map;
                    liveVehicleDataAppModel = liveVehicleDataAppModel2;
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                List list6 = (List) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$4;
                list3 = (List) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$3;
                premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$2;
                liveVehicleDataAppModel = (LiveVehicleDataAppModel) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1;
                map3 = (Map) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0;
                ResultKt.b(objH);
                r2 = list6;
                updatedState = (MapCameraViewState.UpdatedState) objH;
                r3 = r2;
                PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState2 = premiumBusLiveBusMarkerUIState;
                MapCameraViewState.UpdatedState updatedState2 = updatedState;
                List list7 = list3;
                ?? r5 = r3;
                Map map4 = map3;
                LiveVehicleDataAppModel liveVehicleDataAppModel3 = liveVehicleDataAppModel;
                mapD = map4;
                List list8 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
                if (mapD == null) {
                    mapD = MapsKt.d();
                }
                ArrayList arrayListB = PremiumReserveTicketPostBookingActionContractKt.b(list8, mapD);
                Long l2 = liveVehicleDataAppModel3.k;
                f0(new y20(list7, premiumBusLiveBusMarkerUIState2, (List) r5, updatedState2, arrayListB, liveVehicleDataAppModel3, ((l2 == null && l2.longValue() == 0) || this.h0 || (l = liveVehicleDataAppModel3.k) == null) ? null : this.l.e(l.longValue()), (PremiumReserveTicketPostBookingActionHandlerImpl) this));
                if (!this.V) {
                    this.V = true;
                }
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list9 = (List) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$4;
            list3 = (List) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$3;
            premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$2;
            liveVehicleDataAppModel = (LiveVehicleDataAppModel) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1;
            map3 = (Map) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0;
            ResultKt.b(objH);
            r4 = list9;
            updatedState = (MapCameraViewState.UpdatedState) objH;
            r3 = r4;
            PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState3 = premiumBusLiveBusMarkerUIState;
            MapCameraViewState.UpdatedState updatedState3 = updatedState;
            List list10 = list3;
            ?? r6 = r3;
            Map map5 = map3;
            LiveVehicleDataAppModel liveVehicleDataAppModel4 = liveVehicleDataAppModel;
            mapD = map5;
            List list11 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
            if (mapD == null) {
                mapD = MapsKt.d();
            }
            ArrayList arrayListB2 = PremiumReserveTicketPostBookingActionContractKt.b(list11, mapD);
            Long l3 = liveVehicleDataAppModel4.k;
            f0(new y20(list10, premiumBusLiveBusMarkerUIState3, (List) r6, updatedState3, arrayListB2, liveVehicleDataAppModel4, ((l3 == null && l3.longValue() == 0) || this.h0 || (l = liveVehicleDataAppModel4.k) == null) ? null : this.l.e(l.longValue()), (PremiumReserveTicketPostBookingActionHandlerImpl) this));
            if (!this.V) {
                this.V = true;
            }
            return unit;
        }
        LiveVehicleDataAppModel liveVehicleDataAppModel5 = (LiveVehicleDataAppModel) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1;
        map2 = (Map) premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0;
        ResultKt.b(objH);
        liveVehicleDataAppModel = liveVehicleDataAppModel5;
        premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) objH;
        boolean zU = U();
        ?? r7 = this.o;
        if (zU) {
            LatLng latLng2 = liveVehicleDataAppModel.d;
            RouteAppModel routeAppModel = this.O;
            if (routeAppModel == null || (str2 = routeAppModel.m) == null || (premiumStopDetailsAppModel2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).e) == null || (stopAppModelM2 = M(premiumStopDetailsAppModel2.f7121a)) == null) {
                listR = null;
            } else {
                RouteAppModel routeAppModel2 = this.O;
                if (routeAppModel2 == null || (list5 = routeAppModel2.e) == null) {
                    arrayList4 = EmptyList.f17557a;
                } else {
                    List list12 = list5;
                    arrayList4 = new ArrayList(CollectionsKt.v(list12, 10));
                    Iterator it2 = list12.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((StopAppModel) it2.next()).c);
                    }
                }
                ChaloUseCaseResult chaloUseCaseResultA = r7.a(str2, arrayList4, new PolylineTrimRequest.FromPointToPoint(latLng2, stopAppModelM2.c));
                if (chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure) {
                    listR = null;
                } else {
                    if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listR = CollectionsKt.R(new PolylinePointUIState((List) ((ChaloUseCaseResult.Success) chaloUseCaseResultA).f10419a));
                }
            }
        } else {
            LatLng latLng3 = liveVehicleDataAppModel.d;
            RouteAppModel routeAppModel3 = this.O;
            if (routeAppModel3 == null || (str = routeAppModel3.m) == null || (premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).d) == null || (stopAppModelM = M(premiumStopDetailsAppModel.f7121a)) == null) {
                listR = null;
            } else {
                RouteAppModel routeAppModel4 = this.O;
                if (routeAppModel4 == null || (list2 = routeAppModel4.e) == null) {
                    arrayList = EmptyList.f17557a;
                } else {
                    List list13 = list2;
                    arrayList = new ArrayList(CollectionsKt.v(list13, 10));
                    Iterator it3 = list13.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((StopAppModel) it3.next()).c);
                    }
                }
                ChaloUseCaseResult chaloUseCaseResultA2 = r7.a(str, arrayList, new PolylineTrimRequest.FromPointToPoint(latLng3, stopAppModelM.c));
                if (chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Failure) {
                    listR = null;
                } else {
                    if (!(chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listR = CollectionsKt.R(new PolylinePointUIState((List) ((ChaloUseCaseResult.Success) chaloUseCaseResultA2).f10419a));
                }
            }
        }
        RouteAppModel routeAppModel5 = this.O;
        if (routeAppModel5 == null || (list4 = routeAppModel5.r) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj : list4) {
                TrafficSignalAppModel trafficSignalAppModel = (TrafficSignalAppModel) obj;
                if (liveVehicleDataAppModel.e && ((int) Math.abs(GeometryUtils.b(liveVehicleDataAppModel.d, trafficSignalAppModel.b))) <= l0) {
                    arrayList2.add(obj);
                }
            }
        }
        if (arrayList2 != null) {
            arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
            int i3 = 0;
            for (int size = arrayList2.size(); i3 < size; size = size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                arrayList3.add(new PremiumBusTrafficSignalMarkerUIState(((TrafficSignalAppModel) obj2).b, this.n.b(ChaloMapMarkerType.TRAFFIC_SIGNAL)));
            }
        } else {
            arrayList3 = EmptyList.f17557a;
        }
        if (U()) {
            LatLng latLng4 = liveVehicleDataAppModel.d;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0 = map2;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1 = liveVehicleDataAppModel;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$2 = premiumBusLiveBusMarkerUIState;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$3 = listR;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$4 = arrayList3;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.label = 2;
            Object objQ = Q(latLng4, premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2);
            if (objQ != coroutineSingletons) {
                Map map6 = map2;
                list3 = listR;
                objH = objQ;
                map3 = map6;
                r2 = arrayList3;
                updatedState = (MapCameraViewState.UpdatedState) objH;
                r3 = r2;
                PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState4 = premiumBusLiveBusMarkerUIState;
                MapCameraViewState.UpdatedState updatedState4 = updatedState;
                List list14 = list3;
                ?? r8 = r3;
                Map map7 = map3;
                LiveVehicleDataAppModel liveVehicleDataAppModel6 = liveVehicleDataAppModel;
                mapD = map7;
                List list15 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
                if (mapD == null) {
                    mapD = MapsKt.d();
                }
                ArrayList arrayListB3 = PremiumReserveTicketPostBookingActionContractKt.b(list15, mapD);
                Long l4 = liveVehicleDataAppModel6.k;
                f0(new y20(list14, premiumBusLiveBusMarkerUIState4, (List) r8, updatedState4, arrayListB3, liveVehicleDataAppModel6, ((l4 == null && l4.longValue() == 0) || this.h0 || (l = liveVehicleDataAppModel6.k) == null) ? null : this.l.e(l.longValue()), (PremiumReserveTicketPostBookingActionHandlerImpl) this));
                if (!this.V) {
                    this.V = true;
                }
                return unit;
            }
        } else {
            LatLng latLng5 = liveVehicleDataAppModel.d;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$0 = map2;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$1 = liveVehicleDataAppModel;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$2 = premiumBusLiveBusMarkerUIState;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$3 = listR;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.L$4 = arrayList3;
            premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2.label = 3;
            Object objP = P(latLng5, premiumReserveTicketPostBookingActionHandlerImpl$updateMapWithNewLiveVehicleData$2);
            if (objP != coroutineSingletons) {
                Map map8 = map2;
                list3 = listR;
                objH = objP;
                map3 = map8;
                r4 = arrayList3;
                updatedState = (MapCameraViewState.UpdatedState) objH;
                r3 = r4;
                PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState5 = premiumBusLiveBusMarkerUIState;
                MapCameraViewState.UpdatedState updatedState5 = updatedState;
                List list16 = list3;
                ?? r9 = r3;
                Map map9 = map3;
                LiveVehicleDataAppModel liveVehicleDataAppModel7 = liveVehicleDataAppModel;
                mapD = map9;
                List list17 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
                if (mapD == null) {
                    mapD = MapsKt.d();
                }
                ArrayList arrayListB4 = PremiumReserveTicketPostBookingActionContractKt.b(list17, mapD);
                Long l5 = liveVehicleDataAppModel7.k;
                f0(new y20(list16, premiumBusLiveBusMarkerUIState5, (List) r9, updatedState5, arrayListB4, liveVehicleDataAppModel7, ((l5 == null && l5.longValue() == 0) || this.h0 || (l = liveVehicleDataAppModel7.k) == null) ? null : this.l.e(l.longValue()), (PremiumReserveTicketPostBookingActionHandlerImpl) this));
                if (!this.V) {
                    this.V = true;
                }
                return unit;
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void f(String bookingId, PostBookingHandlerConfig postBookingHandlerConfig, Source source) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(source, "source");
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        if (!Intrinsics.d(premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null, bookingId)) {
            this.f0 = null;
            this.g0 = null;
        }
        this.Y = postBookingHandlerConfig;
        String message = "initializeTicket: bookingId = " + bookingId + ", config = " + postBookingHandlerConfig;
        Intrinsics.i(message, "message");
        BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$initializeTicket$1(this, bookingId, postBookingHandlerConfig, source, null), 3);
    }

    public final void f0(Function1 function1) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.H;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, (PremiumReserveTicketPostBookingActionState) function1.invoke((PremiumReserveTicketPostBookingActionState) value)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final Object g(String str, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1 premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1.label = 1;
            if (this.F.k(str, premiumReserveTicketPostBookingActionHandlerImpl$dismissWomenSeatRescheduleWarningBanner$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        f0(new zv0(19));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g0(LiveVehicleGpsData liveVehicleGpsData, boolean z, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1 premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1;
        PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl;
        List list;
        PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1(this, continuationImpl);
        }
        PremiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1 premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2 = premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$1;
        Object objH = premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            String str = liveVehicleGpsData.b;
            LatLng latLng = liveVehicleGpsData.f4370a;
            long j = liveVehicleGpsData.c;
            premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$0 = liveVehicleGpsData;
            premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.Z$0 = z;
            premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.label = 1;
            premiumReserveTicketPostBookingActionHandlerImpl = this;
            objH = premiumReserveTicketPostBookingActionHandlerImpl.H(str, latLng, j, false, true, premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2);
            if (objH != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.Z$0;
            liveVehicleGpsData = (LiveVehicleGpsData) premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$0;
            ResultKt.b(objH);
            premiumReserveTicketPostBookingActionHandlerImpl = this;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$1;
            premiumBusLiveBusMarkerUIState = (PremiumBusLiveBusMarkerUIState) premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$0;
            ResultKt.b(objH);
        }
        f0(new za0(29, premiumBusLiveBusMarkerUIState, (MapCameraViewState.UpdatedState) objH, list));
        return Unit.f17538a;
        PremiumBusLiveBusMarkerUIState premiumBusLiveBusMarkerUIState2 = (PremiumBusLiveBusMarkerUIState) objH;
        MutableStateFlow mutableStateFlow = premiumReserveTicketPostBookingActionHandlerImpl.H;
        List listB = z ? PremiumReserveTicketPostBookingActionContractKt.b(((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w, MapsKt.d()) : ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).w;
        LatLng latLng2 = liveVehicleGpsData.f4370a;
        premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$0 = premiumBusLiveBusMarkerUIState2;
        premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.L$1 = listB;
        premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2.label = 2;
        Object objP = P(latLng2, premiumReserveTicketPostBookingActionHandlerImpl$updateVehicleGpsLocationOnMap$2);
        if (objP != coroutineSingletons) {
            objH = objP;
            list = listB;
            premiumBusLiveBusMarkerUIState = premiumBusLiveBusMarkerUIState2;
            f0(new za0(29, premiumBusLiveBusMarkerUIState, (MapCameraViewState.UpdatedState) objH, list));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final StateFlow getState() {
        return FlowKt.c(this.H);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void h(MapCameraUpdate newUpdate) {
        Intrinsics.i(newUpdate, "newUpdate");
        this.W = newUpdate;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void i(boolean z) {
        BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$acknowledgeSystemCancellationReschedule$1(this, z, null), 3);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void j() {
        f0(new zv0(15));
        J(PremiumReserveTicketPostBookingActionEffect.Exit.f7432a);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void k() {
        f0(new zv0(22));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final Object l(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1 premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1;
        MapCameraUpdate mapCameraUpdate;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MapCameraUpdate mapCameraUpdate2 = this.W;
            if (mapCameraUpdate2 != null) {
                premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.L$0 = mapCameraUpdate2;
                premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.label = 1;
                Object objC = this.b.c(premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mapCameraUpdate = mapCameraUpdate2;
                obj = objC;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mapCameraUpdate = (MapCameraUpdate) premiumReserveTicketPostBookingActionHandlerImpl$resetMapView$1.L$0;
        ResultKt.b(obj);
        f0(new et0(new MapCameraViewState.UpdatedState.CustomCameraUpdate(mapCameraUpdate, (Long) obj), 27));
        return Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void m() {
        Job job = this.L;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.M;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        Job job3 = this.e0;
        if (job3 != null) {
            ((JobSupport) job3).cancel(null);
        }
        this.e0 = null;
        Job job4 = this.P;
        if (job4 != null) {
            ((JobSupport) job4).cancel(null);
        }
        Job job5 = this.Q;
        if (job5 != null) {
            ((JobSupport) job5).cancel(null);
        }
        this.Q = null;
        Job job6 = this.U;
        if (job6 != null) {
            ((JobSupport) job6).cancel(null);
        }
        this.U = null;
        Job job7 = this.S;
        if (job7 != null) {
            ((JobSupport) job7).cancel(null);
        }
        this.S = null;
        Job job8 = this.b0;
        if (job8 != null) {
            ((JobSupport) job8).cancel(null);
        }
        this.b0 = null;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void n() {
        if (U()) {
            BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1(this, null), 3);
        }
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void o(Source source) {
        Intrinsics.i(source, "source");
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
        if (premiumReserveTicketAppModel != null) {
            Job job = this.L;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                c0(premiumReserveTicketAppModel, source);
            }
            Job job2 = this.M;
            if (job2 == null || !job2.isActive()) {
                G();
            }
            S();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final Object p(ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1 premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel3;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel4;
        String str;
        long jLongValue;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1(this, continuationImpl);
        }
        Object objC = premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.label;
        BasicInfoContract basicInfoContract = this.b;
        PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated dialogTypeUpdated = PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            premiumReserveTicketAppModel = this.K;
            if (premiumReserveTicketAppModel != null) {
                premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$0 = premiumReserveTicketAppModel;
                premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$1 = premiumReserveTicketAppModel;
                premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.label = 1;
                objC = basicInfoContract.c(premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1);
                if (objC != coroutineSingletons) {
                    premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 == 1) {
            PremiumReserveTicketAppModel premiumReserveTicketAppModel5 = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$1;
            PremiumReserveTicketAppModel premiumReserveTicketAppModel6 = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$0;
            ResultKt.b(objC);
            premiumReserveTicketAppModel2 = premiumReserveTicketAppModel5;
            premiumReserveTicketAppModel = premiumReserveTicketAppModel6;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketAppModel4 = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$1;
            premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$0;
            ResultKt.b(objC);
        }
        jLongValue = ((Number) objC).longValue();
        if (!premiumReserveTicketAppModel4.c(jLongValue) || premiumReserveTicketAppModel4.f7113a.h != PremiumReserveTicketStatus.ACTIVE || jLongValue < premiumReserveTicketAppModel4.c.d) {
            str = PremiumBusActivationScreenBottomSheetTypes.TripNotStarted.c.b;
            f0(new zv0(17));
            J(dialogTypeUpdated);
        } else {
            if (this.h.a()) {
                str = PremiumBusActivationScreenBottomSheetTypes.Confirmation.c.b;
                f0(new zv0(20));
                ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel3.f7113a;
                ValidationProduct validationProductB = ValidationProduct.Companion.b(companion, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, premiumReserveTicketBookingPropertiesAppModel.f7114a);
                if (validationProductB != null) {
                    J(new PremiumReserveTicketPostBookingActionEffect.NavigateToValidation(validationProductB, ValidationProcessFlowDetails.ConductorValidation.INSTANCE));
                }
                return unit;
            }
            str = PremiumBusActivationScreenBottomSheetTypes.BleFeatureNotAvailable.c.b;
            f0(new zv0(18));
            J(dialogTypeUpdated);
        }
        premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
        if (str == null) {
            str = "UNCLEAR";
        }
        this.t.d(str, premiumReserveTicketAppModel.f7113a.f7114a, premiumReserveTicketAppModel.b.f7117a);
        return unit;
        if (!premiumReserveTicketAppModel2.c(((Number) objC).longValue())) {
            premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$0 = premiumReserveTicketAppModel;
            premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.L$1 = premiumReserveTicketAppModel;
            premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1.label = 2;
            objC = basicInfoContract.c(premiumReserveTicketPostBookingActionHandlerImpl$verifyTicket$1);
            if (objC != coroutineSingletons) {
                premiumReserveTicketAppModel3 = premiumReserveTicketAppModel;
                premiumReserveTicketAppModel4 = premiumReserveTicketAppModel3;
                jLongValue = ((Number) objC).longValue();
                if (!premiumReserveTicketAppModel4.c(jLongValue)) {
                    str = PremiumBusActivationScreenBottomSheetTypes.TripNotStarted.c.b;
                    f0(new zv0(17));
                    J(dialogTypeUpdated);
                } else {
                    str = PremiumBusActivationScreenBottomSheetTypes.TripNotStarted.c.b;
                    f0(new zv0(17));
                    J(dialogTypeUpdated);
                }
                premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
            }
            return coroutineSingletons;
        }
        str = PremiumBusActivationScreenBottomSheetTypes.Expired.c.b;
        f0(new zv0(16));
        J(dialogTypeUpdated);
        if (str == null) {
            str = "UNCLEAR";
        }
        this.t.d(str, premiumReserveTicketAppModel.f7113a.f7114a, premiumReserveTicketAppModel.b.f7117a);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final Object q(final PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel, boolean z, List list, ContinuationImpl continuationImpl) {
        PremiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1 premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1;
        String str;
        PremiumReserveTicketPostBookingActionEffect navigateToCallSupport;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (continuationImpl instanceof PremiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1) {
            premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1 = (PremiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1) continuationImpl;
            int i = premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1 = new PremiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1(this, continuationImpl);
        }
        Object objB = premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1.label;
        Unit unit = Unit.f17538a;
        final int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(objB);
            PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
            String str8 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null;
            String str9 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.d : null;
            String str10 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.e : null;
            PremiumReserveTicketOptionAction premiumReserveTicketOptionAction = premiumBusProductOptionsAppModel.f2387a;
            PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = premiumBusProductOptionsAppModel.i;
            String str11 = premiumBusProductOptionsAppModel.g;
            boolean z2 = premiumBusProductOptionsAppModel.e;
            Object[] objArr = 0;
            X(premiumReserveTicketOptionAction, z2, false);
            if (!z2) {
                final Object[] objArr2 = objArr == true ? 1 : 0;
                f0(new Function1() { // from class: qw0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PremiumReserveTicketPostBookingActionState it = (PremiumReserveTicketPostBookingActionState) obj;
                        switch (objArr2) {
                            case 0:
                                Intrinsics.i(it, "it");
                                return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.ActionNotAllowed(premiumBusProductOptionsAppModel), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
                            default:
                                Intrinsics.i(it, "it");
                                return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.TripRescheduleConfirmation(premiumBusProductOptionsAppModel), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
                        }
                    }
                });
                J(PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a);
                return unit;
            }
            String str12 = "";
            switch (WhenMappings.b[premiumReserveTicketOptionAction.ordinal()]) {
                case 1:
                    f0(new qi(premiumBusProductOptionsAppModel, z, s(), 8));
                    String str13 = premiumBusProductOptionsAppModel.d;
                    PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = this.K;
                    Map mapI = MapsKt.i(new Pair("bookingId", String.valueOf(premiumReserveTicketAppModel2 != null ? premiumReserveTicketAppModel2.f7113a.f7114a : null)), new Pair("activeBookingActionType", premiumReserveTicketOptionAction.name()), new Pair("activeBookingActionSubText", String.valueOf(str13)));
                    PremiumBusAnalyticsHelper premiumBusAnalyticsHelper = this.t;
                    premiumBusAnalyticsHelper.e(mapI);
                    PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType = premiumBusProductModificationAdditionalInfoAppModel != null ? premiumBusProductModificationAdditionalInfoAppModel.d : null;
                    int i4 = premiumProductionModificationAdditionalInfoCtaActionType == null ? -1 : WhenMappings.f7451a[premiumProductionModificationAdditionalInfoCtaActionType.ordinal()];
                    if (i4 != -1) {
                        if (i4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = this.K;
                        if (premiumReserveTicketAppModel3 != null && (str = premiumReserveTicketAppModel3.f7113a.j) != null) {
                            str12 = str;
                        }
                        premiumBusAnalyticsHelper.f(str12);
                    }
                    J(PremiumReserveTicketPostBookingActionEffect.OpenTripCancellationConfirmationBottomSheet.f7444a);
                    return unit;
                case 2:
                    if (premiumBusProductModificationAdditionalInfoAppModel != null) {
                        f0(new Function1() { // from class: qw0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                PremiumReserveTicketPostBookingActionState it = (PremiumReserveTicketPostBookingActionState) obj;
                                switch (i3) {
                                    case 0:
                                        Intrinsics.i(it, "it");
                                        return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.ActionNotAllowed(premiumBusProductOptionsAppModel), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
                                    default:
                                        Intrinsics.i(it, "it");
                                        return PremiumReserveTicketPostBookingActionState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.TripRescheduleConfirmation(premiumBusProductOptionsAppModel), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
                                }
                            }
                        });
                        J(PremiumReserveTicketPostBookingActionEffect.OpenTripRescheduleConfirmationBottomSheet.f7445a);
                        return unit;
                    }
                    if (str8 == null) {
                        str8 = "";
                    }
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (str10 == null) {
                        str10 = "";
                    }
                    J(new PremiumReserveTicketPostBookingActionEffect.NavigateToRescheduleFlow(str8, str9, str10, list.size()));
                    return unit;
                case 3:
                    if (str11 == null || str11.length() == 0) {
                        premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1.label = 1;
                        objB = this.c.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumReserveTicketPostBookingActionHandlerImpl$handleMoreOptionsItem$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        navigateToCallSupport = new PremiumReserveTicketPostBookingActionEffect.NavigateToCallSupport(str11);
                    }
                    J(navigateToCallSupport);
                    return unit;
                case 4:
                    J(PremiumReserveTicketPostBookingActionEffect.NavigateToChatSupport.f7436a);
                    return unit;
                case 5:
                    String str14 = str8 == null ? "" : str8;
                    PremiumReserveTicketAppModel premiumReserveTicketAppModel4 = this.K;
                    J(new PremiumReserveTicketPostBookingActionEffect.NavigateToSeatSelection(new PremiumBusSeatSelectionFlowType.ChangeSeat(str14, premiumReserveTicketAppModel4 != null ? premiumReserveTicketAppModel4.b.f7117a : "", (premiumReserveTicketAppModel4 == null || (str3 = premiumReserveTicketAppModel4.b.g.f7121a) == null) ? "" : str3, (premiumReserveTicketAppModel4 == null || (str2 = premiumReserveTicketAppModel4.b.h.f7121a) == null) ? "" : str2, list)));
                    return unit;
                case 6:
                    if (str8 == null) {
                        str8 = "";
                    }
                    PremiumReserveTicketAppModel premiumReserveTicketAppModel5 = this.K;
                    String str15 = (premiumReserveTicketAppModel5 == null || (str7 = premiumReserveTicketAppModel5.b.g.f7121a) == null) ? "" : str7;
                    String str16 = (premiumReserveTicketAppModel5 == null || (str6 = premiumReserveTicketAppModel5.b.h.f7121a) == null) ? "" : str6;
                    String str17 = (premiumReserveTicketAppModel5 == null || (str5 = premiumReserveTicketAppModel5.b.e) == null) ? "" : str5;
                    MutableStateFlow mutableStateFlow = this.H;
                    PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
                    PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned ? (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState : null;
                    String str18 = (vehicleAssigned == null || (str4 = vehicleAssigned.b) == null) ? "" : str4;
                    PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
                    J(new PremiumReserveTicketPostBookingActionEffect.NavigateToChangePickupStop(str8, str15, str16, str17, str18, premiumBusBookingVehicleInfoState2 != null ? PremiumBusTripInfoContractKt.a(premiumBusBookingVehicleInfoState2) : false));
                    return unit;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        navigateToCallSupport = new PremiumReserveTicketPostBookingActionEffect.UnknownErrorToast((String) objB);
        J(navigateToCallSupport);
        return unit;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void r() {
        String str;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel;
        String str2;
        int i;
        MutableStateFlow mutableStateFlow = this.H;
        List list = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).s;
        if (list != null) {
            f0(new lu0(9, this, list));
            return;
        }
        RouteAppModel routeAppModel = this.O;
        if (routeAppModel == null) {
            return;
        }
        List list2 = routeAppModel.e;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).d;
        if (premiumStopDetailsAppModel2 == null || (str = premiumStopDetailsAppModel2.f7121a) == null || (premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).e) == null || (str2 = premiumStopDetailsAppModel.f7121a) == null) {
            return;
        }
        Iterator it = list2.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                break;
            } else {
                i3++;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.d(((StopAppModel) it2.next()).f1727a, str2)) {
                i = i2;
                break;
            }
            i2++;
        }
        List listSubList = list2.subList(i3, i + 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList.add(((StopAppModel) it3.next()).b);
        }
        f0(new lu0(10, routeAppModel, arrayList));
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final PremiumBusProductOptionsAppModel s() {
        PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(this.H).getValue()).o;
        Object obj = null;
        if ((premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ActionNotAllowed) || Intrinsics.d(premiumBusPostBookingBottomSheetType, PremiumBusPostBookingBottomSheetType.ActivationCurrentlyNotAllowed.f7417a) || Intrinsics.d(premiumBusPostBookingBottomSheetType, PremiumBusPostBookingBottomSheetType.BleFeatureNotAvailable.f7418a) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.BookingAckRequired) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.Error) || Intrinsics.d(premiumBusPostBookingBottomSheetType, PremiumBusPostBookingBottomSheetType.Expired.f7421a) || Intrinsics.d(premiumBusPostBookingBottomSheetType, PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions.f7422a) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ShowAllocatedSeats) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripRescheduleConfirmation) || premiumBusPostBookingBottomSheetType == null) {
            return null;
        }
        if (!(premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.SeeMoreOptions)) {
            if (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripCancellationConfirmation) {
                return ((PremiumBusPostBookingBottomSheetType.TripCancellationConfirmation) premiumBusPostBookingBottomSheetType).c;
            }
            throw new NoWhenBranchMatchedException();
        }
        for (Object obj2 : ((PremiumBusPostBookingBottomSheetType.SeeMoreOptions) premiumBusPostBookingBottomSheetType).f7423a) {
            if (((PremiumBusProductOptionsAppModel) obj2).f2387a == PremiumReserveTicketOptionAction.RESCHEDULE_RIDE) {
                obj = obj2;
                break;
            }
        }
        return (PremiumBusProductOptionsAppModel) obj;
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void t(List allocatedSeats) {
        Intrinsics.i(allocatedSeats, "allocatedSeats");
        f0(new ud(allocatedSeats, 24));
        J(PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a);
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void u() {
        Job job = this.N;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.K;
            this.t.i(premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.f7113a.f7114a : null);
            PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = this.K;
            if (premiumReserveTicketAppModel2 != null) {
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel2.f7113a;
                String str = premiumReserveTicketBookingPropertiesAppModel.f7114a;
                String str2 = premiumReserveTicketBookingPropertiesAppModel.d;
                String str3 = str2 == null ? "" : str2;
                String str4 = premiumReserveTicketBookingPropertiesAppModel.e;
                String str5 = str4 == null ? "" : str4;
                f0(new zv0(23));
                J(PremiumReserveTicketPostBookingActionEffect.DialogTypeUpdated.f7431a);
                this.N = BuildersKt.d(this.J, null, null, new PremiumReserveTicketPostBookingActionHandlerImpl$showMoreOptionsAvailable$2(this, str, str3, str5, null), 3);
            }
        }
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void v() {
        MutableStateFlow mutableStateFlow;
        Object value;
        Sequence children;
        do {
            mutableStateFlow = this.H;
            value = mutableStateFlow.getValue();
            PremiumReserveTicketPostBookingActionState it = (PremiumReserveTicketPostBookingActionState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, new PremiumReserveTicketPostBookingActionState()));
        this.f0 = null;
        this.g0 = null;
        Job job = (Job) this.J.f17866a.get(Job.Key.f17732a);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator f17660a = children.getF17660a();
        while (f17660a.hasNext()) {
            ((Job) f17660a.next()).cancel(null);
        }
    }

    @Override // app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler
    public final void w(String stopId, boolean z) {
        Intrinsics.i(stopId, "stopId");
        MutableStateFlow mutableStateFlow = this.H;
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).m;
        if (premiumBusBookingVehicleInfoState == null || PremiumBusTripInfoContractKt.a(premiumBusBookingVehicleInfoState)) {
            if (z) {
                Z(stopId);
                return;
            } else {
                Y(stopId);
                return;
            }
        }
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = ((PremiumReserveTicketPostBookingActionState) FlowKt.c(mutableStateFlow).getValue()).d;
        if (stopId.equals(premiumStopDetailsAppModel != null ? premiumStopDetailsAppModel.f7121a : null)) {
            T();
        }
    }
}

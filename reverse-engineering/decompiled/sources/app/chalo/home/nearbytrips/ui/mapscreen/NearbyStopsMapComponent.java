package app.chalo.home.nearbytrips.ui.mapscreen;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.MapProjection;
import app.chalo.compose.components.chalomap.ProjectionUtils;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataHolder;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerState;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.im0;
import defpackage.wi0;
import defpackage.za0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapState;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyStopsMapComponent extends ChaloBaseStateMviComponent<NearbyStopsMapIntent, NearbyStopsMapState, NearbyStopsMapState, NearbyStopsMapEffect> {
    public final LocationPermissionCallbackHandler A;
    public final GpsRequestHandlerProvider B;
    public final CrashlyticsLogger C;
    public final NearbyStopsMarkerHelper D;
    public final LatLngBoundsUtils E;
    public Job F;
    public Job G;
    public Job H;
    public Job I;
    public final ChaloLocationManager k;
    public final CityProvider l;
    public final StringProvider m;
    public final ArePermissionsGrantedUseCase n;
    public final NearbyTripsDataManagerBase o;
    public final BasicInfoContract p;
    public final GetEstimatedTimeUseCase q;
    public final StopTripDetailsAnalyticsEventHelper r;
    public final AnalyticsContract s;
    public final ChaloNavigationManager t;
    public final KotlinToastManager u;
    public final SystemHelper v;
    public final TimeUtilsContract w;
    public final ProjectionUtils x;
    public final PermissionHandlerProvider y;
    public final UniversalSearchResultStateManager z;

    /* JADX INFO: renamed from: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$1", f = "NearbyStopsMapComponent.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return NearbyStopsMapComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                NearbyTripsDataManagerBase nearbyTripsDataManagerBase = NearbyStopsMapComponent.this.o;
                this.label = 1;
                Object objB = nearbyTripsDataManagerBase.d.b(this);
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$2", f = "NearbyStopsMapComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NearbyStopsMapComponent f3141a;

            public AnonymousClass1(NearbyStopsMapComponent nearbyStopsMapComponent) {
                this.f3141a = nearbyStopsMapComponent;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NearbyTripsDataManagerState nearbyTripsDataManagerState, Continuation continuation) {
                NearbyStopsMapComponent$2$1$emit$1 nearbyStopsMapComponent$2$1$emit$1;
                if (continuation instanceof NearbyStopsMapComponent$2$1$emit$1) {
                    nearbyStopsMapComponent$2$1$emit$1 = (NearbyStopsMapComponent$2$1$emit$1) continuation;
                    int i = nearbyStopsMapComponent$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nearbyStopsMapComponent$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        nearbyStopsMapComponent$2$1$emit$1 = new NearbyStopsMapComponent$2$1$emit$1(this, continuation);
                    }
                } else {
                    nearbyStopsMapComponent$2$1$emit$1 = new NearbyStopsMapComponent$2$1$emit$1(this, continuation);
                }
                Object objH0 = nearbyStopsMapComponent$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = nearbyStopsMapComponent$2$1$emit$1.label;
                NearbyStopsMapComponent nearbyStopsMapComponent = this.f3141a;
                if (i2 == 0) {
                    ResultKt.b(objH0);
                    NearbyStopsMapState nearbyStopsMapState = (NearbyStopsMapState) nearbyStopsMapComponent.f.getValue();
                    nearbyStopsMapComponent$2$1$emit$1.L$0 = nearbyTripsDataManagerState;
                    nearbyStopsMapComponent$2$1$emit$1.label = 1;
                    objH0 = NearbyStopsMapComponent.H0(nearbyStopsMapComponent, nearbyTripsDataManagerState, nearbyStopsMapState, nearbyStopsMapComponent$2$1$emit$1);
                    if (objH0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nearbyTripsDataManagerState = (NearbyTripsDataManagerState) nearbyStopsMapComponent$2$1$emit$1.L$0;
                    ResultKt.b(objH0);
                }
                nearbyStopsMapComponent.E0(new za0(14, nearbyStopsMapComponent, nearbyTripsDataManagerState, (NearbyStopsDataInfo) objH0));
                return Unit.f17538a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return NearbyStopsMapComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                NearbyStopsMapComponent nearbyStopsMapComponent = NearbyStopsMapComponent.this;
                StateFlow stateFlow = nearbyStopsMapComponent.o.i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(nearbyStopsMapComponent);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapComponent$Companion;", "", "", "NUM_OF_SUMMARIES", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent(ComponentContext componentContext, NearbyStopsMapArgs args, ChaloLocationManager chaloLocationManager, CityProvider cityProvider, StringProvider stringProvider, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, NearbyTripsDataManagerBase nearbyTripsDataManagerBase, BasicInfoContract basicInfoContract, GetEstimatedTimeUseCase getEstimatedTimeUseCase, StopTripDetailsAnalyticsEventHelper stopTripDetailsAnalyticsEventHelper, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, SystemHelper systemHelper, TimeUtilsContract timeUtilsContract, ProjectionUtils projectionUtils, PermissionHandlerProvider permissionHandlerProvider, UniversalSearchResultStateManager universalSearchResultStateManager, LocationPermissionCallbackHandler locationPermissionCallbackHandler, GpsRequestHandlerProvider gpsRequestHandlerProvider, CrashlyticsLogger crashlyticsLogger, NearbyStopsMarkerHelper nearbyStopsMarkerHelper, LatLngBoundsUtils latLngBoundsUtils) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = chaloLocationManager;
        this.l = cityProvider;
        this.m = stringProvider;
        this.n = arePermissionsGrantedUseCase;
        this.o = nearbyTripsDataManagerBase;
        this.p = basicInfoContract;
        this.q = getEstimatedTimeUseCase;
        this.r = stopTripDetailsAnalyticsEventHelper;
        this.s = analyticsContract;
        this.t = chaloNavigationManager;
        this.u = kotlinToastManager;
        this.v = systemHelper;
        this.w = timeUtilsContract;
        this.x = projectionUtils;
        this.y = permissionHandlerProvider;
        this.z = universalSearchResultStateManager;
        this.A = locationPermissionCallbackHandler;
        this.B = gpsRequestHandlerProvider;
        this.C = crashlyticsLogger;
        this.D = nearbyStopsMarkerHelper;
        this.E = latLngBoundsUtils;
        ContextScope parentScope = this.j;
        Intrinsics.i(parentScope, "parentScope");
        nearbyTripsDataManagerBase.b.b(parentScope);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
        L0(new NearbyStopsMapIntent.InitializationIntent(args.b, args.c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object F0(NearbyStopsMapComponent nearbyStopsMapComponent, LatLng latLng, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) {
        NearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1 nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1;
        CityAppModel cityAppModel;
        CityProvider cityProvider = nearbyStopsMapComponent.l;
        ContextScope contextScope = nearbyStopsMapComponent.j;
        NearbyTripsDataManagerBase nearbyTripsDataManagerBase = nearbyStopsMapComponent.o;
        if (continuationImpl instanceof NearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1) {
            nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1 = (NearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1) continuationImpl;
            int i = nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1 = new NearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1(nearbyStopsMapComponent, continuationImpl);
            }
        } else {
            nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1 = new NearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1(nearbyStopsMapComponent, continuationImpl);
        }
        Object objA = nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            CityAppModel cityAppModel2 = (CityAppModel) cityProvider.getE().getValue();
            if (cityAppModel2 != null && CityAppModelKt.b(cityAppModel2, latLng)) {
                nearbyTripsDataManagerBase.a(latLng, chaloTransitMode, contextScope);
            } else if (!cityProvider.getC()) {
                nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.L$0 = chaloTransitMode;
                nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.label = 1;
                objA = cityProvider.a(latLng, nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chaloTransitMode = (ChaloTransitMode) nearbyStopsMapComponent$checkIfCityChangeNeededElseMakeCall$1.L$0;
        ResultKt.b(objA);
        if (((BasicCityInfoAppModel) objA) == null && (cityAppModel = (CityAppModel) cityProvider.getE().getValue()) != null) {
            nearbyTripsDataManagerBase.a(cityAppModel.d, chaloTransitMode, contextScope);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(NearbyStopsMapComponent nearbyStopsMapComponent, ContinuationImpl continuationImpl) {
        NearbyStopsMapComponent$getInitialLocationToLoadMap$1 nearbyStopsMapComponent$getInitialLocationToLoadMap$1;
        nearbyStopsMapComponent.getClass();
        if (continuationImpl instanceof NearbyStopsMapComponent$getInitialLocationToLoadMap$1) {
            nearbyStopsMapComponent$getInitialLocationToLoadMap$1 = (NearbyStopsMapComponent$getInitialLocationToLoadMap$1) continuationImpl;
            int i = nearbyStopsMapComponent$getInitialLocationToLoadMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyStopsMapComponent$getInitialLocationToLoadMap$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyStopsMapComponent$getInitialLocationToLoadMap$1 = new NearbyStopsMapComponent$getInitialLocationToLoadMap$1(nearbyStopsMapComponent, continuationImpl);
            }
        } else {
            nearbyStopsMapComponent$getInitialLocationToLoadMap$1 = new NearbyStopsMapComponent$getInitialLocationToLoadMap$1(nearbyStopsMapComponent, continuationImpl);
        }
        Object objA = nearbyStopsMapComponent$getInitialLocationToLoadMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyStopsMapComponent$getInitialLocationToLoadMap$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloLocationManager chaloLocationManager = nearbyStopsMapComponent.k;
            nearbyStopsMapComponent$getInitialLocationToLoadMap$1.label = 1;
            objA = chaloLocationManager.a(nearbyStopsMapComponent$getInitialLocationToLoadMap$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        CityAppModel cityAppModel = (CityAppModel) nearbyStopsMapComponent.l.getE().getValue();
        if (cityAppModel == null) {
            return null;
        }
        return (latLngA == null || !CityAppModelKt.b(cityAppModel, latLngA)) ? cityAppModel.d : latLngA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object H0(NearbyStopsMapComponent nearbyStopsMapComponent, NearbyTripsDataManagerState nearbyTripsDataManagerState, NearbyStopsMapState nearbyStopsMapState, ContinuationImpl continuationImpl) {
        NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1 nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1;
        List list;
        LatLng latLng;
        nearbyStopsMapComponent.getClass();
        if (continuationImpl instanceof NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1) {
            nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1 = (NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1) continuationImpl;
            int i = nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1 = new NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1(nearbyStopsMapComponent, continuationImpl);
            }
        } else {
            nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1 = new NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1(nearbyStopsMapComponent, continuationImpl);
        }
        NearbyStopsMapComponent$getUpdatedNearbyDataHolder$1 nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2 = nearbyStopsMapComponent$getUpdatedNearbyDataHolder$1;
        Object objK0 = nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2.label;
        if (i2 == 0) {
            ResultKt.b(objK0);
            NearbyTripsDataHolder nearbyTripsDataHolder = nearbyTripsDataManagerState.f3122a;
            if (nearbyTripsDataHolder == null || !Intrinsics.d(nearbyTripsDataHolder.f3117a, nearbyStopsMapState.d)) {
                return nearbyStopsMapState.e;
            }
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float fFloatValue = 12.0f;
            floatRef.element = 12.0f;
            ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = nearbyStopsMapState.h;
            if (chaloMapCameraPositionStateData != null) {
                ChaloUseCaseResult chaloUseCaseResultA = nearbyStopsMapComponent.x.a(chaloMapCameraPositionStateData.d);
                if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure)) {
                    if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fFloatValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResultA).f10419a).floatValue();
                }
                floatRef.element = fFloatValue;
            }
            NearbyTripsDataHolder nearbyTripsDataHolder2 = nearbyTripsDataManagerState.f3122a;
            LatLng latLng2 = nearbyTripsDataHolder2.f3117a;
            ArrayList arrayList = nearbyTripsDataHolder2.b;
            NearbyStopsDataInfo nearbyStopsDataInfo = nearbyStopsMapState.e;
            if (nearbyStopsDataInfo == null || (list = nearbyStopsDataInfo.b) == null) {
                list = EmptyList.f17557a;
            }
            List list2 = list;
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = nearbyStopsMapState.i;
            String str = nearbyStopAndTripsUiModel != null ? nearbyStopAndTripsUiModel.b : null;
            float f = floatRef.element;
            nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2.L$0 = latLng2;
            nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2.label = 1;
            objK0 = nearbyStopsMapComponent.K0(arrayList, list2, str, f, nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2);
            if (objK0 == obj) {
                return obj;
            }
            latLng = latLng2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) nearbyStopsMapComponent$getUpdatedNearbyDataHolder$2.L$0;
            ResultKt.b(objK0);
        }
        return new NearbyStopsDataInfo(latLng, (List) objK0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object I0(NearbyStopsMapComponent nearbyStopsMapComponent, ContinuationImpl continuationImpl) {
        NearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1 nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1;
        String str;
        nearbyStopsMapComponent.getClass();
        if (continuationImpl instanceof NearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1) {
            nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1 = (NearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1) continuationImpl;
            int i = nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1 = new NearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1(nearbyStopsMapComponent, continuationImpl);
            }
        } else {
            nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1 = new NearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1(nearbyStopsMapComponent, continuationImpl);
        }
        Object obj = nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strA = KUUID.a();
            nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.L$0 = strA;
            nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.label = 1;
            Object objB = nearbyStopsMapComponent.m.b(StringEnum.ENTER_STOP_SEARCH, new Object[0], nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strA;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) nearbyStopsMapComponent$navigateToUniversalPickerActivityAndWaitForResult$1.L$0;
            ResultKt.b(obj);
            str = str2;
        }
        String str3 = (String) obj;
        Job job = nearbyStopsMapComponent.H;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        nearbyStopsMapComponent.H = BuildersKt.d(nearbyStopsMapComponent.j, null, null, new NearbyStopsMapComponent$waitForUniversalSearchResult$1(nearbyStopsMapComponent, str, null), 3);
        ChaloNavigationManager chaloNavigationManager = nearbyStopsMapComponent.t;
        Json json = ChaloJson.b;
        UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.STOPS(false, false)));
        json.getClass();
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions), str3, UniversalSearchFlowSource.NEAR_BY_STOPS.getSourceName(), Source.NEARBY_STOPS_MAP_FRAGMENT, (String) null, "ACTIVITY_RESULT", str, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1936), null, null, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ba -> B:25:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object J0(app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent r21, app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel r22, app.chalo.location.LatLng r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent.J0(app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent, app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel, app.chalo.location.LatLng, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e4 -> B:42:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:41:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K0(java.util.ArrayList r17, java.util.List r18, java.lang.String r19, float r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent.K0(java.util.ArrayList, java.util.List, java.lang.String, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    public final void L0(NearbyStopsMapIntent intent) {
        String strA;
        NearbyStopsDataAndMarkerHolder nearbyStopsDataAndMarkerHolder;
        List list;
        Object next;
        String str;
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel;
        List list2;
        Object next2;
        Float f;
        Float f2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof NearbyStopsMapIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        StateFlow stateFlow = this.f;
        if (z) {
            NearbyStopsMapIntent.InitializationIntent initializationIntent = (NearbyStopsMapIntent.InitializationIntent) intent;
            if (((NearbyStopsMapState) stateFlow.getValue()).k) {
                BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$handleInitializationIntent$1(this, initializationIntent, null), 3);
                return;
            }
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.MapLoadedIntent.f3154a)) {
            E0(new im0(10));
            return;
        }
        boolean z2 = intent instanceof NearbyStopsMapIntent.MapCameraPositionStateChangedIntent;
        ProjectionUtils projectionUtils = this.x;
        if (z2) {
            NearbyStopsMapIntent.MapCameraPositionStateChangedIntent mapCameraPositionStateChangedIntent = (NearbyStopsMapIntent.MapCameraPositionStateChangedIntent) intent;
            ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = mapCameraPositionStateChangedIntent.f3153a;
            if (chaloMapCameraPositionStateData.f1862a) {
                return;
            }
            E0(new wi0(mapCameraPositionStateChangedIntent, 26));
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = ((NearbyStopsMapState) stateFlow.getValue()).i;
            String str2 = nearbyStopAndTripsUiModel2 != null ? nearbyStopAndTripsUiModel2.b : null;
            ChaloUseCaseResult chaloUseCaseResultA = projectionUtils.a(chaloMapCameraPositionStateData.d);
            if (chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure) {
                f2 = null;
            } else {
                if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = (Float) ((ChaloUseCaseResult.Success) chaloUseCaseResultA).f10419a;
            }
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$updateMarkersIfNeeded$1(this, str2, f2, null), 3);
            MapProjection mapProjection = chaloMapCameraPositionStateData.c;
            if (mapProjection == null) {
                return;
            }
            ChaloUseCaseResult chaloUseCaseResultB = projectionUtils.b(mapProjection);
            if (chaloUseCaseResultB instanceof ChaloUseCaseResult.Failure) {
                return;
            }
            if (!(chaloUseCaseResultB instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            LatLng latLng = (LatLng) ((ChaloUseCaseResult.Success) chaloUseCaseResultB).f10419a;
            ChaloTransitMode chaloTransitMode = ((NearbyStopsMapState) stateFlow.getValue()).c;
            if (chaloTransitMode == null) {
                chaloTransitMode = ChaloTransitMode.BUS;
            }
            this.o.a(latLng, chaloTransitMode, contextScope);
            return;
        }
        if (intent instanceof NearbyStopsMapIntent.StopMarkerClicked) {
            NearbyStopsMapIntent.StopMarkerClicked stopMarkerClicked = (NearbyStopsMapIntent.StopMarkerClicked) intent;
            NearbyStopsMapState nearbyStopsMapState = (NearbyStopsMapState) stateFlow.getValue();
            NearbyStopsDataInfo nearbyStopsDataInfo = nearbyStopsMapState.e;
            if (nearbyStopsDataInfo == null || (list2 = nearbyStopsDataInfo.b) == null) {
                return;
            }
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.d(((NearbyStopsDataAndMarkerHolder) next2).f3139a.e.f1727a, stopMarkerClicked.f3160a.f1727a));
            NearbyStopsDataAndMarkerHolder nearbyStopsDataAndMarkerHolder2 = (NearbyStopsDataAndMarkerHolder) next2;
            if (nearbyStopsDataAndMarkerHolder2 == null) {
                return;
            }
            LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel = nearbyStopsDataAndMarkerHolder2.f3139a;
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel3 = nearbyStopsMapState.i;
            String str3 = nearbyStopAndTripsUiModel3 != null ? nearbyStopAndTripsUiModel3.b : null;
            String str4 = locationSummaryPayloadResponseAppModel.f;
            StopAppModel stopAppModel = locationSummaryPayloadResponseAppModel.e;
            if (Intrinsics.d(str3, str4)) {
                return;
            }
            String str5 = stopAppModel.b;
            ChaloTransitMode chaloTransitMode2 = stopAppModel.d;
            Source source = Source.NEARBY_STOPS_MAP_FRAGMENT;
            Source source2 = ((NearbyStopsMapState) stateFlow.getValue()).l;
            if (source2 == null) {
                source2 = Source.UNKNOWN;
            }
            AnalyticsContractImplKt.a(this.s, "nearby stops marker click", source, source2, MapsKt.i(new Pair("mode", chaloTransitMode2.getMode()), new Pair("stop", str5)), 48);
            Job job = this.F;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.F = BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$handleStopMarkerClickedIntent$1(this, nearbyStopsDataAndMarkerHolder2, nearbyStopsMapState, null), 3);
            String str6 = stopAppModel.f1727a;
            ChaloMapCameraPositionStateData chaloMapCameraPositionStateData2 = nearbyStopsMapState.h;
            if (chaloMapCameraPositionStateData2 != null) {
                ChaloUseCaseResult chaloUseCaseResultA2 = projectionUtils.a(chaloMapCameraPositionStateData2.d);
                if (chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Failure) {
                    f = null;
                } else {
                    if (!(chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = (Float) ((ChaloUseCaseResult.Success) chaloUseCaseResultA2).f10419a;
                }
            } else {
                f = null;
            }
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$updateMarkersIfNeeded$1(this, str6, f, null), 3);
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$showBottomSheetWithDelay$1(this, null), 3);
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.FragmentStartIntent.f3147a)) {
            NearbyStopsMapState nearbyStopsMapState2 = (NearbyStopsMapState) stateFlow.getValue();
            NearbyStopsDataInfo nearbyStopsDataInfo2 = nearbyStopsMapState2.e;
            if (nearbyStopsDataInfo2 == null || (list = nearbyStopsDataInfo2.b) == null) {
                nearbyStopsDataAndMarkerHolder = null;
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        str = ((NearbyStopsDataAndMarkerHolder) next).f3139a.e.f1727a;
                        nearbyStopAndTripsUiModel = nearbyStopsMapState2.i;
                    }
                } while (!Intrinsics.d(str, nearbyStopAndTripsUiModel != null ? nearbyStopAndTripsUiModel.b : null));
                nearbyStopsDataAndMarkerHolder = (NearbyStopsDataAndMarkerHolder) next;
            }
            if (nearbyStopsDataAndMarkerHolder == null) {
                E0(new im0(11));
                return;
            }
            Job job2 = this.F;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.F = BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$handleFragmentStartIntent$1(this, nearbyStopsDataAndMarkerHolder, nearbyStopsMapState2, null), 3);
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$showBottomSheetWithDelay$1(this, null), 3);
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.FragmentStopIntent.f3148a)) {
            Job job3 = this.F;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
                return;
            }
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.GoToMyLocationClickedIntent.f3149a)) {
            Job job4 = this.G;
            if (job4 != null) {
                ((JobSupport) job4).cancel(null);
            }
            this.G = BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1(this, null), 3);
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.LocationPermissionDeniedIntent.f3152a)) {
            Job job5 = this.G;
            if (job5 != null) {
                ((JobSupport) job5).cancel(null);
                return;
            }
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.GpsEnableDeniedIntent.f3150a)) {
            Job job6 = this.G;
            if (job6 != null) {
                ((JobSupport) job6).cancel(null);
                return;
            }
            return;
        }
        boolean z3 = intent instanceof NearbyStopsMapIntent.RouteClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.t;
        if (z3) {
            StopTripDetailsUiModel stopTripDetailsUiModel = ((NearbyStopsMapIntent.RouteClickedIntent) intent).f3156a;
            String str7 = stopTripDetailsUiModel.f9470a;
            String str8 = stopTripDetailsUiModel.c;
            String str9 = stopTripDetailsUiModel.b;
            String str10 = stopTripDetailsUiModel.d;
            String str11 = stopTripDetailsUiModel.f;
            String str12 = stopTripDetailsUiModel.g;
            Source source3 = Source.NEARBY_STOPS_MAP_FRAGMENT;
            Source source4 = ((NearbyStopsMapState) stateFlow.getValue()).l;
            if (source4 == null) {
                source4 = Source.UNKNOWN;
            }
            AnalyticsContractImplKt.a(this.s, "nearby stops activity card route clicked", source3, source4, MapsKt.i(new Pair("stopId", str7), new Pair("stopName", str9), new Pair("routeId", str8), new Pair("routeName", str10), new Pair("fromName", str11), new Pair("toName", str12)), 48);
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(str8, stopTripDetailsUiModel.f9470a, source3.getSourceName(), 166);
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA != null) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
                return;
            }
            return;
        }
        if (intent instanceof NearbyStopsMapIntent.SeeAllBusesClickedIntent) {
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel4 = ((NearbyStopsMapIntent.SeeAllBusesClickedIntent) intent).f3159a;
            String str13 = nearbyStopAndTripsUiModel4.b;
            String str14 = nearbyStopAndTripsUiModel4.c;
            Source source5 = Source.NEARBY_STOPS_MAP_FRAGMENT;
            Source source6 = ((NearbyStopsMapState) stateFlow.getValue()).l;
            if (source6 == null) {
                source6 = Source.UNKNOWN;
            }
            AnalyticsContractImplKt.a(this.s, "nearby stops activity card more trips clicked", source5, source6, MapsKt.i(new Pair("stopId", str13), new Pair("stopName", str14)), 48);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new StopTripDetailsArgs(nearbyStopAndTripsUiModel4.b, nearbyStopAndTripsUiModel4.c, nearbyStopAndTripsUiModel4.d, nearbyStopAndTripsUiModel4.e, source5, Double.valueOf(nearbyStopAndTripsUiModel4.f), null, null, source5.getSourceName()), null, null, 6));
            return;
        }
        if (intent.equals(NearbyStopsMapIntent.SearchStopClickedIntent.f3157a)) {
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$handleSearchStopClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof NearbyStopsMapIntent.SearchStopResultReceivedIntent) {
            BuildersKt.d(contextScope, null, null, new NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1((NearbyStopsMapIntent.SearchStopResultReceivedIntent) intent, this, null), 3);
            return;
        }
        if (intent instanceof NearbyStopsMapIntent.OnMapCameraUpdateLoadedIntent) {
            E0(new wi0((NearbyStopsMapIntent.OnMapCameraUpdateLoadedIntent) intent, 25));
            return;
        }
        if (intent instanceof NearbyStopsMapIntent.StopNameClicked) {
            E0(new im0(12));
        } else {
            if (!(intent instanceof NearbyStopsMapIntent.UpdateBottomSheetStateIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new wi0((NearbyStopsMapIntent.UpdateBottomSheetStateIntent) intent, 24));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (NearbyStopsMapState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new NearbyStopsMapState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new NearbyStopsMapState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        L0(NearbyStopsMapIntent.FragmentStartIntent.f3147a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        L0(NearbyStopsMapIntent.FragmentStopIntent.f3148a);
    }
}

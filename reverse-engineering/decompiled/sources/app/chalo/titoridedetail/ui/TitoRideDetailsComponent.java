package app.chalo.titoridedetail.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerType;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.data.model.TitoValidationConfigData;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDetailBusDataAppModel;
import app.chalo.titoridedetail.data.app.TitoRouteData;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.titoridedetail.data.app.TitoValidationStatusKt;
import app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData;
import app.chalo.titoridedetail.data.ui.TitoRideDetailsScreenLiveBusMarker;
import app.chalo.titoridedetail.domain.HandleLastProductActivationOnTitoMissedTapOutUseCase;
import app.chalo.titoridedetail.manager.TitoRideDataManager;
import app.chalo.titoridedetail.ui.compose.TitoRideDetailsScreenStopMarker;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.FeedbackTags;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import com.arkivanov.decompose.ComponentContext;
import defpackage.l11;
import defpackage.qd;
import defpackage.vo1;
import defpackage.w31;
import defpackage.wb;
import defpackage.wi1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/titoridedetail/ui/TitoRideDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsIntent;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsViewState;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsDataState;", "Lapp/chalo/titoridedetail/ui/TitoRideDetailsSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TitoRideDetailsComponent extends ChaloBaseStateMviComponent<TitoRideDetailsIntent, TitoRideDetailsViewState, TitoRideDetailsViewState, TitoRideDetailsSideEffect> {
    public final TimeUtilsContract A;
    public final ChaloMapMarkerInfoWindowProvider B;
    public final ChaloNavigationManager C;
    public final KotlinToastManager D;
    public final StringProvider E;
    public final ValidationSceneResolverUseCase F;
    public final GetMTicketForTicketIdUseCase G;
    public final ApplicationBackgroundWorkersManager H;
    public Job I;
    public Source J;
    public boolean K;
    public final AnalyticsContract k;
    public final TITOValidationDataRepository l;
    public final UserProfileDetailsProvider m;
    public final TitoRideDataManager n;
    public final ChaloLocationManager o;
    public final CityProvider p;
    public final LiveTrackingDataManager q;
    public final TITOUnifiedFlowValidationDataManager r;
    public final ProcessLiveStopEtaDataUseCase s;
    public final ChaloMapMarkerIconProvider t;
    public final ArePermissionsGrantedUseCase u;
    public final FetchTitoValidationConfigUseCase v;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase w;
    public final HandleLastProductActivationOnTitoMissedTapOutUseCase x;
    public final LatLngBoundsUtils y;
    public final PolylineUtils z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9705a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TITORideDetailScreenType.values().length];
            try {
                iArr[TITORideDetailScreenType.MISSED_TAP_OUT_FEEDBACK_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TITORideDetailScreenType.MAP_WITH_ETA_BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TITORideDetailScreenType.TITO_ONBOARDING_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TITORideDetailScreenType.TITO_ONBOARDING_FINISH_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9705a = iArr;
            int[] iArr2 = new int[TITORideDetailBottomsheetType.values().length];
            try {
                iArr2[TITORideDetailBottomsheetType.MISSED_TAP_OUT_DONE_BOTTOMSHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TITORideDetailBottomsheetType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDetailsComponent(TitoRideDetailsArgs args, AnalyticsContract analyticsContract, TITOValidationDataRepository tITOValidationDataRepository, UserProfileDetailsProvider userProfileDetailsProvider, TitoRideDataManager titoRideDataManager, ChaloLocationManager chaloLocationManager, CityProvider cityProvider, LiveTrackingDataManager liveTrackingDataManager, TITOUnifiedFlowValidationDataManager tITOUnifiedFlowValidationDataManager, ProcessLiveStopEtaDataUseCase processLiveStopEtaDataUseCase, ChaloMapMarkerIconProvider chaloMapMarkerIconProvider, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, FetchTitoValidationConfigUseCase fetchTitoValidationConfigUseCase, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, HandleLastProductActivationOnTitoMissedTapOutUseCase handleLastProductActivationOnTitoMissedTapOutUseCase, LatLngBoundsUtils latLngBoundsUtils, PolylineUtils polylineUtils, TimeUtilsContract timeUtilsContract, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, ValidationSceneResolverUseCase validationSceneResolverUseCase, GetMTicketForTicketIdUseCase getMTicketForTicketIdUseCase, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager, ComponentContext componentContext) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = analyticsContract;
        this.l = tITOValidationDataRepository;
        this.m = userProfileDetailsProvider;
        this.n = titoRideDataManager;
        this.o = chaloLocationManager;
        this.p = cityProvider;
        this.q = liveTrackingDataManager;
        this.r = tITOUnifiedFlowValidationDataManager;
        this.s = processLiveStopEtaDataUseCase;
        this.t = chaloMapMarkerIconProvider;
        this.u = arePermissionsGrantedUseCase;
        this.v = fetchTitoValidationConfigUseCase;
        this.w = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.x = handleLastProductActivationOnTitoMissedTapOutUseCase;
        this.y = latLngBoundsUtils;
        this.z = polylineUtils;
        this.A = timeUtilsContract;
        this.B = chaloMapMarkerInfoWindowProvider;
        this.C = chaloNavigationManager;
        this.D = kotlinToastManager;
        this.E = stringProvider;
        this.F = validationSceneResolverUseCase;
        this.G = getMTicketForTicketIdUseCase;
        this.H = applicationBackgroundWorkersManager;
        this.J = Source.HOME_SCREEN_MAIN_FRAGMENT;
        titoRideDataManager.b(this.j);
        M0(new TitoRideDetailsIntent.InitializationIntent(args.c, args.b));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r20.J0(r0, r7) == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0120, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0122, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.titoridedetail.ui.TitoRideDetailsComponent r20, app.chalo.titoridedetail.data.app.TitoRideDataAppModel r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.ui.TitoRideDetailsComponent.F0(app.chalo.titoridedetail.ui.TitoRideDetailsComponent, app.chalo.titoridedetail.data.app.TitoRideDataAppModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object G0(TitoRideDetailsComponent titoRideDetailsComponent, String str, ContinuationImpl continuationImpl) {
        TitoRideDetailsComponent$markTapOutMissedForTITORide$1 titoRideDetailsComponent$markTapOutMissedForTITORide$1;
        TITOValidationAppModel tITOValidationAppModel;
        TitoValidationStatus titoValidationStatus;
        TitoValidationStatus titoValidationStatus2;
        TITOValidationDataRepository tITOValidationDataRepository = titoRideDetailsComponent.l;
        if (continuationImpl instanceof TitoRideDetailsComponent$markTapOutMissedForTITORide$1) {
            titoRideDetailsComponent$markTapOutMissedForTITORide$1 = (TitoRideDetailsComponent$markTapOutMissedForTITORide$1) continuationImpl;
            int i = titoRideDetailsComponent$markTapOutMissedForTITORide$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                titoRideDetailsComponent$markTapOutMissedForTITORide$1.label = i - Integer.MIN_VALUE;
            } else {
                titoRideDetailsComponent$markTapOutMissedForTITORide$1 = new TitoRideDetailsComponent$markTapOutMissedForTITORide$1(titoRideDetailsComponent, continuationImpl);
            }
        } else {
            titoRideDetailsComponent$markTapOutMissedForTITORide$1 = new TitoRideDetailsComponent$markTapOutMissedForTITORide$1(titoRideDetailsComponent, continuationImpl);
        }
        Object objC = titoRideDetailsComponent$markTapOutMissedForTITORide$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = titoRideDetailsComponent$markTapOutMissedForTITORide$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0 = str;
            titoRideDetailsComponent$markTapOutMissedForTITORide$1.label = 1;
            objC = tITOValidationDataRepository.c(str, titoRideDetailsComponent$markTapOutMissedForTITORide$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return unit;
            }
            str = (String) titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0;
            ResultKt.b(objC);
        }
        tITOValidationAppModel = (TITOValidationAppModel) objC;
        if (tITOValidationAppModel != null && (titoValidationStatus = tITOValidationAppModel.d) != null && TitoValidationStatusKt.a(titoValidationStatus)) {
            titoValidationStatus2 = TitoValidationStatus.MISSED_TAP_OUT;
            titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0 = null;
            titoRideDetailsComponent$markTapOutMissedForTITORide$1.label = 3;
            if (tITOValidationDataRepository.a(str, titoValidationStatus2, titoRideDetailsComponent$markTapOutMissedForTITORide$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
        titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0 = str;
        titoRideDetailsComponent$markTapOutMissedForTITORide$1.label = 2;
        objC = FlowKt.v((Flow) objC, titoRideDetailsComponent$markTapOutMissedForTITORide$1);
        if (objC != coroutineSingletons) {
            tITOValidationAppModel = (TITOValidationAppModel) objC;
            if (tITOValidationAppModel != null) {
                titoValidationStatus2 = TitoValidationStatus.MISSED_TAP_OUT;
                titoRideDetailsComponent$markTapOutMissedForTITORide$1.L$0 = null;
                titoRideDetailsComponent$markTapOutMissedForTITORide$1.label = 3;
                if (tITOValidationDataRepository.a(str, titoValidationStatus2, titoRideDetailsComponent$markTapOutMissedForTITORide$1) == coroutineSingletons) {
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r12 == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r12 == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(app.chalo.titoridedetail.ui.TitoRideDetailsComponent r9, app.chalo.titoridedetail.data.app.TITOValidationAppModel r10, app.chalo.models.validation.ValidationProduct r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.ui.TitoRideDetailsComponent.H0(app.chalo.titoridedetail.ui.TitoRideDetailsComponent, app.chalo.titoridedetail.data.app.TITOValidationAppModel, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object I0(TitoVehicleAndEtaData titoVehicleAndEtaData, ContinuationImpl continuationImpl) {
        TitoRideDetailsComponent$getVehicleMarker$1 titoRideDetailsComponent$getVehicleMarker$1;
        TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel;
        if (continuationImpl instanceof TitoRideDetailsComponent$getVehicleMarker$1) {
            titoRideDetailsComponent$getVehicleMarker$1 = (TitoRideDetailsComponent$getVehicleMarker$1) continuationImpl;
            int i = titoRideDetailsComponent$getVehicleMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                titoRideDetailsComponent$getVehicleMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                titoRideDetailsComponent$getVehicleMarker$1 = new TitoRideDetailsComponent$getVehicleMarker$1(this, continuationImpl);
            }
        } else {
            titoRideDetailsComponent$getVehicleMarker$1 = new TitoRideDetailsComponent$getVehicleMarker$1(this, continuationImpl);
        }
        TitoRideDetailsComponent$getVehicleMarker$1 titoRideDetailsComponent$getVehicleMarker$2 = titoRideDetailsComponent$getVehicleMarker$1;
        Object objA = titoRideDetailsComponent$getVehicleMarker$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = titoRideDetailsComponent$getVehicleMarker$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (titoVehicleAndEtaData instanceof TitoVehicleAndEtaData.RideData) {
                titoRideDetailBusDataAppModel = ((TitoVehicleAndEtaData.RideData) titoVehicleAndEtaData).d;
                if (titoRideDetailBusDataAppModel != null) {
                    float f = titoRideDetailBusDataAppModel.e;
                    LiveBusDelayedState liveBusDelayedState = titoRideDetailBusDataAppModel.d;
                    boolean z = titoRideDetailBusDataAppModel.c;
                    titoRideDetailsComponent$getVehicleMarker$2.L$0 = titoRideDetailBusDataAppModel;
                    titoRideDetailsComponent$getVehicleMarker$2.label = 1;
                    objA = this.t.a(f, liveBusDelayedState, z, true, titoRideDetailsComponent$getVehicleMarker$2);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (!(titoVehicleAndEtaData instanceof TitoVehicleAndEtaData.DataFetchError.Error) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.RouteDataNotAvailable.f9683a) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.TapInDataNotAvailable.f9684a) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.DataFetchError.VehicleNotAvailable.f9685a) && !Intrinsics.d(titoVehicleAndEtaData, TitoVehicleAndEtaData.Fetching.f9686a)) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        titoRideDetailBusDataAppModel = (TitoRideDetailBusDataAppModel) titoRideDetailsComponent$getVehicleMarker$2.L$0;
        ResultKt.b(objA);
        PlatformMapMarkerBitmap platformMapMarkerBitmap = (PlatformMapMarkerBitmap) objA;
        boolean z2 = titoRideDetailBusDataAppModel.c;
        boolean z3 = titoRideDetailBusDataAppModel.d instanceof LiveBusDelayedState.Delayed;
        LatLng latLng = titoRideDetailBusDataAppModel.b;
        String str = titoRideDetailBusDataAppModel.f9678a;
        ChaloMapMarkerUIEventHandler.f1869a.getClass();
        return new TitoRideDetailsScreenLiveBusMarker(str, latLng, platformMapMarkerBitmap, z2, z3, (ChaloMapMarkerUIEventHandler) ChaloMapMarkerUIEventHandler.Companion.b.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(TITOValidationAppModel tITOValidationAppModel, ContinuationImpl continuationImpl) {
        TitoRideDetailsComponent$handleTITOValidationAppModelUpdate$1 titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1;
        if (continuationImpl instanceof TitoRideDetailsComponent$handleTITOValidationAppModelUpdate$1) {
            titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1 = (TitoRideDetailsComponent$handleTITOValidationAppModelUpdate$1) continuationImpl;
            int i = titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1 = new TitoRideDetailsComponent$handleTITOValidationAppModelUpdate$1(this, continuationImpl);
            }
        } else {
            titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1 = new TitoRideDetailsComponent$handleTITOValidationAppModelUpdate$1(this, continuationImpl);
        }
        Object objA = titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ValidationProduct validationProduct = tITOValidationAppModel.c.b;
            titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1.label = 1;
            objA = this.v.a(validationProduct, titoRideDetailsComponent$handleTITOValidationAppModelUpdate$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        E0(new l11(((TitoValidationConfigData) objA).d, 14));
        return Unit.f17538a;
    }

    public final void K0() {
        int i = WhenMappings.b[((TitoRideDetailsViewState) this.f.getValue()).c.ordinal()];
        if (i == 1) {
            E0(new wi1(22));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManagerKt.e(this.C, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
        }
    }

    public final void L0(long j, String str) {
        ChaloNavigationManagerKt.e(this.C, new TripSummaryArgs.TicketSummaryScreen(Source.TITO_RIDE_DETAIL_SCREEN, new BookingsRequestType.SuperPassRideType(str, j, -1L)), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.TitoRideDetails, true), 3), 4);
    }

    public final void M0(TitoRideDetailsIntent intent) {
        String str;
        TITOValidationAppModel tITOValidationAppModel;
        TapInDetailAppModel tapInDetailAppModel;
        TITOValidationAppModel tITOValidationAppModel2;
        TapInDetailAppModel tapInDetailAppModel2;
        TitoRouteData titoRouteData;
        TitoRouteData.RouteData routeDataA;
        String str2;
        Job job;
        TITOValidationAppModel tITOValidationAppModel3;
        TapInDetailAppModel tapInDetailAppModel3;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof TitoRideDetailsIntent.InitializationIntent;
        TitoRideDataManager titoRideDataManager = this.n;
        ContextScope contextScope = this.j;
        String str3 = null;
        if (z) {
            TitoRideDetailsIntent.InitializationIntent initializationIntent = (TitoRideDetailsIntent.InitializationIntent) intent;
            Source source = initializationIntent.b;
            this.J = source;
            titoRideDataManager.c(initializationIntent.f9712a, false, Source.TITO_RIDE_DETAIL_SCREEN, source);
            BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$handleInitializationIntent$1(this, initializationIntent, null), 3);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.SlideToTapOutIntent) {
            BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$handleSlideToTapOutIntent$1(this, null), 3);
            return;
        }
        boolean z2 = intent instanceof TitoRideDetailsIntent.MissedTapOutIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            Source source2 = Source.TITO_RIDE_DETAIL_SCREEN;
            Source source3 = this.J;
            TitoRideDataAppModel titoRideDataAppModel = ((TitoRideDetailsViewState) stateFlow.getValue()).f9723a;
            if (titoRideDataAppModel != null && (tITOValidationAppModel3 = titoRideDataAppModel.f9677a) != null && (tapInDetailAppModel3 = tITOValidationAppModel3.f9672a) != null) {
                str3 = tapInDetailAppModel3.f9673a;
            }
            AnalyticsContractImplKt.a(this.k, "missed tap out btn click", source2, source3, vo1.s("tap id", String.valueOf(str3)), 48);
            E0(new wi1(26));
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.BackButtonClickIntent) {
            AnalyticsContractImplKt.a(this.k, "tito ride detail back press", Source.TITO_RIDE_DETAIL_SCREEN, this.J, MapsKt.i(new Pair("screen type", ((TitoRideDetailsViewState) stateFlow.getValue()).b.name()), new Pair("ob tutorial seen", Boolean.valueOf(this.K))), 48);
            int i = WhenMappings.f9705a[((TitoRideDetailsViewState) stateFlow.getValue()).b.ordinal()];
            if (i == 1) {
                E0(new wi1(27));
                return;
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                K0();
                return;
            }
        }
        if (intent instanceof TitoRideDetailsIntent.OnMapStopClickIntent) {
            TitoRideDetailsIntent.OnMapStopClickIntent onMapStopClickIntent = (TitoRideDetailsIntent.OnMapStopClickIntent) intent;
            AnalyticsContractImplKt.a(this.k, "tito map stop marker click", Source.TITO_RIDE_DETAIL_SCREEN, this.J, MapsKt.i(new Pair("stop id", onMapStopClickIntent.f9714a), new Pair("route id", onMapStopClickIntent.b)), 48);
            String str4 = onMapStopClickIntent.f9714a;
            String str5 = onMapStopClickIntent.b;
            Job job2 = this.I;
            if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.I) != null) {
                ((JobSupport) job).cancel(null);
            }
            TitoRideDataAppModel titoRideDataAppModel2 = ((TitoRideDetailsViewState) stateFlow.getValue()).f9723a;
            if (titoRideDataAppModel2 == null || (titoRouteData = titoRideDataAppModel2.b) == null || (routeDataA = titoRouteData.a()) == null || (str2 = routeDataA.d) == null) {
                return;
            }
            List<TitoRideDetailsScreenStopMarker> list = ((TitoRideDetailsViewState) stateFlow.getValue()).f;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (TitoRideDetailsScreenStopMarker titoRideDetailsScreenStopMarker : list) {
                arrayList.add(Intrinsics.d(titoRideDetailsScreenStopMarker.b, str4) ? TitoRideDetailsScreenStopMarker.f(titoRideDetailsScreenStopMarker, StopLiveEtaUiModel.EtaFetchInProgress.f4376a, true, 927) : TitoRideDetailsScreenStopMarker.f(titoRideDetailsScreenStopMarker, null, false, 959));
            }
            E0(new qd(20, arrayList));
            this.I = BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$fetchStopLiveEtaForMap$2(this, str4, str5, str2, null), 3);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.TapOutMissedFeedbackSubmitButtonClickIntent) {
            TitoRideDetailsIntent.TapOutMissedFeedbackSubmitButtonClickIntent tapOutMissedFeedbackSubmitButtonClickIntent = (TitoRideDetailsIntent.TapOutMissedFeedbackSubmitButtonClickIntent) intent;
            List list2 = tapOutMissedFeedbackSubmitButtonClickIntent.f9719a;
            if (list2.isEmpty()) {
                return;
            }
            String str6 = tapOutMissedFeedbackSubmitButtonClickIntent.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FeedbackTags) it.next()).b);
            }
            linkedHashMap.put("missed tap out feedback items", arrayList2);
            if (str6.length() > 0) {
                linkedHashMap.put("missed tap out feedback text", str6);
            }
            Source source4 = Source.TITO_RIDE_DETAIL_SCREEN;
            AnalyticsContractImplKt.a(this.k, "missed tito tapout feedback submit", source4, this.J, linkedHashMap, 48);
            AnalyticsContractImplKt.a(this.k, "missed tap out done bottom sheet opened", source4, this.J, null, 56);
            BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$handleTapOutMissedFeedbackSubmitButtonClickIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.TapOutCompleteBottomSheetExitButtonClickIntent) {
            AnalyticsContractImplKt.a(this.k, "missed tap out done bottom sheet exit btn click", Source.TITO_RIDE_DETAIL_SCREEN, this.J, null, 56);
            ChaloNavigationManagerKt.e(this.C, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.TapOutCompleteBottomSheetViewReceiptButtonClickIntent) {
            E0(new wi1(21));
            BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$handleTapOutCompleteBottomSheetViewReceiptButtonClickIntent$2(this, null), 3);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.FetchRouteRetryButtonClickIntent) {
            Source source5 = Source.TITO_RIDE_DETAIL_SCREEN;
            Source source6 = this.J;
            TitoRideDataAppModel titoRideDataAppModel3 = ((TitoRideDetailsViewState) stateFlow.getValue()).f9723a;
            if (titoRideDataAppModel3 != null && (tITOValidationAppModel2 = titoRideDataAppModel3.f9677a) != null && (tapInDetailAppModel2 = tITOValidationAppModel2.f9672a) != null) {
                str3 = tapInDetailAppModel2.f9673a;
            }
            AnalyticsContractImplKt.a(this.k, "tito view retry btn click", source5, source6, vo1.s("tap id", String.valueOf(str3)), 48);
            TitoRideDataAppModel titoRideDataAppModel4 = ((TitoRideDetailsViewState) stateFlow.getValue()).f9723a;
            if (titoRideDataAppModel4 == null || (tITOValidationAppModel = titoRideDataAppModel4.f9677a) == null || (tapInDetailAppModel = tITOValidationAppModel.f9672a) == null || (str = tapInDetailAppModel.f9673a) == null) {
                str = "";
            }
            titoRideDataManager.c(str, true, source5, this.J);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.TitoOnboardingTutorialFinishIntent) {
            AnalyticsContractImplKt.a(this.k, "tito ob tutorial finished", Source.TITO_RIDE_DETAIL_SCREEN, this.J, null, 56);
            E0(new wi1(24));
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.TitoOnboardingGotItButtonClickIntent) {
            AnalyticsContractImplKt.a(this.k, "tito ob got it btn click", Source.TITO_RIDE_DETAIL_SCREEN, this.J, null, 56);
            this.K = true;
            E0(new wi1(25));
            BuildersKt.d(contextScope, null, null, new TitoRideDetailsComponent$handleTitoOnboardingGotItButtonClickIntent$2(this, null), 3);
            return;
        }
        if (intent instanceof TitoRideDetailsIntent.ReplayTutorialButtonClickIntent) {
            AnalyticsContractImplKt.a(this.k, "tito ob replay btn click", Source.TITO_RIDE_DETAIL_SCREEN, this.J, null, 56);
            this.K = true;
            E0(new wi1(23));
        } else {
            if (!(intent instanceof TitoRideDetailsIntent.TitoOnboardingTutorialStartedIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.a(this.k, "tito ob tutorial started", Source.TITO_RIDE_DETAIL_SCREEN, this.J, null, 56);
        }
    }

    public final TitoRideDetailsScreenStopMarker N0(String str, String str2, String str3, LatLng latLng, ChaloMapMarkerType chaloMapMarkerType, boolean z) {
        IconType iconTypeB = this.t.b(chaloMapMarkerType);
        ChaloMapMarkerUIEventHandler.Companion companion = ChaloMapMarkerUIEventHandler.f1869a;
        w31 w31Var = new w31(9, this, str2, str);
        wb wbVar = new wb(8);
        wb wbVar2 = new wb(8);
        companion.getClass();
        return new TitoRideDetailsScreenStopMarker(str, str2, str3, latLng, iconTypeB, StopLiveEtaUiModel.EtaFetchInProgress.f4376a, false, z, ChaloMapMarkerUIEventHandler.Companion.a(w31Var, wbVar, wbVar2), this.B);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (TitoRideDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new TitoRideDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new TitoRideDetailsViewState();
    }
}

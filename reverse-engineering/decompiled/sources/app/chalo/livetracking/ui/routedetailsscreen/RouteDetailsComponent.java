package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.ads.AdTargetingProvider;
import app.chalo.ads.BindNativeAdResult;
import app.chalo.ads.NativeInlineAdSlot;
import app.chalo.ads.NativeInlineAdSlotKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.GetCachedRouteUseCase;
import app.chalo.citydata.domain.RouteTimeTableType;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.CircularProgressIndicatorUIStateFactory;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.ChaloMapPolylinePointDetails;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.MapPolylinePointStateType;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.BonnetNumberToggleConfig;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.GetLiveBusDelayedStateUseCaseKt;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.ReportProblemMetaData;
import app.chalo.livetracking.routedetails.ReportProblemTagDetails;
import app.chalo.livetracking.routedetails.RouteDetailsHelper;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDialogInfo;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.BusMapInfoWindowUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.BusMapInfoWindowViewType;
import app.chalo.livetracking.routedetails.data.model.ui.EstimatedEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.FixedEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopMarkerInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopTagInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopCtaActionType;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.livetracking.routedetails.domain.CheckIfCheckinCanBePerformedUseCase;
import app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData;
import app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromTimeTable;
import app.chalo.livetracking.routedetails.domain.GetLivePassengerDetailsBottomSheetDetailsUseCase;
import app.chalo.livetracking.routedetails.domain.GetNearestStopToCurrentLocationUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsOptionsMenuListUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase;
import app.chalo.livetracking.routedetails.domain.GetRouteTimeTableUiModelUseCase;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetails;
import app.chalo.livetracking.routedetails.domain.RouteDetailsOptionsMenu;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.LiveVehiclesMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapMarker;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapStopMarkerInfo;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.livetracking.utils.RouteMapUtilsKt;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.chalologger.ChaloLog;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.l4;
import defpackage.n31;
import defpackage.n8;
import defpackage.p01;
import defpackage.p31;
import defpackage.q31;
import defpackage.qd;
import defpackage.r31;
import defpackage.s31;
import defpackage.t01;
import defpackage.wt0;
import defpackage.x21;
import defpackage.z21;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsDataState;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewState;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsComponent extends ChaloBaseStateMviComponent<RouteDetailsIntent, RouteDetailsDataState, RouteDetailsViewState, RouteDetailsSideEffect> {
    public final AdTargetingProvider A;
    public final LiveTrackingConfigDataStore B;
    public final IsAgencyTagVisibleUseCase C;
    public final ChaloLocationManager D;
    public final RouteDetailsLocalDataStore E;
    public final IsCityRouteNamesDisabledUseCase F;
    public final TimeUtilsContract G;
    public final RouteMapLiveVehicleIconHelper H;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase I;
    public final CoroutineContextProvider J;
    public final ChaloMapMarkerInfoWindowProvider K;
    public final SystemHelper L;
    public final LatLngBoundsUtils M;
    public final PolylineUtils N;
    public final ChaloNavigationManager O;
    public final LiveTrackingNavigationContract P;
    public final StringProvider Q;
    public final RouteDetailsUIStateFactory R;
    public final TicketPurchaseSceneResolverUseCase S;
    public final AnalyticsContract T;
    public final KotlinToastManager U;
    public final UrlOpenHelper V;
    public final ChaloAppFeatureHelper W;
    public RouteDetailsIntentModel X;
    public RouteAppModel Y;
    public List Z;
    public ArrayList a0;
    public Job b0;
    public Job c0;
    public Job d0;
    public Job e0;
    public int f0;
    public int g0;
    public int h0;
    public String i0;
    public RouteBookingType j0;
    public final CityProvider k;
    public boolean k0;
    public final BasicInfoContract l;
    public Object l0;
    public final GetCachedRouteUseCase m;
    public Map m0;
    public final FetchRouteDataFromRemoteUseCase n;
    public ReportProblemMetaData n0;
    public final GetRouteDetailsOptionsMenuListUseCase o;
    public final boolean o0;
    public final GetNearestStopToCurrentLocationUseCase p;
    public boolean p0;
    public final GetEtaUiModelForStopFromRtsData q;
    public long q0;
    public final GetEtaUiModelForStopFromTimeTable r;
    public boolean r0;
    public final CheckIfCheckinCanBePerformedUseCase s;
    public int s0;
    public final GetRouteDetailsPayForTicketFlowTypeUseCase t;
    public long t0;
    public final LiveTrackingDataManager u;
    public final Lazy u0;
    public final GetDelayedEtaThresholdForLiveTrackingUseCase v;
    public boolean v0;
    public final GetRouteTimeTableUiModelUseCase w;
    public boolean w0;
    public final UserProfileDetailsProvider x;
    public boolean x0;
    public final GetLivePassengerDetailsBottomSheetDetailsUseCase y;
    public long y0;
    public final RouteDetailsAnalyticsHelper z;
    public MapCameraUpdate z0;

    /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1", f = "RouteDetailsComponent.kt", l = {284, 285}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RouteDetailsHelper $routeDetailsHelper;
        int label;
        final /* synthetic */ RouteDetailsComponent this$0;

        /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1$1", f = "RouteDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C01231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<String, RouteAvailabilityBannerDetails> $bannerDetails;
            int label;
            final /* synthetic */ RouteDetailsComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01231(RouteDetailsComponent routeDetailsComponent, Map map, Continuation continuation) {
                super(2, continuation);
                this.this$0 = routeDetailsComponent;
                this.$bannerDetails = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01231(this.this$0, this.$bannerDetails, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01231 c01231 = (C01231) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                c01231.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                RouteDetailsComponent routeDetailsComponent = this.this$0;
                routeDetailsComponent.m0 = this.$bannerDetails;
                routeDetailsComponent.j1();
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RouteDetailsHelper routeDetailsHelper, RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
            super(2, continuation);
            this.$routeDetailsHelper = routeDetailsHelper;
            this.this$0 = routeDetailsComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$routeDetailsHelper, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (kotlinx.coroutines.BuildersKt.g(r1, r3, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r7)
                goto L45
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                kotlin.ResultKt.b(r7)
                goto L2a
            L1c:
                kotlin.ResultKt.b(r7)
                app.chalo.livetracking.routedetails.RouteDetailsHelper r7 = r6.$routeDetailsHelper
                r6.label = r3
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L2a
                goto L44
            L2a:
                java.util.Map r7 = (java.util.Map) r7
                app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r1 = r6.this$0
                app.chalo.providers.CoroutineContextProvider r1 = r1.J
                kotlinx.coroutines.MainCoroutineDispatcher r1 = r1.a()
                app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1$1 r3 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$1$1
                app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r4 = r6.this$0
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.g(r1, r3, r6)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r7 = kotlin.Unit.f17538a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$3", f = "RouteDetailsComponent.kt", l = {314}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RouteDetailsHelper $routeDetailsHelper;
        Object L$0;
        int label;
        final /* synthetic */ RouteDetailsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RouteDetailsHelper routeDetailsHelper, RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = routeDetailsComponent;
            this.$routeDetailsHelper = routeDetailsHelper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.$routeDetailsHelper, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RouteDetailsComponent routeDetailsComponent;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                RouteDetailsComponent routeDetailsComponent2 = this.this$0;
                RouteDetailsHelper routeDetailsHelper = this.$routeDetailsHelper;
                this.L$0 = routeDetailsComponent2;
                this.label = 1;
                Object objA = routeDetailsHelper.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                routeDetailsComponent = routeDetailsComponent2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                routeDetailsComponent = (RouteDetailsComponent) this.L$0;
                ResultKt.b(obj);
            }
            routeDetailsComponent.n0 = (ReportProblemMetaData) obj;
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4821a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StopCtaActionType.values().length];
            try {
                iArr[StopCtaActionType.ViewTimeTable.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopCtaActionType.ViewMoreBuses.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4821a = iArr;
            int[] iArr2 = new int[RouteBookingType.values().length];
            try {
                iArr2[RouteBookingType.PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RouteBookingType.TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RouteBookingType.AIRPORT_ROUTE_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RouteBookingType.PREMIUM_BUS_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[RouteDetailsOptionsMenu.values().length];
            try {
                iArr3[RouteDetailsOptionsMenu.ViewTimeTable.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[RouteDetailsOptionsMenu.AddFavorite.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[RouteDetailsOptionsMenu.RemoveFavorite.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[RouteDetailsOptionsMenu.SearchStop.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[RouteDetailsOptionsMenu.CheckIn.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public RouteDetailsComponent(ComponentContext componentContext, RouteDetailsArgs routeDetailsArgs, CityProvider cityProvider, BasicInfoContract basicInfoContract, GetCachedRouteUseCase getCachedRouteUseCase, FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase, GetRouteDetailsOptionsMenuListUseCase getRouteDetailsOptionsMenuListUseCase, GetNearestStopToCurrentLocationUseCase getNearestStopToCurrentLocationUseCase, GetEtaUiModelForStopFromRtsData getEtaUiModelForStopFromRtsData, GetEtaUiModelForStopFromTimeTable getEtaUiModelForStopFromTimeTable, CheckIfCheckinCanBePerformedUseCase checkIfCheckinCanBePerformedUseCase, GetRouteDetailsPayForTicketFlowTypeUseCase getRouteDetailsPayForTicketFlowTypeUseCase, LiveTrackingDataManager liveTrackingDataManager, GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase, GetRouteTimeTableUiModelUseCase getRouteTimeTableUiModelUseCase, UserProfileDetailsProvider userProfileDetailsProvider, RouteDetailsHelper routeDetailsHelper, GetLivePassengerDetailsBottomSheetDetailsUseCase getLivePassengerDetailsBottomSheetDetailsUseCase, RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper, AdTargetingProvider adTargetingProvider, LiveTrackingConfigDataStore liveTrackingConfigDataStore, IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase, ChaloLocationManager chaloLocationManager, ChaloBuildConfig chaloBuildConfig, RouteDetailsLocalDataStore routeDetailsLocalDataStore, IsCityRouteNamesDisabledUseCase isCityRouteNamesDisabledUseCase, TimeUtilsContract timeUtilsContract, RouteMapLiveVehicleIconHelper routeMapLiveVehicleIconHelper, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, CoroutineContextProvider coroutineContextProvider, ChaloMapMarkerInfoWindowProvider chaloMapMarkerInfoWindowProvider, SystemHelper systemHelper, LatLngBoundsUtils latLngBoundsUtils, PolylineUtils polylineUtils, ChaloNavigationManager chaloNavigationManager, LiveTrackingNavigationContract liveTrackingNavigationContract, StringProvider stringProvider, RouteDetailsUIStateFactory routeDetailsUIStateFactory, TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase, AnalyticsContract analyticsContract, KotlinToastManager kotlinToastManager, UrlOpenHelper urlOpenHelper, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        Object objB;
        super(componentContext);
        this.k = cityProvider;
        this.l = basicInfoContract;
        this.m = getCachedRouteUseCase;
        this.n = fetchRouteDataFromRemoteUseCase;
        this.o = getRouteDetailsOptionsMenuListUseCase;
        this.p = getNearestStopToCurrentLocationUseCase;
        this.q = getEtaUiModelForStopFromRtsData;
        this.r = getEtaUiModelForStopFromTimeTable;
        this.s = checkIfCheckinCanBePerformedUseCase;
        this.t = getRouteDetailsPayForTicketFlowTypeUseCase;
        this.u = liveTrackingDataManager;
        this.v = getDelayedEtaThresholdForLiveTrackingUseCase;
        this.w = getRouteTimeTableUiModelUseCase;
        this.x = userProfileDetailsProvider;
        this.y = getLivePassengerDetailsBottomSheetDetailsUseCase;
        this.z = routeDetailsAnalyticsHelper;
        this.A = adTargetingProvider;
        this.B = liveTrackingConfigDataStore;
        this.C = isAgencyTagVisibleUseCase;
        this.D = chaloLocationManager;
        this.E = routeDetailsLocalDataStore;
        this.F = isCityRouteNamesDisabledUseCase;
        this.G = timeUtilsContract;
        this.H = routeMapLiveVehicleIconHelper;
        this.I = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.J = coroutineContextProvider;
        this.K = chaloMapMarkerInfoWindowProvider;
        this.L = systemHelper;
        this.M = latLngBoundsUtils;
        this.N = polylineUtils;
        this.O = chaloNavigationManager;
        this.P = liveTrackingNavigationContract;
        this.Q = stringProvider;
        this.R = routeDetailsUIStateFactory;
        this.S = ticketPurchaseSceneResolverUseCase;
        this.T = analyticsContract;
        this.U = kotlinToastManager;
        this.V = urlOpenHelper;
        this.W = chaloAppFeatureHelper;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.l0 = MapsKt.d();
        this.m0 = MapsKt.d();
        this.o0 = chaloBuildConfig.getG();
        this.s0 = -1;
        this.u0 = LazyKt.b(new n31(this, 3));
        BuildersKt.d(this.j, coroutineContextProvider.b(), null, new AnonymousClass1(routeDetailsHelper, this, null), 2);
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = routeDetailsArgs.b;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, RouteDetailsIntentModel.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        RouteDetailsIntentModel routeDetailsIntentModel = (RouteDetailsIntentModel) objB;
        if (routeDetailsIntentModel == null) {
            q0(new n31(this, 4));
        } else {
            BuildersKt.d(this.j, null, null, new AnonymousClass3(routeDetailsHelper, this, null), 3);
            f1(new RouteDetailsIntent.InitialIntent(routeDetailsIntentModel));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(RouteDetailsComponent routeDetailsComponent, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$checkAndWaitTillTripStartTime$1 routeDetailsComponent$checkAndWaitTillTripStartTime$1;
        long j;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Long l;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$checkAndWaitTillTripStartTime$1) {
            routeDetailsComponent$checkAndWaitTillTripStartTime$1 = (RouteDetailsComponent$checkAndWaitTillTripStartTime$1) continuationImpl;
            int i = routeDetailsComponent$checkAndWaitTillTripStartTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$checkAndWaitTillTripStartTime$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$checkAndWaitTillTripStartTime$1 = new RouteDetailsComponent$checkAndWaitTillTripStartTime$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$checkAndWaitTillTripStartTime$1 = new RouteDetailsComponent$checkAndWaitTillTripStartTime$1(routeDetailsComponent, continuationImpl);
        }
        Object objC = routeDetailsComponent$checkAndWaitTillTripStartTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$checkAndWaitTillTripStartTime$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            RouteDetailsIntentModel routeDetailsIntentModel = routeDetailsComponent.X;
            long jLongValue = (routeDetailsIntentModel == null || (trackingAdditionalFeatures = routeDetailsIntentModel.h) == null || (l = trackingAdditionalFeatures.d) == null) ? 0L : l.longValue();
            BasicInfoContract basicInfoContract = routeDetailsComponent.l;
            routeDetailsComponent$checkAndWaitTillTripStartTime$1.J$0 = jLongValue;
            routeDetailsComponent$checkAndWaitTillTripStartTime$1.label = 1;
            objC = basicInfoContract.c(routeDetailsComponent$checkAndWaitTillTripStartTime$1);
            if (objC != coroutineSingletons) {
                j = jLongValue;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        j = routeDetailsComponent$checkAndWaitTillTripStartTime$1.J$0;
        ResultKt.b(objC);
        long jLongValue2 = ((Number) objC).longValue();
        if (j > jLongValue2) {
            routeDetailsComponent$checkAndWaitTillTripStartTime$1.label = 2;
            if (DelayKt.b(j - jLongValue2, routeDetailsComponent$checkAndWaitTillTripStartTime$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(RouteDetailsComponent routeDetailsComponent, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1 routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1;
        long j;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Long l;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1) {
            routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1 = (RouteDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1) continuationImpl;
            int i = routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1 = new RouteDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1 = new RouteDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1(routeDetailsComponent, continuationImpl);
        }
        Object objC = routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            RouteDetailsIntentModel routeDetailsIntentModel = routeDetailsComponent.X;
            long jLongValue = (routeDetailsIntentModel == null || (trackingAdditionalFeatures = routeDetailsIntentModel.h) == null || (l = trackingAdditionalFeatures.d) == null) ? 0L : l.longValue();
            BasicInfoContract basicInfoContract = routeDetailsComponent.l;
            routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.J$0 = jLongValue;
            routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.label = 1;
            objC = basicInfoContract.c(routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1);
            if (objC != obj) {
                j = jLongValue;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        j = routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.J$0;
        ResultKt.b(objC);
        long jLongValue2 = j - ((Number) objC).longValue();
        if (jLongValue2 > 0) {
            Long l2 = new Long(20000L);
            Long l3 = new Long(jLongValue2);
            routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1.label = 2;
            if (routeDetailsComponent.X0(l2, l3, routeDetailsComponent$fetchLiveGpsLocationTillTripStartTime$1) == obj) {
                return obj;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object H0(RouteDetailsComponent routeDetailsComponent, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$getRouteDetails$1 routeDetailsComponent$getRouteDetails$1;
        String str;
        String str2;
        CoroutineContextProvider coroutineContextProvider = routeDetailsComponent.J;
        ContextScope contextScope = routeDetailsComponent.j;
        if (continuationImpl instanceof RouteDetailsComponent$getRouteDetails$1) {
            routeDetailsComponent$getRouteDetails$1 = (RouteDetailsComponent$getRouteDetails$1) continuationImpl;
            int i = routeDetailsComponent$getRouteDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$getRouteDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$getRouteDetails$1 = new RouteDetailsComponent$getRouteDetails$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$getRouteDetails$1 = new RouteDetailsComponent$getRouteDetails$1(routeDetailsComponent, continuationImpl);
        }
        Object obj = routeDetailsComponent$getRouteDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$getRouteDetails$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            RouteDetailsIntentModel routeDetailsIntentModel = routeDetailsComponent.X;
            if (routeDetailsIntentModel == null || (str = routeDetailsIntentModel.f4405a) == null) {
                gf.u(null, routeDetailsComponent.O);
                return unit;
            }
            routeDetailsComponent.E0(new x21(26));
            GetCachedRouteUseCase getCachedRouteUseCase = routeDetailsComponent.m;
            RouteTimeTableType routeTimeTableType = RouteTimeTableType.CURRENT_DAY;
            routeDetailsComponent$getRouteDetails$1.L$0 = str;
            routeDetailsComponent$getRouteDetails$1.label = 1;
            Object objA = getCachedRouteUseCase.a(str, routeTimeTableType, routeDetailsComponent$getRouteDetails$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) routeDetailsComponent$getRouteDetails$1.L$0;
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        String message = "getSavedRouteUseCase: " + chaloUseCaseResult;
        Intrinsics.i(message, "message");
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            routeDetailsComponent.Y = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$getRouteDetails$3(routeDetailsComponent, null), 2);
        } else if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$getRouteDetails$4(routeDetailsComponent, str2, null), 2);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(RouteDetailsComponent routeDetailsComponent, LatLng latLng, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$getUserDistanceInKmFromStop$1 routeDetailsComponent$getUserDistanceInKmFromStop$1;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$getUserDistanceInKmFromStop$1) {
            routeDetailsComponent$getUserDistanceInKmFromStop$1 = (RouteDetailsComponent$getUserDistanceInKmFromStop$1) continuationImpl;
            int i = routeDetailsComponent$getUserDistanceInKmFromStop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$getUserDistanceInKmFromStop$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$getUserDistanceInKmFromStop$1 = new RouteDetailsComponent$getUserDistanceInKmFromStop$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$getUserDistanceInKmFromStop$1 = new RouteDetailsComponent$getUserDistanceInKmFromStop$1(routeDetailsComponent, continuationImpl);
        }
        Object objA = routeDetailsComponent$getUserDistanceInKmFromStop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$getUserDistanceInKmFromStop$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloLocationManager chaloLocationManager = routeDetailsComponent.D;
            routeDetailsComponent$getUserDistanceInKmFromStop$1.L$0 = latLng;
            routeDetailsComponent$getUserDistanceInKmFromStop$1.label = 1;
            objA = chaloLocationManager.a(routeDetailsComponent$getUserDistanceInKmFromStop$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) routeDetailsComponent$getUserDistanceInKmFromStop$1.L$0;
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        if (latLngA != null) {
            return new Double(latLngA.a(latLng) / ((double) 1000));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:244:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4 A[LOOP:10: B:60:0x01b9->B:66:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0444 -> B:157:0x044c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0249 -> B:90:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x025e -> B:92:0x0262). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object J0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r40, java.util.List r41, kotlin.coroutines.jvm.internal.ContinuationImpl r42) {
        /*
            Method dump skipped, instruction units count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.J0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r13 == r0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r11, java.util.ArrayList r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$processNewEtasForMap$1
            if (r0 == 0) goto L17
            r0 = r13
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$processNewEtasForMap$1 r0 = (app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$processNewEtasForMap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r7 = r0
            goto L1d
        L17:
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$processNewEtasForMap$1 r0 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$processNewEtasForMap$1
            r0.<init>(r11, r13)
            goto L15
        L1d:
            java.lang.Object r13 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r8 = 2
            kotlin.Unit r9 = kotlin.Unit.f17538a
            r10 = 1
            if (r1 == 0) goto L3d
            if (r1 == r10) goto L39
            if (r1 != r8) goto L31
            kotlin.ResultKt.b(r13)
            goto L9c
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.ResultKt.b(r13)
            goto L6c
        L3d:
            kotlin.ResultKt.b(r13)
            app.chalo.citydata.data.model.app.RouteAppModel r13 = r11.Y
            if (r13 != 0) goto L45
            goto L73
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "new stop etas for map: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData r1 = r11.q
            boolean r2 = r13.q
            int r3 = r11.h0
            java.util.List r4 = r13.e
            java.lang.Object r6 = r11.l0
            r7.label = r10
            r5 = r12
            java.lang.Object r13 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L6c
            goto L9b
        L6c:
            app.chalo.utils.ChaloUseCaseResult r13 = (app.chalo.utils.ChaloUseCaseResult) r13
            int r12 = r11.g0
            r1 = -1
            if (r12 != r1) goto L74
        L73:
            return r9
        L74:
            boolean r1 = r13 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L85
            yg r12 = new yg
            app.chalo.utils.ChaloUseCaseResult$Success r13 = (app.chalo.utils.ChaloUseCaseResult.Success) r13
            r0 = 19
            r12.<init>(r13, r0)
            r11.E0(r12)
            return r9
        L85:
            boolean r1 = r13 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto La9
            app.chalo.utils.ChaloUseCaseResult$Failure r13 = (app.chalo.utils.ChaloUseCaseResult.Failure) r13
            java.lang.Object r13 = r13.f10418a
            app.chalo.livetracking.routedetails.domain.EtaAvailabilityError r1 = app.chalo.livetracking.routedetails.domain.EtaAvailabilityError.ALL_BUS_PASSED
            if (r13 != r1) goto L92
            goto L93
        L92:
            r10 = 0
        L93:
            r7.label = r8
            java.lang.Object r13 = r11.a1(r10, r12, r7)
            if (r13 != r0) goto L9c
        L9b:
            return r0
        L9c:
            app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel r13 = (app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel) r13
            z21 r12 = new z21
            r0 = 8
            r12.<init>(r13, r0)
            r11.E0(r12)
            return r9
        La9:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.K0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r12, java.util.ArrayList r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.L0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void M0(RouteDetailsComponent routeDetailsComponent, boolean z, boolean z2, boolean z3) {
        RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsComponent.z, "Live route details fetched", MapsKt.i(new Pair("isSuccessful", Boolean.valueOf(z)), new Pair("isChaloBusRoute", Boolean.valueOf(z2)), new Pair("isAirportRoute", Boolean.valueOf(z3))), 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object N0(RouteDetailsComponent routeDetailsComponent, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$shouldFireNativeAdLoadFailedEvent$1 routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$shouldFireNativeAdLoadFailedEvent$1) {
            routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1 = (RouteDetailsComponent$shouldFireNativeAdLoadFailedEvent$1) continuationImpl;
            int i = routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1 = new RouteDetailsComponent$shouldFireNativeAdLoadFailedEvent$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1 = new RouteDetailsComponent$shouldFireNativeAdLoadFailedEvent$1(routeDetailsComponent, continuationImpl);
        }
        Object objC = routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            BasicInfoContract basicInfoContract = routeDetailsComponent.l;
            routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1.label = 1;
            objC = basicInfoContract.c(routeDetailsComponent$shouldFireNativeAdLoadFailedEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((Number) objC).longValue() - routeDetailsComponent.y0 > 120000);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object O0(RouteDetailsComponent routeDetailsComponent, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$showRouteScreen$1 routeDetailsComponent$showRouteScreen$1;
        RouteDetailsIntentModel routeDetailsIntentModel;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$showRouteScreen$1) {
            routeDetailsComponent$showRouteScreen$1 = (RouteDetailsComponent$showRouteScreen$1) continuationImpl;
            int i = routeDetailsComponent$showRouteScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$showRouteScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$showRouteScreen$1 = new RouteDetailsComponent$showRouteScreen$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$showRouteScreen$1 = new RouteDetailsComponent$showRouteScreen$1(routeDetailsComponent, continuationImpl);
        }
        Object obj = routeDetailsComponent$showRouteScreen$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$showRouteScreen$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            RouteDetailsIntentModel routeDetailsIntentModel2 = routeDetailsComponent.X;
            if (routeDetailsIntentModel2 != null) {
                routeDetailsComponent$showRouteScreen$1.L$0 = routeDetailsIntentModel2;
                routeDetailsComponent$showRouteScreen$1.label = 1;
                if (routeDetailsComponent.m1(routeDetailsComponent$showRouteScreen$1) == obj2) {
                    return obj2;
                }
                routeDetailsIntentModel = routeDetailsIntentModel2;
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        routeDetailsIntentModel = (RouteDetailsIntentModel) routeDetailsComponent$showRouteScreen$1.L$0;
        ResultKt.b(obj);
        routeDetailsComponent.k1();
        if (routeDetailsComponent.h0 != -1) {
            BuildersKt.d(routeDetailsComponent.j, null, null, new RouteDetailsComponent$selectInitialStopAndFetchEta$1(routeDetailsComponent, null), 3);
        }
        if (routeDetailsIntentModel.h.h) {
            String str = routeDetailsIntentModel.b;
            if (str == null) {
                str = "";
            }
            int iB1 = routeDetailsComponent.b1(str);
            if (iB1 != -1) {
                routeDetailsComponent.d1(iB1);
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object P0(RouteDetailsComponent routeDetailsComponent, List list, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1 routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1;
        RouteDetailsIntentModel routeDetailsIntentModel;
        RouteAppModel routeAppModel;
        List list2;
        int i;
        routeDetailsComponent.getClass();
        if (continuationImpl instanceof RouteDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1) {
            routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1 = (RouteDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1) continuationImpl;
            int i2 = routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.label = i2 - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1 = new RouteDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1 = new RouteDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1(routeDetailsComponent, continuationImpl);
        }
        Object obj = routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(obj);
            RouteAppModel routeAppModel2 = routeDetailsComponent.Y;
            if (routeAppModel2 != null && (routeDetailsIntentModel = routeDetailsComponent.X) != null) {
                Iterator it = routeAppModel2.e.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (Intrinsics.d(((StopAppModel) it.next()).f1727a, routeDetailsIntentModel.b)) {
                        break;
                    }
                    i4++;
                }
                ChaloLocationManager chaloLocationManager = routeDetailsComponent.D;
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.L$0 = list;
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.L$1 = routeAppModel2;
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.I$0 = i4;
                routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.label = 1;
                Object objA = chaloLocationManager.a(routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                routeAppModel = routeAppModel2;
                obj = objA;
                list2 = list;
                i = i4;
            }
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.I$0;
        routeAppModel = (RouteAppModel) routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.L$1;
        list2 = (List) routeDetailsComponent$updateMapLatLngBoundsBasedOnVehicleLocation$1.L$0;
        ResultKt.b(obj);
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        if (i != -1) {
            routeDetailsComponent.w0 = true;
            LatLng latLng = ((StopAppModel) routeAppModel.e.get(i)).c;
            ArrayList arrayList = new ArrayList();
            arrayList.add(latLng);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add((LatLng) it2.next());
            }
            if (latLngA != null && CityProviderKt.a(routeDetailsComponent.k, latLngA)) {
                arrayList.add(latLngA);
            }
            routeDetailsComponent.E0(new q31(routeDetailsComponent.M.a(arrayList), 0));
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object Q0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r26, java.util.List r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.Q0(app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void R0(Job job) {
        if (job.isActive()) {
            job.cancel(null);
        }
    }

    public static void h1(RouteDetailsComponent routeDetailsComponent, String str, String str2, int i, int i2, LatLng latLng, int i3) {
        String str3 = (i3 & 2) != 0 ? null : str2;
        LatLng latLng2 = (i3 & 16) != 0 ? null : latLng;
        RouteAppModel routeAppModel = routeDetailsComponent.Y;
        if (routeAppModel == null) {
            return;
        }
        BuildersKt.d(routeDetailsComponent.j, null, null, new RouteDetailsComponent$raiseStopSelectionEvent$1(i, routeAppModel, i2, latLng2, routeDetailsComponent, str, str3, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S0(ContinuationImpl continuationImpl) {
        RouteDetailsComponent$checkAndSetNearestStopIndex$1 routeDetailsComponent$checkAndSetNearestStopIndex$1;
        List list;
        if (continuationImpl instanceof RouteDetailsComponent$checkAndSetNearestStopIndex$1) {
            routeDetailsComponent$checkAndSetNearestStopIndex$1 = (RouteDetailsComponent$checkAndSetNearestStopIndex$1) continuationImpl;
            int i = routeDetailsComponent$checkAndSetNearestStopIndex$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$checkAndSetNearestStopIndex$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$checkAndSetNearestStopIndex$1 = new RouteDetailsComponent$checkAndSetNearestStopIndex$1(this, continuationImpl);
            }
        } else {
            routeDetailsComponent$checkAndSetNearestStopIndex$1 = new RouteDetailsComponent$checkAndSetNearestStopIndex$1(this, continuationImpl);
        }
        Object objA = routeDetailsComponent$checkAndSetNearestStopIndex$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$checkAndSetNearestStopIndex$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            RouteDetailsIntentModel routeDetailsIntentModel = this.X;
            if (routeDetailsIntentModel != null) {
                Boolean bool = routeDetailsIntentModel.f;
                if (bool != null ? bool.booleanValue() : true) {
                    RouteAppModel routeAppModel = this.Y;
                    if (routeAppModel == null || (list = routeAppModel.e) == null) {
                        list = EmptyList.f17557a;
                    }
                    routeDetailsComponent$checkAndSetNearestStopIndex$1.label = 1;
                    objA = this.p.a(list, routeDetailsComponent$checkAndSetNearestStopIndex$1);
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
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            this.s0 = b1(((StopAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f1727a);
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        return unit;
    }

    public final void T0(ArrayList arrayList) {
        List list;
        RouteDetailsIntentModel routeDetailsIntentModel = this.X;
        if (routeDetailsIntentModel == null) {
            return;
        }
        boolean z = this.w0;
        CoroutineContextProvider coroutineContextProvider = this.J;
        ContextScope contextScope = this.j;
        if (!z && RouteDetailsIntentModelKt.a(routeDetailsIntentModel)) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$1(this, arrayList, null), 2);
            return;
        }
        if (RouteDetailsIntentModelKt.a(routeDetailsIntentModel)) {
            return;
        }
        TrackingAdditionalFeatures trackingAdditionalFeatures = routeDetailsIntentModel.h;
        if (!trackingAdditionalFeatures.m || (list = trackingAdditionalFeatures.f) == null || list.isEmpty() || this.x0 || arrayList.isEmpty()) {
            return;
        }
        BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2(this, arrayList, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:59:0x019c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final Object p0(RouteDetailsDataState routeDetailsDataState, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$convertToUiState$1 routeDetailsComponent$convertToUiState$1;
        RouteDetailsDataState routeDetailsDataState2;
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState;
        RouteDetailsDataState routeDetailsDataState3;
        LoadingDialogUIState loadingDialogUIStateA;
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState2;
        CircularProgressIndicatorUIState circularProgressIndicatorUIStateA;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState;
        RouteDetailsDataState routeDetailsDataState4;
        RouteDetailsViewTypeUIState routeDetailsViewTypeUIState;
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo;
        RouteAvailabilityDialogUIState routeAvailabilityDialogUIState;
        ReportProblemMetaData reportProblemMetaData;
        LoadingDialogUIState loadingDialogUIState;
        RouteDetailsViewTypeUIState routeDetailsViewTypeUIState2;
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState3;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState2;
        ReportProblemDialogUIState reportProblemDialogUIState;
        Object objI1;
        LoadingDialogUIState loadingDialogUIState2;
        RouteDetailsViewTypeUIState routeDetailsViewTypeUIState3;
        RouteAvailabilityDialogUIState routeAvailabilityDialogUIState2;
        LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState4;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState3;
        String str;
        ImageUrlUIState imageUrlUIState;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        String str4;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        RouteDetailsComponent routeDetailsComponent = this;
        if (continuationImpl instanceof RouteDetailsComponent$convertToUiState$1) {
            routeDetailsComponent$convertToUiState$1 = (RouteDetailsComponent$convertToUiState$1) continuationImpl;
            int i = routeDetailsComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$convertToUiState$1 = new RouteDetailsComponent$convertToUiState$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$convertToUiState$1 = new RouteDetailsComponent$convertToUiState$1(routeDetailsComponent, continuationImpl);
        }
        RouteDetailsComponent$convertToUiState$1 routeDetailsComponent$convertToUiState$2 = routeDetailsComponent$convertToUiState$1;
        Object objA = routeDetailsComponent$convertToUiState$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$convertToUiState$2.label;
        RouteDetailsUIStateFactory routeDetailsUIStateFactory = routeDetailsComponent.R;
        if (i2 == 0) {
            ResultKt.b(objA);
            LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails = routeDetailsDataState.q;
            if (livePassengerIndicatorBottomSheetDetails != null) {
                RouteDetailsComponent$convertToUiState$2$1 routeDetailsComponent$convertToUiState$2$1 = new RouteDetailsComponent$convertToUiState$2$1(1, routeDetailsComponent, RouteDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;)V", 0);
                routeDetailsComponent$convertToUiState$2.L$0 = routeDetailsDataState;
                routeDetailsComponent$convertToUiState$2.label = 1;
                objA = routeDetailsUIStateFactory.c.a(livePassengerIndicatorBottomSheetDetails, routeDetailsComponent$convertToUiState$2$1, routeDetailsComponent$convertToUiState$2);
                if (objA != coroutineSingletons) {
                    routeDetailsDataState2 = routeDetailsDataState;
                }
            } else {
                routeDetailsDataState2 = routeDetailsDataState;
                livePassengerIndicatorBottomSheetContentUIState = null;
                routeDetailsDataState2.getClass();
                routeDetailsDataState3 = routeDetailsDataState2;
                loadingDialogUIStateA = null;
                livePassengerIndicatorBottomSheetContentUIState2 = livePassengerIndicatorBottomSheetContentUIState;
                if (routeDetailsDataState3.f4834a) {
                    circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                } else {
                    circularProgressIndicatorUIStateA = null;
                }
                circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                routeDetailsComponent = this;
                RouteDetailsComponent$convertToUiState$3 routeDetailsComponent$convertToUiState$3 = new RouteDetailsComponent$convertToUiState$3(1, routeDetailsComponent, RouteDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;)V", 0);
                routeDetailsComponent$convertToUiState$2.L$0 = routeDetailsDataState3;
                routeDetailsComponent$convertToUiState$2.L$1 = livePassengerIndicatorBottomSheetContentUIState2;
                routeDetailsComponent$convertToUiState$2.L$2 = loadingDialogUIStateA;
                routeDetailsComponent$convertToUiState$2.L$3 = circularProgressIndicatorUIState;
                routeDetailsComponent$convertToUiState$2.label = 3;
                objA = routeDetailsUIStateFactory.e(routeDetailsDataState3, routeDetailsComponent$convertToUiState$3, routeDetailsComponent$convertToUiState$2);
                if (objA != coroutineSingletons) {
                    routeDetailsDataState4 = routeDetailsDataState3;
                    routeDetailsViewTypeUIState = (RouteDetailsViewTypeUIState) objA;
                    routeAvailabilityBannerDialogInfo = routeDetailsDataState4.s;
                    if (routeAvailabilityBannerDialogInfo != null) {
                        str = routeAvailabilityBannerDialogInfo.e;
                        if (str != null) {
                            imageUrlUIState = new ImageUrlUIState(str, new ImageUISize(ChaloThemeHelper.a().l), null, null, 118);
                        } else {
                            imageUrlUIState = null;
                        }
                        str2 = routeAvailabilityBannerDialogInfo.f4392a;
                        if (str2 != null) {
                            chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                        } else {
                            chaloTextUIState = null;
                        }
                        str3 = routeAvailabilityBannerDialogInfo.b;
                        if (str3 != null) {
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                        } else {
                            chaloTextUIState2 = null;
                        }
                        str4 = routeAvailabilityBannerDialogInfo.c;
                        if (str4 != null) {
                            chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new n31(routeDetailsComponent, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                        } else {
                            chaloTextUIState3 = null;
                        }
                        routeAvailabilityDialogUIState = new RouteAvailabilityDialogUIState(imageUrlUIState, chaloTextUIState, chaloTextUIState2, chaloTextUIState3);
                    } else {
                        routeAvailabilityDialogUIState = null;
                    }
                    reportProblemMetaData = routeDetailsDataState4.t;
                    if (reportProblemMetaData != null) {
                        boolean z = routeDetailsDataState4.H;
                        List list = routeDetailsDataState4.I;
                        boolean z2 = routeDetailsDataState4.J;
                        String str5 = routeDetailsDataState4.K;
                        routeDetailsComponent$convertToUiState$2.L$0 = livePassengerIndicatorBottomSheetContentUIState2;
                        routeDetailsComponent$convertToUiState$2.L$1 = loadingDialogUIStateA;
                        routeDetailsComponent$convertToUiState$2.L$2 = circularProgressIndicatorUIState;
                        routeDetailsComponent$convertToUiState$2.L$3 = routeDetailsViewTypeUIState;
                        routeDetailsComponent$convertToUiState$2.L$4 = routeAvailabilityDialogUIState;
                        routeDetailsComponent$convertToUiState$2.label = 4;
                        objI1 = i1(reportProblemMetaData, z, list, z2, str5, routeDetailsComponent$convertToUiState$2);
                        if (objI1 != coroutineSingletons) {
                            objA = objI1;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            routeDetailsViewTypeUIState3 = routeDetailsViewTypeUIState;
                            routeAvailabilityDialogUIState2 = routeAvailabilityDialogUIState;
                            livePassengerIndicatorBottomSheetContentUIState4 = livePassengerIndicatorBottomSheetContentUIState2;
                            circularProgressIndicatorUIState3 = circularProgressIndicatorUIState;
                            routeAvailabilityDialogUIState = routeAvailabilityDialogUIState2;
                            routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState3;
                            circularProgressIndicatorUIState2 = circularProgressIndicatorUIState3;
                            loadingDialogUIState = loadingDialogUIState2;
                            livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState4;
                            reportProblemDialogUIState = (ReportProblemDialogUIState) objA;
                        }
                    } else {
                        loadingDialogUIState = loadingDialogUIStateA;
                        routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState;
                        livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState2;
                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIState;
                        reportProblemDialogUIState = null;
                    }
                    return new RouteDetailsViewState(livePassengerIndicatorBottomSheetContentUIState3, loadingDialogUIState, circularProgressIndicatorUIState2, routeDetailsViewTypeUIState2, routeAvailabilityDialogUIState, reportProblemDialogUIState);
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            routeDetailsDataState2 = (RouteDetailsDataState) routeDetailsComponent$convertToUiState$2.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                DialogUIStateFactory dialogUIStateFactory = (DialogUIStateFactory) routeDetailsComponent$convertToUiState$2.L$2;
                livePassengerIndicatorBottomSheetContentUIState = (LivePassengerIndicatorBottomSheetContentUIState) routeDetailsComponent$convertToUiState$2.L$1;
                RouteDetailsDataState routeDetailsDataState5 = (RouteDetailsDataState) routeDetailsComponent$convertToUiState$2.L$0;
                ResultKt.b(objA);
                dialogUIStateFactory.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objA);
                routeDetailsDataState3 = routeDetailsDataState5;
                livePassengerIndicatorBottomSheetContentUIState2 = livePassengerIndicatorBottomSheetContentUIState;
                if (routeDetailsDataState3.f4834a) {
                    circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
                } else {
                    circularProgressIndicatorUIStateA = null;
                }
                circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                routeDetailsComponent = this;
                RouteDetailsComponent$convertToUiState$3 routeDetailsComponent$convertToUiState$4 = new RouteDetailsComponent$convertToUiState$3(1, routeDetailsComponent, RouteDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;)V", 0);
                routeDetailsComponent$convertToUiState$2.L$0 = routeDetailsDataState3;
                routeDetailsComponent$convertToUiState$2.L$1 = livePassengerIndicatorBottomSheetContentUIState2;
                routeDetailsComponent$convertToUiState$2.L$2 = loadingDialogUIStateA;
                routeDetailsComponent$convertToUiState$2.L$3 = circularProgressIndicatorUIState;
                routeDetailsComponent$convertToUiState$2.label = 3;
                objA = routeDetailsUIStateFactory.e(routeDetailsDataState3, routeDetailsComponent$convertToUiState$4, routeDetailsComponent$convertToUiState$2);
                if (objA != coroutineSingletons) {
                    routeDetailsDataState4 = routeDetailsDataState3;
                    routeDetailsViewTypeUIState = (RouteDetailsViewTypeUIState) objA;
                    routeAvailabilityBannerDialogInfo = routeDetailsDataState4.s;
                    if (routeAvailabilityBannerDialogInfo != null) {
                        str = routeAvailabilityBannerDialogInfo.e;
                        if (str != null) {
                            imageUrlUIState = new ImageUrlUIState(str, new ImageUISize(ChaloThemeHelper.a().l), null, null, 118);
                        } else {
                            imageUrlUIState = null;
                        }
                        str2 = routeAvailabilityBannerDialogInfo.f4392a;
                        if (str2 != null) {
                            chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                        } else {
                            chaloTextUIState = null;
                        }
                        str3 = routeAvailabilityBannerDialogInfo.b;
                        if (str3 != null) {
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                        } else {
                            chaloTextUIState2 = null;
                        }
                        str4 = routeAvailabilityBannerDialogInfo.c;
                        if (str4 != null) {
                            chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new n31(routeDetailsComponent, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                        } else {
                            chaloTextUIState3 = null;
                        }
                        routeAvailabilityDialogUIState = new RouteAvailabilityDialogUIState(imageUrlUIState, chaloTextUIState, chaloTextUIState2, chaloTextUIState3);
                    } else {
                        routeAvailabilityDialogUIState = null;
                    }
                    reportProblemMetaData = routeDetailsDataState4.t;
                    if (reportProblemMetaData != null) {
                        boolean z3 = routeDetailsDataState4.H;
                        List list2 = routeDetailsDataState4.I;
                        boolean z4 = routeDetailsDataState4.J;
                        String str6 = routeDetailsDataState4.K;
                        routeDetailsComponent$convertToUiState$2.L$0 = livePassengerIndicatorBottomSheetContentUIState2;
                        routeDetailsComponent$convertToUiState$2.L$1 = loadingDialogUIStateA;
                        routeDetailsComponent$convertToUiState$2.L$2 = circularProgressIndicatorUIState;
                        routeDetailsComponent$convertToUiState$2.L$3 = routeDetailsViewTypeUIState;
                        routeDetailsComponent$convertToUiState$2.L$4 = routeAvailabilityDialogUIState;
                        routeDetailsComponent$convertToUiState$2.label = 4;
                        objI1 = i1(reportProblemMetaData, z3, list2, z4, str6, routeDetailsComponent$convertToUiState$2);
                        if (objI1 != coroutineSingletons) {
                            objA = objI1;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            routeDetailsViewTypeUIState3 = routeDetailsViewTypeUIState;
                            routeAvailabilityDialogUIState2 = routeAvailabilityDialogUIState;
                            livePassengerIndicatorBottomSheetContentUIState4 = livePassengerIndicatorBottomSheetContentUIState2;
                            circularProgressIndicatorUIState3 = circularProgressIndicatorUIState;
                        }
                    } else {
                        loadingDialogUIState = loadingDialogUIStateA;
                        routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState;
                        livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState2;
                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIState;
                        reportProblemDialogUIState = null;
                    }
                    return new RouteDetailsViewState(livePassengerIndicatorBottomSheetContentUIState3, loadingDialogUIState, circularProgressIndicatorUIState2, routeDetailsViewTypeUIState2, routeAvailabilityDialogUIState, reportProblemDialogUIState);
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                CircularProgressIndicatorUIState circularProgressIndicatorUIState4 = (CircularProgressIndicatorUIState) routeDetailsComponent$convertToUiState$2.L$3;
                LoadingDialogUIState loadingDialogUIState3 = (LoadingDialogUIState) routeDetailsComponent$convertToUiState$2.L$2;
                LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState5 = (LivePassengerIndicatorBottomSheetContentUIState) routeDetailsComponent$convertToUiState$2.L$1;
                routeDetailsDataState4 = (RouteDetailsDataState) routeDetailsComponent$convertToUiState$2.L$0;
                ResultKt.b(objA);
                circularProgressIndicatorUIState = circularProgressIndicatorUIState4;
                loadingDialogUIStateA = loadingDialogUIState3;
                livePassengerIndicatorBottomSheetContentUIState2 = livePassengerIndicatorBottomSheetContentUIState5;
                routeDetailsViewTypeUIState = (RouteDetailsViewTypeUIState) objA;
                routeAvailabilityBannerDialogInfo = routeDetailsDataState4.s;
                if (routeAvailabilityBannerDialogInfo != null) {
                    str = routeAvailabilityBannerDialogInfo.e;
                    if (str != null) {
                        imageUrlUIState = new ImageUrlUIState(str, new ImageUISize(ChaloThemeHelper.a().l), null, null, 118);
                    } else {
                        imageUrlUIState = null;
                    }
                    str2 = routeAvailabilityBannerDialogInfo.f4392a;
                    if (str2 != null) {
                        chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    } else {
                        chaloTextUIState = null;
                    }
                    str3 = routeAvailabilityBannerDialogInfo.b;
                    if (str3 != null) {
                        chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    } else {
                        chaloTextUIState2 = null;
                    }
                    str4 = routeAvailabilityBannerDialogInfo.c;
                    if (str4 != null) {
                        chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new n31(routeDetailsComponent, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                    } else {
                        chaloTextUIState3 = null;
                    }
                    routeAvailabilityDialogUIState = new RouteAvailabilityDialogUIState(imageUrlUIState, chaloTextUIState, chaloTextUIState2, chaloTextUIState3);
                } else {
                    routeAvailabilityDialogUIState = null;
                }
                reportProblemMetaData = routeDetailsDataState4.t;
                if (reportProblemMetaData != null) {
                    boolean z5 = routeDetailsDataState4.H;
                    List list3 = routeDetailsDataState4.I;
                    boolean z6 = routeDetailsDataState4.J;
                    String str7 = routeDetailsDataState4.K;
                    routeDetailsComponent$convertToUiState$2.L$0 = livePassengerIndicatorBottomSheetContentUIState2;
                    routeDetailsComponent$convertToUiState$2.L$1 = loadingDialogUIStateA;
                    routeDetailsComponent$convertToUiState$2.L$2 = circularProgressIndicatorUIState;
                    routeDetailsComponent$convertToUiState$2.L$3 = routeDetailsViewTypeUIState;
                    routeDetailsComponent$convertToUiState$2.L$4 = routeAvailabilityDialogUIState;
                    routeDetailsComponent$convertToUiState$2.label = 4;
                    objI1 = i1(reportProblemMetaData, z5, list3, z6, str7, routeDetailsComponent$convertToUiState$2);
                    if (objI1 != coroutineSingletons) {
                        objA = objI1;
                        loadingDialogUIState2 = loadingDialogUIStateA;
                        routeDetailsViewTypeUIState3 = routeDetailsViewTypeUIState;
                        routeAvailabilityDialogUIState2 = routeAvailabilityDialogUIState;
                        livePassengerIndicatorBottomSheetContentUIState4 = livePassengerIndicatorBottomSheetContentUIState2;
                        circularProgressIndicatorUIState3 = circularProgressIndicatorUIState;
                    }
                    return coroutineSingletons;
                }
                loadingDialogUIState = loadingDialogUIStateA;
                routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState;
                livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState2;
                circularProgressIndicatorUIState2 = circularProgressIndicatorUIState;
                reportProblemDialogUIState = null;
                return new RouteDetailsViewState(livePassengerIndicatorBottomSheetContentUIState3, loadingDialogUIState, circularProgressIndicatorUIState2, routeDetailsViewTypeUIState2, routeAvailabilityDialogUIState, reportProblemDialogUIState);
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routeAvailabilityDialogUIState2 = (RouteAvailabilityDialogUIState) routeDetailsComponent$convertToUiState$2.L$4;
            routeDetailsViewTypeUIState3 = (RouteDetailsViewTypeUIState) routeDetailsComponent$convertToUiState$2.L$3;
            circularProgressIndicatorUIState3 = (CircularProgressIndicatorUIState) routeDetailsComponent$convertToUiState$2.L$2;
            loadingDialogUIState2 = (LoadingDialogUIState) routeDetailsComponent$convertToUiState$2.L$1;
            livePassengerIndicatorBottomSheetContentUIState4 = (LivePassengerIndicatorBottomSheetContentUIState) routeDetailsComponent$convertToUiState$2.L$0;
            ResultKt.b(objA);
        }
        routeAvailabilityDialogUIState = routeAvailabilityDialogUIState2;
        routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState3;
        circularProgressIndicatorUIState2 = circularProgressIndicatorUIState3;
        loadingDialogUIState = loadingDialogUIState2;
        livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState4;
        reportProblemDialogUIState = (ReportProblemDialogUIState) objA;
        return new RouteDetailsViewState(livePassengerIndicatorBottomSheetContentUIState3, loadingDialogUIState, circularProgressIndicatorUIState2, routeDetailsViewTypeUIState2, routeAvailabilityDialogUIState, reportProblemDialogUIState);
        livePassengerIndicatorBottomSheetContentUIState = (LivePassengerIndicatorBottomSheetContentUIState) objA;
        routeDetailsDataState2.getClass();
        routeDetailsDataState3 = routeDetailsDataState2;
        loadingDialogUIStateA = null;
        livePassengerIndicatorBottomSheetContentUIState2 = livePassengerIndicatorBottomSheetContentUIState;
        if (routeDetailsDataState3.f4834a) {
            circularProgressIndicatorUIStateA = CircularProgressIndicatorUIStateFactory.a();
        } else {
            circularProgressIndicatorUIStateA = null;
        }
        circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
        routeDetailsComponent = this;
        RouteDetailsComponent$convertToUiState$3 routeDetailsComponent$convertToUiState$5 = new RouteDetailsComponent$convertToUiState$3(1, routeDetailsComponent, RouteDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;)V", 0);
        routeDetailsComponent$convertToUiState$2.L$0 = routeDetailsDataState3;
        routeDetailsComponent$convertToUiState$2.L$1 = livePassengerIndicatorBottomSheetContentUIState2;
        routeDetailsComponent$convertToUiState$2.L$2 = loadingDialogUIStateA;
        routeDetailsComponent$convertToUiState$2.L$3 = circularProgressIndicatorUIState;
        routeDetailsComponent$convertToUiState$2.label = 3;
        objA = routeDetailsUIStateFactory.e(routeDetailsDataState3, routeDetailsComponent$convertToUiState$5, routeDetailsComponent$convertToUiState$2);
        if (objA != coroutineSingletons) {
            routeDetailsDataState4 = routeDetailsDataState3;
            routeDetailsViewTypeUIState = (RouteDetailsViewTypeUIState) objA;
            routeAvailabilityBannerDialogInfo = routeDetailsDataState4.s;
            if (routeAvailabilityBannerDialogInfo != null) {
                str = routeAvailabilityBannerDialogInfo.e;
                if (str != null) {
                    imageUrlUIState = new ImageUrlUIState(str, new ImageUISize(ChaloThemeHelper.a().l), null, null, 118);
                } else {
                    imageUrlUIState = null;
                }
                str2 = routeAvailabilityBannerDialogInfo.f4392a;
                if (str2 != null) {
                    chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                } else {
                    chaloTextUIState = null;
                }
                str3 = routeAvailabilityBannerDialogInfo.b;
                if (str3 != null) {
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                } else {
                    chaloTextUIState2 = null;
                }
                str4 = routeAvailabilityBannerDialogInfo.c;
                if (str4 != null) {
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new n31(routeDetailsComponent, 0)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
                } else {
                    chaloTextUIState3 = null;
                }
                routeAvailabilityDialogUIState = new RouteAvailabilityDialogUIState(imageUrlUIState, chaloTextUIState, chaloTextUIState2, chaloTextUIState3);
            } else {
                routeAvailabilityDialogUIState = null;
            }
            reportProblemMetaData = routeDetailsDataState4.t;
            if (reportProblemMetaData != null) {
                boolean z7 = routeDetailsDataState4.H;
                List list4 = routeDetailsDataState4.I;
                boolean z8 = routeDetailsDataState4.J;
                String str8 = routeDetailsDataState4.K;
                routeDetailsComponent$convertToUiState$2.L$0 = livePassengerIndicatorBottomSheetContentUIState2;
                routeDetailsComponent$convertToUiState$2.L$1 = loadingDialogUIStateA;
                routeDetailsComponent$convertToUiState$2.L$2 = circularProgressIndicatorUIState;
                routeDetailsComponent$convertToUiState$2.L$3 = routeDetailsViewTypeUIState;
                routeDetailsComponent$convertToUiState$2.L$4 = routeAvailabilityDialogUIState;
                routeDetailsComponent$convertToUiState$2.label = 4;
                objI1 = i1(reportProblemMetaData, z7, list4, z8, str8, routeDetailsComponent$convertToUiState$2);
                if (objI1 != coroutineSingletons) {
                    objA = objI1;
                    loadingDialogUIState2 = loadingDialogUIStateA;
                    routeDetailsViewTypeUIState3 = routeDetailsViewTypeUIState;
                    routeAvailabilityDialogUIState2 = routeAvailabilityDialogUIState;
                    livePassengerIndicatorBottomSheetContentUIState4 = livePassengerIndicatorBottomSheetContentUIState2;
                    circularProgressIndicatorUIState3 = circularProgressIndicatorUIState;
                    routeAvailabilityDialogUIState = routeAvailabilityDialogUIState2;
                    routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState3;
                    circularProgressIndicatorUIState2 = circularProgressIndicatorUIState3;
                    loadingDialogUIState = loadingDialogUIState2;
                    livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState4;
                    reportProblemDialogUIState = (ReportProblemDialogUIState) objA;
                }
            } else {
                loadingDialogUIState = loadingDialogUIStateA;
                routeDetailsViewTypeUIState2 = routeDetailsViewTypeUIState;
                livePassengerIndicatorBottomSheetContentUIState3 = livePassengerIndicatorBottomSheetContentUIState2;
                circularProgressIndicatorUIState2 = circularProgressIndicatorUIState;
                reportProblemDialogUIState = null;
            }
            return new RouteDetailsViewState(livePassengerIndicatorBottomSheetContentUIState3, loadingDialogUIState, circularProgressIndicatorUIState2, routeDetailsViewTypeUIState2, routeAvailabilityDialogUIState, reportProblemDialogUIState);
        }
        return coroutineSingletons;
    }

    public final void V0(int i) {
        List list;
        StopAppModel stopAppModel;
        String str;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null || (list = routeAppModel.e) == null || (stopAppModel = (StopAppModel) CollectionsKt.L(i, list)) == null || (str = stopAppModel.f1727a) == null) {
            return;
        }
        Job job = this.d0;
        if (job != null) {
            R0(job);
        }
        this.d0 = BuildersKt.d(this.j, null, null, new RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForMap$1(this, str, null), 3);
    }

    public final void W0(int i) {
        List list;
        StopAppModel stopAppModel;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel != null && (list = routeAppModel.e) != null && (stopAppModel = (StopAppModel) CollectionsKt.L(i, list)) != null) {
            String str = stopAppModel.f1727a;
            RouteAppModel routeAppModel2 = this.Y;
            if (routeAppModel2 != null) {
                Job job = this.c0;
                if (job != null) {
                    R0(job);
                }
                this.c0 = BuildersKt.d(this.j, null, null, new RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1(routeAppModel2, stopAppModel, this, str, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(Long l, Long l2, ContinuationImpl continuationImpl) {
        RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$1 routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1;
        RouteDetailsIntentModel routeDetailsIntentModel;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        List list;
        if (continuationImpl instanceof RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$1) {
            routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1 = (RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$1) continuationImpl;
            int i = routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1 = new RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$1(this, continuationImpl);
            }
        } else {
            routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1 = new RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$1(this, continuationImpl);
        }
        Object obj = routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            RouteAppModel routeAppModel = this.Y;
            if (routeAppModel != null && (routeDetailsIntentModel = this.X) != null && (trackingAdditionalFeatures = routeDetailsIntentModel.h) != null && (list = trackingAdditionalFeatures.f) != null) {
                Flow flowD = this.u.d((String) CollectionsKt.F(list), routeAppModel.j, l, l2);
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchLiveGpsLocationsForVehicles$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        VehicleLiveGpsLocationResponseAppModel vehicleLiveGpsLocationResponseAppModel = (VehicleLiveGpsLocationResponseAppModel) obj2;
                        String message = "liveGpsLocationData " + vehicleLiveGpsLocationResponseAppModel;
                        Intrinsics.i(message, "message");
                        Object objQ0 = RouteDetailsComponent.Q0(this.f4829a, CollectionsKt.R(vehicleLiveGpsLocationResponseAppModel), continuation);
                        return objQ0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objQ0 : Unit.f17538a;
                    }
                };
                routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1.label = 1;
                if (flowD.collect(flowCollector, routeDetailsComponent$fetchLiveGpsLocationsForVehicles$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }

    public final BusMapInfoWindowUiModel Y0(RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel) {
        BusMapInfoWindowViewType busMapInfoWindowViewType;
        if (((Boolean) this.u0.getValue()).booleanValue()) {
            busMapInfoWindowViewType = BusMapInfoWindowViewType.LIVE_TRACKING_VIEW;
        } else {
            busMapInfoWindowViewType = this.o0 ? BusMapInfoWindowViewType.DEBUG_VIEW : BusMapInfoWindowViewType.DEBUG_VIEW;
        }
        BusMapInfoWindowViewType busMapInfoWindowViewType2 = busMapInfoWindowViewType;
        long jA = GetLiveBusDelayedStateUseCaseKt.a(this.l.j(), realtimeSocketRouteStreamResponseAppModel.d);
        return new BusMapInfoWindowUiModel(realtimeSocketRouteStreamResponseAppModel.f4315a, realtimeSocketRouteStreamResponseAppModel.b, realtimeSocketRouteStreamResponseAppModel.g, realtimeSocketRouteStreamResponseAppModel.h, this.G.w(realtimeSocketRouteStreamResponseAppModel.c * ((long) 1000)), String.valueOf(jA), realtimeSocketRouteStreamResponseAppModel.e.toString(), busMapInfoWindowViewType2);
    }

    public final String Z0() {
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Long l;
        RouteDetailsIntentModel routeDetailsIntentModel = this.X;
        return this.G.e((routeDetailsIntentModel == null || (trackingAdditionalFeatures = routeDetailsIntentModel.h) == null || (l = trackingAdditionalFeatures.c) == null) ? 0L : l.longValue());
    }

    public final Object a1(boolean z, int i, ContinuationImpl continuationImpl) {
        RouteDetailsIntentModel routeDetailsIntentModel;
        RouteDetailsIntentModel routeDetailsIntentModel2;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        Long l;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null || (routeDetailsIntentModel = this.X) == null) {
            return StopEtaUiModel.NotAvailable.f4416a;
        }
        TrackingAdditionalFeatures trackingAdditionalFeatures2 = routeDetailsIntentModel.h;
        if (z && trackingAdditionalFeatures2.f4423a) {
            return StopEtaUiModel.AllBusPassedStop.f4414a;
        }
        if (((RouteDetailsStopUiModel) ((RouteDetailsDataState) this.f.getValue()).j.get(i)).l && (routeDetailsIntentModel2 = this.X) != null && (trackingAdditionalFeatures = routeDetailsIntentModel2.h) != null && (l = trackingAdditionalFeatures.c) != null && l.longValue() > this.l.j()) {
            return new StopEtaUiModel.SpecificScheduledTime(Z0());
        }
        if (trackingAdditionalFeatures2.b) {
            return StopEtaUiModel.LiveTrackingNotAvailable.f4415a;
        }
        RouteTripTimingAppModel routeTripTimingAppModel = routeAppModel.i;
        Object objA = this.r.a(routeTripTimingAppModel.f1722a, routeTripTimingAppModel.b, routeTripTimingAppModel.d, i == 0, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : (StopEtaUiModel) objA;
    }

    public final int b1(String str) {
        List list;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel != null && (list = routeAppModel.e) != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final List c1() {
        Object obj;
        Object next;
        int i;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null) {
            return EmptyList.f17557a;
        }
        List list = routeAppModel.e;
        RouteDetailsIntentModel routeDetailsIntentModel = this.X;
        if (routeDetailsIntentModel == null) {
            return EmptyList.f17557a;
        }
        String str = routeAppModel.m;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StopAppModel) it.next()).c);
        }
        List listA = MapUtilsKt.a(str, this.N, arrayList);
        if (routeAppModel.q && (i = this.h0) != -1) {
            return RouteMapUtilsKt.c(listA, ((StopAppModel) CollectionsKt.F(list)).c, ((StopAppModel) list.get(i)).c);
        }
        if (RouteDetailsIntentModelKt.a(routeDetailsIntentModel)) {
            Iterator it2 = list2.iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.d(((StopAppModel) next).f1727a, routeDetailsIntentModel.b));
            StopAppModel stopAppModel = (StopAppModel) next;
            for (Object obj2 : list2) {
                if (Intrinsics.d(((StopAppModel) obj2).f1727a, routeDetailsIntentModel.c)) {
                    obj = obj2;
                    break;
                }
            }
            StopAppModel stopAppModel2 = (StopAppModel) obj;
            if (stopAppModel != null && stopAppModel2 != null) {
                return RouteMapUtilsKt.c(listA, stopAppModel.c, stopAppModel2.c);
            }
        }
        return CollectionsKt.S(new ChaloMapPolylinePointDetails(listA, MapPolylinePointStateType.ENABLED), new ChaloMapPolylinePointDetails(EmptyList.f17557a, MapPolylinePointStateType.DISABLED));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel$NotAvailable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus] */
    public final void d1(int i) {
        if (this.g0 == i) {
            return;
        }
        this.g0 = i;
        this.i0 = null;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = StopEtaUiModel.NotAvailable.f4416a;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = StopEtaStatus.FETCHING_STARTED;
        if (RouteDetailsIntentModelKt.b(this.X, this.l.j())) {
            objectRef2.element = StopEtaStatus.ETA_NOT_AVAILABLE;
            objectRef.element = ((RouteDetailsStopUiModel) ((RouteDetailsDataState) this.f.getValue()).j.get(i)).l ? new StopEtaUiModel.SpecificScheduledTime(Z0()) : StopEtaUiModel.LiveTrackingNotAvailable.f4415a;
        }
        E0(new l4(i, objectRef2, objectRef));
        V0(i);
    }

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
    public final void e1(StopCtaActionType stopCtaActionType, boolean z) {
        RouteTripTimingAppModel routeTripTimingAppModel;
        int i = WhenMappings.f4821a[stopCtaActionType.ordinal()];
        RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper = this.z;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RouteAppModel routeAppModel = this.Y;
            if (routeAppModel != null) {
                List list = routeAppModel.e;
                routeDetailsAnalyticsHelper.u(routeAppModel.b, routeAppModel.c, ((StopAppModel) list.get(this.f0)).f1727a, ((StopAppModel) list.get(this.f0)).b);
            }
            E0(new n8(z, this, 9));
            return;
        }
        String str = z ? "route details map" : "route details list";
        Boolean boolValueOf = null;
        timeTableStatus = null;
        TimeTableStatus timeTableStatus = null;
        if (z) {
            List listS = CollectionsKt.S(TimeTableStatus.INVALID, TimeTableStatus.UNKNOWN);
            RouteAppModel routeAppModel2 = this.Y;
            if (routeAppModel2 != null && (routeTripTimingAppModel = routeAppModel2.i) != null) {
                timeTableStatus = routeTripTimingAppModel.f1722a;
            }
            boolValueOf = Boolean.valueOf(CollectionsKt.w(listS, timeTableStatus));
        }
        routeDetailsAnalyticsHelper.f(str, boolValueOf);
        RouteAppModel routeAppModel3 = this.Y;
        if (routeAppModel3 != null) {
            E0(new t01(26, this, routeAppModel3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v173 */
    /* JADX WARN: Type inference failed for: r2v174, types: [kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r2v176 */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    public final void f1(RouteDetailsIntent intent) {
        ArrayList arrayListE0;
        RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel;
        Object obj;
        int i;
        int i2;
        RouteDetailsIntentModel routeDetailsIntentModel;
        Object arrayList;
        String str;
        String str2;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel;
        int i3;
        ?? r2;
        String strA;
        int i4;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof RouteDetailsIntent.InitialIntent;
        int i5 = 2;
        CoroutineContextProvider coroutineContextProvider = this.J;
        int i6 = 1;
        ContextScope contextScope = this.j;
        if (z) {
            RouteDetailsIntent.InitialIntent initialIntent = (RouteDetailsIntent.InitialIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            this.X = initialIntent.f4837a;
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$handleInitialIntent$1(this, null), 2);
            return;
        }
        int i7 = 3;
        if (intent instanceof RouteDetailsIntent.StopSelectedToViewEtasIntent) {
            BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1(this, (RouteDetailsIntent.StopSelectedToViewEtasIntent) intent, null), 3);
            return;
        }
        boolean z2 = intent instanceof RouteDetailsIntent.UserDestinationStopSelectedIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            Iterator it = ((RouteDetailsDataState) stateFlow.getValue()).j.iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (Intrinsics.d(((RouteDetailsStopUiModel) it.next()).f4410a, ((RouteDetailsIntent.UserDestinationStopSelectedIntent) intent).f4869a)) {
                        i4 = i8;
                        break;
                    }
                    i8++;
                }
            }
            h1(this, "Route destination stop changed", ((RouteDetailsIntent.UserDestinationStopSelectedIntent) intent).b, this.h0, i4, null, 16);
            if (i4 == -1) {
                return;
            }
            if (i4 == this.h0) {
                E0(new x21(29));
                return;
            }
            if (((RouteDetailsDataState) stateFlow.getValue()).o && this.h0 == -1) {
                o1(i4);
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$selectInitialStopAndFetchEta$1(this, null), 3);
                g1(true);
            } else if (i4 > this.h0) {
                o1(i4);
                l1(this.f0, true);
            } else {
                o1(i4);
                l1(0, false);
            }
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$refreshLiveVehicleDetails$1(this, null), 2);
            return;
        }
        boolean z3 = intent instanceof RouteDetailsIntent.OnOptionsMenuItemClickedIntent;
        int i9 = 5;
        int i10 = 4;
        RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper = this.z;
        if (z3) {
            RouteDetailsOptionsMenu routeDetailsOptionsMenu = ((RouteDetailsIntent.OnOptionsMenuItemClickedIntent) intent).f4848a;
            RouteAppModel routeAppModel = this.Y;
            if (routeAppModel == null) {
                return;
            }
            String str3 = routeAppModel.c;
            List list = routeAppModel.e;
            int i11 = WhenMappings.c[routeDetailsOptionsMenu.ordinal()];
            if (i11 == 1) {
                routeDetailsAnalyticsHelper.f("route options menu", null);
                RouteAppModel routeAppModel2 = this.Y;
                if (routeAppModel2 != null) {
                    E0(new t01(26, this, routeAppModel2));
                    return;
                }
                return;
            }
            if (i11 == 2) {
                routeDetailsAnalyticsHelper.q("favorite added", str3, ((StopAppModel) CollectionsKt.F(list)).b, ((StopAppModel) CollectionsKt.P(list)).b);
                BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$addRouteToFavourite$1(this, null), 2);
                return;
            }
            if (i11 == 3) {
                routeDetailsAnalyticsHelper.q("favorite deleted", str3, ((StopAppModel) CollectionsKt.F(list)).b, ((StopAppModel) CollectionsKt.P(list)).b);
                BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$removeRouteFromFavourite$1(this, null), 2);
                return;
            } else if (i11 == 4) {
                RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "Search stop clicked", null, 14);
                E0(new p31(this, 2));
                return;
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleCheckin$1(this, null), 3);
                return;
            }
        }
        if (intent.equals(RouteDetailsIntent.ChangeUserDestinationClickedIntent.f4836a)) {
            RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "Route details change destination click", null, 14);
            E0(new p31(this, 0));
            RouteAppModel routeAppModel3 = this.Y;
            if (routeAppModel3 == null) {
                return;
            }
            routeDetailsAnalyticsHelper.r(routeAppModel3.e.size(), "route details screen", routeAppModel3.b, routeAppModel3.c);
            return;
        }
        boolean z4 = intent instanceof RouteDetailsIntent.OnRouteBookingCtaClicked;
        int i12 = 6;
        CityProvider cityProvider = this.k;
        if (z4) {
            RouteBookingType routeBookingType = ((RouteDetailsIntent.OnRouteBookingCtaClicked) intent).f4850a;
            RouteAppModel routeAppModel4 = this.Y;
            if (routeAppModel4 == null) {
                return;
            }
            int i13 = WhenMappings.b[routeBookingType.ordinal()];
            if (i13 == 1) {
                routeDetailsAnalyticsHelper.l(routeAppModel4.b, routeAppModel4.c);
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA = json.a(RouteAppModel.INSTANCE.serializer(), routeAppModel4);
                } catch (Exception unused) {
                    strA = null;
                }
                this.O.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(strA, null, Source.ROUTE_DETAILS, null, false, null, 238), null, null, 6));
                return;
            }
            if (i13 == 2) {
                BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$handleTicketBooking$1(this, null), 2);
                return;
            }
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = routeAppModel4.b;
            String strValueOf = String.valueOf(CityProviderKt.b(cityProvider));
            boolean zBooleanValue = ((Boolean) this.x.getG().getValue()).booleanValue();
            RouteLiveDetailsAppModel routeLiveDetailsAppModel2 = routeAppModel4.p;
            this.z.i(str4, strValueOf, zBooleanValue, routeLiveDetailsAppModel2.c, routeLiveDetailsAppModel2.d);
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$handleOnRouteBookingTypeClicked$1(this, null), 2);
            return;
        }
        if (intent instanceof RouteDetailsIntent.StopCtaClicked) {
            e1(((RouteDetailsIntent.StopCtaClicked) intent).f4865a, false);
            return;
        }
        if (intent instanceof RouteDetailsIntent.NativeAdLoaded) {
            RouteDetailsIntent.NativeAdLoaded nativeAdLoaded = (RouteDetailsIntent.NativeAdLoaded) intent;
            String adUnitId = nativeAdLoaded.b;
            BindNativeAdResult.Success success = nativeAdLoaded.c;
            Long l = nativeAdLoaded.d;
            LinkedHashMap linkedHashMap = success.f754a;
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(entry.getKey() + ":" + entry.getValue());
            }
            String strO = CollectionsKt.O(arrayList2, ",", null, null, null, 62);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str5 = success.c;
            if (StringsKt.F(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                linkedHashMap2.put("nativeAdLoadSource", str5);
            }
            if (!StringsKt.F(strO)) {
                linkedHashMap2.put("nativeAdAdditionalData", strO);
            }
            Source source = Source.ROUTE_DETAILS;
            String strA2 = NativeInlineAdSlotKt.a(NativeInlineAdSlot.ROUTE_DETAILS);
            long jLongValue = l != null ? l.longValue() : 0L;
            float f = success.b;
            Float fValueOf = Float.valueOf(f);
            AnalyticsContract analyticsContract = this.T;
            Intrinsics.i(analyticsContract, "<this>");
            Intrinsics.i(source, "source");
            Intrinsics.i(adUnitId, "adUnitId");
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair(PaymentConstants.Event.SCREEN, strA2), new Pair("adUnitId", adUnitId), new Pair("placement", LogConstants.DEFAULT_CHANNEL), new Pair("adLoadTime", Long.valueOf(jLongValue)), new Pair("adSdk", "gam"), new Pair("adType", "native"));
            Float f2 = f > 0.0f ? fValueOf : null;
            if (f2 != null) {
                linkedHashMapK.put("nativeAdAspectRatio", Float.valueOf(f2.floatValue()));
            }
            linkedHashMapK.putAll(linkedHashMap2);
            analyticsContract.e("ad loaded", source.getSourceName(), linkedHashMapK, AnalyticsFrequency.Always.b, false);
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnBackPressed.f4843a)) {
            RouteDetailsViewType routeDetailsViewType = ((RouteDetailsDataState) stateFlow.getValue()).h;
            if (Intrinsics.d(routeDetailsViewType, RouteDetailsViewType.MainScreen.f4880a)) {
                q0(new n31(this, i6));
                return;
            }
            if (Intrinsics.d(routeDetailsViewType, RouteDetailsViewType.TimeTable.f4883a) || (routeDetailsViewType instanceof RouteDetailsViewType.AllLiveVehicles) || Intrinsics.d(routeDetailsViewType, RouteDetailsViewType.StopSearchForEta.f4882a)) {
                E0(new r31(i5));
                return;
            }
            if (!Intrinsics.d(routeDetailsViewType, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                if (Intrinsics.d(routeDetailsViewType, RouteDetailsViewType.Error.f4879a)) {
                    q0(new n31(this, i5));
                    return;
                } else {
                    if (routeDetailsViewType != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "Route destination screen closed", null, 14);
            E0(new r31(i7));
            if (((RouteDetailsDataState) stateFlow.getValue()).o && this.h0 == -1) {
                o1(CollectionsKt.K(((RouteDetailsDataState) stateFlow.getValue()).j));
                r2 = 0;
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$selectInitialStopAndFetchEta$1(this, null), 3);
                g1(true);
            } else {
                r2 = 0;
                E0(new r31(i10));
            }
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), r2, new RouteDetailsComponent$refreshLiveVehicleDetails$1(this, r2), 2);
            return;
        }
        if (intent instanceof RouteDetailsIntent.SearchStopSelectedToViewEtasIntent) {
            Iterator it2 = ((RouteDetailsDataState) stateFlow.getValue()).j.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                } else {
                    if (Intrinsics.d(((RouteDetailsStopUiModel) it2.next()).f4410a, ((RouteDetailsIntent.SearchStopSelectedToViewEtasIntent) intent).f4864a)) {
                        i3 = i14;
                        break;
                    }
                    i14++;
                }
            }
            E0(new x21(24));
            h1(this, "Search stop selected", ((RouteDetailsIntent.SearchStopSelectedToViewEtasIntent) intent).b, this.f0, i3, null, 16);
            if (i3 <= this.h0) {
                l1(i3, false);
                return;
            } else {
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$processIntent$3(this, null), 3);
                return;
            }
        }
        if (intent.equals(RouteDetailsIntent.OnDropDownIconClick.f4844a)) {
            n1();
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnRetryClicked.f4849a)) {
            BuildersKt.d(contextScope, coroutineContextProvider.getDefault(), null, new RouteDetailsComponent$processIntent$4(this, null), 2);
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnStartIntent.f4851a)) {
            if (this.k0) {
                if (this.b0 == null) {
                    k1();
                }
                int i15 = this.f0;
                if (i15 != -1 && this.c0 == null) {
                    W0(i15);
                }
                int i16 = this.g0;
                if (i16 == -1 || this.d0 != null) {
                    return;
                }
                V0(i16);
                return;
            }
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnStopIntent.f4852a)) {
            Job job = this.b0;
            if (job != null) {
                R0(job);
            }
            Job job2 = this.c0;
            if (job2 != null) {
                R0(job2);
            }
            Job job3 = this.d0;
            if (job3 != null) {
                R0(job3);
            }
            Job job4 = this.e0;
            if (job4 != null) {
                R0(job4);
            }
            this.b0 = null;
            this.c0 = null;
            this.d0 = null;
            this.e0 = null;
            return;
        }
        if (intent.equals(RouteDetailsIntent.LiveSeatAvailabilityIndicatorInfoIconClicked.f4839a)) {
            if (((RouteDetailsDataState) stateFlow.getValue()).q == null) {
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$processIntent$5(this, null), 3);
                return;
            }
            RouteAppModel routeAppModel5 = this.Y;
            RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "seat occupancy bottomsheet rendered on demand busRouteFragment", MapsKt.h(new Pair("seat occupancy api mode", String.valueOf((routeAppModel5 == null || (routeLiveDetailsAppModel = routeAppModel5.p) == null) ? null : routeLiveDetailsAppModel.e))), 12);
            r0(RouteDetailsSideEffect.ShowLiveSeatAvailabilityBottomSheet.f4874a);
            return;
        }
        if (intent instanceof RouteDetailsIntent.LiveSeatAvailabilityBottomSheetCtaClicked) {
            BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$processIntent$6(this, null), 3);
            LiveSeatAvailabilityBottomSheetCtaType liveSeatAvailabilityBottomSheetCtaType = ((RouteDetailsIntent.LiveSeatAvailabilityBottomSheetCtaClicked) intent).f4838a;
            if (liveSeatAvailabilityBottomSheetCtaType.equals(LiveSeatAvailabilityBottomSheetCtaType.Dismiss.f4814a)) {
                RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "seat occupancy bottomsheet got it clicked", null, 14);
                r0(RouteDetailsSideEffect.DismissLiveSeatAvailabilityBottomSheet.f4871a);
                return;
            } else {
                if (!(liveSeatAvailabilityBottomSheetCtaType instanceof LiveSeatAvailabilityBottomSheetCtaType.ShowMoreInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                RouteDetailsAnalyticsHelper.DefaultImpls.a(routeDetailsAnalyticsHelper, "seat occupancy bottomsheet learn more clicked", null, 14);
                q0(new p01(16, this, intent));
                return;
            }
        }
        boolean zEquals = intent.equals(RouteDetailsIntent.RouteBannerClickedIntent.f4862a);
        UrlOpenHelper urlOpenHelper = this.V;
        int i17 = 10;
        String str6 = "";
        if (zEquals) {
            RouteAppModel routeAppModel6 = this.Y;
            if (routeAppModel6 == null) {
                return;
            }
            RouteAvailabilityBannerDetails routeAvailabilityBannerDetails = ((RouteDetailsDataState) stateFlow.getValue()).r;
            if (routeAvailabilityBannerDetails != null && (str2 = routeAvailabilityBannerDetails.h) != null) {
                str6 = str2;
            }
            if (routeAvailabilityBannerDetails != null ? Intrinsics.d(routeAvailabilityBannerDetails.f, Boolean.TRUE) : false) {
                if (str6.length() > 0) {
                    if (!StringsKt.x(routeAvailabilityBannerDetails.h, "dialog", true)) {
                        urlOpenHelper.a(str6, MapsKt.i(new Pair("routeId", routeAppModel6.b), new Pair("busFrequency", "bus")));
                        return;
                    } else {
                        RouteAvailabilityBannerDetails routeAvailabilityBannerDetails2 = (RouteAvailabilityBannerDetails) this.m0.get(routeAppModel6.p.e);
                        E0(new z21(routeAvailabilityBannerDetails2 != null ? routeAvailabilityBannerDetails2.i : null, i17));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (intent.equals(RouteDetailsIntent.RouteBannerDialogueCtaClickedIntent.f4863a)) {
            RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo = ((RouteDetailsDataState) stateFlow.getValue()).s;
            E0(new r31(0));
            if ((routeAvailabilityBannerDialogInfo != null ? routeAvailabilityBannerDialogInfo.d : null) == null || routeAvailabilityBannerDialogInfo.d.length() <= 0) {
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleRouteAvailabilityBannerDialogueCtaClickedIntent$2(this, null), 3);
                return;
            }
            String str7 = routeAvailabilityBannerDialogInfo.d;
            RouteAppModel routeAppModel7 = this.Y;
            if (routeAppModel7 != null && (str = routeAppModel7.b) != null) {
                str6 = str;
            }
            urlOpenHelper.a(str7, MapsKt.i(new Pair("routeId", str6), new Pair("busFrequency", "bus")));
            return;
        }
        if (intent.equals(RouteDetailsIntent.ReportProblemButtonClicked.f4856a)) {
            if (this.f0 != -1) {
                RouteAppModel routeAppModel8 = this.Y;
                if (routeAppModel8 == null) {
                    return;
                }
                List list2 = routeAppModel8.e;
                this.z.p(String.valueOf(CityProviderKt.b(cityProvider)), routeAppModel8.b, routeAppModel8.c, ((StopAppModel) list2.get(this.h0)).f1727a, ((StopAppModel) list2.get(this.h0)).b);
            }
            if (this.n0 != null) {
                E0(new p31(this, 1));
                return;
            }
            return;
        }
        if (intent instanceof RouteDetailsIntent.ReportIssueHookClicked) {
            RouteDetailsIntent.ReportIssueHookClicked reportIssueHookClicked = (RouteDetailsIntent.ReportIssueHookClicked) intent;
            RouteAppModel routeAppModel9 = this.Y;
            if (routeAppModel9 == null) {
                return;
            }
            String strValueOf2 = String.valueOf(CityProviderKt.b(cityProvider));
            String str8 = routeAppModel9.b;
            String str9 = routeAppModel9.c;
            String str10 = reportIssueHookClicked.f4855a;
            StopEtaUiModel stopEtaUiModel = reportIssueHookClicked.d;
            String str11 = reportIssueHookClicked.b;
            String strName = reportIssueHookClicked.c.name();
            if (stopEtaUiModel instanceof StopEtaUiModel.WithEtaAvailable.EstimatedEta) {
                ArrayList arrayList3 = ((StopEtaUiModel.WithEtaAvailable.EstimatedEta) stopEtaUiModel).f4418a;
                arrayList = new ArrayList(CollectionsKt.v(arrayList3, 10));
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj2 = arrayList3.get(i18);
                    i18++;
                    EstimatedEtaUiModel estimatedEtaUiModel = (EstimatedEtaUiModel) obj2;
                    arrayList.add(estimatedEtaUiModel.d + ": " + estimatedEtaUiModel.f4399a);
                }
            } else if (stopEtaUiModel instanceof StopEtaUiModel.WithEtaAvailable.FixedEta) {
                List<FixedEtaUiModel> list3 = ((StopEtaUiModel.WithEtaAvailable.FixedEta) stopEtaUiModel).f4419a;
                arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                for (FixedEtaUiModel fixedEtaUiModel : list3) {
                    arrayList.add(fixedEtaUiModel.c + ": " + fixedEtaUiModel.f4400a);
                }
            } else {
                arrayList = EmptyList.f17557a;
            }
            this.z.j(strValueOf2, str8, str9, str10, str11, strName, arrayList.toString(), stopEtaUiModel instanceof StopEtaUiModel.WithTimeTable.TimeTableAvailable, stopEtaUiModel instanceof StopEtaUiModel.SpecificScheduledTime, stopEtaUiModel.toString());
            return;
        }
        int i19 = 25;
        if (intent.equals(RouteDetailsIntent.ReportProblemModalAckClicked.f4858a) || intent.equals(RouteDetailsIntent.ReportProblemModalCancelClicked.f4859a)) {
            E0(new x21(25));
            return;
        }
        if (intent instanceof RouteDetailsIntent.ReportProblemModalSubmitClicked) {
            RouteAppModel routeAppModel10 = this.Y;
            if (routeAppModel10 == null) {
                return;
            }
            List list4 = routeAppModel10.e;
            int i20 = this.f0;
            String str12 = i20 != -1 ? ((StopAppModel) list4.get(i20)).b : null;
            int i21 = this.f0;
            String str13 = i21 != -1 ? ((StopAppModel) list4.get(i21)).f1727a : null;
            Boolean boolValueOf = this.f0 != -1 ? Boolean.valueOf(((RouteDetailsStopUiModel) ((RouteDetailsDataState) stateFlow.getValue()).j.get(this.f0)).j instanceof StopEtaUiModel.WithEtaAvailable.FixedEta) : null;
            RouteDetailsDataState routeDetailsDataState = (RouteDetailsDataState) stateFlow.getValue();
            List list5 = routeDetailsDataState.I;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((ReportProblemTagDetails) it3.next()).f4383a);
            }
            List list6 = routeDetailsDataState.I;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((ReportProblemTagDetails) it4.next()).b);
            }
            this.z.t(arrayList4, arrayList5, routeDetailsDataState.K, String.valueOf(CityProviderKt.b(cityProvider)), routeAppModel10.b, routeAppModel10.c, str13, str12, boolValueOf);
            E0(new x21(27));
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnMyLocationClicked.f4847a)) {
            BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleOnMyLocationClicked$1(this, null), 3);
            return;
        }
        if (intent instanceof RouteDetailsIntent.UpdateLocationPermission) {
            BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$processIntent$10(this, null), 3);
            return;
        }
        if (intent instanceof RouteDetailsIntent.OnMapCameraUpdateLoaded) {
            this.z0 = ((RouteDetailsIntent.OnMapCameraUpdateLoaded) intent).f4845a;
            return;
        }
        if (intent.equals(RouteDetailsIntent.OnMapLoaded.f4846a)) {
            RouteAppModel routeAppModel11 = this.Y;
            if (routeAppModel11 == null || (routeDetailsIntentModel = this.X) == null || this.x0) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleOnMapLoaded$1(this, routeAppModel11, routeDetailsIntentModel, null), 3);
            return;
        }
        if (!(intent instanceof RouteDetailsIntent.MapMarkerInteraction)) {
            if (intent instanceof RouteDetailsIntent.OnViaStringClickedIntent) {
                E0(new x21(28));
                return;
            }
            if (intent instanceof RouteDetailsIntent.OnViaStringDialogCloseClickIntent) {
                E0(new r31(i6));
                return;
            }
            if (intent instanceof RouteDetailsIntent.StopSearchQueryUpdate) {
                E0(new z21(intent, 7));
                return;
            }
            if (intent instanceof RouteDetailsIntent.ReportProblemFeedbackEntered) {
                E0(new z21((RouteDetailsIntent.ReportProblemFeedbackEntered) intent, this));
                return;
            }
            if (!(intent instanceof RouteDetailsIntent.ReportProblemTagClicked)) {
                if (!(intent instanceof RouteDetailsIntent.NativeAdFailedToLoad)) {
                    throw new NoWhenBranchMatchedException();
                }
                RouteDetailsIntent.NativeAdFailedToLoad nativeAdFailedToLoad = (RouteDetailsIntent.NativeAdFailedToLoad) intent;
                BuildersKt.d(contextScope, null, null, new RouteDetailsComponent$handleNativeAdLoadFailed$1(this, nativeAdFailedToLoad.f4841a, nativeAdFailedToLoad.b, nativeAdFailedToLoad.c, null), 3);
                return;
            }
            List list7 = ((RouteDetailsDataState) stateFlow.getValue()).I;
            ReportProblemTagDetails reportProblemTagDetails = ((RouteDetailsIntent.ReportProblemTagClicked) intent).f4861a;
            Intrinsics.i(list7, "<this>");
            List list8 = list7;
            if ((list8 instanceof Collection) && list8.isEmpty()) {
                arrayListE0 = CollectionsKt.E0(list7);
                arrayListE0.add(reportProblemTagDetails);
            } else {
                Iterator it5 = list8.iterator();
                while (it5.hasNext()) {
                    if (Intrinsics.d(((ReportProblemTagDetails) it5.next()).f4383a, reportProblemTagDetails.f4383a)) {
                        arrayListE0 = CollectionsKt.E0(list7);
                        arrayListE0.remove(reportProblemTagDetails);
                    }
                }
                arrayListE0 = CollectionsKt.E0(list7);
                arrayListE0.add(reportProblemTagDetails);
            }
            E0(new qd(arrayListE0, this));
            return;
        }
        RouteDetailsIntent.MapMarkerInteraction mapMarkerInteraction = (RouteDetailsIntent.MapMarkerInteraction) intent;
        if (mapMarkerInteraction instanceof RouteDetailsIntent.MapMarkerInteraction.MapInfoWindowClosed) {
            RouteDetailsMapMarker routeDetailsMapMarker = ((RouteDetailsIntent.MapMarkerInteraction.MapInfoWindowClosed) intent).b;
            if (!(routeDetailsMapMarker instanceof RouteDetailsMapStopMarkerInfo)) {
                if (routeDetailsMapMarker instanceof LiveVehiclesMarkerInfo) {
                    this.i0 = null;
                    E0(new r31(i12));
                    return;
                }
                return;
            }
            Iterator it6 = ((RouteDetailsDataState) stateFlow.getValue()).B.iterator();
            int i22 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (Intrinsics.d(((RouteDetailsMapStopMarkerInfo) it6.next()).f4900a, ((RouteDetailsMapStopMarkerInfo) routeDetailsMapMarker).f4900a)) {
                        i2 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i2 == this.g0) {
                Job job5 = this.d0;
                if (job5 != null) {
                    ((JobSupport) job5).cancel(null);
                }
                this.g0 = -1;
                E0(new r31(i9));
                return;
            }
            return;
        }
        if (!(mapMarkerInteraction instanceof RouteDetailsIntent.MapMarkerInteraction.MapMarkerClicked)) {
            if (!(mapMarkerInteraction instanceof RouteDetailsIntent.MapMarkerInteraction.OnMapInfoWindowClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            RouteDetailsMapMarker routeDetailsMapMarker2 = ((RouteDetailsIntent.MapMarkerInteraction.OnMapInfoWindowClicked) intent).b;
            if (routeDetailsMapMarker2 instanceof RouteDetailsMapStopMarkerInfo) {
                StopEtaUiModel stopEtaUiModel2 = ((RouteDetailsMapStopMarkerInfo) routeDetailsMapMarker2).d;
                if (stopEtaUiModel2 instanceof StopEtaUiModel.WithEtaAvailable) {
                    e1(StopCtaActionType.ViewMoreBuses, true);
                    return;
                }
                if (stopEtaUiModel2 instanceof StopEtaUiModel.WithTimeTable) {
                    e1(StopCtaActionType.ViewTimeTable, true);
                    return;
                } else {
                    if (!stopEtaUiModel2.equals(StopEtaUiModel.AllBusPassedStop.f4414a) && !stopEtaUiModel2.equals(StopEtaUiModel.LiveTrackingNotAvailable.f4415a) && !(stopEtaUiModel2 instanceof StopEtaUiModel.SpecificScheduledTime) && !stopEtaUiModel2.equals(StopEtaUiModel.NotAvailable.f4416a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        RouteDetailsMapMarker routeDetailsMapMarker3 = ((RouteDetailsIntent.MapMarkerInteraction.MapMarkerClicked) intent).b;
        if (routeDetailsMapMarker3 instanceof RouteDetailsMapStopMarkerInfo) {
            RouteAppModel routeAppModel12 = this.Y;
            if (routeAppModel12 == null) {
                return;
            }
            Iterator it7 = routeAppModel12.e.iterator();
            int i23 = 0;
            while (it7.hasNext()) {
                if (Intrinsics.d(((StopAppModel) it7.next()).f1727a, ((RouteDetailsMapStopMarkerInfo) routeDetailsMapMarker3).f4900a)) {
                    i = i23;
                    h1(this, "Route map stop selected", null, this.g0, i, null, 18);
                    d1(i);
                    return;
                }
                i23++;
            }
            i = -1;
            h1(this, "Route map stop selected", null, this.g0, i, null, 18);
            d1(i);
            return;
        }
        if (routeDetailsMapMarker3 instanceof LiveVehiclesMarkerInfo) {
            String str14 = ((LiveVehiclesMarkerInfo) routeDetailsMapMarker3).f4896a;
            if (this.o0 || ((Boolean) this.u0.getValue()).booleanValue()) {
                this.i0 = str14;
                List list9 = this.Z;
                if (list9 != null) {
                    Iterator it8 = list9.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it8.next();
                        if (Intrinsics.d(((RealtimeSocketRouteStreamResponseAppModel) next).b, str14)) {
                            obj = next;
                            break;
                        }
                    }
                    realtimeSocketRouteStreamResponseAppModel = (RealtimeSocketRouteStreamResponseAppModel) obj;
                } else {
                    realtimeSocketRouteStreamResponseAppModel = null;
                }
                if (realtimeSocketRouteStreamResponseAppModel != null) {
                    BusMapInfoWindowUiModel busMapInfoWindowUiModelY0 = Y0(realtimeSocketRouteStreamResponseAppModel);
                    String message = "busInfoWindowUiModel after click: " + busMapInfoWindowUiModelY0;
                    Intrinsics.i(message, "message");
                    E0(new t01(i19, str14, busMapInfoWindowUiModelY0));
                }
            }
        }
    }

    public final void g1(boolean z) {
        int i;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null) {
            return;
        }
        RouteDetailsIntentModel routeDetailsIntentModel = this.X;
        String strValueOf = String.valueOf(routeDetailsIntentModel != null ? routeDetailsIntentModel.e : null);
        String str = routeAppModel.b;
        String str2 = routeAppModel.c;
        int i2 = this.f0;
        boolean z2 = this.v0;
        StateFlow stateFlow = this.f;
        int size = ((RouteDetailsDataState) stateFlow.getValue()).C.size();
        List list = ((RouteDetailsDataState) stateFlow.getValue()).C;
        int i3 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (((LiveVehiclesMarkerInfo) it.next()).e && (i4 = i4 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
            i = i4;
        }
        List list2 = ((RouteDetailsDataState) stateFlow.getValue()).C;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((LiveVehiclesMarkerInfo) it2.next()).f && (i3 = i3 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        this.z.g(strValueOf, str, str2, z, i2, z2, size, i, i3);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0268  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x02be  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (r2 == r4) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(app.chalo.livetracking.routedetails.ReportProblemMetaData r44, boolean r45, java.util.List r46, boolean r47, java.lang.String r48, kotlin.coroutines.jvm.internal.ContinuationImpl r49) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.i1(app.chalo.livetracking.routedetails.ReportProblemMetaData, boolean, java.util.List, boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void j1() {
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null) {
            return;
        }
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = routeAppModel.p;
        if (this.m0.isEmpty()) {
            return;
        }
        RouteAvailabilityBannerDetails routeAvailabilityBannerDetails = (RouteAvailabilityBannerDetails) this.m0.get(routeLiveDetailsAppModel.e);
        if (Intrinsics.d(routeAvailabilityBannerDetails, ((RouteDetailsDataState) this.f.getValue()).r)) {
            return;
        }
        if (routeAvailabilityBannerDetails != null) {
            this.z.n(routeLiveDetailsAppModel.e);
        }
        E0(new z21(routeAvailabilityBannerDetails, 6));
    }

    public final void k1() {
        Job job = this.b0;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.b0 = BuildersKt.d(this.j, null, null, new RouteDetailsComponent$startFetchingLiveVehicleDetails$1(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel$NotAvailable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus] */
    public final void l1(int i, boolean z) {
        int i2 = this.f0;
        if (i != i2 || z) {
            this.p0 = false;
            Job job = this.c0;
            if (job != null) {
                R0(job);
            }
            this.f0 = i;
            RouteAppModel routeAppModel = this.Y;
            if (routeAppModel != null) {
                StopAppModel stopAppModel = (StopAppModel) CollectionsKt.L(i, routeAppModel.e);
                h1(this, "Route stop selected", null, i2, i, stopAppModel != null ? stopAppModel.c : null, 2);
            }
            StateFlow stateFlow = this.f;
            List list = ((RouteDetailsDataState) stateFlow.getValue()).B;
            int i3 = this.f0;
            Intrinsics.i(list, "<this>");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfoA = (RouteDetailsMapStopMarkerInfo) obj;
                if (!CollectionsKt.S(MarkerStopType.PremiumBusPickupStop, MarkerStopType.PremiumBusDropStop, MarkerStopType.BoardingStop, MarkerStopType.DeboardingStop).contains(routeDetailsMapStopMarkerInfoA.f) && i4 != 0 && i4 != CollectionsKt.K(list)) {
                    if (i4 == i3) {
                        routeDetailsMapStopMarkerInfoA = RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfoA, null, null, MarkerStopType.CurrentSelectedStopInStopList, false, 2015);
                    } else if (i4 == i2) {
                        routeDetailsMapStopMarkerInfoA = RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfoA, null, null, MarkerStopType.IntermediateStop, false, 2015);
                    }
                }
                arrayList.add(routeDetailsMapStopMarkerInfoA);
                i4 = i5;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = StopEtaUiModel.NotAvailable.f4416a;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = StopEtaStatus.FETCHING_STARTED;
            if (RouteDetailsIntentModelKt.b(this.X, this.l.j())) {
                objectRef2.element = StopEtaStatus.ETA_NOT_AVAILABLE;
                objectRef.element = ((RouteDetailsStopUiModel) ((RouteDetailsDataState) stateFlow.getValue()).j.get(i)).l ? new StopEtaUiModel.SpecificScheduledTime(Z0()) : StopEtaUiModel.LiveTrackingNotAvailable.f4415a;
            }
            E0(new wt0(arrayList, i, objectRef2, objectRef));
            W0(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0411  */
    /* JADX WARN: Code duplicated, block: B:103:0x0438  */
    /* JADX WARN: Code duplicated, block: B:105:0x043e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0442  */
    /* JADX WARN: Code duplicated, block: B:119:0x0480  */
    /* JADX WARN: Code duplicated, block: B:135:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:138:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:141:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:144:0x0510 A[LOOP:0: B:142:0x050a->B:144:0x0510, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0531  */
    /* JADX WARN: Code duplicated, block: B:149:0x053b  */
    /* JADX WARN: Code duplicated, block: B:151:0x054d  */
    /* JADX WARN: Code duplicated, block: B:153:0x055e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0582  */
    /* JADX WARN: Code duplicated, block: B:162:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x062a  */
    /* JADX WARN: Code duplicated, block: B:170:0x064b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0650  */
    /* JADX WARN: Code duplicated, block: B:175:0x0670  */
    /* JADX WARN: Code duplicated, block: B:177:0x0674  */
    /* JADX WARN: Code duplicated, block: B:179:0x068c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0697  */
    /* JADX WARN: Code duplicated, block: B:185:0x069f  */
    /* JADX WARN: Code duplicated, block: B:187:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:203:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0310  */
    /* JADX WARN: Code duplicated, block: B:59:0x0320  */
    /* JADX WARN: Code duplicated, block: B:62:0x0341  */
    /* JADX WARN: Code duplicated, block: B:65:0x0352  */
    /* JADX WARN: Code duplicated, block: B:68:0x0360  */
    /* JADX WARN: Code duplicated, block: B:71:0x0373 A[LOOP:2: B:66:0x035a->B:71:0x0373, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:87:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x03e1  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x054d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x055e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v40, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v56 */
    public final Object m1(ContinuationImpl continuationImpl) throws Throwable {
        RouteDetailsComponent$updateInitialViewState$1 routeDetailsComponent$updateInitialViewState$1;
        int i;
        RouteDetailsIntentModel routeDetailsIntentModel;
        char c;
        RouteAppModel routeAppModel;
        int i2;
        RouteDetailsIntentModel routeDetailsIntentModel2;
        boolean z;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Object objA;
        int i3;
        Object obj;
        RouteAppModel routeAppModel2;
        RouteDetailsIntentModel routeDetailsIntentModel3;
        Ref.IntRef intRef3;
        Ref.IntRef intRef4;
        boolean z2;
        List list;
        Object objA2;
        RouteAppModel routeAppModel3;
        Ref.IntRef intRef5;
        List list2;
        Object obj2;
        RouteDetailsIntentModel routeDetailsIntentModel4;
        Ref.IntRef intRef6;
        boolean z3;
        int i4;
        boolean zBooleanValue;
        boolean z4;
        Object objA3;
        boolean z5;
        Object obj3;
        RouteAppModel routeAppModel4;
        RouteDetailsIntentModel routeDetailsIntentModel5;
        Ref.IntRef intRef7;
        Ref.IntRef intRef8;
        List list3;
        boolean z6;
        int i5;
        boolean z7;
        boolean z8;
        List list4;
        Ref.IntRef intRef9;
        Ref.IntRef intRef10;
        RouteDetailsIntentModel routeDetailsIntentModel6;
        RouteAppModel routeAppModel5;
        Object objA4;
        boolean z9;
        Object obj4;
        RouteAppModel routeAppModel6;
        RouteDetailsIntentModel routeDetailsIntentModel7;
        Ref.IntRef intRef11;
        Ref.IntRef intRef12;
        List list5;
        boolean z10;
        int i6;
        boolean z11;
        String str;
        Iterator it;
        int i7;
        int i8;
        ChaloUseCaseResult chaloUseCaseResult;
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails;
        String str2;
        int i9;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objA5;
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails2;
        Object obj5;
        List list6;
        int i10;
        Ref.IntRef intRef13;
        boolean z15;
        CoroutineSingletons coroutineSingletons;
        RouteAppModel routeAppModel7;
        boolean z16;
        boolean z17;
        RouteDetailsIntentModel routeDetailsIntentModel8;
        int i11;
        boolean z18;
        boolean z19;
        Ref.IntRef intRef14;
        Long l;
        BonnetNumberToggleConfig bonnetNumberToggleConfig;
        boolean z20;
        int iH;
        boolean z21;
        ?? r7;
        Ref.ObjectRef objectRef;
        RouteAppModel routeAppModel8;
        List list7;
        ?? r4;
        boolean z22;
        Ref.IntRef intRef15;
        Ref.IntRef intRef16;
        Ref.ObjectRef objectRef2;
        boolean z23;
        RouteDetailsIntentModel routeDetailsIntentModel9;
        Object objA6;
        Object objA7;
        ?? r5;
        Ref.IntRef intRef17;
        RouteDetailsIntentModel routeDetailsIntentModel10;
        Object obj6;
        ?? r22;
        Ref.IntRef intRef18;
        CoroutineSingletons coroutineSingletons2;
        RouteAppModel routeAppModel9;
        Throwable thA;
        Object objD;
        Map map;
        String str3;
        boolean z24;
        boolean z25;
        int i12;
        boolean z26;
        Object objG;
        List list8;
        Ref.ObjectRef objectRef3;
        Object obj7;
        RouteDetailsIntentModel routeDetailsIntentModel11;
        boolean z27;
        int i13;
        boolean z28;
        LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails3;
        Ref.IntRef intRef19;
        boolean z29;
        CoroutineSingletons coroutineSingletons3;
        Map map2;
        RouteAppModel routeAppModel10;
        Ref.IntRef intRef20;
        boolean z30;
        ArrayList arrayList;
        Iterator it2;
        int size;
        int i14;
        int i15;
        ?? r9;
        Object obj8;
        int i16;
        String str4;
        String str5;
        boolean z31;
        boolean zBooleanValue2;
        boolean z32;
        RouteDetailsIntentModel routeDetailsIntentModel12;
        Object objS;
        CoroutineSingletons coroutineSingletons4;
        final Ref.IntRef intRef21;
        final RouteAppModel routeAppModel11;
        final boolean z33;
        final boolean z34;
        final boolean z35;
        final boolean z36;
        final Ref.ObjectRef objectRef4;
        final int i17;
        final Ref.IntRef intRef22;
        final RouteDetailsIntentModel routeDetailsIntentModel13;
        final Map map3;
        int i18;
        final LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails4;
        final boolean z37;
        final boolean z38;
        final boolean z39;
        int i19;
        final RouteDetailsComponent routeDetailsComponent = this;
        if (continuationImpl instanceof RouteDetailsComponent$updateInitialViewState$1) {
            routeDetailsComponent$updateInitialViewState$1 = (RouteDetailsComponent$updateInitialViewState$1) continuationImpl;
            int i20 = routeDetailsComponent$updateInitialViewState$1.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                routeDetailsComponent$updateInitialViewState$1.label = i20 - Integer.MIN_VALUE;
            } else {
                routeDetailsComponent$updateInitialViewState$1 = new RouteDetailsComponent$updateInitialViewState$1(routeDetailsComponent, continuationImpl);
            }
        } else {
            routeDetailsComponent$updateInitialViewState$1 = new RouteDetailsComponent$updateInitialViewState$1(routeDetailsComponent, continuationImpl);
        }
        Object obj9 = routeDetailsComponent$updateInitialViewState$1.result;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i21 = routeDetailsComponent$updateInitialViewState$1.label;
        BasicInfoContract basicInfoContract = routeDetailsComponent.l;
        switch (i21) {
            case 0:
                i = 0;
                ResultKt.b(obj9);
                RouteAppModel routeAppModel12 = routeDetailsComponent.Y;
                if (routeAppModel12 != null && (routeDetailsIntentModel = routeDetailsComponent.X) != null) {
                    Ref.IntRef intRef23 = new Ref.IntRef();
                    intRef23.element = -1;
                    Ref.IntRef intRef24 = new Ref.IntRef();
                    intRef24.element = -1;
                    boolean zA = RouteDetailsIntentModelKt.a(routeDetailsIntentModel);
                    if (zA) {
                        String str6 = routeDetailsIntentModel.b;
                        if (str6 != null) {
                            intRef23.element = routeDetailsComponent.b1(str6);
                        }
                        String str7 = routeDetailsIntentModel.c;
                        if (str7 != null) {
                            intRef24.element = routeDetailsComponent.b1(str7);
                        }
                    }
                    String str8 = routeDetailsIntentModel.d;
                    int iB1 = str8 != null ? routeDetailsComponent.b1(str8) : -1;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel12;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef23;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef24;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = zA;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = iB1;
                    c = 1;
                    routeDetailsComponent$updateInitialViewState$1.label = 1;
                    if (routeDetailsComponent.S0(routeDetailsComponent$updateInitialViewState$1) != coroutineSingletons5) {
                        int i22 = iB1;
                        routeAppModel = routeAppModel12;
                        i2 = i22;
                        routeDetailsIntentModel2 = routeDetailsIntentModel;
                        z = zA;
                        intRef = intRef23;
                        intRef2 = intRef24;
                        String str9 = routeAppModel.b;
                        TimeTableStatus[] timeTableStatusArr = new TimeTableStatus[2];
                        timeTableStatusArr[i] = TimeTableStatus.VALID;
                        timeTableStatusArr[c] = TimeTableStatus.VALID_WITH_DISCLAIMER;
                        boolean zContains = CollectionsKt.S(timeTableStatusArr).contains(routeAppModel.i.f1722a);
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel2;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef2;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i2;
                        routeDetailsComponent$updateInitialViewState$1.label = 2;
                        objA = routeDetailsComponent.o.a(str9, routeDetailsComponent$updateInitialViewState$1, zContains);
                        if (objA != coroutineSingletons5) {
                            boolean z40 = z;
                            i3 = i2;
                            obj = objA;
                            routeAppModel2 = routeAppModel;
                            routeDetailsIntentModel3 = routeDetailsIntentModel2;
                            intRef3 = intRef;
                            intRef4 = intRef2;
                            z2 = z40;
                            list = (List) obj;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel2;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel3;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef3;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef4;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z2;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i3;
                            routeDetailsComponent$updateInitialViewState$1.label = 3;
                            objA2 = routeDetailsComponent.C.a(routeDetailsComponent$updateInitialViewState$1);
                            if (objA2 != coroutineSingletons5) {
                                routeAppModel3 = routeAppModel2;
                                intRef5 = intRef3;
                                list2 = list;
                                obj2 = objA2;
                                routeDetailsIntentModel4 = routeDetailsIntentModel3;
                                intRef6 = intRef4;
                                z3 = z2;
                                i4 = i3;
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                                z4 = routeAppModel3.q;
                                if (z4) {
                                    String str10 = routeAppModel3.b;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel3;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel4;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef5;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef6;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list2;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z3;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                                    routeDetailsComponent$updateInitialViewState$1.label = 4;
                                    objA3 = routeDetailsComponent.E.a(str10, routeDetailsComponent$updateInitialViewState$1);
                                    if (objA3 != coroutineSingletons5) {
                                        z5 = z4;
                                        obj3 = objA3;
                                        routeAppModel4 = routeAppModel3;
                                        routeDetailsIntentModel5 = routeDetailsIntentModel4;
                                        intRef7 = intRef5;
                                        intRef8 = intRef6;
                                        list3 = list2;
                                        z6 = z3;
                                        i5 = i4;
                                        z7 = zBooleanValue;
                                        str = (String) obj3;
                                        if (str != null) {
                                            it = routeAppModel4.e.iterator();
                                            i7 = i;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i8 = -1;
                                                } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                                                    i8 = i7;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                            routeDetailsComponent.h0 = i8;
                                        }
                                        z4 = z5;
                                        zBooleanValue = z7;
                                        i4 = i5;
                                        z8 = z6;
                                        list4 = list3;
                                        intRef9 = intRef8;
                                        intRef10 = intRef7;
                                        routeDetailsIntentModel6 = routeDetailsIntentModel5;
                                        routeAppModel5 = routeAppModel4;
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                                        routeDetailsComponent$updateInitialViewState$1.label = 5;
                                        objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                                        if (objA4 != coroutineSingletons5) {
                                            boolean z41 = zBooleanValue;
                                            z9 = z4;
                                            obj4 = objA4;
                                            routeAppModel6 = routeAppModel5;
                                            routeDetailsIntentModel7 = routeDetailsIntentModel6;
                                            intRef11 = intRef10;
                                            intRef12 = intRef9;
                                            list5 = list4;
                                            z10 = z8;
                                            i6 = i4;
                                            z11 = z41;
                                            chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                                livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                            } else {
                                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                livePassengerIndicatorBottomSheetDetails = null;
                                            }
                                            str2 = routeDetailsIntentModel7.b;
                                            TrackingAdditionalFeatures trackingAdditionalFeatures = routeDetailsIntentModel7.h;
                                            if (str2 != null) {
                                                i9 = i;
                                            } else {
                                                i9 = i;
                                            }
                                            z12 = trackingAdditionalFeatures.k;
                                            z13 = trackingAdditionalFeatures.j;
                                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                                            routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                                            routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                                            routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                                            z14 = z9;
                                            routeDetailsComponent$updateInitialViewState$1.label = 6;
                                            objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                                            if (objA5 != coroutineSingletons5) {
                                                livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                                obj5 = objA5;
                                                list6 = list5;
                                                i10 = i9;
                                                intRef13 = intRef12;
                                                z15 = z14;
                                                coroutineSingletons = coroutineSingletons5;
                                                routeAppModel7 = routeAppModel6;
                                                z16 = z10;
                                                z17 = z12;
                                                routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                                i11 = i6;
                                                z18 = z13;
                                                Ref.IntRef intRef25 = intRef11;
                                                z19 = z11;
                                                intRef14 = intRef25;
                                                bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                                z20 = z18;
                                                iH = basicInfoContract.h();
                                                z21 = z17;
                                                if (bonnetNumberToggleConfig.f2315a) {
                                                    int i23 = bonnetNumberToggleConfig.b;
                                                    if (iH <= bonnetNumberToggleConfig.c) {
                                                        r7 = i;
                                                    } else {
                                                        r7 = i;
                                                    }
                                                } else {
                                                    r7 = i;
                                                }
                                                objectRef = new Ref.ObjectRef();
                                                AdTargetingProvider adTargetingProvider = routeDetailsComponent.A;
                                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                                routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                                routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                                routeAppModel8 = routeAppModel7;
                                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                                z21 = z21;
                                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                                routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                                z20 = z20;
                                                routeDetailsComponent$updateInitialViewState$1.label = 7;
                                                objA6 = adTargetingProvider.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                                coroutineSingletons5 = coroutineSingletons;
                                                if (objA6 != coroutineSingletons5) {
                                                    Ref.IntRef intRef26 = intRef14;
                                                    list7 = list6;
                                                    r4 = r7;
                                                    z22 = z20;
                                                    intRef15 = intRef26;
                                                    intRef16 = intRef13;
                                                    objectRef2 = objectRef;
                                                    z23 = z21;
                                                    routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                                    objA7 = (Map) objA6;
                                                    r5 = r4;
                                                    intRef17 = intRef16;
                                                    routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                                    obj6 = objA7;
                                                    r22 = r5;
                                                    intRef18 = intRef15;
                                                    coroutineSingletons2 = coroutineSingletons5;
                                                    routeAppModel9 = routeAppModel8;
                                                    thA = Result.a(obj6);
                                                    if (thA == null) {
                                                        objD = obj6;
                                                    } else {
                                                        if (!(thA instanceof CancellationException)) {
                                                            throw thA;
                                                        }
                                                        ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                                        objD = MapsKt.d();
                                                    }
                                                    map = (Map) objD;
                                                    str3 = routeAppModel9.s;
                                                    if (str3 != null) {
                                                        List listU = StringsKt.U(str3, new String[]{","}, 6);
                                                        arrayList = new ArrayList(CollectionsKt.v(listU, 10));
                                                        it2 = listU.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                                        }
                                                        size = arrayList.size();
                                                        i14 = i;
                                                        i15 = i14;
                                                        r9 = "";
                                                        while (i15 < size) {
                                                            obj8 = arrayList.get(i15);
                                                            i15++;
                                                            i16 = i14 + 1;
                                                            if (i14 >= 0) {
                                                                CollectionsKt.z0();
                                                                throw null;
                                                            }
                                                            int i24 = size;
                                                            str4 = (String) obj8;
                                                            ArrayList arrayList2 = arrayList;
                                                            if (i14 == arrayList.size() - 1) {
                                                                str5 = r9 + str4;
                                                            } else {
                                                                str5 = r9 + str4 + ", ";
                                                            }
                                                            r9 = str5;
                                                            i14 = i16;
                                                            size = i24;
                                                            arrayList = arrayList2;
                                                        }
                                                        objectRef2.element = r9;
                                                    }
                                                    AppPermission[] appPermissionArr = new AppPermission[1];
                                                    appPermissionArr[i] = AppPermission.FINE_LOCATION;
                                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                                    z24 = z19;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                                    z25 = z15;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                    i12 = i10;
                                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                    z26 = z23;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                                    routeDetailsComponent$updateInitialViewState$1.label = 8;
                                                    objG = basicInfoContract.g(appPermissionArr, routeDetailsComponent$updateInitialViewState$1);
                                                    if (objG == coroutineSingletons2) {
                                                        return coroutineSingletons2;
                                                    }
                                                    Ref.ObjectRef objectRef5 = objectRef2;
                                                    list8 = list7;
                                                    objectRef3 = objectRef5;
                                                    obj7 = objG;
                                                    routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                                    z27 = z16;
                                                    i13 = i11;
                                                    z28 = z24;
                                                    livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                                    intRef19 = intRef17;
                                                    z29 = z22;
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    map2 = map;
                                                    routeAppModel10 = routeAppModel9;
                                                    intRef20 = intRef18;
                                                    z30 = r22 == true ? 1 : 0;
                                                    z31 = z29;
                                                    zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                    z32 = z27;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                                    routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                                    routeDetailsComponent$updateInitialViewState$1.label = 9;
                                                    routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                                    routeDetailsComponent = this;
                                                    objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                                    coroutineSingletons4 = coroutineSingletons3;
                                                    if (objS == coroutineSingletons4) {
                                                        return coroutineSingletons4;
                                                    }
                                                    intRef21 = intRef20;
                                                    routeAppModel11 = routeAppModel10;
                                                    z33 = zBooleanValue2;
                                                    z34 = z28;
                                                    z35 = z32;
                                                    z36 = z30;
                                                    objectRef4 = objectRef3;
                                                    i17 = i13;
                                                    intRef22 = intRef19;
                                                    routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                                    map3 = map2;
                                                    i18 = i12;
                                                    livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                                    z37 = z25;
                                                    z38 = z26;
                                                    z39 = z31;
                                                    final boolean zBooleanValue3 = ((Boolean) objS).booleanValue();
                                                    if (i18 != 0) {
                                                        i19 = 1;
                                                    } else {
                                                        i19 = i;
                                                    }
                                                    final List list9 = list8;
                                                    final ?? r15 = i19;
                                                    routeDetailsComponent.E0(new Function1() { // from class: o31
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj10) {
                                                            RouteDetailsIntentModel routeDetailsIntentModel14;
                                                            RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                            RouteDetailsComponent routeDetailsComponent2;
                                                            Ref.IntRef intRef27;
                                                            Ref.IntRef intRef28;
                                                            MarkerStopType markerStopType;
                                                            Object next;
                                                            RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                            Intrinsics.i(it3, "it");
                                                            RouteAppModel routeAppModel13 = routeAppModel11;
                                                            String str11 = routeAppModel13.c;
                                                            List list10 = routeAppModel13.e;
                                                            RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                            boolean z42 = routeDetailsComponent3.o0;
                                                            String str12 = "(";
                                                            String strA = vo1.A(str11, z42 ? vo1.B("(", routeAppModel13.b, ")") : "");
                                                            String str13 = routeAppModel13.h.b;
                                                            List list11 = list10;
                                                            String str14 = "";
                                                            RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list11, 10));
                                                            Iterator it4 = list11.iterator();
                                                            int i25 = 0;
                                                            while (true) {
                                                                boolean zHasNext = it4.hasNext();
                                                                RouteDetailsDataState routeDetailsDataState = it3;
                                                                RouteDetailsIntentModel routeDetailsIntentModel15 = routeDetailsIntentModel13;
                                                                String str15 = strA;
                                                                boolean z43 = z37;
                                                                Ref.IntRef intRef29 = intRef21;
                                                                boolean z44 = z42;
                                                                Ref.IntRef intRef30 = intRef22;
                                                                StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                                Object obj11 = null;
                                                                if (zHasNext) {
                                                                    Object next2 = it4.next();
                                                                    int i26 = i25 + 1;
                                                                    if (i25 < 0) {
                                                                        CollectionsKt.z0();
                                                                        throw null;
                                                                    }
                                                                    RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                                    StopAppModel stopAppModel = (StopAppModel) next2;
                                                                    String str16 = str13;
                                                                    Iterator it5 = it4;
                                                                    boolean z45 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel15.b) && r15;
                                                                    String str17 = stopAppModel.f1727a;
                                                                    String strA2 = vo1.A(stopAppModel.b, z44 ? vo1.B("(", str17, ")") : str14);
                                                                    int i27 = routeDetailsComponent3.h0;
                                                                    boolean z46 = i27 != -1 && i25 > i27;
                                                                    boolean z47 = i27 == i25;
                                                                    StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                                    String stopId = stopAppModel.f1727a;
                                                                    int i28 = intRef29.element;
                                                                    int i29 = intRef30.element;
                                                                    int i30 = routeDetailsComponent3.s0;
                                                                    TrackingAdditionalFeatures trackingAdditionalFeatures2 = routeDetailsIntentModel15.h;
                                                                    String str18 = str14;
                                                                    boolean z48 = trackingAdditionalFeatures2.l;
                                                                    Iterable customStopTagInfoList = trackingAdditionalFeatures2.o;
                                                                    if (customStopTagInfoList == null) {
                                                                        customStopTagInfoList = EmptyList.f17557a;
                                                                    }
                                                                    Intrinsics.i(stopId, "stopId");
                                                                    Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                                    ArrayList arrayList4 = new ArrayList();
                                                                    boolean z49 = z43 && i25 == i27;
                                                                    if (i25 == i28) {
                                                                        arrayList4.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                                    } else if (i25 == i29) {
                                                                        arrayList4.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                                    } else if (i25 == i30 && z49) {
                                                                        arrayList4.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                        arrayList4.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                    } else if (z49) {
                                                                        arrayList4.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                    } else if (i25 == i30 || (i25 == i17 && z48)) {
                                                                        arrayList4.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                    }
                                                                    for (Object obj12 : customStopTagInfoList) {
                                                                        if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                            obj11 = obj12;
                                                                            break;
                                                                        }
                                                                    }
                                                                    RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                                    if (routeDetailsCustomStopTagInfo != null) {
                                                                        arrayList4.add(routeDetailsCustomStopTagInfo.b);
                                                                    }
                                                                    arrayList3.add(new RouteDetailsStopUiModel(str17, i25, strA2, false, false, z46, false, z47, stopEtaStatus, notAvailable, arrayList4, z45, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                                    it3 = routeDetailsDataState;
                                                                    strA = str15;
                                                                    z42 = z44;
                                                                    i25 = i26;
                                                                    routeDetailsViewType = routeDetailsViewType2;
                                                                    str13 = str16;
                                                                    it4 = it5;
                                                                    str14 = str18;
                                                                } else {
                                                                    RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                                    String str19 = str13;
                                                                    String str20 = str14;
                                                                    StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                                    List listC1 = routeDetailsComponent3.c1();
                                                                    CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                                    RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                                    List list12 = routeAppModel13.n;
                                                                    ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list12, 10));
                                                                    Iterator it6 = list12.iterator();
                                                                    while (it6.hasNext()) {
                                                                        arrayList5.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                                    }
                                                                    String str21 = z34 ? routeAppModel13.j : null;
                                                                    int i31 = routeDetailsComponent3.h0;
                                                                    String str22 = i31 != -1 ? ((StopAppModel) list10.get(i31)).b : str20;
                                                                    boolean z50 = routeDetailsIntentModel15.h.i;
                                                                    String str23 = str21;
                                                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list11, 10));
                                                                    Iterator it7 = list11.iterator();
                                                                    int i32 = 0;
                                                                    while (true) {
                                                                        boolean zHasNext2 = it7.hasNext();
                                                                        Iterator it8 = it7;
                                                                        boolean z51 = z38;
                                                                        boolean z52 = z39;
                                                                        boolean z53 = z36;
                                                                        if (!zHasNext2) {
                                                                            return RouteDetailsDataState.a(routeDetailsDataState, false, null, str15, str19, ((StopAppModel) list10.get(0)).b, (String) objectRef4.element, routeAppModel13.t, routeDetailsViewType3, list9, arrayList3, str22, routeDetailsMapUiModel, null, z43, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList5, str23, z50, z51, z52, arrayList6, null, z53, false, map3, "", false, null, false, null, zBooleanValue3, -1604474878, 60);
                                                                        }
                                                                        Object next3 = it8.next();
                                                                        int i33 = i32 + 1;
                                                                        if (i32 < 0) {
                                                                            CollectionsKt.z0();
                                                                            throw null;
                                                                        }
                                                                        StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        List list13 = routeDetailsIntentModel15.h.n;
                                                                        if (list13 != null) {
                                                                            Iterator it9 = list13.iterator();
                                                                            while (true) {
                                                                                if (!it9.hasNext()) {
                                                                                    routeDetailsIntentModel14 = routeDetailsIntentModel15;
                                                                                    next = null;
                                                                                    break;
                                                                                }
                                                                                next = it9.next();
                                                                                routeDetailsIntentModel14 = routeDetailsIntentModel15;
                                                                                Iterator it10 = it9;
                                                                                if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                                    break;
                                                                                }
                                                                                it9 = it10;
                                                                                routeDetailsIntentModel15 = routeDetailsIntentModel14;
                                                                            }
                                                                            routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                                        } else {
                                                                            routeDetailsIntentModel14 = routeDetailsIntentModel15;
                                                                            routeDetailsCustomStopMarkerInfo = null;
                                                                        }
                                                                        if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                            int iK = CollectionsKt.K(list10);
                                                                            int i34 = routeDetailsComponent3.h0;
                                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                                            int i35 = intRef29.element;
                                                                            intRef27 = intRef29;
                                                                            int i36 = intRef30.element;
                                                                            intRef28 = intRef30;
                                                                            boolean z54 = i34 != -1 && i32 > i34;
                                                                            if (z35) {
                                                                                if (i32 == i35) {
                                                                                    markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                                } else if (i32 == i36) {
                                                                                    markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                                } else {
                                                                                    markerStopType = (i35 + 1 > i32 || i32 >= i36) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                                }
                                                                            } else if (i32 == 0) {
                                                                                markerStopType = MarkerStopType.FirstStop;
                                                                            } else if (i32 == iK) {
                                                                                markerStopType = MarkerStopType.LastStop;
                                                                            } else {
                                                                                markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                            }
                                                                        } else {
                                                                            intRef27 = intRef29;
                                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                                            intRef28 = intRef30;
                                                                        }
                                                                        MarkerStopType markerStopType2 = markerStopType;
                                                                        String str24 = stopAppModel2.f1727a;
                                                                        String str25 = str12;
                                                                        StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                                        notAvailable2 = notAvailable3;
                                                                        arrayList6.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z44 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i32 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                                        str12 = str25;
                                                                        arrayList5 = arrayList7;
                                                                        it7 = it8;
                                                                        i32 = i33;
                                                                        routeDetailsIntentModel15 = routeDetailsIntentModel14;
                                                                        routeDetailsComponent3 = routeDetailsComponent2;
                                                                        intRef29 = intRef27;
                                                                        intRef30 = intRef28;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    });
                                                    if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                                        RouteDetailsIntentModel routeDetailsIntentModel14 = routeDetailsComponent.X;
                                                        routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel14 != null ? routeDetailsIntentModel14.e : null), routeAppModel11.b, routeAppModel11.c);
                                                    } else {
                                                        routeDetailsComponent.g1(z37);
                                                    }
                                                    routeDetailsComponent.j1();
                                                    routeDetailsComponent.k0 = true;
                                                    if (z35) {
                                                        routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    routeDetailsComponent.h0 = CollectionsKt.K(routeAppModel3.e);
                                    z8 = z3;
                                    list4 = list2;
                                    intRef9 = intRef6;
                                    intRef10 = intRef5;
                                    routeDetailsIntentModel6 = routeDetailsIntentModel4;
                                    routeAppModel5 = routeAppModel3;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                                    routeDetailsComponent$updateInitialViewState$1.label = 5;
                                    objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                                    if (objA4 != coroutineSingletons5) {
                                        boolean z42 = zBooleanValue;
                                        z9 = z4;
                                        obj4 = objA4;
                                        routeAppModel6 = routeAppModel5;
                                        routeDetailsIntentModel7 = routeDetailsIntentModel6;
                                        intRef11 = intRef10;
                                        intRef12 = intRef9;
                                        list5 = list4;
                                        z10 = z8;
                                        i6 = i4;
                                        z11 = z42;
                                        chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                            livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                        } else {
                                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            livePassengerIndicatorBottomSheetDetails = null;
                                        }
                                        str2 = routeDetailsIntentModel7.b;
                                        TrackingAdditionalFeatures trackingAdditionalFeatures2 = routeDetailsIntentModel7.h;
                                        if (str2 != null || str2.length() == 0 || (l = trackingAdditionalFeatures2.c) == null || l.longValue() <= 0) {
                                            i9 = i;
                                        } else {
                                            i9 = 1;
                                        }
                                        z12 = trackingAdditionalFeatures2.k;
                                        z13 = trackingAdditionalFeatures2.j;
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                                        z14 = z9;
                                        routeDetailsComponent$updateInitialViewState$1.label = 6;
                                        objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                                        if (objA5 != coroutineSingletons5) {
                                            livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                            obj5 = objA5;
                                            list6 = list5;
                                            i10 = i9;
                                            intRef13 = intRef12;
                                            z15 = z14;
                                            coroutineSingletons = coroutineSingletons5;
                                            routeAppModel7 = routeAppModel6;
                                            z16 = z10;
                                            z17 = z12;
                                            routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                            i11 = i6;
                                            z18 = z13;
                                            Ref.IntRef intRef27 = intRef11;
                                            z19 = z11;
                                            intRef14 = intRef27;
                                            bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                            z20 = z18;
                                            iH = basicInfoContract.h();
                                            z21 = z17;
                                            if (bonnetNumberToggleConfig.f2315a) {
                                                int i25 = bonnetNumberToggleConfig.b;
                                                if (iH <= bonnetNumberToggleConfig.c || i25 > iH) {
                                                    r7 = i;
                                                } else {
                                                    r7 = 1;
                                                }
                                            } else {
                                                r7 = i;
                                            }
                                            objectRef = new Ref.ObjectRef();
                                            try {
                                                AdTargetingProvider adTargetingProvider2 = routeDetailsComponent.A;
                                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                                routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                                routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                                routeAppModel8 = routeAppModel7;
                                                try {
                                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                                    z21 = z21;
                                                    try {
                                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                                        z20 = z20;
                                                        try {
                                                            routeDetailsComponent$updateInitialViewState$1.label = 7;
                                                            objA6 = adTargetingProvider2.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                                            coroutineSingletons5 = coroutineSingletons;
                                                            if (objA6 != coroutineSingletons5) {
                                                                Ref.IntRef intRef28 = intRef14;
                                                                list7 = list6;
                                                                r4 = r7;
                                                                z22 = z20;
                                                                intRef15 = intRef28;
                                                                intRef16 = intRef13;
                                                                objectRef2 = objectRef;
                                                                z23 = z21;
                                                                routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                                                try {
                                                                    objA7 = (Map) objA6;
                                                                    r5 = r4;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    objA7 = ResultKt.a(th);
                                                                    r5 = r4;
                                                                }
                                                                intRef17 = intRef16;
                                                                routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                                                obj6 = objA7;
                                                                r22 = r5;
                                                                intRef18 = intRef15;
                                                                coroutineSingletons2 = coroutineSingletons5;
                                                                routeAppModel9 = routeAppModel8;
                                                                thA = Result.a(obj6);
                                                                if (thA == null) {
                                                                    objD = obj6;
                                                                } else {
                                                                    if (!(thA instanceof CancellationException)) {
                                                                        throw thA;
                                                                    }
                                                                    ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                                                    objD = MapsKt.d();
                                                                }
                                                                map = (Map) objD;
                                                                str3 = routeAppModel9.s;
                                                                if (str3 != null) {
                                                                    List listU2 = StringsKt.U(str3, new String[]{","}, 6);
                                                                    arrayList = new ArrayList(CollectionsKt.v(listU2, 10));
                                                                    it2 = listU2.iterator();
                                                                    while (it2.hasNext()) {
                                                                        arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                                                    }
                                                                    size = arrayList.size();
                                                                    i14 = i;
                                                                    i15 = i14;
                                                                    r9 = "";
                                                                    while (i15 < size) {
                                                                        obj8 = arrayList.get(i15);
                                                                        i15++;
                                                                        i16 = i14 + 1;
                                                                        if (i14 >= 0) {
                                                                            CollectionsKt.z0();
                                                                            throw null;
                                                                        }
                                                                        int i26 = size;
                                                                        str4 = (String) obj8;
                                                                        ArrayList arrayList3 = arrayList;
                                                                        if (i14 == arrayList.size() - 1) {
                                                                            str5 = r9 + str4;
                                                                        } else {
                                                                            str5 = r9 + str4 + ", ";
                                                                        }
                                                                        r9 = str5;
                                                                        i14 = i16;
                                                                        size = i26;
                                                                        arrayList = arrayList3;
                                                                    }
                                                                    objectRef2.element = r9;
                                                                }
                                                                AppPermission[] appPermissionArr2 = new AppPermission[1];
                                                                appPermissionArr2[i] = AppPermission.FINE_LOCATION;
                                                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                                                routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                                                routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                                                z24 = z19;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                                                z25 = z15;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                                i12 = i10;
                                                                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                                z26 = z23;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                                                routeDetailsComponent$updateInitialViewState$1.label = 8;
                                                                objG = basicInfoContract.g(appPermissionArr2, routeDetailsComponent$updateInitialViewState$1);
                                                                if (objG == coroutineSingletons2) {
                                                                    return coroutineSingletons2;
                                                                }
                                                                Ref.ObjectRef objectRef6 = objectRef2;
                                                                list8 = list7;
                                                                objectRef3 = objectRef6;
                                                                obj7 = objG;
                                                                routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                                                z27 = z16;
                                                                i13 = i11;
                                                                z28 = z24;
                                                                livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                                                intRef19 = intRef17;
                                                                z29 = z22;
                                                                coroutineSingletons3 = coroutineSingletons2;
                                                                map2 = map;
                                                                routeAppModel10 = routeAppModel9;
                                                                intRef20 = intRef18;
                                                                z30 = r22 == true ? 1 : 0;
                                                                z31 = z29;
                                                                zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                                                routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                                                routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                                                routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                                z32 = z27;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                                                routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                                                routeDetailsComponent$updateInitialViewState$1.label = 9;
                                                                routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                                                routeDetailsComponent = this;
                                                                objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                                                coroutineSingletons4 = coroutineSingletons3;
                                                                if (objS == coroutineSingletons4) {
                                                                    return coroutineSingletons4;
                                                                }
                                                                intRef21 = intRef20;
                                                                routeAppModel11 = routeAppModel10;
                                                                z33 = zBooleanValue2;
                                                                z34 = z28;
                                                                z35 = z32;
                                                                z36 = z30;
                                                                objectRef4 = objectRef3;
                                                                i17 = i13;
                                                                intRef22 = intRef19;
                                                                routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                                                map3 = map2;
                                                                i18 = i12;
                                                                livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                                                z37 = z25;
                                                                z38 = z26;
                                                                z39 = z31;
                                                                final boolean zBooleanValue4 = ((Boolean) objS).booleanValue();
                                                                if (i18 != 0) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = i;
                                                                }
                                                                final List list10 = list8;
                                                                final boolean r16 = i19;
                                                                routeDetailsComponent.E0(new Function1() { // from class: o31
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj10) {
                                                                        RouteDetailsIntentModel routeDetailsIntentModel15;
                                                                        RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                                        RouteDetailsComponent routeDetailsComponent2;
                                                                        Ref.IntRef intRef29;
                                                                        Ref.IntRef intRef210;
                                                                        MarkerStopType markerStopType;
                                                                        Object next;
                                                                        RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                                        Intrinsics.i(it3, "it");
                                                                        RouteAppModel routeAppModel13 = routeAppModel11;
                                                                        String str11 = routeAppModel13.c;
                                                                        List list11 = routeAppModel13.e;
                                                                        RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                                        boolean z43 = routeDetailsComponent3.o0;
                                                                        String str12 = "(";
                                                                        String strA = vo1.A(str11, z43 ? vo1.B("(", routeAppModel13.b, ")") : "");
                                                                        String str13 = routeAppModel13.h.b;
                                                                        List list12 = list11;
                                                                        String str14 = "";
                                                                        RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                                        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list12, 10));
                                                                        Iterator it4 = list12.iterator();
                                                                        int i27 = 0;
                                                                        while (true) {
                                                                            boolean zHasNext = it4.hasNext();
                                                                            RouteDetailsDataState routeDetailsDataState = it3;
                                                                            RouteDetailsIntentModel routeDetailsIntentModel16 = routeDetailsIntentModel13;
                                                                            String str15 = strA;
                                                                            boolean z44 = z37;
                                                                            Ref.IntRef intRef211 = intRef21;
                                                                            boolean z45 = z43;
                                                                            Ref.IntRef intRef30 = intRef22;
                                                                            StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                                            Object obj11 = null;
                                                                            if (zHasNext) {
                                                                                Object next2 = it4.next();
                                                                                int i28 = i27 + 1;
                                                                                if (i27 < 0) {
                                                                                    CollectionsKt.z0();
                                                                                    throw null;
                                                                                }
                                                                                RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                                                StopAppModel stopAppModel = (StopAppModel) next2;
                                                                                String str16 = str13;
                                                                                Iterator it5 = it4;
                                                                                boolean z46 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel16.b) && r16;
                                                                                String str17 = stopAppModel.f1727a;
                                                                                String strA2 = vo1.A(stopAppModel.b, z45 ? vo1.B("(", str17, ")") : str14);
                                                                                int i29 = routeDetailsComponent3.h0;
                                                                                boolean z47 = i29 != -1 && i27 > i29;
                                                                                boolean z48 = i29 == i27;
                                                                                StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                                                String stopId = stopAppModel.f1727a;
                                                                                int i210 = intRef211.element;
                                                                                int i211 = intRef30.element;
                                                                                int i30 = routeDetailsComponent3.s0;
                                                                                TrackingAdditionalFeatures trackingAdditionalFeatures3 = routeDetailsIntentModel16.h;
                                                                                String str18 = str14;
                                                                                boolean z49 = trackingAdditionalFeatures3.l;
                                                                                Iterable customStopTagInfoList = trackingAdditionalFeatures3.o;
                                                                                if (customStopTagInfoList == null) {
                                                                                    customStopTagInfoList = EmptyList.f17557a;
                                                                                }
                                                                                Intrinsics.i(stopId, "stopId");
                                                                                Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                                                ArrayList arrayList5 = new ArrayList();
                                                                                boolean z410 = z44 && i27 == i29;
                                                                                if (i27 == i210) {
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                                                } else if (i27 == i211) {
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                                                } else if (i27 == i30 && z410) {
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                                } else if (z410) {
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                                } else if (i27 == i30 || (i27 == i17 && z49)) {
                                                                                    arrayList5.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                                }
                                                                                for (Object obj12 : customStopTagInfoList) {
                                                                                    if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                                        obj11 = obj12;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                                                if (routeDetailsCustomStopTagInfo != null) {
                                                                                    arrayList5.add(routeDetailsCustomStopTagInfo.b);
                                                                                }
                                                                                arrayList4.add(new RouteDetailsStopUiModel(str17, i27, strA2, false, false, z47, false, z48, stopEtaStatus, notAvailable, arrayList5, z46, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                                                it3 = routeDetailsDataState;
                                                                                strA = str15;
                                                                                z43 = z45;
                                                                                i27 = i28;
                                                                                routeDetailsViewType = routeDetailsViewType2;
                                                                                str13 = str16;
                                                                                it4 = it5;
                                                                                str14 = str18;
                                                                            } else {
                                                                                RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                                                String str19 = str13;
                                                                                String str20 = str14;
                                                                                StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                                                List listC1 = routeDetailsComponent3.c1();
                                                                                CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                                                RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                                                List list13 = routeAppModel13.n;
                                                                                ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list13, 10));
                                                                                Iterator it6 = list13.iterator();
                                                                                while (it6.hasNext()) {
                                                                                    arrayList6.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                                                }
                                                                                String str21 = z34 ? routeAppModel13.j : null;
                                                                                int i31 = routeDetailsComponent3.h0;
                                                                                String str22 = i31 != -1 ? ((StopAppModel) list11.get(i31)).b : str20;
                                                                                boolean z50 = routeDetailsIntentModel16.h.i;
                                                                                String str23 = str21;
                                                                                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list12, 10));
                                                                                Iterator it7 = list12.iterator();
                                                                                int i32 = 0;
                                                                                while (true) {
                                                                                    boolean zHasNext2 = it7.hasNext();
                                                                                    Iterator it8 = it7;
                                                                                    boolean z51 = z38;
                                                                                    boolean z52 = z39;
                                                                                    boolean z53 = z36;
                                                                                    if (!zHasNext2) {
                                                                                        return RouteDetailsDataState.a(routeDetailsDataState, false, null, str15, str19, ((StopAppModel) list11.get(0)).b, (String) objectRef4.element, routeAppModel13.t, routeDetailsViewType3, list10, arrayList4, str22, routeDetailsMapUiModel, null, z44, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList6, str23, z50, z51, z52, arrayList7, null, z53, false, map3, "", false, null, false, null, zBooleanValue4, -1604474878, 60);
                                                                                    }
                                                                                    Object next3 = it8.next();
                                                                                    int i33 = i32 + 1;
                                                                                    if (i32 < 0) {
                                                                                        CollectionsKt.z0();
                                                                                        throw null;
                                                                                    }
                                                                                    StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                                                    ArrayList arrayList8 = arrayList6;
                                                                                    List list14 = routeDetailsIntentModel16.h.n;
                                                                                    if (list14 != null) {
                                                                                        Iterator it9 = list14.iterator();
                                                                                        while (true) {
                                                                                            if (!it9.hasNext()) {
                                                                                                routeDetailsIntentModel15 = routeDetailsIntentModel16;
                                                                                                next = null;
                                                                                                break;
                                                                                            }
                                                                                            next = it9.next();
                                                                                            routeDetailsIntentModel15 = routeDetailsIntentModel16;
                                                                                            Iterator it10 = it9;
                                                                                            if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                                                break;
                                                                                            }
                                                                                            it9 = it10;
                                                                                            routeDetailsIntentModel16 = routeDetailsIntentModel15;
                                                                                        }
                                                                                        routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                                                    } else {
                                                                                        routeDetailsIntentModel15 = routeDetailsIntentModel16;
                                                                                        routeDetailsCustomStopMarkerInfo = null;
                                                                                    }
                                                                                    if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                                        int iK = CollectionsKt.K(list11);
                                                                                        int i34 = routeDetailsComponent3.h0;
                                                                                        routeDetailsComponent2 = routeDetailsComponent3;
                                                                                        int i35 = intRef211.element;
                                                                                        intRef29 = intRef211;
                                                                                        int i36 = intRef30.element;
                                                                                        intRef210 = intRef30;
                                                                                        boolean z54 = i34 != -1 && i32 > i34;
                                                                                        if (z35) {
                                                                                            if (i32 == i35) {
                                                                                                markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                                            } else if (i32 == i36) {
                                                                                                markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                                            } else {
                                                                                                markerStopType = (i35 + 1 > i32 || i32 >= i36) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                                            }
                                                                                        } else if (i32 == 0) {
                                                                                            markerStopType = MarkerStopType.FirstStop;
                                                                                        } else if (i32 == iK) {
                                                                                            markerStopType = MarkerStopType.LastStop;
                                                                                        } else {
                                                                                            markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                                        }
                                                                                    } else {
                                                                                        intRef29 = intRef211;
                                                                                        routeDetailsComponent2 = routeDetailsComponent3;
                                                                                        intRef210 = intRef30;
                                                                                    }
                                                                                    MarkerStopType markerStopType2 = markerStopType;
                                                                                    String str24 = stopAppModel2.f1727a;
                                                                                    String str25 = str12;
                                                                                    StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                                                    notAvailable2 = notAvailable3;
                                                                                    arrayList7.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z45 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i32 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                                                    str12 = str25;
                                                                                    arrayList6 = arrayList8;
                                                                                    it7 = it8;
                                                                                    i32 = i33;
                                                                                    routeDetailsIntentModel16 = routeDetailsIntentModel15;
                                                                                    routeDetailsComponent3 = routeDetailsComponent2;
                                                                                    intRef211 = intRef29;
                                                                                    intRef30 = intRef210;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                                                    RouteDetailsIntentModel routeDetailsIntentModel15 = routeDetailsComponent.X;
                                                                    routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel15 != null ? routeDetailsIntentModel15.e : null), routeAppModel11.b, routeAppModel11.c);
                                                                } else {
                                                                    routeDetailsComponent.g1(z37);
                                                                }
                                                                routeDetailsComponent.j1();
                                                                routeDetailsComponent.k0 = true;
                                                                if (z35) {
                                                                    routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            coroutineSingletons5 = coroutineSingletons;
                                                            Ref.IntRef intRef29 = intRef14;
                                                            list7 = list6;
                                                            r4 = r7;
                                                            z22 = z20;
                                                            intRef15 = intRef29;
                                                            intRef16 = intRef13;
                                                            objectRef2 = objectRef;
                                                            z23 = z21;
                                                            routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                                            objA7 = ResultKt.a(th);
                                                            r5 = r4;
                                                            intRef17 = intRef16;
                                                            routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                                            obj6 = objA7;
                                                            r22 = r5;
                                                            intRef18 = intRef15;
                                                            coroutineSingletons2 = coroutineSingletons5;
                                                            routeAppModel9 = routeAppModel8;
                                                            thA = Result.a(obj6);
                                                            if (thA == null) {
                                                                objD = obj6;
                                                            } else {
                                                                if (!(thA instanceof CancellationException)) {
                                                                    throw thA;
                                                                }
                                                                ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                                                objD = MapsKt.d();
                                                            }
                                                            map = (Map) objD;
                                                            str3 = routeAppModel9.s;
                                                            if (str3 != null) {
                                                                List listU3 = StringsKt.U(str3, new String[]{","}, 6);
                                                                arrayList = new ArrayList(CollectionsKt.v(listU3, 10));
                                                                it2 = listU3.iterator();
                                                                while (it2.hasNext()) {
                                                                    arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                                                }
                                                                size = arrayList.size();
                                                                i14 = i;
                                                                i15 = i14;
                                                                r9 = "";
                                                                while (i15 < size) {
                                                                    obj8 = arrayList.get(i15);
                                                                    i15++;
                                                                    i16 = i14 + 1;
                                                                    if (i14 >= 0) {
                                                                        CollectionsKt.z0();
                                                                        throw null;
                                                                    }
                                                                    int i27 = size;
                                                                    str4 = (String) obj8;
                                                                    ArrayList arrayList4 = arrayList;
                                                                    if (i14 == arrayList.size() - 1) {
                                                                        str5 = r9 + str4;
                                                                    } else {
                                                                        str5 = r9 + str4 + ", ";
                                                                    }
                                                                    r9 = str5;
                                                                    i14 = i16;
                                                                    size = i27;
                                                                    arrayList = arrayList4;
                                                                }
                                                                objectRef2.element = r9;
                                                            }
                                                            AppPermission[] appPermissionArr3 = new AppPermission[1];
                                                            appPermissionArr3[i] = AppPermission.FINE_LOCATION;
                                                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                                            routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                                            routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                                            routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                                            z24 = z19;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                                            z25 = z15;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                            i12 = i10;
                                                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                            z26 = z23;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                                            routeDetailsComponent$updateInitialViewState$1.label = 8;
                                                            objG = basicInfoContract.g(appPermissionArr3, routeDetailsComponent$updateInitialViewState$1);
                                                            if (objG == coroutineSingletons2) {
                                                                return coroutineSingletons2;
                                                            }
                                                            Ref.ObjectRef objectRef7 = objectRef2;
                                                            list8 = list7;
                                                            objectRef3 = objectRef7;
                                                            obj7 = objG;
                                                            routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                                            z27 = z16;
                                                            i13 = i11;
                                                            z28 = z24;
                                                            livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                                            intRef19 = intRef17;
                                                            z29 = z22;
                                                            coroutineSingletons3 = coroutineSingletons2;
                                                            map2 = map;
                                                            routeAppModel10 = routeAppModel9;
                                                            intRef20 = intRef18;
                                                            z30 = r22 == true ? 1 : 0;
                                                            z31 = z29;
                                                            zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                                            routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                                            routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                                            routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                                            z32 = z27;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                                            routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                                            routeDetailsComponent$updateInitialViewState$1.label = 9;
                                                            routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                                            routeDetailsComponent = this;
                                                            objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                                            coroutineSingletons4 = coroutineSingletons3;
                                                            if (objS == coroutineSingletons4) {
                                                                return coroutineSingletons4;
                                                            }
                                                            intRef21 = intRef20;
                                                            routeAppModel11 = routeAppModel10;
                                                            z33 = zBooleanValue2;
                                                            z34 = z28;
                                                            z35 = z32;
                                                            z36 = z30;
                                                            objectRef4 = objectRef3;
                                                            i17 = i13;
                                                            intRef22 = intRef19;
                                                            routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                                            map3 = map2;
                                                            i18 = i12;
                                                            livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                                            z37 = z25;
                                                            z38 = z26;
                                                            z39 = z31;
                                                            final boolean zBooleanValue5 = ((Boolean) objS).booleanValue();
                                                            if (i18 != 0) {
                                                                i19 = 1;
                                                            } else {
                                                                i19 = i;
                                                            }
                                                            final List list11 = list8;
                                                            final boolean r17 = i19;
                                                            routeDetailsComponent.E0(new Function1() { // from class: o31
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj10) {
                                                                    RouteDetailsIntentModel routeDetailsIntentModel16;
                                                                    RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                                    RouteDetailsComponent routeDetailsComponent2;
                                                                    Ref.IntRef intRef210;
                                                                    Ref.IntRef intRef211;
                                                                    MarkerStopType markerStopType;
                                                                    Object next;
                                                                    RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                                    Intrinsics.i(it3, "it");
                                                                    RouteAppModel routeAppModel13 = routeAppModel11;
                                                                    String str11 = routeAppModel13.c;
                                                                    List list12 = routeAppModel13.e;
                                                                    RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                                    boolean z43 = routeDetailsComponent3.o0;
                                                                    String str12 = "(";
                                                                    String strA = vo1.A(str11, z43 ? vo1.B("(", routeAppModel13.b, ")") : "");
                                                                    String str13 = routeAppModel13.h.b;
                                                                    List list13 = list12;
                                                                    String str14 = "";
                                                                    RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                                    ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list13, 10));
                                                                    Iterator it4 = list13.iterator();
                                                                    int i28 = 0;
                                                                    while (true) {
                                                                        boolean zHasNext = it4.hasNext();
                                                                        RouteDetailsDataState routeDetailsDataState = it3;
                                                                        RouteDetailsIntentModel routeDetailsIntentModel17 = routeDetailsIntentModel13;
                                                                        String str15 = strA;
                                                                        boolean z44 = z37;
                                                                        Ref.IntRef intRef212 = intRef21;
                                                                        boolean z45 = z43;
                                                                        Ref.IntRef intRef30 = intRef22;
                                                                        StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                                        Object obj11 = null;
                                                                        if (zHasNext) {
                                                                            Object next2 = it4.next();
                                                                            int i29 = i28 + 1;
                                                                            if (i28 < 0) {
                                                                                CollectionsKt.z0();
                                                                                throw null;
                                                                            }
                                                                            RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                                            StopAppModel stopAppModel = (StopAppModel) next2;
                                                                            String str16 = str13;
                                                                            Iterator it5 = it4;
                                                                            boolean z46 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel17.b) && r17;
                                                                            String str17 = stopAppModel.f1727a;
                                                                            String strA2 = vo1.A(stopAppModel.b, z45 ? vo1.B("(", str17, ")") : str14);
                                                                            int i210 = routeDetailsComponent3.h0;
                                                                            boolean z47 = i210 != -1 && i28 > i210;
                                                                            boolean z48 = i210 == i28;
                                                                            StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                                            String stopId = stopAppModel.f1727a;
                                                                            int i211 = intRef212.element;
                                                                            int i212 = intRef30.element;
                                                                            int i30 = routeDetailsComponent3.s0;
                                                                            TrackingAdditionalFeatures trackingAdditionalFeatures3 = routeDetailsIntentModel17.h;
                                                                            String str18 = str14;
                                                                            boolean z49 = trackingAdditionalFeatures3.l;
                                                                            Iterable customStopTagInfoList = trackingAdditionalFeatures3.o;
                                                                            if (customStopTagInfoList == null) {
                                                                                customStopTagInfoList = EmptyList.f17557a;
                                                                            }
                                                                            Intrinsics.i(stopId, "stopId");
                                                                            Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                                            ArrayList arrayList6 = new ArrayList();
                                                                            boolean z410 = z44 && i28 == i210;
                                                                            if (i28 == i211) {
                                                                                arrayList6.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                                            } else if (i28 == i212) {
                                                                                arrayList6.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                                            } else if (i28 == i30 && z410) {
                                                                                arrayList6.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                                arrayList6.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                            } else if (z410) {
                                                                                arrayList6.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                                            } else if (i28 == i30 || (i28 == i17 && z49)) {
                                                                                arrayList6.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                            }
                                                                            for (Object obj12 : customStopTagInfoList) {
                                                                                if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                                    obj11 = obj12;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                                            if (routeDetailsCustomStopTagInfo != null) {
                                                                                arrayList6.add(routeDetailsCustomStopTagInfo.b);
                                                                            }
                                                                            arrayList5.add(new RouteDetailsStopUiModel(str17, i28, strA2, false, false, z47, false, z48, stopEtaStatus, notAvailable, arrayList6, z46, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                                            it3 = routeDetailsDataState;
                                                                            strA = str15;
                                                                            z43 = z45;
                                                                            i28 = i29;
                                                                            routeDetailsViewType = routeDetailsViewType2;
                                                                            str13 = str16;
                                                                            it4 = it5;
                                                                            str14 = str18;
                                                                        } else {
                                                                            RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                                            String str19 = str13;
                                                                            String str20 = str14;
                                                                            StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                                            List listC1 = routeDetailsComponent3.c1();
                                                                            CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                                            RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                                            List list14 = routeAppModel13.n;
                                                                            ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list14, 10));
                                                                            Iterator it6 = list14.iterator();
                                                                            while (it6.hasNext()) {
                                                                                arrayList7.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                                            }
                                                                            String str21 = z34 ? routeAppModel13.j : null;
                                                                            int i31 = routeDetailsComponent3.h0;
                                                                            String str22 = i31 != -1 ? ((StopAppModel) list12.get(i31)).b : str20;
                                                                            boolean z50 = routeDetailsIntentModel17.h.i;
                                                                            String str23 = str21;
                                                                            ArrayList arrayList8 = new ArrayList(CollectionsKt.v(list13, 10));
                                                                            Iterator it7 = list13.iterator();
                                                                            int i32 = 0;
                                                                            while (true) {
                                                                                boolean zHasNext2 = it7.hasNext();
                                                                                Iterator it8 = it7;
                                                                                boolean z51 = z38;
                                                                                boolean z52 = z39;
                                                                                boolean z53 = z36;
                                                                                if (!zHasNext2) {
                                                                                    return RouteDetailsDataState.a(routeDetailsDataState, false, null, str15, str19, ((StopAppModel) list12.get(0)).b, (String) objectRef4.element, routeAppModel13.t, routeDetailsViewType3, list11, arrayList5, str22, routeDetailsMapUiModel, null, z44, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList7, str23, z50, z51, z52, arrayList8, null, z53, false, map3, "", false, null, false, null, zBooleanValue5, -1604474878, 60);
                                                                                }
                                                                                Object next3 = it8.next();
                                                                                int i33 = i32 + 1;
                                                                                if (i32 < 0) {
                                                                                    CollectionsKt.z0();
                                                                                    throw null;
                                                                                }
                                                                                StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                                                ArrayList arrayList9 = arrayList7;
                                                                                List list15 = routeDetailsIntentModel17.h.n;
                                                                                if (list15 != null) {
                                                                                    Iterator it9 = list15.iterator();
                                                                                    while (true) {
                                                                                        if (!it9.hasNext()) {
                                                                                            routeDetailsIntentModel16 = routeDetailsIntentModel17;
                                                                                            next = null;
                                                                                            break;
                                                                                        }
                                                                                        next = it9.next();
                                                                                        routeDetailsIntentModel16 = routeDetailsIntentModel17;
                                                                                        Iterator it10 = it9;
                                                                                        if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                                            break;
                                                                                        }
                                                                                        it9 = it10;
                                                                                        routeDetailsIntentModel17 = routeDetailsIntentModel16;
                                                                                    }
                                                                                    routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                                                } else {
                                                                                    routeDetailsIntentModel16 = routeDetailsIntentModel17;
                                                                                    routeDetailsCustomStopMarkerInfo = null;
                                                                                }
                                                                                if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                                    int iK = CollectionsKt.K(list12);
                                                                                    int i34 = routeDetailsComponent3.h0;
                                                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                                                    int i35 = intRef212.element;
                                                                                    intRef210 = intRef212;
                                                                                    int i36 = intRef30.element;
                                                                                    intRef211 = intRef30;
                                                                                    boolean z54 = i34 != -1 && i32 > i34;
                                                                                    if (z35) {
                                                                                        if (i32 == i35) {
                                                                                            markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                                        } else if (i32 == i36) {
                                                                                            markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                                        } else {
                                                                                            markerStopType = (i35 + 1 > i32 || i32 >= i36) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                                        }
                                                                                    } else if (i32 == 0) {
                                                                                        markerStopType = MarkerStopType.FirstStop;
                                                                                    } else if (i32 == iK) {
                                                                                        markerStopType = MarkerStopType.LastStop;
                                                                                    } else {
                                                                                        markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                                    }
                                                                                } else {
                                                                                    intRef210 = intRef212;
                                                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                                                    intRef211 = intRef30;
                                                                                }
                                                                                MarkerStopType markerStopType2 = markerStopType;
                                                                                String str24 = stopAppModel2.f1727a;
                                                                                String str25 = str12;
                                                                                StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                                                notAvailable2 = notAvailable3;
                                                                                arrayList8.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z45 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i32 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                                                str12 = str25;
                                                                                arrayList7 = arrayList9;
                                                                                it7 = it8;
                                                                                i32 = i33;
                                                                                routeDetailsIntentModel17 = routeDetailsIntentModel16;
                                                                                routeDetailsComponent3 = routeDetailsComponent2;
                                                                                intRef212 = intRef210;
                                                                                intRef30 = intRef211;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            });
                                                            if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                                                RouteDetailsIntentModel routeDetailsIntentModel16 = routeDetailsComponent.X;
                                                                routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel16 != null ? routeDetailsIntentModel16.e : null), routeAppModel11.b, routeAppModel11.c);
                                                            } else {
                                                                routeDetailsComponent.g1(z37);
                                                            }
                                                            routeDetailsComponent.j1();
                                                            routeDetailsComponent.k0 = true;
                                                            if (z35) {
                                                                routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                                            }
                                                            return Unit.f17538a;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        z20 = z20;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z21 = z21;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                routeAppModel8 = routeAppModel7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return coroutineSingletons5;
                }
                return Unit.f17538a;
            case 1:
                i = 0;
                i2 = routeDetailsComponent$updateInitialViewState$1.I$0;
                z = routeDetailsComponent$updateInitialViewState$1.Z$0;
                intRef2 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                intRef = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                routeDetailsIntentModel2 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                routeAppModel = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                c = 1;
                String str11 = routeAppModel.b;
                TimeTableStatus[] timeTableStatusArr2 = new TimeTableStatus[2];
                timeTableStatusArr2[i] = TimeTableStatus.VALID;
                timeTableStatusArr2[c] = TimeTableStatus.VALID_WITH_DISCLAIMER;
                boolean zContains2 = CollectionsKt.S(timeTableStatusArr2).contains(routeAppModel.i.f1722a);
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel2;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef2;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i2;
                routeDetailsComponent$updateInitialViewState$1.label = 2;
                objA = routeDetailsComponent.o.a(str11, routeDetailsComponent$updateInitialViewState$1, zContains2);
                if (objA != coroutineSingletons5) {
                    boolean z43 = z;
                    i3 = i2;
                    obj = objA;
                    routeAppModel2 = routeAppModel;
                    routeDetailsIntentModel3 = routeDetailsIntentModel2;
                    intRef3 = intRef;
                    intRef4 = intRef2;
                    z2 = z43;
                    list = (List) obj;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel2;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel3;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef3;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef4;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z2;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i3;
                    routeDetailsComponent$updateInitialViewState$1.label = 3;
                    objA2 = routeDetailsComponent.C.a(routeDetailsComponent$updateInitialViewState$1);
                    if (objA2 != coroutineSingletons5) {
                        routeAppModel3 = routeAppModel2;
                        intRef5 = intRef3;
                        list2 = list;
                        obj2 = objA2;
                        routeDetailsIntentModel4 = routeDetailsIntentModel3;
                        intRef6 = intRef4;
                        z3 = z2;
                        i4 = i3;
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                        z4 = routeAppModel3.q;
                        if (z4) {
                            routeDetailsComponent.h0 = CollectionsKt.K(routeAppModel3.e);
                            z8 = z3;
                            list4 = list2;
                            intRef9 = intRef6;
                            intRef10 = intRef5;
                            routeDetailsIntentModel6 = routeDetailsIntentModel4;
                            routeAppModel5 = routeAppModel3;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                            routeDetailsComponent$updateInitialViewState$1.label = 5;
                            objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                            if (objA4 != coroutineSingletons5) {
                                boolean z44 = zBooleanValue;
                                z9 = z4;
                                obj4 = objA4;
                                routeAppModel6 = routeAppModel5;
                                routeDetailsIntentModel7 = routeDetailsIntentModel6;
                                intRef11 = intRef10;
                                intRef12 = intRef9;
                                list5 = list4;
                                z10 = z8;
                                i6 = i4;
                                z11 = z44;
                                chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                    livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                } else {
                                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    livePassengerIndicatorBottomSheetDetails = null;
                                }
                                str2 = routeDetailsIntentModel7.b;
                                TrackingAdditionalFeatures trackingAdditionalFeatures3 = routeDetailsIntentModel7.h;
                                if (str2 != null) {
                                    i9 = i;
                                } else {
                                    i9 = i;
                                }
                                z12 = trackingAdditionalFeatures3.k;
                                z13 = trackingAdditionalFeatures3.j;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                                z14 = z9;
                                routeDetailsComponent$updateInitialViewState$1.label = 6;
                                objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                                if (objA5 != coroutineSingletons5) {
                                    livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                    obj5 = objA5;
                                    list6 = list5;
                                    i10 = i9;
                                    intRef13 = intRef12;
                                    z15 = z14;
                                    coroutineSingletons = coroutineSingletons5;
                                    routeAppModel7 = routeAppModel6;
                                    z16 = z10;
                                    z17 = z12;
                                    routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                    i11 = i6;
                                    z18 = z13;
                                    Ref.IntRef intRef210 = intRef11;
                                    z19 = z11;
                                    intRef14 = intRef210;
                                    bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                    z20 = z18;
                                    iH = basicInfoContract.h();
                                    z21 = z17;
                                    if (bonnetNumberToggleConfig.f2315a) {
                                        int i28 = bonnetNumberToggleConfig.b;
                                        if (iH <= bonnetNumberToggleConfig.c) {
                                            r7 = i;
                                        } else {
                                            r7 = i;
                                        }
                                    } else {
                                        r7 = i;
                                    }
                                    objectRef = new Ref.ObjectRef();
                                    AdTargetingProvider adTargetingProvider3 = routeDetailsComponent.A;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                    routeAppModel8 = routeAppModel7;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                    z21 = z21;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                    z20 = z20;
                                    routeDetailsComponent$updateInitialViewState$1.label = 7;
                                    objA6 = adTargetingProvider3.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                    coroutineSingletons5 = coroutineSingletons;
                                    if (objA6 != coroutineSingletons5) {
                                        Ref.IntRef intRef211 = intRef14;
                                        list7 = list6;
                                        r4 = r7;
                                        z22 = z20;
                                        intRef15 = intRef211;
                                        intRef16 = intRef13;
                                        objectRef2 = objectRef;
                                        z23 = z21;
                                        routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                        objA7 = (Map) objA6;
                                        r5 = r4;
                                        intRef17 = intRef16;
                                        routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                        obj6 = objA7;
                                        r22 = r5;
                                        intRef18 = intRef15;
                                        coroutineSingletons2 = coroutineSingletons5;
                                        routeAppModel9 = routeAppModel8;
                                        thA = Result.a(obj6);
                                        if (thA == null) {
                                            objD = obj6;
                                        } else {
                                            if (!(thA instanceof CancellationException)) {
                                                throw thA;
                                            }
                                            ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                            objD = MapsKt.d();
                                        }
                                        map = (Map) objD;
                                        str3 = routeAppModel9.s;
                                        if (str3 != null) {
                                            List listU4 = StringsKt.U(str3, new String[]{","}, 6);
                                            arrayList = new ArrayList(CollectionsKt.v(listU4, 10));
                                            it2 = listU4.iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                            }
                                            size = arrayList.size();
                                            i14 = i;
                                            i15 = i14;
                                            r9 = "";
                                            while (i15 < size) {
                                                obj8 = arrayList.get(i15);
                                                i15++;
                                                i16 = i14 + 1;
                                                if (i14 >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                int i29 = size;
                                                str4 = (String) obj8;
                                                ArrayList arrayList5 = arrayList;
                                                if (i14 == arrayList.size() - 1) {
                                                    str5 = r9 + str4;
                                                } else {
                                                    str5 = r9 + str4 + ", ";
                                                }
                                                r9 = str5;
                                                i14 = i16;
                                                size = i29;
                                                arrayList = arrayList5;
                                            }
                                            objectRef2.element = r9;
                                        }
                                        AppPermission[] appPermissionArr4 = new AppPermission[1];
                                        appPermissionArr4[i] = AppPermission.FINE_LOCATION;
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                        routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                        z24 = z19;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                        z25 = z15;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                        i12 = i10;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                        z26 = z23;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                        routeDetailsComponent$updateInitialViewState$1.label = 8;
                                        objG = basicInfoContract.g(appPermissionArr4, routeDetailsComponent$updateInitialViewState$1);
                                        if (objG == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        Ref.ObjectRef objectRef8 = objectRef2;
                                        list8 = list7;
                                        objectRef3 = objectRef8;
                                        obj7 = objG;
                                        routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                        z27 = z16;
                                        i13 = i11;
                                        z28 = z24;
                                        livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                        intRef19 = intRef17;
                                        z29 = z22;
                                        coroutineSingletons3 = coroutineSingletons2;
                                        map2 = map;
                                        routeAppModel10 = routeAppModel9;
                                        intRef20 = intRef18;
                                        z30 = r22 == true ? 1 : 0;
                                        z31 = z29;
                                        zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                        routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                        z32 = z27;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                        routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                        routeDetailsComponent$updateInitialViewState$1.label = 9;
                                        routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                        routeDetailsComponent = this;
                                        objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                        coroutineSingletons4 = coroutineSingletons3;
                                        if (objS == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        intRef21 = intRef20;
                                        routeAppModel11 = routeAppModel10;
                                        z33 = zBooleanValue2;
                                        z34 = z28;
                                        z35 = z32;
                                        z36 = z30;
                                        objectRef4 = objectRef3;
                                        i17 = i13;
                                        intRef22 = intRef19;
                                        routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                        map3 = map2;
                                        i18 = i12;
                                        livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                        z37 = z25;
                                        z38 = z26;
                                        z39 = z31;
                                        final boolean zBooleanValue6 = ((Boolean) objS).booleanValue();
                                        if (i18 != 0) {
                                            i19 = 1;
                                        } else {
                                            i19 = i;
                                        }
                                        final List list12 = list8;
                                        final boolean r18 = i19;
                                        routeDetailsComponent.E0(new Function1() { // from class: o31
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj10) {
                                                RouteDetailsIntentModel routeDetailsIntentModel17;
                                                RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                RouteDetailsComponent routeDetailsComponent2;
                                                Ref.IntRef intRef212;
                                                Ref.IntRef intRef213;
                                                MarkerStopType markerStopType;
                                                Object next;
                                                RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                Intrinsics.i(it3, "it");
                                                RouteAppModel routeAppModel13 = routeAppModel11;
                                                String str12 = routeAppModel13.c;
                                                List list13 = routeAppModel13.e;
                                                RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                boolean z45 = routeDetailsComponent3.o0;
                                                String str13 = "(";
                                                String strA = vo1.A(str12, z45 ? vo1.B("(", routeAppModel13.b, ")") : "");
                                                String str14 = routeAppModel13.h.b;
                                                List list14 = list13;
                                                String str15 = "";
                                                RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list14, 10));
                                                Iterator it4 = list14.iterator();
                                                int i210 = 0;
                                                while (true) {
                                                    boolean zHasNext = it4.hasNext();
                                                    RouteDetailsDataState routeDetailsDataState = it3;
                                                    RouteDetailsIntentModel routeDetailsIntentModel18 = routeDetailsIntentModel13;
                                                    String str16 = strA;
                                                    boolean z46 = z37;
                                                    Ref.IntRef intRef214 = intRef21;
                                                    boolean z47 = z45;
                                                    Ref.IntRef intRef30 = intRef22;
                                                    StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                    Object obj11 = null;
                                                    if (zHasNext) {
                                                        Object next2 = it4.next();
                                                        int i211 = i210 + 1;
                                                        if (i210 < 0) {
                                                            CollectionsKt.z0();
                                                            throw null;
                                                        }
                                                        RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                        StopAppModel stopAppModel = (StopAppModel) next2;
                                                        String str17 = str14;
                                                        Iterator it5 = it4;
                                                        boolean z48 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel18.b) && r18;
                                                        String str18 = stopAppModel.f1727a;
                                                        String strA2 = vo1.A(stopAppModel.b, z47 ? vo1.B("(", str18, ")") : str15);
                                                        int i212 = routeDetailsComponent3.h0;
                                                        boolean z49 = i212 != -1 && i210 > i212;
                                                        boolean z410 = i212 == i210;
                                                        StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                        String stopId = stopAppModel.f1727a;
                                                        int i213 = intRef214.element;
                                                        int i214 = intRef30.element;
                                                        int i30 = routeDetailsComponent3.s0;
                                                        TrackingAdditionalFeatures trackingAdditionalFeatures4 = routeDetailsIntentModel18.h;
                                                        String str19 = str15;
                                                        boolean z411 = trackingAdditionalFeatures4.l;
                                                        Iterable customStopTagInfoList = trackingAdditionalFeatures4.o;
                                                        if (customStopTagInfoList == null) {
                                                            customStopTagInfoList = EmptyList.f17557a;
                                                        }
                                                        Intrinsics.i(stopId, "stopId");
                                                        Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                        ArrayList arrayList7 = new ArrayList();
                                                        boolean z412 = z46 && i210 == i212;
                                                        if (i210 == i213) {
                                                            arrayList7.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                        } else if (i210 == i214) {
                                                            arrayList7.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                        } else if (i210 == i30 && z412) {
                                                            arrayList7.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                            arrayList7.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                        } else if (z412) {
                                                            arrayList7.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                        } else if (i210 == i30 || (i210 == i17 && z411)) {
                                                            arrayList7.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                        }
                                                        for (Object obj12 : customStopTagInfoList) {
                                                            if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                obj11 = obj12;
                                                                break;
                                                            }
                                                        }
                                                        RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                        if (routeDetailsCustomStopTagInfo != null) {
                                                            arrayList7.add(routeDetailsCustomStopTagInfo.b);
                                                        }
                                                        arrayList6.add(new RouteDetailsStopUiModel(str18, i210, strA2, false, false, z49, false, z410, stopEtaStatus, notAvailable, arrayList7, z48, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                        it3 = routeDetailsDataState;
                                                        strA = str16;
                                                        z45 = z47;
                                                        i210 = i211;
                                                        routeDetailsViewType = routeDetailsViewType2;
                                                        str14 = str17;
                                                        it4 = it5;
                                                        str15 = str19;
                                                    } else {
                                                        RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                        String str110 = str14;
                                                        String str20 = str15;
                                                        StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                        List listC1 = routeDetailsComponent3.c1();
                                                        CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                        RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                        List list15 = routeAppModel13.n;
                                                        ArrayList arrayList8 = new ArrayList(CollectionsKt.v(list15, 10));
                                                        Iterator it6 = list15.iterator();
                                                        while (it6.hasNext()) {
                                                            arrayList8.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                        }
                                                        String str21 = z34 ? routeAppModel13.j : null;
                                                        int i31 = routeDetailsComponent3.h0;
                                                        String str22 = i31 != -1 ? ((StopAppModel) list13.get(i31)).b : str20;
                                                        boolean z50 = routeDetailsIntentModel18.h.i;
                                                        String str23 = str21;
                                                        ArrayList arrayList9 = new ArrayList(CollectionsKt.v(list14, 10));
                                                        Iterator it7 = list14.iterator();
                                                        int i32 = 0;
                                                        while (true) {
                                                            boolean zHasNext2 = it7.hasNext();
                                                            Iterator it8 = it7;
                                                            boolean z51 = z38;
                                                            boolean z52 = z39;
                                                            boolean z53 = z36;
                                                            if (!zHasNext2) {
                                                                return RouteDetailsDataState.a(routeDetailsDataState, false, null, str16, str110, ((StopAppModel) list13.get(0)).b, (String) objectRef4.element, routeAppModel13.t, routeDetailsViewType3, list12, arrayList6, str22, routeDetailsMapUiModel, null, z46, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList8, str23, z50, z51, z52, arrayList9, null, z53, false, map3, "", false, null, false, null, zBooleanValue6, -1604474878, 60);
                                                            }
                                                            Object next3 = it8.next();
                                                            int i33 = i32 + 1;
                                                            if (i32 < 0) {
                                                                CollectionsKt.z0();
                                                                throw null;
                                                            }
                                                            StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                            ArrayList arrayList10 = arrayList8;
                                                            List list16 = routeDetailsIntentModel18.h.n;
                                                            if (list16 != null) {
                                                                Iterator it9 = list16.iterator();
                                                                while (true) {
                                                                    if (!it9.hasNext()) {
                                                                        routeDetailsIntentModel17 = routeDetailsIntentModel18;
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it9.next();
                                                                    routeDetailsIntentModel17 = routeDetailsIntentModel18;
                                                                    Iterator it10 = it9;
                                                                    if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                        break;
                                                                    }
                                                                    it9 = it10;
                                                                    routeDetailsIntentModel18 = routeDetailsIntentModel17;
                                                                }
                                                                routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                            } else {
                                                                routeDetailsIntentModel17 = routeDetailsIntentModel18;
                                                                routeDetailsCustomStopMarkerInfo = null;
                                                            }
                                                            if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                int iK = CollectionsKt.K(list13);
                                                                int i34 = routeDetailsComponent3.h0;
                                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                                int i35 = intRef214.element;
                                                                intRef212 = intRef214;
                                                                int i36 = intRef30.element;
                                                                intRef213 = intRef30;
                                                                boolean z54 = i34 != -1 && i32 > i34;
                                                                if (z35) {
                                                                    if (i32 == i35) {
                                                                        markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                    } else if (i32 == i36) {
                                                                        markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                    } else {
                                                                        markerStopType = (i35 + 1 > i32 || i32 >= i36) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                    }
                                                                } else if (i32 == 0) {
                                                                    markerStopType = MarkerStopType.FirstStop;
                                                                } else if (i32 == iK) {
                                                                    markerStopType = MarkerStopType.LastStop;
                                                                } else {
                                                                    markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                }
                                                            } else {
                                                                intRef212 = intRef214;
                                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                                intRef213 = intRef30;
                                                            }
                                                            MarkerStopType markerStopType2 = markerStopType;
                                                            String str24 = stopAppModel2.f1727a;
                                                            String str25 = str13;
                                                            StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                            notAvailable2 = notAvailable3;
                                                            arrayList9.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z47 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i32 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                            str13 = str25;
                                                            arrayList8 = arrayList10;
                                                            it7 = it8;
                                                            i32 = i33;
                                                            routeDetailsIntentModel18 = routeDetailsIntentModel17;
                                                            routeDetailsComponent3 = routeDetailsComponent2;
                                                            intRef214 = intRef212;
                                                            intRef30 = intRef213;
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                        if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                            RouteDetailsIntentModel routeDetailsIntentModel17 = routeDetailsComponent.X;
                                            routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel17 != null ? routeDetailsIntentModel17.e : null), routeAppModel11.b, routeAppModel11.c);
                                        } else {
                                            routeDetailsComponent.g1(z37);
                                        }
                                        routeDetailsComponent.j1();
                                        routeDetailsComponent.k0 = true;
                                        if (z35) {
                                            routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                        }
                                        return Unit.f17538a;
                                    }
                                }
                            }
                        } else {
                            String str12 = routeAppModel3.b;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel3;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel4;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef5;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef6;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list2;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z3;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                            routeDetailsComponent$updateInitialViewState$1.label = 4;
                            objA3 = routeDetailsComponent.E.a(str12, routeDetailsComponent$updateInitialViewState$1);
                            if (objA3 != coroutineSingletons5) {
                                z5 = z4;
                                obj3 = objA3;
                                routeAppModel4 = routeAppModel3;
                                routeDetailsIntentModel5 = routeDetailsIntentModel4;
                                intRef7 = intRef5;
                                intRef8 = intRef6;
                                list3 = list2;
                                z6 = z3;
                                i5 = i4;
                                z7 = zBooleanValue;
                                str = (String) obj3;
                                if (str != null) {
                                    it = routeAppModel4.e.iterator();
                                    i7 = i;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i8 = -1;
                                        } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                                            i8 = i7;
                                        } else {
                                            i7++;
                                        }
                                    }
                                    routeDetailsComponent.h0 = i8;
                                }
                                z4 = z5;
                                zBooleanValue = z7;
                                i4 = i5;
                                z8 = z6;
                                list4 = list3;
                                intRef9 = intRef8;
                                intRef10 = intRef7;
                                routeDetailsIntentModel6 = routeDetailsIntentModel5;
                                routeAppModel5 = routeAppModel4;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                                routeDetailsComponent$updateInitialViewState$1.label = 5;
                                objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                                if (objA4 != coroutineSingletons5) {
                                    boolean z45 = zBooleanValue;
                                    z9 = z4;
                                    obj4 = objA4;
                                    routeAppModel6 = routeAppModel5;
                                    routeDetailsIntentModel7 = routeDetailsIntentModel6;
                                    intRef11 = intRef10;
                                    intRef12 = intRef9;
                                    list5 = list4;
                                    z10 = z8;
                                    i6 = i4;
                                    z11 = z45;
                                    chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                        livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                    } else {
                                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        livePassengerIndicatorBottomSheetDetails = null;
                                    }
                                    str2 = routeDetailsIntentModel7.b;
                                    TrackingAdditionalFeatures trackingAdditionalFeatures4 = routeDetailsIntentModel7.h;
                                    if (str2 != null) {
                                        i9 = i;
                                    } else {
                                        i9 = i;
                                    }
                                    z12 = trackingAdditionalFeatures4.k;
                                    z13 = trackingAdditionalFeatures4.j;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                                    z14 = z9;
                                    routeDetailsComponent$updateInitialViewState$1.label = 6;
                                    objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                                    if (objA5 != coroutineSingletons5) {
                                        livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                        obj5 = objA5;
                                        list6 = list5;
                                        i10 = i9;
                                        intRef13 = intRef12;
                                        z15 = z14;
                                        coroutineSingletons = coroutineSingletons5;
                                        routeAppModel7 = routeAppModel6;
                                        z16 = z10;
                                        z17 = z12;
                                        routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                        i11 = i6;
                                        z18 = z13;
                                        Ref.IntRef intRef212 = intRef11;
                                        z19 = z11;
                                        intRef14 = intRef212;
                                        bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                        z20 = z18;
                                        iH = basicInfoContract.h();
                                        z21 = z17;
                                        if (bonnetNumberToggleConfig.f2315a) {
                                            int i210 = bonnetNumberToggleConfig.b;
                                            if (iH <= bonnetNumberToggleConfig.c) {
                                                r7 = i;
                                            } else {
                                                r7 = i;
                                            }
                                        } else {
                                            r7 = i;
                                        }
                                        objectRef = new Ref.ObjectRef();
                                        AdTargetingProvider adTargetingProvider4 = routeDetailsComponent.A;
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                        routeAppModel8 = routeAppModel7;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                        z21 = z21;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                        z20 = z20;
                                        routeDetailsComponent$updateInitialViewState$1.label = 7;
                                        objA6 = adTargetingProvider4.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                        coroutineSingletons5 = coroutineSingletons;
                                        if (objA6 != coroutineSingletons5) {
                                            Ref.IntRef intRef213 = intRef14;
                                            list7 = list6;
                                            r4 = r7;
                                            z22 = z20;
                                            intRef15 = intRef213;
                                            intRef16 = intRef13;
                                            objectRef2 = objectRef;
                                            z23 = z21;
                                            routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                            objA7 = (Map) objA6;
                                            r5 = r4;
                                            intRef17 = intRef16;
                                            routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                            obj6 = objA7;
                                            r22 = r5;
                                            intRef18 = intRef15;
                                            coroutineSingletons2 = coroutineSingletons5;
                                            routeAppModel9 = routeAppModel8;
                                            thA = Result.a(obj6);
                                            if (thA == null) {
                                                objD = obj6;
                                            } else {
                                                if (!(thA instanceof CancellationException)) {
                                                    throw thA;
                                                }
                                                ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                                objD = MapsKt.d();
                                            }
                                            map = (Map) objD;
                                            str3 = routeAppModel9.s;
                                            if (str3 != null) {
                                                List listU5 = StringsKt.U(str3, new String[]{","}, 6);
                                                arrayList = new ArrayList(CollectionsKt.v(listU5, 10));
                                                it2 = listU5.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                                }
                                                size = arrayList.size();
                                                i14 = i;
                                                i15 = i14;
                                                r9 = "";
                                                while (i15 < size) {
                                                    obj8 = arrayList.get(i15);
                                                    i15++;
                                                    i16 = i14 + 1;
                                                    if (i14 >= 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    int i211 = size;
                                                    str4 = (String) obj8;
                                                    ArrayList arrayList6 = arrayList;
                                                    if (i14 == arrayList.size() - 1) {
                                                        str5 = r9 + str4;
                                                    } else {
                                                        str5 = r9 + str4 + ", ";
                                                    }
                                                    r9 = str5;
                                                    i14 = i16;
                                                    size = i211;
                                                    arrayList = arrayList6;
                                                }
                                                objectRef2.element = r9;
                                            }
                                            AppPermission[] appPermissionArr5 = new AppPermission[1];
                                            appPermissionArr5[i] = AppPermission.FINE_LOCATION;
                                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                            routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                            routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                            routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                            z24 = z19;
                                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                            z25 = z15;
                                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                            i12 = i10;
                                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                            z26 = z23;
                                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                            routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                            routeDetailsComponent$updateInitialViewState$1.label = 8;
                                            objG = basicInfoContract.g(appPermissionArr5, routeDetailsComponent$updateInitialViewState$1);
                                            if (objG == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            Ref.ObjectRef objectRef9 = objectRef2;
                                            list8 = list7;
                                            objectRef3 = objectRef9;
                                            obj7 = objG;
                                            routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                            z27 = z16;
                                            i13 = i11;
                                            z28 = z24;
                                            livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                            intRef19 = intRef17;
                                            z29 = z22;
                                            coroutineSingletons3 = coroutineSingletons2;
                                            map2 = map;
                                            routeAppModel10 = routeAppModel9;
                                            intRef20 = intRef18;
                                            z30 = r22 == true ? 1 : 0;
                                            z31 = z29;
                                            zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                            routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                            routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                            routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                            z32 = z27;
                                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                            routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                            routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                            routeDetailsComponent$updateInitialViewState$1.label = 9;
                                            routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                            routeDetailsComponent = this;
                                            objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                            coroutineSingletons4 = coroutineSingletons3;
                                            if (objS == coroutineSingletons4) {
                                                return coroutineSingletons4;
                                            }
                                            intRef21 = intRef20;
                                            routeAppModel11 = routeAppModel10;
                                            z33 = zBooleanValue2;
                                            z34 = z28;
                                            z35 = z32;
                                            z36 = z30;
                                            objectRef4 = objectRef3;
                                            i17 = i13;
                                            intRef22 = intRef19;
                                            routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                            map3 = map2;
                                            i18 = i12;
                                            livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                            z37 = z25;
                                            z38 = z26;
                                            z39 = z31;
                                            final boolean zBooleanValue7 = ((Boolean) objS).booleanValue();
                                            if (i18 != 0) {
                                                i19 = 1;
                                            } else {
                                                i19 = i;
                                            }
                                            final List list13 = list8;
                                            final boolean r19 = i19;
                                            routeDetailsComponent.E0(new Function1() { // from class: o31
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    RouteDetailsIntentModel routeDetailsIntentModel18;
                                                    RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                    RouteDetailsComponent routeDetailsComponent2;
                                                    Ref.IntRef intRef214;
                                                    Ref.IntRef intRef215;
                                                    MarkerStopType markerStopType;
                                                    Object next;
                                                    RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                    Intrinsics.i(it3, "it");
                                                    RouteAppModel routeAppModel13 = routeAppModel11;
                                                    String str13 = routeAppModel13.c;
                                                    List list14 = routeAppModel13.e;
                                                    RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                    boolean z46 = routeDetailsComponent3.o0;
                                                    String str14 = "(";
                                                    String strA = vo1.A(str13, z46 ? vo1.B("(", routeAppModel13.b, ")") : "");
                                                    String str15 = routeAppModel13.h.b;
                                                    List list15 = list14;
                                                    String str16 = "";
                                                    RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                    ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list15, 10));
                                                    Iterator it4 = list15.iterator();
                                                    int i212 = 0;
                                                    while (true) {
                                                        boolean zHasNext = it4.hasNext();
                                                        RouteDetailsDataState routeDetailsDataState = it3;
                                                        RouteDetailsIntentModel routeDetailsIntentModel19 = routeDetailsIntentModel13;
                                                        String str17 = strA;
                                                        boolean z47 = z37;
                                                        Ref.IntRef intRef216 = intRef21;
                                                        boolean z48 = z46;
                                                        Ref.IntRef intRef30 = intRef22;
                                                        StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                        Object obj11 = null;
                                                        if (zHasNext) {
                                                            Object next2 = it4.next();
                                                            int i213 = i212 + 1;
                                                            if (i212 < 0) {
                                                                CollectionsKt.z0();
                                                                throw null;
                                                            }
                                                            RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                            StopAppModel stopAppModel = (StopAppModel) next2;
                                                            String str18 = str15;
                                                            Iterator it5 = it4;
                                                            boolean z49 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel19.b) && r19;
                                                            String str19 = stopAppModel.f1727a;
                                                            String strA2 = vo1.A(stopAppModel.b, z48 ? vo1.B("(", str19, ")") : str16);
                                                            int i214 = routeDetailsComponent3.h0;
                                                            boolean z410 = i214 != -1 && i212 > i214;
                                                            boolean z411 = i214 == i212;
                                                            StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                            String stopId = stopAppModel.f1727a;
                                                            int i215 = intRef216.element;
                                                            int i216 = intRef30.element;
                                                            int i30 = routeDetailsComponent3.s0;
                                                            TrackingAdditionalFeatures trackingAdditionalFeatures5 = routeDetailsIntentModel19.h;
                                                            String str110 = str16;
                                                            boolean z412 = trackingAdditionalFeatures5.l;
                                                            Iterable customStopTagInfoList = trackingAdditionalFeatures5.o;
                                                            if (customStopTagInfoList == null) {
                                                                customStopTagInfoList = EmptyList.f17557a;
                                                            }
                                                            Intrinsics.i(stopId, "stopId");
                                                            Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                            ArrayList arrayList8 = new ArrayList();
                                                            boolean z413 = z47 && i212 == i214;
                                                            if (i212 == i215) {
                                                                arrayList8.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                            } else if (i212 == i216) {
                                                                arrayList8.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                            } else if (i212 == i30 && z413) {
                                                                arrayList8.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                                arrayList8.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                            } else if (z413) {
                                                                arrayList8.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                            } else if (i212 == i30 || (i212 == i17 && z412)) {
                                                                arrayList8.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                            }
                                                            for (Object obj12 : customStopTagInfoList) {
                                                                if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                    obj11 = obj12;
                                                                    break;
                                                                }
                                                            }
                                                            RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                            if (routeDetailsCustomStopTagInfo != null) {
                                                                arrayList8.add(routeDetailsCustomStopTagInfo.b);
                                                            }
                                                            arrayList7.add(new RouteDetailsStopUiModel(str19, i212, strA2, false, false, z410, false, z411, stopEtaStatus, notAvailable, arrayList8, z49, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                            it3 = routeDetailsDataState;
                                                            strA = str17;
                                                            z46 = z48;
                                                            i212 = i213;
                                                            routeDetailsViewType = routeDetailsViewType2;
                                                            str15 = str18;
                                                            it4 = it5;
                                                            str16 = str110;
                                                        } else {
                                                            RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                            String str111 = str15;
                                                            String str20 = str16;
                                                            StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                            List listC1 = routeDetailsComponent3.c1();
                                                            CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                            RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                            List list16 = routeAppModel13.n;
                                                            ArrayList arrayList9 = new ArrayList(CollectionsKt.v(list16, 10));
                                                            Iterator it6 = list16.iterator();
                                                            while (it6.hasNext()) {
                                                                arrayList9.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                            }
                                                            String str21 = z34 ? routeAppModel13.j : null;
                                                            int i31 = routeDetailsComponent3.h0;
                                                            String str22 = i31 != -1 ? ((StopAppModel) list14.get(i31)).b : str20;
                                                            boolean z50 = routeDetailsIntentModel19.h.i;
                                                            String str23 = str21;
                                                            ArrayList arrayList10 = new ArrayList(CollectionsKt.v(list15, 10));
                                                            Iterator it7 = list15.iterator();
                                                            int i32 = 0;
                                                            while (true) {
                                                                boolean zHasNext2 = it7.hasNext();
                                                                Iterator it8 = it7;
                                                                boolean z51 = z38;
                                                                boolean z52 = z39;
                                                                boolean z53 = z36;
                                                                if (!zHasNext2) {
                                                                    return RouteDetailsDataState.a(routeDetailsDataState, false, null, str17, str111, ((StopAppModel) list14.get(0)).b, (String) objectRef4.element, routeAppModel13.t, routeDetailsViewType3, list13, arrayList7, str22, routeDetailsMapUiModel, null, z47, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList9, str23, z50, z51, z52, arrayList10, null, z53, false, map3, "", false, null, false, null, zBooleanValue7, -1604474878, 60);
                                                                }
                                                                Object next3 = it8.next();
                                                                int i33 = i32 + 1;
                                                                if (i32 < 0) {
                                                                    CollectionsKt.z0();
                                                                    throw null;
                                                                }
                                                                StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                                ArrayList arrayList11 = arrayList9;
                                                                List list17 = routeDetailsIntentModel19.h.n;
                                                                if (list17 != null) {
                                                                    Iterator it9 = list17.iterator();
                                                                    while (true) {
                                                                        if (!it9.hasNext()) {
                                                                            routeDetailsIntentModel18 = routeDetailsIntentModel19;
                                                                            next = null;
                                                                            break;
                                                                        }
                                                                        next = it9.next();
                                                                        routeDetailsIntentModel18 = routeDetailsIntentModel19;
                                                                        Iterator it10 = it9;
                                                                        if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                            break;
                                                                        }
                                                                        it9 = it10;
                                                                        routeDetailsIntentModel19 = routeDetailsIntentModel18;
                                                                    }
                                                                    routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                                } else {
                                                                    routeDetailsIntentModel18 = routeDetailsIntentModel19;
                                                                    routeDetailsCustomStopMarkerInfo = null;
                                                                }
                                                                if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                    int iK = CollectionsKt.K(list14);
                                                                    int i34 = routeDetailsComponent3.h0;
                                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                                    int i35 = intRef216.element;
                                                                    intRef214 = intRef216;
                                                                    int i36 = intRef30.element;
                                                                    intRef215 = intRef30;
                                                                    boolean z54 = i34 != -1 && i32 > i34;
                                                                    if (z35) {
                                                                        if (i32 == i35) {
                                                                            markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                        } else if (i32 == i36) {
                                                                            markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                        } else {
                                                                            markerStopType = (i35 + 1 > i32 || i32 >= i36) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                        }
                                                                    } else if (i32 == 0) {
                                                                        markerStopType = MarkerStopType.FirstStop;
                                                                    } else if (i32 == iK) {
                                                                        markerStopType = MarkerStopType.LastStop;
                                                                    } else {
                                                                        markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                    }
                                                                } else {
                                                                    intRef214 = intRef216;
                                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                                    intRef215 = intRef30;
                                                                }
                                                                MarkerStopType markerStopType2 = markerStopType;
                                                                String str24 = stopAppModel2.f1727a;
                                                                String str25 = str14;
                                                                StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                                notAvailable2 = notAvailable3;
                                                                arrayList10.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z48 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i32 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                                str14 = str25;
                                                                arrayList9 = arrayList11;
                                                                it7 = it8;
                                                                i32 = i33;
                                                                routeDetailsIntentModel19 = routeDetailsIntentModel18;
                                                                routeDetailsComponent3 = routeDetailsComponent2;
                                                                intRef216 = intRef214;
                                                                intRef30 = intRef215;
                                                            }
                                                        }
                                                    }
                                                }
                                            });
                                            if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                                RouteDetailsIntentModel routeDetailsIntentModel18 = routeDetailsComponent.X;
                                                routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel18 != null ? routeDetailsIntentModel18.e : null), routeAppModel11.b, routeAppModel11.c);
                                            } else {
                                                routeDetailsComponent.g1(z37);
                                            }
                                            routeDetailsComponent.j1();
                                            routeDetailsComponent.k0 = true;
                                            if (z35) {
                                                routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                            }
                                            return Unit.f17538a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons5;
            case 2:
                i = 0;
                int i30 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z46 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                Ref.IntRef intRef30 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef31 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel19 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel13 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeAppModel2 = routeAppModel13;
                routeDetailsIntentModel3 = routeDetailsIntentModel19;
                intRef3 = intRef31;
                intRef4 = intRef30;
                z2 = z46;
                i3 = i30;
                obj = obj9;
                list = (List) obj;
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel2;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel3;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef3;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef4;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z2;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i3;
                routeDetailsComponent$updateInitialViewState$1.label = 3;
                objA2 = routeDetailsComponent.C.a(routeDetailsComponent$updateInitialViewState$1);
                if (objA2 != coroutineSingletons5) {
                    routeAppModel3 = routeAppModel2;
                    intRef5 = intRef3;
                    list2 = list;
                    obj2 = objA2;
                    routeDetailsIntentModel4 = routeDetailsIntentModel3;
                    intRef6 = intRef4;
                    z3 = z2;
                    i4 = i3;
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                    z4 = routeAppModel3.q;
                    if (z4) {
                        routeDetailsComponent.h0 = CollectionsKt.K(routeAppModel3.e);
                        z8 = z3;
                        list4 = list2;
                        intRef9 = intRef6;
                        intRef10 = intRef5;
                        routeDetailsIntentModel6 = routeDetailsIntentModel4;
                        routeAppModel5 = routeAppModel3;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                        routeDetailsComponent$updateInitialViewState$1.label = 5;
                        objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                        if (objA4 != coroutineSingletons5) {
                            boolean z47 = zBooleanValue;
                            z9 = z4;
                            obj4 = objA4;
                            routeAppModel6 = routeAppModel5;
                            routeDetailsIntentModel7 = routeDetailsIntentModel6;
                            intRef11 = intRef10;
                            intRef12 = intRef9;
                            list5 = list4;
                            z10 = z8;
                            i6 = i4;
                            z11 = z47;
                            chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                            } else {
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                livePassengerIndicatorBottomSheetDetails = null;
                            }
                            str2 = routeDetailsIntentModel7.b;
                            TrackingAdditionalFeatures trackingAdditionalFeatures5 = routeDetailsIntentModel7.h;
                            if (str2 != null) {
                                i9 = i;
                            } else {
                                i9 = i;
                            }
                            z12 = trackingAdditionalFeatures5.k;
                            z13 = trackingAdditionalFeatures5.j;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                            routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                            z14 = z9;
                            routeDetailsComponent$updateInitialViewState$1.label = 6;
                            objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                            if (objA5 != coroutineSingletons5) {
                                livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                obj5 = objA5;
                                list6 = list5;
                                i10 = i9;
                                intRef13 = intRef12;
                                z15 = z14;
                                coroutineSingletons = coroutineSingletons5;
                                routeAppModel7 = routeAppModel6;
                                z16 = z10;
                                z17 = z12;
                                routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                i11 = i6;
                                z18 = z13;
                                Ref.IntRef intRef214 = intRef11;
                                z19 = z11;
                                intRef14 = intRef214;
                                bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                z20 = z18;
                                iH = basicInfoContract.h();
                                z21 = z17;
                                if (bonnetNumberToggleConfig.f2315a) {
                                    int i212 = bonnetNumberToggleConfig.b;
                                    if (iH <= bonnetNumberToggleConfig.c) {
                                        r7 = i;
                                    } else {
                                        r7 = i;
                                    }
                                } else {
                                    r7 = i;
                                }
                                objectRef = new Ref.ObjectRef();
                                AdTargetingProvider adTargetingProvider5 = routeDetailsComponent.A;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                routeAppModel8 = routeAppModel7;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                z21 = z21;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                z20 = z20;
                                routeDetailsComponent$updateInitialViewState$1.label = 7;
                                objA6 = adTargetingProvider5.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                coroutineSingletons5 = coroutineSingletons;
                                if (objA6 != coroutineSingletons5) {
                                    Ref.IntRef intRef215 = intRef14;
                                    list7 = list6;
                                    r4 = r7;
                                    z22 = z20;
                                    intRef15 = intRef215;
                                    intRef16 = intRef13;
                                    objectRef2 = objectRef;
                                    z23 = z21;
                                    routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                    objA7 = (Map) objA6;
                                    r5 = r4;
                                    intRef17 = intRef16;
                                    routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                    obj6 = objA7;
                                    r22 = r5;
                                    intRef18 = intRef15;
                                    coroutineSingletons2 = coroutineSingletons5;
                                    routeAppModel9 = routeAppModel8;
                                    thA = Result.a(obj6);
                                    if (thA == null) {
                                        objD = obj6;
                                    } else {
                                        if (!(thA instanceof CancellationException)) {
                                            throw thA;
                                        }
                                        ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                        objD = MapsKt.d();
                                    }
                                    map = (Map) objD;
                                    str3 = routeAppModel9.s;
                                    if (str3 != null) {
                                        List listU6 = StringsKt.U(str3, new String[]{","}, 6);
                                        arrayList = new ArrayList(CollectionsKt.v(listU6, 10));
                                        it2 = listU6.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                        }
                                        size = arrayList.size();
                                        i14 = i;
                                        i15 = i14;
                                        r9 = "";
                                        while (i15 < size) {
                                            obj8 = arrayList.get(i15);
                                            i15++;
                                            i16 = i14 + 1;
                                            if (i14 >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            int i213 = size;
                                            str4 = (String) obj8;
                                            ArrayList arrayList7 = arrayList;
                                            if (i14 == arrayList.size() - 1) {
                                                str5 = r9 + str4;
                                            } else {
                                                str5 = r9 + str4 + ", ";
                                            }
                                            r9 = str5;
                                            i14 = i16;
                                            size = i213;
                                            arrayList = arrayList7;
                                        }
                                        objectRef2.element = r9;
                                    }
                                    AppPermission[] appPermissionArr6 = new AppPermission[1];
                                    appPermissionArr6[i] = AppPermission.FINE_LOCATION;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                    z24 = z19;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                    z25 = z15;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                    i12 = i10;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                    z26 = z23;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                    routeDetailsComponent$updateInitialViewState$1.label = 8;
                                    objG = basicInfoContract.g(appPermissionArr6, routeDetailsComponent$updateInitialViewState$1);
                                    if (objG == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    Ref.ObjectRef objectRef10 = objectRef2;
                                    list8 = list7;
                                    objectRef3 = objectRef10;
                                    obj7 = objG;
                                    routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                    z27 = z16;
                                    i13 = i11;
                                    z28 = z24;
                                    livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                    intRef19 = intRef17;
                                    z29 = z22;
                                    coroutineSingletons3 = coroutineSingletons2;
                                    map2 = map;
                                    routeAppModel10 = routeAppModel9;
                                    intRef20 = intRef18;
                                    z30 = r22 == true ? 1 : 0;
                                    z31 = z29;
                                    zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                    z32 = z27;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                    routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                    routeDetailsComponent$updateInitialViewState$1.label = 9;
                                    routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                    routeDetailsComponent = this;
                                    objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (objS == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    intRef21 = intRef20;
                                    routeAppModel11 = routeAppModel10;
                                    z33 = zBooleanValue2;
                                    z34 = z28;
                                    z35 = z32;
                                    z36 = z30;
                                    objectRef4 = objectRef3;
                                    i17 = i13;
                                    intRef22 = intRef19;
                                    routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                    map3 = map2;
                                    i18 = i12;
                                    livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                    z37 = z25;
                                    z38 = z26;
                                    z39 = z31;
                                    final boolean zBooleanValue8 = ((Boolean) objS).booleanValue();
                                    if (i18 != 0) {
                                        i19 = 1;
                                    } else {
                                        i19 = i;
                                    }
                                    final List list14 = list8;
                                    final boolean r110 = i19;
                                    routeDetailsComponent.E0(new Function1() { // from class: o31
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj10) {
                                            RouteDetailsIntentModel routeDetailsIntentModel110;
                                            RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                            RouteDetailsComponent routeDetailsComponent2;
                                            Ref.IntRef intRef216;
                                            Ref.IntRef intRef217;
                                            MarkerStopType markerStopType;
                                            Object next;
                                            RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                            Intrinsics.i(it3, "it");
                                            RouteAppModel routeAppModel14 = routeAppModel11;
                                            String str13 = routeAppModel14.c;
                                            List list15 = routeAppModel14.e;
                                            RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                            boolean z48 = routeDetailsComponent3.o0;
                                            String str14 = "(";
                                            String strA = vo1.A(str13, z48 ? vo1.B("(", routeAppModel14.b, ")") : "");
                                            String str15 = routeAppModel14.h.b;
                                            List list16 = list15;
                                            String str16 = "";
                                            RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                            ArrayList arrayList8 = new ArrayList(CollectionsKt.v(list16, 10));
                                            Iterator it4 = list16.iterator();
                                            int i214 = 0;
                                            while (true) {
                                                boolean zHasNext = it4.hasNext();
                                                RouteDetailsDataState routeDetailsDataState = it3;
                                                RouteDetailsIntentModel routeDetailsIntentModel111 = routeDetailsIntentModel13;
                                                String str17 = strA;
                                                boolean z49 = z37;
                                                Ref.IntRef intRef218 = intRef21;
                                                boolean z410 = z48;
                                                Ref.IntRef intRef32 = intRef22;
                                                StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                Object obj11 = null;
                                                if (zHasNext) {
                                                    Object next2 = it4.next();
                                                    int i215 = i214 + 1;
                                                    if (i214 < 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                    StopAppModel stopAppModel = (StopAppModel) next2;
                                                    String str18 = str15;
                                                    Iterator it5 = it4;
                                                    boolean z411 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel111.b) && r110;
                                                    String str19 = stopAppModel.f1727a;
                                                    String strA2 = vo1.A(stopAppModel.b, z410 ? vo1.B("(", str19, ")") : str16);
                                                    int i216 = routeDetailsComponent3.h0;
                                                    boolean z412 = i216 != -1 && i214 > i216;
                                                    boolean z413 = i216 == i214;
                                                    StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                    String stopId = stopAppModel.f1727a;
                                                    int i217 = intRef218.element;
                                                    int i218 = intRef32.element;
                                                    int i31 = routeDetailsComponent3.s0;
                                                    TrackingAdditionalFeatures trackingAdditionalFeatures6 = routeDetailsIntentModel111.h;
                                                    String str110 = str16;
                                                    boolean z414 = trackingAdditionalFeatures6.l;
                                                    Iterable customStopTagInfoList = trackingAdditionalFeatures6.o;
                                                    if (customStopTagInfoList == null) {
                                                        customStopTagInfoList = EmptyList.f17557a;
                                                    }
                                                    Intrinsics.i(stopId, "stopId");
                                                    Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                    ArrayList arrayList9 = new ArrayList();
                                                    boolean z415 = z49 && i214 == i216;
                                                    if (i214 == i217) {
                                                        arrayList9.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                    } else if (i214 == i218) {
                                                        arrayList9.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                    } else if (i214 == i31 && z415) {
                                                        arrayList9.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                        arrayList9.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                    } else if (z415) {
                                                        arrayList9.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                    } else if (i214 == i31 || (i214 == i17 && z414)) {
                                                        arrayList9.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                    }
                                                    for (Object obj12 : customStopTagInfoList) {
                                                        if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                            obj11 = obj12;
                                                            break;
                                                        }
                                                    }
                                                    RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                    if (routeDetailsCustomStopTagInfo != null) {
                                                        arrayList9.add(routeDetailsCustomStopTagInfo.b);
                                                    }
                                                    arrayList8.add(new RouteDetailsStopUiModel(str19, i214, strA2, false, false, z412, false, z413, stopEtaStatus, notAvailable, arrayList9, z411, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                    it3 = routeDetailsDataState;
                                                    strA = str17;
                                                    z48 = z410;
                                                    i214 = i215;
                                                    routeDetailsViewType = routeDetailsViewType2;
                                                    str15 = str18;
                                                    it4 = it5;
                                                    str16 = str110;
                                                } else {
                                                    RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                    String str111 = str15;
                                                    String str20 = str16;
                                                    StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                    List listC1 = routeDetailsComponent3.c1();
                                                    CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                    RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                    List list17 = routeAppModel14.n;
                                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.v(list17, 10));
                                                    Iterator it6 = list17.iterator();
                                                    while (it6.hasNext()) {
                                                        arrayList10.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                    }
                                                    String str21 = z34 ? routeAppModel14.j : null;
                                                    int i32 = routeDetailsComponent3.h0;
                                                    String str22 = i32 != -1 ? ((StopAppModel) list15.get(i32)).b : str20;
                                                    boolean z50 = routeDetailsIntentModel111.h.i;
                                                    String str23 = str21;
                                                    ArrayList arrayList11 = new ArrayList(CollectionsKt.v(list16, 10));
                                                    Iterator it7 = list16.iterator();
                                                    int i33 = 0;
                                                    while (true) {
                                                        boolean zHasNext2 = it7.hasNext();
                                                        Iterator it8 = it7;
                                                        boolean z51 = z38;
                                                        boolean z52 = z39;
                                                        boolean z53 = z36;
                                                        if (!zHasNext2) {
                                                            return RouteDetailsDataState.a(routeDetailsDataState, false, null, str17, str111, ((StopAppModel) list15.get(0)).b, (String) objectRef4.element, routeAppModel14.t, routeDetailsViewType3, list14, arrayList8, str22, routeDetailsMapUiModel, null, z49, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList10, str23, z50, z51, z52, arrayList11, null, z53, false, map3, "", false, null, false, null, zBooleanValue8, -1604474878, 60);
                                                        }
                                                        Object next3 = it8.next();
                                                        int i34 = i33 + 1;
                                                        if (i33 < 0) {
                                                            CollectionsKt.z0();
                                                            throw null;
                                                        }
                                                        StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                        ArrayList arrayList12 = arrayList10;
                                                        List list18 = routeDetailsIntentModel111.h.n;
                                                        if (list18 != null) {
                                                            Iterator it9 = list18.iterator();
                                                            while (true) {
                                                                if (!it9.hasNext()) {
                                                                    routeDetailsIntentModel110 = routeDetailsIntentModel111;
                                                                    next = null;
                                                                    break;
                                                                }
                                                                next = it9.next();
                                                                routeDetailsIntentModel110 = routeDetailsIntentModel111;
                                                                Iterator it10 = it9;
                                                                if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                    break;
                                                                }
                                                                it9 = it10;
                                                                routeDetailsIntentModel111 = routeDetailsIntentModel110;
                                                            }
                                                            routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                        } else {
                                                            routeDetailsIntentModel110 = routeDetailsIntentModel111;
                                                            routeDetailsCustomStopMarkerInfo = null;
                                                        }
                                                        if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                            int iK = CollectionsKt.K(list15);
                                                            int i35 = routeDetailsComponent3.h0;
                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                            int i36 = intRef218.element;
                                                            intRef216 = intRef218;
                                                            int i37 = intRef32.element;
                                                            intRef217 = intRef32;
                                                            boolean z54 = i35 != -1 && i33 > i35;
                                                            if (z35) {
                                                                if (i33 == i36) {
                                                                    markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                } else if (i33 == i37) {
                                                                    markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                } else {
                                                                    markerStopType = (i36 + 1 > i33 || i33 >= i37) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                }
                                                            } else if (i33 == 0) {
                                                                markerStopType = MarkerStopType.FirstStop;
                                                            } else if (i33 == iK) {
                                                                markerStopType = MarkerStopType.LastStop;
                                                            } else {
                                                                markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                            }
                                                        } else {
                                                            intRef216 = intRef218;
                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                            intRef217 = intRef32;
                                                        }
                                                        MarkerStopType markerStopType2 = markerStopType;
                                                        String str24 = stopAppModel2.f1727a;
                                                        String str25 = str14;
                                                        StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                        notAvailable2 = notAvailable3;
                                                        arrayList11.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z410 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i33 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                        str14 = str25;
                                                        arrayList10 = arrayList12;
                                                        it7 = it8;
                                                        i33 = i34;
                                                        routeDetailsIntentModel111 = routeDetailsIntentModel110;
                                                        routeDetailsComponent3 = routeDetailsComponent2;
                                                        intRef218 = intRef216;
                                                        intRef32 = intRef217;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                    if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                        RouteDetailsIntentModel routeDetailsIntentModel110 = routeDetailsComponent.X;
                                        routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel110 != null ? routeDetailsIntentModel110.e : null), routeAppModel11.b, routeAppModel11.c);
                                    } else {
                                        routeDetailsComponent.g1(z37);
                                    }
                                    routeDetailsComponent.j1();
                                    routeDetailsComponent.k0 = true;
                                    if (z35) {
                                        routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    } else {
                        String str13 = routeAppModel3.b;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel3;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel4;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef5;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef6;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list2;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z3;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                        routeDetailsComponent$updateInitialViewState$1.label = 4;
                        objA3 = routeDetailsComponent.E.a(str13, routeDetailsComponent$updateInitialViewState$1);
                        if (objA3 != coroutineSingletons5) {
                            z5 = z4;
                            obj3 = objA3;
                            routeAppModel4 = routeAppModel3;
                            routeDetailsIntentModel5 = routeDetailsIntentModel4;
                            intRef7 = intRef5;
                            intRef8 = intRef6;
                            list3 = list2;
                            z6 = z3;
                            i5 = i4;
                            z7 = zBooleanValue;
                            str = (String) obj3;
                            if (str != null) {
                                it = routeAppModel4.e.iterator();
                                i7 = i;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i8 = -1;
                                    } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                                        i8 = i7;
                                    } else {
                                        i7++;
                                    }
                                }
                                routeDetailsComponent.h0 = i8;
                            }
                            z4 = z5;
                            zBooleanValue = z7;
                            i4 = i5;
                            z8 = z6;
                            list4 = list3;
                            intRef9 = intRef8;
                            intRef10 = intRef7;
                            routeDetailsIntentModel6 = routeDetailsIntentModel5;
                            routeAppModel5 = routeAppModel4;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                            routeDetailsComponent$updateInitialViewState$1.label = 5;
                            objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                            if (objA4 != coroutineSingletons5) {
                                boolean z48 = zBooleanValue;
                                z9 = z4;
                                obj4 = objA4;
                                routeAppModel6 = routeAppModel5;
                                routeDetailsIntentModel7 = routeDetailsIntentModel6;
                                intRef11 = intRef10;
                                intRef12 = intRef9;
                                list5 = list4;
                                z10 = z8;
                                i6 = i4;
                                z11 = z48;
                                chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                    livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                } else {
                                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    livePassengerIndicatorBottomSheetDetails = null;
                                }
                                str2 = routeDetailsIntentModel7.b;
                                TrackingAdditionalFeatures trackingAdditionalFeatures6 = routeDetailsIntentModel7.h;
                                if (str2 != null) {
                                    i9 = i;
                                } else {
                                    i9 = i;
                                }
                                z12 = trackingAdditionalFeatures6.k;
                                z13 = trackingAdditionalFeatures6.j;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                                z14 = z9;
                                routeDetailsComponent$updateInitialViewState$1.label = 6;
                                objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                                if (objA5 != coroutineSingletons5) {
                                    livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                    obj5 = objA5;
                                    list6 = list5;
                                    i10 = i9;
                                    intRef13 = intRef12;
                                    z15 = z14;
                                    coroutineSingletons = coroutineSingletons5;
                                    routeAppModel7 = routeAppModel6;
                                    z16 = z10;
                                    z17 = z12;
                                    routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                    i11 = i6;
                                    z18 = z13;
                                    Ref.IntRef intRef216 = intRef11;
                                    z19 = z11;
                                    intRef14 = intRef216;
                                    bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                    z20 = z18;
                                    iH = basicInfoContract.h();
                                    z21 = z17;
                                    if (bonnetNumberToggleConfig.f2315a) {
                                        int i214 = bonnetNumberToggleConfig.b;
                                        if (iH <= bonnetNumberToggleConfig.c) {
                                            r7 = i;
                                        } else {
                                            r7 = i;
                                        }
                                    } else {
                                        r7 = i;
                                    }
                                    objectRef = new Ref.ObjectRef();
                                    AdTargetingProvider adTargetingProvider6 = routeDetailsComponent.A;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                    routeAppModel8 = routeAppModel7;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                    z21 = z21;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                    z20 = z20;
                                    routeDetailsComponent$updateInitialViewState$1.label = 7;
                                    objA6 = adTargetingProvider6.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                    coroutineSingletons5 = coroutineSingletons;
                                    if (objA6 != coroutineSingletons5) {
                                        Ref.IntRef intRef217 = intRef14;
                                        list7 = list6;
                                        r4 = r7;
                                        z22 = z20;
                                        intRef15 = intRef217;
                                        intRef16 = intRef13;
                                        objectRef2 = objectRef;
                                        z23 = z21;
                                        routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                        objA7 = (Map) objA6;
                                        r5 = r4;
                                        intRef17 = intRef16;
                                        routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                        obj6 = objA7;
                                        r22 = r5;
                                        intRef18 = intRef15;
                                        coroutineSingletons2 = coroutineSingletons5;
                                        routeAppModel9 = routeAppModel8;
                                        thA = Result.a(obj6);
                                        if (thA == null) {
                                            objD = obj6;
                                        } else {
                                            if (!(thA instanceof CancellationException)) {
                                                throw thA;
                                            }
                                            ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                            objD = MapsKt.d();
                                        }
                                        map = (Map) objD;
                                        str3 = routeAppModel9.s;
                                        if (str3 != null) {
                                            List listU7 = StringsKt.U(str3, new String[]{","}, 6);
                                            arrayList = new ArrayList(CollectionsKt.v(listU7, 10));
                                            it2 = listU7.iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                            }
                                            size = arrayList.size();
                                            i14 = i;
                                            i15 = i14;
                                            r9 = "";
                                            while (i15 < size) {
                                                obj8 = arrayList.get(i15);
                                                i15++;
                                                i16 = i14 + 1;
                                                if (i14 >= 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                int i215 = size;
                                                str4 = (String) obj8;
                                                ArrayList arrayList8 = arrayList;
                                                if (i14 == arrayList.size() - 1) {
                                                    str5 = r9 + str4;
                                                } else {
                                                    str5 = r9 + str4 + ", ";
                                                }
                                                r9 = str5;
                                                i14 = i16;
                                                size = i215;
                                                arrayList = arrayList8;
                                            }
                                            objectRef2.element = r9;
                                        }
                                        AppPermission[] appPermissionArr7 = new AppPermission[1];
                                        appPermissionArr7[i] = AppPermission.FINE_LOCATION;
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                        routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                        z24 = z19;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                        z25 = z15;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                        i12 = i10;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                        z26 = z23;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                        routeDetailsComponent$updateInitialViewState$1.label = 8;
                                        objG = basicInfoContract.g(appPermissionArr7, routeDetailsComponent$updateInitialViewState$1);
                                        if (objG == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        Ref.ObjectRef objectRef11 = objectRef2;
                                        list8 = list7;
                                        objectRef3 = objectRef11;
                                        obj7 = objG;
                                        routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                        z27 = z16;
                                        i13 = i11;
                                        z28 = z24;
                                        livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                        intRef19 = intRef17;
                                        z29 = z22;
                                        coroutineSingletons3 = coroutineSingletons2;
                                        map2 = map;
                                        routeAppModel10 = routeAppModel9;
                                        intRef20 = intRef18;
                                        z30 = r22 == true ? 1 : 0;
                                        z31 = z29;
                                        zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                        routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                        routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                        routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                        z32 = z27;
                                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                        routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                        routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                        routeDetailsComponent$updateInitialViewState$1.label = 9;
                                        routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                        routeDetailsComponent = this;
                                        objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                        coroutineSingletons4 = coroutineSingletons3;
                                        if (objS == coroutineSingletons4) {
                                            return coroutineSingletons4;
                                        }
                                        intRef21 = intRef20;
                                        routeAppModel11 = routeAppModel10;
                                        z33 = zBooleanValue2;
                                        z34 = z28;
                                        z35 = z32;
                                        z36 = z30;
                                        objectRef4 = objectRef3;
                                        i17 = i13;
                                        intRef22 = intRef19;
                                        routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                        map3 = map2;
                                        i18 = i12;
                                        livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                        z37 = z25;
                                        z38 = z26;
                                        z39 = z31;
                                        final boolean zBooleanValue9 = ((Boolean) objS).booleanValue();
                                        if (i18 != 0) {
                                            i19 = 1;
                                        } else {
                                            i19 = i;
                                        }
                                        final List list15 = list8;
                                        final boolean r111 = i19;
                                        routeDetailsComponent.E0(new Function1() { // from class: o31
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj10) {
                                                RouteDetailsIntentModel routeDetailsIntentModel111;
                                                RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                                RouteDetailsComponent routeDetailsComponent2;
                                                Ref.IntRef intRef218;
                                                Ref.IntRef intRef219;
                                                MarkerStopType markerStopType;
                                                Object next;
                                                RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                                Intrinsics.i(it3, "it");
                                                RouteAppModel routeAppModel14 = routeAppModel11;
                                                String str14 = routeAppModel14.c;
                                                List list16 = routeAppModel14.e;
                                                RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                                boolean z49 = routeDetailsComponent3.o0;
                                                String str15 = "(";
                                                String strA = vo1.A(str14, z49 ? vo1.B("(", routeAppModel14.b, ")") : "");
                                                String str16 = routeAppModel14.h.b;
                                                List list17 = list16;
                                                String str17 = "";
                                                RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                                ArrayList arrayList9 = new ArrayList(CollectionsKt.v(list17, 10));
                                                Iterator it4 = list17.iterator();
                                                int i216 = 0;
                                                while (true) {
                                                    boolean zHasNext = it4.hasNext();
                                                    RouteDetailsDataState routeDetailsDataState = it3;
                                                    RouteDetailsIntentModel routeDetailsIntentModel112 = routeDetailsIntentModel13;
                                                    String str18 = strA;
                                                    boolean z410 = z37;
                                                    Ref.IntRef intRef2110 = intRef21;
                                                    boolean z411 = z49;
                                                    Ref.IntRef intRef32 = intRef22;
                                                    StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                    Object obj11 = null;
                                                    if (zHasNext) {
                                                        Object next2 = it4.next();
                                                        int i217 = i216 + 1;
                                                        if (i216 < 0) {
                                                            CollectionsKt.z0();
                                                            throw null;
                                                        }
                                                        RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                        StopAppModel stopAppModel = (StopAppModel) next2;
                                                        String str19 = str16;
                                                        Iterator it5 = it4;
                                                        boolean z412 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel112.b) && r111;
                                                        String str110 = stopAppModel.f1727a;
                                                        String strA2 = vo1.A(stopAppModel.b, z411 ? vo1.B("(", str110, ")") : str17);
                                                        int i218 = routeDetailsComponent3.h0;
                                                        boolean z413 = i218 != -1 && i216 > i218;
                                                        boolean z414 = i218 == i216;
                                                        StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                        String stopId = stopAppModel.f1727a;
                                                        int i219 = intRef2110.element;
                                                        int i2110 = intRef32.element;
                                                        int i31 = routeDetailsComponent3.s0;
                                                        TrackingAdditionalFeatures trackingAdditionalFeatures7 = routeDetailsIntentModel112.h;
                                                        String str111 = str17;
                                                        boolean z415 = trackingAdditionalFeatures7.l;
                                                        Iterable customStopTagInfoList = trackingAdditionalFeatures7.o;
                                                        if (customStopTagInfoList == null) {
                                                            customStopTagInfoList = EmptyList.f17557a;
                                                        }
                                                        Intrinsics.i(stopId, "stopId");
                                                        Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                        ArrayList arrayList10 = new ArrayList();
                                                        boolean z416 = z410 && i216 == i218;
                                                        if (i216 == i219) {
                                                            arrayList10.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                        } else if (i216 == i2110) {
                                                            arrayList10.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                        } else if (i216 == i31 && z416) {
                                                            arrayList10.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                            arrayList10.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                        } else if (z416) {
                                                            arrayList10.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                        } else if (i216 == i31 || (i216 == i17 && z415)) {
                                                            arrayList10.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                        }
                                                        for (Object obj12 : customStopTagInfoList) {
                                                            if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                                obj11 = obj12;
                                                                break;
                                                            }
                                                        }
                                                        RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                        if (routeDetailsCustomStopTagInfo != null) {
                                                            arrayList10.add(routeDetailsCustomStopTagInfo.b);
                                                        }
                                                        arrayList9.add(new RouteDetailsStopUiModel(str110, i216, strA2, false, false, z413, false, z414, stopEtaStatus, notAvailable, arrayList10, z412, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                        it3 = routeDetailsDataState;
                                                        strA = str18;
                                                        z49 = z411;
                                                        i216 = i217;
                                                        routeDetailsViewType = routeDetailsViewType2;
                                                        str16 = str19;
                                                        it4 = it5;
                                                        str17 = str111;
                                                    } else {
                                                        RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                        String str112 = str16;
                                                        String str20 = str17;
                                                        StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                        List listC1 = routeDetailsComponent3.c1();
                                                        CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                        RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                        List list18 = routeAppModel14.n;
                                                        ArrayList arrayList11 = new ArrayList(CollectionsKt.v(list18, 10));
                                                        Iterator it6 = list18.iterator();
                                                        while (it6.hasNext()) {
                                                            arrayList11.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                        }
                                                        String str21 = z34 ? routeAppModel14.j : null;
                                                        int i32 = routeDetailsComponent3.h0;
                                                        String str22 = i32 != -1 ? ((StopAppModel) list16.get(i32)).b : str20;
                                                        boolean z50 = routeDetailsIntentModel112.h.i;
                                                        String str23 = str21;
                                                        ArrayList arrayList12 = new ArrayList(CollectionsKt.v(list17, 10));
                                                        Iterator it7 = list17.iterator();
                                                        int i33 = 0;
                                                        while (true) {
                                                            boolean zHasNext2 = it7.hasNext();
                                                            Iterator it8 = it7;
                                                            boolean z51 = z38;
                                                            boolean z52 = z39;
                                                            boolean z53 = z36;
                                                            if (!zHasNext2) {
                                                                return RouteDetailsDataState.a(routeDetailsDataState, false, null, str18, str112, ((StopAppModel) list16.get(0)).b, (String) objectRef4.element, routeAppModel14.t, routeDetailsViewType3, list15, arrayList9, str22, routeDetailsMapUiModel, null, z410, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList11, str23, z50, z51, z52, arrayList12, null, z53, false, map3, "", false, null, false, null, zBooleanValue9, -1604474878, 60);
                                                            }
                                                            Object next3 = it8.next();
                                                            int i34 = i33 + 1;
                                                            if (i33 < 0) {
                                                                CollectionsKt.z0();
                                                                throw null;
                                                            }
                                                            StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                            ArrayList arrayList13 = arrayList11;
                                                            List list19 = routeDetailsIntentModel112.h.n;
                                                            if (list19 != null) {
                                                                Iterator it9 = list19.iterator();
                                                                while (true) {
                                                                    if (!it9.hasNext()) {
                                                                        routeDetailsIntentModel111 = routeDetailsIntentModel112;
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it9.next();
                                                                    routeDetailsIntentModel111 = routeDetailsIntentModel112;
                                                                    Iterator it10 = it9;
                                                                    if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                        break;
                                                                    }
                                                                    it9 = it10;
                                                                    routeDetailsIntentModel112 = routeDetailsIntentModel111;
                                                                }
                                                                routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                            } else {
                                                                routeDetailsIntentModel111 = routeDetailsIntentModel112;
                                                                routeDetailsCustomStopMarkerInfo = null;
                                                            }
                                                            if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                                int iK = CollectionsKt.K(list16);
                                                                int i35 = routeDetailsComponent3.h0;
                                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                                int i36 = intRef2110.element;
                                                                intRef218 = intRef2110;
                                                                int i37 = intRef32.element;
                                                                intRef219 = intRef32;
                                                                boolean z54 = i35 != -1 && i33 > i35;
                                                                if (z35) {
                                                                    if (i33 == i36) {
                                                                        markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                    } else if (i33 == i37) {
                                                                        markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                    } else {
                                                                        markerStopType = (i36 + 1 > i33 || i33 >= i37) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                    }
                                                                } else if (i33 == 0) {
                                                                    markerStopType = MarkerStopType.FirstStop;
                                                                } else if (i33 == iK) {
                                                                    markerStopType = MarkerStopType.LastStop;
                                                                } else {
                                                                    markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                }
                                                            } else {
                                                                intRef218 = intRef2110;
                                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                                intRef219 = intRef32;
                                                            }
                                                            MarkerStopType markerStopType2 = markerStopType;
                                                            String str24 = stopAppModel2.f1727a;
                                                            String str25 = str15;
                                                            StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                            notAvailable2 = notAvailable3;
                                                            arrayList12.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z411 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i33 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                            str15 = str25;
                                                            arrayList11 = arrayList13;
                                                            it7 = it8;
                                                            i33 = i34;
                                                            routeDetailsIntentModel112 = routeDetailsIntentModel111;
                                                            routeDetailsComponent3 = routeDetailsComponent2;
                                                            intRef2110 = intRef218;
                                                            intRef32 = intRef219;
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                        if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                            RouteDetailsIntentModel routeDetailsIntentModel111 = routeDetailsComponent.X;
                                            routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel111 != null ? routeDetailsIntentModel111.e : null), routeAppModel11.b, routeAppModel11.c);
                                        } else {
                                            routeDetailsComponent.g1(z37);
                                        }
                                        routeDetailsComponent.j1();
                                        routeDetailsComponent.k0 = true;
                                        if (z35) {
                                            routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                        }
                                        return Unit.f17538a;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons5;
            case 3:
                i = 0;
                int i31 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z49 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                List list16 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                Ref.IntRef intRef32 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef33 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel20 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel14 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeDetailsIntentModel4 = routeDetailsIntentModel20;
                routeAppModel3 = routeAppModel14;
                intRef6 = intRef32;
                intRef5 = intRef33;
                z3 = z49;
                list2 = list16;
                i4 = i31;
                obj2 = obj9;
                zBooleanValue = ((Boolean) obj2).booleanValue();
                z4 = routeAppModel3.q;
                if (z4) {
                    routeDetailsComponent.h0 = CollectionsKt.K(routeAppModel3.e);
                    z8 = z3;
                    list4 = list2;
                    intRef9 = intRef6;
                    intRef10 = intRef5;
                    routeDetailsIntentModel6 = routeDetailsIntentModel4;
                    routeAppModel5 = routeAppModel3;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                    routeDetailsComponent$updateInitialViewState$1.label = 5;
                    objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                    if (objA4 != coroutineSingletons5) {
                        boolean z410 = zBooleanValue;
                        z9 = z4;
                        obj4 = objA4;
                        routeAppModel6 = routeAppModel5;
                        routeDetailsIntentModel7 = routeDetailsIntentModel6;
                        intRef11 = intRef10;
                        intRef12 = intRef9;
                        list5 = list4;
                        z10 = z8;
                        i6 = i4;
                        z11 = z410;
                        chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        } else {
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            livePassengerIndicatorBottomSheetDetails = null;
                        }
                        str2 = routeDetailsIntentModel7.b;
                        TrackingAdditionalFeatures trackingAdditionalFeatures7 = routeDetailsIntentModel7.h;
                        if (str2 != null) {
                            i9 = i;
                        } else {
                            i9 = i;
                        }
                        z12 = trackingAdditionalFeatures7.k;
                        z13 = trackingAdditionalFeatures7.j;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                        routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                        z14 = z9;
                        routeDetailsComponent$updateInitialViewState$1.label = 6;
                        objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                        if (objA5 != coroutineSingletons5) {
                            livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                            obj5 = objA5;
                            list6 = list5;
                            i10 = i9;
                            intRef13 = intRef12;
                            z15 = z14;
                            coroutineSingletons = coroutineSingletons5;
                            routeAppModel7 = routeAppModel6;
                            z16 = z10;
                            z17 = z12;
                            routeDetailsIntentModel8 = routeDetailsIntentModel7;
                            i11 = i6;
                            z18 = z13;
                            Ref.IntRef intRef218 = intRef11;
                            z19 = z11;
                            intRef14 = intRef218;
                            bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                            z20 = z18;
                            iH = basicInfoContract.h();
                            z21 = z17;
                            if (bonnetNumberToggleConfig.f2315a) {
                                int i216 = bonnetNumberToggleConfig.b;
                                if (iH <= bonnetNumberToggleConfig.c) {
                                    r7 = i;
                                } else {
                                    r7 = i;
                                }
                            } else {
                                r7 = i;
                            }
                            objectRef = new Ref.ObjectRef();
                            AdTargetingProvider adTargetingProvider7 = routeDetailsComponent.A;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                            routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                            routeAppModel8 = routeAppModel7;
                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                            z21 = z21;
                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                            routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                            z20 = z20;
                            routeDetailsComponent$updateInitialViewState$1.label = 7;
                            objA6 = adTargetingProvider7.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                            coroutineSingletons5 = coroutineSingletons;
                            if (objA6 != coroutineSingletons5) {
                                Ref.IntRef intRef219 = intRef14;
                                list7 = list6;
                                r4 = r7;
                                z22 = z20;
                                intRef15 = intRef219;
                                intRef16 = intRef13;
                                objectRef2 = objectRef;
                                z23 = z21;
                                routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                objA7 = (Map) objA6;
                                r5 = r4;
                                intRef17 = intRef16;
                                routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                obj6 = objA7;
                                r22 = r5;
                                intRef18 = intRef15;
                                coroutineSingletons2 = coroutineSingletons5;
                                routeAppModel9 = routeAppModel8;
                                thA = Result.a(obj6);
                                if (thA == null) {
                                    objD = obj6;
                                } else {
                                    if (!(thA instanceof CancellationException)) {
                                        throw thA;
                                    }
                                    ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                    objD = MapsKt.d();
                                }
                                map = (Map) objD;
                                str3 = routeAppModel9.s;
                                if (str3 != null) {
                                    List listU8 = StringsKt.U(str3, new String[]{","}, 6);
                                    arrayList = new ArrayList(CollectionsKt.v(listU8, 10));
                                    it2 = listU8.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                    }
                                    size = arrayList.size();
                                    i14 = i;
                                    i15 = i14;
                                    r9 = "";
                                    while (i15 < size) {
                                        obj8 = arrayList.get(i15);
                                        i15++;
                                        i16 = i14 + 1;
                                        if (i14 >= 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        int i217 = size;
                                        str4 = (String) obj8;
                                        ArrayList arrayList9 = arrayList;
                                        if (i14 == arrayList.size() - 1) {
                                            str5 = r9 + str4;
                                        } else {
                                            str5 = r9 + str4 + ", ";
                                        }
                                        r9 = str5;
                                        i14 = i16;
                                        size = i217;
                                        arrayList = arrayList9;
                                    }
                                    objectRef2.element = r9;
                                }
                                AppPermission[] appPermissionArr8 = new AppPermission[1];
                                appPermissionArr8[i] = AppPermission.FINE_LOCATION;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                z24 = z19;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                z25 = z15;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                i12 = i10;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                z26 = z23;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                routeDetailsComponent$updateInitialViewState$1.label = 8;
                                objG = basicInfoContract.g(appPermissionArr8, routeDetailsComponent$updateInitialViewState$1);
                                if (objG == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                Ref.ObjectRef objectRef12 = objectRef2;
                                list8 = list7;
                                objectRef3 = objectRef12;
                                obj7 = objG;
                                routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                z27 = z16;
                                i13 = i11;
                                z28 = z24;
                                livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                intRef19 = intRef17;
                                z29 = z22;
                                coroutineSingletons3 = coroutineSingletons2;
                                map2 = map;
                                routeAppModel10 = routeAppModel9;
                                intRef20 = intRef18;
                                z30 = r22 == true ? 1 : 0;
                                z31 = z29;
                                zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                z32 = z27;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                routeDetailsComponent$updateInitialViewState$1.label = 9;
                                routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                routeDetailsComponent = this;
                                objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                coroutineSingletons4 = coroutineSingletons3;
                                if (objS == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                intRef21 = intRef20;
                                routeAppModel11 = routeAppModel10;
                                z33 = zBooleanValue2;
                                z34 = z28;
                                z35 = z32;
                                z36 = z30;
                                objectRef4 = objectRef3;
                                i17 = i13;
                                intRef22 = intRef19;
                                routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                map3 = map2;
                                i18 = i12;
                                livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                z37 = z25;
                                z38 = z26;
                                z39 = z31;
                                final boolean zBooleanValue10 = ((Boolean) objS).booleanValue();
                                if (i18 != 0) {
                                    i19 = 1;
                                } else {
                                    i19 = i;
                                }
                                final List list17 = list8;
                                final boolean r112 = i19;
                                routeDetailsComponent.E0(new Function1() { // from class: o31
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj10) {
                                        RouteDetailsIntentModel routeDetailsIntentModel112;
                                        RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                        RouteDetailsComponent routeDetailsComponent2;
                                        Ref.IntRef intRef2110;
                                        Ref.IntRef intRef2111;
                                        MarkerStopType markerStopType;
                                        Object next;
                                        RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                        Intrinsics.i(it3, "it");
                                        RouteAppModel routeAppModel15 = routeAppModel11;
                                        String str14 = routeAppModel15.c;
                                        List list18 = routeAppModel15.e;
                                        RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                        boolean z411 = routeDetailsComponent3.o0;
                                        String str15 = "(";
                                        String strA = vo1.A(str14, z411 ? vo1.B("(", routeAppModel15.b, ")") : "");
                                        String str16 = routeAppModel15.h.b;
                                        List list19 = list18;
                                        String str17 = "";
                                        RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                        ArrayList arrayList10 = new ArrayList(CollectionsKt.v(list19, 10));
                                        Iterator it4 = list19.iterator();
                                        int i218 = 0;
                                        while (true) {
                                            boolean zHasNext = it4.hasNext();
                                            RouteDetailsDataState routeDetailsDataState = it3;
                                            RouteDetailsIntentModel routeDetailsIntentModel113 = routeDetailsIntentModel13;
                                            String str18 = strA;
                                            boolean z412 = z37;
                                            Ref.IntRef intRef2112 = intRef21;
                                            boolean z413 = z411;
                                            Ref.IntRef intRef34 = intRef22;
                                            StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                            Object obj11 = null;
                                            if (zHasNext) {
                                                Object next2 = it4.next();
                                                int i219 = i218 + 1;
                                                if (i218 < 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                StopAppModel stopAppModel = (StopAppModel) next2;
                                                String str19 = str16;
                                                Iterator it5 = it4;
                                                boolean z414 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel113.b) && r112;
                                                String str110 = stopAppModel.f1727a;
                                                String strA2 = vo1.A(stopAppModel.b, z413 ? vo1.B("(", str110, ")") : str17);
                                                int i2110 = routeDetailsComponent3.h0;
                                                boolean z415 = i2110 != -1 && i218 > i2110;
                                                boolean z416 = i2110 == i218;
                                                StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                String stopId = stopAppModel.f1727a;
                                                int i2111 = intRef2112.element;
                                                int i2112 = intRef34.element;
                                                int i32 = routeDetailsComponent3.s0;
                                                TrackingAdditionalFeatures trackingAdditionalFeatures8 = routeDetailsIntentModel113.h;
                                                String str111 = str17;
                                                boolean z417 = trackingAdditionalFeatures8.l;
                                                Iterable customStopTagInfoList = trackingAdditionalFeatures8.o;
                                                if (customStopTagInfoList == null) {
                                                    customStopTagInfoList = EmptyList.f17557a;
                                                }
                                                Intrinsics.i(stopId, "stopId");
                                                Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                ArrayList arrayList11 = new ArrayList();
                                                boolean z418 = z412 && i218 == i2110;
                                                if (i218 == i2111) {
                                                    arrayList11.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                } else if (i218 == i2112) {
                                                    arrayList11.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                } else if (i218 == i32 && z418) {
                                                    arrayList11.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                    arrayList11.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                } else if (z418) {
                                                    arrayList11.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                } else if (i218 == i32 || (i218 == i17 && z417)) {
                                                    arrayList11.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                }
                                                for (Object obj12 : customStopTagInfoList) {
                                                    if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                        obj11 = obj12;
                                                        break;
                                                    }
                                                }
                                                RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                if (routeDetailsCustomStopTagInfo != null) {
                                                    arrayList11.add(routeDetailsCustomStopTagInfo.b);
                                                }
                                                arrayList10.add(new RouteDetailsStopUiModel(str110, i218, strA2, false, false, z415, false, z416, stopEtaStatus, notAvailable, arrayList11, z414, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                it3 = routeDetailsDataState;
                                                strA = str18;
                                                z411 = z413;
                                                i218 = i219;
                                                routeDetailsViewType = routeDetailsViewType2;
                                                str16 = str19;
                                                it4 = it5;
                                                str17 = str111;
                                            } else {
                                                RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                String str112 = str16;
                                                String str20 = str17;
                                                StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                List listC1 = routeDetailsComponent3.c1();
                                                CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                List list110 = routeAppModel15.n;
                                                ArrayList arrayList12 = new ArrayList(CollectionsKt.v(list110, 10));
                                                Iterator it6 = list110.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList12.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                }
                                                String str21 = z34 ? routeAppModel15.j : null;
                                                int i33 = routeDetailsComponent3.h0;
                                                String str22 = i33 != -1 ? ((StopAppModel) list18.get(i33)).b : str20;
                                                boolean z50 = routeDetailsIntentModel113.h.i;
                                                String str23 = str21;
                                                ArrayList arrayList13 = new ArrayList(CollectionsKt.v(list19, 10));
                                                Iterator it7 = list19.iterator();
                                                int i34 = 0;
                                                while (true) {
                                                    boolean zHasNext2 = it7.hasNext();
                                                    Iterator it8 = it7;
                                                    boolean z51 = z38;
                                                    boolean z52 = z39;
                                                    boolean z53 = z36;
                                                    if (!zHasNext2) {
                                                        return RouteDetailsDataState.a(routeDetailsDataState, false, null, str18, str112, ((StopAppModel) list18.get(0)).b, (String) objectRef4.element, routeAppModel15.t, routeDetailsViewType3, list17, arrayList10, str22, routeDetailsMapUiModel, null, z412, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList12, str23, z50, z51, z52, arrayList13, null, z53, false, map3, "", false, null, false, null, zBooleanValue10, -1604474878, 60);
                                                    }
                                                    Object next3 = it8.next();
                                                    int i35 = i34 + 1;
                                                    if (i34 < 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                    ArrayList arrayList14 = arrayList12;
                                                    List list111 = routeDetailsIntentModel113.h.n;
                                                    if (list111 != null) {
                                                        Iterator it9 = list111.iterator();
                                                        while (true) {
                                                            if (!it9.hasNext()) {
                                                                routeDetailsIntentModel112 = routeDetailsIntentModel113;
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it9.next();
                                                            routeDetailsIntentModel112 = routeDetailsIntentModel113;
                                                            Iterator it10 = it9;
                                                            if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                break;
                                                            }
                                                            it9 = it10;
                                                            routeDetailsIntentModel113 = routeDetailsIntentModel112;
                                                        }
                                                        routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                    } else {
                                                        routeDetailsIntentModel112 = routeDetailsIntentModel113;
                                                        routeDetailsCustomStopMarkerInfo = null;
                                                    }
                                                    if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                        int iK = CollectionsKt.K(list18);
                                                        int i36 = routeDetailsComponent3.h0;
                                                        routeDetailsComponent2 = routeDetailsComponent3;
                                                        int i37 = intRef2112.element;
                                                        intRef2110 = intRef2112;
                                                        int i38 = intRef34.element;
                                                        intRef2111 = intRef34;
                                                        boolean z54 = i36 != -1 && i34 > i36;
                                                        if (z35) {
                                                            if (i34 == i37) {
                                                                markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                            } else if (i34 == i38) {
                                                                markerStopType = MarkerStopType.PremiumBusDropStop;
                                                            } else {
                                                                markerStopType = (i37 + 1 > i34 || i34 >= i38) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                            }
                                                        } else if (i34 == 0) {
                                                            markerStopType = MarkerStopType.FirstStop;
                                                        } else if (i34 == iK) {
                                                            markerStopType = MarkerStopType.LastStop;
                                                        } else {
                                                            markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                        }
                                                    } else {
                                                        intRef2110 = intRef2112;
                                                        routeDetailsComponent2 = routeDetailsComponent3;
                                                        intRef2111 = intRef34;
                                                    }
                                                    MarkerStopType markerStopType2 = markerStopType;
                                                    String str24 = stopAppModel2.f1727a;
                                                    String str25 = str15;
                                                    StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                    notAvailable2 = notAvailable3;
                                                    arrayList13.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z413 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i34 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                    str15 = str25;
                                                    arrayList12 = arrayList14;
                                                    it7 = it8;
                                                    i34 = i35;
                                                    routeDetailsIntentModel113 = routeDetailsIntentModel112;
                                                    routeDetailsComponent3 = routeDetailsComponent2;
                                                    intRef2112 = intRef2110;
                                                    intRef34 = intRef2111;
                                                }
                                            }
                                        }
                                    }
                                });
                                if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                    RouteDetailsIntentModel routeDetailsIntentModel112 = routeDetailsComponent.X;
                                    routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel112 != null ? routeDetailsIntentModel112.e : null), routeAppModel11.b, routeAppModel11.c);
                                } else {
                                    routeDetailsComponent.g1(z37);
                                }
                                routeDetailsComponent.j1();
                                routeDetailsComponent.k0 = true;
                                if (z35) {
                                    routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                }
                                return Unit.f17538a;
                            }
                        }
                    }
                } else {
                    String str14 = routeAppModel3.b;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel3;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel4;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef5;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef6;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list2;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z3;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                    routeDetailsComponent$updateInitialViewState$1.label = 4;
                    objA3 = routeDetailsComponent.E.a(str14, routeDetailsComponent$updateInitialViewState$1);
                    if (objA3 != coroutineSingletons5) {
                        z5 = z4;
                        obj3 = objA3;
                        routeAppModel4 = routeAppModel3;
                        routeDetailsIntentModel5 = routeDetailsIntentModel4;
                        intRef7 = intRef5;
                        intRef8 = intRef6;
                        list3 = list2;
                        z6 = z3;
                        i5 = i4;
                        z7 = zBooleanValue;
                        str = (String) obj3;
                        if (str != null) {
                            it = routeAppModel4.e.iterator();
                            i7 = i;
                            while (true) {
                                if (!it.hasNext()) {
                                    i8 = -1;
                                } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                                    i8 = i7;
                                } else {
                                    i7++;
                                }
                            }
                            routeDetailsComponent.h0 = i8;
                        }
                        z4 = z5;
                        zBooleanValue = z7;
                        i4 = i5;
                        z8 = z6;
                        list4 = list3;
                        intRef9 = intRef8;
                        intRef10 = intRef7;
                        routeDetailsIntentModel6 = routeDetailsIntentModel5;
                        routeAppModel5 = routeAppModel4;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                        routeDetailsComponent$updateInitialViewState$1.label = 5;
                        objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                        if (objA4 != coroutineSingletons5) {
                            boolean z411 = zBooleanValue;
                            z9 = z4;
                            obj4 = objA4;
                            routeAppModel6 = routeAppModel5;
                            routeDetailsIntentModel7 = routeDetailsIntentModel6;
                            intRef11 = intRef10;
                            intRef12 = intRef9;
                            list5 = list4;
                            z10 = z8;
                            i6 = i4;
                            z11 = z411;
                            chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                            } else {
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                livePassengerIndicatorBottomSheetDetails = null;
                            }
                            str2 = routeDetailsIntentModel7.b;
                            TrackingAdditionalFeatures trackingAdditionalFeatures8 = routeDetailsIntentModel7.h;
                            if (str2 != null) {
                                i9 = i;
                            } else {
                                i9 = i;
                            }
                            z12 = trackingAdditionalFeatures8.k;
                            z13 = trackingAdditionalFeatures8.j;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                            routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                            z14 = z9;
                            routeDetailsComponent$updateInitialViewState$1.label = 6;
                            objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                            if (objA5 != coroutineSingletons5) {
                                livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                                obj5 = objA5;
                                list6 = list5;
                                i10 = i9;
                                intRef13 = intRef12;
                                z15 = z14;
                                coroutineSingletons = coroutineSingletons5;
                                routeAppModel7 = routeAppModel6;
                                z16 = z10;
                                z17 = z12;
                                routeDetailsIntentModel8 = routeDetailsIntentModel7;
                                i11 = i6;
                                z18 = z13;
                                Ref.IntRef intRef2110 = intRef11;
                                z19 = z11;
                                intRef14 = intRef2110;
                                bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                                z20 = z18;
                                iH = basicInfoContract.h();
                                z21 = z17;
                                if (bonnetNumberToggleConfig.f2315a) {
                                    int i218 = bonnetNumberToggleConfig.b;
                                    if (iH <= bonnetNumberToggleConfig.c) {
                                        r7 = i;
                                    } else {
                                        r7 = i;
                                    }
                                } else {
                                    r7 = i;
                                }
                                objectRef = new Ref.ObjectRef();
                                AdTargetingProvider adTargetingProvider8 = routeDetailsComponent.A;
                                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                                routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                                routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                                routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                                routeAppModel8 = routeAppModel7;
                                routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                                z21 = z21;
                                routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                                routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                                z20 = z20;
                                routeDetailsComponent$updateInitialViewState$1.label = 7;
                                objA6 = adTargetingProvider8.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                                coroutineSingletons5 = coroutineSingletons;
                                if (objA6 != coroutineSingletons5) {
                                    Ref.IntRef intRef2111 = intRef14;
                                    list7 = list6;
                                    r4 = r7;
                                    z22 = z20;
                                    intRef15 = intRef2111;
                                    intRef16 = intRef13;
                                    objectRef2 = objectRef;
                                    z23 = z21;
                                    routeDetailsIntentModel9 = routeDetailsIntentModel8;
                                    objA7 = (Map) objA6;
                                    r5 = r4;
                                    intRef17 = intRef16;
                                    routeDetailsIntentModel10 = routeDetailsIntentModel9;
                                    obj6 = objA7;
                                    r22 = r5;
                                    intRef18 = intRef15;
                                    coroutineSingletons2 = coroutineSingletons5;
                                    routeAppModel9 = routeAppModel8;
                                    thA = Result.a(obj6);
                                    if (thA == null) {
                                        objD = obj6;
                                    } else {
                                        if (!(thA instanceof CancellationException)) {
                                            throw thA;
                                        }
                                        ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                        objD = MapsKt.d();
                                    }
                                    map = (Map) objD;
                                    str3 = routeAppModel9.s;
                                    if (str3 != null) {
                                        List listU9 = StringsKt.U(str3, new String[]{","}, 6);
                                        arrayList = new ArrayList(CollectionsKt.v(listU9, 10));
                                        it2 = listU9.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                        }
                                        size = arrayList.size();
                                        i14 = i;
                                        i15 = i14;
                                        r9 = "";
                                        while (i15 < size) {
                                            obj8 = arrayList.get(i15);
                                            i15++;
                                            i16 = i14 + 1;
                                            if (i14 >= 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            int i219 = size;
                                            str4 = (String) obj8;
                                            ArrayList arrayList10 = arrayList;
                                            if (i14 == arrayList.size() - 1) {
                                                str5 = r9 + str4;
                                            } else {
                                                str5 = r9 + str4 + ", ";
                                            }
                                            r9 = str5;
                                            i14 = i16;
                                            size = i219;
                                            arrayList = arrayList10;
                                        }
                                        objectRef2.element = r9;
                                    }
                                    AppPermission[] appPermissionArr9 = new AppPermission[1];
                                    appPermissionArr9[i] = AppPermission.FINE_LOCATION;
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                                    z24 = z19;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                                    z25 = z15;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                    i12 = i10;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                    z26 = z23;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                                    routeDetailsComponent$updateInitialViewState$1.label = 8;
                                    objG = basicInfoContract.g(appPermissionArr9, routeDetailsComponent$updateInitialViewState$1);
                                    if (objG == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    Ref.ObjectRef objectRef13 = objectRef2;
                                    list8 = list7;
                                    objectRef3 = objectRef13;
                                    obj7 = objG;
                                    routeDetailsIntentModel11 = routeDetailsIntentModel10;
                                    z27 = z16;
                                    i13 = i11;
                                    z28 = z24;
                                    livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                                    intRef19 = intRef17;
                                    z29 = z22;
                                    coroutineSingletons3 = coroutineSingletons2;
                                    map2 = map;
                                    routeAppModel10 = routeAppModel9;
                                    intRef20 = intRef18;
                                    z30 = r22 == true ? 1 : 0;
                                    z31 = z29;
                                    zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                                    routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                                    routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                                    routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                                    z32 = z27;
                                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                                    routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                                    routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                                    routeDetailsComponent$updateInitialViewState$1.label = 9;
                                    routeDetailsIntentModel12 = routeDetailsIntentModel11;
                                    routeDetailsComponent = this;
                                    objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (objS == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    intRef21 = intRef20;
                                    routeAppModel11 = routeAppModel10;
                                    z33 = zBooleanValue2;
                                    z34 = z28;
                                    z35 = z32;
                                    z36 = z30;
                                    objectRef4 = objectRef3;
                                    i17 = i13;
                                    intRef22 = intRef19;
                                    routeDetailsIntentModel13 = routeDetailsIntentModel12;
                                    map3 = map2;
                                    i18 = i12;
                                    livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                                    z37 = z25;
                                    z38 = z26;
                                    z39 = z31;
                                    final boolean zBooleanValue11 = ((Boolean) objS).booleanValue();
                                    if (i18 != 0) {
                                        i19 = 1;
                                    } else {
                                        i19 = i;
                                    }
                                    final List list18 = list8;
                                    final boolean r113 = i19;
                                    routeDetailsComponent.E0(new Function1() { // from class: o31
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj10) {
                                            RouteDetailsIntentModel routeDetailsIntentModel113;
                                            RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                            RouteDetailsComponent routeDetailsComponent2;
                                            Ref.IntRef intRef2112;
                                            Ref.IntRef intRef2113;
                                            MarkerStopType markerStopType;
                                            Object next;
                                            RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                            Intrinsics.i(it3, "it");
                                            RouteAppModel routeAppModel15 = routeAppModel11;
                                            String str15 = routeAppModel15.c;
                                            List list19 = routeAppModel15.e;
                                            RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                            boolean z412 = routeDetailsComponent3.o0;
                                            String str16 = "(";
                                            String strA = vo1.A(str15, z412 ? vo1.B("(", routeAppModel15.b, ")") : "");
                                            String str17 = routeAppModel15.h.b;
                                            List list110 = list19;
                                            String str18 = "";
                                            RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                            ArrayList arrayList11 = new ArrayList(CollectionsKt.v(list110, 10));
                                            Iterator it4 = list110.iterator();
                                            int i2110 = 0;
                                            while (true) {
                                                boolean zHasNext = it4.hasNext();
                                                RouteDetailsDataState routeDetailsDataState = it3;
                                                RouteDetailsIntentModel routeDetailsIntentModel114 = routeDetailsIntentModel13;
                                                String str19 = strA;
                                                boolean z413 = z37;
                                                Ref.IntRef intRef2114 = intRef21;
                                                boolean z414 = z412;
                                                Ref.IntRef intRef34 = intRef22;
                                                StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                                Object obj11 = null;
                                                if (zHasNext) {
                                                    Object next2 = it4.next();
                                                    int i2111 = i2110 + 1;
                                                    if (i2110 < 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                                    StopAppModel stopAppModel = (StopAppModel) next2;
                                                    String str110 = str17;
                                                    Iterator it5 = it4;
                                                    boolean z415 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel114.b) && r113;
                                                    String str111 = stopAppModel.f1727a;
                                                    String strA2 = vo1.A(stopAppModel.b, z414 ? vo1.B("(", str111, ")") : str18);
                                                    int i2112 = routeDetailsComponent3.h0;
                                                    boolean z416 = i2112 != -1 && i2110 > i2112;
                                                    boolean z417 = i2112 == i2110;
                                                    StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                                    String stopId = stopAppModel.f1727a;
                                                    int i2113 = intRef2114.element;
                                                    int i2114 = intRef34.element;
                                                    int i32 = routeDetailsComponent3.s0;
                                                    TrackingAdditionalFeatures trackingAdditionalFeatures9 = routeDetailsIntentModel114.h;
                                                    String str112 = str18;
                                                    boolean z418 = trackingAdditionalFeatures9.l;
                                                    Iterable customStopTagInfoList = trackingAdditionalFeatures9.o;
                                                    if (customStopTagInfoList == null) {
                                                        customStopTagInfoList = EmptyList.f17557a;
                                                    }
                                                    Intrinsics.i(stopId, "stopId");
                                                    Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                                    ArrayList arrayList12 = new ArrayList();
                                                    boolean z419 = z413 && i2110 == i2112;
                                                    if (i2110 == i2113) {
                                                        arrayList12.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                                    } else if (i2110 == i2114) {
                                                        arrayList12.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                                    } else if (i2110 == i32 && z419) {
                                                        arrayList12.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                        arrayList12.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                    } else if (z419) {
                                                        arrayList12.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                                    } else if (i2110 == i32 || (i2110 == i17 && z418)) {
                                                        arrayList12.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                    }
                                                    for (Object obj12 : customStopTagInfoList) {
                                                        if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                            obj11 = obj12;
                                                            break;
                                                        }
                                                    }
                                                    RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                                    if (routeDetailsCustomStopTagInfo != null) {
                                                        arrayList12.add(routeDetailsCustomStopTagInfo.b);
                                                    }
                                                    arrayList11.add(new RouteDetailsStopUiModel(str111, i2110, strA2, false, false, z416, false, z417, stopEtaStatus, notAvailable, arrayList12, z415, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                                    it3 = routeDetailsDataState;
                                                    strA = str19;
                                                    z412 = z414;
                                                    i2110 = i2111;
                                                    routeDetailsViewType = routeDetailsViewType2;
                                                    str17 = str110;
                                                    it4 = it5;
                                                    str18 = str112;
                                                } else {
                                                    RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                                    String str113 = str17;
                                                    String str20 = str18;
                                                    StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                                    List listC1 = routeDetailsComponent3.c1();
                                                    CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                                    RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                                    List list111 = routeAppModel15.n;
                                                    ArrayList arrayList13 = new ArrayList(CollectionsKt.v(list111, 10));
                                                    Iterator it6 = list111.iterator();
                                                    while (it6.hasNext()) {
                                                        arrayList13.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                                    }
                                                    String str21 = z34 ? routeAppModel15.j : null;
                                                    int i33 = routeDetailsComponent3.h0;
                                                    String str22 = i33 != -1 ? ((StopAppModel) list19.get(i33)).b : str20;
                                                    boolean z50 = routeDetailsIntentModel114.h.i;
                                                    String str23 = str21;
                                                    ArrayList arrayList14 = new ArrayList(CollectionsKt.v(list110, 10));
                                                    Iterator it7 = list110.iterator();
                                                    int i34 = 0;
                                                    while (true) {
                                                        boolean zHasNext2 = it7.hasNext();
                                                        Iterator it8 = it7;
                                                        boolean z51 = z38;
                                                        boolean z52 = z39;
                                                        boolean z53 = z36;
                                                        if (!zHasNext2) {
                                                            return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list19.get(0)).b, (String) objectRef4.element, routeAppModel15.t, routeDetailsViewType3, list18, arrayList11, str22, routeDetailsMapUiModel, null, z413, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList13, str23, z50, z51, z52, arrayList14, null, z53, false, map3, "", false, null, false, null, zBooleanValue11, -1604474878, 60);
                                                        }
                                                        Object next3 = it8.next();
                                                        int i35 = i34 + 1;
                                                        if (i34 < 0) {
                                                            CollectionsKt.z0();
                                                            throw null;
                                                        }
                                                        StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                        ArrayList arrayList15 = arrayList13;
                                                        List list112 = routeDetailsIntentModel114.h.n;
                                                        if (list112 != null) {
                                                            Iterator it9 = list112.iterator();
                                                            while (true) {
                                                                if (!it9.hasNext()) {
                                                                    routeDetailsIntentModel113 = routeDetailsIntentModel114;
                                                                    next = null;
                                                                    break;
                                                                }
                                                                next = it9.next();
                                                                routeDetailsIntentModel113 = routeDetailsIntentModel114;
                                                                Iterator it10 = it9;
                                                                if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                                    break;
                                                                }
                                                                it9 = it10;
                                                                routeDetailsIntentModel114 = routeDetailsIntentModel113;
                                                            }
                                                            routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                        } else {
                                                            routeDetailsIntentModel113 = routeDetailsIntentModel114;
                                                            routeDetailsCustomStopMarkerInfo = null;
                                                        }
                                                        if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                            int iK = CollectionsKt.K(list19);
                                                            int i36 = routeDetailsComponent3.h0;
                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                            int i37 = intRef2114.element;
                                                            intRef2112 = intRef2114;
                                                            int i38 = intRef34.element;
                                                            intRef2113 = intRef34;
                                                            boolean z54 = i36 != -1 && i34 > i36;
                                                            if (z35) {
                                                                if (i34 == i37) {
                                                                    markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                                } else if (i34 == i38) {
                                                                    markerStopType = MarkerStopType.PremiumBusDropStop;
                                                                } else {
                                                                    markerStopType = (i37 + 1 > i34 || i34 >= i38) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                                }
                                                            } else if (i34 == 0) {
                                                                markerStopType = MarkerStopType.FirstStop;
                                                            } else if (i34 == iK) {
                                                                markerStopType = MarkerStopType.LastStop;
                                                            } else {
                                                                markerStopType = z54 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                            }
                                                        } else {
                                                            intRef2112 = intRef2114;
                                                            routeDetailsComponent2 = routeDetailsComponent3;
                                                            intRef2113 = intRef34;
                                                        }
                                                        MarkerStopType markerStopType2 = markerStopType;
                                                        String str24 = stopAppModel2.f1727a;
                                                        String str25 = str16;
                                                        StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                        notAvailable2 = notAvailable3;
                                                        arrayList14.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z414 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i34 == 0, markerStopType2, stopAppModel2.c, false, z51, z52, z53));
                                                        str16 = str25;
                                                        arrayList13 = arrayList15;
                                                        it7 = it8;
                                                        i34 = i35;
                                                        routeDetailsIntentModel114 = routeDetailsIntentModel113;
                                                        routeDetailsComponent3 = routeDetailsComponent2;
                                                        intRef2114 = intRef2112;
                                                        intRef34 = intRef2113;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                    if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                        RouteDetailsIntentModel routeDetailsIntentModel113 = routeDetailsComponent.X;
                                        routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel113 != null ? routeDetailsIntentModel113.e : null), routeAppModel11.b, routeAppModel11.c);
                                    } else {
                                        routeDetailsComponent.g1(z37);
                                    }
                                    routeDetailsComponent.j1();
                                    routeDetailsComponent.k0 = true;
                                    if (z35) {
                                        routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons5;
            case 4:
                i = 0;
                boolean z50 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                boolean z51 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                int i32 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z52 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                List list19 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                Ref.IntRef intRef34 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef35 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel21 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel15 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeAppModel4 = routeAppModel15;
                routeDetailsIntentModel5 = routeDetailsIntentModel21;
                intRef7 = intRef35;
                intRef8 = intRef34;
                list3 = list19;
                z6 = z52;
                i5 = i32;
                z7 = z51;
                z5 = z50;
                obj3 = obj9;
                str = (String) obj3;
                if (str != null) {
                    it = routeAppModel4.e.iterator();
                    i7 = i;
                    while (true) {
                        if (!it.hasNext()) {
                            i8 = -1;
                        } else if (Intrinsics.d(((StopAppModel) it.next()).f1727a, str)) {
                            i8 = i7;
                        } else {
                            i7++;
                        }
                    }
                    routeDetailsComponent.h0 = i8;
                }
                z4 = z5;
                zBooleanValue = z7;
                i4 = i5;
                z8 = z6;
                list4 = list3;
                intRef9 = intRef8;
                intRef10 = intRef7;
                routeDetailsIntentModel6 = routeDetailsIntentModel5;
                routeAppModel5 = routeAppModel4;
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel5;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel6;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef10;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef9;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list4;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z8;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i4;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = zBooleanValue;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z4;
                routeDetailsComponent$updateInitialViewState$1.label = 5;
                objA4 = routeDetailsComponent.y.a(routeDetailsComponent$updateInitialViewState$1);
                if (objA4 != coroutineSingletons5) {
                    boolean z412 = zBooleanValue;
                    z9 = z4;
                    obj4 = objA4;
                    routeAppModel6 = routeAppModel5;
                    routeDetailsIntentModel7 = routeDetailsIntentModel6;
                    intRef11 = intRef10;
                    intRef12 = intRef9;
                    list5 = list4;
                    z10 = z8;
                    i6 = i4;
                    z11 = z412;
                    chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        livePassengerIndicatorBottomSheetDetails = null;
                    }
                    str2 = routeDetailsIntentModel7.b;
                    TrackingAdditionalFeatures trackingAdditionalFeatures9 = routeDetailsIntentModel7.h;
                    if (str2 != null) {
                        i9 = i;
                    } else {
                        i9 = i;
                    }
                    z12 = trackingAdditionalFeatures9.k;
                    z13 = trackingAdditionalFeatures9.j;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                    z14 = z9;
                    routeDetailsComponent$updateInitialViewState$1.label = 6;
                    objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                    if (objA5 != coroutineSingletons5) {
                        livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                        obj5 = objA5;
                        list6 = list5;
                        i10 = i9;
                        intRef13 = intRef12;
                        z15 = z14;
                        coroutineSingletons = coroutineSingletons5;
                        routeAppModel7 = routeAppModel6;
                        z16 = z10;
                        z17 = z12;
                        routeDetailsIntentModel8 = routeDetailsIntentModel7;
                        i11 = i6;
                        z18 = z13;
                        Ref.IntRef intRef2112 = intRef11;
                        z19 = z11;
                        intRef14 = intRef2112;
                        bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                        z20 = z18;
                        iH = basicInfoContract.h();
                        z21 = z17;
                        if (bonnetNumberToggleConfig.f2315a) {
                            int i2110 = bonnetNumberToggleConfig.b;
                            if (iH <= bonnetNumberToggleConfig.c) {
                                r7 = i;
                            } else {
                                r7 = i;
                            }
                        } else {
                            r7 = i;
                        }
                        objectRef = new Ref.ObjectRef();
                        AdTargetingProvider adTargetingProvider9 = routeDetailsComponent.A;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                        routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                        routeAppModel8 = routeAppModel7;
                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                        z21 = z21;
                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                        z20 = z20;
                        routeDetailsComponent$updateInitialViewState$1.label = 7;
                        objA6 = adTargetingProvider9.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                        coroutineSingletons5 = coroutineSingletons;
                        if (objA6 != coroutineSingletons5) {
                            Ref.IntRef intRef2113 = intRef14;
                            list7 = list6;
                            r4 = r7;
                            z22 = z20;
                            intRef15 = intRef2113;
                            intRef16 = intRef13;
                            objectRef2 = objectRef;
                            z23 = z21;
                            routeDetailsIntentModel9 = routeDetailsIntentModel8;
                            objA7 = (Map) objA6;
                            r5 = r4;
                            intRef17 = intRef16;
                            routeDetailsIntentModel10 = routeDetailsIntentModel9;
                            obj6 = objA7;
                            r22 = r5;
                            intRef18 = intRef15;
                            coroutineSingletons2 = coroutineSingletons5;
                            routeAppModel9 = routeAppModel8;
                            thA = Result.a(obj6);
                            if (thA == null) {
                                objD = obj6;
                            } else {
                                if (!(thA instanceof CancellationException)) {
                                    throw thA;
                                }
                                ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                                objD = MapsKt.d();
                            }
                            map = (Map) objD;
                            str3 = routeAppModel9.s;
                            if (str3 != null) {
                                List listU10 = StringsKt.U(str3, new String[]{","}, 6);
                                arrayList = new ArrayList(CollectionsKt.v(listU10, 10));
                                it2 = listU10.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(StringsKt.u0((String) it2.next()).toString());
                                }
                                size = arrayList.size();
                                i14 = i;
                                i15 = i14;
                                r9 = "";
                                while (i15 < size) {
                                    obj8 = arrayList.get(i15);
                                    i15++;
                                    i16 = i14 + 1;
                                    if (i14 >= 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    int i2111 = size;
                                    str4 = (String) obj8;
                                    ArrayList arrayList11 = arrayList;
                                    if (i14 == arrayList.size() - 1) {
                                        str5 = r9 + str4;
                                    } else {
                                        str5 = r9 + str4 + ", ";
                                    }
                                    r9 = str5;
                                    i14 = i16;
                                    size = i2111;
                                    arrayList = arrayList11;
                                }
                                objectRef2.element = r9;
                            }
                            AppPermission[] appPermissionArr10 = new AppPermission[1];
                            appPermissionArr10[i] = AppPermission.FINE_LOCATION;
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                            routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                            z24 = z19;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                            z25 = z15;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                            i12 = i10;
                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                            z26 = z23;
                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                            routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                            routeDetailsComponent$updateInitialViewState$1.label = 8;
                            objG = basicInfoContract.g(appPermissionArr10, routeDetailsComponent$updateInitialViewState$1);
                            if (objG == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            Ref.ObjectRef objectRef14 = objectRef2;
                            list8 = list7;
                            objectRef3 = objectRef14;
                            obj7 = objG;
                            routeDetailsIntentModel11 = routeDetailsIntentModel10;
                            z27 = z16;
                            i13 = i11;
                            z28 = z24;
                            livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                            intRef19 = intRef17;
                            z29 = z22;
                            coroutineSingletons3 = coroutineSingletons2;
                            map2 = map;
                            routeAppModel10 = routeAppModel9;
                            intRef20 = intRef18;
                            z30 = r22 == true ? 1 : 0;
                            z31 = z29;
                            zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                            routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                            routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                            routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                            routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                            routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                            routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                            routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                            routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                            routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                            routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                            routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                            routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                            routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                            z32 = z27;
                            routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                            routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                            routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                            routeDetailsComponent$updateInitialViewState$1.label = 9;
                            routeDetailsIntentModel12 = routeDetailsIntentModel11;
                            routeDetailsComponent = this;
                            objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                            coroutineSingletons4 = coroutineSingletons3;
                            if (objS == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            intRef21 = intRef20;
                            routeAppModel11 = routeAppModel10;
                            z33 = zBooleanValue2;
                            z34 = z28;
                            z35 = z32;
                            z36 = z30;
                            objectRef4 = objectRef3;
                            i17 = i13;
                            intRef22 = intRef19;
                            routeDetailsIntentModel13 = routeDetailsIntentModel12;
                            map3 = map2;
                            i18 = i12;
                            livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                            z37 = z25;
                            z38 = z26;
                            z39 = z31;
                            final boolean zBooleanValue12 = ((Boolean) objS).booleanValue();
                            if (i18 != 0) {
                                i19 = 1;
                            } else {
                                i19 = i;
                            }
                            final List list110 = list8;
                            final boolean r114 = i19;
                            routeDetailsComponent.E0(new Function1() { // from class: o31
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj10) {
                                    RouteDetailsIntentModel routeDetailsIntentModel114;
                                    RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                    RouteDetailsComponent routeDetailsComponent2;
                                    Ref.IntRef intRef2114;
                                    Ref.IntRef intRef2115;
                                    MarkerStopType markerStopType;
                                    Object next;
                                    RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                    Intrinsics.i(it3, "it");
                                    RouteAppModel routeAppModel16 = routeAppModel11;
                                    String str15 = routeAppModel16.c;
                                    List list111 = routeAppModel16.e;
                                    RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                    boolean z413 = routeDetailsComponent3.o0;
                                    String str16 = "(";
                                    String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel16.b, ")") : "");
                                    String str17 = routeAppModel16.h.b;
                                    List list112 = list111;
                                    String str18 = "";
                                    RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.v(list112, 10));
                                    Iterator it4 = list112.iterator();
                                    int i2112 = 0;
                                    while (true) {
                                        boolean zHasNext = it4.hasNext();
                                        RouteDetailsDataState routeDetailsDataState = it3;
                                        RouteDetailsIntentModel routeDetailsIntentModel115 = routeDetailsIntentModel13;
                                        String str19 = strA;
                                        boolean z414 = z37;
                                        Ref.IntRef intRef2116 = intRef21;
                                        boolean z415 = z413;
                                        Ref.IntRef intRef36 = intRef22;
                                        StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                        Object obj11 = null;
                                        if (zHasNext) {
                                            Object next2 = it4.next();
                                            int i2113 = i2112 + 1;
                                            if (i2112 < 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                            StopAppModel stopAppModel = (StopAppModel) next2;
                                            String str110 = str17;
                                            Iterator it5 = it4;
                                            boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel115.b) && r114;
                                            String str111 = stopAppModel.f1727a;
                                            String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                            int i2114 = routeDetailsComponent3.h0;
                                            boolean z417 = i2114 != -1 && i2112 > i2114;
                                            boolean z418 = i2114 == i2112;
                                            StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                            String stopId = stopAppModel.f1727a;
                                            int i2115 = intRef2116.element;
                                            int i2116 = intRef36.element;
                                            int i33 = routeDetailsComponent3.s0;
                                            TrackingAdditionalFeatures trackingAdditionalFeatures10 = routeDetailsIntentModel115.h;
                                            String str112 = str18;
                                            boolean z419 = trackingAdditionalFeatures10.l;
                                            Iterable customStopTagInfoList = trackingAdditionalFeatures10.o;
                                            if (customStopTagInfoList == null) {
                                                customStopTagInfoList = EmptyList.f17557a;
                                            }
                                            Intrinsics.i(stopId, "stopId");
                                            Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                            ArrayList arrayList13 = new ArrayList();
                                            boolean z4110 = z414 && i2112 == i2114;
                                            if (i2112 == i2115) {
                                                arrayList13.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                            } else if (i2112 == i2116) {
                                                arrayList13.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                            } else if (i2112 == i33 && z4110) {
                                                arrayList13.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                                arrayList13.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                            } else if (z4110) {
                                                arrayList13.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                            } else if (i2112 == i33 || (i2112 == i17 && z419)) {
                                                arrayList13.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                            }
                                            for (Object obj12 : customStopTagInfoList) {
                                                if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                    obj11 = obj12;
                                                    break;
                                                }
                                            }
                                            RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                            if (routeDetailsCustomStopTagInfo != null) {
                                                arrayList13.add(routeDetailsCustomStopTagInfo.b);
                                            }
                                            arrayList12.add(new RouteDetailsStopUiModel(str111, i2112, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList13, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                            it3 = routeDetailsDataState;
                                            strA = str19;
                                            z413 = z415;
                                            i2112 = i2113;
                                            routeDetailsViewType = routeDetailsViewType2;
                                            str17 = str110;
                                            it4 = it5;
                                            str18 = str112;
                                        } else {
                                            RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                            String str113 = str17;
                                            String str20 = str18;
                                            StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                            List listC1 = routeDetailsComponent3.c1();
                                            CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                            RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                            List list113 = routeAppModel16.n;
                                            ArrayList arrayList14 = new ArrayList(CollectionsKt.v(list113, 10));
                                            Iterator it6 = list113.iterator();
                                            while (it6.hasNext()) {
                                                arrayList14.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                            }
                                            String str21 = z34 ? routeAppModel16.j : null;
                                            int i34 = routeDetailsComponent3.h0;
                                            String str22 = i34 != -1 ? ((StopAppModel) list111.get(i34)).b : str20;
                                            boolean z53 = routeDetailsIntentModel115.h.i;
                                            String str23 = str21;
                                            ArrayList arrayList15 = new ArrayList(CollectionsKt.v(list112, 10));
                                            Iterator it7 = list112.iterator();
                                            int i35 = 0;
                                            while (true) {
                                                boolean zHasNext2 = it7.hasNext();
                                                Iterator it8 = it7;
                                                boolean z54 = z38;
                                                boolean z55 = z39;
                                                boolean z56 = z36;
                                                if (!zHasNext2) {
                                                    return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list111.get(0)).b, (String) objectRef4.element, routeAppModel16.t, routeDetailsViewType3, list110, arrayList12, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList14, str23, z53, z54, z55, arrayList15, null, z56, false, map3, "", false, null, false, null, zBooleanValue12, -1604474878, 60);
                                                }
                                                Object next3 = it8.next();
                                                int i36 = i35 + 1;
                                                if (i35 < 0) {
                                                    CollectionsKt.z0();
                                                    throw null;
                                                }
                                                StopAppModel stopAppModel2 = (StopAppModel) next3;
                                                ArrayList arrayList16 = arrayList14;
                                                List list114 = routeDetailsIntentModel115.h.n;
                                                if (list114 != null) {
                                                    Iterator it9 = list114.iterator();
                                                    while (true) {
                                                        if (!it9.hasNext()) {
                                                            routeDetailsIntentModel114 = routeDetailsIntentModel115;
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it9.next();
                                                        routeDetailsIntentModel114 = routeDetailsIntentModel115;
                                                        Iterator it10 = it9;
                                                        if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                            break;
                                                        }
                                                        it9 = it10;
                                                        routeDetailsIntentModel115 = routeDetailsIntentModel114;
                                                    }
                                                    routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                                } else {
                                                    routeDetailsIntentModel114 = routeDetailsIntentModel115;
                                                    routeDetailsCustomStopMarkerInfo = null;
                                                }
                                                if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                    int iK = CollectionsKt.K(list111);
                                                    int i37 = routeDetailsComponent3.h0;
                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                    int i38 = intRef2116.element;
                                                    intRef2114 = intRef2116;
                                                    int i39 = intRef36.element;
                                                    intRef2115 = intRef36;
                                                    boolean z57 = i37 != -1 && i35 > i37;
                                                    if (z35) {
                                                        if (i35 == i38) {
                                                            markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                        } else if (i35 == i39) {
                                                            markerStopType = MarkerStopType.PremiumBusDropStop;
                                                        } else {
                                                            markerStopType = (i38 + 1 > i35 || i35 >= i39) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                        }
                                                    } else if (i35 == 0) {
                                                        markerStopType = MarkerStopType.FirstStop;
                                                    } else if (i35 == iK) {
                                                        markerStopType = MarkerStopType.LastStop;
                                                    } else {
                                                        markerStopType = z57 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                    }
                                                } else {
                                                    intRef2114 = intRef2116;
                                                    routeDetailsComponent2 = routeDetailsComponent3;
                                                    intRef2115 = intRef36;
                                                }
                                                MarkerStopType markerStopType2 = markerStopType;
                                                String str24 = stopAppModel2.f1727a;
                                                String str25 = str16;
                                                StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                                notAvailable2 = notAvailable3;
                                                arrayList15.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i35 == 0, markerStopType2, stopAppModel2.c, false, z54, z55, z56));
                                                str16 = str25;
                                                arrayList14 = arrayList16;
                                                it7 = it8;
                                                i35 = i36;
                                                routeDetailsIntentModel115 = routeDetailsIntentModel114;
                                                routeDetailsComponent3 = routeDetailsComponent2;
                                                intRef2116 = intRef2114;
                                                intRef36 = intRef2115;
                                            }
                                        }
                                    }
                                }
                            });
                            if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                                RouteDetailsIntentModel routeDetailsIntentModel114 = routeDetailsComponent.X;
                                routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel114 != null ? routeDetailsIntentModel114.e : null), routeAppModel11.b, routeAppModel11.c);
                            } else {
                                routeDetailsComponent.g1(z37);
                            }
                            routeDetailsComponent.j1();
                            routeDetailsComponent.k0 = true;
                            if (z35) {
                                routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons5;
            case 5:
                i = 0;
                boolean z53 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                boolean z54 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                int i33 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z55 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                List list20 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                Ref.IntRef intRef36 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef37 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel22 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel16 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeAppModel6 = routeAppModel16;
                routeDetailsIntentModel7 = routeDetailsIntentModel22;
                intRef11 = intRef37;
                intRef12 = intRef36;
                list5 = list20;
                z10 = z55;
                i6 = i33;
                z11 = z54;
                z9 = z53;
                obj4 = obj9;
                chaloUseCaseResult = (ChaloUseCaseResult) obj4;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    livePassengerIndicatorBottomSheetDetails = (LivePassengerIndicatorBottomSheetDetails) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    livePassengerIndicatorBottomSheetDetails = null;
                }
                str2 = routeDetailsIntentModel7.b;
                TrackingAdditionalFeatures trackingAdditionalFeatures10 = routeDetailsIntentModel7.h;
                if (str2 != null) {
                    i9 = i;
                } else {
                    i9 = i;
                }
                z12 = trackingAdditionalFeatures10.k;
                z13 = trackingAdditionalFeatures10.j;
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel6;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel7;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef11;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef12;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list5;
                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z10;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i6;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = z11;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z9;
                routeDetailsComponent$updateInitialViewState$1.I$1 = i9;
                routeDetailsComponent$updateInitialViewState$1.Z$3 = z12;
                routeDetailsComponent$updateInitialViewState$1.Z$4 = z13;
                z14 = z9;
                routeDetailsComponent$updateInitialViewState$1.label = 6;
                objA5 = routeDetailsComponent.I.a(routeDetailsComponent$updateInitialViewState$1);
                if (objA5 != coroutineSingletons5) {
                    livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails;
                    obj5 = objA5;
                    list6 = list5;
                    i10 = i9;
                    intRef13 = intRef12;
                    z15 = z14;
                    coroutineSingletons = coroutineSingletons5;
                    routeAppModel7 = routeAppModel6;
                    z16 = z10;
                    z17 = z12;
                    routeDetailsIntentModel8 = routeDetailsIntentModel7;
                    i11 = i6;
                    z18 = z13;
                    Ref.IntRef intRef2114 = intRef11;
                    z19 = z11;
                    intRef14 = intRef2114;
                    bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                    z20 = z18;
                    iH = basicInfoContract.h();
                    z21 = z17;
                    if (bonnetNumberToggleConfig.f2315a) {
                        int i2112 = bonnetNumberToggleConfig.b;
                        if (iH <= bonnetNumberToggleConfig.c) {
                            r7 = i;
                        } else {
                            r7 = i;
                        }
                    } else {
                        r7 = i;
                    }
                    objectRef = new Ref.ObjectRef();
                    AdTargetingProvider adTargetingProvider10 = routeDetailsComponent.A;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                    routeAppModel8 = routeAppModel7;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                    z21 = z21;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                    z20 = z20;
                    routeDetailsComponent$updateInitialViewState$1.label = 7;
                    objA6 = adTargetingProvider10.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                    coroutineSingletons5 = coroutineSingletons;
                    if (objA6 != coroutineSingletons5) {
                        Ref.IntRef intRef2115 = intRef14;
                        list7 = list6;
                        r4 = r7;
                        z22 = z20;
                        intRef15 = intRef2115;
                        intRef16 = intRef13;
                        objectRef2 = objectRef;
                        z23 = z21;
                        routeDetailsIntentModel9 = routeDetailsIntentModel8;
                        objA7 = (Map) objA6;
                        r5 = r4;
                        intRef17 = intRef16;
                        routeDetailsIntentModel10 = routeDetailsIntentModel9;
                        obj6 = objA7;
                        r22 = r5;
                        intRef18 = intRef15;
                        coroutineSingletons2 = coroutineSingletons5;
                        routeAppModel9 = routeAppModel8;
                        thA = Result.a(obj6);
                        if (thA == null) {
                            objD = obj6;
                        } else {
                            if (!(thA instanceof CancellationException)) {
                                throw thA;
                            }
                            ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                            objD = MapsKt.d();
                        }
                        map = (Map) objD;
                        str3 = routeAppModel9.s;
                        if (str3 != null) {
                            List listU11 = StringsKt.U(str3, new String[]{","}, 6);
                            arrayList = new ArrayList(CollectionsKt.v(listU11, 10));
                            it2 = listU11.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(StringsKt.u0((String) it2.next()).toString());
                            }
                            size = arrayList.size();
                            i14 = i;
                            i15 = i14;
                            r9 = "";
                            while (i15 < size) {
                                obj8 = arrayList.get(i15);
                                i15++;
                                i16 = i14 + 1;
                                if (i14 >= 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                int i2113 = size;
                                str4 = (String) obj8;
                                ArrayList arrayList12 = arrayList;
                                if (i14 == arrayList.size() - 1) {
                                    str5 = r9 + str4;
                                } else {
                                    str5 = r9 + str4 + ", ";
                                }
                                r9 = str5;
                                i14 = i16;
                                size = i2113;
                                arrayList = arrayList12;
                            }
                            objectRef2.element = r9;
                        }
                        AppPermission[] appPermissionArr11 = new AppPermission[1];
                        appPermissionArr11[i] = AppPermission.FINE_LOCATION;
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                        routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                        z24 = z19;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                        z25 = z15;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                        i12 = i10;
                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                        z26 = z23;
                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                        routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                        routeDetailsComponent$updateInitialViewState$1.label = 8;
                        objG = basicInfoContract.g(appPermissionArr11, routeDetailsComponent$updateInitialViewState$1);
                        if (objG == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        Ref.ObjectRef objectRef15 = objectRef2;
                        list8 = list7;
                        objectRef3 = objectRef15;
                        obj7 = objG;
                        routeDetailsIntentModel11 = routeDetailsIntentModel10;
                        z27 = z16;
                        i13 = i11;
                        z28 = z24;
                        livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                        intRef19 = intRef17;
                        z29 = z22;
                        coroutineSingletons3 = coroutineSingletons2;
                        map2 = map;
                        routeAppModel10 = routeAppModel9;
                        intRef20 = intRef18;
                        z30 = r22 == true ? 1 : 0;
                        z31 = z29;
                        zBooleanValue2 = ((Boolean) obj7).booleanValue();
                        routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                        routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                        routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                        routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                        routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                        routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                        routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                        routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                        routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                        routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                        routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                        routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                        routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                        routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                        z32 = z27;
                        routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                        routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                        routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                        routeDetailsComponent$updateInitialViewState$1.label = 9;
                        routeDetailsIntentModel12 = routeDetailsIntentModel11;
                        routeDetailsComponent = this;
                        objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                        coroutineSingletons4 = coroutineSingletons3;
                        if (objS == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        intRef21 = intRef20;
                        routeAppModel11 = routeAppModel10;
                        z33 = zBooleanValue2;
                        z34 = z28;
                        z35 = z32;
                        z36 = z30;
                        objectRef4 = objectRef3;
                        i17 = i13;
                        intRef22 = intRef19;
                        routeDetailsIntentModel13 = routeDetailsIntentModel12;
                        map3 = map2;
                        i18 = i12;
                        livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                        z37 = z25;
                        z38 = z26;
                        z39 = z31;
                        final boolean zBooleanValue13 = ((Boolean) objS).booleanValue();
                        if (i18 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i;
                        }
                        final List list111 = list8;
                        final boolean r115 = i19;
                        routeDetailsComponent.E0(new Function1() { // from class: o31
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj10) {
                                RouteDetailsIntentModel routeDetailsIntentModel115;
                                RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                                RouteDetailsComponent routeDetailsComponent2;
                                Ref.IntRef intRef2116;
                                Ref.IntRef intRef2117;
                                MarkerStopType markerStopType;
                                Object next;
                                RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                                Intrinsics.i(it3, "it");
                                RouteAppModel routeAppModel17 = routeAppModel11;
                                String str15 = routeAppModel17.c;
                                List list112 = routeAppModel17.e;
                                RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                                boolean z413 = routeDetailsComponent3.o0;
                                String str16 = "(";
                                String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel17.b, ")") : "");
                                String str17 = routeAppModel17.h.b;
                                List list113 = list112;
                                String str18 = "";
                                RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                                ArrayList arrayList13 = new ArrayList(CollectionsKt.v(list113, 10));
                                Iterator it4 = list113.iterator();
                                int i2114 = 0;
                                while (true) {
                                    boolean zHasNext = it4.hasNext();
                                    RouteDetailsDataState routeDetailsDataState = it3;
                                    RouteDetailsIntentModel routeDetailsIntentModel116 = routeDetailsIntentModel13;
                                    String str19 = strA;
                                    boolean z414 = z37;
                                    Ref.IntRef intRef2118 = intRef21;
                                    boolean z415 = z413;
                                    Ref.IntRef intRef38 = intRef22;
                                    StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                    Object obj11 = null;
                                    if (zHasNext) {
                                        Object next2 = it4.next();
                                        int i2115 = i2114 + 1;
                                        if (i2114 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                        StopAppModel stopAppModel = (StopAppModel) next2;
                                        String str110 = str17;
                                        Iterator it5 = it4;
                                        boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel116.b) && r115;
                                        String str111 = stopAppModel.f1727a;
                                        String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                        int i2116 = routeDetailsComponent3.h0;
                                        boolean z417 = i2116 != -1 && i2114 > i2116;
                                        boolean z418 = i2116 == i2114;
                                        StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                        String stopId = stopAppModel.f1727a;
                                        int i2117 = intRef2118.element;
                                        int i2118 = intRef38.element;
                                        int i34 = routeDetailsComponent3.s0;
                                        TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel116.h;
                                        String str112 = str18;
                                        boolean z419 = trackingAdditionalFeatures11.l;
                                        Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                        if (customStopTagInfoList == null) {
                                            customStopTagInfoList = EmptyList.f17557a;
                                        }
                                        Intrinsics.i(stopId, "stopId");
                                        Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                        ArrayList arrayList14 = new ArrayList();
                                        boolean z4110 = z414 && i2114 == i2116;
                                        if (i2114 == i2117) {
                                            arrayList14.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                        } else if (i2114 == i2118) {
                                            arrayList14.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                        } else if (i2114 == i34 && z4110) {
                                            arrayList14.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                            arrayList14.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                        } else if (z4110) {
                                            arrayList14.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                        } else if (i2114 == i34 || (i2114 == i17 && z419)) {
                                            arrayList14.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                        }
                                        for (Object obj12 : customStopTagInfoList) {
                                            if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                                obj11 = obj12;
                                                break;
                                            }
                                        }
                                        RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                        if (routeDetailsCustomStopTagInfo != null) {
                                            arrayList14.add(routeDetailsCustomStopTagInfo.b);
                                        }
                                        arrayList13.add(new RouteDetailsStopUiModel(str111, i2114, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList14, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                        it3 = routeDetailsDataState;
                                        strA = str19;
                                        z413 = z415;
                                        i2114 = i2115;
                                        routeDetailsViewType = routeDetailsViewType2;
                                        str17 = str110;
                                        it4 = it5;
                                        str18 = str112;
                                    } else {
                                        RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                        String str113 = str17;
                                        String str20 = str18;
                                        StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                        List listC1 = routeDetailsComponent3.c1();
                                        CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                        RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                        List list114 = routeAppModel17.n;
                                        ArrayList arrayList15 = new ArrayList(CollectionsKt.v(list114, 10));
                                        Iterator it6 = list114.iterator();
                                        while (it6.hasNext()) {
                                            arrayList15.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                        }
                                        String str21 = z34 ? routeAppModel17.j : null;
                                        int i35 = routeDetailsComponent3.h0;
                                        String str22 = i35 != -1 ? ((StopAppModel) list112.get(i35)).b : str20;
                                        boolean z56 = routeDetailsIntentModel116.h.i;
                                        String str23 = str21;
                                        ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list113, 10));
                                        Iterator it7 = list113.iterator();
                                        int i36 = 0;
                                        while (true) {
                                            boolean zHasNext2 = it7.hasNext();
                                            Iterator it8 = it7;
                                            boolean z57 = z38;
                                            boolean z58 = z39;
                                            boolean z59 = z36;
                                            if (!zHasNext2) {
                                                return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list112.get(0)).b, (String) objectRef4.element, routeAppModel17.t, routeDetailsViewType3, list111, arrayList13, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList15, str23, z56, z57, z58, arrayList16, null, z59, false, map3, "", false, null, false, null, zBooleanValue13, -1604474878, 60);
                                            }
                                            Object next3 = it8.next();
                                            int i37 = i36 + 1;
                                            if (i36 < 0) {
                                                CollectionsKt.z0();
                                                throw null;
                                            }
                                            StopAppModel stopAppModel2 = (StopAppModel) next3;
                                            ArrayList arrayList17 = arrayList15;
                                            List list115 = routeDetailsIntentModel116.h.n;
                                            if (list115 != null) {
                                                Iterator it9 = list115.iterator();
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        routeDetailsIntentModel115 = routeDetailsIntentModel116;
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it9.next();
                                                    routeDetailsIntentModel115 = routeDetailsIntentModel116;
                                                    Iterator it10 = it9;
                                                    if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                        break;
                                                    }
                                                    it9 = it10;
                                                    routeDetailsIntentModel116 = routeDetailsIntentModel115;
                                                }
                                                routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                            } else {
                                                routeDetailsIntentModel115 = routeDetailsIntentModel116;
                                                routeDetailsCustomStopMarkerInfo = null;
                                            }
                                            if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                                int iK = CollectionsKt.K(list112);
                                                int i38 = routeDetailsComponent3.h0;
                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                int i39 = intRef2118.element;
                                                intRef2116 = intRef2118;
                                                int i310 = intRef38.element;
                                                intRef2117 = intRef38;
                                                boolean z510 = i38 != -1 && i36 > i38;
                                                if (z35) {
                                                    if (i36 == i39) {
                                                        markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                    } else if (i36 == i310) {
                                                        markerStopType = MarkerStopType.PremiumBusDropStop;
                                                    } else {
                                                        markerStopType = (i39 + 1 > i36 || i36 >= i310) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                    }
                                                } else if (i36 == 0) {
                                                    markerStopType = MarkerStopType.FirstStop;
                                                } else if (i36 == iK) {
                                                    markerStopType = MarkerStopType.LastStop;
                                                } else {
                                                    markerStopType = z510 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                }
                                            } else {
                                                intRef2116 = intRef2118;
                                                routeDetailsComponent2 = routeDetailsComponent3;
                                                intRef2117 = intRef38;
                                            }
                                            MarkerStopType markerStopType2 = markerStopType;
                                            String str24 = stopAppModel2.f1727a;
                                            String str25 = str16;
                                            StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                            notAvailable2 = notAvailable3;
                                            arrayList16.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i36 == 0, markerStopType2, stopAppModel2.c, false, z57, z58, z59));
                                            str16 = str25;
                                            arrayList15 = arrayList17;
                                            it7 = it8;
                                            i36 = i37;
                                            routeDetailsIntentModel116 = routeDetailsIntentModel115;
                                            routeDetailsComponent3 = routeDetailsComponent2;
                                            intRef2118 = intRef2116;
                                            intRef38 = intRef2117;
                                        }
                                    }
                                }
                            }
                        });
                        if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                            RouteDetailsIntentModel routeDetailsIntentModel115 = routeDetailsComponent.X;
                            routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel115 != null ? routeDetailsIntentModel115.e : null), routeAppModel11.b, routeAppModel11.c);
                        } else {
                            routeDetailsComponent.g1(z37);
                        }
                        routeDetailsComponent.j1();
                        routeDetailsComponent.k0 = true;
                        if (z35) {
                            routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons5;
            case 6:
                i = 0;
                boolean z56 = routeDetailsComponent$updateInitialViewState$1.Z$4;
                boolean z57 = routeDetailsComponent$updateInitialViewState$1.Z$3;
                int i34 = routeDetailsComponent$updateInitialViewState$1.I$1;
                boolean z58 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                boolean z59 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                int i35 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z60 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails5 = (LivePassengerIndicatorBottomSheetDetails) routeDetailsComponent$updateInitialViewState$1.L$5;
                List list21 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                intRef13 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef38 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel23 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel17 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeAppModel7 = routeAppModel17;
                obj5 = obj9;
                routeDetailsIntentModel8 = routeDetailsIntentModel23;
                intRef14 = intRef38;
                livePassengerIndicatorBottomSheetDetails2 = livePassengerIndicatorBottomSheetDetails5;
                i11 = i35;
                z15 = z58;
                z17 = z57;
                list6 = list21;
                z16 = z60;
                z19 = z59;
                i10 = i34;
                z18 = z56;
                coroutineSingletons = coroutineSingletons5;
                bonnetNumberToggleConfig = ((MiscellaneousCityWiseConfigForCity) obj5).b;
                z20 = z18;
                iH = basicInfoContract.h();
                z21 = z17;
                if (bonnetNumberToggleConfig.f2315a) {
                    int i2114 = bonnetNumberToggleConfig.b;
                    if (iH <= bonnetNumberToggleConfig.c) {
                        r7 = i;
                    } else {
                        r7 = i;
                    }
                } else {
                    r7 = i;
                }
                objectRef = new Ref.ObjectRef();
                AdTargetingProvider adTargetingProvider11 = routeDetailsComponent.A;
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel7;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel8;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef14;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef13;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list6;
                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = z19;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z15;
                routeDetailsComponent$updateInitialViewState$1.I$1 = i10;
                routeAppModel8 = routeAppModel7;
                routeDetailsComponent$updateInitialViewState$1.Z$3 = z21;
                z21 = z21;
                routeDetailsComponent$updateInitialViewState$1.Z$4 = z20;
                routeDetailsComponent$updateInitialViewState$1.Z$5 = r7;
                z20 = z20;
                routeDetailsComponent$updateInitialViewState$1.label = 7;
                objA6 = adTargetingProvider11.a(MapsKt.d(), routeDetailsComponent$updateInitialViewState$1);
                coroutineSingletons5 = coroutineSingletons;
                if (objA6 != coroutineSingletons5) {
                    Ref.IntRef intRef2116 = intRef14;
                    list7 = list6;
                    r4 = r7;
                    z22 = z20;
                    intRef15 = intRef2116;
                    intRef16 = intRef13;
                    objectRef2 = objectRef;
                    z23 = z21;
                    routeDetailsIntentModel9 = routeDetailsIntentModel8;
                    objA7 = (Map) objA6;
                    r5 = r4;
                    intRef17 = intRef16;
                    routeDetailsIntentModel10 = routeDetailsIntentModel9;
                    obj6 = objA7;
                    r22 = r5;
                    intRef18 = intRef15;
                    coroutineSingletons2 = coroutineSingletons5;
                    routeAppModel9 = routeAppModel8;
                    thA = Result.a(obj6);
                    if (thA == null) {
                        objD = obj6;
                    } else {
                        if (!(thA instanceof CancellationException)) {
                            throw thA;
                        }
                        ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                        objD = MapsKt.d();
                    }
                    map = (Map) objD;
                    str3 = routeAppModel9.s;
                    if (str3 != null) {
                        List listU12 = StringsKt.U(str3, new String[]{","}, 6);
                        arrayList = new ArrayList(CollectionsKt.v(listU12, 10));
                        it2 = listU12.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(StringsKt.u0((String) it2.next()).toString());
                        }
                        size = arrayList.size();
                        i14 = i;
                        i15 = i14;
                        r9 = "";
                        while (i15 < size) {
                            obj8 = arrayList.get(i15);
                            i15++;
                            i16 = i14 + 1;
                            if (i14 >= 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            int i2115 = size;
                            str4 = (String) obj8;
                            ArrayList arrayList13 = arrayList;
                            if (i14 == arrayList.size() - 1) {
                                str5 = r9 + str4;
                            } else {
                                str5 = r9 + str4 + ", ";
                            }
                            r9 = str5;
                            i14 = i16;
                            size = i2115;
                            arrayList = arrayList13;
                        }
                        objectRef2.element = r9;
                    }
                    AppPermission[] appPermissionArr12 = new AppPermission[1];
                    appPermissionArr12[i] = AppPermission.FINE_LOCATION;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                    routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                    z24 = z19;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                    z25 = z15;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                    i12 = i10;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                    z26 = z23;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                    routeDetailsComponent$updateInitialViewState$1.label = 8;
                    objG = basicInfoContract.g(appPermissionArr12, routeDetailsComponent$updateInitialViewState$1);
                    if (objG == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    Ref.ObjectRef objectRef16 = objectRef2;
                    list8 = list7;
                    objectRef3 = objectRef16;
                    obj7 = objG;
                    routeDetailsIntentModel11 = routeDetailsIntentModel10;
                    z27 = z16;
                    i13 = i11;
                    z28 = z24;
                    livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                    intRef19 = intRef17;
                    z29 = z22;
                    coroutineSingletons3 = coroutineSingletons2;
                    map2 = map;
                    routeAppModel10 = routeAppModel9;
                    intRef20 = intRef18;
                    z30 = r22 == true ? 1 : 0;
                    z31 = z29;
                    zBooleanValue2 = ((Boolean) obj7).booleanValue();
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                    routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                    z32 = z27;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                    routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                    routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                    routeDetailsComponent$updateInitialViewState$1.label = 9;
                    routeDetailsIntentModel12 = routeDetailsIntentModel11;
                    routeDetailsComponent = this;
                    objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                    coroutineSingletons4 = coroutineSingletons3;
                    if (objS == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    intRef21 = intRef20;
                    routeAppModel11 = routeAppModel10;
                    z33 = zBooleanValue2;
                    z34 = z28;
                    z35 = z32;
                    z36 = z30;
                    objectRef4 = objectRef3;
                    i17 = i13;
                    intRef22 = intRef19;
                    routeDetailsIntentModel13 = routeDetailsIntentModel12;
                    map3 = map2;
                    i18 = i12;
                    livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                    z37 = z25;
                    z38 = z26;
                    z39 = z31;
                    final boolean zBooleanValue14 = ((Boolean) objS).booleanValue();
                    if (i18 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                    final List list112 = list8;
                    final boolean r116 = i19;
                    routeDetailsComponent.E0(new Function1() { // from class: o31
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            RouteDetailsIntentModel routeDetailsIntentModel116;
                            RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                            RouteDetailsComponent routeDetailsComponent2;
                            Ref.IntRef intRef2117;
                            Ref.IntRef intRef2118;
                            MarkerStopType markerStopType;
                            Object next;
                            RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                            Intrinsics.i(it3, "it");
                            RouteAppModel routeAppModel18 = routeAppModel11;
                            String str15 = routeAppModel18.c;
                            List list113 = routeAppModel18.e;
                            RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                            boolean z413 = routeDetailsComponent3.o0;
                            String str16 = "(";
                            String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel18.b, ")") : "");
                            String str17 = routeAppModel18.h.b;
                            List list114 = list113;
                            String str18 = "";
                            RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                            ArrayList arrayList14 = new ArrayList(CollectionsKt.v(list114, 10));
                            Iterator it4 = list114.iterator();
                            int i2116 = 0;
                            while (true) {
                                boolean zHasNext = it4.hasNext();
                                RouteDetailsDataState routeDetailsDataState = it3;
                                RouteDetailsIntentModel routeDetailsIntentModel117 = routeDetailsIntentModel13;
                                String str19 = strA;
                                boolean z414 = z37;
                                Ref.IntRef intRef2119 = intRef21;
                                boolean z415 = z413;
                                Ref.IntRef intRef39 = intRef22;
                                StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                Object obj11 = null;
                                if (zHasNext) {
                                    Object next2 = it4.next();
                                    int i2117 = i2116 + 1;
                                    if (i2116 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                    StopAppModel stopAppModel = (StopAppModel) next2;
                                    String str110 = str17;
                                    Iterator it5 = it4;
                                    boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel117.b) && r116;
                                    String str111 = stopAppModel.f1727a;
                                    String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                    int i2118 = routeDetailsComponent3.h0;
                                    boolean z417 = i2118 != -1 && i2116 > i2118;
                                    boolean z418 = i2118 == i2116;
                                    StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                    String stopId = stopAppModel.f1727a;
                                    int i2119 = intRef2119.element;
                                    int i21110 = intRef39.element;
                                    int i36 = routeDetailsComponent3.s0;
                                    TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel117.h;
                                    String str112 = str18;
                                    boolean z419 = trackingAdditionalFeatures11.l;
                                    Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                    if (customStopTagInfoList == null) {
                                        customStopTagInfoList = EmptyList.f17557a;
                                    }
                                    Intrinsics.i(stopId, "stopId");
                                    Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                    ArrayList arrayList15 = new ArrayList();
                                    boolean z4110 = z414 && i2116 == i2118;
                                    if (i2116 == i2119) {
                                        arrayList15.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                    } else if (i2116 == i21110) {
                                        arrayList15.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                    } else if (i2116 == i36 && z4110) {
                                        arrayList15.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                        arrayList15.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                    } else if (z4110) {
                                        arrayList15.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                    } else if (i2116 == i36 || (i2116 == i17 && z419)) {
                                        arrayList15.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                    }
                                    for (Object obj12 : customStopTagInfoList) {
                                        if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                            obj11 = obj12;
                                            break;
                                        }
                                    }
                                    RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                    if (routeDetailsCustomStopTagInfo != null) {
                                        arrayList15.add(routeDetailsCustomStopTagInfo.b);
                                    }
                                    arrayList14.add(new RouteDetailsStopUiModel(str111, i2116, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList15, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                    it3 = routeDetailsDataState;
                                    strA = str19;
                                    z413 = z415;
                                    i2116 = i2117;
                                    routeDetailsViewType = routeDetailsViewType2;
                                    str17 = str110;
                                    it4 = it5;
                                    str18 = str112;
                                } else {
                                    RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                    String str113 = str17;
                                    String str20 = str18;
                                    StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                    List listC1 = routeDetailsComponent3.c1();
                                    CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                    RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                    List list115 = routeAppModel18.n;
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list115, 10));
                                    Iterator it6 = list115.iterator();
                                    while (it6.hasNext()) {
                                        arrayList16.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                    }
                                    String str21 = z34 ? routeAppModel18.j : null;
                                    int i37 = routeDetailsComponent3.h0;
                                    String str22 = i37 != -1 ? ((StopAppModel) list113.get(i37)).b : str20;
                                    boolean z510 = routeDetailsIntentModel117.h.i;
                                    String str23 = str21;
                                    ArrayList arrayList17 = new ArrayList(CollectionsKt.v(list114, 10));
                                    Iterator it7 = list114.iterator();
                                    int i38 = 0;
                                    while (true) {
                                        boolean zHasNext2 = it7.hasNext();
                                        Iterator it8 = it7;
                                        boolean z511 = z38;
                                        boolean z512 = z39;
                                        boolean z513 = z36;
                                        if (!zHasNext2) {
                                            return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list113.get(0)).b, (String) objectRef4.element, routeAppModel18.t, routeDetailsViewType3, list112, arrayList14, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList16, str23, z510, z511, z512, arrayList17, null, z513, false, map3, "", false, null, false, null, zBooleanValue14, -1604474878, 60);
                                        }
                                        Object next3 = it8.next();
                                        int i39 = i38 + 1;
                                        if (i38 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        StopAppModel stopAppModel2 = (StopAppModel) next3;
                                        ArrayList arrayList18 = arrayList16;
                                        List list116 = routeDetailsIntentModel117.h.n;
                                        if (list116 != null) {
                                            Iterator it9 = list116.iterator();
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    routeDetailsIntentModel116 = routeDetailsIntentModel117;
                                                    next = null;
                                                    break;
                                                }
                                                next = it9.next();
                                                routeDetailsIntentModel116 = routeDetailsIntentModel117;
                                                Iterator it10 = it9;
                                                if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                    break;
                                                }
                                                it9 = it10;
                                                routeDetailsIntentModel117 = routeDetailsIntentModel116;
                                            }
                                            routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                        } else {
                                            routeDetailsIntentModel116 = routeDetailsIntentModel117;
                                            routeDetailsCustomStopMarkerInfo = null;
                                        }
                                        if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                            int iK = CollectionsKt.K(list113);
                                            int i310 = routeDetailsComponent3.h0;
                                            routeDetailsComponent2 = routeDetailsComponent3;
                                            int i311 = intRef2119.element;
                                            intRef2117 = intRef2119;
                                            int i312 = intRef39.element;
                                            intRef2118 = intRef39;
                                            boolean z514 = i310 != -1 && i38 > i310;
                                            if (z35) {
                                                if (i38 == i311) {
                                                    markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                } else if (i38 == i312) {
                                                    markerStopType = MarkerStopType.PremiumBusDropStop;
                                                } else {
                                                    markerStopType = (i311 + 1 > i38 || i38 >= i312) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                }
                                            } else if (i38 == 0) {
                                                markerStopType = MarkerStopType.FirstStop;
                                            } else if (i38 == iK) {
                                                markerStopType = MarkerStopType.LastStop;
                                            } else {
                                                markerStopType = z514 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                            }
                                        } else {
                                            intRef2117 = intRef2119;
                                            routeDetailsComponent2 = routeDetailsComponent3;
                                            intRef2118 = intRef39;
                                        }
                                        MarkerStopType markerStopType2 = markerStopType;
                                        String str24 = stopAppModel2.f1727a;
                                        String str25 = str16;
                                        StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                        notAvailable2 = notAvailable3;
                                        arrayList17.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i38 == 0, markerStopType2, stopAppModel2.c, false, z511, z512, z513));
                                        str16 = str25;
                                        arrayList16 = arrayList18;
                                        it7 = it8;
                                        i38 = i39;
                                        routeDetailsIntentModel117 = routeDetailsIntentModel116;
                                        routeDetailsComponent3 = routeDetailsComponent2;
                                        intRef2119 = intRef2117;
                                        intRef39 = intRef2118;
                                    }
                                }
                            }
                        }
                    });
                    if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                        RouteDetailsIntentModel routeDetailsIntentModel116 = routeDetailsComponent.X;
                        routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel116 != null ? routeDetailsIntentModel116.e : null), routeAppModel11.b, routeAppModel11.c);
                    } else {
                        routeDetailsComponent.g1(z37);
                    }
                    routeDetailsComponent.j1();
                    routeDetailsComponent.k0 = true;
                    if (z35) {
                        routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons5;
            case 7:
                i = 0;
                r4 = routeDetailsComponent$updateInitialViewState$1.Z$5;
                z22 = routeDetailsComponent$updateInitialViewState$1.Z$4;
                z23 = routeDetailsComponent$updateInitialViewState$1.Z$3;
                i10 = routeDetailsComponent$updateInitialViewState$1.I$1;
                z15 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                z19 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                i11 = routeDetailsComponent$updateInitialViewState$1.I$0;
                z16 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                objectRef2 = (Ref.ObjectRef) routeDetailsComponent$updateInitialViewState$1.L$6;
                livePassengerIndicatorBottomSheetDetails2 = (LivePassengerIndicatorBottomSheetDetails) routeDetailsComponent$updateInitialViewState$1.L$5;
                List list22 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                intRef16 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                intRef15 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                routeDetailsIntentModel9 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                routeAppModel8 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                try {
                    ResultKt.b(obj9);
                    objA6 = obj9;
                    list7 = list22;
                    basicInfoContract = basicInfoContract;
                    r4 = r4;
                    objA7 = (Map) objA6;
                    r5 = r4;
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    basicInfoContract = basicInfoContract;
                    list7 = list22;
                    objA7 = ResultKt.a(th);
                    r5 = r4;
                    intRef17 = intRef16;
                    routeDetailsIntentModel10 = routeDetailsIntentModel9;
                    obj6 = objA7;
                    r22 = r5;
                    intRef18 = intRef15;
                    coroutineSingletons2 = coroutineSingletons5;
                    routeAppModel9 = routeAppModel8;
                    thA = Result.a(obj6);
                    if (thA == null) {
                        objD = obj6;
                    } else {
                        if (!(thA instanceof CancellationException)) {
                            throw thA;
                        }
                        ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                        objD = MapsKt.d();
                    }
                    map = (Map) objD;
                    str3 = routeAppModel9.s;
                    if (str3 != null) {
                        List listU13 = StringsKt.U(str3, new String[]{","}, 6);
                        arrayList = new ArrayList(CollectionsKt.v(listU13, 10));
                        it2 = listU13.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(StringsKt.u0((String) it2.next()).toString());
                        }
                        size = arrayList.size();
                        i14 = i;
                        i15 = i14;
                        r9 = "";
                        while (i15 < size) {
                            obj8 = arrayList.get(i15);
                            i15++;
                            i16 = i14 + 1;
                            if (i14 >= 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            int i2116 = size;
                            str4 = (String) obj8;
                            ArrayList arrayList14 = arrayList;
                            if (i14 == arrayList.size() - 1) {
                                str5 = r9 + str4;
                            } else {
                                str5 = r9 + str4 + ", ";
                            }
                            r9 = str5;
                            i14 = i16;
                            size = i2116;
                            arrayList = arrayList14;
                        }
                        objectRef2.element = r9;
                    }
                    AppPermission[] appPermissionArr13 = new AppPermission[1];
                    appPermissionArr13[i] = AppPermission.FINE_LOCATION;
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                    routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                    z24 = z19;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                    z25 = z15;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                    i12 = i10;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                    z26 = z23;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                    routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                    routeDetailsComponent$updateInitialViewState$1.label = 8;
                    objG = basicInfoContract.g(appPermissionArr13, routeDetailsComponent$updateInitialViewState$1);
                    if (objG == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    Ref.ObjectRef objectRef17 = objectRef2;
                    list8 = list7;
                    objectRef3 = objectRef17;
                    obj7 = objG;
                    routeDetailsIntentModel11 = routeDetailsIntentModel10;
                    z27 = z16;
                    i13 = i11;
                    z28 = z24;
                    livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                    intRef19 = intRef17;
                    z29 = z22;
                    coroutineSingletons3 = coroutineSingletons2;
                    map2 = map;
                    routeAppModel10 = routeAppModel9;
                    intRef20 = intRef18;
                    z30 = r22 == true ? 1 : 0;
                    z31 = z29;
                    zBooleanValue2 = ((Boolean) obj7).booleanValue();
                    routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                    routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                    routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                    routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                    routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                    routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                    routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                    routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                    routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                    routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                    routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                    routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                    routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                    routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                    z32 = z27;
                    routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                    routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                    routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                    routeDetailsComponent$updateInitialViewState$1.label = 9;
                    routeDetailsIntentModel12 = routeDetailsIntentModel11;
                    routeDetailsComponent = this;
                    objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                    coroutineSingletons4 = coroutineSingletons3;
                    if (objS == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    intRef21 = intRef20;
                    routeAppModel11 = routeAppModel10;
                    z33 = zBooleanValue2;
                    z34 = z28;
                    z35 = z32;
                    z36 = z30;
                    objectRef4 = objectRef3;
                    i17 = i13;
                    intRef22 = intRef19;
                    routeDetailsIntentModel13 = routeDetailsIntentModel12;
                    map3 = map2;
                    i18 = i12;
                    livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                    z37 = z25;
                    z38 = z26;
                    z39 = z31;
                    final boolean zBooleanValue15 = ((Boolean) objS).booleanValue();
                    if (i18 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i;
                    }
                    final List list113 = list8;
                    final boolean r117 = i19;
                    routeDetailsComponent.E0(new Function1() { // from class: o31
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            RouteDetailsIntentModel routeDetailsIntentModel117;
                            RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                            RouteDetailsComponent routeDetailsComponent2;
                            Ref.IntRef intRef2117;
                            Ref.IntRef intRef2118;
                            MarkerStopType markerStopType;
                            Object next;
                            RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                            Intrinsics.i(it3, "it");
                            RouteAppModel routeAppModel18 = routeAppModel11;
                            String str15 = routeAppModel18.c;
                            List list114 = routeAppModel18.e;
                            RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                            boolean z413 = routeDetailsComponent3.o0;
                            String str16 = "(";
                            String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel18.b, ")") : "");
                            String str17 = routeAppModel18.h.b;
                            List list115 = list114;
                            String str18 = "";
                            RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                            ArrayList arrayList15 = new ArrayList(CollectionsKt.v(list115, 10));
                            Iterator it4 = list115.iterator();
                            int i2117 = 0;
                            while (true) {
                                boolean zHasNext = it4.hasNext();
                                RouteDetailsDataState routeDetailsDataState = it3;
                                RouteDetailsIntentModel routeDetailsIntentModel118 = routeDetailsIntentModel13;
                                String str19 = strA;
                                boolean z414 = z37;
                                Ref.IntRef intRef2119 = intRef21;
                                boolean z415 = z413;
                                Ref.IntRef intRef39 = intRef22;
                                StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                                Object obj11 = null;
                                if (zHasNext) {
                                    Object next2 = it4.next();
                                    int i2118 = i2117 + 1;
                                    if (i2117 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                    StopAppModel stopAppModel = (StopAppModel) next2;
                                    String str110 = str17;
                                    Iterator it5 = it4;
                                    boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel118.b) && r117;
                                    String str111 = stopAppModel.f1727a;
                                    String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                    int i2119 = routeDetailsComponent3.h0;
                                    boolean z417 = i2119 != -1 && i2117 > i2119;
                                    boolean z418 = i2119 == i2117;
                                    StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                    String stopId = stopAppModel.f1727a;
                                    int i21110 = intRef2119.element;
                                    int i21111 = intRef39.element;
                                    int i36 = routeDetailsComponent3.s0;
                                    TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel118.h;
                                    String str112 = str18;
                                    boolean z419 = trackingAdditionalFeatures11.l;
                                    Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                    if (customStopTagInfoList == null) {
                                        customStopTagInfoList = EmptyList.f17557a;
                                    }
                                    Intrinsics.i(stopId, "stopId");
                                    Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                    ArrayList arrayList16 = new ArrayList();
                                    boolean z4110 = z414 && i2117 == i2119;
                                    if (i2117 == i21110) {
                                        arrayList16.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                    } else if (i2117 == i21111) {
                                        arrayList16.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                    } else if (i2117 == i36 && z4110) {
                                        arrayList16.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                        arrayList16.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                    } else if (z4110) {
                                        arrayList16.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                    } else if (i2117 == i36 || (i2117 == i17 && z419)) {
                                        arrayList16.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                    }
                                    for (Object obj12 : customStopTagInfoList) {
                                        if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                            obj11 = obj12;
                                            break;
                                        }
                                    }
                                    RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                    if (routeDetailsCustomStopTagInfo != null) {
                                        arrayList16.add(routeDetailsCustomStopTagInfo.b);
                                    }
                                    arrayList15.add(new RouteDetailsStopUiModel(str111, i2117, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList16, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                    it3 = routeDetailsDataState;
                                    strA = str19;
                                    z413 = z415;
                                    i2117 = i2118;
                                    routeDetailsViewType = routeDetailsViewType2;
                                    str17 = str110;
                                    it4 = it5;
                                    str18 = str112;
                                } else {
                                    RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                    String str113 = str17;
                                    String str20 = str18;
                                    StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                    List listC1 = routeDetailsComponent3.c1();
                                    CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                    RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                    List list116 = routeAppModel18.n;
                                    ArrayList arrayList17 = new ArrayList(CollectionsKt.v(list116, 10));
                                    Iterator it6 = list116.iterator();
                                    while (it6.hasNext()) {
                                        arrayList17.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                    }
                                    String str21 = z34 ? routeAppModel18.j : null;
                                    int i37 = routeDetailsComponent3.h0;
                                    String str22 = i37 != -1 ? ((StopAppModel) list114.get(i37)).b : str20;
                                    boolean z510 = routeDetailsIntentModel118.h.i;
                                    String str23 = str21;
                                    ArrayList arrayList18 = new ArrayList(CollectionsKt.v(list115, 10));
                                    Iterator it7 = list115.iterator();
                                    int i38 = 0;
                                    while (true) {
                                        boolean zHasNext2 = it7.hasNext();
                                        Iterator it8 = it7;
                                        boolean z511 = z38;
                                        boolean z512 = z39;
                                        boolean z513 = z36;
                                        if (!zHasNext2) {
                                            return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list114.get(0)).b, (String) objectRef4.element, routeAppModel18.t, routeDetailsViewType3, list113, arrayList15, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList17, str23, z510, z511, z512, arrayList18, null, z513, false, map3, "", false, null, false, null, zBooleanValue15, -1604474878, 60);
                                        }
                                        Object next3 = it8.next();
                                        int i39 = i38 + 1;
                                        if (i38 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        StopAppModel stopAppModel2 = (StopAppModel) next3;
                                        ArrayList arrayList19 = arrayList17;
                                        List list117 = routeDetailsIntentModel118.h.n;
                                        if (list117 != null) {
                                            Iterator it9 = list117.iterator();
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    routeDetailsIntentModel117 = routeDetailsIntentModel118;
                                                    next = null;
                                                    break;
                                                }
                                                next = it9.next();
                                                routeDetailsIntentModel117 = routeDetailsIntentModel118;
                                                Iterator it10 = it9;
                                                if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                    break;
                                                }
                                                it9 = it10;
                                                routeDetailsIntentModel118 = routeDetailsIntentModel117;
                                            }
                                            routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                        } else {
                                            routeDetailsIntentModel117 = routeDetailsIntentModel118;
                                            routeDetailsCustomStopMarkerInfo = null;
                                        }
                                        if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                            int iK = CollectionsKt.K(list114);
                                            int i310 = routeDetailsComponent3.h0;
                                            routeDetailsComponent2 = routeDetailsComponent3;
                                            int i311 = intRef2119.element;
                                            intRef2117 = intRef2119;
                                            int i312 = intRef39.element;
                                            intRef2118 = intRef39;
                                            boolean z514 = i310 != -1 && i38 > i310;
                                            if (z35) {
                                                if (i38 == i311) {
                                                    markerStopType = MarkerStopType.PremiumBusPickupStop;
                                                } else if (i38 == i312) {
                                                    markerStopType = MarkerStopType.PremiumBusDropStop;
                                                } else {
                                                    markerStopType = (i311 + 1 > i38 || i38 >= i312) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                                }
                                            } else if (i38 == 0) {
                                                markerStopType = MarkerStopType.FirstStop;
                                            } else if (i38 == iK) {
                                                markerStopType = MarkerStopType.LastStop;
                                            } else {
                                                markerStopType = z514 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                            }
                                        } else {
                                            intRef2117 = intRef2119;
                                            routeDetailsComponent2 = routeDetailsComponent3;
                                            intRef2118 = intRef39;
                                        }
                                        MarkerStopType markerStopType2 = markerStopType;
                                        String str24 = stopAppModel2.f1727a;
                                        String str25 = str16;
                                        StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                        notAvailable2 = notAvailable3;
                                        arrayList18.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i38 == 0, markerStopType2, stopAppModel2.c, false, z511, z512, z513));
                                        str16 = str25;
                                        arrayList17 = arrayList19;
                                        it7 = it8;
                                        i38 = i39;
                                        routeDetailsIntentModel118 = routeDetailsIntentModel117;
                                        routeDetailsComponent3 = routeDetailsComponent2;
                                        intRef2119 = intRef2117;
                                        intRef39 = intRef2118;
                                    }
                                }
                            }
                        }
                    });
                    if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                        RouteDetailsIntentModel routeDetailsIntentModel117 = routeDetailsComponent.X;
                        routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel117 != null ? routeDetailsIntentModel117.e : null), routeAppModel11.b, routeAppModel11.c);
                    } else {
                        routeDetailsComponent.g1(z37);
                    }
                    routeDetailsComponent.j1();
                    routeDetailsComponent.k0 = true;
                    if (z35) {
                        routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                    }
                    return Unit.f17538a;
                }
                intRef17 = intRef16;
                routeDetailsIntentModel10 = routeDetailsIntentModel9;
                obj6 = objA7;
                r22 = r5;
                intRef18 = intRef15;
                coroutineSingletons2 = coroutineSingletons5;
                routeAppModel9 = routeAppModel8;
                thA = Result.a(obj6);
                if (thA == null) {
                    objD = obj6;
                } else {
                    if (!(thA instanceof CancellationException)) {
                        throw thA;
                    }
                    ChaloLog.c("RouteDetailsAd", "failed to build ad targeting", thA);
                    objD = MapsKt.d();
                }
                map = (Map) objD;
                str3 = routeAppModel9.s;
                if (str3 != null) {
                    List listU14 = StringsKt.U(str3, new String[]{","}, 6);
                    arrayList = new ArrayList(CollectionsKt.v(listU14, 10));
                    it2 = listU14.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(StringsKt.u0((String) it2.next()).toString());
                    }
                    size = arrayList.size();
                    i14 = i;
                    i15 = i14;
                    r9 = "";
                    while (i15 < size) {
                        obj8 = arrayList.get(i15);
                        i15++;
                        i16 = i14 + 1;
                        if (i14 >= 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        int i2117 = size;
                        str4 = (String) obj8;
                        ArrayList arrayList15 = arrayList;
                        if (i14 == arrayList.size() - 1) {
                            str5 = r9 + str4;
                        } else {
                            str5 = r9 + str4 + ", ";
                        }
                        r9 = str5;
                        i14 = i16;
                        size = i2117;
                        arrayList = arrayList15;
                    }
                    objectRef2.element = r9;
                }
                AppPermission[] appPermissionArr14 = new AppPermission[1];
                appPermissionArr14[i] = AppPermission.FINE_LOCATION;
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel9;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel10;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef18;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef17;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list7;
                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails2;
                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef2;
                routeDetailsComponent$updateInitialViewState$1.L$7 = map;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z16;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i11;
                z24 = z19;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = z24;
                z25 = z15;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                i12 = i10;
                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                z26 = z23;
                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                routeDetailsComponent$updateInitialViewState$1.Z$4 = z22;
                routeDetailsComponent$updateInitialViewState$1.Z$5 = r22;
                routeDetailsComponent$updateInitialViewState$1.label = 8;
                objG = basicInfoContract.g(appPermissionArr14, routeDetailsComponent$updateInitialViewState$1);
                if (objG == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                Ref.ObjectRef objectRef18 = objectRef2;
                list8 = list7;
                objectRef3 = objectRef18;
                obj7 = objG;
                routeDetailsIntentModel11 = routeDetailsIntentModel10;
                z27 = z16;
                i13 = i11;
                z28 = z24;
                livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails2;
                intRef19 = intRef17;
                z29 = z22;
                coroutineSingletons3 = coroutineSingletons2;
                map2 = map;
                routeAppModel10 = routeAppModel9;
                intRef20 = intRef18;
                z30 = r22 == true ? 1 : 0;
                z31 = z29;
                zBooleanValue2 = ((Boolean) obj7).booleanValue();
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                z32 = z27;
                routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                routeDetailsComponent$updateInitialViewState$1.label = 9;
                routeDetailsIntentModel12 = routeDetailsIntentModel11;
                routeDetailsComponent = this;
                objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                coroutineSingletons4 = coroutineSingletons3;
                if (objS == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                intRef21 = intRef20;
                routeAppModel11 = routeAppModel10;
                z33 = zBooleanValue2;
                z34 = z28;
                z35 = z32;
                z36 = z30;
                objectRef4 = objectRef3;
                i17 = i13;
                intRef22 = intRef19;
                routeDetailsIntentModel13 = routeDetailsIntentModel12;
                map3 = map2;
                i18 = i12;
                livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                z37 = z25;
                z38 = z26;
                z39 = z31;
                final boolean zBooleanValue16 = ((Boolean) objS).booleanValue();
                if (i18 != 0) {
                    i19 = 1;
                } else {
                    i19 = i;
                }
                final List list114 = list8;
                final boolean r118 = i19;
                routeDetailsComponent.E0(new Function1() { // from class: o31
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        RouteDetailsIntentModel routeDetailsIntentModel118;
                        RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                        RouteDetailsComponent routeDetailsComponent2;
                        Ref.IntRef intRef2117;
                        Ref.IntRef intRef2118;
                        MarkerStopType markerStopType;
                        Object next;
                        RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                        Intrinsics.i(it3, "it");
                        RouteAppModel routeAppModel18 = routeAppModel11;
                        String str15 = routeAppModel18.c;
                        List list115 = routeAppModel18.e;
                        RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                        boolean z413 = routeDetailsComponent3.o0;
                        String str16 = "(";
                        String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel18.b, ")") : "");
                        String str17 = routeAppModel18.h.b;
                        List list116 = list115;
                        String str18 = "";
                        RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                        ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list116, 10));
                        Iterator it4 = list116.iterator();
                        int i2118 = 0;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            RouteDetailsDataState routeDetailsDataState = it3;
                            RouteDetailsIntentModel routeDetailsIntentModel119 = routeDetailsIntentModel13;
                            String str19 = strA;
                            boolean z414 = z37;
                            Ref.IntRef intRef2119 = intRef21;
                            boolean z415 = z413;
                            Ref.IntRef intRef39 = intRef22;
                            StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                            Object obj11 = null;
                            if (zHasNext) {
                                Object next2 = it4.next();
                                int i2119 = i2118 + 1;
                                if (i2118 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                StopAppModel stopAppModel = (StopAppModel) next2;
                                String str110 = str17;
                                Iterator it5 = it4;
                                boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel119.b) && r118;
                                String str111 = stopAppModel.f1727a;
                                String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                int i21110 = routeDetailsComponent3.h0;
                                boolean z417 = i21110 != -1 && i2118 > i21110;
                                boolean z418 = i21110 == i2118;
                                StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                String stopId = stopAppModel.f1727a;
                                int i21111 = intRef2119.element;
                                int i21112 = intRef39.element;
                                int i36 = routeDetailsComponent3.s0;
                                TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel119.h;
                                String str112 = str18;
                                boolean z419 = trackingAdditionalFeatures11.l;
                                Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                if (customStopTagInfoList == null) {
                                    customStopTagInfoList = EmptyList.f17557a;
                                }
                                Intrinsics.i(stopId, "stopId");
                                Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                ArrayList arrayList17 = new ArrayList();
                                boolean z4110 = z414 && i2118 == i21110;
                                if (i2118 == i21111) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                } else if (i2118 == i21112) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                } else if (i2118 == i36 && z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (i2118 == i36 || (i2118 == i17 && z419)) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                }
                                for (Object obj12 : customStopTagInfoList) {
                                    if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                        obj11 = obj12;
                                        break;
                                    }
                                }
                                RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                if (routeDetailsCustomStopTagInfo != null) {
                                    arrayList17.add(routeDetailsCustomStopTagInfo.b);
                                }
                                arrayList16.add(new RouteDetailsStopUiModel(str111, i2118, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList17, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                it3 = routeDetailsDataState;
                                strA = str19;
                                z413 = z415;
                                i2118 = i2119;
                                routeDetailsViewType = routeDetailsViewType2;
                                str17 = str110;
                                it4 = it5;
                                str18 = str112;
                            } else {
                                RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                String str113 = str17;
                                String str20 = str18;
                                StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                List listC1 = routeDetailsComponent3.c1();
                                CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                List list117 = routeAppModel18.n;
                                ArrayList arrayList18 = new ArrayList(CollectionsKt.v(list117, 10));
                                Iterator it6 = list117.iterator();
                                while (it6.hasNext()) {
                                    arrayList18.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                }
                                String str21 = z34 ? routeAppModel18.j : null;
                                int i37 = routeDetailsComponent3.h0;
                                String str22 = i37 != -1 ? ((StopAppModel) list115.get(i37)).b : str20;
                                boolean z510 = routeDetailsIntentModel119.h.i;
                                String str23 = str21;
                                ArrayList arrayList19 = new ArrayList(CollectionsKt.v(list116, 10));
                                Iterator it7 = list116.iterator();
                                int i38 = 0;
                                while (true) {
                                    boolean zHasNext2 = it7.hasNext();
                                    Iterator it8 = it7;
                                    boolean z511 = z38;
                                    boolean z512 = z39;
                                    boolean z513 = z36;
                                    if (!zHasNext2) {
                                        return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list115.get(0)).b, (String) objectRef4.element, routeAppModel18.t, routeDetailsViewType3, list114, arrayList16, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList18, str23, z510, z511, z512, arrayList19, null, z513, false, map3, "", false, null, false, null, zBooleanValue16, -1604474878, 60);
                                    }
                                    Object next3 = it8.next();
                                    int i39 = i38 + 1;
                                    if (i38 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    StopAppModel stopAppModel2 = (StopAppModel) next3;
                                    ArrayList arrayList110 = arrayList18;
                                    List list118 = routeDetailsIntentModel119.h.n;
                                    if (list118 != null) {
                                        Iterator it9 = list118.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                routeDetailsIntentModel118 = routeDetailsIntentModel119;
                                                next = null;
                                                break;
                                            }
                                            next = it9.next();
                                            routeDetailsIntentModel118 = routeDetailsIntentModel119;
                                            Iterator it10 = it9;
                                            if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                break;
                                            }
                                            it9 = it10;
                                            routeDetailsIntentModel119 = routeDetailsIntentModel118;
                                        }
                                        routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                    } else {
                                        routeDetailsIntentModel118 = routeDetailsIntentModel119;
                                        routeDetailsCustomStopMarkerInfo = null;
                                    }
                                    if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                        int iK = CollectionsKt.K(list115);
                                        int i310 = routeDetailsComponent3.h0;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        int i311 = intRef2119.element;
                                        intRef2117 = intRef2119;
                                        int i312 = intRef39.element;
                                        intRef2118 = intRef39;
                                        boolean z514 = i310 != -1 && i38 > i310;
                                        if (z35) {
                                            if (i38 == i311) {
                                                markerStopType = MarkerStopType.PremiumBusPickupStop;
                                            } else if (i38 == i312) {
                                                markerStopType = MarkerStopType.PremiumBusDropStop;
                                            } else {
                                                markerStopType = (i311 + 1 > i38 || i38 >= i312) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                            }
                                        } else if (i38 == 0) {
                                            markerStopType = MarkerStopType.FirstStop;
                                        } else if (i38 == iK) {
                                            markerStopType = MarkerStopType.LastStop;
                                        } else {
                                            markerStopType = z514 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                        }
                                    } else {
                                        intRef2117 = intRef2119;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        intRef2118 = intRef39;
                                    }
                                    MarkerStopType markerStopType2 = markerStopType;
                                    String str24 = stopAppModel2.f1727a;
                                    String str25 = str16;
                                    StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                    notAvailable2 = notAvailable3;
                                    arrayList19.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i38 == 0, markerStopType2, stopAppModel2.c, false, z511, z512, z513));
                                    str16 = str25;
                                    arrayList18 = arrayList110;
                                    it7 = it8;
                                    i38 = i39;
                                    routeDetailsIntentModel119 = routeDetailsIntentModel118;
                                    routeDetailsComponent3 = routeDetailsComponent2;
                                    intRef2119 = intRef2117;
                                    intRef39 = intRef2118;
                                }
                            }
                        }
                    }
                });
                if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                    RouteDetailsIntentModel routeDetailsIntentModel118 = routeDetailsComponent.X;
                    routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel118 != null ? routeDetailsIntentModel118.e : null), routeAppModel11.b, routeAppModel11.c);
                } else {
                    routeDetailsComponent.g1(z37);
                }
                routeDetailsComponent.j1();
                routeDetailsComponent.k0 = true;
                if (z35) {
                    routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                }
                return Unit.f17538a;
            case 8:
                obj7 = obj9;
                i = 0;
                boolean z61 = routeDetailsComponent$updateInitialViewState$1.Z$5;
                boolean z62 = routeDetailsComponent$updateInitialViewState$1.Z$4;
                boolean z63 = routeDetailsComponent$updateInitialViewState$1.Z$3;
                int i36 = routeDetailsComponent$updateInitialViewState$1.I$1;
                boolean z64 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                boolean z65 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                int i37 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z66 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                Map map4 = (Map) routeDetailsComponent$updateInitialViewState$1.L$7;
                Ref.ObjectRef objectRef19 = (Ref.ObjectRef) routeDetailsComponent$updateInitialViewState$1.L$6;
                LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails6 = (LivePassengerIndicatorBottomSheetDetails) routeDetailsComponent$updateInitialViewState$1.L$5;
                list8 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                intRef19 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                z30 = z61;
                Ref.IntRef intRef39 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel24 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                RouteAppModel routeAppModel18 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj7);
                routeAppModel10 = routeAppModel18;
                z27 = z66;
                z25 = z64;
                map2 = map4;
                z26 = z63;
                objectRef3 = objectRef19;
                z28 = z65;
                livePassengerIndicatorBottomSheetDetails3 = livePassengerIndicatorBottomSheetDetails6;
                i13 = i37;
                i12 = i36;
                z29 = z62;
                coroutineSingletons3 = coroutineSingletons5;
                intRef20 = intRef39;
                routeDetailsIntentModel11 = routeDetailsIntentModel24;
                z31 = z29;
                zBooleanValue2 = ((Boolean) obj7).booleanValue();
                routeDetailsComponent$updateInitialViewState$1.L$0 = routeAppModel10;
                routeDetailsComponent$updateInitialViewState$1.L$1 = routeDetailsIntentModel11;
                routeDetailsComponent$updateInitialViewState$1.L$2 = intRef20;
                routeDetailsComponent$updateInitialViewState$1.L$3 = intRef19;
                routeDetailsComponent$updateInitialViewState$1.L$4 = list8;
                routeDetailsComponent$updateInitialViewState$1.L$5 = livePassengerIndicatorBottomSheetDetails3;
                routeDetailsComponent$updateInitialViewState$1.L$6 = objectRef3;
                routeDetailsComponent$updateInitialViewState$1.L$7 = map2;
                routeDetailsComponent$updateInitialViewState$1.Z$0 = z27;
                routeDetailsComponent$updateInitialViewState$1.I$0 = i13;
                routeDetailsComponent$updateInitialViewState$1.Z$1 = z28;
                routeDetailsComponent$updateInitialViewState$1.Z$2 = z25;
                routeDetailsComponent$updateInitialViewState$1.I$1 = i12;
                routeDetailsComponent$updateInitialViewState$1.Z$3 = z26;
                z32 = z27;
                routeDetailsComponent$updateInitialViewState$1.Z$4 = z31;
                routeDetailsComponent$updateInitialViewState$1.Z$5 = z30;
                routeDetailsComponent$updateInitialViewState$1.Z$6 = zBooleanValue2;
                routeDetailsComponent$updateInitialViewState$1.label = 9;
                routeDetailsIntentModel12 = routeDetailsIntentModel11;
                routeDetailsComponent = this;
                objS = routeDetailsComponent.W.s(routeDetailsComponent$updateInitialViewState$1);
                coroutineSingletons4 = coroutineSingletons3;
                if (objS == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                intRef21 = intRef20;
                routeAppModel11 = routeAppModel10;
                z33 = zBooleanValue2;
                z34 = z28;
                z35 = z32;
                z36 = z30;
                objectRef4 = objectRef3;
                i17 = i13;
                intRef22 = intRef19;
                routeDetailsIntentModel13 = routeDetailsIntentModel12;
                map3 = map2;
                i18 = i12;
                livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails3;
                z37 = z25;
                z38 = z26;
                z39 = z31;
                final boolean zBooleanValue17 = ((Boolean) objS).booleanValue();
                if (i18 != 0) {
                    i19 = 1;
                } else {
                    i19 = i;
                }
                final List list115 = list8;
                final boolean r119 = i19;
                routeDetailsComponent.E0(new Function1() { // from class: o31
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        RouteDetailsIntentModel routeDetailsIntentModel119;
                        RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                        RouteDetailsComponent routeDetailsComponent2;
                        Ref.IntRef intRef2117;
                        Ref.IntRef intRef2118;
                        MarkerStopType markerStopType;
                        Object next;
                        RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                        Intrinsics.i(it3, "it");
                        RouteAppModel routeAppModel19 = routeAppModel11;
                        String str15 = routeAppModel19.c;
                        List list116 = routeAppModel19.e;
                        RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                        boolean z413 = routeDetailsComponent3.o0;
                        String str16 = "(";
                        String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel19.b, ")") : "");
                        String str17 = routeAppModel19.h.b;
                        List list117 = list116;
                        String str18 = "";
                        RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                        ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list117, 10));
                        Iterator it4 = list117.iterator();
                        int i2118 = 0;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            RouteDetailsDataState routeDetailsDataState = it3;
                            RouteDetailsIntentModel routeDetailsIntentModel1110 = routeDetailsIntentModel13;
                            String str19 = strA;
                            boolean z414 = z37;
                            Ref.IntRef intRef2119 = intRef21;
                            boolean z415 = z413;
                            Ref.IntRef intRef310 = intRef22;
                            StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                            Object obj11 = null;
                            if (zHasNext) {
                                Object next2 = it4.next();
                                int i2119 = i2118 + 1;
                                if (i2118 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                StopAppModel stopAppModel = (StopAppModel) next2;
                                String str110 = str17;
                                Iterator it5 = it4;
                                boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel1110.b) && r119;
                                String str111 = stopAppModel.f1727a;
                                String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                int i21110 = routeDetailsComponent3.h0;
                                boolean z417 = i21110 != -1 && i2118 > i21110;
                                boolean z418 = i21110 == i2118;
                                StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                String stopId = stopAppModel.f1727a;
                                int i21111 = intRef2119.element;
                                int i21112 = intRef310.element;
                                int i38 = routeDetailsComponent3.s0;
                                TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel1110.h;
                                String str112 = str18;
                                boolean z419 = trackingAdditionalFeatures11.l;
                                Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                if (customStopTagInfoList == null) {
                                    customStopTagInfoList = EmptyList.f17557a;
                                }
                                Intrinsics.i(stopId, "stopId");
                                Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                ArrayList arrayList17 = new ArrayList();
                                boolean z4110 = z414 && i2118 == i21110;
                                if (i2118 == i21111) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                } else if (i2118 == i21112) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                } else if (i2118 == i38 && z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (i2118 == i38 || (i2118 == i17 && z419)) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                }
                                for (Object obj12 : customStopTagInfoList) {
                                    if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                        obj11 = obj12;
                                        break;
                                    }
                                }
                                RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                if (routeDetailsCustomStopTagInfo != null) {
                                    arrayList17.add(routeDetailsCustomStopTagInfo.b);
                                }
                                arrayList16.add(new RouteDetailsStopUiModel(str111, i2118, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList17, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                it3 = routeDetailsDataState;
                                strA = str19;
                                z413 = z415;
                                i2118 = i2119;
                                routeDetailsViewType = routeDetailsViewType2;
                                str17 = str110;
                                it4 = it5;
                                str18 = str112;
                            } else {
                                RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                String str113 = str17;
                                String str20 = str18;
                                StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                List listC1 = routeDetailsComponent3.c1();
                                CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                List list118 = routeAppModel19.n;
                                ArrayList arrayList18 = new ArrayList(CollectionsKt.v(list118, 10));
                                Iterator it6 = list118.iterator();
                                while (it6.hasNext()) {
                                    arrayList18.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                }
                                String str21 = z34 ? routeAppModel19.j : null;
                                int i39 = routeDetailsComponent3.h0;
                                String str22 = i39 != -1 ? ((StopAppModel) list116.get(i39)).b : str20;
                                boolean z510 = routeDetailsIntentModel1110.h.i;
                                String str23 = str21;
                                ArrayList arrayList19 = new ArrayList(CollectionsKt.v(list117, 10));
                                Iterator it7 = list117.iterator();
                                int i310 = 0;
                                while (true) {
                                    boolean zHasNext2 = it7.hasNext();
                                    Iterator it8 = it7;
                                    boolean z511 = z38;
                                    boolean z512 = z39;
                                    boolean z513 = z36;
                                    if (!zHasNext2) {
                                        return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list116.get(0)).b, (String) objectRef4.element, routeAppModel19.t, routeDetailsViewType3, list115, arrayList16, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList18, str23, z510, z511, z512, arrayList19, null, z513, false, map3, "", false, null, false, null, zBooleanValue17, -1604474878, 60);
                                    }
                                    Object next3 = it8.next();
                                    int i311 = i310 + 1;
                                    if (i310 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    StopAppModel stopAppModel2 = (StopAppModel) next3;
                                    ArrayList arrayList110 = arrayList18;
                                    List list119 = routeDetailsIntentModel1110.h.n;
                                    if (list119 != null) {
                                        Iterator it9 = list119.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                routeDetailsIntentModel119 = routeDetailsIntentModel1110;
                                                next = null;
                                                break;
                                            }
                                            next = it9.next();
                                            routeDetailsIntentModel119 = routeDetailsIntentModel1110;
                                            Iterator it10 = it9;
                                            if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                break;
                                            }
                                            it9 = it10;
                                            routeDetailsIntentModel1110 = routeDetailsIntentModel119;
                                        }
                                        routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                    } else {
                                        routeDetailsIntentModel119 = routeDetailsIntentModel1110;
                                        routeDetailsCustomStopMarkerInfo = null;
                                    }
                                    if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                        int iK = CollectionsKt.K(list116);
                                        int i312 = routeDetailsComponent3.h0;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        int i313 = intRef2119.element;
                                        intRef2117 = intRef2119;
                                        int i314 = intRef310.element;
                                        intRef2118 = intRef310;
                                        boolean z514 = i312 != -1 && i310 > i312;
                                        if (z35) {
                                            if (i310 == i313) {
                                                markerStopType = MarkerStopType.PremiumBusPickupStop;
                                            } else if (i310 == i314) {
                                                markerStopType = MarkerStopType.PremiumBusDropStop;
                                            } else {
                                                markerStopType = (i313 + 1 > i310 || i310 >= i314) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                            }
                                        } else if (i310 == 0) {
                                            markerStopType = MarkerStopType.FirstStop;
                                        } else if (i310 == iK) {
                                            markerStopType = MarkerStopType.LastStop;
                                        } else {
                                            markerStopType = z514 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                        }
                                    } else {
                                        intRef2117 = intRef2119;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        intRef2118 = intRef310;
                                    }
                                    MarkerStopType markerStopType2 = markerStopType;
                                    String str24 = stopAppModel2.f1727a;
                                    String str25 = str16;
                                    StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                    notAvailable2 = notAvailable3;
                                    arrayList19.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i310 == 0, markerStopType2, stopAppModel2.c, false, z511, z512, z513));
                                    str16 = str25;
                                    arrayList18 = arrayList110;
                                    it7 = it8;
                                    i310 = i311;
                                    routeDetailsIntentModel1110 = routeDetailsIntentModel119;
                                    routeDetailsComponent3 = routeDetailsComponent2;
                                    intRef2119 = intRef2117;
                                    intRef310 = intRef2118;
                                }
                            }
                        }
                    }
                });
                if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                    RouteDetailsIntentModel routeDetailsIntentModel119 = routeDetailsComponent.X;
                    routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel119 != null ? routeDetailsIntentModel119.e : null), routeAppModel11.b, routeAppModel11.c);
                } else {
                    routeDetailsComponent.g1(z37);
                }
                routeDetailsComponent.j1();
                routeDetailsComponent.k0 = true;
                if (z35) {
                    routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                }
                return Unit.f17538a;
            case 9:
                z33 = routeDetailsComponent$updateInitialViewState$1.Z$6;
                boolean z67 = routeDetailsComponent$updateInitialViewState$1.Z$5;
                boolean z68 = routeDetailsComponent$updateInitialViewState$1.Z$4;
                boolean z69 = routeDetailsComponent$updateInitialViewState$1.Z$3;
                i18 = routeDetailsComponent$updateInitialViewState$1.I$1;
                boolean z70 = routeDetailsComponent$updateInitialViewState$1.Z$2;
                boolean z71 = routeDetailsComponent$updateInitialViewState$1.Z$1;
                int i38 = routeDetailsComponent$updateInitialViewState$1.I$0;
                boolean z72 = routeDetailsComponent$updateInitialViewState$1.Z$0;
                Map map5 = (Map) routeDetailsComponent$updateInitialViewState$1.L$7;
                Ref.ObjectRef objectRef20 = (Ref.ObjectRef) routeDetailsComponent$updateInitialViewState$1.L$6;
                i = 0;
                LivePassengerIndicatorBottomSheetDetails livePassengerIndicatorBottomSheetDetails7 = (LivePassengerIndicatorBottomSheetDetails) routeDetailsComponent$updateInitialViewState$1.L$5;
                List list23 = (List) routeDetailsComponent$updateInitialViewState$1.L$4;
                Ref.IntRef intRef40 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$3;
                Ref.IntRef intRef41 = (Ref.IntRef) routeDetailsComponent$updateInitialViewState$1.L$2;
                RouteDetailsIntentModel routeDetailsIntentModel25 = (RouteDetailsIntentModel) routeDetailsComponent$updateInitialViewState$1.L$1;
                routeAppModel11 = (RouteAppModel) routeDetailsComponent$updateInitialViewState$1.L$0;
                ResultKt.b(obj9);
                routeDetailsIntentModel13 = routeDetailsIntentModel25;
                objS = obj9;
                intRef22 = intRef40;
                i17 = i38;
                z36 = z67;
                z34 = z71;
                z39 = z68;
                intRef21 = intRef41;
                z35 = z72;
                map3 = map5;
                list8 = list23;
                livePassengerIndicatorBottomSheetDetails4 = livePassengerIndicatorBottomSheetDetails7;
                z37 = z70;
                z38 = z69;
                objectRef4 = objectRef20;
                final boolean zBooleanValue18 = ((Boolean) objS).booleanValue();
                if (i18 != 0) {
                    i19 = 1;
                } else {
                    i19 = i;
                }
                final List list116 = list8;
                final boolean r1110 = i19;
                routeDetailsComponent.E0(new Function1() { // from class: o31
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        RouteDetailsIntentModel routeDetailsIntentModel1110;
                        RouteDetailsCustomStopMarkerInfo routeDetailsCustomStopMarkerInfo;
                        RouteDetailsComponent routeDetailsComponent2;
                        Ref.IntRef intRef2117;
                        Ref.IntRef intRef2118;
                        MarkerStopType markerStopType;
                        Object next;
                        RouteDetailsDataState it3 = (RouteDetailsDataState) obj10;
                        Intrinsics.i(it3, "it");
                        RouteAppModel routeAppModel19 = routeAppModel11;
                        String str15 = routeAppModel19.c;
                        List list117 = routeAppModel19.e;
                        RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent;
                        boolean z413 = routeDetailsComponent3.o0;
                        String str16 = "(";
                        String strA = vo1.A(str15, z413 ? vo1.B("(", routeAppModel19.b, ")") : "");
                        String str17 = routeAppModel19.h.b;
                        List list118 = list117;
                        String str18 = "";
                        RouteDetailsViewType routeDetailsViewType = routeDetailsComponent3.h0 == -1 ? RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a : RouteDetailsViewType.MainScreen.f4880a;
                        ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list118, 10));
                        Iterator it4 = list118.iterator();
                        int i2118 = 0;
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            RouteDetailsDataState routeDetailsDataState = it3;
                            RouteDetailsIntentModel routeDetailsIntentModel1111 = routeDetailsIntentModel13;
                            String str19 = strA;
                            boolean z414 = z37;
                            Ref.IntRef intRef2119 = intRef21;
                            boolean z415 = z413;
                            Ref.IntRef intRef310 = intRef22;
                            StopEtaUiModel.NotAvailable notAvailable = StopEtaUiModel.NotAvailable.f4416a;
                            Object obj11 = null;
                            if (zHasNext) {
                                Object next2 = it4.next();
                                int i2119 = i2118 + 1;
                                if (i2118 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                RouteDetailsViewType routeDetailsViewType2 = routeDetailsViewType;
                                StopAppModel stopAppModel = (StopAppModel) next2;
                                String str110 = str17;
                                Iterator it5 = it4;
                                boolean z416 = Intrinsics.d(stopAppModel.f1727a, routeDetailsIntentModel1111.b) && r1110;
                                String str111 = stopAppModel.f1727a;
                                String strA2 = vo1.A(stopAppModel.b, z415 ? vo1.B("(", str111, ")") : str18);
                                int i21110 = routeDetailsComponent3.h0;
                                boolean z417 = i21110 != -1 && i2118 > i21110;
                                boolean z418 = i21110 == i2118;
                                StopEtaStatus stopEtaStatus = StopEtaStatus.ETA_NOT_AVAILABLE;
                                String stopId = stopAppModel.f1727a;
                                int i21111 = intRef2119.element;
                                int i21112 = intRef310.element;
                                int i39 = routeDetailsComponent3.s0;
                                TrackingAdditionalFeatures trackingAdditionalFeatures11 = routeDetailsIntentModel1111.h;
                                String str112 = str18;
                                boolean z419 = trackingAdditionalFeatures11.l;
                                Iterable customStopTagInfoList = trackingAdditionalFeatures11.o;
                                if (customStopTagInfoList == null) {
                                    customStopTagInfoList = EmptyList.f17557a;
                                }
                                Intrinsics.i(stopId, "stopId");
                                Intrinsics.i(customStopTagInfoList, "customStopTagInfoList");
                                ArrayList arrayList17 = new ArrayList();
                                boolean z4110 = z414 && i2118 == i21110;
                                if (i2118 == i21111) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_PICKUP_STOP);
                                } else if (i2118 == i21112) {
                                    arrayList17.add(RouteDetailsStopHelpTag.PREMIUM_BUS_DROP_STOP);
                                } else if (i2118 == i39 && z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (z4110) {
                                    arrayList17.add(RouteDetailsStopHelpTag.USER_DESTINATION_STOP);
                                } else if (i2118 == i39 || (i2118 == i17 && z419)) {
                                    arrayList17.add(RouteDetailsStopHelpTag.NEAREST_STOP);
                                }
                                for (Object obj12 : customStopTagInfoList) {
                                    if (Intrinsics.d(((RouteDetailsCustomStopTagInfo) obj12).f4403a, stopId)) {
                                        obj11 = obj12;
                                        break;
                                    }
                                }
                                RouteDetailsCustomStopTagInfo routeDetailsCustomStopTagInfo = (RouteDetailsCustomStopTagInfo) obj11;
                                if (routeDetailsCustomStopTagInfo != null) {
                                    arrayList17.add(routeDetailsCustomStopTagInfo.b);
                                }
                                arrayList16.add(new RouteDetailsStopUiModel(str111, i2118, strA2, false, false, z417, false, z418, stopEtaStatus, notAvailable, arrayList17, z416, null, ((Boolean) routeDetailsComponent3.u0.getValue()).booleanValue()));
                                it3 = routeDetailsDataState;
                                strA = str19;
                                z413 = z415;
                                i2118 = i2119;
                                routeDetailsViewType = routeDetailsViewType2;
                                str17 = str110;
                                it4 = it5;
                                str18 = str112;
                            } else {
                                RouteDetailsViewType routeDetailsViewType3 = routeDetailsViewType;
                                String str113 = str17;
                                String str20 = str18;
                                StopEtaUiModel.NotAvailable notAvailable2 = notAvailable;
                                List listC1 = routeDetailsComponent3.c1();
                                CityAppModel cityAppModel = (CityAppModel) routeDetailsComponent3.k.getE().getValue();
                                RouteDetailsMapUiModel routeDetailsMapUiModel = new RouteDetailsMapUiModel(listC1, z33, new MapCameraViewState.InitialState.CustomPosition(cityAppModel != null ? cityAppModel.d : new LatLng(0.0d, 0.0d), 10.0f, 12));
                                List list119 = routeAppModel19.n;
                                ArrayList arrayList18 = new ArrayList(CollectionsKt.v(list119, 10));
                                Iterator it6 = list119.iterator();
                                while (it6.hasNext()) {
                                    arrayList18.add(((RouteSpecialFeatureAppModel) it6.next()).f1715a);
                                }
                                String str21 = z34 ? routeAppModel19.j : null;
                                int i310 = routeDetailsComponent3.h0;
                                String str22 = i310 != -1 ? ((StopAppModel) list117.get(i310)).b : str20;
                                boolean z510 = routeDetailsIntentModel1111.h.i;
                                String str23 = str21;
                                ArrayList arrayList19 = new ArrayList(CollectionsKt.v(list118, 10));
                                Iterator it7 = list118.iterator();
                                int i311 = 0;
                                while (true) {
                                    boolean zHasNext2 = it7.hasNext();
                                    Iterator it8 = it7;
                                    boolean z511 = z38;
                                    boolean z512 = z39;
                                    boolean z513 = z36;
                                    if (!zHasNext2) {
                                        return RouteDetailsDataState.a(routeDetailsDataState, false, null, str19, str113, ((StopAppModel) list117.get(0)).b, (String) objectRef4.element, routeAppModel19.t, routeDetailsViewType3, list116, arrayList16, str22, routeDetailsMapUiModel, null, z414, false, livePassengerIndicatorBottomSheetDetails4, null, null, null, false, arrayList18, str23, z510, z511, z512, arrayList19, null, z513, false, map3, "", false, null, false, null, zBooleanValue18, -1604474878, 60);
                                    }
                                    Object next3 = it8.next();
                                    int i312 = i311 + 1;
                                    if (i311 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    StopAppModel stopAppModel2 = (StopAppModel) next3;
                                    ArrayList arrayList110 = arrayList18;
                                    List list1110 = routeDetailsIntentModel1111.h.n;
                                    if (list1110 != null) {
                                        Iterator it9 = list1110.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                routeDetailsIntentModel1110 = routeDetailsIntentModel1111;
                                                next = null;
                                                break;
                                            }
                                            next = it9.next();
                                            routeDetailsIntentModel1110 = routeDetailsIntentModel1111;
                                            Iterator it10 = it9;
                                            if (Intrinsics.d(((RouteDetailsCustomStopMarkerInfo) next).f4401a, stopAppModel2.f1727a)) {
                                                break;
                                            }
                                            it9 = it10;
                                            routeDetailsIntentModel1111 = routeDetailsIntentModel1110;
                                        }
                                        routeDetailsCustomStopMarkerInfo = (RouteDetailsCustomStopMarkerInfo) next;
                                    } else {
                                        routeDetailsIntentModel1110 = routeDetailsIntentModel1111;
                                        routeDetailsCustomStopMarkerInfo = null;
                                    }
                                    if (routeDetailsCustomStopMarkerInfo == null || (markerStopType = routeDetailsCustomStopMarkerInfo.b) == null) {
                                        int iK = CollectionsKt.K(list117);
                                        int i313 = routeDetailsComponent3.h0;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        int i314 = intRef2119.element;
                                        intRef2117 = intRef2119;
                                        int i315 = intRef310.element;
                                        intRef2118 = intRef310;
                                        boolean z514 = i313 != -1 && i311 > i313;
                                        if (z35) {
                                            if (i311 == i314) {
                                                markerStopType = MarkerStopType.PremiumBusPickupStop;
                                            } else if (i311 == i315) {
                                                markerStopType = MarkerStopType.PremiumBusDropStop;
                                            } else {
                                                markerStopType = (i314 + 1 > i311 || i311 >= i315) ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                            }
                                        } else if (i311 == 0) {
                                            markerStopType = MarkerStopType.FirstStop;
                                        } else if (i311 == iK) {
                                            markerStopType = MarkerStopType.LastStop;
                                        } else {
                                            markerStopType = z514 ? MarkerStopType.DisabledStop : MarkerStopType.IntermediateStop;
                                        }
                                    } else {
                                        intRef2117 = intRef2119;
                                        routeDetailsComponent2 = routeDetailsComponent3;
                                        intRef2118 = intRef310;
                                    }
                                    MarkerStopType markerStopType2 = markerStopType;
                                    String str24 = stopAppModel2.f1727a;
                                    String str25 = str16;
                                    StopEtaUiModel.NotAvailable notAvailable3 = notAvailable2;
                                    notAvailable2 = notAvailable3;
                                    arrayList19.add(new RouteDetailsMapStopMarkerInfo(str24, vo1.A(stopAppModel2.b, z415 ? vo1.B(str25, str24, ")") : str20), StopEtaStatus.ETA_NOT_AVAILABLE, notAvailable3, i311 == 0, markerStopType2, stopAppModel2.c, false, z511, z512, z513));
                                    str16 = str25;
                                    arrayList18 = arrayList110;
                                    it7 = it8;
                                    i311 = i312;
                                    routeDetailsIntentModel1111 = routeDetailsIntentModel1110;
                                    routeDetailsComponent3 = routeDetailsComponent2;
                                    intRef2119 = intRef2117;
                                    intRef310 = intRef2118;
                                }
                            }
                        }
                    }
                });
                if (Intrinsics.d(((RouteDetailsDataState) routeDetailsComponent.f.getValue()).h, RouteDetailsViewType.StopListForUserDestinationUpdate.f4881a)) {
                    RouteDetailsIntentModel routeDetailsIntentModel1110 = routeDetailsComponent.X;
                    routeDetailsComponent.z.r(routeAppModel11.e.size(), String.valueOf(routeDetailsIntentModel1110 != null ? routeDetailsIntentModel1110.e : null), routeAppModel11.b, routeAppModel11.c);
                } else {
                    routeDetailsComponent.g1(z37);
                }
                routeDetailsComponent.j1();
                routeDetailsComponent.k0 = true;
                if (z35) {
                    routeDetailsComponent.r0(RouteDetailsSideEffect.HideStopListBottomSheet.f4873a);
                }
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void n1() {
        BuildersKt.d(this.j, this.J.getDefault(), null, new RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1(this, null), 2);
    }

    public final void o1(int i) {
        MarkerStopType markerStopType;
        RouteAppModel routeAppModel = this.Y;
        if (routeAppModel == null) {
            return;
        }
        int i2 = this.h0;
        this.h0 = i;
        BuildersKt.d(this.j, this.J.getDefault(), null, new RouteDetailsComponent$updateStateWithUserDestinationName$1(i, routeAppModel, this, null), 2);
        List list = ((RouteDetailsDataState) this.f.getValue()).B;
        int i3 = this.h0;
        Intrinsics.i(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            RouteDetailsMapStopMarkerInfo routeDetailsMapStopMarkerInfo = (RouteDetailsMapStopMarkerInfo) obj;
            if (i4 == 0 || i4 == CollectionsKt.K(list)) {
                markerStopType = routeDetailsMapStopMarkerInfo.f;
            } else if (1 > i4 || i4 > i3) {
                markerStopType = (i4 >= CollectionsKt.K(list) || i3 + 1 > i4) ? MarkerStopType.IntermediateStop : MarkerStopType.DisabledStop;
            } else {
                markerStopType = MarkerStopType.IntermediateStop;
            }
            arrayList.add(RouteDetailsMapStopMarkerInfo.a(routeDetailsMapStopMarkerInfo, null, null, markerStopType, false, 2015));
            i4 = i5;
        }
        E0(new s31(i, this, i2, c1(), arrayList));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        RouteNamingSchemeType routeNamingSchemeType = RouteNamingSchemeType.DEFAULT;
        EmptyList emptyList = EmptyList.f17557a;
        return new RouteDetailsDataState(false, null, "", "", "", null, routeNamingSchemeType, null, emptyList, emptyList, "", new RouteDetailsMapStopUiModel(StopEtaStatus.ETA_NOT_AVAILABLE), new RouteDetailsMapUiModel(emptyList, false, MapCameraViewState.InitialState.NoState.f1881a), null, false, true, null, null, null, null, false, true, emptyList, null, true, true, true, emptyList, emptyList, false, false, MapsKt.d(), "", false, emptyList, false, "", false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        f1(RouteDetailsIntent.OnStartIntent.f4851a);
        f1(RouteDetailsIntent.UpdateLocationPermission.f4868a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        f1(RouteDetailsIntent.OnStopIntent.f4852a);
    }
}

package app.chalo.busesaroundyou;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.ProjectionUtils;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.geoquery.data.LiveTripInfoDataModel;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.home.helper.NearbyBusMarkerHelper;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BusesAroundYouArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.cd0;
import defpackage.g;
import defpackage.rd;
import defpackage.vo1;
import defpackage.wa;
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
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouDataState;", "Lapp/chalo/busesaroundyou/BusesAroundYouViewState;", "Lapp/chalo/busesaroundyou/BusesAroundYouSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BusesAroundYouComponent extends ChaloBaseStateMviComponent<BusesAroundYouIntent, BusesAroundYouDataState, BusesAroundYouViewState, BusesAroundYouSideEffect> {
    public final ProjectionUtils A;
    public final StringProvider B;
    public final TimeUtilsContract C;
    public final CrashlyticsLogger D;
    public Job E;
    public Job F;
    public Job G;
    public final ChaloLocationManager k;
    public final LocationPermissionCallbackHandler l;
    public final AnalyticsContract m;
    public final PermissionHandlerProvider n;
    public final ChaloNavigationManager o;
    public final NetworkStateManager p;
    public final CityProvider q;
    public final GeoSpatialLiveBusesDataPollingManager r;
    public final CoroutineContextProvider s;
    public final IsCityRouteNamesDisabledUseCase t;
    public final NearbyBusMarkerHelper u;
    public final BasicInfoContract v;
    public final GetGeoQueryCityWiseConfigUseCase w;
    public final CheckIsTripNotStaleUseCase x;
    public final GpsRequestHandlerProvider y;
    public final SystemHelper z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouComponent$Companion;", "", "", "MAP_NO_NEARBY_AVAILABLE_MESSAGE_TIME", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent(ComponentContext componentContext, BusesAroundYouArgs args, ChaloLocationManager chaloLocationManager, LocationPermissionCallbackHandler locationPermissionCallbackHandler, AnalyticsContract analyticsContract, PermissionHandlerProvider permissionHandlerProvider, ChaloNavigationManager chaloNavigationManager, NetworkStateManager networkStateManager, CityProvider cityProvider, GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager, CoroutineContextProvider coroutineContextProvider, IsCityRouteNamesDisabledUseCase isCityRouteNamesDisabledUseCase, NearbyBusMarkerHelper nearbyBusMarkerHelper, BasicInfoContract basicInfoContract, GetGeoQueryCityWiseConfigUseCase getGeoQueryCityWiseConfigUseCase, CheckIsTripNotStaleUseCase checkIsTripNotStaleUseCase, GpsRequestHandlerProvider gpsRequestHandlerProvider, SystemHelper systemHelper, ProjectionUtils projectionUtils, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, CrashlyticsLogger crashlyticsLogger) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = chaloLocationManager;
        this.l = locationPermissionCallbackHandler;
        this.m = analyticsContract;
        this.n = permissionHandlerProvider;
        this.o = chaloNavigationManager;
        this.p = networkStateManager;
        this.q = cityProvider;
        this.r = geoSpatialLiveBusesDataPollingManager;
        this.s = coroutineContextProvider;
        this.t = isCityRouteNamesDisabledUseCase;
        this.u = nearbyBusMarkerHelper;
        this.v = basicInfoContract;
        this.w = getGeoQueryCityWiseConfigUseCase;
        this.x = checkIsTripNotStaleUseCase;
        this.y = gpsRequestHandlerProvider;
        this.z = systemHelper;
        this.A = projectionUtils;
        this.B = stringProvider;
        this.C = timeUtilsContract;
        this.D = crashlyticsLogger;
        K0(BusesAroundYouIntent.InitialIntent.f1180a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0132  */
    /* JADX WARN: Code duplicated, block: B:31:0x013c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0142  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:39:0x0159  */
    /* JADX WARN: Code duplicated, block: B:42:0x0170  */
    /* JADX WARN: Code duplicated, block: B:43:0x0172  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:49:0x0192  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0181 -> B:56:0x01ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0192 -> B:56:0x01ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01cf -> B:54:0x01d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x0170
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object F0(app.chalo.busesaroundyou.BusesAroundYouComponent r23, java.util.List r24, java.util.List r25, java.util.Map r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.busesaroundyou.BusesAroundYouComponent.F0(app.chalo.busesaroundyou.BusesAroundYouComponent, java.util.List, java.util.List, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(BusesAroundYouComponent busesAroundYouComponent, ContinuationImpl continuationImpl) {
        BusesAroundYouComponent$setUpMapConfiguration$1 busesAroundYouComponent$setUpMapConfiguration$1;
        busesAroundYouComponent.getClass();
        if (continuationImpl instanceof BusesAroundYouComponent$setUpMapConfiguration$1) {
            busesAroundYouComponent$setUpMapConfiguration$1 = (BusesAroundYouComponent$setUpMapConfiguration$1) continuationImpl;
            int i = busesAroundYouComponent$setUpMapConfiguration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                busesAroundYouComponent$setUpMapConfiguration$1.label = i - Integer.MIN_VALUE;
            } else {
                busesAroundYouComponent$setUpMapConfiguration$1 = new BusesAroundYouComponent$setUpMapConfiguration$1(busesAroundYouComponent, continuationImpl);
            }
        } else {
            busesAroundYouComponent$setUpMapConfiguration$1 = new BusesAroundYouComponent$setUpMapConfiguration$1(busesAroundYouComponent, continuationImpl);
        }
        Object objJ0 = busesAroundYouComponent$setUpMapConfiguration$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = busesAroundYouComponent$setUpMapConfiguration$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ0);
            busesAroundYouComponent$setUpMapConfiguration$1.label = 1;
            objJ0 = busesAroundYouComponent.J0(busesAroundYouComponent$setUpMapConfiguration$1);
            if (objJ0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ0);
        }
        LatLng latLng = (LatLng) objJ0;
        GeoQueryCityConfigModel geoQueryCityConfigModel = ((BusesAroundYouDataState) busesAroundYouComponent.f.getValue()).g;
        Unit unit = Unit.f17538a;
        if (geoQueryCityConfigModel == null) {
            return unit;
        }
        busesAroundYouComponent.E0(new cd0(latLng, geoQueryCityConfigModel.d, geoQueryCityConfigModel.b));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r12 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(app.chalo.location.LatLng r10, boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.busesaroundyou.BusesAroundYouComponent.H0(app.chalo.location.LatLng, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0132 A[LOOP:0: B:25:0x012c->B:27:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0218  */
    /* JADX WARN: Code duplicated, block: B:48:0x0238  */
    /* JADX WARN: Code duplicated, block: B:52:0x0259  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01dd, code lost:
    
        if (r1 == r3) goto L51;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.busesaroundyou.BusesAroundYouDataState r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.busesaroundyou.BusesAroundYouComponent.p0(app.chalo.busesaroundyou.BusesAroundYouDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(ContinuationImpl continuationImpl) {
        BusesAroundYouComponent$getInitialZoomLocation$1 busesAroundYouComponent$getInitialZoomLocation$1;
        CityAppModel cityAppModel;
        LatLng latLng;
        if (continuationImpl instanceof BusesAroundYouComponent$getInitialZoomLocation$1) {
            busesAroundYouComponent$getInitialZoomLocation$1 = (BusesAroundYouComponent$getInitialZoomLocation$1) continuationImpl;
            int i = busesAroundYouComponent$getInitialZoomLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                busesAroundYouComponent$getInitialZoomLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                busesAroundYouComponent$getInitialZoomLocation$1 = new BusesAroundYouComponent$getInitialZoomLocation$1(this, continuationImpl);
            }
        } else {
            busesAroundYouComponent$getInitialZoomLocation$1 = new BusesAroundYouComponent$getInitialZoomLocation$1(this, continuationImpl);
        }
        Object obj = busesAroundYouComponent$getInitialZoomLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = busesAroundYouComponent$getInitialZoomLocation$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            CityAppModel cityAppModel2 = (CityAppModel) this.q.getE().getValue();
            if (cityAppModel2 == null) {
                return new LatLng(0.0d, 0.0d);
            }
            LatLng latLng2 = cityAppModel2.d;
            busesAroundYouComponent$getInitialZoomLocation$1.L$0 = cityAppModel2;
            busesAroundYouComponent$getInitialZoomLocation$1.L$1 = latLng2;
            busesAroundYouComponent$getInitialZoomLocation$1.label = 1;
            Object objA = this.k.a(busesAroundYouComponent$getInitialZoomLocation$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            cityAppModel = cityAppModel2;
            obj = objA;
            latLng = latLng2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) busesAroundYouComponent$getInitialZoomLocation$1.L$1;
            cityAppModel = (CityAppModel) busesAroundYouComponent$getInitialZoomLocation$1.L$0;
            ResultKt.b(obj);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        return (latLngA == null || !CityAppModelKt.b(cityAppModel, latLngA)) ? latLng : latLngA;
    }

    public final void K0(BusesAroundYouIntent busesAroundYouIntent) {
        String str;
        String strA;
        C0(busesAroundYouIntent);
        boolean z = busesAroundYouIntent instanceof BusesAroundYouIntent.InitialIntent;
        int i = 0;
        ContextScope contextScope = this.j;
        if (z) {
            E0(new rd(this, i));
            D0(new BusesAroundYouComponent$collectNetworkState$1(this, null));
            BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1(this, null), 3);
            Job job = this.F;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.F = BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$startCurrLocationUpdatesCollection$1(this, null), 3);
            BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$sendMarkerShownEvent$1(this, null), 3);
            return;
        }
        int i2 = 23;
        if (busesAroundYouIntent instanceof BusesAroundYouIntent.InternetConnectionIntent) {
            BusesAroundYouIntent.InternetConnectionIntent internetConnectionIntent = (BusesAroundYouIntent.InternetConnectionIntent) busesAroundYouIntent;
            if (((BusesAroundYouDataState) this.f.getValue()).b && internetConnectionIntent.f1181a == NetworkConnectionType.CONNECTED) {
                L0(CollectionsKt.S(AppPermission.COARSE_LOCATION, AppPermission.FINE_LOCATION));
            }
            E0(new g(internetConnectionIntent, i2));
            return;
        }
        if (busesAroundYouIntent.equals(BusesAroundYouIntent.GoToMyLocationClickedIntent.f1177a)) {
            BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1(this, null), 3);
            return;
        }
        if (busesAroundYouIntent instanceof BusesAroundYouIntent.MapCameraPositionStateChangedIntent) {
            BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$handleMapCameraPositionStateChangedIntent$1((BusesAroundYouIntent.MapCameraPositionStateChangedIntent) busesAroundYouIntent, this, null), 3);
            return;
        }
        boolean z2 = busesAroundYouIntent instanceof BusesAroundYouIntent.BusMarkerClicked;
        SystemHelper systemHelper = this.z;
        if (!z2) {
            if (busesAroundYouIntent.equals(BusesAroundYouIntent.OnMapLoaded.f1184a)) {
                BuildersKt.d(contextScope, null, null, new BusesAroundYouComponent$handleOnMapLoadedIntent$1(this, null), 3);
                return;
            }
            if (busesAroundYouIntent.equals(BusesAroundYouIntent.GrantLocationPermissionThroughSettingDialogConfirmClicked.f1178a)) {
                AnalyticsContract.DefaultImpls.a(this.m, "access location event", Source.HOME_SCREEN_MAP_FRAGMENT.getSourceName(), vo1.s("locationAccessAction", "clickSettingOptionForLocation"), null, false, 24);
                E0(new wa(21));
                systemHelper.i();
                return;
            } else if (busesAroundYouIntent.equals(BusesAroundYouIntent.GrantLocationPermissionThroughSettingDialogDismissed.f1179a)) {
                AnalyticsContract.DefaultImpls.a(this.m, "access location event", Source.HOME_SCREEN_MAP_FRAGMENT.getSourceName(), vo1.s("locationAccessAction", "closeDialogToEnableLocationFromSetting"), null, false, 24);
                E0(new wa(i2));
                return;
            } else {
                if (!(busesAroundYouIntent instanceof BusesAroundYouIntent.OnCrashLoggingRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.D.g(((BusesAroundYouIntent.OnCrashLoggingRequired) busesAroundYouIntent).f1183a);
                return;
            }
        }
        LiveTripInfoDataModel liveTripInfoDataModel = ((BusesAroundYouIntent.BusMarkerClicked) busesAroundYouIntent).f1176a;
        ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
        if (liveTripInfoDataModel == null || (str = liveTripInfoDataModel.d.g) == null) {
            str = "";
        }
        ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str);
        int iN = this.C.N(systemHelper.j());
        StringBuilder sb = new StringBuilder();
        sb.append(iN);
        AnalyticsContract.DefaultImpls.a(this.m, "home screen live vehicles click", "", MapsKt.i(new Pair("hourOfEvent", sb.toString()), new Pair("geoSpatialSrc", "chalo"), new Pair("mode", chaloTransitModeB.name()), new Pair("routeName", String.valueOf(liveTripInfoDataModel != null ? liveTripInfoDataModel.d.d : null)), new Pair("agency", String.valueOf(liveTripInfoDataModel != null ? liveTripInfoDataModel.d.h : null))), null, false, 24);
        RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(liveTripInfoDataModel.b, null, Source.HOME_SCREEN_MARKER.getSourceName(), 238);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA != null) {
            this.o.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
        }
    }

    public final void L0(List list) {
        AnalyticsContract.DefaultImpls.a(this.m, "permission_popup", "", vo1.s("element", "home_location"), null, false, 24);
        Job job = this.E;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.E = BuildersKt.d(this.j, null, null, new BusesAroundYouComponent$requestLocationPermissions$1(this, list, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new BusesAroundYouDataState(false, false, new NearbyBusesMapData(), null, true, null, null, false, 0L, 0L, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = ((BusesAroundYouDataState) this.f.getValue()).c.d;
        if (chaloMapCameraPositionStateData != null) {
            E0(new g(chaloMapCameraPositionStateData, 24));
        }
    }
}

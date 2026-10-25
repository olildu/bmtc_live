package app.chalo.livetracking.universalsearch.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.livetracking.universalsearch.UniversalSearchManager;
import app.chalo.livetracking.universalsearch.UniversalSearchResultAnalyticProperties;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchItemType;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.livetracking.universalsearch.domain.CheckIfUserCameFromPremiumBusCampaign;
import app.chalo.livetracking.universalsearch.domain.ConvertSearchedResultItemsAppModelToUiModelUseCase;
import app.chalo.livetracking.universalsearch.domain.UniversalSearchResultFilteringHelper;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.cm1;
import defpackage.sh1;
import defpackage.sm1;
import defpackage.tm1;
import defpackage.um1;
import defpackage.vm1;
import defpackage.vo1;
import defpackage.xj1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerViewState;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerDataState;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UniversalPickerComponent extends ChaloBaseStateMviComponent<UniversalPickerIntent, UniversalPickerViewState, UniversalPickerViewState, UniversalPickerSideEffect> {
    public final PermissionHandlerProvider A;
    public final UniversalSearchResultStateManager B;
    public final LocationPermissionCallbackHandler C;
    public final GpsRequestHandlerProvider D;
    public final KotlinToastManager E;
    public Job F;
    public Job G;
    public final UniversalPickerArgs k;
    public final CityProvider l;
    public final IsAgencyTagVisibleUseCase m;
    public final UniversalSearchHelper n;
    public final UniversalSearchManager o;
    public final ConvertSearchedResultItemsAppModelToUiModelUseCase p;
    public final UniversalSearchAnalyticsEventHelper q;
    public final UniversalSearchResultFilteringHelper r;
    public final BasicInfoContract s;
    public final StringProvider t;
    public final CheckIfUserCameFromPremiumBusCampaign u;
    public final FetchCurrentLocationUseCase v;
    public final ChaloLocationManager w;
    public final CityMetaDataManager x;
    public final SystemHelper y;
    public final ChaloNavigationManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5044a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DestinationAfterUniversalSearch.values().length];
            try {
                iArr[DestinationAfterUniversalSearch.TRIP_PLANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.ACTIVITY_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationAfterUniversalSearch.CITY_LOCATION_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5044a = iArr;
            int[] iArr2 = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr2[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
            int[] iArr3 = new int[SearchScreenLayoutType.values().length];
            try {
                iArr3[SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[SearchScreenLayoutType.RECENT_RESULT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[SearchScreenLayoutType.ERROR_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            c = iArr3;
        }
    }

    public UniversalPickerComponent(ComponentContext componentContext, UniversalPickerArgs universalPickerArgs, CityProvider cityProvider, IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase, UniversalSearchHelper universalSearchHelper, UniversalSearchManager universalSearchManager, ConvertSearchedResultItemsAppModelToUiModelUseCase convertSearchedResultItemsAppModelToUiModelUseCase, UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper, UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper, BasicInfoContract basicInfoContract, StringProvider stringProvider, CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign, FetchCurrentLocationUseCase fetchCurrentLocationUseCase, ChaloLocationManager chaloLocationManager, CityMetaDataManager cityMetaDataManager, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, UniversalSearchResultStateManager universalSearchResultStateManager, LocationPermissionCallbackHandler locationPermissionCallbackHandler, GpsRequestHandlerProvider gpsRequestHandlerProvider, KotlinToastManager kotlinToastManager) {
        Object objB;
        UniversalSearchFlowSource next;
        super(componentContext);
        this.k = universalPickerArgs;
        this.l = cityProvider;
        this.m = isAgencyTagVisibleUseCase;
        this.n = universalSearchHelper;
        this.o = universalSearchManager;
        this.p = convertSearchedResultItemsAppModelToUiModelUseCase;
        this.q = universalSearchAnalyticsEventHelper;
        this.r = universalSearchResultFilteringHelper;
        this.s = basicInfoContract;
        this.t = stringProvider;
        this.u = checkIfUserCameFromPremiumBusCampaign;
        this.v = fetchCurrentLocationUseCase;
        this.w = chaloLocationManager;
        this.x = cityMetaDataManager;
        this.y = systemHelper;
        this.z = chaloNavigationManager;
        this.A = permissionHandlerProvider;
        this.B = universalSearchResultStateManager;
        this.C = locationPermissionCallbackHandler;
        this.D = gpsRequestHandlerProvider;
        this.E = kotlinToastManager;
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = universalPickerArgs.b;
        DestinationAfterUniversalSearch destinationAfterUniversalSearch = null;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, UniversalSearchOptions.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        UniversalSearchOptions universalSearchOptions = (UniversalSearchOptions) objB;
        if (universalSearchOptions == null) {
            q0(new sm1(this, 1));
            return;
        }
        UniversalSearchFlowSource.Companion companion = UniversalSearchFlowSource.INSTANCE;
        String source = this.k.d;
        companion.getClass();
        Intrinsics.i(source, "source");
        Iterator<UniversalSearchFlowSource> it = UniversalSearchFlowSource.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getSourceName(), source));
        UniversalSearchFlowSource universalSearchFlowSource = next;
        universalSearchFlowSource = universalSearchFlowSource == null ? UniversalSearchFlowSource.UNKNOWN : universalSearchFlowSource;
        UniversalPickerArgs universalPickerArgs2 = this.k;
        String str2 = universalPickerArgs2.c;
        DestinationAfterUniversalSearch.Companion companion2 = DestinationAfterUniversalSearch.INSTANCE;
        String destination = universalPickerArgs2.g;
        companion2.getClass();
        Intrinsics.i(destination, "destination");
        for (DestinationAfterUniversalSearch destinationAfterUniversalSearch2 : DestinationAfterUniversalSearch.getEntries()) {
            if (Intrinsics.d(destinationAfterUniversalSearch2.name(), destination)) {
                destinationAfterUniversalSearch = destinationAfterUniversalSearch2;
                break;
            }
        }
        DestinationAfterUniversalSearch destinationAfterUniversalSearch3 = destinationAfterUniversalSearch;
        destinationAfterUniversalSearch3 = destinationAfterUniversalSearch3 == null ? DestinationAfterUniversalSearch.ACTIVITY_RESULT : destinationAfterUniversalSearch3;
        UniversalPickerArgs universalPickerArgs3 = this.k;
        J0(new UniversalPickerIntent.ViewCreatedIntent(universalSearchOptions, universalSearchFlowSource, str2, destinationAfterUniversalSearch3, universalPickerArgs3.e, universalPickerArgs3.f, universalPickerArgs3.j, universalPickerArgs3.k, universalPickerArgs3.l, universalPickerArgs3.i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r13 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
    
        if (r13 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
    
        if (r13 == r4) goto L72;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
    public static final java.lang.Object F0(app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r10, app.chalo.utils.ChaloUseCaseResult r11, app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent.F0(app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent, app.chalo.utils.ChaloUseCaseResult, app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void G0(UniversalPickerComponent universalPickerComponent, LocationAppModel locationAppModel) {
        universalPickerComponent.getClass();
        String message = "Location available: " + locationAppModel;
        Intrinsics.i(message, "message");
        Job job = universalPickerComponent.F;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        switch (WhenMappings.b[((UniversalPickerViewState) universalPickerComponent.f.getValue()).l.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            case 10:
                universalPickerComponent.H0(locationAppModel.a(), null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void H0(LatLng latLng, String str) {
        String message = "fetchCityFromLocation " + latLng;
        Intrinsics.i(message, "message");
        BuildersKt.d(this.j, null, null, new UniversalPickerComponent$fetchAndSelectCityFromLocation$1(this, latLng, str, null), 3);
    }

    public final void I0(String str, UniversalSearchResultState universalSearchResultState) {
        this.B.c(universalSearchResultState, str);
        q0(new sm1(this, 0));
    }

    public final void J0(UniversalPickerIntent intent) {
        String strA;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof UniversalPickerIntent.ViewCreatedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            UniversalPickerIntent.ViewCreatedIntent viewCreatedIntent = (UniversalPickerIntent.ViewCreatedIntent) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleViewCreatedIntent$1(this, viewCreatedIntent.b, viewCreatedIntent.j, viewCreatedIntent.e, viewCreatedIntent.f, viewCreatedIntent.c, viewCreatedIntent.f5082a, viewCreatedIntent.d, viewCreatedIntent.g, viewCreatedIntent.h, viewCreatedIntent.i, null), 3);
            return;
        }
        boolean z2 = intent instanceof UniversalPickerIntent.ClearSearchTextFieldIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            this.q.e(((UniversalPickerViewState) stateFlow.getValue()).p.f5085a, ((UniversalPickerViewState) stateFlow.getValue()).k, ((UniversalPickerViewState) stateFlow.getValue()).p.c, ((UniversalPickerViewState) stateFlow.getValue()).p.d, ((UniversalPickerViewState) stateFlow.getValue()).b, ((UniversalPickerViewState) stateFlow.getValue()).p.e);
            E0(new tm1(this, 2));
            return;
        }
        boolean z3 = intent instanceof UniversalPickerIntent.SearchBarTextChangeIntent;
        SystemHelper systemHelper = this.y;
        if (z3) {
            UniversalPickerIntent.SearchBarTextChangeIntent searchBarTextChangeIntent = (UniversalPickerIntent.SearchBarTextChangeIntent) intent;
            String str = searchBarTextChangeIntent.f5075a;
            if (str.length() == 1) {
                this.q.j(((UniversalPickerViewState) stateFlow.getValue()).p.f5085a, ((UniversalPickerViewState) stateFlow.getValue()).p.c, ((UniversalPickerViewState) stateFlow.getValue()).p.d, str);
            }
            String str2 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            E0(new sh1(searchBarTextChangeIntent, 14));
            String str3 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            UniversalSearchFlowSource universalSearchFlowSource = ((UniversalPickerViewState) stateFlow.getValue()).l;
            UniversalSearchOptions universalSearchOptions = ((UniversalPickerViewState) stateFlow.getValue()).m;
            UniversalSearchResultAnalyticProperties universalSearchResultAnalyticProperties = new UniversalSearchResultAnalyticProperties(systemHelper.j(), ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a, ((UniversalPickerViewState) stateFlow.getValue()).p.c, ((UniversalPickerViewState) stateFlow.getValue()).p.d);
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.o.b(str2, str3, universalSearchFlowSource, universalSearchOptions, universalSearchResultAnalyticProperties, universalSearchDescriptiveLocationAppModel != null ? universalSearchDescriptiveLocationAppModel.e : null, ((UniversalPickerViewState) stateFlow.getValue()).o);
            return;
        }
        boolean z4 = intent instanceof UniversalPickerIntent.HomeNavigationButtonPressIntent;
        UniversalPickerArgs universalPickerArgs = this.k;
        if (z4) {
            this.q.m(((UniversalPickerViewState) stateFlow.getValue()).p.f5085a, ((UniversalPickerViewState) stateFlow.getValue()).k, ((UniversalPickerViewState) stateFlow.getValue()).p.c, ((UniversalPickerViewState) stateFlow.getValue()).p.d, ((UniversalPickerViewState) stateFlow.getValue()).b, ((UniversalPickerViewState) stateFlow.getValue()).p.e);
            String str4 = ((UniversalPickerViewState) stateFlow.getValue()).p.b;
            if (Intrinsics.d(str4, UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.getSourceName())) {
                String str5 = universalPickerArgs.h;
                if (str5 != null) {
                    I0(str5, new UniversalSearchResultState(null, null, "NONE", null, 10));
                    return;
                }
                return;
            }
            if (Intrinsics.d(str4, UniversalSearchFlowSource.TRIP_PLANNER.getSourceName())) {
                E0(new xj1(28));
                String str6 = universalPickerArgs.h;
                if (str6 != null) {
                    I0(str6, new UniversalSearchResultState(null, null, "NONE", null, 10));
                    return;
                }
                return;
            }
            int i = WhenMappings.c[((UniversalPickerViewState) stateFlow.getValue()).f.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            q0(new sm1(this, 2));
            return;
        }
        if (intent instanceof UniversalPickerIntent.PlaceRecentItemClickIntent) {
            RecentPlaceAppModel recentPlaceAppModel = ((UniversalPickerIntent.PlaceRecentItemClickIntent) intent).f5064a.c;
            String str7 = recentPlaceAppModel.g;
            UniversalSearchItemType universalSearchItemType = UniversalSearchItemType.LOCATION;
            this.q.f(str7, universalSearchItemType, ((UniversalPickerViewState) stateFlow.getValue()).k, true, ((UniversalPickerViewState) stateFlow.getValue()).p.b);
            long j = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
            String str8 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            String str9 = recentPlaceAppModel.e;
            String str10 = recentPlaceAppModel.f;
            String str11 = recentPlaceAppModel.g;
            String str12 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
            List list = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof UniversalSearchItem.RouteList) {
                    arrayList.add(obj);
                }
            }
            UniversalSearchItem.RouteList routeList = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList);
            int size = routeList != null ? routeList.f5002a.size() : 0;
            List list2 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                    arrayList2.add(obj2);
                }
            }
            UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList2);
            int size2 = placesAndStopsItem != null ? placesAndStopsItem.f5001a.size() : 0;
            LatLng latLng = recentPlaceAppModel.j;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.q.h(j, str8, str9, str10, str11, size, size2, -1, universalSearchItemType, str12, ((UniversalPickerViewState) stateFlow.getValue()).p.d, latLng, universalSearchDescriptiveLocationAppModel2 != null ? universalSearchDescriptiveLocationAppModel2.e : null, true);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRecentPlaceItemClickIntent$1(this, recentPlaceAppModel, null), 3);
            String str13 = recentPlaceAppModel.g;
            LatLng latLng2 = recentPlaceAppModel.j;
            String str14 = recentPlaceAppModel.i;
            String str15 = str14 == null ? "" : str14;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel3 = new UniversalSearchDescriptiveLocationAppModel(str13, str15, recentPlaceAppModel.e, recentPlaceAppModel.f, latLng2);
            int i2 = WhenMappings.f5044a[((UniversalPickerViewState) stateFlow.getValue()).n.ordinal()];
            if (i2 == 1) {
                q0(new um1(this, universalSearchDescriptiveLocationAppModel3, 1));
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                H0(latLng2, str15);
                return;
            } else {
                String str16 = universalPickerArgs.h;
                if (str16 != null) {
                    Json json = ChaloJson.b;
                    json.getClass();
                    I0(str16, new UniversalSearchResultState(null, json.a(RecentPlaceAppModel.INSTANCE.serializer(), recentPlaceAppModel), recentPlaceAppModel.k.name(), null, 9));
                    return;
                }
                return;
            }
        }
        if (intent instanceof UniversalPickerIntent.RemoveRecentPlaceIntent) {
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveFromRecentDestinationIntent$1(this, (UniversalPickerIntent.RemoveRecentPlaceIntent) intent, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RemoveFromRouteRecentDataStoreIntent) {
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveFromRecentBusStoreIntent$1(this, (UniversalPickerIntent.RemoveFromRouteRecentDataStoreIntent) intent, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RemoveFromStopRecentDataStoreIntent) {
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveFromRecentStopStoreIntent$1(this, (UniversalPickerIntent.RemoveFromStopRecentDataStoreIntent) intent, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RemoveRecentTripIntent) {
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveRecentTripClickIntent$1(this, (UniversalPickerIntent.RemoveRecentTripIntent) intent, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RouteRecentItemClickIntent) {
            RecentRouteAppModel recentRouteAppModel = ((UniversalPickerIntent.RouteRecentItemClickIntent) intent).f5072a.c;
            String str17 = recentRouteAppModel.j;
            if (str17 == null) {
                str17 = "";
            }
            K0(str17, recentRouteAppModel.h, recentRouteAppModel.g, recentRouteAppModel.m, true);
            long j2 = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
            String str18 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            String str19 = recentRouteAppModel.e;
            String str20 = recentRouteAppModel.g;
            String str21 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
            UniversalSearchItemType universalSearchItemType2 = UniversalSearchItemType.ROUTE;
            List list3 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                if (obj3 instanceof UniversalSearchItem.RouteList) {
                    arrayList3.add(obj3);
                }
            }
            UniversalSearchItem.RouteList routeList2 = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList3);
            int size3 = routeList2 != null ? routeList2.f5002a.size() : 0;
            List list4 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list4) {
                if (obj4 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                    arrayList4.add(obj4);
                }
            }
            UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem2 = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList4);
            int size4 = placesAndStopsItem2 != null ? placesAndStopsItem2.f5001a.size() : 0;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel4 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.q.h(j2, str18, str19, "", str20, size3, size4, -1, universalSearchItemType2, str21, ((UniversalPickerViewState) stateFlow.getValue()).p.d, null, universalSearchDescriptiveLocationAppModel4 != null ? universalSearchDescriptiveLocationAppModel4.e : null, true);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRouteRecentItemClickIntent$1(this, recentRouteAppModel, null), 3);
            String str22 = recentRouteAppModel.j;
            if (str22 == null) {
                str22 = "";
            }
            K0(str22, recentRouteAppModel.h, recentRouteAppModel.g, recentRouteAppModel.m, true);
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(recentRouteAppModel.e, null, Source.UNIVERSAL_SEARCH.getSourceName(), 238);
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA = json2.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA != null) {
                q0(new cm1(4, this, strA));
                return;
            }
            return;
        }
        if (intent instanceof UniversalPickerIntent.RecentTripItemClickIntent) {
            RecentTripAppModel recentTripAppModel = ((UniversalPickerIntent.RecentTripItemClickIntent) intent).f5065a.c;
            String str23 = recentTripAppModel.g.f9007a;
            String str24 = str23 == null ? "" : str23;
            String str25 = recentTripAppModel.h.f9007a;
            this.q.g(str24, str25 == null ? "" : str25, UniversalSearchItemType.TRIP_LOCATION, ((UniversalPickerViewState) stateFlow.getValue()).k, ((UniversalPickerViewState) stateFlow.getValue()).p.c, ((UniversalPickerViewState) stateFlow.getValue()).p.d);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRecentTripItemClickIntent$1(this, recentTripAppModel, null), 3);
            q0(new cm1(3, this, recentTripAppModel));
            return;
        }
        if (intent instanceof UniversalPickerIntent.SeeMoreOrSeeLessItemClickIntent) {
            E0(new tm1(this, 1));
            return;
        }
        if (intent instanceof UniversalPickerIntent.StopRecentItemClickIntent) {
            RecentStopAppModel recentStopAppModel = ((UniversalPickerIntent.StopRecentItemClickIntent) intent).f5077a.c;
            String str26 = recentStopAppModel.g.b;
            String str27 = recentStopAppModel.e;
            UniversalSearchItemType universalSearchItemType3 = UniversalSearchItemType.STOP;
            this.q.c(str26, str27, universalSearchItemType3, ((UniversalPickerViewState) stateFlow.getValue()).k, true, ((UniversalPickerViewState) stateFlow.getValue()).p.b);
            long j3 = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
            String str28 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            String str29 = recentStopAppModel.e;
            StopAppModel stopAppModel = recentStopAppModel.g;
            String strN = stopAppModel.b;
            String str30 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
            List list5 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list5) {
                long j4 = j3;
                if (obj5 instanceof UniversalSearchItem.RouteList) {
                    arrayList5.add(obj5);
                }
                j3 = j4;
            }
            long j5 = j3;
            UniversalSearchItem.RouteList routeList3 = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList5);
            int size5 = routeList3 != null ? routeList3.f5002a.size() : 0;
            List list6 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list6) {
                if (obj6 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                    arrayList6.add(obj6);
                }
            }
            UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem3 = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList6);
            int size6 = placesAndStopsItem3 != null ? placesAndStopsItem3.f5001a.size() : 0;
            LatLng latLng3 = stopAppModel.c;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel5 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.q.h(j5, str28, str29, "", strN, size5, size6, -1, universalSearchItemType3, str30, ((UniversalPickerViewState) stateFlow.getValue()).p.d, latLng3, universalSearchDescriptiveLocationAppModel5 != null ? universalSearchDescriptiveLocationAppModel5.e : null, true);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleStopRecentItemClickIntent$1(this, recentStopAppModel, null), 3);
            String str31 = stopAppModel.e;
            LatLng latLng4 = stopAppModel.c;
            if (str31 != null && str31.length() != 0) {
                strN = vo1.n(strN, ", ", stopAppModel.e);
            }
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel6 = new UniversalSearchDescriptiveLocationAppModel(str31, strN, recentStopAppModel.e, "searchPartnerChaloStop", latLng4);
            int i3 = WhenMappings.f5044a[((UniversalPickerViewState) stateFlow.getValue()).n.ordinal()];
            if (i3 == 1) {
                q0(new um1(this, universalSearchDescriptiveLocationAppModel6, 2));
                return;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            String str32 = universalPickerArgs.h;
            if (str32 != null) {
                Json json3 = ChaloJson.b;
                json3.getClass();
                I0(str32, new UniversalSearchResultState(json3.a(StopAppModel.INSTANCE.serializer(), stopAppModel), null, recentStopAppModel.h.name(), null, 10));
                return;
            }
            return;
        }
        if (intent instanceof UniversalPickerIntent.UniversalSearchRouteItemClick) {
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1(this, (UniversalPickerIntent.UniversalSearchRouteItemClick) intent, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.UniversalSearchPlaceItemClickIntent) {
            UniversalPickerIntent.UniversalSearchPlaceItemClickIntent universalSearchPlaceItemClickIntent = (UniversalPickerIntent.UniversalSearchPlaceItemClickIntent) intent;
            UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = universalSearchPlaceItemClickIntent.f5078a;
            String str33 = universalSearchPlacesAndStopsInfoModel.c;
            String str34 = universalSearchPlacesAndStopsInfoModel.b;
            if (str33 == null || str33.length() == 0) {
                return;
            }
            String str35 = str34 == null ? "" : str34;
            UniversalSearchItemType universalSearchItemType4 = UniversalSearchItemType.LOCATION;
            this.q.f(str35, universalSearchItemType4, ((UniversalPickerViewState) stateFlow.getValue()).k, false, ((UniversalPickerViewState) stateFlow.getValue()).p.b);
            long j6 = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
            String str36 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            String str37 = universalSearchPlacesAndStopsInfoModel.c;
            String str38 = universalSearchPlacesAndStopsInfoModel.i;
            String str39 = str34 == null ? "" : str34;
            String str40 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
            int i4 = universalSearchPlaceItemClickIntent.b;
            List list7 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : list7) {
                if (obj7 instanceof UniversalSearchItem.RouteList) {
                    arrayList7.add(obj7);
                }
            }
            UniversalSearchItem.RouteList routeList4 = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList7);
            int size7 = routeList4 != null ? routeList4.f5002a.size() : 0;
            List list8 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj8 : list8) {
                if (obj8 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                    arrayList8.add(obj8);
                }
            }
            UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem4 = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList8);
            int size8 = placesAndStopsItem4 != null ? placesAndStopsItem4.f5001a.size() : 0;
            LatLng latLng5 = universalSearchPlacesAndStopsInfoModel.g;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel7 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.q.h(j6, str36, str37, str38, str39, size7, size8, i4, universalSearchItemType4, str40, ((UniversalPickerViewState) stateFlow.getValue()).p.d, latLng5, universalSearchDescriptiveLocationAppModel7 != null ? universalSearchDescriptiveLocationAppModel7.e : null, false);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handlePickerPlaceItemClickIntent$1(this, universalSearchPlacesAndStopsInfoModel, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.UniversalSearchStopItemClickIntent) {
            UniversalPickerIntent.UniversalSearchStopItemClickIntent universalSearchStopItemClickIntent = (UniversalPickerIntent.UniversalSearchStopItemClickIntent) intent;
            UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel2 = universalSearchStopItemClickIntent.f5080a;
            if (universalSearchPlacesAndStopsInfoModel2.d.length() == 0) {
                return;
            }
            String str41 = universalSearchPlacesAndStopsInfoModel2.e;
            String str42 = universalSearchPlacesAndStopsInfoModel2.d;
            UniversalSearchItemType universalSearchItemType5 = UniversalSearchItemType.STOP;
            this.q.c(str41, str42, universalSearchItemType5, ((UniversalPickerViewState) stateFlow.getValue()).k, false, ((UniversalPickerViewState) stateFlow.getValue()).p.b);
            long j7 = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
            String str43 = ((UniversalPickerViewState) stateFlow.getValue()).k;
            String str44 = universalSearchPlacesAndStopsInfoModel2.d;
            String str45 = universalSearchPlacesAndStopsInfoModel2.i;
            String str46 = universalSearchPlacesAndStopsInfoModel2.e;
            String str47 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
            int i5 = universalSearchStopItemClickIntent.b;
            List list9 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList9 = new ArrayList();
            for (Object obj9 : list9) {
                if (obj9 instanceof UniversalSearchItem.RouteList) {
                    arrayList9.add(obj9);
                }
            }
            UniversalSearchItem.RouteList routeList5 = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList9);
            int size9 = routeList5 != null ? routeList5.f5002a.size() : 0;
            List list10 = ((UniversalPickerViewState) stateFlow.getValue()).b;
            ArrayList arrayList10 = new ArrayList();
            for (Object obj10 : list10) {
                if (obj10 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                    arrayList10.add(obj10);
                }
            }
            UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem5 = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList10);
            int size10 = placesAndStopsItem5 != null ? placesAndStopsItem5.f5001a.size() : 0;
            LatLng latLng6 = universalSearchPlacesAndStopsInfoModel2.g;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel8 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            this.q.h(j7, str43, str44, str45, str46, size9, size10, i5, universalSearchItemType5, str47, ((UniversalPickerViewState) stateFlow.getValue()).p.d, latLng6, universalSearchDescriptiveLocationAppModel8 != null ? universalSearchDescriptiveLocationAppModel8.e : null, false);
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handlePickerStopItemClickIntent$1(this, universalSearchPlacesAndStopsInfoModel2, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.SaveStopToFavoriteIntent) {
            UniversalPickerIntent.SaveStopToFavoriteIntent saveStopToFavoriteIntent = (UniversalPickerIntent.SaveStopToFavoriteIntent) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleDialogSaveStopToFavoriteClickIntent$1(this, saveStopToFavoriteIntent.b.c, saveStopToFavoriteIntent.f5074a, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.SavePlaceToFavoriteIntent) {
            UniversalPickerIntent.SavePlaceToFavoriteIntent savePlaceToFavoriteIntent = (UniversalPickerIntent.SavePlaceToFavoriteIntent) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleDialogSavePlaceToFavoriteClickIntent$1(this, savePlaceToFavoriteIntent.b.c, savePlaceToFavoriteIntent.f5073a, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RemoveFavoritePlaceItem) {
            UniversalPickerIntent.RemoveFavoritePlaceItem removeFavoritePlaceItem = (UniversalPickerIntent.RemoveFavoritePlaceItem) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveFavoritePlaceItem$1(this, removeFavoritePlaceItem.f5066a, removeFavoritePlaceItem.b, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.RemoveFavoriteStopItem) {
            UniversalPickerIntent.RemoveFavoriteStopItem removeFavoriteStopItem = (UniversalPickerIntent.RemoveFavoriteStopItem) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleRemoveFavoriteStopItem$1(this, removeFavoriteStopItem.f5067a, removeFavoriteStopItem.b, null), 3);
            return;
        }
        boolean z5 = intent instanceof UniversalPickerIntent.FavoriteStopItemClicked;
        ChaloNavigationManager chaloNavigationManager = this.z;
        if (z5) {
            RecentStopAppModel recentStopAppModel2 = ((UniversalPickerIntent.FavoriteStopItemClicked) intent).f5057a.c;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleFavoriteStopItemClickedIntent$1(this, recentStopAppModel2, null), 3);
            StopAppModel stopAppModel2 = recentStopAppModel2.g;
            String strN2 = stopAppModel2.b;
            String str48 = stopAppModel2.e;
            if (str48 != null && str48.length() != 0) {
                strN2 = vo1.n(strN2, ", ", str48);
            }
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel9 = new UniversalSearchDescriptiveLocationAppModel(stopAppModel2.e, strN2, recentStopAppModel2.e, "searchPartnerChaloStop", stopAppModel2.c);
            int i6 = WhenMappings.f5044a[((UniversalPickerViewState) stateFlow.getValue()).n.ordinal()];
            if (i6 == 1) {
                Json json4 = ChaloJson.b;
                json4.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json4.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel9)), null, null, 6));
                return;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                String str49 = universalPickerArgs.h;
                if (str49 != null) {
                    Json json5 = ChaloJson.b;
                    json5.getClass();
                    I0(str49, new UniversalSearchResultState(json5.a(StopAppModel.INSTANCE.serializer(), stopAppModel2), null, recentStopAppModel2.h.name(), null, 10));
                    return;
                }
                return;
            }
        }
        if (intent instanceof UniversalPickerIntent.FavoritePlaceItemClicked) {
            RecentPlaceAppModel recentPlaceAppModel2 = ((UniversalPickerIntent.FavoritePlaceItemClicked) intent).f5056a.c;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleFavoritePlaceItemClickedIntent$1(this, recentPlaceAppModel2, null), 3);
            String str50 = recentPlaceAppModel2.i;
            String str51 = str50 == null ? "" : str50;
            String str52 = recentPlaceAppModel2.g;
            String str53 = recentPlaceAppModel2.e;
            String str54 = recentPlaceAppModel2.f;
            LatLng latLng7 = recentPlaceAppModel2.j;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel10 = new UniversalSearchDescriptiveLocationAppModel(str52, str51, str53, str54, latLng7);
            int i7 = WhenMappings.f5044a[((UniversalPickerViewState) stateFlow.getValue()).n.ordinal()];
            if (i7 == 1) {
                Json json6 = ChaloJson.b;
                json6.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(null, json6.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel10)), null, null, 6));
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                H0(latLng7, str51);
                return;
            } else {
                String str55 = universalPickerArgs.h;
                if (str55 != null) {
                    Json json7 = ChaloJson.b;
                    json7.getClass();
                    I0(str55, new UniversalSearchResultState(null, json7.a(RecentPlaceAppModel.INSTANCE.serializer(), recentPlaceAppModel2), recentPlaceAppModel2.k.name(), null, 9));
                    return;
                }
                return;
            }
        }
        if (intent instanceof UniversalPickerIntent.EditPlaceFavoriteIntent) {
            UniversalPickerIntent.EditPlaceFavoriteIntent editPlaceFavoriteIntent = (UniversalPickerIntent.EditPlaceFavoriteIntent) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleEditPlaceFavoriteClickIntent$1(this, editPlaceFavoriteIntent.b.c, editPlaceFavoriteIntent.f5054a, null), 3);
            return;
        }
        if (intent instanceof UniversalPickerIntent.EditStopFavoriteIntent) {
            UniversalPickerIntent.EditStopFavoriteIntent editStopFavoriteIntent = (UniversalPickerIntent.EditStopFavoriteIntent) intent;
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$handleEditStopFavoriteClickIntent$1(this, editStopFavoriteIntent.b.c, editStopFavoriteIntent.f5055a, null), 3);
            return;
        }
        boolean zEquals = intent.equals(UniversalPickerIntent.ChaloBusCardClicked.f5052a);
        UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper = this.q;
        if (zEquals) {
            universalSearchAnalyticsEventHelper.b(((UniversalPickerViewState) stateFlow.getValue()).p.b);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.StopSelectionArgs((String) null, false, false, Source.UNIVERSAL_SEARCH, (String) null, 23), null, null, 6));
            return;
        }
        if (intent.equals(UniversalPickerIntent.OnCurrentLocationItemClicked.f5059a)) {
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel11 = ((UniversalPickerViewState) stateFlow.getValue()).r;
            if (universalSearchDescriptiveLocationAppModel11 != null) {
                int i8 = WhenMappings.f5044a[((UniversalPickerViewState) stateFlow.getValue()).n.ordinal()];
                if (i8 == 1) {
                    q0(new um1(this, universalSearchDescriptiveLocationAppModel11, 0));
                    return;
                }
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                String str56 = universalPickerArgs.h;
                if (str56 != null) {
                    Json json8 = ChaloJson.b;
                    String str57 = universalSearchDescriptiveLocationAppModel11.c;
                    LatLng latLng8 = universalSearchDescriptiveLocationAppModel11.e;
                    String str58 = universalSearchDescriptiveLocationAppModel11.f9007a;
                    String str59 = universalSearchDescriptiveLocationAppModel11.b;
                    String str60 = universalSearchDescriptiveLocationAppModel11.d;
                    RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.NONE;
                    String strB = CityProviderKt.b(this.l);
                    RecentPlaceAppModel recentPlaceAppModel3 = new RecentPlaceAppModel(str57, str60, str59, strB == null ? "" : strB, str58, latLng8, recentsSpecialStatus, 0L, (String) null, 384);
                    json8.getClass();
                    I0(str56, new UniversalSearchResultState(null, json8.a(RecentPlaceAppModel.INSTANCE.serializer(), recentPlaceAppModel3), "NONE", null, 9));
                    return;
                }
                return;
            }
            return;
        }
        if (intent.equals(UniversalPickerIntent.UseCurrentLocationClickedIntent.f5081a)) {
            UniversalSearchAnalyticsEventHelper.DefaultImpls.a(universalSearchAnalyticsEventHelper, "use_current_location_clicked", Source.UNIVERSAL_SEARCH, null, 28);
            E0(new xj1(27));
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$startLocationUpdates$1(this, null), 3);
            return;
        }
        if (intent.equals(UniversalPickerIntent.OnGpsEnabled.f5060a)) {
            Job job = this.F;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            BuildersKt.d(contextScope, null, null, new UniversalPickerComponent$startLocationUpdates$1(this, null), 3);
            return;
        }
        if (intent.equals(UniversalPickerIntent.OnViewChaloCitiesClickIntent.f5062a)) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.UNIVERSAL_SEARCH, null, 4), null, null, 6));
            return;
        }
        if (intent.equals(UniversalPickerIntent.OnGpsPermissionDenied.f5061a)) {
            E0(new vm1(0));
            Job job2 = this.F;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
                return;
            }
            return;
        }
        if (!(intent instanceof UniversalPickerIntent.PermissionRationaleDialogInteraction)) {
            throw new NoWhenBranchMatchedException();
        }
        UniversalPickerIntent.PermissionRationaleDialogInteraction permissionRationaleDialogInteraction = (UniversalPickerIntent.PermissionRationaleDialogInteraction) intent;
        Job job3 = this.F;
        if (job3 != null) {
            ((JobSupport) job3).cancel(null);
        }
        E0(new xj1(29));
        if (!permissionRationaleDialogInteraction.f5063a) {
            UniversalSearchAnalyticsEventHelper.DefaultImpls.a(universalSearchAnalyticsEventHelper, "access location event", Source.UNIVERSAL_SEARCH, vo1.s("locationAccessAction", "closeDialogToEnableLocationFromSetting"), 24);
        } else {
            UniversalSearchAnalyticsEventHelper.DefaultImpls.a(universalSearchAnalyticsEventHelper, "access location event", Source.UNIVERSAL_SEARCH, vo1.s("locationAccessAction", "clickSettingOptionForLocation"), 24);
            systemHelper.b();
        }
    }

    public final void K0(String str, String str2, String str3, boolean z, boolean z2) {
        UniversalSearchItemType universalSearchItemType = UniversalSearchItemType.ROUTE;
        StateFlow stateFlow = this.f;
        this.q.d(str, str2, str3, z, universalSearchItemType, ((UniversalPickerViewState) stateFlow.getValue()).k, z2, ((UniversalPickerViewState) stateFlow.getValue()).p.b);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (UniversalPickerViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new UniversalPickerViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new UniversalPickerViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.o.clear();
    }
}

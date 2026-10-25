package app.chalo.metro.ui.regular;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.domain.FetchAllMetroStopsUseCase;
import app.chalo.citydata.domain.StopListFetchErrorType;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.SeatLimitAppModel;
import app.chalo.login.LoginAuthGuard;
import app.chalo.metro.domain.FetchTicketBookingsFareUseCase;
import app.chalo.metro.domain.TicketBookingTripData;
import app.chalo.metro.ui.landing.PickStopRequestType;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenViewState;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingUiStateFactory;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.productbooking.common.data.models.app.response.TicketBookingFareAppModel;
import app.chalo.productbooking.common.domain.FetchProductConfigForUiErrorReason;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.ab1;
import defpackage.g41;
import defpackage.g61;
import defpackage.l91;
import defpackage.li0;
import defpackage.mi0;
import defpackage.oi0;
import defpackage.q60;
import defpackage.vo1;
import defpackage.yg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenDataState;", "Lapp/chalo/metro/ui/regular/uistate/StopBasedMetroLandingScreenViewState;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedMetroLandingScreenComponent extends ChaloBaseStateMviComponent<StopBasedMetroLandingScreenViewIntent, StopBasedMetroLandingScreenDataState, StopBasedMetroLandingScreenViewState, StopBasedMetroLandingScreenSideEffect> {
    public String A;
    public Job B;
    public final CityProvider k;
    public final StringProvider l;
    public final BasicInfoContract m;
    public final RecentRepositoryProvider n;
    public final RouteSearchResultStateManager o;
    public final FetchProductConfigsForUiUseCase p;
    public final FetchAllMetroStopsUseCase q;
    public final FetchTicketBookingsFareUseCase r;
    public final StopBasedMetroLandingUiStateFactory s;
    public final AnalyticsContract t;
    public final GetProductCapabilitiesUseCase u;
    public final KotlinToastManager v;
    public final ChaloNavigationManager w;
    public final LoginAuthGuard x;
    public final UserProfileDetailsProvider y;
    public Job z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5533a;

        static {
            int[] iArr = new int[PickStopRequestType.values().length];
            try {
                iArr[PickStopRequestType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickStopRequestType.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PickStopRequestType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5533a = iArr;
        }
    }

    public StopBasedMetroLandingScreenComponent(ComponentContext componentContext, StopBasedMetroLandingArgs stopBasedMetroLandingArgs, CityProvider cityProvider, StringProvider stringProvider, BasicInfoContract basicInfoContract, RecentRepositoryProvider recentRepositoryProvider, RouteSearchResultStateManager routeSearchResultStateManager, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, FetchAllMetroStopsUseCase fetchAllMetroStopsUseCase, FetchTicketBookingsFareUseCase fetchTicketBookingsFareUseCase, StopBasedMetroLandingUiStateFactory stopBasedMetroLandingUiStateFactory, AnalyticsContract analyticsContract, GetProductCapabilitiesUseCase getProductCapabilitiesUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, LoginAuthGuard loginAuthGuard, UserProfileDetailsProvider userProfileDetailsProvider) {
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        super(componentContext);
        this.k = cityProvider;
        this.l = stringProvider;
        this.m = basicInfoContract;
        this.n = recentRepositoryProvider;
        this.o = routeSearchResultStateManager;
        this.p = fetchProductConfigsForUiUseCase;
        this.q = fetchAllMetroStopsUseCase;
        this.r = fetchTicketBookingsFareUseCase;
        this.s = stopBasedMetroLandingUiStateFactory;
        this.t = analyticsContract;
        this.u = getProductCapabilitiesUseCase;
        this.v = kotlinToastManager;
        this.w = chaloNavigationManager;
        this.x = loginAuthGuard;
        this.y = userProfileDetailsProvider;
        String str = stopBasedMetroLandingArgs.c;
        if (str != null) {
            Json json = ChaloJson.b;
            json.getClass();
            stopAppModel = (StopAppModel) json.b(str, StopAppModel.INSTANCE.serializer());
        } else {
            stopAppModel = null;
        }
        String str2 = stopBasedMetroLandingArgs.d;
        if (str2 != null) {
            Json json2 = ChaloJson.b;
            json2.getClass();
            stopAppModel2 = (StopAppModel) json2.b(str2, StopAppModel.INSTANCE.serializer());
        } else {
            stopAppModel2 = null;
        }
        P0(new StopBasedMetroLandingScreenViewIntent.InitialisationIntent(stopAppModel, stopAppModel2));
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = routeSearchResultStateManager.a("StopBasedMetroLanding_SK_Key", b, companion.serializer(), companion.serializer(), new g61(this, 14));
        if (resultStateRecoveredDataA != null) {
            this.z = BuildersKt.d(this.j, null, null, new StopBasedMetroLandingScreenComponent$3$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    public static final void F0(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, ArrayList arrayList, PickStopRequestType pickStopRequestType) {
        stopBasedMetroLandingScreenComponent.getClass();
        stopBasedMetroLandingScreenComponent.E0(new mi0(pickStopRequestType, 1));
        String strA = KUUID.a();
        Job job = stopBasedMetroLandingScreenComponent.z;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        stopBasedMetroLandingScreenComponent.A = strA;
        stopBasedMetroLandingScreenComponent.z = BuildersKt.d(stopBasedMetroLandingScreenComponent.j, null, null, new StopBasedMetroLandingScreenComponent$collectPickStopResultIfRequired$1(stopBasedMetroLandingScreenComponent, strA, null), 3);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            StopAppModel stopAppModel = (StopAppModel) obj;
            arrayList2.add(new ProductBookingStopDetails(stopAppModel.f1727a, stopAppModel.b, stopAppModel.e));
        }
        ChaloNavigationManager chaloNavigationManager = stopBasedMetroLandingScreenComponent.w;
        Source source = Source.STOP_BASED_METRO_LANDING_SCREEN;
        ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
        Json json = ChaloJson.b;
        json.getClass();
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PickStopArgs(source, strA, chaloTransitMode, json.a(new ArrayListSerializer(ProductBookingStopDetails.INSTANCE.serializer()), arrayList2)), null, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1 stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1;
        stopBasedMetroLandingScreenComponent.getClass();
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1) {
            stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1 = (StopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1 = new StopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1(stopBasedMetroLandingScreenComponent, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1 = new StopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1(stopBasedMetroLandingScreenComponent, continuationImpl);
        }
        Object objA = stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (!((StopBasedMetroLandingScreenDataState) stopBasedMetroLandingScreenComponent.f.getValue()).g.isEmpty()) {
                return unit;
            }
            stopBasedMetroLandingScreenComponent.E0(new ab1(2));
            FetchAllMetroStopsUseCase fetchAllMetroStopsUseCase = stopBasedMetroLandingScreenComponent.q;
            stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1.label = 1;
            objA = fetchAllMetroStopsUseCase.a(stopBasedMetroLandingScreenComponent$fetchAllMetroStopList$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) chaloUseCaseResult;
            AnalyticsContractImplKt.b(stopBasedMetroLandingScreenComponent.t, "metro all stations fetch success", Source.STOP_BASED_METRO_LANDING_SCREEN, vo1.s("count", String.valueOf(((List) success.f10419a).size())), false, 24);
            stopBasedMetroLandingScreenComponent.E0(new yg(success, 20));
            return unit;
        }
        AnalyticsContract analyticsContract = stopBasedMetroLandingScreenComponent.t;
        Source source = Source.STOP_BASED_METRO_LANDING_SCREEN;
        StopListFetchErrorType stopListFetchErrorType = (StopListFetchErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContractImplKt.b(analyticsContract, "metro all stations fetch failed", source, vo1.s("error", stopListFetchErrorType.toString()), false, 24);
        stopBasedMetroLandingScreenComponent.E0(new ab1(3));
        KotlinToastManagerKt.a(stopBasedMetroLandingScreenComponent.v, stopListFetchErrorType.toString(), ToastLength.SHORT);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object H0(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$fetchFareDetails$1 stopBasedMetroLandingScreenComponent$fetchFareDetails$1;
        StopAppModel stopAppModel;
        ChaloUseCaseResult chaloUseCaseResult;
        List list;
        StateFlow stateFlow = stopBasedMetroLandingScreenComponent.f;
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$fetchFareDetails$1) {
            stopBasedMetroLandingScreenComponent$fetchFareDetails$1 = (StopBasedMetroLandingScreenComponent$fetchFareDetails$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$fetchFareDetails$1 = new StopBasedMetroLandingScreenComponent$fetchFareDetails$1(stopBasedMetroLandingScreenComponent, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$fetchFareDetails$1 = new StopBasedMetroLandingScreenComponent$fetchFareDetails$1(stopBasedMetroLandingScreenComponent, continuationImpl);
        }
        Object objA = stopBasedMetroLandingScreenComponent$fetchFareDetails$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 1;
            if (stopBasedMetroLandingScreenComponent.L0(stopBasedMetroLandingScreenComponent$fetchFareDetails$1) != obj) {
            }
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else if (i2 == 2) {
            ResultKt.b(objA);
            chaloUseCaseResult = (ChaloUseCaseResult) objA;
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsContract analyticsContract = stopBasedMetroLandingScreenComponent.t;
                Source source = Source.STOP_BASED_METRO_LANDING_SCREEN;
                list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                AnalyticsContractImplKt.b(analyticsContract, "metro fare fetch success", source, vo1.s("count", String.valueOf(list.size())), false, 24);
                stopBasedMetroLandingScreenComponent.E0(new ab1(8));
                stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 3;
                if (stopBasedMetroLandingScreenComponent.N0(list, stopBasedMetroLandingScreenComponent$fetchFareDetails$1) != obj) {
                }
            }
            AnalyticsContract analyticsContract2 = stopBasedMetroLandingScreenComponent.t;
            Source source2 = Source.STOP_BASED_METRO_LANDING_SCREEN;
            ProductBookingDataSourceError productBookingDataSourceError = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            AnalyticsContractImplKt.b(analyticsContract2, "metro fare fetch failed", source2, vo1.s("error", productBookingDataSourceError.toString()), false, 24);
            stopBasedMetroLandingScreenComponent.E0(new ab1(7));
            KotlinToastManagerKt.a(stopBasedMetroLandingScreenComponent.v, productBookingDataSourceError.toString(), ToastLength.SHORT);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            ResultKt.b(objA);
        }
        stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 4;
        return stopBasedMetroLandingScreenComponent.Q0(stopBasedMetroLandingScreenComponent$fetchFareDetails$1) == obj ? obj : unit;
        if (((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).f5534a != null) {
            stopBasedMetroLandingScreenComponent.R0();
            return unit;
        }
        String str = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).c;
        if (str != null) {
            stopBasedMetroLandingScreenComponent.E0(new ab1(6));
            StopAppModel stopAppModel2 = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).i;
            if (stopAppModel2 != null && (stopAppModel = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).j) != null) {
                TicketBookingTripData ticketBookingTripData = new TicketBookingTripData(stopAppModel2, stopAppModel);
                FetchTicketBookingsFareUseCase fetchTicketBookingsFareUseCase = stopBasedMetroLandingScreenComponent.r;
                ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
                stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 2;
                objA = fetchTicketBookingsFareUseCase.a(ticketBookingTripData, str, chaloTransitMode, stopBasedMetroLandingScreenComponent$fetchFareDetails$1);
                if (objA != obj) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        AnalyticsContract analyticsContract3 = stopBasedMetroLandingScreenComponent.t;
                        Source source3 = Source.STOP_BASED_METRO_LANDING_SCREEN;
                        ProductBookingDataSourceError productBookingDataSourceError2 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                        AnalyticsContractImplKt.b(analyticsContract3, "metro fare fetch failed", source3, vo1.s("error", productBookingDataSourceError2.toString()), false, 24);
                        stopBasedMetroLandingScreenComponent.E0(new ab1(7));
                        KotlinToastManagerKt.a(stopBasedMetroLandingScreenComponent.v, productBookingDataSourceError2.toString(), ToastLength.SHORT);
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AnalyticsContract analyticsContract4 = stopBasedMetroLandingScreenComponent.t;
                        Source source4 = Source.STOP_BASED_METRO_LANDING_SCREEN;
                        list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        AnalyticsContractImplKt.b(analyticsContract4, "metro fare fetch success", source4, vo1.s("count", String.valueOf(list.size())), false, 24);
                        stopBasedMetroLandingScreenComponent.E0(new ab1(8));
                        stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 3;
                        if (stopBasedMetroLandingScreenComponent.N0(list, stopBasedMetroLandingScreenComponent$fetchFareDetails$1) != obj) {
                        }
                    }
                    stopBasedMetroLandingScreenComponent$fetchFareDetails$1.label = 4;
                    if (stopBasedMetroLandingScreenComponent.Q0(stopBasedMetroLandingScreenComponent$fetchFareDetails$1) == obj) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r1 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r1 == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
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
    public static final java.lang.Object I0(app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent.I0(app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, ResultStateData resultStateData, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$processPickStopResult$1 stopBasedMetroLandingScreenComponent$processPickStopResult$1;
        stopBasedMetroLandingScreenComponent.getClass();
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$processPickStopResult$1) {
            stopBasedMetroLandingScreenComponent$processPickStopResult$1 = (StopBasedMetroLandingScreenComponent$processPickStopResult$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$processPickStopResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$processPickStopResult$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$processPickStopResult$1 = new StopBasedMetroLandingScreenComponent$processPickStopResult$1(stopBasedMetroLandingScreenComponent, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$processPickStopResult$1 = new StopBasedMetroLandingScreenComponent$processPickStopResult$1(stopBasedMetroLandingScreenComponent, continuationImpl);
        }
        Object objB = stopBasedMetroLandingScreenComponent$processPickStopResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$processPickStopResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            stopBasedMetroLandingScreenComponent.A = null;
            if (!(resultStateData instanceof ResultStateData.Cancelled)) {
                if (!(resultStateData instanceof ResultStateData.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((InstantTicketResultState) ((ResultStateData.Success) resultStateData).f9039a).b;
                if (str != null) {
                    try {
                        Json json = ChaloJson.b;
                        json.getClass();
                        stopBasedMetroLandingScreenComponent.P0(new StopBasedMetroLandingScreenViewIntent.OnStationPickedIntent((ProductBookingStopDetails) json.b(str, ProductBookingStopDetails.INSTANCE.serializer())));
                    } catch (Exception unused) {
                        stopBasedMetroLandingScreenComponent$processPickStopResult$1.L$0 = stopBasedMetroLandingScreenComponent;
                        stopBasedMetroLandingScreenComponent$processPickStopResult$1.label = 1;
                        objB = stopBasedMetroLandingScreenComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], stopBasedMetroLandingScreenComponent$processPickStopResult$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        O0(stopBasedMetroLandingScreenComponent, (String) objB);
                    }
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        stopBasedMetroLandingScreenComponent = (StopBasedMetroLandingScreenComponent) stopBasedMetroLandingScreenComponent$processPickStopResult$1.L$0;
        ResultKt.b(objB);
        O0(stopBasedMetroLandingScreenComponent, (String) objB);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r7, r2, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K0(app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$1
            if (r0 == 0) goto L16
            r0 = r7
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$1 r0 = (app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$1 r0 = new app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            goto L5b
        L39:
            kotlin.ResultKt.b(r7)
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r7 = r6.n
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository r7 = r7.getC()
            app.chalo.providers.cityprovider.CityProvider r2 = r6.k
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r2 != 0) goto L4c
            java.lang.String r2 = ""
        L4c:
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r5 = app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode.METRO
            java.util.Set r5 = kotlin.collections.SetsKt.g(r5)
            r0.label = r4
            java.lang.Object r7 = r7.e(r2, r5, r0)
            if (r7 != r1) goto L5b
            goto L6b
        L5b:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$2 r2 = new app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$showRecentSearchedTrips$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.j(r7, r2, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent.K0(app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void O0(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, String str) {
        KotlinToastManagerKt.a(stopBasedMetroLandingScreenComponent.v, str, ToastLength.SHORT);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1 stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1;
        String str;
        StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent;
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1) {
            stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1 = (StopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1 = new StopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1 = new StopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1(this, continuationImpl);
        }
        Object objM0 = stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.label;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.b(objM0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stopBasedMetroLandingScreenComponent = (StopBasedMetroLandingScreenComponent) stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.L$0;
                ResultKt.b(objM0);
            }
            O0(stopBasedMetroLandingScreenComponent, (String) objM0);
            return unit;
        }
        ResultKt.b(objM0);
        StateFlow stateFlow = this.f;
        String str2 = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).c;
        if (str2 == null || str2.length() == 0 || (str = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).d) == null || str.length() == 0) {
            E0(new ab1(1));
            stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.label = 1;
            objM0 = M0(stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1);
            if (objM0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return unit;
        if (!((Boolean) objM0).booleanValue()) {
            stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.L$0 = this;
            stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1.label = 2;
            objM0 = this.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], stopBasedMetroLandingScreenComponent$fetchConfigIfNotAvailable$1);
            if (objM0 != coroutineSingletons) {
                stopBasedMetroLandingScreenComponent = this;
                O0(stopBasedMetroLandingScreenComponent, (String) objM0);
            }
            return coroutineSingletons;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object M0(ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$fetchValidConfig$1 stopBasedMetroLandingScreenComponent$fetchValidConfig$1;
        Object next;
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$fetchValidConfig$1) {
            stopBasedMetroLandingScreenComponent$fetchValidConfig$1 = (StopBasedMetroLandingScreenComponent$fetchValidConfig$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$fetchValidConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$fetchValidConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$fetchValidConfig$1 = new StopBasedMetroLandingScreenComponent$fetchValidConfig$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$fetchValidConfig$1 = new StopBasedMetroLandingScreenComponent$fetchValidConfig$1(this, continuationImpl);
        }
        StopBasedMetroLandingScreenComponent$fetchValidConfig$1 stopBasedMetroLandingScreenComponent$fetchValidConfig$2 = stopBasedMetroLandingScreenComponent$fetchValidConfig$1;
        Object objC = stopBasedMetroLandingScreenComponent$fetchValidConfig$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$fetchValidConfig$2.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objC);
            List listR = CollectionsKt.R("metroTicket");
            stopBasedMetroLandingScreenComponent$fetchValidConfig$2.label = 1;
            objC = this.p.c((252 & 1) != 0 ? null : listR, (252 & 2) != 0 ? null : null, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, null, null, null, stopBasedMetroLandingScreenComponent$fetchValidConfig$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        int i3 = 0;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            E0(new ab1(i3));
            AnalyticsContractImplKt.b(this.t, "metro config fetch failed", Source.STOP_BASED_METRO_LANDING_SCREEN, vo1.s("error", ((FetchProductConfigForUiErrorReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).toString()), false, 24);
            z = false;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it = ((ProductsConfigListForUiAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f8226a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((ProductConfigForUiAppModel) next).m, "metroTicket"));
            ProductConfigForUiAppModel productConfigForUiAppModel = (ProductConfigForUiAppModel) next;
            if (productConfigForUiAppModel == null) {
                return Boolean.FALSE;
            }
            AnalyticsContractImplKt.b(this.t, "metro config fetch success", Source.STOP_BASED_METRO_LANDING_SCREEN, MapsKt.i(new Pair("isActive", String.valueOf(productConfigForUiAppModel.i)), new Pair("configId", productConfigForUiAppModel.f8217a)), false, 24);
            E0(new l91(productConfigForUiAppModel, 11));
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N0(List list, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1 stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1;
        StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent;
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1) {
            stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1 = (StopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1 = new StopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1 = new StopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1(this, continuationImpl);
        }
        Object objB = stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!list.isEmpty()) {
                E0(new l91((TicketBookingFareAppModel) CollectionsKt.F(list), 12));
                R0();
                return unit;
            }
            stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.L$0 = this;
            stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.label = 1;
            objB = this.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            stopBasedMetroLandingScreenComponent = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stopBasedMetroLandingScreenComponent = (StopBasedMetroLandingScreenComponent) stopBasedMetroLandingScreenComponent$handleFareDetailsFetched$1.L$0;
            ResultKt.b(objB);
        }
        O0(stopBasedMetroLandingScreenComponent, (String) objB);
        return unit;
    }

    public final void P0(StopBasedMetroLandingScreenViewIntent intent) {
        MetroPassengerTypeDataModel metroPassengerTypeDataModel;
        MetroPassengerTypeDataModel metroPassengerTypeDataModel2;
        Object next;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof StopBasedMetroLandingScreenViewIntent.InitialisationIntent;
        int i = 3;
        ContextScope contextScope = this.j;
        if (z) {
            StopBasedMetroLandingScreenViewIntent.InitialisationIntent initialisationIntent = (StopBasedMetroLandingScreenViewIntent.InitialisationIntent) intent;
            AnalyticsContractImplKt.b(this.t, "stop based metro landing screen opened", Source.STOP_BASED_METRO_LANDING_SCREEN, null, false, 28);
            if (this.d) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleInitialisationIntent$1(this, initialisationIntent, null), 3);
            BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleInitialisationIntent$2(this, null), 3);
            this.d = true;
            return;
        }
        if (intent.equals(StopBasedMetroLandingScreenViewIntent.OnFromStationClick.f5538a)) {
            AnalyticsContractImplKt.b(this.t, "from station clicked", Source.STOP_BASED_METRO_LANDING_SCREEN, null, false, 28);
            BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleOnFromStationClicked$1(this, null), 3);
            return;
        }
        if (intent.equals(StopBasedMetroLandingScreenViewIntent.OnSearchButtonClick.f5543a)) {
            Job job = this.B;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.B = BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1(this, null), 3);
            return;
        }
        boolean zEquals = intent.equals(StopBasedMetroLandingScreenViewIntent.OnSwapButtonClick.f5545a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            StopAppModel stopAppModel = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).i;
            E0(new g41(13, this, stopAppModel));
            Source source = Source.STOP_BASED_METRO_LANDING_SCREEN;
            Pair pair = new Pair("from stop name", String.valueOf(stopAppModel != null ? stopAppModel.b : null));
            StopAppModel stopAppModel2 = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).j;
            AnalyticsContractImplKt.b(this.t, "swap button clicked", source, MapsKt.i(pair, new Pair("to stop name", String.valueOf(stopAppModel2 != null ? stopAppModel2.b : null))), false, 24);
            return;
        }
        if (intent.equals(StopBasedMetroLandingScreenViewIntent.OnToStationClick.f5546a)) {
            AnalyticsContractImplKt.b(this.t, "to station clicked", Source.STOP_BASED_METRO_LANDING_SCREEN, null, false, 28);
            BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleOnToStationClicked$1(this, null), 3);
            return;
        }
        int i2 = 4;
        if (intent instanceof StopBasedMetroLandingScreenViewIntent.OnRecentStopBasedTripPairClicked) {
            RecentStopBasedTripAppModel recentStopBasedTripAppModel = ((StopBasedMetroLandingScreenViewIntent.OnRecentStopBasedTripPairClicked) intent).f5542a;
            E0(new oi0(recentStopBasedTripAppModel, 1));
            Source source2 = Source.STOP_BASED_METRO_LANDING_SCREEN;
            StopAppModel stopAppModel3 = recentStopBasedTripAppModel.g;
            Pair pair2 = new Pair("from stop id", stopAppModel3.f1727a);
            Pair pair3 = new Pair("from stop name", stopAppModel3.b);
            StopAppModel stopAppModel4 = recentStopBasedTripAppModel.h;
            AnalyticsContractImplKt.b(this.t, "recent stop based trip clicked", source2, MapsKt.i(pair2, pair3, new Pair("to stop id", stopAppModel4.f1727a), new Pair("to stop name", stopAppModel4.b)), false, 24);
            return;
        }
        int i3 = 5;
        if (intent.equals(StopBasedMetroLandingScreenViewIntent.BottomSheetDismissIntent.f5535a)) {
            E0(new ab1(i3));
            return;
        }
        if (intent instanceof StopBasedMetroLandingScreenViewIntent.OnStationPickedIntent) {
            ProductBookingStopDetails productBookingStopDetails = ((StopBasedMetroLandingScreenViewIntent.OnStationPickedIntent) intent).f5544a;
            Iterator it = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((StopAppModel) next).f1727a, productBookingStopDetails.f8199a));
            StopAppModel stopAppModel5 = (StopAppModel) next;
            AnalyticsContractImplKt.b(this.t, "metro stop selected", Source.STOP_BASED_METRO_LANDING_SCREEN, MapsKt.i(new Pair("stop id", String.valueOf(stopAppModel5 != null ? stopAppModel5.f1727a : null)), new Pair("stop name", String.valueOf(stopAppModel5 != null ? stopAppModel5.b : null)), new Pair("stop type", ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).f.name())), false, 24);
            int i4 = WhenMappings.f5533a[((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).f.ordinal()];
            if (i4 == 1) {
                E0(new li0(i2, stopAppModel5));
                return;
            } else if (i4 == 2) {
                E0(new li0(i3, stopAppModel5));
                return;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (intent.equals(StopBasedMetroLandingScreenViewIntent.OnCloseButtonClicked.f5537a)) {
            E0(new ab1(i3));
            return;
        }
        if (intent instanceof StopBasedMetroLandingScreenViewIntent.OnPassengerDecreaseCountClick) {
            String str = ((StopBasedMetroLandingScreenViewIntent.OnPassengerDecreaseCountClick) intent).f5539a;
            Map map = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).l;
            if (map == null || (metroPassengerTypeDataModel2 = (MetroPassengerTypeDataModel) map.get(str)) == null) {
                return;
            }
            int i5 = metroPassengerTypeDataModel2.c;
            LinkedHashMap linkedHashMapU = MapsKt.u(map);
            MetroPassengerTypeDataModel metroPassengerTypeDataModel3 = (MetroPassengerTypeDataModel) linkedHashMapU.get(str);
            if (metroPassengerTypeDataModel3 != null) {
                linkedHashMapU.put(str, MetroPassengerTypeDataModel.a(metroPassengerTypeDataModel3, i5 - 1));
                E0(new q60(linkedHashMapU, i3));
                return;
            }
            return;
        }
        if (!(intent instanceof StopBasedMetroLandingScreenViewIntent.OnPassengerIncreaseCountClick)) {
            if (!intent.equals(StopBasedMetroLandingScreenViewIntent.OnProceedButtonClicked.f5541a)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.b(this.t, "booking mode proceed button clicked", Source.STOP_BASED_METRO_LANDING_SCREEN, null, false, 28);
            E0(new ab1(i3));
            BuildersKt.d(contextScope, null, null, new StopBasedMetroLandingScreenComponent$handleOnProceedButtonClicked$1(this, null), 3);
            return;
        }
        String str2 = ((StopBasedMetroLandingScreenViewIntent.OnPassengerIncreaseCountClick) intent).f5540a;
        Map map2 = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).l;
        if (map2 == null || (metroPassengerTypeDataModel = (MetroPassengerTypeDataModel) map2.get(str2)) == null) {
            return;
        }
        int i6 = metroPassengerTypeDataModel.c;
        LinkedHashMap linkedHashMapU2 = MapsKt.u(map2);
        MetroPassengerTypeDataModel metroPassengerTypeDataModel4 = (MetroPassengerTypeDataModel) linkedHashMapU2.get(str2);
        if (metroPassengerTypeDataModel4 != null) {
            linkedHashMapU2.put(str2, MetroPassengerTypeDataModel.a(metroPassengerTypeDataModel4, i6 + 1));
            E0(new q60(linkedHashMapU2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q0(ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1 stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String strN;
        String str;
        ChaloTransitMode chaloTransitMode;
        if (continuationImpl instanceof StopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1) {
            stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1 = (StopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1) continuationImpl;
            int i = stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1 = new StopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1 = new StopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1(this, continuationImpl);
        }
        Object objC = stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            StateFlow stateFlow = this.f;
            stopAppModel = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).i;
            if (stopAppModel != null && (stopAppModel2 = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).j) != null) {
                strN = vo1.n(stopAppModel.f1727a, "-", stopAppModel2.f1727a);
                String strB = CityProviderKt.b(this.k);
                if (strB == null) {
                    strB = "";
                }
                str = strB;
                chaloTransitMode = ChaloTransitMode.METRO;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0 = strN;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1 = str;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2 = stopAppModel;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3 = stopAppModel2;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4 = chaloTransitMode;
                stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = 1;
                objC = this.m.c(stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1);
                if (objC != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        chaloTransitMode = (ChaloTransitMode) stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4;
        stopAppModel2 = (StopAppModel) stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3;
        stopAppModel = (StopAppModel) stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2;
        str = (String) stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1;
        strN = (String) stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0;
        ResultKt.b(objC);
        RecentStopBasedTripAppModel recentStopBasedTripAppModel = new RecentStopBasedTripAppModel(strN, str, stopAppModel, stopAppModel2, chaloTransitMode, ((Number) objC).longValue(), 1);
        StopBasedTripRecentRepository c = this.n.getC();
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$0 = null;
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$1 = null;
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$2 = null;
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$3 = null;
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.L$4 = null;
        stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1.label = 2;
        return c.c(recentStopBasedTripAppModel, true, stopBasedMetroLandingScreenComponent$saveOrUpdateStopBasedRecentTripToStore$1) == coroutineSingletons ? coroutineSingletons : unit;
    }

    public final void R0() {
        List list;
        StateFlow stateFlow = this.f;
        if (((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).l != null) {
            E0(new ab1(4));
            return;
        }
        TicketBookingFareAppModel ticketBookingFareAppModel = ((StopBasedMetroLandingScreenDataState) stateFlow.getValue()).f5534a;
        if (ticketBookingFareAppModel == null || (list = ticketBookingFareAppModel.d) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) obj;
            String str = passengerDetailAppModel.d;
            String str2 = passengerDetailAppModel.g;
            int i3 = i == 0 ? 1 : 0;
            SeatLimitAppModel seatLimitAppModel = passengerDetailAppModel.i;
            linkedHashMap.put(str, new MetroPassengerTypeDataModel(i3, seatLimitAppModel.b, seatLimitAppModel.f3893a, str, str2));
            i = i2;
        }
        E0(new q60(linkedHashMap, 4));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenComponent$convertToUiState$2 stopBasedMetroLandingScreenComponent$convertToUiState$2 = new StopBasedMetroLandingScreenComponent$convertToUiState$2(1, this, StopBasedMetroLandingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;)V", 0);
        return this.s.d((StopBasedMetroLandingScreenDataState) obj, stopBasedMetroLandingScreenComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        PickStopRequestType pickStopRequestType = PickStopRequestType.NONE;
        EmptyList emptyList = EmptyList.f17557a;
        return new StopBasedMetroLandingScreenDataState(null, false, null, null, null, pickStopRequestType, emptyList, emptyList, null, null, StopBasedMetroLandingScreenBottomSheetType.None, null, null);
    }
}

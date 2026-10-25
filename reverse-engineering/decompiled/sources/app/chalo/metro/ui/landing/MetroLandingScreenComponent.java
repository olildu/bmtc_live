package app.chalo.metro.ui.landing;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import app.chalo.metro.ui.landing.uistate.MetroLandingUiStateFactory;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.FetchOndcConfigUseCase;
import app.chalo.ondc.domain.FetchOndcMetroLineStopsUseCase;
import app.chalo.ondc.domain.FetchOndcMetroLinesUseCase;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.FareDetailsRouteData;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.data.models.app.RouteProviderConfigAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.model.app.RecentAdditionalRouteInfoModel;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase;
import app.chalo.routeselection.domain.FetchRoutesResult;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.MetroLandingArgs;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.dd0;
import defpackage.li0;
import defpackage.mi0;
import defpackage.oi0;
import defpackage.t60;
import defpackage.xg0;
import defpackage.yg;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenDataState;", "Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenViewState;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroLandingScreenComponent extends ChaloBaseStateMviComponent<MetroLandingScreenViewIntent, MetroLandingScreenDataState, MetroLandingScreenViewState, MetroLandingScreenSideEffect> {
    public String A;
    public Job B;
    public MetroLandingScreenHelper C;
    public final CityProvider k;
    public final StringProvider l;
    public final BasicInfoContract m;
    public final RecentRepositoryProvider n;
    public final RouteSearchResultStateManager o;
    public final UniversalSearchResultStateManager p;
    public final FetchOndcMetroLinesUseCase q;
    public final FetchRoutesForGivenStopsUseCase r;
    public final FetchOndcConfigUseCase s;
    public final MetroLandingScreenHelperFactory t;
    public final ChaloNavigationManager u;
    public final MetroLandingUiStateFactory v;
    public final KotlinToastManager w;
    public final AnalyticsContract x;
    public Job y;
    public String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenComponent$Companion;", "", "", "ONDC", "Ljava/lang/String;", "STATE_KEEPER_KEY", "SEARCH_RESULT_STATE_MANAGER_STATE_KEEPER_KEY", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5484a;

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
            f5484a = iArr;
        }
    }

    public MetroLandingScreenComponent(ComponentContext componentContext, MetroLandingArgs metroLandingArgs, CityProvider cityProvider, StringProvider stringProvider, BasicInfoContract basicInfoContract, RecentRepositoryProvider recentRepositoryProvider, RouteSearchResultStateManager routeSearchResultStateManager, UniversalSearchResultStateManager universalSearchResultStateManager, FetchOndcMetroLinesUseCase fetchOndcMetroLinesUseCase, FetchOndcMetroLineStopsUseCase fetchOndcMetroLineStopsUseCase, FetchRoutesForGivenStopsUseCase fetchRoutesForGivenStopsUseCase, FetchOndcConfigUseCase fetchOndcConfigUseCase, MetroLandingScreenHelperFactory metroLandingScreenHelperFactory, ChaloNavigationManager chaloNavigationManager, MetroLandingUiStateFactory metroLandingUiStateFactory, KotlinToastManager kotlinToastManager, AnalyticsContract analyticsContract) {
        Object objB;
        StopAppModel stopAppModel;
        super(componentContext);
        this.k = cityProvider;
        this.l = stringProvider;
        this.m = basicInfoContract;
        this.n = recentRepositoryProvider;
        this.o = routeSearchResultStateManager;
        this.p = universalSearchResultStateManager;
        this.q = fetchOndcMetroLinesUseCase;
        this.r = fetchRoutesForGivenStopsUseCase;
        this.s = fetchOndcConfigUseCase;
        this.t = metroLandingScreenHelperFactory;
        this.u = chaloNavigationManager;
        this.v = metroLandingUiStateFactory;
        this.w = kotlinToastManager;
        this.x = analyticsContract;
        StateKeeper b = componentContext.getB();
        MetroLandingScreenRestoredState.Companion companion = MetroLandingScreenRestoredState.INSTANCE;
        MetroLandingScreenRestoredState metroLandingScreenRestoredState = (MetroLandingScreenRestoredState) b.a("metro_landing_screen_component", companion.serializer());
        componentContext.getB().d("metro_landing_screen_component", companion.serializer(), new zf0(2, this, metroLandingScreenRestoredState));
        String str = metroLandingArgs.c;
        StopAppModel stopAppModel2 = null;
        Object objB2 = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            stopAppModel = (StopAppModel) objB;
        } else {
            stopAppModel = null;
        }
        String str2 = metroLandingArgs.d;
        if (str2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
            }
            stopAppModel2 = (StopAppModel) objB2;
        }
        R0(new MetroLandingScreenViewIntent.InitialisationIntent(metroLandingScreenRestoredState, stopAppModel, stopAppModel2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(MetroLandingScreenComponent metroLandingScreenComponent, ArrayList arrayList, PickStopRequestType pickStopRequestType, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$collectAndNavigateToPickStop$1 metroLandingScreenComponent$collectAndNavigateToPickStop$1;
        ContextScope contextScope = metroLandingScreenComponent.j;
        if (continuationImpl instanceof MetroLandingScreenComponent$collectAndNavigateToPickStop$1) {
            metroLandingScreenComponent$collectAndNavigateToPickStop$1 = (MetroLandingScreenComponent$collectAndNavigateToPickStop$1) continuationImpl;
            int i = metroLandingScreenComponent$collectAndNavigateToPickStop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$collectAndNavigateToPickStop$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$collectAndNavigateToPickStop$1 = new MetroLandingScreenComponent$collectAndNavigateToPickStop$1(metroLandingScreenComponent, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$collectAndNavigateToPickStop$1 = new MetroLandingScreenComponent$collectAndNavigateToPickStop$1(metroLandingScreenComponent, continuationImpl);
        }
        Object objM0 = metroLandingScreenComponent$collectAndNavigateToPickStop$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$collectAndNavigateToPickStop$1.label;
        if (i2 == 0) {
            ResultKt.b(objM0);
            metroLandingScreenComponent.E0(new mi0(pickStopRequestType, 0));
            String strA = KUUID.a();
            Boolean bool = ((MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue()).d;
            if (bool != null) {
                Job job = metroLandingScreenComponent.y;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                metroLandingScreenComponent.z = strA;
                metroLandingScreenComponent.y = BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$collectPickStopResultIfRequired$1(bool, metroLandingScreenComponent, strA, null), 3);
            }
            metroLandingScreenComponent$collectAndNavigateToPickStop$1.label = 1;
            objM0 = metroLandingScreenComponent.M0(strA, arrayList, metroLandingScreenComponent$collectAndNavigateToPickStop$1);
            if (objM0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objM0);
        }
        SceneArgs sceneArgs = (SceneArgs) objM0;
        Unit unit = Unit.f17538a;
        if (sceneArgs == null) {
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$collectAndNavigateToPickStop$3(metroLandingScreenComponent, null), 3);
            return unit;
        }
        metroLandingScreenComponent.q0(new zf0(1, metroLandingScreenComponent, sceneArgs));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(MetroLandingScreenComponent metroLandingScreenComponent, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1 metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1;
        MetroStopsListResultType metroStopsListResultType;
        metroLandingScreenComponent.getClass();
        if (continuationImpl instanceof MetroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1) {
            metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1 = (MetroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1) continuationImpl;
            int i = metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1 = new MetroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1(metroLandingScreenComponent, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1 = new MetroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1(metroLandingScreenComponent, continuationImpl);
        }
        Object objF = metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            MetroLandingScreenHelper metroLandingScreenHelper = metroLandingScreenComponent.C;
            if (metroLandingScreenHelper != null) {
                MetroLandingScreenDataState metroLandingScreenDataState = (MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue();
                metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1.label = 1;
                objF = metroLandingScreenHelper.f(metroLandingScreenDataState, metroLandingScreenComponent$fetchStopsListAndUpdateStateIfRequired$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                metroStopsListResultType = null;
            }
            if (metroStopsListResultType == null) {
                return Boolean.FALSE;
            }
            if (metroStopsListResultType instanceof MetroStopsListResultType.WithMapping) {
                metroLandingScreenComponent.E0(new dd0(metroStopsListResultType, 25));
            } else if (!metroStopsListResultType.equals(MetroStopsListResultType.WithoutMapping.f5512a)) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objF);
        metroStopsListResultType = (MetroStopsListResultType) objF;
        if (metroStopsListResultType == null) {
            return Boolean.FALSE;
        }
        if (metroStopsListResultType instanceof MetroStopsListResultType.WithMapping) {
            metroLandingScreenComponent.E0(new dd0(metroStopsListResultType, 25));
        } else if (!metroStopsListResultType.equals(MetroStopsListResultType.WithoutMapping.f5512a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r2 == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
    
        if (r2 == r5) goto L47;
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
    public static final java.lang.Object H0(app.chalo.metro.ui.landing.MetroLandingScreenComponent r19, app.chalo.routeselection.domain.FetchRoutesResult r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.MetroLandingScreenComponent.H0(app.chalo.metro.ui.landing.MetroLandingScreenComponent, app.chalo.routeselection.domain.FetchRoutesResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(MetroLandingScreenComponent metroLandingScreenComponent, ResultStateData resultStateData, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$processPickStopResult$1 metroLandingScreenComponent$processPickStopResult$1;
        metroLandingScreenComponent.getClass();
        if (continuationImpl instanceof MetroLandingScreenComponent$processPickStopResult$1) {
            metroLandingScreenComponent$processPickStopResult$1 = (MetroLandingScreenComponent$processPickStopResult$1) continuationImpl;
            int i = metroLandingScreenComponent$processPickStopResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$processPickStopResult$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$processPickStopResult$1 = new MetroLandingScreenComponent$processPickStopResult$1(metroLandingScreenComponent, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$processPickStopResult$1 = new MetroLandingScreenComponent$processPickStopResult$1(metroLandingScreenComponent, continuationImpl);
        }
        Object objB = metroLandingScreenComponent$processPickStopResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$processPickStopResult$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            metroLandingScreenComponent.z = null;
            if (resultStateData instanceof ResultStateData.Cancelled) {
                return unit;
            }
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((InstantTicketResultState) ((ResultStateData.Success) resultStateData).f9039a).b;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    metroLandingScreenComponent.R0(new MetroLandingScreenViewIntent.OnStationPickedIntent((ProductBookingStopDetails) json.b(str, ProductBookingStopDetails.INSTANCE.serializer())));
                } catch (Exception unused) {
                    metroLandingScreenComponent$processPickStopResult$1.L$0 = metroLandingScreenComponent;
                    metroLandingScreenComponent$processPickStopResult$1.label = 1;
                    objB = metroLandingScreenComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$processPickStopResult$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Q0(metroLandingScreenComponent, (String) objB);
                }
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        metroLandingScreenComponent = (MetroLandingScreenComponent) metroLandingScreenComponent$processPickStopResult$1.L$0;
        ResultKt.b(objB);
        Q0(metroLandingScreenComponent, (String) objB);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(MetroLandingScreenComponent metroLandingScreenComponent, ResultStateData resultStateData, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$processUniversalSearchResult$1 metroLandingScreenComponent$processUniversalSearchResult$1;
        metroLandingScreenComponent.getClass();
        if (continuationImpl instanceof MetroLandingScreenComponent$processUniversalSearchResult$1) {
            metroLandingScreenComponent$processUniversalSearchResult$1 = (MetroLandingScreenComponent$processUniversalSearchResult$1) continuationImpl;
            int i = metroLandingScreenComponent$processUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$processUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$processUniversalSearchResult$1 = new MetroLandingScreenComponent$processUniversalSearchResult$1(metroLandingScreenComponent, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$processUniversalSearchResult$1 = new MetroLandingScreenComponent$processUniversalSearchResult$1(metroLandingScreenComponent, continuationImpl);
        }
        Object objB = metroLandingScreenComponent$processUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$processUniversalSearchResult$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            metroLandingScreenComponent.z = null;
            if (resultStateData instanceof ResultStateData.Cancelled) {
                return unit;
            }
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a).f9060a;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    metroLandingScreenComponent.R0(new MetroLandingScreenViewIntent.OnUniversalSearchResultReceived((StopAppModel) json.b(str, StopAppModel.INSTANCE.serializer())));
                } catch (Exception unused) {
                    metroLandingScreenComponent$processUniversalSearchResult$1.L$0 = metroLandingScreenComponent;
                    metroLandingScreenComponent$processUniversalSearchResult$1.label = 1;
                    objB = metroLandingScreenComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$processUniversalSearchResult$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Q0(metroLandingScreenComponent, (String) objB);
                }
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        metroLandingScreenComponent = (MetroLandingScreenComponent) metroLandingScreenComponent$processUniversalSearchResult$1.L$0;
        ResultKt.b(objB);
        Q0(metroLandingScreenComponent, (String) objB);
        return unit;
    }

    public static void Q0(MetroLandingScreenComponent metroLandingScreenComponent, String str) {
        KotlinToastManagerKt.a(metroLandingScreenComponent.w, str, ToastLength.LONG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(List list, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1 metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1;
        String str;
        StopAppModel stopAppModel;
        String str2;
        MetroLineListItemState metroLineListItemState;
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel;
        Object next;
        MetroLandingScreenComponent metroLandingScreenComponent;
        if (continuationImpl instanceof MetroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1) {
            metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1 = (MetroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1) continuationImpl;
            int i = metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1 = new MetroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1 = new MetroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1(this, continuationImpl);
        }
        Object objB = metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            StateFlow stateFlow = this.f;
            StopAppModel stopAppModel2 = ((MetroLandingScreenDataState) stateFlow.getValue()).k;
            if (stopAppModel2 != null && (str = stopAppModel2.f1727a) != null && (stopAppModel = ((MetroLandingScreenDataState) stateFlow.getValue()).l) != null && (str2 = stopAppModel.f1727a) != null && (metroLineListItemState = ((MetroLandingScreenDataState) stateFlow.getValue()).j) != null && (ondcMetroRouteSearchAppModel = metroLineListItemState.f5509a) != null && ondcMetroRouteSearchAppModel.f6766a != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) next;
                    if (Intrinsics.d(originDestinationAppModel.c.f1727a, str) && Intrinsics.d(originDestinationAppModel.d.f1727a, str2)) {
                        break;
                    }
                }
                OriginDestinationAppModel originDestinationAppModel2 = (OriginDestinationAppModel) next;
                if (originDestinationAppModel2 != null) {
                    metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.label = 1;
                    if (P0(originDestinationAppModel2, metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1) == coroutineSingletons) {
                    }
                } else {
                    metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.L$0 = this;
                    metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.label = 2;
                    objB = this.l.b(StringEnum.ROUTE_NOT_AVAILABLE, new Object[0], metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1);
                    if (objB != coroutineSingletons) {
                        metroLandingScreenComponent = this;
                    }
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        metroLandingScreenComponent = (MetroLandingScreenComponent) metroLandingScreenComponent$checkIfCurrentODPairAvailableInRouteListAndNavigateToFareDetails$1.L$0;
        ResultKt.b(objB);
        Q0(metroLandingScreenComponent, (String) objB);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$fetchOndcConfig$1 metroLandingScreenComponent$fetchOndcConfig$1;
        if (continuationImpl instanceof MetroLandingScreenComponent$fetchOndcConfig$1) {
            metroLandingScreenComponent$fetchOndcConfig$1 = (MetroLandingScreenComponent$fetchOndcConfig$1) continuationImpl;
            int i = metroLandingScreenComponent$fetchOndcConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$fetchOndcConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$fetchOndcConfig$1 = new MetroLandingScreenComponent$fetchOndcConfig$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$fetchOndcConfig$1 = new MetroLandingScreenComponent$fetchOndcConfig$1(this, continuationImpl);
        }
        Object objA = metroLandingScreenComponent$fetchOndcConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$fetchOndcConfig$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            metroLandingScreenComponent$fetchOndcConfig$1.label = 1;
            objA = this.s.a("ondcMetroTicket", metroLandingScreenComponent$fetchOndcConfig$1);
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
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            z = false;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 12));
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M0(String str, List list, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$getArgsForStopSearchNavigation$1 metroLandingScreenComponent$getArgsForStopSearchNavigation$1;
        String str2;
        String str3;
        if (continuationImpl instanceof MetroLandingScreenComponent$getArgsForStopSearchNavigation$1) {
            metroLandingScreenComponent$getArgsForStopSearchNavigation$1 = (MetroLandingScreenComponent$getArgsForStopSearchNavigation$1) continuationImpl;
            int i = metroLandingScreenComponent$getArgsForStopSearchNavigation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$getArgsForStopSearchNavigation$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$getArgsForStopSearchNavigation$1 = new MetroLandingScreenComponent$getArgsForStopSearchNavigation$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$getArgsForStopSearchNavigation$1 = new MetroLandingScreenComponent$getArgsForStopSearchNavigation$1(this, continuationImpl);
        }
        Object obj = metroLandingScreenComponent$getArgsForStopSearchNavigation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$getArgsForStopSearchNavigation$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Boolean bool = ((MetroLandingScreenDataState) this.f.getValue()).d;
            if (bool == null) {
                return null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
                Json json = ChaloJson.b;
                List<StopAppModel> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (StopAppModel stopAppModel : list2) {
                    arrayList.add(new ProductBookingStopDetails(stopAppModel.f1727a, stopAppModel.b, stopAppModel.e));
                }
                json.getClass();
                return new PickStopArgs((Source) null, str, chaloTransitMode, json.a(new ArrayListSerializer(ProductBookingStopDetails.INSTANCE.serializer()), arrayList), 1);
            }
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            Json json2 = ChaloJson.b;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.STOPS(true, false)));
            json2.getClass();
            String strA = json2.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            metroLandingScreenComponent$getArgsForStopSearchNavigation$1.L$0 = str;
            metroLandingScreenComponent$getArgsForStopSearchNavigation$1.L$1 = strA;
            metroLandingScreenComponent$getArgsForStopSearchNavigation$1.label = 1;
            Object objB = this.l.b(StringEnum.SELECT_METRO_STATION, new Object[0], metroLandingScreenComponent$getArgsForStopSearchNavigation$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = strA;
            obj = objB;
            str3 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) metroLandingScreenComponent$getArgsForStopSearchNavigation$1.L$1;
            String str5 = (String) metroLandingScreenComponent$getArgsForStopSearchNavigation$1.L$0;
            ResultKt.b(obj);
            str3 = str5;
            str2 = str4;
        }
        return new UniversalPickerArgs(str2, (String) obj, UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.getSourceName(), Source.STOP_BASED_METRO_LANDING_SCREEN, (String) null, "ACTIVITY_RESULT", str3, ChaloTransitMode.METRO, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1808);
    }

    public final void N0() {
        MetroLandingScreenDataState metroLandingScreenDataState = (MetroLandingScreenDataState) this.f.getValue();
        if (metroLandingScreenDataState.d == null) {
            return;
        }
        Job job = this.B;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.B = BuildersKt.d(this.j, null, null, new MetroLandingScreenComponent$handleOnSearchButtonClicked$1(metroLandingScreenDataState, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O0(FetchRoutesResult.Success success, ContinuationImpl continuationImpl) throws Exception {
        MetroLandingScreenComponent$handleRoutesFetchedSuccessFully$1 metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1;
        MetroLandingScreenComponent metroLandingScreenComponent;
        if (continuationImpl instanceof MetroLandingScreenComponent$handleRoutesFetchedSuccessFully$1) {
            metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1 = (MetroLandingScreenComponent$handleRoutesFetchedSuccessFully$1) continuationImpl;
            int i = metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1 = new MetroLandingScreenComponent$handleRoutesFetchedSuccessFully$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1 = new MetroLandingScreenComponent$handleRoutesFetchedSuccessFully$1(this, continuationImpl);
        }
        Object objB = metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label;
        Unit unit = Unit.f17538a;
        try {
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    ResultKt.b(objB);
                    return unit;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                metroLandingScreenComponent = (MetroLandingScreenComponent) metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.L$0;
                ResultKt.b(objB);
                Q0(metroLandingScreenComponent, (String) objB);
                return unit;
            }
            ResultKt.b(objB);
            Boolean bool = ((MetroLandingScreenDataState) this.f.getValue()).d;
            if (bool != null) {
                if (!(success instanceof FetchRoutesResult.Success.Ondc)) {
                    if (success instanceof FetchRoutesResult.Success.Regular) {
                        return unit;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                this.A = ((FetchRoutesResult.Success.Ondc) success).f9185a.b;
                boolean zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    List list = ((FetchRoutesResult.Success.Ondc) success).f9185a.f6770a;
                    metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label = 1;
                    if (K0(list, metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (zBooleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) CollectionsKt.F(((FetchRoutesResult.Success.Ondc) success).f9185a.f6770a);
                    metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label = 2;
                    if (P0(originDestinationAppModel, metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.L$0 = this;
            metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1.label = 3;
            objB = this.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$handleRoutesFetchedSuccessFully$1);
            if (objB != coroutineSingletons) {
                metroLandingScreenComponent = this;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179 A[LOOP:0: B:72:0x0173->B:74:0x0179, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final Object P0(OriginDestinationAppModel originDestinationAppModel, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1 metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1;
        OriginDestinationAppModel originDestinationAppModel2;
        Object objL0;
        String str;
        final String str2;
        final String str3;
        final RouteProviderConfigAppModel routeProviderConfigAppModel;
        MetroLandingScreenComponent metroLandingScreenComponent;
        String str4;
        ArrayList arrayList;
        Iterator it;
        MetroLineListItemState metroLineListItemState;
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel;
        MetroLandingScreenComponent metroLandingScreenComponent2;
        MetroLandingScreenComponent metroLandingScreenComponent3;
        MetroLandingScreenComponent metroLandingScreenComponent4;
        if (continuationImpl instanceof MetroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1) {
            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1 = (MetroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1) continuationImpl;
            int i = metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1 = new MetroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1 = new MetroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1(this, continuationImpl);
        }
        Object objB = metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label;
        Unit unit = Unit.f17538a;
        StringProvider stringProvider = this.l;
        StateFlow stateFlow = this.f;
        if (i2 == 0) {
            ResultKt.b(objB);
            String str5 = ((MetroLandingScreenDataState) stateFlow.getValue()).b;
            if (str5 == null || str5.length() == 0 || (str = ((MetroLandingScreenDataState) stateFlow.getValue()).c) == null || str.length() == 0) {
                E0(new xg0(24));
                originDestinationAppModel2 = originDestinationAppModel;
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = originDestinationAppModel2;
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 1;
                objL0 = L0(metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                if (objL0 != coroutineSingletons) {
                }
            } else {
                originDestinationAppModel2 = originDestinationAppModel;
                str2 = ((MetroLandingScreenDataState) stateFlow.getValue()).b;
                if (str2 == null) {
                    metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                    metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 3;
                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                    if (objB != coroutineSingletons) {
                        metroLandingScreenComponent3 = this;
                        Q0(metroLandingScreenComponent3, (String) objB);
                        return unit;
                    }
                } else {
                    str3 = ((MetroLandingScreenDataState) stateFlow.getValue()).c;
                    if (str3 == null) {
                        routeProviderConfigAppModel = originDestinationAppModel2.k;
                        if (routeProviderConfigAppModel != null) {
                            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 5;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                            if (objB == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            metroLandingScreenComponent = this;
                            Q0(metroLandingScreenComponent, (String) objB);
                            return unit;
                        }
                        str4 = originDestinationAppModel2.b;
                        if (str4.length() == 0 && ((metroLineListItemState = ((MetroLandingScreenDataState) stateFlow.getValue()).j) == null || (ondcMetroRouteSearchAppModel = metroLineListItemState.f5509a) == null || (str4 = ondcMetroRouteSearchAppModel.b) == null)) {
                            str4 = "";
                        }
                        FareDetailsRouteData fareDetailsRouteData = new FareDetailsRouteData(str4, originDestinationAppModel2.f8190a, ChaloTransitMode.METRO);
                        StopAppModel stopAppModel = originDestinationAppModel2.d;
                        ProductBookingStopDetails productBookingStopDetails = new ProductBookingStopDetails(stopAppModel.f1727a, stopAppModel.b, stopAppModel.e);
                        StopAppModel stopAppModel2 = originDestinationAppModel2.c;
                        ProductBookingStopDetails productBookingStopDetails2 = new ProductBookingStopDetails(stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.e);
                        List list = originDestinationAppModel2.h;
                        arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ProductBookingSpecialFeature((String) it.next(), ProductBookingRouteSpecialFeatureTagType.NEW));
                        }
                        final FareDetailsData fareDetailsData = new FareDetailsData(fareDetailsRouteData, productBookingStopDetails2, productBookingStopDetails, arrayList, null, null, null, null, null, 4080);
                        final OriginDestinationAppModel originDestinationAppModel3 = originDestinationAppModel2;
                        q0(new Function0() { // from class: pi0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MetroLandingScreenComponent metroLandingScreenComponent5 = this.f19039a;
                                ChaloNavigationManager chaloNavigationManager = metroLandingScreenComponent5.u;
                                Json json = ChaloJson.b;
                                json.getClass();
                                String strA = json.a(FareDetailsData.INSTANCE.serializer(), fareDetailsData);
                                String strA2 = json.a(ProductBookingNavigation.INSTANCE.serializer(), ProductBookingNavigation.OndcMetroBooking.INSTANCE);
                                String str6 = routeProviderConfigAppModel.f8227a;
                                String str7 = metroLandingScreenComponent5.A;
                                String str8 = str7 == null ? "" : str7;
                                String str9 = originDestinationAppModel3.l;
                                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new FareDetailsArgs(strA, strA2, json.a(FareDetailsScreenType.INSTANCE.serializer(), new FareDetailsScreenType.ONDCTicket(str6, str2, str3, str8, str9 == null ? "" : str9)), null), null, null, 6));
                                return Unit.f17538a;
                            }
                        });
                        return unit;
                    }
                    metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                    metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 4;
                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                    if (objB != coroutineSingletons) {
                        metroLandingScreenComponent2 = this;
                        Q0(metroLandingScreenComponent2, (String) objB);
                        return unit;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                metroLandingScreenComponent4 = (MetroLandingScreenComponent) metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0;
                ResultKt.b(objB);
                Q0(metroLandingScreenComponent4, (String) objB);
                return unit;
            }
            if (i2 == 3) {
                metroLandingScreenComponent3 = (MetroLandingScreenComponent) metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0;
                ResultKt.b(objB);
                Q0(metroLandingScreenComponent3, (String) objB);
                return unit;
            }
            if (i2 == 4) {
                metroLandingScreenComponent2 = (MetroLandingScreenComponent) metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0;
                ResultKt.b(objB);
                Q0(metroLandingScreenComponent2, (String) objB);
                return unit;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metroLandingScreenComponent = (MetroLandingScreenComponent) metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0;
            ResultKt.b(objB);
            Q0(metroLandingScreenComponent, (String) objB);
            return unit;
        }
        OriginDestinationAppModel originDestinationAppModel4 = (OriginDestinationAppModel) metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0;
        ResultKt.b(objB);
        objL0 = objB;
        originDestinationAppModel2 = originDestinationAppModel4;
        boolean zBooleanValue = ((Boolean) objL0).booleanValue();
        E0(new xg0(25));
        if (zBooleanValue) {
            str2 = ((MetroLandingScreenDataState) stateFlow.getValue()).b;
            if (str2 == null) {
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 3;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                if (objB != coroutineSingletons) {
                    metroLandingScreenComponent3 = this;
                    Q0(metroLandingScreenComponent3, (String) objB);
                    return unit;
                }
            } else {
                str3 = ((MetroLandingScreenDataState) stateFlow.getValue()).c;
                if (str3 == null) {
                    routeProviderConfigAppModel = originDestinationAppModel2.k;
                    if (routeProviderConfigAppModel != null) {
                        metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                        metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 5;
                        objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        metroLandingScreenComponent = this;
                        Q0(metroLandingScreenComponent, (String) objB);
                        return unit;
                    }
                    str4 = originDestinationAppModel2.b;
                    if (str4.length() == 0) {
                        str4 = "";
                    }
                    FareDetailsRouteData fareDetailsRouteData2 = new FareDetailsRouteData(str4, originDestinationAppModel2.f8190a, ChaloTransitMode.METRO);
                    StopAppModel stopAppModel3 = originDestinationAppModel2.d;
                    ProductBookingStopDetails productBookingStopDetails3 = new ProductBookingStopDetails(stopAppModel3.f1727a, stopAppModel3.b, stopAppModel3.e);
                    StopAppModel stopAppModel4 = originDestinationAppModel2.c;
                    ProductBookingStopDetails productBookingStopDetails4 = new ProductBookingStopDetails(stopAppModel4.f1727a, stopAppModel4.b, stopAppModel4.e);
                    List list2 = originDestinationAppModel2.h;
                    arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ProductBookingSpecialFeature((String) it.next(), ProductBookingRouteSpecialFeatureTagType.NEW));
                    }
                    final FareDetailsData fareDetailsData2 = new FareDetailsData(fareDetailsRouteData2, productBookingStopDetails4, productBookingStopDetails3, arrayList, null, null, null, null, null, 4080);
                    final OriginDestinationAppModel originDestinationAppModel5 = originDestinationAppModel2;
                    q0(new Function0() { // from class: pi0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MetroLandingScreenComponent metroLandingScreenComponent5 = this.f19039a;
                            ChaloNavigationManager chaloNavigationManager = metroLandingScreenComponent5.u;
                            Json json = ChaloJson.b;
                            json.getClass();
                            String strA = json.a(FareDetailsData.INSTANCE.serializer(), fareDetailsData2);
                            String strA2 = json.a(ProductBookingNavigation.INSTANCE.serializer(), ProductBookingNavigation.OndcMetroBooking.INSTANCE);
                            String str6 = routeProviderConfigAppModel.f8227a;
                            String str7 = metroLandingScreenComponent5.A;
                            String str8 = str7 == null ? "" : str7;
                            String str9 = originDestinationAppModel5.l;
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new FareDetailsArgs(strA, strA2, json.a(FareDetailsScreenType.INSTANCE.serializer(), new FareDetailsScreenType.ONDCTicket(str6, str2, str3, str8, str9 == null ? "" : str9)), null), null, null, 6));
                            return Unit.f17538a;
                        }
                    });
                    return unit;
                }
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
                metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 4;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
                if (objB != coroutineSingletons) {
                    metroLandingScreenComponent2 = this;
                    Q0(metroLandingScreenComponent2, (String) objB);
                    return unit;
                }
            }
        } else {
            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.L$0 = this;
            metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1.label = 2;
            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], metroLandingScreenComponent$navigateToOndcFareDetailsIfPossible$1);
            if (objB != coroutineSingletons) {
                metroLandingScreenComponent4 = this;
                Q0(metroLandingScreenComponent4, (String) objB);
                return unit;
            }
        }
        return coroutineSingletons;
    }

    public final void R0(MetroLandingScreenViewIntent intent) {
        OriginDestinationAdditionalRouteInfoAppModel metro;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof MetroLandingScreenViewIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        Object obj = null;
        if (z) {
            MetroLandingScreenViewIntent.InitialisationIntent initialisationIntent = (MetroLandingScreenViewIntent.InitialisationIntent) intent;
            if (this.d) {
                return;
            }
            R0(new MetroLandingScreenViewIntent.RestoreScreenStateFromProcessDeathIntent(initialisationIntent.f5496a));
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$handleInitialisationIntent$1(this, initialisationIntent, null), 3);
            this.d = true;
            return;
        }
        if (intent instanceof MetroLandingScreenViewIntent.RestoreScreenStateFromProcessDeathIntent) {
            MetroLandingScreenRestoredState metroLandingScreenRestoredState = ((MetroLandingScreenViewIntent.RestoreScreenStateFromProcessDeathIntent) intent).f5508a;
            if (metroLandingScreenRestoredState == null || metroLandingScreenRestoredState.c == null) {
                return;
            }
            this.z = metroLandingScreenRestoredState.d;
            E0(new dd0(metroLandingScreenRestoredState, 26));
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnCloseButtonClicked.f5497a)) {
            E0(new xg0(21));
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnFromStationClick.f5498a)) {
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$handleOnFromStationClicked$1(this, null), 3);
            return;
        }
        boolean z2 = intent instanceof MetroLandingScreenViewIntent.OnLineSelectedClick;
        StateFlow stateFlow = this.f;
        if (z2) {
            int i = ((MetroLandingScreenViewIntent.OnLineSelectedClick) intent).f5499a;
            MetroLineListItemState metroLineListItemState = ((MetroLandingScreenDataState) stateFlow.getValue()).j;
            List list = ((MetroLandingScreenDataState) stateFlow.getValue()).g;
            if (list == null) {
                return;
            }
            MetroLineListItemState metroLineListItemState2 = (MetroLineListItemState) list.get(i);
            if (metroLineListItemState != null && Intrinsics.d(metroLineListItemState.f5509a.f6766a, metroLineListItemState2.f5509a.f6766a)) {
                E0(new xg0(23));
                return;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                MetroLineListItemState metroLineListItemState3 = (MetroLineListItemState) obj2;
                arrayList.add(i2 == i ? MetroLineListItemState.a(metroLineListItemState3, true) : MetroLineListItemState.a(metroLineListItemState3, false));
                i2 = i3;
            }
            E0(new t60(24, arrayList, metroLineListItemState2));
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnSearchButtonClick.f5502a)) {
            N0();
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnSelectLineClicked.f5503a)) {
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$handleOnSelectLineClicked$1(this, null), 3);
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnSwapButtonClick.f5505a)) {
            E0(new t60(22, this, ((MetroLandingScreenDataState) stateFlow.getValue()).k));
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.OnToStationClick.f5506a)) {
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$handleOnToStationClicked$1(this, null), 3);
            return;
        }
        if (intent instanceof MetroLandingScreenViewIntent.OnRecentStationPairClicked) {
            RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel = ((MetroLandingScreenViewIntent.OnRecentStationPairClicked) intent).f5500a;
            String str = recentStopAndRouteBasedAppModel.c;
            String str2 = recentStopAndRouteBasedAppModel.d;
            EmptyList emptyList = EmptyList.f17557a;
            RouteNamingSchemeType routeNamingSchemeType = RouteNamingSchemeType.DEFAULT;
            ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
            RecentAdditionalRouteInfoModel recentAdditionalRouteInfoModel = recentStopAndRouteBasedAppModel.e;
            Intrinsics.i(recentAdditionalRouteInfoModel, "<this>");
            if (recentAdditionalRouteInfoModel instanceof RecentAdditionalRouteInfoModel.Metro) {
                metro = new OriginDestinationAdditionalRouteInfoAppModel.Metro(((RecentAdditionalRouteInfoModel.Metro) recentAdditionalRouteInfoModel).f8996a);
            } else {
                if (!(recentAdditionalRouteInfoModel instanceof RecentAdditionalRouteInfoModel.Bus)) {
                    throw new NoWhenBranchMatchedException();
                }
                metro = OriginDestinationAdditionalRouteInfoAppModel.Bus.b;
            }
            E0(new t60(23, new MetroLineListItemState(new OndcMetroRouteSearchAppModel(str, str2, null, null, emptyList, null, routeNamingSchemeType, chaloTransitMode, metro), true), recentStopAndRouteBasedAppModel));
            return;
        }
        if (intent instanceof MetroLandingScreenViewIntent.OnRecentStopBasedPairClicked) {
            E0(new oi0(((MetroLandingScreenViewIntent.OnRecentStopBasedPairClicked) intent).f5501a, 0));
            return;
        }
        if (intent.equals(MetroLandingScreenViewIntent.BottomSheetDismissIntent.f5495a)) {
            E0(new xg0(20));
            return;
        }
        if (!(intent instanceof MetroLandingScreenViewIntent.OnStationPickedIntent)) {
            if (!(intent instanceof MetroLandingScreenViewIntent.OnUniversalSearchResultReceived)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1(this, ((MetroLandingScreenViewIntent.OnUniversalSearchResultReceived) intent).f5507a, null), 3);
            return;
        }
        ProductBookingStopDetails productBookingStopDetails = ((MetroLandingScreenViewIntent.OnStationPickedIntent) intent).f5504a;
        for (Object obj3 : ((MetroLandingScreenDataState) stateFlow.getValue()).b()) {
            if (Intrinsics.d(((StopAppModel) obj3).f1727a, productBookingStopDetails.f8199a)) {
                obj = obj3;
                break;
            }
        }
        StopAppModel stopAppModel = (StopAppModel) obj;
        int i4 = WhenMappings.f5484a[((MetroLandingScreenDataState) stateFlow.getValue()).e.ordinal()];
        if (i4 == 1) {
            E0(new li0(0, stopAppModel));
        } else if (i4 == 2) {
            E0(new li0(1, stopAppModel));
        } else if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MetroLandingScreenComponent$convertToUiState$2 metroLandingScreenComponent$convertToUiState$2 = new MetroLandingScreenComponent$convertToUiState$2(1, this, MetroLandingScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;)V", 0);
        return this.v.e((MetroLandingScreenDataState) obj, metroLandingScreenComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        PickStopRequestType pickStopRequestType = PickStopRequestType.NONE;
        Map mapD = MapsKt.d();
        EmptyList emptyList = EmptyList.f17557a;
        return new MetroLandingScreenDataState(false, null, null, null, pickStopRequestType, mapD, null, emptyList, emptyList, null, null, null, MetroLandingScreenBottomSheetType.None);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        MetroLandingScreenHelper metroLandingScreenHelper = this.C;
        if (metroLandingScreenHelper != null) {
            metroLandingScreenHelper.a();
        }
    }
}

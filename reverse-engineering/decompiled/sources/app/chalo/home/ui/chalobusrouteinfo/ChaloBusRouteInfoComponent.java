package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.home.data.model.app.response.CorridorAppModel;
import app.chalo.home.data.model.app.response.CorridorRouteInfoAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.home.data.model.app.response.ScheduleBlockType;
import app.chalo.home.domain.FetchRouteSchedulesUseCase;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ah;
import defpackage.ch;
import defpackage.f;
import defpackage.k2;
import defpackage.qd;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoDataState;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewState;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusRouteInfoComponent extends ChaloBaseStateMviComponent<ChaloBusRouteInfoViewIntent, ChaloBusRouteInfoDataState, ChaloBusRouteInfoViewState, ChaloBusRouteInfoSideEffect> {
    public final FetchRouteSchedulesUseCase k;
    public final StringProvider l;
    public final ChaloNavigationManager m;
    public final UniversalSearchResultStateManager n;
    public final ChaloBusRouteInfoUiStateFactory o;
    public final AnalyticsContract p;
    public Object q;
    public Job r;
    public Job s;
    public Job t;
    public Job u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3310a;

        static {
            int[] iArr = new int[RouteSuggestionSearchSource.values().length];
            try {
                iArr[RouteSuggestionSearchSource.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteSuggestionSearchSource.DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3310a = iArr;
        }
    }

    public ChaloBusRouteInfoComponent(ComponentContext componentContext, ChaloBusRouteInfoScreenArgs chaloBusRouteInfoScreenArgs, FetchRouteSchedulesUseCase fetchRouteSchedulesUseCase, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, UniversalSearchResultStateManager universalSearchResultStateManager, ChaloBusRouteInfoUiStateFactory chaloBusRouteInfoUiStateFactory, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = fetchRouteSchedulesUseCase;
        this.l = stringProvider;
        this.m = chaloNavigationManager;
        this.n = universalSearchResultStateManager;
        this.o = chaloBusRouteInfoUiStateFactory;
        this.p = analyticsContract;
        this.q = EmptyList.f17557a;
        N0(new ChaloBusRouteInfoViewIntent.InitializationIntent(chaloBusRouteInfoScreenArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, FetchRouteSchedulesUseCase.FetchRouteSchedulesErrorType fetchRouteSchedulesErrorType, ContinuationImpl continuationImpl) {
        ChaloBusRouteInfoComponent$applyRouteSchedulesFailure$1 chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1;
        String str;
        chaloBusRouteInfoComponent.getClass();
        if (continuationImpl instanceof ChaloBusRouteInfoComponent$applyRouteSchedulesFailure$1) {
            chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1 = (ChaloBusRouteInfoComponent$applyRouteSchedulesFailure$1) continuationImpl;
            int i = chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1 = new ChaloBusRouteInfoComponent$applyRouteSchedulesFailure$1(chaloBusRouteInfoComponent, continuationImpl);
            }
        } else {
            chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1 = new ChaloBusRouteInfoComponent$applyRouteSchedulesFailure$1(chaloBusRouteInfoComponent, continuationImpl);
        }
        Object objB = chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            chaloBusRouteInfoComponent.q = EmptyList.f17557a;
            str = fetchRouteSchedulesErrorType.f2998a;
            if (str == null) {
                chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1.label = 1;
                objB = chaloBusRouteInfoComponent.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloBusRouteInfoComponent$applyRouteSchedulesFailure$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            AnalyticsContractImplKt.b(chaloBusRouteInfoComponent.p, "pb route info load failed", Source.CHALO_BUS_ROUTE_INFO_SCREEN, vo1.s("errorMsg", str), false, 24);
            chaloBusRouteInfoComponent.E0(new k2(str, 7));
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        str = (String) objB;
        AnalyticsContractImplKt.b(chaloBusRouteInfoComponent.p, "pb route info load failed", Source.CHALO_BUS_ROUTE_INFO_SCREEN, vo1.s("errorMsg", str), false, 24);
        chaloBusRouteInfoComponent.E0(new k2(str, 7));
        return Unit.f17538a;
    }

    public static ArrayList J0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((CorridorAppModel) obj).d.isEmpty()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            CorridorAppModel corridorAppModel = (CorridorAppModel) obj2;
            Triple triple = new Triple(corridorAppModel.f2959a, corridorAppModel.b, corridorAppModel.c);
            Object arrayList2 = linkedHashMap.get(triple);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(triple, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            CorridorAppModel corridorAppModel2 = (CorridorAppModel) CollectionsKt.F(list2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                CollectionsKt.i(((CorridorAppModel) it2.next()).d, arrayList4);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                if (hashSet.add(((CorridorRouteInfoAppModel) obj3).f)) {
                    arrayList5.add(obj3);
                }
            }
            String str = corridorAppModel2.f2959a;
            String start = corridorAppModel2.b;
            String end = corridorAppModel2.c;
            CorridorAppModel.Companion companion = CorridorAppModel.INSTANCE;
            Intrinsics.i(start, "start");
            Intrinsics.i(end, "end");
            arrayList3.add(new CorridorAppModel(str, start, end, arrayList5));
        }
        return arrayList3;
    }

    public static ArrayList L0(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CorridorAppModel corridorAppModel = (CorridorAppModel) obj;
            if (Intrinsics.d(str, "All") || Intrinsics.d(corridorAppModel.b, str) || Intrinsics.d(corridorAppModel.c, str)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void G0(ScheduleBlockKey scheduleBlockKey, String str) {
        Job job;
        if (scheduleBlockKey == null) {
            return;
        }
        Job job2 = this.r;
        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.r) != null) {
            ((JobSupport) job).cancel(null);
        }
        this.r = BuildersKt.d(this.j, null, null, new ChaloBusRouteInfoComponent$applyScheduleBlockSelection$1(this, scheduleBlockKey, str, null), 3);
    }

    public final void H0() {
        Job job = this.t;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.u;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        this.t = null;
        this.u = null;
        E0(new ah(10));
    }

    public final ArrayList I0(ScheduleBlockKey scheduleBlockKey) {
        Iterable iterable = (Iterable) this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            ScheduleBlockKey scheduleBlockKey2 = ((ScheduleBlockAppModel) obj).f2973a;
            if (scheduleBlockKey2.f2975a == scheduleBlockKey.f2975a && Intrinsics.d(scheduleBlockKey2.b, scheduleBlockKey.b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            CollectionsKt.i(((ScheduleBlockAppModel) obj2).b, arrayList2);
        }
        return J0(arrayList2);
    }

    public final void K0() {
        Job job = this.s;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.q = EmptyList.f17557a;
            this.s = BuildersKt.d(this.j, null, null, new ChaloBusRouteInfoComponent$fetchRouteSchedules$1(this, null), 3);
        }
    }

    public final void M0(RouteSuggestionSearchSource routeSuggestionSearchSource) {
        UniversalSearchFlowSource universalSearchFlowSource;
        String strA;
        Job job = this.t;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.u;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        String strA2 = KUUID.a();
        int i = WhenMappings.f3310a[routeSuggestionSearchSource.ordinal()];
        if (i == 1) {
            universalSearchFlowSource = UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            universalSearchFlowSource = UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION;
        }
        UniversalSearchFlowSource universalSearchFlowSource2 = universalSearchFlowSource;
        ChaloJson chaloJson = ChaloJson.f6455a;
        UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.PLACES(true, true)));
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA == null) {
            return;
        }
        this.t = BuildersKt.d(this.j, null, null, new ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1(this, strA2, routeSuggestionSearchSource, strA, universalSearchFlowSource2, null), 3);
    }

    public final void N0(ChaloBusRouteInfoViewIntent intent) {
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        RouteSuggestionReachByTime routeSuggestionReachByTime;
        Object next;
        RouteUiModel routeUiModel;
        Object next2;
        String strA;
        ScheduleBlockType scheduleBlockType;
        Object obj;
        int i;
        Object next3;
        Object next4;
        ScheduleBlockType scheduleBlockType2;
        char c;
        Object next5;
        ScheduleBlockType scheduleBlockType3;
        int i2;
        Object obj2;
        String str;
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof ChaloBusRouteInfoViewIntent.InitializationIntent) {
            AnalyticsContractImplKt.b(this.p, "pb route details seen", ((ChaloBusRouteInfoViewIntent.InitializationIntent) intent).f3340a, null, false, 28);
            K0();
            return;
        }
        boolean zEquals = intent.equals(ChaloBusRouteInfoViewIntent.RetryIntent.f3344a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            if (!((ChaloBusRouteInfoDataState) stateFlow.getValue()).b && (((ChaloBusRouteInfoDataState) stateFlow.getValue()).h instanceof ChaloBusRouteInfoErrorType.ApiError)) {
                K0();
                return;
            }
            return;
        }
        int i3 = 2;
        String str2 = "All";
        if (intent.equals(ChaloBusRouteInfoViewIntent.ResetFilterIntent.f3343a)) {
            List list = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).e;
            if (list.isEmpty()) {
                return;
            }
            List<Filters> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (Filters filters : list2) {
                arrayList.add(Filters.a(filters, Intrinsics.d(filters.f3366a, "All")));
            }
            E0(new qd(i3, arrayList));
            G0(((ChaloBusRouteInfoDataState) stateFlow.getValue()).d, "All");
            return;
        }
        char c2 = 1;
        if (intent instanceof ChaloBusRouteInfoViewIntent.TabSelectedIntent) {
            ChaloBusRouteInfoViewIntent.TabSelectedIntent tabSelectedIntent = (ChaloBusRouteInfoViewIntent.TabSelectedIntent) intent;
            ScheduleBlockKey scheduleBlockKey = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            ScheduleBlockKey scheduleBlockKey2 = tabSelectedIntent.f3355a;
            if (Intrinsics.d(scheduleBlockKey, scheduleBlockKey2)) {
                return;
            }
            Iterator it = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).e.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next6 = it.next();
                    i2 = 0;
                    if (((Filters) next6).b) {
                        obj2 = next6;
                        break;
                    }
                } else {
                    i2 = 0;
                    obj2 = null;
                    break;
                }
            }
            Filters filters2 = (Filters) obj2;
            if (filters2 != null && (str = filters2.f3366a) != null) {
                str2 = str;
            }
            G0(scheduleBlockKey2, str2);
            E0(new ch(tabSelectedIntent, 4));
            ArrayList arrayListI0 = I0(scheduleBlockKey2);
            Source source = Source.CHALO_BUS_ROUTE_INFO_SCREEN;
            Pair pair = new Pair("tab name", scheduleBlockKey2.b);
            Pair pair2 = new Pair("tab type", scheduleBlockKey2.f2975a.name());
            Pair pair3 = new Pair("result count", Integer.valueOf(arrayListI0.size()));
            int size = arrayListI0.size();
            int size2 = i2;
            int i4 = size2;
            while (i4 < size) {
                Object obj3 = arrayListI0.get(i4);
                i4++;
                size2 += ((CorridorAppModel) obj3).d.size();
            }
            Pair pair4 = new Pair("route count", Integer.valueOf(size2));
            Pair[] pairArr = new Pair[4];
            pairArr[i2] = pair;
            pairArr[1] = pair2;
            pairArr[2] = pair3;
            pairArr[3] = pair4;
            AnalyticsContractImplKt.b(this.p, "pb route info tab selected", source, MapsKt.i(pairArr), false, 24);
            return;
        }
        if (intent instanceof ChaloBusRouteInfoViewIntent.FilterSelectedIntent) {
            ChaloBusRouteInfoViewIntent.FilterSelectedIntent filterSelectedIntent = (ChaloBusRouteInfoViewIntent.FilterSelectedIntent) intent;
            List list3 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).e;
            if (list3.isEmpty()) {
                return;
            }
            List list4 = list3;
            Iterator it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c = c2;
                    next5 = null;
                    break;
                } else {
                    next5 = it2.next();
                    c = c2;
                    if (((Filters) next5).b) {
                        break;
                    } else {
                        c2 = c;
                    }
                }
            }
            Filters filters3 = (Filters) next5;
            String str3 = filters3 != null ? filters3.f3366a : null;
            String str4 = filterSelectedIntent.f3339a;
            if (Intrinsics.d(str3, str4)) {
                return;
            }
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.d(((Filters) it3.next()).f3366a, str4)) {
                        str2 = str4;
                        break;
                    }
                }
            }
            ScheduleBlockKey scheduleBlockKey3 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            int size3 = scheduleBlockKey3 != null ? L0(str2, I0(scheduleBlockKey3)).size() : 0;
            G0(scheduleBlockKey3, str2);
            Source source2 = Source.CHALO_BUS_ROUTE_INFO_SCREEN;
            Pair pair5 = new Pair("filter name", str2);
            ScheduleBlockKey scheduleBlockKey4 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            String str5 = scheduleBlockKey4 != null ? scheduleBlockKey4.b : null;
            if (str5 == null) {
                str5 = "";
            }
            Pair pair6 = new Pair("tab name", str5);
            ScheduleBlockKey scheduleBlockKey5 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            String strName = (scheduleBlockKey5 == null || (scheduleBlockType3 = scheduleBlockKey5.f2975a) == null) ? null : scheduleBlockType3.name();
            Pair pair7 = new Pair("tab type", strName != null ? strName : "");
            Pair pair8 = new Pair("result count", Integer.valueOf(size3));
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = pair5;
            pairArr2[c] = pair6;
            pairArr2[2] = pair7;
            pairArr2[3] = pair8;
            AnalyticsContractImplKt.b(this.p, "pb route info filter selected", source2, MapsKt.i(pairArr2), false, 24);
            return;
        }
        int i5 = 9;
        int i6 = 8;
        if (intent instanceof ChaloBusRouteInfoViewIntent.ExpandCorridorIntent) {
            String str6 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).g;
            String str7 = ((ChaloBusRouteInfoViewIntent.ExpandCorridorIntent) intent).f3338a;
            String str8 = Intrinsics.d(str6, str7) ? null : str7;
            E0(new k2(str8, i6));
            Iterator it4 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).f.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    i = i6;
                    next3 = null;
                    break;
                } else {
                    next3 = it4.next();
                    i = i6;
                    if (Intrinsics.d(((CorridorUiModel) next3).f3365a, str7)) {
                        break;
                    } else {
                        i6 = i;
                    }
                }
            }
            CorridorUiModel corridorUiModel = (CorridorUiModel) next3;
            boolean z = str8 != null;
            Source source3 = Source.CHALO_BUS_ROUTE_INFO_SCREEN;
            String str9 = corridorUiModel != null ? corridorUiModel.f3365a : null;
            if (str9 == null) {
                str9 = "";
            }
            Pair pair9 = new Pair("corridor id", str9);
            String str10 = corridorUiModel != null ? corridorUiModel.b : null;
            if (str10 == null) {
                str10 = "";
            }
            Pair pair10 = new Pair("corridor display name", str10);
            String str11 = corridorUiModel != null ? corridorUiModel.c : null;
            if (str11 == null) {
                str11 = "";
            }
            Pair pair11 = new Pair("corridor start", str11);
            String str12 = corridorUiModel != null ? corridorUiModel.d : null;
            if (str12 == null) {
                str12 = "";
            }
            Pair pair12 = new Pair("corridor end", str12);
            Pair pair13 = new Pair("route count", Integer.valueOf(corridorUiModel != null ? corridorUiModel.e.size() : 0));
            ScheduleBlockKey scheduleBlockKey6 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            String str13 = scheduleBlockKey6 != null ? scheduleBlockKey6.b : null;
            if (str13 == null) {
                str13 = "";
            }
            Pair pair14 = new Pair("tab name", str13);
            ScheduleBlockKey scheduleBlockKey7 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
            String strName2 = (scheduleBlockKey7 == null || (scheduleBlockType2 = scheduleBlockKey7.f2975a) == null) ? null : scheduleBlockType2.name();
            if (strName2 == null) {
                strName2 = "";
            }
            Pair pair15 = new Pair("tab type", strName2);
            Iterator it5 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).e.iterator();
            do {
                if (!it5.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it5.next();
            } while (!((Filters) next4).b);
            Filters filters4 = (Filters) next4;
            String str14 = filters4 != null ? filters4.f3366a : null;
            Pair pair16 = new Pair("filter name", str14 != null ? str14 : "");
            Pair pair17 = new Pair("is expanded", Boolean.valueOf(z));
            Pair[] pairArr3 = new Pair[9];
            pairArr3[0] = pair9;
            pairArr3[1] = pair10;
            pairArr3[2] = pair11;
            pairArr3[3] = pair12;
            pairArr3[4] = pair13;
            pairArr3[5] = pair14;
            pairArr3[6] = pair15;
            pairArr3[7] = pair16;
            pairArr3[i] = pair17;
            AnalyticsContractImplKt.b(this.p, "pb route info corridor expanded", source3, MapsKt.i(pairArr3), false, 24);
            return;
        }
        if (!(intent instanceof ChaloBusRouteInfoViewIntent.OnViewRouteClickIntent)) {
            if (intent.equals(ChaloBusRouteInfoViewIntent.OpenRouteSuggestionSheetIntent.f3342a)) {
                AnalyticsContractImplKt.b(this.p, "pb suggest new route clicked", Source.CHALO_BUS_ROUTE_INFO_SCREEN, null, false, 28);
                E0(new ah(i6));
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.DismissRouteSuggestionSheetIntent.f3337a)) {
                H0();
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionCancelIntent.f3345a)) {
                H0();
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionPickupClickIntent.f3348a)) {
                M0(RouteSuggestionSearchSource.PICKUP);
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionDropClickIntent.f3346a)) {
                M0(RouteSuggestionSearchSource.DROP);
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionReachByClickIntent.f3350a)) {
                O0(new ah(i5));
                return;
            }
            if (intent instanceof ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent) {
                O0(new ch((ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent) intent, 3));
                return;
            }
            if (intent instanceof ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent) {
                O0(new ch((ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent) intent, 2));
                return;
            }
            if (intent instanceof ChaloBusRouteInfoViewIntent.RouteSuggestionReachBySelectedIntent) {
                O0(new ch((ChaloBusRouteInfoViewIntent.RouteSuggestionReachBySelectedIntent) intent, 1));
                return;
            }
            if (intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionTimePickerDismissedIntent.f3354a)) {
                O0(new ah(12));
                return;
            }
            if (!intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionSubmitIntent.f3352a)) {
                if (!intent.equals(ChaloBusRouteInfoViewIntent.RouteSuggestionSuccessOkayIntent.f3353a)) {
                    throw new NoWhenBranchMatchedException();
                }
                H0();
                return;
            }
            RouteSuggestionSheetState routeSuggestionSheetState = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).i;
            if (!(routeSuggestionSheetState instanceof RouteSuggestionSheetState.Form)) {
                if (!Intrinsics.d(routeSuggestionSheetState, RouteSuggestionSheetState.Success.f3371a) && routeSuggestionSheetState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            RouteSuggestionSheetState.Form form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = form.f3370a;
            if (pBStopPlaceSelectedAppModel2 == null || (pBStopPlaceSelectedAppModel = form.b) == null || (routeSuggestionReachByTime = form.c) == null) {
                return;
            }
            Source source4 = Source.CHALO_BUS_ROUTE_INFO_SCREEN;
            Pair pair18 = new Pair("pick up area name", pBStopPlaceSelectedAppModel2.c);
            String str15 = pBStopPlaceSelectedAppModel.c;
            LatLng latLng = pBStopPlaceSelectedAppModel.e;
            Pair pair19 = new Pair("drop area name", str15);
            LatLng latLng2 = pBStopPlaceSelectedAppModel2.e;
            Pair pair20 = new Pair("pick up lat long", (latLng2 != null ? Double.valueOf(latLng2.f5134a) : null) + "," + (latLng2 != null ? Double.valueOf(latLng2.b) : null));
            Pair pair21 = new Pair("drop lat long", (latLng != null ? Double.valueOf(latLng.f5134a) : null) + "," + (latLng != null ? Double.valueOf(latLng.b) : null));
            TimeUtilsContract.Companion companion = TimeUtilsContract.f10451a;
            AnalyticsContractImplKt.b(this.p, "PB suggested new route", source4, MapsKt.i(pair18, pair19, pair20, pair21, new Pair("time to reach", companion.a().l(companion.a().k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c)))), false, 24);
            E0(new ah(13));
            return;
        }
        String str16 = ((ChaloBusRouteInfoViewIntent.OnViewRouteClickIntent) intent).f3341a;
        Iterator it6 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).f.iterator();
        loop7: while (true) {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
            ArrayList arrayList2 = ((CorridorUiModel) next).e;
            if (!arrayList2.isEmpty()) {
                int size4 = arrayList2.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList2.get(i7);
                    i7++;
                    Iterator it7 = it6;
                    if (Intrinsics.d(((RouteUiModel) obj4).f3374a, str16)) {
                        break loop7;
                    } else {
                        it6 = it7;
                    }
                }
            }
            it6 = it6;
        }
        CorridorUiModel corridorUiModel2 = (CorridorUiModel) next;
        if (corridorUiModel2 != null) {
            ArrayList arrayList3 = corridorUiModel2.e;
            int size5 = arrayList3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size5) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i8);
                i8++;
                ArrayList arrayList4 = arrayList3;
                if (Intrinsics.d(((RouteUiModel) obj).f3374a, str16)) {
                    break;
                } else {
                    arrayList3 = arrayList4;
                }
            }
            routeUiModel = (RouteUiModel) obj;
        } else {
            routeUiModel = null;
        }
        Source source5 = Source.CHALO_BUS_ROUTE_INFO_SCREEN;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("route id", str16);
        String str17 = routeUiModel != null ? routeUiModel.b : null;
        if (str17 == null) {
            str17 = "";
        }
        mapBuilder.put("route name", str17);
        String str18 = routeUiModel != null ? routeUiModel.c : null;
        if (str18 == null) {
            str18 = "";
        }
        mapBuilder.put("route display name", str18);
        String str19 = corridorUiModel2 != null ? corridorUiModel2.f3365a : null;
        if (str19 == null) {
            str19 = "";
        }
        mapBuilder.put("corridor id", str19);
        String str20 = corridorUiModel2 != null ? corridorUiModel2.b : null;
        if (str20 == null) {
            str20 = "";
        }
        mapBuilder.put("corridor display name", str20);
        String str21 = corridorUiModel2 != null ? corridorUiModel2.c : null;
        if (str21 == null) {
            str21 = "";
        }
        mapBuilder.put("corridor start", str21);
        String str22 = corridorUiModel2 != null ? corridorUiModel2.d : null;
        if (str22 == null) {
            str22 = "";
        }
        mapBuilder.put("corridor end", str22);
        ScheduleBlockKey scheduleBlockKey8 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
        String str23 = scheduleBlockKey8 != null ? scheduleBlockKey8.b : null;
        if (str23 == null) {
            str23 = "";
        }
        mapBuilder.put("tab name", str23);
        ScheduleBlockKey scheduleBlockKey9 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).d;
        String strName3 = (scheduleBlockKey9 == null || (scheduleBlockType = scheduleBlockKey9.f2975a) == null) ? null : scheduleBlockType.name();
        if (strName3 == null) {
            strName3 = "";
        }
        mapBuilder.put("tab type", strName3);
        Iterator it8 = ((ChaloBusRouteInfoDataState) stateFlow.getValue()).e.iterator();
        do {
            if (!it8.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it8.next();
        } while (!((Filters) next2).b);
        Filters filters5 = (Filters) next2;
        String str24 = filters5 != null ? filters5.f3366a : null;
        mapBuilder.put("filter name", str24 != null ? str24 : "");
        AnalyticsContractImplKt.b(this.p, "pb view route clicked", source5, mapBuilder.h(), false, 24);
        RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(str16, null, Source.CHALO_BUS_ROUTE_INFO_SCREEN.getSourceName(), 238);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA != null) {
            this.m.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, null, 6));
        }
    }

    public final void O0(Function1 function1) {
        RouteSuggestionSheetState routeSuggestionSheetState = ((ChaloBusRouteInfoDataState) this.f.getValue()).i;
        if (routeSuggestionSheetState instanceof RouteSuggestionSheetState.Form) {
            E0(new f(21, function1, routeSuggestionSheetState));
        } else if (!Intrinsics.d(routeSuggestionSheetState, RouteSuggestionSheetState.Success.f3371a) && routeSuggestionSheetState != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        ch chVar = new ch(this, 0);
        return this.o.d((ChaloBusRouteInfoDataState) obj, chVar, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new ChaloBusRouteInfoDataState("", false, emptyList, null, emptyList, emptyList, null, null, null);
    }
}

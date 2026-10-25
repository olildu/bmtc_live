package app.chalo.livetracking.universalsearch.ui;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.livetracking.universalsearch.UniversalSearchResult;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchItemType;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRouteAppModel;
import app.chalo.livetracking.universalsearch.data.model.ui.ConvertToUiModelKt;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1", f = "UniversalPickerComponent.kt", l = {1052, 1083}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UniversalPickerIntent.UniversalSearchRouteItemClick $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1(UniversalPickerComponent universalPickerComponent, UniversalPickerIntent.UniversalSearchRouteItemClick universalSearchRouteItemClick, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$intent = universalSearchRouteItemClick;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handleUniversalPickerRouteItemClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x026d  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136 A[EDGE_INSN: B:66:0x0136->B:67:0x0137 BREAK  A[LOOP:4: B:61:0x011d->B:132:?]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UniversalSearchResult universalSearchResult;
        String routeId;
        String cityName;
        Object objC;
        ChaloUseCaseResult chaloUseCaseResult;
        SearchedResultItemsAppModel searchedResultItemsAppModel;
        RecentRouteAppModel recentRouteAppModelA;
        List list;
        Unit unit;
        UniversalPickerComponent universalPickerComponent;
        Object next;
        boolean zD;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit2 = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            universalSearchResult = (UniversalSearchResult) this.this$0.o.a().getValue();
            routeId = this.$intent.f5079a;
            cityName = CityProviderKt.b(this.this$0.l);
            if (cityName == null) {
                cityName = "";
            }
            BasicInfoContract basicInfoContract = this.this$0.s;
            this.L$0 = universalSearchResult;
            this.L$1 = routeId;
            this.L$2 = cityName;
            this.label = 1;
            objC = basicInfoContract.c(this);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            cityName = (String) this.L$2;
            routeId = (String) this.L$1;
            universalSearchResult = (UniversalSearchResult) this.L$0;
            ResultKt.b(obj);
            objC = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            universalPickerComponent = (UniversalPickerComponent) this.L$1;
            recentRouteAppModelA = (RecentRouteAppModel) this.L$0;
            ResultKt.b(obj);
            unit = unit2;
        }
        RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(recentRouteAppModelA.e, null, Source.UNIVERSAL_SEARCH.getSourceName(), 238);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA != null) {
            return unit;
        }
        universalPickerComponent.z.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
        return unit;
        long jLongValue = ((Number) objC).longValue();
        universalSearchResult.getClass();
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityName, "cityName");
        List list2 = universalSearchResult.b;
        if (list2.isEmpty()) {
            chaloUseCaseResult = universalSearchResult.f4964a;
            if (chaloUseCaseResult == null) {
                searchedResultItemsAppModel = universalSearchResult.c;
                if (searchedResultItemsAppModel != null) {
                    recentRouteAppModelA = null;
                    break;
                }
                recentRouteAppModelA = null;
                break;
            }
            searchedResultItemsAppModel = universalSearchResult.c;
            if (searchedResultItemsAppModel != null) {
                recentRouteAppModelA = null;
                break;
            }
            recentRouteAppModelA = null;
            break;
        }
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) next;
            if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Route) {
                zD = Intrinsics.d(((UniversalSearchRecentSearchItem.Route) universalSearchRecentSearchItem).c.e, routeId);
            } else {
                if (!(universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Place) && !(universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Stop) && !(universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Trip)) {
                    throw new NoWhenBranchMatchedException();
                }
                zD = false;
            }
        } while (!zD);
        UniversalSearchRecentSearchItem universalSearchRecentSearchItem2 = (UniversalSearchRecentSearchItem) next;
        if (universalSearchRecentSearchItem2 == null || !(universalSearchRecentSearchItem2 instanceof UniversalSearchRecentSearchItem.Route)) {
            chaloUseCaseResult = universalSearchResult.f4964a;
            if (chaloUseCaseResult == null || (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                searchedResultItemsAppModel = universalSearchResult.c;
                if (searchedResultItemsAppModel != null && (list = searchedResultItemsAppModel.f4996a) != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            recentRouteAppModelA = null;
                            break;
                        }
                        UniversalSearchRouteAppModel universalSearchRouteAppModel = (UniversalSearchRouteAppModel) it2.next();
                        if (Intrinsics.d(universalSearchRouteAppModel.f4999a, routeId)) {
                            recentRouteAppModelA = ConvertToUiModelKt.a(universalSearchRouteAppModel, cityName, jLongValue);
                            break;
                        }
                    }
                } else {
                    recentRouteAppModelA = null;
                    break;
                }
            } else {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it3 = ((SearchedResultItemsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f4996a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        searchedResultItemsAppModel = universalSearchResult.c;
                        if (searchedResultItemsAppModel != null) {
                            recentRouteAppModelA = null;
                            break;
                        }
                        recentRouteAppModelA = null;
                        break;
                    }
                    UniversalSearchRouteAppModel universalSearchRouteAppModel2 = (UniversalSearchRouteAppModel) it3.next();
                    if (Intrinsics.d(universalSearchRouteAppModel2.f4999a, routeId)) {
                        recentRouteAppModelA = ConvertToUiModelKt.a(universalSearchRouteAppModel2, cityName, jLongValue);
                    }
                }
            }
        } else {
            recentRouteAppModelA = ((UniversalSearchRecentSearchItem.Route) universalSearchRecentSearchItem2).c;
        }
        if (recentRouteAppModelA == null) {
            return unit2;
        }
        UniversalPickerComponent universalPickerComponent2 = this.this$0;
        UniversalPickerIntent.UniversalSearchRouteItemClick universalSearchRouteItemClick = this.$intent;
        String str = recentRouteAppModelA.j;
        if (str == null) {
            str = "";
        }
        universalPickerComponent2.K0(str, recentRouteAppModelA.h, recentRouteAppModelA.g, recentRouteAppModelA.m, false);
        StateFlow stateFlow = universalPickerComponent2.f;
        UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper = universalPickerComponent2.q;
        long j = ((UniversalPickerViewState) stateFlow.getValue()).p.f5085a;
        String str2 = ((UniversalPickerViewState) stateFlow.getValue()).k;
        String str3 = recentRouteAppModelA.e;
        String str4 = recentRouteAppModelA.g;
        String str5 = ((UniversalPickerViewState) stateFlow.getValue()).p.c;
        UniversalSearchItemType universalSearchItemType = UniversalSearchItemType.ROUTE;
        int i2 = universalSearchRouteItemClick.b;
        List list3 = ((UniversalPickerViewState) stateFlow.getValue()).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            Unit unit3 = unit2;
            StateFlow stateFlow2 = stateFlow;
            if (obj2 instanceof UniversalSearchItem.RouteList) {
                arrayList.add(obj2);
            }
            stateFlow = stateFlow2;
            unit2 = unit3;
        }
        unit = unit2;
        StateFlow stateFlow3 = stateFlow;
        UniversalSearchItem.RouteList routeList = (UniversalSearchItem.RouteList) CollectionsKt.H(arrayList);
        int size = routeList != null ? routeList.f5002a.size() : 0;
        List list4 = ((UniversalPickerViewState) stateFlow3.getValue()).b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list4) {
            if (obj3 instanceof UniversalSearchItem.PlacesAndStopsItem) {
                arrayList2.add(obj3);
            }
        }
        UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem = (UniversalSearchItem.PlacesAndStopsItem) CollectionsKt.H(arrayList2);
        int size2 = placesAndStopsItem != null ? placesAndStopsItem.f5001a.size() : 0;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = ((UniversalPickerViewState) stateFlow3.getValue()).r;
        universalSearchAnalyticsEventHelper.h(j, str2, str3, "", str4, size, size2, i2, universalSearchItemType, str5, ((UniversalPickerViewState) stateFlow3.getValue()).p.d, null, universalSearchDescriptiveLocationAppModel != null ? universalSearchDescriptiveLocationAppModel.e : null, false);
        UniversalSearchHelper universalSearchHelper = universalPickerComponent2.n;
        this.L$0 = recentRouteAppModelA;
        this.L$1 = universalPickerComponent2;
        this.L$2 = null;
        this.label = 2;
        Object objF = universalSearchHelper.f4960a.getF8954a().f(recentRouteAppModelA, true, this);
        if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objF = unit;
        }
        if (objF != coroutineSingletons) {
            universalPickerComponent = universalPickerComponent2;
            RouteDetailsIntentModel routeDetailsIntentModel2 = new RouteDetailsIntentModel(recentRouteAppModelA.e, null, Source.UNIVERSAL_SEARCH.getSourceName(), 238);
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA = json2.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel2);
            if (strA != null) {
                return unit;
            }
            universalPickerComponent.z.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
            return unit;
        }
        return coroutineSingletons;
    }
}

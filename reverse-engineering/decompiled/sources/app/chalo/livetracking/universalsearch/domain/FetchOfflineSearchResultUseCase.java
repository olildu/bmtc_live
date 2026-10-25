package app.chalo.livetracking.universalsearch.domain;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.livetracking.universalsearch.data.model.app.PlaceAndStopInfoAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRouteAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchOfflineSearchResultUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchOfflineSearchResultUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataManagerKotlin f5017a;
    public final CityProvider b;

    public FetchOfflineSearchResultUseCase(CityDataManagerKotlin cityDataManagerKotlin, CityProvider cityProvider) {
        this.f5017a = cityDataManagerKotlin;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x0159  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b A[LOOP:7: B:52:0x0179->B:53:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d4 A[LOOP:9: B:62:0x01d2->B:63:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x021e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0232  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0288  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ce A[LOOP:3: B:86:0x02c8->B:88:0x02ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0254 A[SYNTHETIC] */
    public final Object a(String str, TransitModeSearchFilter transitModeSearchFilter, ContinuationImpl continuationImpl) {
        FetchOfflineSearchResultUseCase$invoke$1 fetchOfflineSearchResultUseCase$invoke$1;
        String str2;
        TransitModeSearchFilter transitModeSearchFilter2;
        Object objA;
        String str3;
        List list;
        ArrayList arrayList;
        EmptyList emptyListF;
        String str4;
        List list2;
        String str5;
        List list3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i;
        ArrayList arrayList4;
        Iterator it;
        ArrayList arrayList5;
        int size2;
        int i2;
        Object next;
        String lowerCase;
        String lowerCase2;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int size3;
        int i3;
        ArrayList arrayList8;
        int size4;
        int i4;
        ArrayList arrayList9;
        Object obj;
        String lowerCase3;
        String lowerCase4;
        Object obj2;
        String lowerCase5;
        String lowerCase6;
        if (continuationImpl instanceof FetchOfflineSearchResultUseCase$invoke$1) {
            fetchOfflineSearchResultUseCase$invoke$1 = (FetchOfflineSearchResultUseCase$invoke$1) continuationImpl;
            int i5 = fetchOfflineSearchResultUseCase$invoke$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fetchOfflineSearchResultUseCase$invoke$1.label = i5 - Integer.MIN_VALUE;
            } else {
                fetchOfflineSearchResultUseCase$invoke$1 = new FetchOfflineSearchResultUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchOfflineSearchResultUseCase$invoke$1 = new FetchOfflineSearchResultUseCase$invoke$1(this, continuationImpl);
        }
        Object obj3 = fetchOfflineSearchResultUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = fetchOfflineSearchResultUseCase$invoke$1.label;
        CityDataManagerKotlin cityDataManagerKotlin = this.f5017a;
        if (i6 == 0) {
            ResultKt.b(obj3);
            str2 = str;
            fetchOfflineSearchResultUseCase$invoke$1.L$0 = str2;
            transitModeSearchFilter2 = transitModeSearchFilter;
            fetchOfflineSearchResultUseCase$invoke$1.L$1 = transitModeSearchFilter2;
            fetchOfflineSearchResultUseCase$invoke$1.label = 1;
            objA = cityDataManagerKotlin.a(fetchOfflineSearchResultUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            transitModeSearchFilter2 = (TransitModeSearchFilter) fetchOfflineSearchResultUseCase$invoke$1.L$1;
            String str6 = (String) fetchOfflineSearchResultUseCase$invoke$1.L$0;
            ResultKt.b(obj3);
            objA = obj3;
            str2 = str6;
        } else {
            if (i6 == 2) {
                transitModeSearchFilter2 = (TransitModeSearchFilter) fetchOfflineSearchResultUseCase$invoke$1.L$1;
                str3 = (String) fetchOfflineSearchResultUseCase$invoke$1.L$0;
                ResultKt.b(obj3);
                String str7 = str3;
                list = (List) obj3;
                str2 = str7;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj4 : list) {
                    RouteAppModel routeAppModel = (RouteAppModel) obj4;
                    String str8 = routeAppModel.c;
                    Locale locale = Locale.ROOT;
                    lowerCase = str8.toLowerCase(locale);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                    lowerCase2 = str2.toLowerCase(locale);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    if (!StringsKt.a0(lowerCase, lowerCase2, false) && transitModeSearchFilter2.a(routeAppModel.d)) {
                        arrayList10.add(obj4);
                    }
                }
                List<RouteAppModel> listV0 = CollectionsKt.v0(new FetchOfflineSearchResultUseCase$invoke$$inlined$sortedBy$1(), arrayList10);
                arrayList = new ArrayList(CollectionsKt.v(listV0, 10));
                for (RouteAppModel routeAppModel2 : listV0) {
                    String str9 = routeAppModel2.b;
                    String str10 = routeAppModel2.c;
                    String string = routeAppModel2.d.toString();
                    List list4 = routeAppModel2.e;
                    String str11 = ((StopAppModel) CollectionsKt.F(list4)).b;
                    String str12 = ((StopAppModel) CollectionsKt.P(list4)).b;
                    str5 = routeAppModel2.j;
                    list3 = routeAppModel2.n;
                    arrayList2 = new ArrayList();
                    for (Object obj5 : list3) {
                        List list5 = list3;
                        CityDataManagerKotlin cityDataManagerKotlin2 = cityDataManagerKotlin;
                        String str13 = str5;
                        if (((RouteSpecialFeatureAppModel) obj5).b == RouteSpecialFeatureType.LEGACY) {
                            arrayList2.add(obj5);
                        }
                        list3 = list5;
                        str5 = str13;
                        cityDataManagerKotlin = cityDataManagerKotlin2;
                    }
                    List list6 = list3;
                    CityDataManagerKotlin cityDataManagerKotlin3 = cityDataManagerKotlin;
                    String str14 = str5;
                    arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        Object obj6 = arrayList2.get(i);
                        i++;
                        ArrayList arrayList11 = arrayList2;
                        RouteSpecialFeatureAppModel routeSpecialFeatureAppModel = (RouteSpecialFeatureAppModel) obj6;
                        RouteLegacySpecialFeature.Companion companion = RouteLegacySpecialFeature.INSTANCE;
                        String str15 = routeSpecialFeatureAppModel.f1715a;
                        companion.getClass();
                        arrayList3.add(RouteLegacySpecialFeature.Companion.a(str15));
                        arrayList2 = arrayList11;
                    }
                    arrayList4 = new ArrayList();
                    it = list6.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        ArrayList arrayList12 = arrayList3;
                        Iterator it2 = it;
                        if (((RouteSpecialFeatureAppModel) next).b == RouteSpecialFeatureType.NEW) {
                            arrayList4.add(next);
                        }
                        it = it2;
                        arrayList3 = arrayList12;
                    }
                    ArrayList arrayList13 = arrayList3;
                    arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
                    size2 = arrayList4.size();
                    i2 = 0;
                    while (i2 < size2) {
                        Object obj7 = arrayList4.get(i2);
                        i2++;
                        arrayList5.add(((RouteSpecialFeatureAppModel) obj7).f1715a);
                        arrayList4 = arrayList4;
                    }
                    arrayList.add(new UniversalSearchRouteAppModel(str9, str10, string, str11, str12, str14, arrayList13, arrayList5, false, UniversalSearchResultType.ROUTE, routeAppModel2.s, routeAppModel2.t));
                    cityDataManagerKotlin = cityDataManagerKotlin3;
                }
                fetchOfflineSearchResultUseCase$invoke$1.L$0 = str2;
                fetchOfflineSearchResultUseCase$invoke$1.L$1 = transitModeSearchFilter2;
                fetchOfflineSearchResultUseCase$invoke$1.L$2 = arrayList;
                fetchOfflineSearchResultUseCase$invoke$1.label = 3;
                emptyListF = cityDataManagerKotlin.f();
                if (emptyListF != coroutineSingletons) {
                    str4 = str2;
                    list2 = arrayList;
                    obj3 = emptyListF;
                }
                return coroutineSingletons;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) fetchOfflineSearchResultUseCase$invoke$1.L$2;
            transitModeSearchFilter2 = (TransitModeSearchFilter) fetchOfflineSearchResultUseCase$invoke$1.L$1;
            str4 = (String) fetchOfflineSearchResultUseCase$invoke$1.L$0;
            ResultKt.b(obj3);
        }
        arrayList6 = new ArrayList();
        for (Object obj8 : (Iterable) obj3) {
            if (transitModeSearchFilter2.a(((StopAppModel) obj8).d)) {
                arrayList6.add(obj8);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        arrayList7 = new ArrayList();
        size3 = arrayList6.size();
        i3 = 0;
        while (i3 < size3) {
            obj2 = arrayList6.get(i3);
            i3++;
            String str16 = ((StopAppModel) obj2).b;
            Locale locale2 = Locale.ROOT;
            lowerCase5 = str16.toLowerCase(locale2);
            Intrinsics.h(lowerCase5, "toLowerCase(...)");
            lowerCase6 = str4.toLowerCase(locale2);
            Intrinsics.h(lowerCase6, "toLowerCase(...)");
            if (StringsKt.a0(lowerCase5, lowerCase6, false)) {
                arrayList7.add(obj2);
            }
        }
        arrayList8 = new ArrayList();
        size4 = arrayList6.size();
        i4 = 0;
        while (i4 < size4) {
            obj = arrayList6.get(i4);
            i4++;
            String str17 = ((StopAppModel) obj).b;
            Locale locale3 = Locale.ROOT;
            lowerCase3 = str17.toLowerCase(locale3);
            Intrinsics.h(lowerCase3, "toLowerCase(...)");
            lowerCase4 = str4.toLowerCase(locale3);
            Intrinsics.h(lowerCase4, "toLowerCase(...)");
            if (StringsKt.m(lowerCase3, lowerCase4, false)) {
                arrayList8.add(obj);
            }
        }
        LinkedHashSet<StopAppModel> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(arrayList7);
        linkedHashSet.addAll(arrayList8);
        arrayList9 = new ArrayList(CollectionsKt.v(linkedHashSet, 10));
        for (StopAppModel stopAppModel : linkedHashSet) {
            Intrinsics.i(stopAppModel, "<this>");
            arrayList9.add(new PlaceAndStopInfoAppModel(UniversalSearchResultType.STOP, stopAppModel.c, stopAppModel.d, "", "", stopAppModel.f1727a, stopAppModel.b, stopAppModel.e, "searchPartnerChaloStop"));
        }
        arrayList14.addAll(CollectionsKt.x0(arrayList9, 50));
        return new SearchedResultItemsAppModel(list2, arrayList14);
        if (!((Boolean) objA).booleanValue()) {
            return new SearchedResultItemsAppModel();
        }
        if (this.b.g()) {
            list = EmptyList.f17557a;
            ArrayList arrayList15 = new ArrayList();
            while (r8.hasNext()) {
                RouteAppModel routeAppModel3 = (RouteAppModel) obj4;
                String str18 = routeAppModel3.c;
                Locale locale4 = Locale.ROOT;
                lowerCase = str18.toLowerCase(locale4);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                lowerCase2 = str2.toLowerCase(locale4);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                if (!StringsKt.a0(lowerCase, lowerCase2, false)) {
                }
            }
            List<RouteAppModel> listV1 = CollectionsKt.v0(new FetchOfflineSearchResultUseCase$invoke$$inlined$sortedBy$1(), arrayList15);
            arrayList = new ArrayList(CollectionsKt.v(listV1, 10));
            while (r8.hasNext()) {
                String str19 = routeAppModel2.b;
                String str110 = routeAppModel2.c;
                String string2 = routeAppModel2.d.toString();
                List list7 = routeAppModel2.e;
                String str111 = ((StopAppModel) CollectionsKt.F(list7)).b;
                String str112 = ((StopAppModel) CollectionsKt.P(list7)).b;
                str5 = routeAppModel2.j;
                list3 = routeAppModel2.n;
                arrayList2 = new ArrayList();
                while (r17.hasNext()) {
                    List list8 = list3;
                    CityDataManagerKotlin cityDataManagerKotlin4 = cityDataManagerKotlin;
                    String str113 = str5;
                    if (((RouteSpecialFeatureAppModel) obj5).b == RouteSpecialFeatureType.LEGACY) {
                        arrayList2.add(obj5);
                    }
                    list3 = list8;
                    str5 = str113;
                    cityDataManagerKotlin = cityDataManagerKotlin4;
                }
                List list9 = list3;
                CityDataManagerKotlin cityDataManagerKotlin5 = cityDataManagerKotlin;
                String str114 = str5;
                arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    Object obj9 = arrayList2.get(i);
                    i++;
                    ArrayList arrayList16 = arrayList2;
                    RouteSpecialFeatureAppModel routeSpecialFeatureAppModel2 = (RouteSpecialFeatureAppModel) obj9;
                    RouteLegacySpecialFeature.Companion companion2 = RouteLegacySpecialFeature.INSTANCE;
                    String str115 = routeSpecialFeatureAppModel2.f1715a;
                    companion2.getClass();
                    arrayList3.add(RouteLegacySpecialFeature.Companion.a(str115));
                    arrayList2 = arrayList16;
                }
                arrayList4 = new ArrayList();
                it = list9.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    ArrayList arrayList17 = arrayList3;
                    Iterator it3 = it;
                    if (((RouteSpecialFeatureAppModel) next).b == RouteSpecialFeatureType.NEW) {
                        arrayList4.add(next);
                    }
                    it = it3;
                    arrayList3 = arrayList17;
                }
                ArrayList arrayList18 = arrayList3;
                arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
                size2 = arrayList4.size();
                i2 = 0;
                while (i2 < size2) {
                    Object obj10 = arrayList4.get(i2);
                    i2++;
                    arrayList5.add(((RouteSpecialFeatureAppModel) obj10).f1715a);
                    arrayList4 = arrayList4;
                }
                arrayList.add(new UniversalSearchRouteAppModel(str19, str110, string2, str111, str112, str114, arrayList18, arrayList5, false, UniversalSearchResultType.ROUTE, routeAppModel2.s, routeAppModel2.t));
                cityDataManagerKotlin = cityDataManagerKotlin5;
            }
            fetchOfflineSearchResultUseCase$invoke$1.L$0 = str2;
            fetchOfflineSearchResultUseCase$invoke$1.L$1 = transitModeSearchFilter2;
            fetchOfflineSearchResultUseCase$invoke$1.L$2 = arrayList;
            fetchOfflineSearchResultUseCase$invoke$1.label = 3;
            emptyListF = cityDataManagerKotlin.f();
            if (emptyListF != coroutineSingletons) {
                str4 = str2;
                list2 = arrayList;
                obj3 = emptyListF;
                arrayList6 = new ArrayList();
                while (r1.hasNext()) {
                    if (transitModeSearchFilter2.a(((StopAppModel) obj8).d)) {
                        arrayList6.add(obj8);
                    }
                }
                ArrayList arrayList19 = new ArrayList();
                arrayList7 = new ArrayList();
                size3 = arrayList6.size();
                i3 = 0;
                while (i3 < size3) {
                    obj2 = arrayList6.get(i3);
                    i3++;
                    String str116 = ((StopAppModel) obj2).b;
                    Locale locale5 = Locale.ROOT;
                    lowerCase5 = str116.toLowerCase(locale5);
                    Intrinsics.h(lowerCase5, "toLowerCase(...)");
                    lowerCase6 = str4.toLowerCase(locale5);
                    Intrinsics.h(lowerCase6, "toLowerCase(...)");
                    if (StringsKt.a0(lowerCase5, lowerCase6, false)) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                size4 = arrayList6.size();
                i4 = 0;
                while (i4 < size4) {
                    obj = arrayList6.get(i4);
                    i4++;
                    String str117 = ((StopAppModel) obj).b;
                    Locale locale6 = Locale.ROOT;
                    lowerCase3 = str117.toLowerCase(locale6);
                    Intrinsics.h(lowerCase3, "toLowerCase(...)");
                    lowerCase4 = str4.toLowerCase(locale6);
                    Intrinsics.h(lowerCase4, "toLowerCase(...)");
                    if (StringsKt.m(lowerCase3, lowerCase4, false)) {
                        arrayList8.add(obj);
                    }
                }
                LinkedHashSet<StopAppModel> linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.addAll(arrayList7);
                linkedHashSet2.addAll(arrayList8);
                arrayList9 = new ArrayList(CollectionsKt.v(linkedHashSet2, 10));
                while (r0.hasNext()) {
                    Intrinsics.i(stopAppModel, "<this>");
                    arrayList9.add(new PlaceAndStopInfoAppModel(UniversalSearchResultType.STOP, stopAppModel.c, stopAppModel.d, "", "", stopAppModel.f1727a, stopAppModel.b, stopAppModel.e, "searchPartnerChaloStop"));
                }
                arrayList19.addAll(CollectionsKt.x0(arrayList9, 50));
                return new SearchedResultItemsAppModel(list2, arrayList19);
            }
        } else {
            fetchOfflineSearchResultUseCase$invoke$1.L$0 = str2;
            fetchOfflineSearchResultUseCase$invoke$1.L$1 = transitModeSearchFilter2;
            fetchOfflineSearchResultUseCase$invoke$1.label = 2;
            Object objB = cityDataManagerKotlin.b(fetchOfflineSearchResultUseCase$invoke$1);
            if (objB != coroutineSingletons) {
                str3 = str2;
                obj3 = objB;
                String str20 = str3;
                list = (List) obj3;
                str2 = str20;
                ArrayList arrayList110 = new ArrayList();
                while (r8.hasNext()) {
                    RouteAppModel routeAppModel4 = (RouteAppModel) obj4;
                    String str118 = routeAppModel4.c;
                    Locale locale7 = Locale.ROOT;
                    lowerCase = str118.toLowerCase(locale7);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                    lowerCase2 = str2.toLowerCase(locale7);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    if (!StringsKt.a0(lowerCase, lowerCase2, false)) {
                    }
                }
                List<RouteAppModel> listV2 = CollectionsKt.v0(new FetchOfflineSearchResultUseCase$invoke$$inlined$sortedBy$1(), arrayList110);
                arrayList = new ArrayList(CollectionsKt.v(listV2, 10));
                while (r8.hasNext()) {
                    String str119 = routeAppModel2.b;
                    String str1110 = routeAppModel2.c;
                    String string3 = routeAppModel2.d.toString();
                    List list10 = routeAppModel2.e;
                    String str1111 = ((StopAppModel) CollectionsKt.F(list10)).b;
                    String str1112 = ((StopAppModel) CollectionsKt.P(list10)).b;
                    str5 = routeAppModel2.j;
                    list3 = routeAppModel2.n;
                    arrayList2 = new ArrayList();
                    while (r17.hasNext()) {
                        List list11 = list3;
                        CityDataManagerKotlin cityDataManagerKotlin6 = cityDataManagerKotlin;
                        String str1113 = str5;
                        if (((RouteSpecialFeatureAppModel) obj5).b == RouteSpecialFeatureType.LEGACY) {
                            arrayList2.add(obj5);
                        }
                        list3 = list11;
                        str5 = str1113;
                        cityDataManagerKotlin = cityDataManagerKotlin6;
                    }
                    List list12 = list3;
                    CityDataManagerKotlin cityDataManagerKotlin7 = cityDataManagerKotlin;
                    String str1114 = str5;
                    arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        Object obj11 = arrayList2.get(i);
                        i++;
                        ArrayList arrayList111 = arrayList2;
                        RouteSpecialFeatureAppModel routeSpecialFeatureAppModel3 = (RouteSpecialFeatureAppModel) obj11;
                        RouteLegacySpecialFeature.Companion companion3 = RouteLegacySpecialFeature.INSTANCE;
                        String str1115 = routeSpecialFeatureAppModel3.f1715a;
                        companion3.getClass();
                        arrayList3.add(RouteLegacySpecialFeature.Companion.a(str1115));
                        arrayList2 = arrayList111;
                    }
                    arrayList4 = new ArrayList();
                    it = list12.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        ArrayList arrayList112 = arrayList3;
                        Iterator it4 = it;
                        if (((RouteSpecialFeatureAppModel) next).b == RouteSpecialFeatureType.NEW) {
                            arrayList4.add(next);
                        }
                        it = it4;
                        arrayList3 = arrayList112;
                    }
                    ArrayList arrayList113 = arrayList3;
                    arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
                    size2 = arrayList4.size();
                    i2 = 0;
                    while (i2 < size2) {
                        Object obj12 = arrayList4.get(i2);
                        i2++;
                        arrayList5.add(((RouteSpecialFeatureAppModel) obj12).f1715a);
                        arrayList4 = arrayList4;
                    }
                    arrayList.add(new UniversalSearchRouteAppModel(str119, str1110, string3, str1111, str1112, str1114, arrayList113, arrayList5, false, UniversalSearchResultType.ROUTE, routeAppModel2.s, routeAppModel2.t));
                    cityDataManagerKotlin = cityDataManagerKotlin7;
                }
                fetchOfflineSearchResultUseCase$invoke$1.L$0 = str2;
                fetchOfflineSearchResultUseCase$invoke$1.L$1 = transitModeSearchFilter2;
                fetchOfflineSearchResultUseCase$invoke$1.L$2 = arrayList;
                fetchOfflineSearchResultUseCase$invoke$1.label = 3;
                emptyListF = cityDataManagerKotlin.f();
                if (emptyListF != coroutineSingletons) {
                    str4 = str2;
                    list2 = arrayList;
                    obj3 = emptyListF;
                    arrayList6 = new ArrayList();
                    while (r1.hasNext()) {
                        if (transitModeSearchFilter2.a(((StopAppModel) obj8).d)) {
                            arrayList6.add(obj8);
                        }
                    }
                    ArrayList arrayList114 = new ArrayList();
                    arrayList7 = new ArrayList();
                    size3 = arrayList6.size();
                    i3 = 0;
                    while (i3 < size3) {
                        obj2 = arrayList6.get(i3);
                        i3++;
                        String str1116 = ((StopAppModel) obj2).b;
                        Locale locale8 = Locale.ROOT;
                        lowerCase5 = str1116.toLowerCase(locale8);
                        Intrinsics.h(lowerCase5, "toLowerCase(...)");
                        lowerCase6 = str4.toLowerCase(locale8);
                        Intrinsics.h(lowerCase6, "toLowerCase(...)");
                        if (StringsKt.a0(lowerCase5, lowerCase6, false)) {
                            arrayList7.add(obj2);
                        }
                    }
                    arrayList8 = new ArrayList();
                    size4 = arrayList6.size();
                    i4 = 0;
                    while (i4 < size4) {
                        obj = arrayList6.get(i4);
                        i4++;
                        String str1117 = ((StopAppModel) obj).b;
                        Locale locale9 = Locale.ROOT;
                        lowerCase3 = str1117.toLowerCase(locale9);
                        Intrinsics.h(lowerCase3, "toLowerCase(...)");
                        lowerCase4 = str4.toLowerCase(locale9);
                        Intrinsics.h(lowerCase4, "toLowerCase(...)");
                        if (StringsKt.m(lowerCase3, lowerCase4, false)) {
                            arrayList8.add(obj);
                        }
                    }
                    LinkedHashSet<StopAppModel> linkedHashSet3 = new LinkedHashSet();
                    linkedHashSet3.addAll(arrayList7);
                    linkedHashSet3.addAll(arrayList8);
                    arrayList9 = new ArrayList(CollectionsKt.v(linkedHashSet3, 10));
                    while (r0.hasNext()) {
                        Intrinsics.i(stopAppModel, "<this>");
                        arrayList9.add(new PlaceAndStopInfoAppModel(UniversalSearchResultType.STOP, stopAppModel.c, stopAppModel.d, "", "", stopAppModel.f1727a, stopAppModel.b, stopAppModel.e, "searchPartnerChaloStop"));
                    }
                    arrayList114.addAll(CollectionsKt.x0(arrayList9, 50));
                    return new SearchedResultItemsAppModel(list2, arrayList114);
                }
            }
        }
        return coroutineSingletons;
    }
}

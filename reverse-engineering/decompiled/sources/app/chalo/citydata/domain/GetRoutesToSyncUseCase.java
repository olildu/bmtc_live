package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.CityDataConfigForCity;
import app.chalo.citydata.data.model.app.RouteIdWithVersion;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citydata.repository.SavedRoutesSortType;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSource;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/GetRoutesToSyncUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRoutesToSyncUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetCityDataRemoteConfigUseCase f1762a;
    public final CityDataRepository b;
    public final RecentRouteLocalDataSource c;

    public GetRoutesToSyncUseCase(GetCityDataRemoteConfigUseCase getCityDataRemoteConfigUseCase, CityDataRepository cityDataRepository, RecentRouteLocalDataSource recentRouteLocalDataSource) {
        this.f1762a = getCityDataRemoteConfigUseCase;
        this.b = cityDataRepository;
        this.c = recentRouteLocalDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, ContinuationImpl continuationImpl) {
        GetRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1 getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1;
        if (continuationImpl instanceof GetRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1) {
            getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1 = (GetRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1) continuationImpl;
            int i = getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1.label = i - Integer.MIN_VALUE;
            } else {
                getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1 = new GetRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1(this, continuationImpl);
            }
        } else {
            getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1 = new GetRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1(this, continuationImpl);
        }
        Object objL = getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.FAVOURITE;
            getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1.label = 1;
            objL = this.c.l(str, recentsSpecialStatus, getRoutesToSyncUseCase$getFavRouteIdsWithVersionList$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        Iterable iterable = (Iterable) objL;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecentRouteAppModel) it.next()).e);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, ContinuationImpl continuationImpl) {
        GetRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1 getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1;
        if (continuationImpl instanceof GetRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1) {
            getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1 = (GetRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1) continuationImpl;
            int i = getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1.label = i - Integer.MIN_VALUE;
            } else {
                getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1 = new GetRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1(this, continuationImpl);
            }
        } else {
            getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1 = new GetRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1(this, continuationImpl);
        }
        Object objH = getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.NONE;
            getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1.label = 1;
            objH = this.c.h(str, recentsSpecialStatus, 5, getRoutesToSyncUseCase$getRecentRouteIdWithVersionList$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        Iterable iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecentRouteAppModel) it.next()).e);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[PHI: r2 r11 r12
      0x00a7: PHI (r2v4 app.chalo.citydata.data.model.app.CityDataConfigForCity) = 
      (r2v3 app.chalo.citydata.data.model.app.CityDataConfigForCity)
      (r2v17 app.chalo.citydata.data.model.app.CityDataConfigForCity)
     binds: [B:28:0x00a4, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r11v4 java.util.List) = (r11v3 java.util.List), (r11v15 java.util.List) binds: [B:28:0x00a4, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r12v11 java.lang.Object) = (r12v10 java.lang.Object), (r12v1 java.lang.Object) binds: [B:28:0x00a4, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[LOOP:0: B:42:0x00eb->B:44:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        GetRoutesToSyncUseCase$invoke$1 getRoutesToSyncUseCase$invoke$1;
        String str2;
        List list;
        CityDataConfigForCity cityDataConfigForCity;
        Integer num;
        int iIntValue;
        Object objE;
        List list2;
        int i;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof GetRoutesToSyncUseCase$invoke$1) {
            getRoutesToSyncUseCase$invoke$1 = (GetRoutesToSyncUseCase$invoke$1) continuationImpl;
            int i2 = getRoutesToSyncUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRoutesToSyncUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getRoutesToSyncUseCase$invoke$1 = new GetRoutesToSyncUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRoutesToSyncUseCase$invoke$1 = new GetRoutesToSyncUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRoutesToSyncUseCase$invoke$1.result;
        Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getRoutesToSyncUseCase$invoke$1.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            getRoutesToSyncUseCase$invoke$1.L$0 = str;
            getRoutesToSyncUseCase$invoke$1.label = 1;
            objA = this.f1762a.a(getRoutesToSyncUseCase$invoke$1);
            if (objA != serializable) {
            }
            return serializable;
        }
        if (i3 == 1) {
            str = (String) getRoutesToSyncUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i3 == 2) {
                list = (List) getRoutesToSyncUseCase$invoke$1.L$2;
                cityDataConfigForCity = (CityDataConfigForCity) getRoutesToSyncUseCase$invoke$1.L$1;
                str2 = (String) getRoutesToSyncUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                list.addAll((List) objA);
                getRoutesToSyncUseCase$invoke$1.L$0 = cityDataConfigForCity;
                getRoutesToSyncUseCase$invoke$1.L$1 = list;
                getRoutesToSyncUseCase$invoke$1.L$2 = null;
                getRoutesToSyncUseCase$invoke$1.label = 3;
                objA = b(str2, getRoutesToSyncUseCase$invoke$1);
                if (objA != serializable) {
                    list.addAll((List) objA);
                    num = new Integer(cityDataConfigForCity.d);
                    if (num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 10;
                    }
                    SavedRoutesSortType savedRoutesSortType = SavedRoutesSortType.MOST_RECENT;
                    getRoutesToSyncUseCase$invoke$1.L$0 = list;
                    getRoutesToSyncUseCase$invoke$1.L$1 = null;
                    getRoutesToSyncUseCase$invoke$1.I$0 = iIntValue;
                    getRoutesToSyncUseCase$invoke$1.label = 4;
                    objE = this.b.e(savedRoutesSortType, getRoutesToSyncUseCase$invoke$1);
                    if (objE != serializable) {
                        list2 = list;
                        i = iIntValue;
                        objA = objE;
                    }
                }
                return serializable;
            }
            if (i3 == 3) {
                list = (List) getRoutesToSyncUseCase$invoke$1.L$1;
                cityDataConfigForCity = (CityDataConfigForCity) getRoutesToSyncUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                list.addAll((List) objA);
                num = new Integer(cityDataConfigForCity.d);
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 10;
                }
                SavedRoutesSortType savedRoutesSortType2 = SavedRoutesSortType.MOST_RECENT;
                getRoutesToSyncUseCase$invoke$1.L$0 = list;
                getRoutesToSyncUseCase$invoke$1.L$1 = null;
                getRoutesToSyncUseCase$invoke$1.I$0 = iIntValue;
                getRoutesToSyncUseCase$invoke$1.label = 4;
                objE = this.b.e(savedRoutesSortType2, getRoutesToSyncUseCase$invoke$1);
                if (objE != serializable) {
                    list2 = list;
                    i = iIntValue;
                    objA = objE;
                }
                return serializable;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = getRoutesToSyncUseCase$invoke$1.I$0;
            list2 = (List) getRoutesToSyncUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((RouteIdWithVersion) it.next()).b);
        }
        list2.addAll(CollectionsKt.x0(arrayList, i));
        return CollectionsKt.z(list2);
        CityDataConfigForCity cityDataConfigForCity2 = (CityDataConfigForCity) objA;
        ArrayList arrayList2 = new ArrayList();
        getRoutesToSyncUseCase$invoke$1.L$0 = str;
        getRoutesToSyncUseCase$invoke$1.L$1 = cityDataConfigForCity2;
        getRoutesToSyncUseCase$invoke$1.L$2 = arrayList2;
        getRoutesToSyncUseCase$invoke$1.label = 2;
        Serializable serializableA = a(str, getRoutesToSyncUseCase$invoke$1);
        if (serializableA != serializable) {
            str2 = str;
            list = arrayList2;
            cityDataConfigForCity = cityDataConfigForCity2;
            objA = serializableA;
            list.addAll((List) objA);
            getRoutesToSyncUseCase$invoke$1.L$0 = cityDataConfigForCity;
            getRoutesToSyncUseCase$invoke$1.L$1 = list;
            getRoutesToSyncUseCase$invoke$1.L$2 = null;
            getRoutesToSyncUseCase$invoke$1.label = 3;
            objA = b(str2, getRoutesToSyncUseCase$invoke$1);
            if (objA != serializable) {
                list.addAll((List) objA);
                num = new Integer(cityDataConfigForCity.d);
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 10;
                }
                SavedRoutesSortType savedRoutesSortType3 = SavedRoutesSortType.MOST_RECENT;
                getRoutesToSyncUseCase$invoke$1.L$0 = list;
                getRoutesToSyncUseCase$invoke$1.L$1 = null;
                getRoutesToSyncUseCase$invoke$1.I$0 = iIntValue;
                getRoutesToSyncUseCase$invoke$1.label = 4;
                objE = this.b.e(savedRoutesSortType3, getRoutesToSyncUseCase$invoke$1);
                if (objE != serializable) {
                    list2 = list;
                    i = iIntValue;
                    objA = objE;
                    Iterable iterable2 = (Iterable) objA;
                    arrayList = new ArrayList(CollectionsKt.v(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RouteIdWithVersion) it.next()).b);
                    }
                    list2.addAll(CollectionsKt.x0(arrayList, i));
                    return CollectionsKt.z(list2);
                }
            }
        }
        return serializable;
    }
}

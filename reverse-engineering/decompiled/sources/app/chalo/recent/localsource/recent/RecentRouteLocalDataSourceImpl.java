package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.dao.recent.RouteRecentCityItineraryDao;
import app.chalo.recent.database.entities.RecentCityItineraryEntitiesKt;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentRouteLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentRouteLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentRouteLocalDataSourceImpl implements RecentRouteLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteRecentCityItineraryDao f8968a;
    public final BasicInfoContract b;

    public RecentRouteLocalDataSourceImpl(RouteRecentCityItineraryDao routeRecentCityItineraryDao, BasicInfoContract basicInfoContract) {
        this.f8968a = routeRecentCityItineraryDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8968a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        Object objE = this.f8968a.e(str, str2, continuationImpl);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Serializable c(int i, String str, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1 recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1) {
            recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1 = (RecentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1) continuationImpl;
            int i2 = recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1 = new RecentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1 = new RecentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1(this, continuationImpl);
        }
        Object objK = recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1.label;
        if (i3 == 0) {
            ResultKt.b(objK);
            RecentsSpecialEntityStatus recentsSpecialEntityStatus = RecentsSpecialEntityStatus.NONE;
            recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1.label = 1;
            objK = this.f8968a.k(i, recentsSpecialEntityStatus, str, recentRouteLocalDataSourceImpl$getOldestRecentRoutesWithoutSpecialStatusForCity$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        List list = (List) objK;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object d(RecentRouteAppModel recentRouteAppModel, boolean z, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1 recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1;
        boolean z2;
        RecentRouteEntity recentRouteEntity;
        long jLongValue;
        int i;
        RecentRouteAppModel recentRouteAppModel2;
        int i2;
        RecentRouteEntity recentRouteEntityB;
        RecentRouteAppModel recentRouteAppModel3 = recentRouteAppModel;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) {
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1 = (RecentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) continuationImpl;
            int i3 = recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1 = new RecentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1 = new RecentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1(this, continuationImpl);
        }
        Object objF = recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label;
        Unit unit = Unit.f17538a;
        RouteRecentCityItineraryDao routeRecentCityItineraryDao = this.f8968a;
        if (i4 == 0) {
            ResultKt.b(objF);
            String str = recentRouteAppModel3.e;
            String str2 = recentRouteAppModel3.f;
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = recentRouteAppModel3;
            z2 = z;
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.Z$0 = z2;
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 1;
            objF = routeRecentCityItineraryDao.f(str, str2, recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            boolean z3 = recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.Z$0;
            RecentRouteAppModel recentRouteAppModel4 = (RecentRouteAppModel) recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0;
            ResultKt.b(objF);
            z2 = z3;
            recentRouteAppModel3 = recentRouteAppModel4;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    ResultKt.b(objF);
                    return unit;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objF);
                return unit;
            }
            i2 = recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.I$0;
            recentRouteEntity = (RecentRouteEntity) recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$1;
            recentRouteAppModel2 = (RecentRouteAppModel) recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0;
            ResultKt.b(objF);
        }
        jLongValue = ((Number) objF).longValue();
        i = i2;
        recentRouteAppModel3 = recentRouteAppModel2;
        long j = jLongValue;
        RecentsSpecialStatus recentsSpecialStatusA = RecentCityItineraryEntitiesKt.a(recentRouteEntity.k);
        RecentsSpecialStatus recentsSpecialStatus = recentRouteAppModel3.o;
        RecentsAppModelKt.b(recentsSpecialStatusA, recentsSpecialStatus);
        String routeId = recentRouteAppModel3.e;
        String cityId = recentRouteAppModel3.f;
        String routeName = recentRouteAppModel3.g;
        String startStopName = recentRouteAppModel3.h;
        String endStopName = recentRouteAppModel3.i;
        String str3 = recentRouteAppModel3.j;
        boolean z4 = recentRouteAppModel3.k;
        List list = recentRouteAppModel3.l;
        boolean z5 = recentRouteAppModel3.m;
        ChaloTransitMode transitMode = recentRouteAppModel3.n;
        String str4 = recentRouteAppModel3.r;
        RouteNamingSchemeType routeSchemeType = recentRouteAppModel3.s;
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(routeSchemeType, "routeSchemeType");
        recentRouteEntityB = new RecentRouteAppModel(routeId, cityId, routeName, startStopName, endStopName, str3, z4, list, z5, transitMode, recentsSpecialStatus, j, i, str4, routeSchemeType).b();
        recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = null;
        recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$1 = null;
        recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 3;
        if (routeRecentCityItineraryDao.g(recentRouteEntityB, recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        recentRouteEntity = (RecentRouteEntity) objF;
        if (recentRouteEntity != null) {
            int i5 = recentRouteEntity.m;
            if (z2) {
                i5++;
            }
            if (z2) {
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = recentRouteAppModel3;
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$1 = recentRouteEntity;
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.I$0 = i5;
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 2;
                Object objC = this.b.c(recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1);
                if (objC != coroutineSingletons) {
                    recentRouteAppModel2 = recentRouteAppModel3;
                    i2 = i5;
                    objF = objC;
                    jLongValue = ((Number) objF).longValue();
                    i = i2;
                    recentRouteAppModel3 = recentRouteAppModel2;
                    long j2 = jLongValue;
                    RecentsSpecialStatus recentsSpecialStatusA2 = RecentCityItineraryEntitiesKt.a(recentRouteEntity.k);
                    RecentsSpecialStatus recentsSpecialStatus2 = recentRouteAppModel3.o;
                    RecentsAppModelKt.b(recentsSpecialStatusA2, recentsSpecialStatus2);
                    String routeId2 = recentRouteAppModel3.e;
                    String cityId2 = recentRouteAppModel3.f;
                    String routeName2 = recentRouteAppModel3.g;
                    String startStopName2 = recentRouteAppModel3.h;
                    String endStopName2 = recentRouteAppModel3.i;
                    String str5 = recentRouteAppModel3.j;
                    boolean z6 = recentRouteAppModel3.k;
                    List list2 = recentRouteAppModel3.l;
                    boolean z7 = recentRouteAppModel3.m;
                    ChaloTransitMode transitMode2 = recentRouteAppModel3.n;
                    String str6 = recentRouteAppModel3.r;
                    RouteNamingSchemeType routeSchemeType2 = recentRouteAppModel3.s;
                    Intrinsics.i(routeId2, "routeId");
                    Intrinsics.i(cityId2, "cityId");
                    Intrinsics.i(routeName2, "routeName");
                    Intrinsics.i(startStopName2, "startStopName");
                    Intrinsics.i(endStopName2, "endStopName");
                    Intrinsics.i(transitMode2, "transitMode");
                    Intrinsics.i(routeSchemeType2, "routeSchemeType");
                    recentRouteEntityB = new RecentRouteAppModel(routeId2, cityId2, routeName2, startStopName2, endStopName2, str5, z6, list2, z7, transitMode2, recentsSpecialStatus2, j2, i, str6, routeSchemeType2).b();
                    recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = null;
                    recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$1 = null;
                    recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 3;
                    if (routeRecentCityItineraryDao.g(recentRouteEntityB, recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) == coroutineSingletons) {
                        return unit;
                    }
                }
            } else {
                jLongValue = recentRouteEntity.l;
                i = i5;
                long j3 = jLongValue;
                RecentsSpecialStatus recentsSpecialStatusA3 = RecentCityItineraryEntitiesKt.a(recentRouteEntity.k);
                RecentsSpecialStatus recentsSpecialStatus3 = recentRouteAppModel3.o;
                RecentsAppModelKt.b(recentsSpecialStatusA3, recentsSpecialStatus3);
                String routeId3 = recentRouteAppModel3.e;
                String cityId3 = recentRouteAppModel3.f;
                String routeName3 = recentRouteAppModel3.g;
                String startStopName3 = recentRouteAppModel3.h;
                String endStopName3 = recentRouteAppModel3.i;
                String str7 = recentRouteAppModel3.j;
                boolean z8 = recentRouteAppModel3.k;
                List list3 = recentRouteAppModel3.l;
                boolean z9 = recentRouteAppModel3.m;
                ChaloTransitMode transitMode3 = recentRouteAppModel3.n;
                String str8 = recentRouteAppModel3.r;
                RouteNamingSchemeType routeSchemeType3 = recentRouteAppModel3.s;
                Intrinsics.i(routeId3, "routeId");
                Intrinsics.i(cityId3, "cityId");
                Intrinsics.i(routeName3, "routeName");
                Intrinsics.i(startStopName3, "startStopName");
                Intrinsics.i(endStopName3, "endStopName");
                Intrinsics.i(transitMode3, "transitMode");
                Intrinsics.i(routeSchemeType3, "routeSchemeType");
                recentRouteEntityB = new RecentRouteAppModel(routeId3, cityId3, routeName3, startStopName3, endStopName3, str7, z8, list3, z9, transitMode3, recentsSpecialStatus3, j3, i, str8, routeSchemeType3).b();
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = null;
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$1 = null;
                recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 3;
                if (routeRecentCityItineraryDao.g(recentRouteEntityB, recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) == coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            RecentRouteEntity recentRouteEntityB2 = recentRouteAppModel3.b();
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.L$0 = null;
            recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1.label = 4;
            if (routeRecentCityItineraryDao.g(recentRouteEntityB2, recentRouteLocalDataSourceImpl$insertOrUpdateIfRequiredRouteRecent$1) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object e(String str, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1 recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1) {
            recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1 = (RecentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1) continuationImpl;
            int i = recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1.label = i - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1 = new RecentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1 = new RecentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1(this, continuationImpl);
        }
        Object objD = recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            RecentsSpecialEntityStatus recentsSpecialEntityStatus = RecentsSpecialEntityStatus.NONE;
            recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1.label = 1;
            objD = this.f8968a.d(recentsSpecialEntityStatus, str, recentRouteLocalDataSourceImpl$getRecentRoutesWithoutSpecialStatusCount$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        Integer num = (Integer) objD;
        return new Integer(num != null ? num.intValue() : 0);
    }

    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object f(String str, List list, Continuation continuation) {
        Object objO = this.f8968a.o(str, list, continuation);
        return objO == CoroutineSingletons.COROUTINE_SUSPENDED ? objO : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Object g(RecentsSpecialStatus recentsSpecialStatus, String str, String str2, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1 recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1) {
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1 = (RecentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1) continuationImpl;
            int i = recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1(this, continuationImpl);
        }
        Object objP = recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objP);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1.label = 1;
            objP = this.f8968a.p(recentsSpecialEntityStatusD, str, str2, recentRouteLocalDataSourceImpl$getRecentRouteCountForCityWithSpecialStatus$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return Boolean.valueOf(((Number) objP).intValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Serializable h(String str, RecentsSpecialStatus recentsSpecialStatus, int i, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1 recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1) {
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1 = (RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1) continuationImpl;
            int i2 = recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1.label = i2 - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1(this, continuationImpl);
        }
        Object objN = recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1.label;
        if (i3 == 0) {
            ResultKt.b(objN);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1.label = 1;
            objN = this.f8968a.n(i, recentsSpecialEntityStatusD, str, recentRouteLocalDataSourceImpl$getRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        List list = (List) objN;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Serializable i(String str, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1 recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1) {
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1 = (RecentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1) continuationImpl;
            int i = recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1 = new RecentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1 = new RecentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1(this, continuationImpl);
        }
        Object objL = recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1.label = 1;
            objL = this.f8968a.l(str, recentRouteLocalDataSourceImpl$getAllRouteRecentForCity$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        List list = (List) objL;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
        }
        return arrayList;
    }

    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final RecentRouteLocalDataSourceImpl$getAllRouteRecentSortedByMostRecentAccessForCityWithSpecialStatus$$inlined$map$1 j() {
        RecentsAppModelKt.d(null);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1 k(String str) {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1I = this.f8968a.i(str);
        return new Flow<List<? extends RecentRouteAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8973a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentSortedByAccessTimeForCity$$inlined$map$1$2", f = "RecentRouteLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f8973a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
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
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8973a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowQuery$mapToList$$inlined$map$1I.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Serializable l(String str, RecentsSpecialStatus recentsSpecialStatus, ContinuationImpl continuationImpl) {
        RecentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1 recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1;
        if (continuationImpl instanceof RecentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1) {
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1 = (RecentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1) continuationImpl;
            int i = recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1(this, continuationImpl);
            }
        } else {
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1 = new RecentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1(this, continuationImpl);
        }
        Object objJ = recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
            recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1.label = 1;
            objJ = this.f8968a.j(recentsSpecialEntityStatusD, str, recentRouteLocalDataSourceImpl$getAllRouteRecentForCityWithSpecialStatus$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        List list = (List) objJ;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
        }
        return arrayList;
    }

    @Override // app.chalo.recent.localsource.recent.RecentRouteLocalDataSource
    public final Flow m(String str, Set set) {
        if (set.isEmpty()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1H = this.f8968a.h(str, CollectionsKt.D0(set));
        return new Flow<List<? extends RecentRouteAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentFilteredByTransitModeAndSortedByAccessTimeForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentFilteredByTransitModeAndSortedByAccessTimeForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8971a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentFilteredByTransitModeAndSortedByAccessTimeForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl$getRouteRecentFilteredByTransitModeAndSortedByAccessTimeForCity$$inlined$map$1$2", f = "RecentRouteLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f8971a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
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
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ConvertToAppModelKt.e((RecentRouteEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8971a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowQuery$mapToList$$inlined$map$1H.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}

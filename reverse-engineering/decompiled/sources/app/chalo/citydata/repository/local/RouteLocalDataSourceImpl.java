package app.chalo.citydata.repository.local;

import app.chalo.citydata.repository.local.room.dao.RouteDao;
import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/local/RouteLocalDataSourceImpl;", "Lapp/chalo/citydata/repository/local/RouteLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteLocalDataSourceImpl implements RouteLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteDao f1779a;
    public final BasicInfoContract b;
    public final CityProvider c;

    public RouteLocalDataSourceImpl(RouteDao routeDao, BasicInfoContract basicInfoContract, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider) {
        this.f1779a = routeDao;
        this.b = basicInfoContract;
        this.c = cityProvider;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object a(List list, Continuation continuation) {
        Object objA = this.f1779a.a(list, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object b(long j, Continuation continuation) {
        Object objH = this.f1779a.h(j, m(), continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object c(RouteEntity routeEntity, ContinuationImpl continuationImpl) {
        Object objC = this.f1779a.c(routeEntity, continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object d(ContinuationImpl continuationImpl) {
        return this.f1779a.g(m(), continuationImpl);
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object e(String str, RouteEntityLiveDataDetails routeEntityLiveDataDetails, Continuation continuation) {
        Object objK = this.f1779a.k(str, m(), routeEntityLiveDataDetails, continuation);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object f(String str, ContinuationImpl continuationImpl) {
        Object objE = this.f1779a.e(str, m(), continuationImpl);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object g(ArrayList arrayList, Continuation continuation) {
        Object objJ = this.f1779a.j(m(), arrayList, continuation);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object h(List list, ContinuationImpl continuationImpl) {
        RouteLocalDataSourceImpl$getSelectRoutes$1 routeLocalDataSourceImpl$getSelectRoutes$1;
        if (continuationImpl instanceof RouteLocalDataSourceImpl$getSelectRoutes$1) {
            routeLocalDataSourceImpl$getSelectRoutes$1 = (RouteLocalDataSourceImpl$getSelectRoutes$1) continuationImpl;
            int i = routeLocalDataSourceImpl$getSelectRoutes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeLocalDataSourceImpl$getSelectRoutes$1.label = i - Integer.MIN_VALUE;
            } else {
                routeLocalDataSourceImpl$getSelectRoutes$1 = new RouteLocalDataSourceImpl$getSelectRoutes$1(this, continuationImpl);
            }
        } else {
            routeLocalDataSourceImpl$getSelectRoutes$1 = new RouteLocalDataSourceImpl$getSelectRoutes$1(this, continuationImpl);
        }
        Object objF = routeLocalDataSourceImpl$getSelectRoutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeLocalDataSourceImpl$getSelectRoutes$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            String strM = m();
            routeLocalDataSourceImpl$getSelectRoutes$1.label = 1;
            objF = this.f1779a.f(strM, list, routeLocalDataSourceImpl$getSelectRoutes$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        List list2 = (List) objF;
        return list2 == null ? EmptyList.f17557a : list2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object i(String str, ContinuationImpl continuationImpl) {
        RouteLocalDataSourceImpl$getRoute$1 routeLocalDataSourceImpl$getRoute$1;
        RouteEntity routeEntity;
        RouteDao routeDao;
        String str2;
        RouteEntity routeEntity2;
        long jLongValue;
        String strM;
        if (continuationImpl instanceof RouteLocalDataSourceImpl$getRoute$1) {
            routeLocalDataSourceImpl$getRoute$1 = (RouteLocalDataSourceImpl$getRoute$1) continuationImpl;
            int i = routeLocalDataSourceImpl$getRoute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeLocalDataSourceImpl$getRoute$1.label = i - Integer.MIN_VALUE;
            } else {
                routeLocalDataSourceImpl$getRoute$1 = new RouteLocalDataSourceImpl$getRoute$1(this, continuationImpl);
            }
        } else {
            routeLocalDataSourceImpl$getRoute$1 = new RouteLocalDataSourceImpl$getRoute$1(this, continuationImpl);
        }
        RouteLocalDataSourceImpl$getRoute$1 routeLocalDataSourceImpl$getRoute$2 = routeLocalDataSourceImpl$getRoute$1;
        Object objL = routeLocalDataSourceImpl$getRoute$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeLocalDataSourceImpl$getRoute$2.label;
        RouteDao routeDao2 = this.f1779a;
        if (i2 == 0) {
            ResultKt.b(objL);
            String strM2 = m();
            routeLocalDataSourceImpl$getRoute$2.L$0 = str;
            routeLocalDataSourceImpl$getRoute$2.label = 1;
            objL = routeDao2.l(str, strM2, routeLocalDataSourceImpl$getRoute$2);
            if (objL != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) routeLocalDataSourceImpl$getRoute$2.L$0;
            ResultKt.b(objL);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RouteEntity routeEntity3 = (RouteEntity) routeLocalDataSourceImpl$getRoute$2.L$0;
                ResultKt.b(objL);
                return routeEntity3;
            }
            str = (String) routeLocalDataSourceImpl$getRoute$2.L$2;
            routeDao2 = (RouteDao) routeLocalDataSourceImpl$getRoute$2.L$1;
            routeEntity = (RouteEntity) routeLocalDataSourceImpl$getRoute$2.L$0;
            ResultKt.b(objL);
        }
        routeDao = routeDao2;
        str2 = str;
        routeEntity2 = routeEntity;
        jLongValue = ((Number) objL).longValue();
        strM = m();
        routeLocalDataSourceImpl$getRoute$2.L$0 = routeEntity2;
        routeLocalDataSourceImpl$getRoute$2.L$1 = null;
        routeLocalDataSourceImpl$getRoute$2.L$2 = null;
        routeLocalDataSourceImpl$getRoute$2.label = 3;
        if (routeDao.b(str2, strM, jLongValue, routeLocalDataSourceImpl$getRoute$2) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return routeEntity2;
        routeEntity = (RouteEntity) objL;
        routeLocalDataSourceImpl$getRoute$2.L$0 = routeEntity;
        routeLocalDataSourceImpl$getRoute$2.L$1 = routeDao2;
        routeLocalDataSourceImpl$getRoute$2.L$2 = str;
        routeLocalDataSourceImpl$getRoute$2.label = 2;
        objL = this.b.c(routeLocalDataSourceImpl$getRoute$2);
        if (objL != coroutineSingletons) {
            routeDao = routeDao2;
            str2 = str;
            routeEntity2 = routeEntity;
            jLongValue = ((Number) objL).longValue();
            strM = m();
            routeLocalDataSourceImpl$getRoute$2.L$0 = routeEntity2;
            routeLocalDataSourceImpl$getRoute$2.L$1 = null;
            routeLocalDataSourceImpl$getRoute$2.L$2 = null;
            routeLocalDataSourceImpl$getRoute$2.label = 3;
            if (routeDao.b(str2, strM, jLongValue, routeLocalDataSourceImpl$getRoute$2) != coroutineSingletons) {
                return routeEntity2;
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object j(ContinuationImpl continuationImpl) {
        return this.f1779a.i(m(), continuationImpl);
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object k(Continuation continuation) {
        return this.f1779a.d(m(), continuation);
    }

    @Override // app.chalo.citydata.repository.local.RouteLocalDataSource
    public final Object l(String str, Continuation continuation) {
        return this.f1779a.m(str, m(), continuation);
    }

    public final String m() {
        String strB = CityProviderKt.b(this.c);
        return strB == null ? "" : strB;
    }
}

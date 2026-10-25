package app.chalo.citydata.manager;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/manager/CityDataManagerKotlinImpl;", "Lapp/chalo/citydata/manager/CityDataManagerKotlin;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDataManagerKotlinImpl implements CityDataManagerKotlin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataRepository f1776a;
    public final GetRouteDataFromLocalOrRemoteUseCase b;

    public CityDataManagerKotlinImpl(CityDataRepository cityDataRepository, GetRouteDataFromLocalOrRemoteUseCase getRouteDataFromLocalOrRemoteUseCase) {
        this.f1776a = cityDataRepository;
        this.b = getRouteDataFromLocalOrRemoteUseCase;
    }

    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final Object a(Continuation continuation) {
        return this.f1776a.d((ContinuationImpl) continuation);
    }

    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final Object b(ContinuationImpl continuationImpl) {
        return this.f1776a.r(continuationImpl);
    }

    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final Object c(String str, Continuation continuation) {
        return this.f1776a.f(str, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final Object d(List list, ContinuationImpl continuationImpl) {
        CityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1 cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1;
        if (continuationImpl instanceof CityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1) {
            cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1 = (CityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1) continuationImpl;
            int i = cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1 = new CityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1(this, continuationImpl);
            }
        } else {
            cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1 = new CityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1(this, continuationImpl);
        }
        Object objB = cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1.label = 1;
            objB = this.b.b(list, cityDataManagerKotlinImpl$getSavedRoutesOrFetchFromRemoteInCaseOfCitydataOnDemandFetch$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return EmptyList.f17557a;
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        CityDataManagerKotlinImpl$getStopFromId$2 cityDataManagerKotlinImpl$getStopFromId$2;
        List list;
        Object next;
        if (continuationImpl instanceof CityDataManagerKotlinImpl$getStopFromId$2) {
            cityDataManagerKotlinImpl$getStopFromId$2 = (CityDataManagerKotlinImpl$getStopFromId$2) continuationImpl;
            int i = cityDataManagerKotlinImpl$getStopFromId$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataManagerKotlinImpl$getStopFromId$2.label = i - Integer.MIN_VALUE;
            } else {
                cityDataManagerKotlinImpl$getStopFromId$2 = new CityDataManagerKotlinImpl$getStopFromId$2(this, continuationImpl);
            }
        } else {
            cityDataManagerKotlinImpl$getStopFromId$2 = new CityDataManagerKotlinImpl$getStopFromId$2(this, continuationImpl);
        }
        Object objB = cityDataManagerKotlinImpl$getStopFromId$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataManagerKotlinImpl$getStopFromId$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            List listR = CollectionsKt.R(str);
            cityDataManagerKotlinImpl$getStopFromId$2.L$0 = str;
            cityDataManagerKotlinImpl$getStopFromId$2.L$1 = str2;
            cityDataManagerKotlinImpl$getStopFromId$2.label = 1;
            objB = this.b.b(listR, cityDataManagerKotlinImpl$getStopFromId$2);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) cityDataManagerKotlinImpl$getStopFromId$2.L$1;
            str = (String) cityDataManagerKotlinImpl$getStopFromId$2.L$0;
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            list = null;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((RouteAppModel) next).b, str));
            RouteAppModel routeAppModel = (RouteAppModel) next;
            if (routeAppModel != null) {
                return routeAppModel.a(str2);
            }
        }
        return null;
    }

    @Override // app.chalo.citydata.manager.CityDataManagerKotlin
    public final EmptyList f() {
        return EmptyList.f17557a;
    }
}

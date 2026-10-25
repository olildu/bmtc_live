package app.chalo.home.data.repository;

import app.chalo.home.data.local.HomeScreenConfigLocalDataStore;
import app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel;
import app.chalo.home.data.model.api.response.CheckAppUpdateResponseApiModel;
import app.chalo.home.data.model.app.response.CheckAppUpdateResponseAppModel;
import app.chalo.home.data.remote.IHomeScreenConfigRemoteDataSource;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/repository/HomeScreenConfigRepository;", "Lapp/chalo/home/data/repository/IHomeScreenConfigRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigRepository implements IHomeScreenConfigRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHomeScreenConfigRemoteDataSource f2980a;
    public final HomeScreenConfigLocalDataStore b;

    public HomeScreenConfigRepository(IHomeScreenConfigRemoteDataSource iHomeScreenConfigRemoteDataSource, HomeScreenConfigLocalDataStore homeScreenConfigLocalDataStore) {
        this.f2980a = iHomeScreenConfigRemoteDataSource;
        this.b = homeScreenConfigLocalDataStore;
    }

    @Override // app.chalo.home.data.repository.IHomeScreenConfigRepository
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = this.b.a(str, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.IHomeScreenConfigRepository
    public final Object b(String str, String str2, Continuation continuation) {
        return this.b.c(str, str2, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.repository.IHomeScreenConfigRepository
    public final Object c(Map map, ContinuationImpl continuationImpl) {
        HomeScreenConfigRepository$checkIfUpdateRequired$1 homeScreenConfigRepository$checkIfUpdateRequired$1;
        if (continuationImpl instanceof HomeScreenConfigRepository$checkIfUpdateRequired$1) {
            homeScreenConfigRepository$checkIfUpdateRequired$1 = (HomeScreenConfigRepository$checkIfUpdateRequired$1) continuationImpl;
            int i = homeScreenConfigRepository$checkIfUpdateRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenConfigRepository$checkIfUpdateRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenConfigRepository$checkIfUpdateRequired$1 = new HomeScreenConfigRepository$checkIfUpdateRequired$1(this, continuationImpl);
            }
        } else {
            homeScreenConfigRepository$checkIfUpdateRequired$1 = new HomeScreenConfigRepository$checkIfUpdateRequired$1(this, continuationImpl);
        }
        Object objA = homeScreenConfigRepository$checkIfUpdateRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenConfigRepository$checkIfUpdateRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            homeScreenConfigRepository$checkIfUpdateRequired$1.label = 1;
            objA = this.f2980a.a(homeScreenConfigRepository$checkIfUpdateRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        CheckAppUpdateResponseApiModel checkAppUpdateResponseApiModel = (CheckAppUpdateResponseApiModel) objA;
        Intrinsics.i(checkAppUpdateResponseApiModel, "<this>");
        Boolean bool = checkAppUpdateResponseApiModel.f2924a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = checkAppUpdateResponseApiModel.b;
        return new CheckAppUpdateResponseAppModel(zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }

    @Override // app.chalo.home.data.repository.IHomeScreenConfigRepository
    public final Object d(String str, String str2, HomeScreenConfigFetchApiModel homeScreenConfigFetchApiModel, String str3, Continuation continuation) {
        Object objB = this.b.b(str, str2, homeScreenConfigFetchApiModel, str3, (ContinuationImpl) continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.repository.IHomeScreenConfigRepository
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        HomeScreenConfigRepository$fetchHomeScreenConfig$1 homeScreenConfigRepository$fetchHomeScreenConfig$1;
        if (continuationImpl instanceof HomeScreenConfigRepository$fetchHomeScreenConfig$1) {
            homeScreenConfigRepository$fetchHomeScreenConfig$1 = (HomeScreenConfigRepository$fetchHomeScreenConfig$1) continuationImpl;
            int i = homeScreenConfigRepository$fetchHomeScreenConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenConfigRepository$fetchHomeScreenConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenConfigRepository$fetchHomeScreenConfig$1 = new HomeScreenConfigRepository$fetchHomeScreenConfig$1(this, continuationImpl);
            }
        } else {
            homeScreenConfigRepository$fetchHomeScreenConfig$1 = new HomeScreenConfigRepository$fetchHomeScreenConfig$1(this, continuationImpl);
        }
        Object objD = homeScreenConfigRepository$fetchHomeScreenConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenConfigRepository$fetchHomeScreenConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            homeScreenConfigRepository$fetchHomeScreenConfig$1.L$0 = str;
            homeScreenConfigRepository$fetchHomeScreenConfig$1.L$1 = str2;
            homeScreenConfigRepository$fetchHomeScreenConfig$1.label = 1;
            objD = this.b.d(str, homeScreenConfigRepository$fetchHomeScreenConfig$1);
            if (objD != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return objD;
        }
        str2 = (String) homeScreenConfigRepository$fetchHomeScreenConfig$1.L$1;
        str = (String) homeScreenConfigRepository$fetchHomeScreenConfig$1.L$0;
        ResultKt.b(objD);
        homeScreenConfigRepository$fetchHomeScreenConfig$1.L$0 = null;
        homeScreenConfigRepository$fetchHomeScreenConfig$1.L$1 = null;
        homeScreenConfigRepository$fetchHomeScreenConfig$1.label = 2;
        Serializable serializableB = this.f2980a.b(str, str2, (String) objD, homeScreenConfigRepository$fetchHomeScreenConfig$1);
        return serializableB == coroutineSingletons ? coroutineSingletons : serializableB;
    }
}

package app.chalo.features.chalotime.data;

import app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSource;
import app.chalo.features.chalotime.data.model.api.ChaloTimeDataResponseApiModel;
import app.chalo.features.chalotime.data.model.api.ChaloTimeResponseApiModel;
import app.chalo.features.chalotime.data.model.app.ChaloTimeResponseAppModel;
import app.chalo.features.chalotime.data.model.config.ChaloTimeRequestConfig;
import app.chalo.features.chalotime.data.remote.ChaloTimeRemoteDataSource;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.utils.ElapsedRealTimeClock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/ChaloTimeRepositoryImpl;", "Lapp/chalo/features/chalotime/data/ChaloTimeRepository;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeRepositoryImpl implements ChaloTimeRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeRemoteDataSource f2658a;
    public final ChaloTimeLocalDataSource b;

    public ChaloTimeRepositoryImpl(ChaloTimeRemoteDataSource chaloTimeRemoteDataSource, ChaloTimeLocalDataSource chaloTimeLocalDataSource) {
        this.f2658a = chaloTimeRemoteDataSource;
        this.b = chaloTimeLocalDataSource;
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object a(long j, long j2, long j3, ElapsedRealTimeClock elapsedRealTimeClock, Continuation continuation) {
        Object objA = this.b.a(j, j2, j3, elapsedRealTimeClock, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object b(Continuation continuation) {
        Object objB = this.b.b(continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object c(String str, Continuation continuation) {
        Object objC = this.b.c(str, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object d(ChaloTimeRequestConfig chaloTimeRequestConfig, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException {
        ChaloTimeRepositoryImpl$fetchChaloTime$1 chaloTimeRepositoryImpl$fetchChaloTime$1;
        Long l;
        if (continuationImpl instanceof ChaloTimeRepositoryImpl$fetchChaloTime$1) {
            chaloTimeRepositoryImpl$fetchChaloTime$1 = (ChaloTimeRepositoryImpl$fetchChaloTime$1) continuationImpl;
            int i = chaloTimeRepositoryImpl$fetchChaloTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRepositoryImpl$fetchChaloTime$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRepositoryImpl$fetchChaloTime$1 = new ChaloTimeRepositoryImpl$fetchChaloTime$1(this, continuationImpl);
            }
        } else {
            chaloTimeRepositoryImpl$fetchChaloTime$1 = new ChaloTimeRepositoryImpl$fetchChaloTime$1(this, continuationImpl);
        }
        Object objD = chaloTimeRepositoryImpl$fetchChaloTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRepositoryImpl$fetchChaloTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            chaloTimeRepositoryImpl$fetchChaloTime$1.label = 1;
            objD = this.f2658a.d(chaloTimeRequestConfig, chaloTimeRepositoryImpl$fetchChaloTime$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        ChaloTimeResponseApiModel chaloTimeResponseApiModel = (ChaloTimeResponseApiModel) objD;
        Intrinsics.i(chaloTimeResponseApiModel, "<this>");
        ChaloTimeDataResponseApiModel chaloTimeDataResponseApiModel = chaloTimeResponseApiModel.f2672a;
        ChaloTimeResponseAppModel chaloTimeResponseAppModel = (chaloTimeDataResponseApiModel == null || (l = chaloTimeDataResponseApiModel.f2670a) == null) ? null : new ChaloTimeResponseAppModel(l.longValue());
        if (chaloTimeResponseAppModel != null) {
            return chaloTimeResponseAppModel;
        }
        throw new NetworkSuccessResponseParseException("Invalid response");
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object e(ContinuationImpl continuationImpl) {
        return this.b.f();
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object f(ContinuationImpl continuationImpl) {
        return this.b.g();
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object g(ContinuationImpl continuationImpl) {
        return this.b.d();
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object h(Continuation continuation) {
        return this.b.e();
    }

    @Override // app.chalo.features.chalotime.data.ChaloTimeRepository
    public final Object i(Continuation continuation) {
        return this.b.h();
    }
}

package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult;
import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetEtaForRouteStopIdRequestApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.GetEtaForRouteStopIdResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.remote.LiveTrackingRemoteDataSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/PollEtaForStopIdUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PollEtaForStopIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveTrackingRemoteDataSource f4330a;
    public final CrashlyticsLogger b;

    public PollEtaForStopIdUseCase(LiveTrackingRemoteDataSource liveTrackingRemoteDataSource, CrashlyticsLogger crashlyticsLogger) {
        this.f4330a = liveTrackingRemoteDataSource;
        this.b = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PollEtaForStopIdUseCase$invoke$1 pollEtaForStopIdUseCase$invoke$1;
        if (continuationImpl instanceof PollEtaForStopIdUseCase$invoke$1) {
            pollEtaForStopIdUseCase$invoke$1 = (PollEtaForStopIdUseCase$invoke$1) continuationImpl;
            int i = pollEtaForStopIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pollEtaForStopIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                pollEtaForStopIdUseCase$invoke$1 = new PollEtaForStopIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            pollEtaForStopIdUseCase$invoke$1 = new PollEtaForStopIdUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = pollEtaForStopIdUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pollEtaForStopIdUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                LiveTrackingRemoteDataSource liveTrackingRemoteDataSource = this.f4330a;
                GetEtaForRouteStopIdRequestApiModel getEtaForRouteStopIdRequestApiModel = new GetEtaForRouteStopIdRequestApiModel(CollectionsKt.R(str2 + ":" + str));
                pollEtaForStopIdUseCase$invoke$1.L$0 = str;
                pollEtaForStopIdUseCase$invoke$1.L$1 = str2;
                pollEtaForStopIdUseCase$invoke$1.L$2 = str3;
                pollEtaForStopIdUseCase$invoke$1.label = 1;
                objA = liveTrackingRemoteDataSource.a(getEtaForRouteStopIdRequestApiModel, pollEtaForStopIdUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) pollEtaForStopIdUseCase$invoke$1.L$2;
                str2 = (String) pollEtaForStopIdUseCase$invoke$1.L$1;
                str = (String) pollEtaForStopIdUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            }
            LinkedHashMap linkedHashMapA = PollEtaForStopIdUseCaseKt.a(((GetEtaForRouteStopIdResponseApiModel) objA).f4282a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMapA.entrySet()) {
                StopRouteId stopRouteId = (StopRouteId) entry.getKey();
                if (Intrinsics.d(stopRouteId.b, str) && Intrinsics.d(stopRouteId.f4267a, str2)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List list = (List) linkedHashMap.get(new StopRouteId(str2, str));
            if (list == null) {
                return new LiveTrackingDataManagerStopEtaResult.Error();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.d(((RealtimeSocketEtaResponseAppModel) obj).c, str3)) {
                    arrayList.add(obj);
                }
            }
            return new LiveTrackingDataManagerStopEtaResult.Success(arrayList);
        } catch (Exception e) {
            this.b.i(e);
            return new LiveTrackingDataManagerStopEtaResult.Error();
        }
    }
}

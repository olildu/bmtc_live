package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/GetDelayedEtaThresholdForLiveTrackingUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetDelayedEtaThresholdForLiveTrackingUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f4325a;
    public final CityProvider b;

    public GetDelayedEtaThresholdForLiveTrackingUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f4325a = chaloConfigFeature;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetDelayedEtaThresholdForLiveTrackingUseCase$invoke$1 getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1;
        if (continuationImpl instanceof GetDelayedEtaThresholdForLiveTrackingUseCase$invoke$1) {
            getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1 = (GetDelayedEtaThresholdForLiveTrackingUseCase$invoke$1) continuationImpl;
            int i = getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1 = new GetDelayedEtaThresholdForLiveTrackingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1 = new GetDelayedEtaThresholdForLiveTrackingUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1.label = 1;
            objA = this.f4325a.a("delayThreshold", getDelayedEtaThresholdForLiveTrackingUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str = (String) objA;
        String strB = CityProviderKt.b(this.b);
        long jLongValue = 2;
        if (strB == null) {
            return new Long(2L);
        }
        try {
            Json json = ChaloJson.b;
            json.getClass();
            Long l = (Long) ((ThresholdDetails) json.b(str, ThresholdDetails.INSTANCE.serializer())).f4334a.get(strB);
            if (l != null) {
                jLongValue = l.longValue();
            }
        } catch (Exception unused) {
        }
        return new Long(jLongValue);
    }
}

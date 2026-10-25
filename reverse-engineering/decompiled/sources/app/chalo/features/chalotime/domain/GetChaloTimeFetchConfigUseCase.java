package app.chalo.features.chalotime.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.data.model.config.ChaloTimeConfig;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/domain/GetChaloTimeFetchConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloTimeFetchConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2680a;
    public final CrashlyticsLogger b;

    public GetChaloTimeFetchConfigUseCase(ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger) {
        this.f2680a = chaloConfigFeature;
        this.b = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetChaloTimeFetchConfigUseCase$invoke$1 getChaloTimeFetchConfigUseCase$invoke$1;
        if (continuationImpl instanceof GetChaloTimeFetchConfigUseCase$invoke$1) {
            getChaloTimeFetchConfigUseCase$invoke$1 = (GetChaloTimeFetchConfigUseCase$invoke$1) continuationImpl;
            int i = getChaloTimeFetchConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChaloTimeFetchConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getChaloTimeFetchConfigUseCase$invoke$1 = new GetChaloTimeFetchConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getChaloTimeFetchConfigUseCase$invoke$1 = new GetChaloTimeFetchConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getChaloTimeFetchConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getChaloTimeFetchConfigUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                ChaloConfigFeature chaloConfigFeature = this.f2680a;
                getChaloTimeFetchConfigUseCase$invoke$1.label = 1;
                objA = chaloConfigFeature.a("chaloTimeConfig", getChaloTimeFetchConfigUseCase$invoke$1);
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
            if (str.length() == 0) {
                return new ChaloTimeConfig();
            }
            Json json = ChaloJson.b;
            json.getClass();
            return json.b(str, ChaloTimeConfig.INSTANCE.serializer());
        } catch (Exception e) {
            this.b.i(e);
            return new ChaloTimeConfig();
        }
    }
}

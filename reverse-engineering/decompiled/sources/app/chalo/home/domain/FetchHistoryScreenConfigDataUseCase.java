package app.chalo.home.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchHistoryScreenConfigDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchHistoryScreenConfigDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2993a;
    public final CoroutineContextProvider b;
    public final CrashlyticsLogger c;
    public final ChaloBuildConfig d;
    public final CityProvider e;
    public final BasicInfoContract f;

    public FetchHistoryScreenConfigDataUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider) {
        this.f2993a = chaloConfigFeature;
        this.b = coroutineContextProvider;
        this.c = crashlyticsLogger;
        this.d = chaloBuildConfig;
        this.e = cityProvider;
        this.f = basicInfoContract;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.b.getDefault(), new FetchHistoryScreenConfigDataUseCase$invoke$2(this, null), continuationImpl);
    }
}

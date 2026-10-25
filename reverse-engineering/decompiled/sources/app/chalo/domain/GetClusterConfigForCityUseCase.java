package app.chalo.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.CoroutineContextProvider;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetClusterConfigForCityUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetClusterConfigForCityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2493a;
    public final BasicInfoContract b;
    public final ChaloBuildConfig c;
    public final CoroutineContextProvider d;
    public final CrashlyticsLogger e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final MutexImpl g = MutexKt.a();

    public GetClusterConfigForCityUseCase(ChaloConfigFeature chaloConfigFeature, BasicInfoContract basicInfoContract, ChaloBuildConfig chaloBuildConfig, CoroutineContextProvider coroutineContextProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f2493a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = chaloBuildConfig;
        this.d = coroutineContextProvider;
        this.e = crashlyticsLogger;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return BuildersKt.g(this.d.getDefault(), new GetClusterConfigForCityUseCase$invoke$2(this, lowerCase, null), continuationImpl);
    }
}

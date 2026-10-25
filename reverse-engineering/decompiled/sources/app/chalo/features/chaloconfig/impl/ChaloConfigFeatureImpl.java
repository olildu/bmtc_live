package app.chalo.features.chaloconfig.impl;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.features.chaloconfig.ChaloConfigStatus;
import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/impl/ChaloConfigFeatureImpl;", "Lapp/chalo/features/chaloconfig/ChaloConfigFeature;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigFeatureImpl implements ChaloConfigFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigCacheManager f2656a;
    public final ChaloConfigRepository b;
    public final LanguageFeature c;
    public final MutableStateFlow d = StateFlowKt.a(new ChaloConfigStatus(ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN, ChaloConfigFetchStatus.FETCHING_NOT_STARTED));

    public ChaloConfigFeatureImpl(ChaloConfigCacheManager chaloConfigCacheManager, ChaloConfigRepository chaloConfigRepository, LanguageFeature languageFeature, CoroutineContextProvider coroutineContextProvider) {
        this.f2656a = chaloConfigCacheManager;
        this.b = chaloConfigRepository;
        this.c = languageFeature;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        BuildersKt.d(contextScopeA, null, null, new ChaloConfigFeatureImpl$manageMigration$1(this, null), 3);
        BuildersKt.d(contextScopeA, null, null, new ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1(this, null), 3);
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final Object a(String str, Continuation continuation) {
        Language language = (Language) this.c.getE().getValue();
        if (language == null) {
            language = Language.ENGLISH;
        }
        return this.b.f(language, str, continuation);
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final StateFlow b() {
        return FlowKt.c(this.d);
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final StateFlow c() {
        return this.f2656a.i;
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final void d() {
        ChaloConfigCacheManager chaloConfigCacheManager = this.f2656a;
        BuildersKt.d(chaloConfigCacheManager.k, null, null, new ChaloConfigCacheManager$refreshCache$1(chaloConfigCacheManager, true, null), 3);
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final Object e(String str, ContinuationImpl continuationImpl) {
        Language language = (Language) this.c.getE().getValue();
        if (language == null) {
            language = Language.ENGLISH;
        }
        return this.b.h(language, str, continuationImpl);
    }

    @Override // app.chalo.features.chaloconfig.ChaloConfigFeature
    public final Object f(Continuation continuation) {
        Language language = (Language) this.c.getE().getValue();
        if (language == null) {
            language = Language.ENGLISH;
        }
        return this.b.m(language, "lazyPayVisibility", (ContinuationImpl) continuation);
    }
}

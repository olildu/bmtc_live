package app.chalo.home.ui.base;

import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/NoOpLanguageFeature;", "Lapp/chalo/features/language/LanguageFeature;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NoOpLanguageFeature implements LanguageFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MutableStateFlow f3231a = StateFlowKt.a(null);

    @Override // app.chalo.features.language.LanguageFeature
    public final Flow a() {
        return StateFlowKt.a(Boolean.FALSE);
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Flow b() {
        return StateFlowKt.a(Boolean.FALSE);
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object c(Language language, Continuation continuation) {
        return Unit.f17538a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object d(Continuation continuation) {
        return EmptyList.f17557a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object e(Language language, ContinuationImpl continuationImpl) {
        return language.getLocale();
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object f(ContinuationImpl continuationImpl) {
        return Unit.f17538a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object g(Continuation continuation) {
        return Unit.f17538a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    /* JADX INFO: renamed from: h */
    public final StateFlow getE() {
        return f3231a;
    }
}

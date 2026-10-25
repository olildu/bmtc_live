package app.chalo.behaviour.policy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveLanguagePolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ResolvedLanguagePolicy, LanguagePolicyOverride, ResolvedLanguagePolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveLanguagePolicyUseCase$invoke$3$1 f1047a = new ResolveLanguagePolicyUseCase$invoke$3$1();

    public ResolveLanguagePolicyUseCase$invoke$3$1() {
        super(2, LanguagePolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ResolvedLanguagePolicy;Lapp/chalo/behaviour/policy/LanguagePolicyOverride;)Lapp/chalo/behaviour/policy/ResolvedLanguagePolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ResolvedLanguagePolicy p0 = (ResolvedLanguagePolicy) obj;
        LanguagePolicyOverride languagePolicyOverride = (LanguagePolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (languagePolicyOverride == null) {
            return p0;
        }
        List supportedLanguages = languagePolicyOverride.f1006a;
        if (supportedLanguages == null) {
            supportedLanguages = p0.f1071a;
        }
        Intrinsics.i(supportedLanguages, "supportedLanguages");
        return new ResolvedLanguagePolicy(supportedLanguages);
    }
}

package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveSplashPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ResolvedSplashPolicy, SplashPolicyOverride, ResolvedSplashPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveSplashPolicyUseCase$invoke$3$1 f1062a = new ResolveSplashPolicyUseCase$invoke$3$1();

    public ResolveSplashPolicyUseCase$invoke$3$1() {
        super(2, SplashPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ResolvedSplashPolicy;Lapp/chalo/behaviour/policy/SplashPolicyOverride;)Lapp/chalo/behaviour/policy/ResolvedSplashPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ResolvedSplashPolicy p0 = (ResolvedSplashPolicy) obj;
        SplashPolicyOverride splashPolicyOverride = (SplashPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (splashPolicyOverride == null) {
            return p0;
        }
        Boolean bool = splashPolicyOverride.f1081a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : p0.f1074a;
        OnBoardingStartScreen onBoardingStartScreen = splashPolicyOverride.b;
        if (onBoardingStartScreen == null) {
            onBoardingStartScreen = p0.b;
        }
        Intrinsics.i(onBoardingStartScreen, "onBoardingStartScreen");
        return new ResolvedSplashPolicy(zBooleanValue, onBoardingStartScreen);
    }
}

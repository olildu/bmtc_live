package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveWalletPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<WalletPolicy, WalletPolicyOverride, WalletPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveWalletPolicyUseCase$invoke$3$1 f1068a = new ResolveWalletPolicyUseCase$invoke$3$1();

    public ResolveWalletPolicyUseCase$invoke$3$1() {
        super(2, WalletPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/WalletPolicy;Lapp/chalo/behaviour/policy/WalletPolicyOverride;)Lapp/chalo/behaviour/policy/WalletPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WalletPolicy p0 = (WalletPolicy) obj;
        WalletPolicyOverride walletPolicyOverride = (WalletPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (walletPolicyOverride == null) {
            return p0;
        }
        Boolean bool = walletPolicyOverride.f1090a;
        return new WalletPolicy(bool != null ? bool.booleanValue() : p0.f1089a);
    }
}

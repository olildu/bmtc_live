package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveLocationPermissionPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<LocationPermissionPolicy, LocationPermissionPolicyOverride, LocationPermissionPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveLocationPermissionPolicyUseCase$invoke$3$1 f1050a = new ResolveLocationPermissionPolicyUseCase$invoke$3$1();

    public ResolveLocationPermissionPolicyUseCase$invoke$3$1() {
        super(2, LocationPermissionPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/LocationPermissionPolicy;Lapp/chalo/behaviour/policy/LocationPermissionPolicyOverride;)Lapp/chalo/behaviour/policy/LocationPermissionPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LocationPermissionPolicy p0 = (LocationPermissionPolicy) obj;
        LocationPermissionPolicyOverride locationPermissionPolicyOverride = (LocationPermissionPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (locationPermissionPolicyOverride == null) {
            return p0;
        }
        Boolean bool = locationPermissionPolicyOverride.f1009a;
        return new LocationPermissionPolicy(bool != null ? bool.booleanValue() : p0.f1008a);
    }
}

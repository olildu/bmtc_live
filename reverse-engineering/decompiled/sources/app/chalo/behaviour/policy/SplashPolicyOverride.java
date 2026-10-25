package app.chalo.behaviour.policy;

import defpackage.ra1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/SplashPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SplashPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1081a;
    public final OnBoardingStartScreen b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/SplashPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/SplashPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SplashPolicyOverride> serializer() {
            return SplashPolicyOverride$$serializer.f1082a;
        }
    }

    public /* synthetic */ SplashPolicyOverride(int i, Boolean bool, OnBoardingStartScreen onBoardingStartScreen) {
        if ((i & 1) == 0) {
            this.f1081a = null;
        } else {
            this.f1081a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = onBoardingStartScreen;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashPolicyOverride)) {
            return false;
        }
        SplashPolicyOverride splashPolicyOverride = (SplashPolicyOverride) obj;
        return Intrinsics.d(this.f1081a, splashPolicyOverride.f1081a) && this.b == splashPolicyOverride.b;
    }

    public final int hashCode() {
        Boolean bool = this.f1081a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OnBoardingStartScreen onBoardingStartScreen = this.b;
        return iHashCode + (onBoardingStartScreen != null ? onBoardingStartScreen.hashCode() : 0);
    }

    public final String toString() {
        return "SplashPolicyOverride(disableAppOpenSplashAnimation=" + this.f1081a + ", onBoardingStartScreen=" + this.b + ")";
    }

    public SplashPolicyOverride(OnBoardingStartScreen onBoardingStartScreen) {
        this.f1081a = Boolean.TRUE;
        this.b = onBoardingStartScreen;
    }
}

package app.chalo.behaviour.policy;

import defpackage.b3;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ProfilePolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfilePolicy {
    public static final ProfilePolicy h = new ProfilePolicy(true, true, false, false, true, "1f9mk", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1029a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ProfilePolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProfilePolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        this.f1029a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePolicy)) {
            return false;
        }
        ProfilePolicy profilePolicy = (ProfilePolicy) obj;
        return this.f1029a == profilePolicy.f1029a && this.b == profilePolicy.b && this.c == profilePolicy.c && this.d == profilePolicy.d && this.e == profilePolicy.e && Intrinsics.d(this.f, profilePolicy.f) && this.g == profilePolicy.g;
    }

    public final int hashCode() {
        return nf1.e((((((((((this.f1029a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("ProfilePolicy(showProfileCompletionNudges=", ", enableAbExperimentsForProfileCompletionHooks=", ", collectNameAlongWithDobInMinProfileUpdate=", this.f1029a, this.b);
        z40.r(sbR, this.c, ", showProfilePhotoStepInMinProfileUpdate=", this.d, ", enableTruecallerLogin=");
        pk0.x(", otpTemplateId=", this.f, ", showOtherGenderOption=", sbR, this.e);
        return b3.g(")", sbR, this.g);
    }
}

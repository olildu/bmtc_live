package app.chalo.behaviour.policy;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/ProfilePolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProfilePolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1030a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final String f;
    public final Boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/ProfilePolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/ProfilePolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProfilePolicyOverride> serializer() {
            return ProfilePolicyOverride$$serializer.f1031a;
        }
    }

    public ProfilePolicyOverride() {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        this.f1030a = bool;
        this.b = bool;
        this.c = bool2;
        this.d = bool2;
        this.e = bool;
        this.f = "5jdox";
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePolicyOverride)) {
            return false;
        }
        ProfilePolicyOverride profilePolicyOverride = (ProfilePolicyOverride) obj;
        return Intrinsics.d(this.f1030a, profilePolicyOverride.f1030a) && Intrinsics.d(this.b, profilePolicyOverride.b) && Intrinsics.d(this.c, profilePolicyOverride.c) && Intrinsics.d(this.d, profilePolicyOverride.d) && Intrinsics.d(this.e, profilePolicyOverride.e) && Intrinsics.d(this.f, profilePolicyOverride.f) && Intrinsics.d(this.g, profilePolicyOverride.g);
    }

    public final int hashCode() {
        Boolean bool = this.f1030a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool6 = this.g;
        return iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePolicyOverride(showProfileCompletionNudges=");
        sb.append(this.f1030a);
        sb.append(", enableAbExperimentsForProfileCompletionHooks=");
        sb.append(this.b);
        sb.append(", collectNameAlongWithDobInMinProfileUpdate=");
        hq0.u(sb, this.c, ", showProfilePhotoStepInMinProfileUpdate=", this.d, ", enableTruecallerLogin=");
        hq0.t(this.e, ", otpTemplateId=", this.f, ", showOtherGenderOption=", sb);
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ProfilePolicyOverride(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, Boolean bool6) {
        if ((i & 1) == 0) {
            this.f1030a = null;
        } else {
            this.f1030a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool6;
        }
    }
}

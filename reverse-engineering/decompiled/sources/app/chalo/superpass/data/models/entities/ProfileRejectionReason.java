package app.chalo.superpass.data.models.entities;

import defpackage.nf1;
import defpackage.ox0;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/ProfileRejectionReason;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProfileRejectionReason {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RejectionStatus f9552a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/ProfileRejectionReason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/ProfileRejectionReason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProfileRejectionReason> serializer() {
            return ProfileRejectionReason$$serializer.f9553a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ox0(22)), null, LazyKt.a(lazyThreadSafetyMode, new ox0(23))};
    }

    public /* synthetic */ ProfileRejectionReason(int i, RejectionStatus rejectionStatus, String str, List list) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.b(ProfileRejectionReason$$serializer.f9553a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f9552a = RejectionStatus.VALID;
        } else {
            this.f9552a = rejectionStatus;
        }
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRejectionReason)) {
            return false;
        }
        ProfileRejectionReason profileRejectionReason = (ProfileRejectionReason) obj;
        return this.f9552a == profileRejectionReason.f9552a && Intrinsics.d(this.b, profileRejectionReason.b) && Intrinsics.d(this.c, profileRejectionReason.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f9552a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileRejectionReason(status=");
        sb.append(this.f9552a);
        sb.append(", proofId=");
        sb.append(this.b);
        sb.append(", reasonsList=");
        return xs.l(sb, this.c, ")");
    }

    public ProfileRejectionReason(RejectionStatus status, String proofId, ArrayList arrayList) {
        Intrinsics.i(status, "status");
        Intrinsics.i(proofId, "proofId");
        this.f9552a = status;
        this.b = proofId;
        this.c = arrayList;
    }
}

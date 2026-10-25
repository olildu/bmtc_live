package app.chalo.superpass.data.models.entities;

import defpackage.ox0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/ProofRejectionReason;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class ProofRejectionReason {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RejectionStatus f9554a;
    public final String b;
    public final String c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/ProofRejectionReason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/ProofRejectionReason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProofRejectionReason> serializer() {
            return ProofRejectionReason$$serializer.f9555a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ox0(27)), null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(28))};
    }

    public /* synthetic */ ProofRejectionReason(int i, RejectionStatus rejectionStatus, String str, String str2, List list) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.b(ProofRejectionReason$$serializer.f9555a.getDescriptor(), i, 14);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f9554a = RejectionStatus.VALID;
        } else {
            this.f9554a = rejectionStatus;
        }
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public ProofRejectionReason(RejectionStatus status, String proofId, String lProofUrl, ArrayList arrayList) {
        Intrinsics.i(status, "status");
        Intrinsics.i(proofId, "proofId");
        Intrinsics.i(lProofUrl, "lProofUrl");
        this.f9554a = status;
        this.b = proofId;
        this.c = lProofUrl;
        this.d = arrayList;
    }
}

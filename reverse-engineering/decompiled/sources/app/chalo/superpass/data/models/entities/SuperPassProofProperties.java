package app.chalo.superpass.data.models.entities;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassProofProperties;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProofProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9567a;
    public final String b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassProofProperties$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassProofProperties;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "PROOF_EXPIRY_TIME_NOT_AVAILABLE", "J", "PROOF_VALID_FOREVER", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProofProperties> serializer() {
            return SuperPassProofProperties$$serializer.f9568a;
        }
    }

    public /* synthetic */ SuperPassProofProperties(long j, String str, String str2, int i) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(SuperPassProofProperties$$serializer.f9568a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9567a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofProperties)) {
            return false;
        }
        SuperPassProofProperties superPassProofProperties = (SuperPassProofProperties) obj;
        return Intrinsics.d(this.f9567a, superPassProofProperties.f9567a) && Intrinsics.d(this.b, superPassProofProperties.b) && this.c == superPassProofProperties.c;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f9567a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return uf0.m(this.c, ")", dd.e("SuperPassProofProperties(proofName=", this.f9567a, ", proofUrl=", this.b, ", proofExpiryTime="));
    }

    public SuperPassProofProperties(String proofName, String proofUrl, long j) {
        Intrinsics.i(proofName, "proofName");
        Intrinsics.i(proofUrl, "proofUrl");
        this.f9567a = proofName;
        this.b = proofUrl;
        this.c = j;
    }
}

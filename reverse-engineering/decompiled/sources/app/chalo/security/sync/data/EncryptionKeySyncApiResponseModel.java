package app.chalo.security.sync.data;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiResponseModel;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EncryptionKeySyncApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9388a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/data/EncryptionKeySyncApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EncryptionKeySyncApiResponseModel> serializer() {
            return EncryptionKeySyncApiResponseModel$$serializer.f9389a;
        }
    }

    public /* synthetic */ EncryptionKeySyncApiResponseModel(int i, String str) {
        if (1 == (i & 1)) {
            this.f9388a = str;
        } else {
            PluginExceptionsKt.b(EncryptionKeySyncApiResponseModel$$serializer.f9389a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EncryptionKeySyncApiResponseModel) && Intrinsics.d(this.f9388a, ((EncryptionKeySyncApiResponseModel) obj).f9388a);
    }

    public final int hashCode() {
        return this.f9388a.hashCode();
    }

    public final String toString() {
        return vo1.B("EncryptionKeySyncApiResponseModel(data=", this.f9388a, ")");
    }
}

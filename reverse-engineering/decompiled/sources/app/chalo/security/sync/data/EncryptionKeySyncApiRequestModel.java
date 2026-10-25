package app.chalo.security.sync.data;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiRequestModel;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EncryptionKeySyncApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9386a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/data/EncryptionKeySyncApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/data/EncryptionKeySyncApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EncryptionKeySyncApiRequestModel> serializer() {
            return EncryptionKeySyncApiRequestModel$$serializer.f9387a;
        }
    }

    public /* synthetic */ EncryptionKeySyncApiRequestModel(int i, String str) {
        if (1 == (i & 1)) {
            this.f9386a = str;
        } else {
            PluginExceptionsKt.b(EncryptionKeySyncApiRequestModel$$serializer.f9387a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EncryptionKeySyncApiRequestModel) && Intrinsics.d(this.f9386a, ((EncryptionKeySyncApiRequestModel) obj).f9386a);
    }

    public final int hashCode() {
        return this.f9386a.hashCode();
    }

    public final String toString() {
        return vo1.B("EncryptionKeySyncApiRequestModel(data=", this.f9386a, ")");
    }

    public EncryptionKeySyncApiRequestModel(String data) {
        Intrinsics.i(data, "data");
        this.f9386a = data;
    }
}

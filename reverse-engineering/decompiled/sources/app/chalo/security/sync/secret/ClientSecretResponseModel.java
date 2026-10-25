package app.chalo.security.sync.secret;

import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/secret/ClientSecretResponseModel;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClientSecretResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9393a;
    public final int b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/secret/ClientSecretResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/secret/ClientSecretResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClientSecretResponseModel> serializer() {
            return ClientSecretResponseModel$$serializer.f9394a;
        }
    }

    public /* synthetic */ ClientSecretResponseModel(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ClientSecretResponseModel$$serializer.f9394a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9393a = str;
        this.b = i2;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientSecretResponseModel)) {
            return false;
        }
        ClientSecretResponseModel clientSecretResponseModel = (ClientSecretResponseModel) obj;
        return Intrinsics.d(this.f9393a, clientSecretResponseModel.f9393a) && this.b == clientSecretResponseModel.b && Intrinsics.d(this.c, clientSecretResponseModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f9393a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        return vo1.p(xs.m(this.b, "ClientSecretResponseModel(publicKey=", this.f9393a, ", keyLength=", ", status="), this.c, ")");
    }
}

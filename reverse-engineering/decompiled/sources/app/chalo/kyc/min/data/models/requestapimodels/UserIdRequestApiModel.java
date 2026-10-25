package app.chalo.kyc.min.data.models.requestapimodels;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/data/models/requestapimodels/UserIdRequestApiModel;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserIdRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4106a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/data/models/requestapimodels/UserIdRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/data/models/requestapimodels/UserIdRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserIdRequestApiModel> serializer() {
            return UserIdRequestApiModel$$serializer.f4107a;
        }
    }

    public /* synthetic */ UserIdRequestApiModel(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(UserIdRequestApiModel$$serializer.f4107a.getDescriptor(), i, 3);
            throw null;
        }
        this.f4106a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserIdRequestApiModel)) {
            return false;
        }
        UserIdRequestApiModel userIdRequestApiModel = (UserIdRequestApiModel) obj;
        return Intrinsics.d(this.f4106a, userIdRequestApiModel.f4106a) && this.b == userIdRequestApiModel.b;
    }

    public final int hashCode() {
        return (this.f4106a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("UserIdRequestApiModel(userId=", this.f4106a, ", isResendOtp=", ")", this.b);
    }

    public UserIdRequestApiModel(String str, boolean z) {
        this.f4106a = str;
        this.b = z;
    }
}

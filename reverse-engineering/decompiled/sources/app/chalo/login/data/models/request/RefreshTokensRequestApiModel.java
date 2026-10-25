package app.chalo.login.data.models.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/request/RefreshTokensRequestApiModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RefreshTokensRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5207a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/request/RefreshTokensRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/request/RefreshTokensRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RefreshTokensRequestApiModel> serializer() {
            return RefreshTokensRequestApiModel$$serializer.f5208a;
        }
    }

    public /* synthetic */ RefreshTokensRequestApiModel(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RefreshTokensRequestApiModel$$serializer.f5208a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5207a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshTokensRequestApiModel)) {
            return false;
        }
        RefreshTokensRequestApiModel refreshTokensRequestApiModel = (RefreshTokensRequestApiModel) obj;
        return Intrinsics.d(this.f5207a, refreshTokensRequestApiModel.f5207a) && Intrinsics.d(this.b, refreshTokensRequestApiModel.b) && Intrinsics.d(this.c, refreshTokensRequestApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5207a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("RefreshTokensRequestApiModel(refreshToken=", this.f5207a, ", userId=", this.b, ", deviceId="), this.c, ")");
    }

    public RefreshTokensRequestApiModel(String refreshToken, String userId, String deviceId) {
        Intrinsics.i(refreshToken, "refreshToken");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(deviceId, "deviceId");
        this.f5207a = refreshToken;
        this.b = userId;
        this.c = deviceId;
    }
}

package app.chalo.login.data.models.response;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/response/PostLoginAuthTokensResponseModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PostLoginAuthTokensResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5215a;
    public final String b;
    public final Boolean c;
    public final UserProfileResponseModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/response/PostLoginAuthTokensResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/response/PostLoginAuthTokensResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PostLoginAuthTokensResponseModel> serializer() {
            return PostLoginAuthTokensResponseModel$$serializer.f5216a;
        }
    }

    public /* synthetic */ PostLoginAuthTokensResponseModel(int i, String str, String str2, Boolean bool, UserProfileResponseModel userProfileResponseModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PostLoginAuthTokensResponseModel$$serializer.f5216a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5215a = str;
        this.b = str2;
        this.c = bool;
        this.d = userProfileResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostLoginAuthTokensResponseModel)) {
            return false;
        }
        PostLoginAuthTokensResponseModel postLoginAuthTokensResponseModel = (PostLoginAuthTokensResponseModel) obj;
        return Intrinsics.d(this.f5215a, postLoginAuthTokensResponseModel.f5215a) && Intrinsics.d(this.b, postLoginAuthTokensResponseModel.b) && Intrinsics.d(this.c, postLoginAuthTokensResponseModel.c) && Intrinsics.d(this.d, postLoginAuthTokensResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f5215a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserProfileResponseModel userProfileResponseModel = this.d;
        return iHashCode3 + (userProfileResponseModel != null ? userProfileResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PostLoginAuthTokensResponseModel(accessToken=", this.f5215a, ", refreshToken=", this.b, ", status=");
        sbE.append(this.c);
        sbE.append(", userProfile=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}

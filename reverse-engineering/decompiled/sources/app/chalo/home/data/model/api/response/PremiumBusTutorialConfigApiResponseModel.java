package app.chalo.home.data.model.api.response;

import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/response/PremiumBusTutorialConfigApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusTutorialConfigApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2938a;
    public final Long b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/response/PremiumBusTutorialConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/response/PremiumBusTutorialConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusTutorialConfigApiResponseModel> serializer() {
            return PremiumBusTutorialConfigApiResponseModel$$serializer.f2939a;
        }
    }

    public /* synthetic */ PremiumBusTutorialConfigApiResponseModel(int i, Long l, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PremiumBusTutorialConfigApiResponseModel$$serializer.f2939a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2938a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTutorialConfigApiResponseModel)) {
            return false;
        }
        PremiumBusTutorialConfigApiResponseModel premiumBusTutorialConfigApiResponseModel = (PremiumBusTutorialConfigApiResponseModel) obj;
        return Intrinsics.d(this.f2938a, premiumBusTutorialConfigApiResponseModel.f2938a) && Intrinsics.d(this.b, premiumBusTutorialConfigApiResponseModel.b) && Intrinsics.d(this.c, premiumBusTutorialConfigApiResponseModel.c) && Intrinsics.d(this.d, premiumBusTutorialConfigApiResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f2938a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusTutorialConfigApiResponseModel(videoUrl=");
        sb.append(this.f2938a);
        sb.append(", timeStamp=");
        sb.append(this.b);
        sb.append(", title=");
        return r30.i(sb, this.c, ", thumbnailUrl=", this.d, ")");
    }
}

package app.chalo.home.data.model.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/response/BannerDataResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BannerDataResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2918a;
    public final BannerMetaApiModel b;
    public final BannerUiDataApiModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/response/BannerDataResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/response/BannerDataResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerDataResponseApiModel> serializer() {
            return BannerDataResponseApiModel$$serializer.f2919a;
        }
    }

    public /* synthetic */ BannerDataResponseApiModel(int i, String str, BannerMetaApiModel bannerMetaApiModel, BannerUiDataApiModel bannerUiDataApiModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(BannerDataResponseApiModel$$serializer.f2919a.getDescriptor(), i, 7);
            throw null;
        }
        this.f2918a = str;
        this.b = bannerMetaApiModel;
        this.c = bannerUiDataApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDataResponseApiModel)) {
            return false;
        }
        BannerDataResponseApiModel bannerDataResponseApiModel = (BannerDataResponseApiModel) obj;
        return Intrinsics.d(this.f2918a, bannerDataResponseApiModel.f2918a) && Intrinsics.d(this.b, bannerDataResponseApiModel.b) && Intrinsics.d(this.c, bannerDataResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f2918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BannerMetaApiModel bannerMetaApiModel = this.b;
        int iHashCode2 = (iHashCode + (bannerMetaApiModel == null ? 0 : bannerMetaApiModel.hashCode())) * 31;
        BannerUiDataApiModel bannerUiDataApiModel = this.c;
        return iHashCode2 + (bannerUiDataApiModel != null ? bannerUiDataApiModel.hashCode() : 0);
    }

    public final String toString() {
        return "BannerDataResponseApiModel(bannerType=" + this.f2918a + ", bannerMeta=" + this.b + ", bannerUiData=" + this.c + ")";
    }
}

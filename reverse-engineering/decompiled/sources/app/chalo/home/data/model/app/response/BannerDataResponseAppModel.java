package app.chalo.home.data.model.app.response;

import defpackage.p7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerDataResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BannerDataResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerType f2951a;
    public final BannerMetaAppModel b;
    public final BannerUiDataAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerDataResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/BannerDataResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerDataResponseAppModel> serializer() {
            return BannerDataResponseAppModel$$serializer.f2952a;
        }
    }

    public /* synthetic */ BannerDataResponseAppModel(int i, BannerType bannerType, BannerMetaAppModel bannerMetaAppModel, BannerUiDataAppModel bannerUiDataAppModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(BannerDataResponseAppModel$$serializer.f2952a.getDescriptor(), i, 7);
            throw null;
        }
        this.f2951a = bannerType;
        this.b = bannerMetaAppModel;
        this.c = bannerUiDataAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDataResponseAppModel)) {
            return false;
        }
        BannerDataResponseAppModel bannerDataResponseAppModel = (BannerDataResponseAppModel) obj;
        return this.f2951a == bannerDataResponseAppModel.f2951a && Intrinsics.d(this.b, bannerDataResponseAppModel.b) && Intrinsics.d(this.c, bannerDataResponseAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2951a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BannerDataResponseAppModel(bannerType=" + this.f2951a + ", bannerMeta=" + this.b + ", bannerUiData=" + this.c + ")";
    }

    public BannerDataResponseAppModel(BannerType bannerType, BannerMetaAppModel bannerMetaAppModel, BannerUiDataAppModel bannerUiDataAppModel) {
        Intrinsics.i(bannerType, "bannerType");
        this.f2951a = bannerType;
        this.b = bannerMetaAppModel;
        this.c = bannerUiDataAppModel;
    }
}

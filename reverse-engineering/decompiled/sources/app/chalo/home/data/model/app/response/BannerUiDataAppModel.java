package app.chalo.home.data.model.app.response;

import app.chalo.home.data.mappers.BannerStatus;
import defpackage.dd;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerUiDataAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BannerUiDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2955a;
    public final String b;
    public final String c;
    public final BannerStatus d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerUiDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/BannerUiDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerUiDataAppModel> serializer() {
            return BannerUiDataAppModel$$serializer.f2956a;
        }
    }

    public /* synthetic */ BannerUiDataAppModel(int i, String str, String str2, String str3, BannerStatus bannerStatus) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(BannerUiDataAppModel$$serializer.f2956a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2955a = str;
        this.b = str2;
        this.c = str3;
        this.d = bannerStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BannerStatus getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF2955a() {
        return this.f2955a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerUiDataAppModel)) {
            return false;
        }
        BannerUiDataAppModel bannerUiDataAppModel = (BannerUiDataAppModel) obj;
        return Intrinsics.d(this.f2955a, bannerUiDataAppModel.f2955a) && Intrinsics.d(this.b, bannerUiDataAppModel.b) && Intrinsics.d(this.c, bannerUiDataAppModel.c) && this.d == bannerUiDataAppModel.d;
    }

    public final int hashCode() {
        String str = this.f2955a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BannerUiDataAppModel(bannerTitle=", this.f2955a, ", bannerSubText=", this.b, ", backgroundColor=");
        sbE.append(this.c);
        sbE.append(", bannerStatus=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public BannerUiDataAppModel(String str, String str2, String str3, BannerStatus bannerStatus) {
        Intrinsics.i(bannerStatus, "bannerStatus");
        this.f2955a = str;
        this.b = str2;
        this.c = str3;
        this.d = bannerStatus;
    }
}

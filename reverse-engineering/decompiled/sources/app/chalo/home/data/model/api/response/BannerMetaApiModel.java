package app.chalo.home.data.model.api.response;

import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.TripPreferencesApiResponseModel;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/response/BannerMetaApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BannerMetaApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2920a;
    public final Integer b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final TripPreferencesApiResponseModel f;
    public final String g;
    public final Boolean h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/response/BannerMetaApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/response/BannerMetaApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerMetaApiModel> serializer() {
            return BannerMetaApiModel$$serializer.f2921a;
        }
    }

    public /* synthetic */ BannerMetaApiModel(int i, Integer num, Integer num2, Boolean bool, String str, String str2, TripPreferencesApiResponseModel tripPreferencesApiResponseModel, String str3, Boolean bool2) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(BannerMetaApiModel$$serializer.f2921a.getDescriptor(), i, 255);
            throw null;
        }
        this.f2920a = num;
        this.b = num2;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = tripPreferencesApiResponseModel;
        this.g = str3;
        this.h = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerMetaApiModel)) {
            return false;
        }
        BannerMetaApiModel bannerMetaApiModel = (BannerMetaApiModel) obj;
        return Intrinsics.d(this.f2920a, bannerMetaApiModel.f2920a) && Intrinsics.d(this.b, bannerMetaApiModel.b) && Intrinsics.d(this.c, bannerMetaApiModel.c) && Intrinsics.d(this.d, bannerMetaApiModel.d) && Intrinsics.d(this.e, bannerMetaApiModel.e) && Intrinsics.d(this.f, bannerMetaApiModel.f) && Intrinsics.d(this.g, bannerMetaApiModel.g) && Intrinsics.d(this.h, bannerMetaApiModel.h);
    }

    public final int hashCode() {
        Integer num = this.f2920a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TripPreferencesApiResponseModel tripPreferencesApiResponseModel = this.f;
        int iHashCode6 = (iHashCode5 + (tripPreferencesApiResponseModel == null ? 0 : tripPreferencesApiResponseModel.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.h;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerMetaApiModel(rideApplicableForRollover=");
        sb.append(this.f2920a);
        sb.append(", passExpiringInDays=");
        sb.append(this.b);
        sb.append(", isExpired=");
        hq0.t(this.c, ", passId=", this.d, ", configId=", sb);
        sb.append(this.e);
        sb.append(", tripPreference=");
        sb.append(this.f);
        sb.append(", passTierType=");
        sb.append(this.g);
        sb.append(", isRollOverApplicableOnNewPass=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

package app.chalo.home.data.model.app.response;

import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import defpackage.hq0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerMetaAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BannerMetaAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2953a;
    public final Integer b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final SuperPassTripPreferences f;
    public final PassTierType g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerMetaAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/BannerMetaAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerMetaAppModel> serializer() {
            return BannerMetaAppModel$$serializer.f2954a;
        }
    }

    public /* synthetic */ BannerMetaAppModel(int i, Integer num, Integer num2, Boolean bool, String str, String str2, SuperPassTripPreferences superPassTripPreferences, PassTierType passTierType) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(BannerMetaAppModel$$serializer.f2954a.getDescriptor(), i, 127);
            throw null;
        }
        this.f2953a = num;
        this.b = num2;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = superPassTripPreferences;
        this.g = passTierType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerMetaAppModel)) {
            return false;
        }
        BannerMetaAppModel bannerMetaAppModel = (BannerMetaAppModel) obj;
        return Intrinsics.d(this.f2953a, bannerMetaAppModel.f2953a) && Intrinsics.d(this.b, bannerMetaAppModel.b) && Intrinsics.d(this.c, bannerMetaAppModel.c) && Intrinsics.d(this.d, bannerMetaAppModel.d) && Intrinsics.d(this.e, bannerMetaAppModel.e) && Intrinsics.d(this.f, bannerMetaAppModel.f) && this.g == bannerMetaAppModel.g;
    }

    public final int hashCode() {
        Integer num = this.f2953a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SuperPassTripPreferences superPassTripPreferences = this.f;
        return this.g.hashCode() + ((iHashCode5 + (superPassTripPreferences != null ? superPassTripPreferences.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerMetaAppModel(rideApplicableForRollover=");
        sb.append(this.f2953a);
        sb.append(", passExpiringInDays=");
        sb.append(this.b);
        sb.append(", isExpired=");
        hq0.t(this.c, ", passId=", this.d, ", configId=", sb);
        sb.append(this.e);
        sb.append(", tripPreference=");
        sb.append(this.f);
        sb.append(", passTierType=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public BannerMetaAppModel(Integer num, Integer num2, Boolean bool, String str, String str2, SuperPassTripPreferences superPassTripPreferences, PassTierType passTierType) {
        Intrinsics.i(passTierType, "passTierType");
        this.f2953a = num;
        this.b = num2;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = superPassTripPreferences;
        this.g = passTierType;
    }
}

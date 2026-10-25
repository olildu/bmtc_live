package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusUpsellSuggestionApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusUpsellSuggestionApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7054a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusUpsellSuggestionApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusUpsellSuggestionApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusUpsellSuggestionApiResponseModel> serializer() {
            return PremiumBusUpsellSuggestionApiResponseModel$$serializer.f7055a;
        }
    }

    public /* synthetic */ PremiumBusUpsellSuggestionApiResponseModel(int i, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.f7054a = null;
        } else {
            this.f7054a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusUpsellSuggestionApiResponseModel)) {
            return false;
        }
        PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel = (PremiumBusUpsellSuggestionApiResponseModel) obj;
        return Intrinsics.d(this.f7054a, premiumBusUpsellSuggestionApiResponseModel.f7054a) && Intrinsics.d(this.b, premiumBusUpsellSuggestionApiResponseModel.b) && Intrinsics.d(this.c, premiumBusUpsellSuggestionApiResponseModel.c) && Intrinsics.d(this.d, premiumBusUpsellSuggestionApiResponseModel.d) && Intrinsics.d(this.e, premiumBusUpsellSuggestionApiResponseModel.e) && Intrinsics.d(this.f, premiumBusUpsellSuggestionApiResponseModel.f) && Intrinsics.d(this.g, premiumBusUpsellSuggestionApiResponseModel.g) && Intrinsics.d(this.h, premiumBusUpsellSuggestionApiResponseModel.h);
    }

    public final int hashCode() {
        String str = this.f7054a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusUpsellSuggestionApiResponseModel(configId=");
        sb.append(this.f7054a);
        sb.append(", fmId=");
        sb.append(this.b);
        sb.append(", name=");
        cb0.t(sb, this.c, ", desc=", this.d, ", perRideFareBeforeCopy=");
        cb0.t(sb, this.e, ", perRideFareAfterCopy=", this.f, ", discountCopy=");
        return r30.i(sb, this.g, ", upsellImageUrl=", this.h, ")");
    }

    public PremiumBusUpsellSuggestionApiResponseModel(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7054a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }
}

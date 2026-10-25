package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationAdditionalInfoApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusProductModificationAdditionalInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7046a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationAdditionalInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationAdditionalInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusProductModificationAdditionalInfoApiResponseModel> serializer() {
            return PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a;
        }
    }

    public /* synthetic */ PremiumBusProductModificationAdditionalInfoApiResponseModel(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a.getDescriptor(), i, 63);
            throw null;
        }
        this.f7046a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductModificationAdditionalInfoApiResponseModel)) {
            return false;
        }
        PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel = (PremiumBusProductModificationAdditionalInfoApiResponseModel) obj;
        return Intrinsics.d(this.f7046a, premiumBusProductModificationAdditionalInfoApiResponseModel.f7046a) && Intrinsics.d(this.b, premiumBusProductModificationAdditionalInfoApiResponseModel.b) && Intrinsics.d(this.c, premiumBusProductModificationAdditionalInfoApiResponseModel.c) && Intrinsics.d(this.d, premiumBusProductModificationAdditionalInfoApiResponseModel.d) && Intrinsics.d(this.e, premiumBusProductModificationAdditionalInfoApiResponseModel.e) && Intrinsics.d(this.f, premiumBusProductModificationAdditionalInfoApiResponseModel.f);
    }

    public final int hashCode() {
        String str = this.f7046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusProductModificationAdditionalInfoApiResponseModel(actionHeader=", this.f7046a, ", text=", this.b, ", ctaText=");
        cb0.t(sbE, this.c, ", ctaActionType=", this.d, ", contactNumber=");
        return r30.i(sbE, this.e, ", actionConfirmationMessage=", this.f, ")");
    }
}

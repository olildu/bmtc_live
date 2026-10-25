package app.chalo.premiumbus.data.models.api.response;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationOptionApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusProductModificationOptionApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7048a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final PremiumBusProductModificationAdditionalInfoApiResponseModel i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationOptionApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationOptionApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusProductModificationOptionApiResponseModel> serializer() {
            return PremiumBusProductModificationOptionApiResponseModel$$serializer.f7049a;
        }
    }

    public /* synthetic */ PremiumBusProductModificationOptionApiResponseModel(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(PremiumBusProductModificationOptionApiResponseModel$$serializer.f7049a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f7048a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = premiumBusProductModificationAdditionalInfoApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductModificationOptionApiResponseModel)) {
            return false;
        }
        PremiumBusProductModificationOptionApiResponseModel premiumBusProductModificationOptionApiResponseModel = (PremiumBusProductModificationOptionApiResponseModel) obj;
        return Intrinsics.d(this.f7048a, premiumBusProductModificationOptionApiResponseModel.f7048a) && Intrinsics.d(this.b, premiumBusProductModificationOptionApiResponseModel.b) && Intrinsics.d(this.c, premiumBusProductModificationOptionApiResponseModel.c) && Intrinsics.d(this.d, premiumBusProductModificationOptionApiResponseModel.d) && Intrinsics.d(this.e, premiumBusProductModificationOptionApiResponseModel.e) && Intrinsics.d(this.f, premiumBusProductModificationOptionApiResponseModel.f) && Intrinsics.d(this.g, premiumBusProductModificationOptionApiResponseModel.g) && Intrinsics.d(this.h, premiumBusProductModificationOptionApiResponseModel.h) && Intrinsics.d(this.i, premiumBusProductModificationOptionApiResponseModel.i);
    }

    public final int hashCode() {
        String str = this.f7048a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel = this.i;
        return iHashCode8 + (premiumBusProductModificationAdditionalInfoApiResponseModel != null ? premiumBusProductModificationAdditionalInfoApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusProductModificationOptionApiResponseModel(actionId=", this.f7048a, ", actionName=", this.b, ", actionSubText=");
        cb0.t(sbE, this.c, ", actionIcon=", this.d, ", isActive=");
        hq0.t(this.e, ", inActiveReason=", this.f, ", contactNumber=", sbE);
        cb0.t(sbE, this.g, ", textColour=", this.h, ", additionalInfo=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }
}

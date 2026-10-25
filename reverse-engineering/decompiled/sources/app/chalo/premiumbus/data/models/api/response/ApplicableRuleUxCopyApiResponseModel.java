package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.s5;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleUxCopyApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ApplicableRuleUxCopyApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7016a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleUxCopyApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleUxCopyApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ApplicableRuleUxCopyApiResponseModel> serializer() {
            return ApplicableRuleUxCopyApiResponseModel$$serializer.f7017a;
        }
    }

    public /* synthetic */ ApplicableRuleUxCopyApiResponseModel(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(ApplicableRuleUxCopyApiResponseModel$$serializer.f7017a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7016a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicableRuleUxCopyApiResponseModel)) {
            return false;
        }
        ApplicableRuleUxCopyApiResponseModel applicableRuleUxCopyApiResponseModel = (ApplicableRuleUxCopyApiResponseModel) obj;
        return Intrinsics.d(this.f7016a, applicableRuleUxCopyApiResponseModel.f7016a) && Intrinsics.d(this.b, applicableRuleUxCopyApiResponseModel.b) && Intrinsics.d(this.c, applicableRuleUxCopyApiResponseModel.c) && Intrinsics.d(this.d, applicableRuleUxCopyApiResponseModel.d) && Intrinsics.d(this.e, applicableRuleUxCopyApiResponseModel.e);
    }

    public final int hashCode() {
        String str = this.f7016a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ApplicableRuleUxCopyApiResponseModel(location=", this.f7016a, ", copy=", this.b, ", couponName=");
        cb0.t(sbE, this.c, ", couponOfferCopy=", this.d, ", termsAndConditions=");
        return xs.l(sbE, this.e, ")");
    }

    public ApplicableRuleUxCopyApiResponseModel(String str, String str2, String str3, String str4, List list) {
        this.f7016a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }
}

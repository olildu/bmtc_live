package app.chalo.premiumbus.data.models.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusPassUpsellAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusPassUpsellAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7102a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusPassUpsellAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/PremiumBusPassUpsellAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusPassUpsellAppModel> serializer() {
            return PremiumBusPassUpsellAppModel$$serializer.f7103a;
        }
    }

    public /* synthetic */ PremiumBusPassUpsellAppModel(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(PremiumBusPassUpsellAppModel$$serializer.f7103a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f7102a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassUpsellAppModel)) {
            return false;
        }
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = (PremiumBusPassUpsellAppModel) obj;
        return Intrinsics.d(this.f7102a, premiumBusPassUpsellAppModel.f7102a) && Intrinsics.d(this.b, premiumBusPassUpsellAppModel.b) && this.c == premiumBusPassUpsellAppModel.c && Intrinsics.d(this.d, premiumBusPassUpsellAppModel.d) && Intrinsics.d(this.e, premiumBusPassUpsellAppModel.e) && Intrinsics.d(this.f, premiumBusPassUpsellAppModel.f) && Intrinsics.d(this.g, premiumBusPassUpsellAppModel.g) && Intrinsics.d(this.h, premiumBusPassUpsellAppModel.h) && Intrinsics.d(this.i, premiumBusPassUpsellAppModel.i) && this.j == premiumBusPassUpsellAppModel.j;
    }

    public final int hashCode() {
        int iE = nf1.e((nf1.e(this.f7102a.hashCode() * 31, 31, this.b) + this.c) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusPassUpsellAppModel(ruleId=", this.f7102a, ", configId=", this.b, ", fmId=");
        pk0.t(this.c, ", name=", this.d, ", desc=", sbE);
        cb0.t(sbE, this.e, ", perRideFareBeforeCopy=", this.f, ", perRideFareAfterCopy=");
        cb0.t(sbE, this.g, ", discountCopy=", this.h, ", upsellImageUrl=");
        sbE.append(this.i);
        sbE.append(", multiSeatAllowed=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public PremiumBusPassUpsellAppModel(String ruleId, String configId, int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Intrinsics.i(ruleId, "ruleId");
        Intrinsics.i(configId, "configId");
        this.f7102a = ruleId;
        this.b = configId;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = z;
    }
}

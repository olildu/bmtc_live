package app.chalo.premiumbus.data.models.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.s5;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ApplicableRuleAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(24)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7070a;
    public final String b;
    public final String c;
    public final String d;
    public final double e;
    public final List f;
    public final boolean g;
    public final int h;
    public final Long i;
    public final PremiumBusPassUpsellAppModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/ApplicableRuleAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ApplicableRuleAppModel> serializer() {
            return ApplicableRuleAppModel$$serializer.f7071a;
        }
    }

    public /* synthetic */ ApplicableRuleAppModel(int i, String str, String str2, String str3, String str4, double d, List list, boolean z, int i2, Long l, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(ApplicableRuleAppModel$$serializer.f7071a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f7070a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = list;
        this.g = z;
        this.h = i2;
        this.i = l;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = premiumBusPassUpsellAppModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicableRuleAppModel)) {
            return false;
        }
        ApplicableRuleAppModel applicableRuleAppModel = (ApplicableRuleAppModel) obj;
        return Intrinsics.d(this.f7070a, applicableRuleAppModel.f7070a) && Intrinsics.d(this.b, applicableRuleAppModel.b) && Intrinsics.d(this.c, applicableRuleAppModel.c) && Intrinsics.d(this.d, applicableRuleAppModel.d) && Double.compare(this.e, applicableRuleAppModel.e) == 0 && Intrinsics.d(this.f, applicableRuleAppModel.f) && this.g == applicableRuleAppModel.g && this.h == applicableRuleAppModel.h && Intrinsics.d(this.i, applicableRuleAppModel.i) && Intrinsics.d(this.j, applicableRuleAppModel.j);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f7070a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long jDoubleToLongBits = Double.doubleToLongBits(this.e);
        int iB = (((r30.b((iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.f) + (this.g ? 1231 : 1237)) * 31) + this.h) * 31;
        Long l = this.i;
        int iHashCode = (iB + (l == null ? 0 : l.hashCode())) * 31;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = this.j;
        return iHashCode + (premiumBusPassUpsellAppModel != null ? premiumBusPassUpsellAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ApplicableRuleAppModel(ruleId=", this.f7070a, ", ruleName=", this.b, ", categoryName=");
        cb0.t(sbE, this.c, ", priceOperator=", this.d, ", priceOperatorValue=");
        sbE.append(this.e);
        sbE.append(", uxCopy=");
        sbE.append(this.f);
        sbE.append(", multiSeatAllowed=");
        sbE.append(this.g);
        sbE.append(", ridesRemaining=");
        sbE.append(this.h);
        sbE.append(", expiryAt=");
        sbE.append(this.i);
        sbE.append(", upsellSuggestion=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public ApplicableRuleAppModel(String ruleId, String ruleName, String categoryName, String priceOperator, double d, ArrayList arrayList, boolean z, int i, Long l, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
        Intrinsics.i(ruleId, "ruleId");
        Intrinsics.i(ruleName, "ruleName");
        Intrinsics.i(categoryName, "categoryName");
        Intrinsics.i(priceOperator, "priceOperator");
        this.f7070a = ruleId;
        this.b = ruleName;
        this.c = categoryName;
        this.d = priceOperator;
        this.e = d;
        this.f = arrayList;
        this.g = z;
        this.h = i;
        this.i = l;
        this.j = premiumBusPassUpsellAppModel;
    }
}

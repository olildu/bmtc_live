package app.chalo.premiumbus.data.models.api.response;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ApplicableRuleApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new s5(23)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7014a;
    public final String b;
    public final String c;
    public final String d;
    public final Double e;
    public final List f;
    public final Boolean g;
    public final Integer h;
    public final Long i;
    public final PremiumBusUpsellSuggestionApiResponseModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/ApplicableRuleApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ApplicableRuleApiResponseModel> serializer() {
            return ApplicableRuleApiResponseModel$$serializer.f7015a;
        }
    }

    public /* synthetic */ ApplicableRuleApiResponseModel(int i, String str, String str2, String str3, String str4, Double d, List list, Boolean bool, Integer num, Long l, PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(ApplicableRuleApiResponseModel$$serializer.f7015a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f7014a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = list;
        this.g = bool;
        this.h = num;
        this.i = l;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = premiumBusUpsellSuggestionApiResponseModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicableRuleApiResponseModel)) {
            return false;
        }
        ApplicableRuleApiResponseModel applicableRuleApiResponseModel = (ApplicableRuleApiResponseModel) obj;
        return Intrinsics.d(this.f7014a, applicableRuleApiResponseModel.f7014a) && Intrinsics.d(this.b, applicableRuleApiResponseModel.b) && Intrinsics.d(this.c, applicableRuleApiResponseModel.c) && Intrinsics.d(this.d, applicableRuleApiResponseModel.d) && Intrinsics.d(this.e, applicableRuleApiResponseModel.e) && Intrinsics.d(this.f, applicableRuleApiResponseModel.f) && Intrinsics.d(this.g, applicableRuleApiResponseModel.g) && Intrinsics.d(this.h, applicableRuleApiResponseModel.h) && Intrinsics.d(this.i, applicableRuleApiResponseModel.i) && Intrinsics.d(this.j, applicableRuleApiResponseModel.j);
    }

    public final int hashCode() {
        String str = this.f7014a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.e;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel = this.j;
        return iHashCode9 + (premiumBusUpsellSuggestionApiResponseModel != null ? premiumBusUpsellSuggestionApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ApplicableRuleApiResponseModel(ruleId=", this.f7014a, ", ruleName=", this.b, ", categoryName=");
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

    public ApplicableRuleApiResponseModel(String str, String str2, String str3, String str4, Double d, ArrayList arrayList, Boolean bool, Integer num, Long l, PremiumBusUpsellSuggestionApiResponseModel premiumBusUpsellSuggestionApiResponseModel) {
        this.f7014a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = arrayList;
        this.g = bool;
        this.h = num;
        this.i = l;
        this.j = premiumBusUpsellSuggestionApiResponseModel;
    }
}

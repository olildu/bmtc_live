package app.chalo.premiumbus.data;

import app.chalo.models.SuperPassSubTypes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.tf1;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassPropertiesAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassPropertiesAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(20)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6967a;
    public final String b;
    public final SuperPassSubTypes c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassPropertiesAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/SuperPassPropertiesAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassPropertiesAppModel> serializer() {
            return SuperPassPropertiesAppModel$$serializer.f6968a;
        }
    }

    public /* synthetic */ SuperPassPropertiesAppModel(int i, String str, String str2, SuperPassSubTypes superPassSubTypes, String str3, String str4, String str5, String str6) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(SuperPassPropertiesAppModel$$serializer.f6968a.getDescriptor(), i, 127);
            throw null;
        }
        this.f6967a = str;
        this.b = str2;
        this.c = superPassSubTypes;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPropertiesAppModel)) {
            return false;
        }
        SuperPassPropertiesAppModel superPassPropertiesAppModel = (SuperPassPropertiesAppModel) obj;
        return Intrinsics.d(this.f6967a, superPassPropertiesAppModel.f6967a) && Intrinsics.d(this.b, superPassPropertiesAppModel.b) && this.c == superPassPropertiesAppModel.c && Intrinsics.d(this.d, superPassPropertiesAppModel.d) && Intrinsics.d(this.e, superPassPropertiesAppModel.e) && Intrinsics.d(this.f, superPassPropertiesAppModel.f) && Intrinsics.d(this.g, superPassPropertiesAppModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e((this.c.hashCode() + nf1.e(this.f6967a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassPropertiesAppModel(passId=", this.f6967a, ", productType=", this.b, ", productSubType=");
        sbE.append(this.c);
        sbE.append(", cityName=");
        sbE.append(this.d);
        sbE.append(", agencyName=");
        cb0.t(sbE, this.e, ", qrCode=", this.f, ", tone=");
        return vo1.p(sbE, this.g, ")");
    }

    public SuperPassPropertiesAppModel(String passId, String productType, SuperPassSubTypes productSubType, String str, String agencyName, String qrCode, String str2) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(qrCode, "qrCode");
        this.f6967a = passId;
        this.b = productType;
        this.c = productSubType;
        this.d = str;
        this.e = agencyName;
        this.f = qrCode;
        this.g = str2;
    }
}

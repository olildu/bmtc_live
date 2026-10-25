package app.chalo.superpass.data.models.entities;

import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.jf1;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.xs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassApplication;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassApplication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9563a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final SuperPassUserDetails j;
    public final SuperPassApplicationStatus k;
    public final Map l;
    public final CashPaymentPendingTransactionDetails m;
    public final PassApplicationRejectionReasons n;
    public final PassApplicationActionRequired o;
    public final RefundInfoEntityModel p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassApplication$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassApplication;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static SuperPassApplication a(BookableSuperPassConfiguration lBookableSuperPassConfiguration, long j, long j2, String lAgencyName, SuperPassUserDetails lSuperPassUserDetails, SuperPassApplicationStatus lSuperPassApplicationStatus, Map map, List lProofDocumentPropsList, String str, CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails) {
            String str2;
            Intrinsics.i(lBookableSuperPassConfiguration, "lBookableSuperPassConfiguration");
            Intrinsics.i(lAgencyName, "lAgencyName");
            Intrinsics.i(lSuperPassUserDetails, "lSuperPassUserDetails");
            Intrinsics.i(lSuperPassApplicationStatus, "lSuperPassApplicationStatus");
            Intrinsics.i(lProofDocumentPropsList, "lProofDocumentPropsList");
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Iterator it = lProofDocumentPropsList.iterator();
            while (it.hasNext()) {
                ProofDocumentProps proofDocumentProps = (ProofDocumentProps) it.next();
                map2.put(proofDocumentProps.f9539a, proofDocumentProps);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                Iterator it2 = lProofDocumentPropsList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str2 = "";
                        break;
                    }
                    ProofDocumentProps proofDocumentProps2 = (ProofDocumentProps) it2.next();
                    if (Intrinsics.d(str3, proofDocumentProps2.f9539a)) {
                        str2 = proofDocumentProps2.b;
                        break;
                    }
                }
                map3.put(str3, new SuperPassProofProperties(str2, str4, 0L));
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            String str5 = lBookableSuperPassConfiguration.f5569a;
            String str6 = lBookableSuperPassConfiguration.d.f8639a;
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = lBookableSuperPassConfiguration.c;
            int i = superPassProductConfigFareMappingResponseAppModel.b;
            String str7 = superPassProductConfigFareMappingResponseAppModel.h;
            if (str7.length() == 0) {
                long j3 = superPassProductConfigFareMappingResponseAppModel.f;
                str7 = j3 == 1 ? "1 Day" : j3 + " Days";
            }
            return new SuperPassApplication(lowerCase, lAgencyName, str5, str6, i, str7, lBookableSuperPassConfiguration.b.c, j, j2, lSuperPassUserDetails, lSuperPassApplicationStatus, map3, cashPaymentPendingTransactionDetails, null, null, null);
        }

        public final KSerializer<SuperPassApplication> serializer() {
            return SuperPassApplication$$serializer.f9564a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new Lazy[]{null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new jf1(27)), LazyKt.a(lazyThreadSafetyMode, new jf1(28)), null, null, LazyKt.a(lazyThreadSafetyMode, new jf1(29)), null};
    }

    public /* synthetic */ SuperPassApplication(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, long j, long j2, SuperPassUserDetails superPassUserDetails, SuperPassApplicationStatus superPassApplicationStatus, Map map, CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails, PassApplicationRejectionReasons passApplicationRejectionReasons, PassApplicationActionRequired passApplicationActionRequired, RefundInfoEntityModel refundInfoEntityModel) {
        if (65511 != (i & 65511)) {
            PluginExceptionsKt.b(SuperPassApplication$$serializer.f9564a.getDescriptor(), i, 65511);
            throw null;
        }
        this.f9563a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = -1;
        } else {
            this.e = i2;
        }
        this.f = str5;
        this.g = str6;
        this.h = j;
        this.i = j2;
        this.j = superPassUserDetails;
        this.k = superPassApplicationStatus;
        this.l = map;
        this.m = cashPaymentPendingTransactionDetails;
        this.n = passApplicationRejectionReasons;
        this.o = passApplicationActionRequired;
        this.p = refundInfoEntityModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SuperPassApplicationStatus getK() {
        return this.k;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9563a);
        sb.append("_");
        sb.append(this.b);
        sb.append("_");
        sb.append(this.c);
        return vo1.p(sb, "_", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassApplication)) {
            return false;
        }
        SuperPassApplication superPassApplication = (SuperPassApplication) obj;
        return Intrinsics.d(this.f9563a, superPassApplication.f9563a) && Intrinsics.d(this.b, superPassApplication.b) && Intrinsics.d(this.c, superPassApplication.c) && Intrinsics.d(this.d, superPassApplication.d) && this.e == superPassApplication.e && Intrinsics.d(this.f, superPassApplication.f) && Intrinsics.d(this.g, superPassApplication.g) && this.h == superPassApplication.h && this.i == superPassApplication.i && Intrinsics.d(this.j, superPassApplication.j) && this.k == superPassApplication.k && Intrinsics.d(this.l, superPassApplication.l) && Intrinsics.d(this.m, superPassApplication.m) && Intrinsics.d(this.n, superPassApplication.n) && this.o == superPassApplication.o && Intrinsics.d(this.p, superPassApplication.p);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((nf1.e(nf1.e(nf1.e(this.f9563a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + this.e) * 31, 31, this.f), 31, this.g);
        long j = this.h;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int iF = d.f(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31, 31);
        CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails = this.m;
        int iHashCode = (iF + (cashPaymentPendingTransactionDetails == null ? 0 : cashPaymentPendingTransactionDetails.hashCode())) * 31;
        PassApplicationRejectionReasons passApplicationRejectionReasons = this.n;
        int iHashCode2 = (iHashCode + (passApplicationRejectionReasons == null ? 0 : passApplicationRejectionReasons.hashCode())) * 31;
        PassApplicationActionRequired passApplicationActionRequired = this.o;
        int iHashCode3 = (iHashCode2 + (passApplicationActionRequired == null ? 0 : passApplicationActionRequired.hashCode())) * 31;
        RefundInfoEntityModel refundInfoEntityModel = this.p;
        return iHashCode3 + (refundInfoEntityModel != null ? refundInfoEntityModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassApplication(cityName=", this.f9563a, ", agencyName=", this.b, ", configId=");
        cb0.t(sbE, this.c, ", categoryId=", this.d, ", fareMappingId=");
        pk0.t(this.e, ", fareMappingDisplayName=", this.f, ", passName=", sbE);
        n21.p(this.h, this.g, ", passStartDate=", sbE);
        xs.r(this.i, ", verificationExpiryTime=", ", superPassUserDetails=", sbE);
        sbE.append(this.j);
        sbE.append(", superPassApplicationStatus=");
        sbE.append(this.k);
        sbE.append(", proofs=");
        sbE.append(this.l);
        sbE.append(", cashPaymentPendingTransactionDetails=");
        sbE.append(this.m);
        sbE.append(", passApplicationRejectionReasons=");
        sbE.append(this.n);
        sbE.append(", passApplicationActionRequired=");
        sbE.append(this.o);
        sbE.append(", refundInfo=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }

    public SuperPassApplication(String str, String agencyName, String configId, String categoryId, int i, String fareMappingDisplayName, String passName, long j, long j2, SuperPassUserDetails superPassUserDetails, SuperPassApplicationStatus superPassApplicationStatus, Map map, CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails, PassApplicationRejectionReasons passApplicationRejectionReasons, PassApplicationActionRequired passApplicationActionRequired, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(fareMappingDisplayName, "fareMappingDisplayName");
        Intrinsics.i(passName, "passName");
        Intrinsics.i(superPassUserDetails, "superPassUserDetails");
        Intrinsics.i(superPassApplicationStatus, "superPassApplicationStatus");
        this.f9563a = str;
        this.b = agencyName;
        this.c = configId;
        this.d = categoryId;
        this.e = i;
        this.f = fareMappingDisplayName;
        this.g = passName;
        this.h = j;
        this.i = j2;
        this.j = superPassUserDetails;
        this.k = superPassApplicationStatus;
        this.l = map;
        this.m = cashPaymentPendingTransactionDetails;
        this.n = passApplicationRejectionReasons;
        this.o = passApplicationActionRequired;
        this.p = refundInfoEntityModel;
    }
}

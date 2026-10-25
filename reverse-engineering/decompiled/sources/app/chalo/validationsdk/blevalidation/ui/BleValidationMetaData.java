package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/BleValidationMetaData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BleValidationMetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportProblemFeatureData f10607a;
    public final ProductValidationData b;
    public final Product c;
    public final BleValidationArgs d;
    public final String e;
    public final Long f;

    static {
        BleValidationArgs.Companion companion = BleValidationArgs.INSTANCE;
    }

    public BleValidationMetaData(ReportProblemFeatureData reportProblemFeatureData, ProductValidationData productValidationData, Product product, BleValidationArgs bleValidationArgs, String str, Long l) {
        Intrinsics.i(reportProblemFeatureData, "reportProblemFeatureData");
        Intrinsics.i(productValidationData, "productValidationData");
        this.f10607a = reportProblemFeatureData;
        this.b = productValidationData;
        this.c = product;
        this.d = bleValidationArgs;
        this.e = str;
        this.f = l;
    }

    public static BleValidationMetaData a(BleValidationMetaData bleValidationMetaData, String str, Long l) {
        ReportProblemFeatureData reportProblemFeatureData = bleValidationMetaData.f10607a;
        ProductValidationData productValidationData = bleValidationMetaData.b;
        Product product = bleValidationMetaData.c;
        BleValidationArgs bleValidationArgs = bleValidationMetaData.d;
        bleValidationMetaData.getClass();
        bleValidationMetaData.getClass();
        Intrinsics.i(reportProblemFeatureData, "reportProblemFeatureData");
        Intrinsics.i(productValidationData, "productValidationData");
        return new BleValidationMetaData(reportProblemFeatureData, productValidationData, product, bleValidationArgs, str, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationMetaData)) {
            return false;
        }
        BleValidationMetaData bleValidationMetaData = (BleValidationMetaData) obj;
        return Intrinsics.d(this.f10607a, bleValidationMetaData.f10607a) && Intrinsics.d(this.b, bleValidationMetaData.b) && this.c.equals(bleValidationMetaData.c) && this.d.equals(bleValidationMetaData.d) && Intrinsics.d(this.e, bleValidationMetaData.e) && Intrinsics.d(this.f, bleValidationMetaData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10607a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f;
        return (iHashCode2 + (l != null ? l.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "BleValidationMetaData(reportProblemFeatureData=" + this.f10607a + ", productValidationData=" + this.b + ", product=" + this.c + ", bleValidationArgs=" + this.d + ", transactionIdAfterValidationCompletion=" + this.e + ", punchTsInMillis=" + this.f + ", bleValidationAckData=null)";
    }
}

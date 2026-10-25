package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.NcmcCardAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/NcmcCardAndRechargeConfigResult;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NcmcCardAndRechargeConfigResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NcmcCardAppModel f6244a;
    public final NcmcCardRechargeConfigAppModel b;

    public NcmcCardAndRechargeConfigResult(NcmcCardAppModel ncmcCard, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfig) {
        Intrinsics.i(ncmcCard, "ncmcCard");
        Intrinsics.i(ncmcCardRechargeConfig, "ncmcCardRechargeConfig");
        this.f6244a = ncmcCard;
        this.b = ncmcCardRechargeConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcCardAndRechargeConfigResult)) {
            return false;
        }
        NcmcCardAndRechargeConfigResult ncmcCardAndRechargeConfigResult = (NcmcCardAndRechargeConfigResult) obj;
        return Intrinsics.d(this.f6244a, ncmcCardAndRechargeConfigResult.f6244a) && Intrinsics.d(this.b, ncmcCardAndRechargeConfigResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6244a.hashCode() * 31);
    }

    public final String toString() {
        return "NcmcCardAndRechargeConfigResult(ncmcCard=" + this.f6244a + ", ncmcCardRechargeConfig=" + this.b + ")";
    }
}

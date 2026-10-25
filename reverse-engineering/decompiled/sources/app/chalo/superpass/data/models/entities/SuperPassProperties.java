package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassProperties;", "Lapp/chalo/superpass/data/models/entities/SuperPassPrimaryProperties;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassProperties extends SuperPassPrimaryProperties {
    public final String f;
    public final String g;
    public final PremiumBusMeta h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassProperties(String passId, String productType, SuperPassSubType productSubType, String str, String agencyName, String qrCode, String str2, PremiumBusMeta premiumBusMeta) {
        super(passId, productType, productSubType, str, agencyName);
        Intrinsics.i(passId, "passId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(qrCode, "qrCode");
        this.f = qrCode;
        this.g = str2;
        this.h = premiumBusMeta;
    }
}

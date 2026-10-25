package app.chalo.superpass.data.models.entities;

import app.chalo.models.ProductBranding;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassUIProperties;", "Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideBasedSuperPassUIProperties extends SuperPassUIProperties {
    public final double m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPassUIProperties(int i, List list, SuperPassUserDetails superPassUserDetails, Map map, long j, FareInfo fareInfo, double d, String passName, String categoryName, ProductBranding productBranding, String fareMappingDisplayName, String fareMappingDescription, boolean z) {
        super(i, list, superPassUserDetails, map, j, fareInfo, passName, categoryName, productBranding, fareMappingDisplayName, z);
        Intrinsics.i(passName, "passName");
        Intrinsics.i(categoryName, "categoryName");
        Intrinsics.i(fareMappingDisplayName, "fareMappingDisplayName");
        Intrinsics.i(fareMappingDescription, "fareMappingDescription");
        this.m = d;
        this.n = fareMappingDescription;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getM() {
        return this.m;
    }
}

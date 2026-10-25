package app.chalo.superpass.data.models.pendingSuperPass;

import app.chalo.models.ProductBranding;
import app.chalo.superpass.data.models.entities.FareInfo;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPassUIProperties;", "Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingSuperPassUIProperties extends SuperPassUIProperties {
    public final double m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingSuperPassUIProperties(int i, List list, SuperPassUserDetails superPassUserDetails, Map map, long j, FareInfo fareInfo, String passName, String categoryName, ProductBranding productBranding, String fareMappingDisplayName, double d, String str) {
        super(i, list, superPassUserDetails, map, j, fareInfo, passName, categoryName, productBranding, fareMappingDisplayName, false);
        Intrinsics.i(passName, "passName");
        Intrinsics.i(categoryName, "categoryName");
        Intrinsics.i(fareMappingDisplayName, "fareMappingDisplayName");
        this.m = d;
        this.n = str;
    }
}

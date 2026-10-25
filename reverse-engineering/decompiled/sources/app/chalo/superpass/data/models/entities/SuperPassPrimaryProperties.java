package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassPrimaryProperties;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SuperPassPrimaryProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9566a;
    public final String b;
    public final SuperPassSubType c;
    public final String d;
    public final String e;

    public SuperPassPrimaryProperties(String passId, String productType, SuperPassSubType productSubType, String str, String agencyName) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(agencyName, "agencyName");
        this.f9566a = passId;
        this.b = productType;
        this.c = productSubType;
        this.d = str;
        this.e = agencyName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }
}

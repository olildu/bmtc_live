package app.chalo.superpass.data.models.entities;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassValidationProperties;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SuperPassValidationProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassStatus f9582a;
    public final long b;
    public final long c;
    public final long d;
    public final List e;
    public final boolean f;
    public final SuperPassRideDetails g;
    public final PassTierType h;
    public final Integer i;
    public final Integer j;
    public final boolean k;

    public SuperPassValidationProperties(SuperPassStatus status, long j, long j2, long j3, List serviceType, boolean z, SuperPassRideDetails superPassRideDetails, PassTierType tierType, Integer num, Integer num2, boolean z2) {
        Intrinsics.i(status, "status");
        Intrinsics.i(serviceType, "serviceType");
        Intrinsics.i(superPassRideDetails, "superPassRideDetails");
        Intrinsics.i(tierType, "tierType");
        this.f9582a = status;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = serviceType;
        this.f = z;
        this.g = superPassRideDetails;
        this.h = tierType;
        this.i = num;
        this.j = num2;
        this.k = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public SuperPassRideDetails getG() {
        return this.g;
    }
}

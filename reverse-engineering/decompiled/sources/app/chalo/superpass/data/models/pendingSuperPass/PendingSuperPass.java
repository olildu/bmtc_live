package app.chalo.superpass.data.models.pendingSuperPass;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPass;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingSuperPass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingSuperPassProperties f9583a;
    public final PendingSuperPassUIProperties b;
    public final PendingSuperPassRepurchaseProperties c;
    public final PendingSuperPassTransactionDetails d;

    public PendingSuperPass(PendingSuperPassProperties pendingSuperPassProperties, PendingSuperPassUIProperties pendingSuperPassUIProperties, PendingSuperPassRepurchaseProperties pendingSuperPassRepurchaseProperties, PendingSuperPassTransactionDetails pendingSuperPassTransactionDetails) {
        this.f9583a = pendingSuperPassProperties;
        this.b = pendingSuperPassUIProperties;
        this.c = pendingSuperPassRepurchaseProperties;
        this.d = pendingSuperPassTransactionDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PendingSuperPassUIProperties getB() {
        return this.b;
    }
}

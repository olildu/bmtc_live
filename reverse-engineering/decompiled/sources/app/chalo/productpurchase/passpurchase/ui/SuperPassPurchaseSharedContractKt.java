package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassPurchaseSharedContractKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseSharedState f8345a = new SuperPassPurchaseSharedState(Source.UNKNOWN, null, null, null, PassApplicationActionRequired.FRESH, null, null, null, null, null, 0, false, null, null, null, null, null, 260078);

    public static final Boolean a(SuperPassPurchaseSharedState superPassPurchaseSharedState) {
        Intrinsics.i(superPassPurchaseSharedState, "<this>");
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        if (bookableSuperPassConfiguration != null) {
            return Boolean.valueOf(bookableSuperPassConfiguration.d());
        }
        return null;
    }
}

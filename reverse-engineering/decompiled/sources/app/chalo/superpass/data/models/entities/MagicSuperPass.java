package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", "Lapp/chalo/superpass/data/models/entities/SuperPass;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MagicSuperPass extends SuperPass {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicSuperPass(SuperPassProperties superPassProperties, SuperPassValidationProperties superPassValidationProperties, SuperPassUIProperties superPassUIProperties, SuperPassRepurchaseProperties superPassRepurchaseProperties, SuperPassTransactionDetails superPassTransactionDetails, SuperPassTripPreferences superPassTripPreferences) {
        super(superPassProperties, superPassValidationProperties, superPassUIProperties, superPassRepurchaseProperties, superPassTransactionDetails, superPassTripPreferences);
        Intrinsics.i(superPassProperties, "superPassProperties");
        Intrinsics.i(superPassValidationProperties, "superPassValidationProperties");
    }
}

package app.chalo.ble_communication.passengerside.feature;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager", f = "PassengerSideConnectionPoolManager.kt", l = {156, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 80}, m = "createOrUpdateConnection", v = 1)
final class PassengerSideConnectionPoolManager$createOrUpdateConnection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PassengerSideConnectionPoolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengerSideConnectionPoolManager$createOrUpdateConnection$1(PassengerSideConnectionPoolManager passengerSideConnectionPoolManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passengerSideConnectionPoolManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}

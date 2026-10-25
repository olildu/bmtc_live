package app.chalo.ncmc.ui.ncmcofflinerecharge;

import com.google.android.gms.identity.intents.AddressConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1", f = "OfflineCardRechargeComponent.kt", l = {AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES}, m = "emit", v = 1)
final class OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1.AnonymousClass1<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1$1$emit$1(OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}

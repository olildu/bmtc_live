package app.chalo.walletframework.chalopay;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.chalopay.ChaloPayManagerImpl", f = "ChaloPayManagerImpl.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, WalletConstants.ERROR_CODE_UNKNOWN, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "processWalletStatusWithoutSync", v = 1)
final class ChaloPayManagerImpl$processWalletStatusWithoutSync$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloPayManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloPayManagerImpl$processWalletStatusWithoutSync$1(ChaloPayManagerImpl chaloPayManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloPayManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, this, false, false);
    }
}

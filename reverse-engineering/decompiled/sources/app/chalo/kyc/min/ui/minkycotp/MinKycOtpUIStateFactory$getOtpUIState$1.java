package app.chalo.kyc.min.ui.minkycotp;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIStateFactory", f = "MinKycOtpUIStateFactory.kt", l = {141, 155, 164, 167, 177, 186, 190, 193, ComposerKt.providerValuesKey}, m = "getOtpUIState", v = 1)
final class MinKycOtpUIStateFactory$getOtpUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MinKycOtpUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinKycOtpUIStateFactory$getOtpUIState$1(MinKycOtpUIStateFactory minKycOtpUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = minKycOtpUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}

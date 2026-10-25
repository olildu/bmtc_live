package app.chalo.premiumbus.common.domain;

import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.common.domain.PassUpsellPurchaseWrapperImpl", f = "PassUpsellPurchaseWrapperImpl.kt", l = {155}, m = "resolveBookableConfig", v = 1)
final class PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PassUpsellPurchaseWrapperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1(PassUpsellPurchaseWrapperImpl passUpsellPurchaseWrapperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passUpsellPurchaseWrapperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PassUpsellPurchaseWrapperImpl passUpsellPurchaseWrapperImpl = this.this$0;
        SuperPassUserDetails superPassUserDetails = PassUpsellPurchaseWrapperImpl.h;
        return passUpsellPurchaseWrapperImpl.c(null, 0, null, this);
    }
}

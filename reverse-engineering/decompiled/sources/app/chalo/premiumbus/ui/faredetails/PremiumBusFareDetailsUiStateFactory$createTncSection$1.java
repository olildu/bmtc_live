package app.chalo.premiumbus.ui.faredetails;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory", f = "PremiumBusFareDetailsUiStateFactory.kt", l = {616, 621, 626}, m = "createTncSection", v = 1)
final class PremiumBusFareDetailsUiStateFactory$createTncSection$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusFareDetailsUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusFareDetailsUiStateFactory$createTncSection$1(PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = premiumBusFareDetailsUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory = this.this$0;
        float f = PremiumBusFareDetailsUiStateFactory.c;
        return premiumBusFareDetailsUiStateFactory.i(null, null, false, null, this);
    }
}

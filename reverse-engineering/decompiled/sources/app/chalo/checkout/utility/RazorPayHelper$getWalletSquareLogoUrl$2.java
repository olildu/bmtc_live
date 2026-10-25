package app.chalo.checkout.utility;

import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.utility.RazorPayHelper$getWalletSquareLogoUrl$2", f = "RazorPayHelper.kt", l = {}, m = "invokeSuspend", v = 1)
final class RazorPayHelper$getWalletSquareLogoUrl$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $walletAppName;
    int label;
    final /* synthetic */ RazorPayHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RazorPayHelper$getWalletSquareLogoUrl$2(RazorPayHelper razorPayHelper, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = razorPayHelper;
        this.$walletAppName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RazorPayHelper$getWalletSquareLogoUrl$2(this.this$0, this.$walletAppName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RazorPayHelper$getWalletSquareLogoUrl$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RazorpaySdk razorpaySdk = this.this$0.f1626a;
        String walletName = this.$walletAppName;
        razorpaySdk.getClass();
        Intrinsics.i(walletName, "walletName");
        return razorpaySdk.a().getWalletSqLogoUrl(walletName);
    }
}

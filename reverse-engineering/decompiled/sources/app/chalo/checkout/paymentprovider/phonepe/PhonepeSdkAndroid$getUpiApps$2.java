package app.chalo.checkout.paymentprovider.phonepe;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonePeUpiApp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkAndroid$getUpiApps$2", f = "PhonepeSdk.android.kt", l = {52}, m = "invokeSuspend", v = 1)
final class PhonepeSdkAndroid$getUpiApps$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends PhonePeUpiApp>>, Object> {
    final /* synthetic */ String $merchantId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PhonepeSdkAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonepeSdkAndroid$getUpiApps$2(PhonepeSdkAndroid phonepeSdkAndroid, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = phonepeSdkAndroid;
        this.$merchantId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhonepeSdkAndroid$getUpiApps$2(this.this$0, this.$merchantId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PhonepeSdkAndroid$getUpiApps$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: Exception -> 0x0028, PhonePeInitException -> 0x002b, TryCatch #2 {PhonePeInitException -> 0x002b, Exception -> 0x0028, blocks: (B:6:0x0023, B:29:0x00b0, B:31:0x00b4, B:33:0x00b8, B:23:0x0067, B:25:0x006d, B:34:0x00c2, B:15:0x0039, B:22:0x004f, B:18:0x0042, B:20:0x004c), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: Exception -> 0x0028, PhonePeInitException -> 0x002b, TryCatch #2 {PhonePeInitException -> 0x002b, Exception -> 0x0028, blocks: (B:6:0x0023, B:29:0x00b0, B:31:0x00b4, B:33:0x00b8, B:23:0x0067, B:25:0x006d, B:34:0x00c2, B:15:0x0039, B:22:0x004f, B:18:0x0042, B:20:0x004c), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00af -> B:29:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkAndroid$getUpiApps$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

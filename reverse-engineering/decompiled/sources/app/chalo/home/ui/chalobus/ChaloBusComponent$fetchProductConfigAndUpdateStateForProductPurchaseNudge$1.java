package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1", f = "ChaloBusComponent.kt", l = {867, 868, 869, 873, 885, 895, 910, 923, 928, 938}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromId;
    final /* synthetic */ boolean $isLoggedIn;
    final /* synthetic */ PBOriginDestinationAppModel $prefilledODPairInfo;
    final /* synthetic */ String $routeId;
    final /* synthetic */ String $toId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1(ChaloBusComponent chaloBusComponent, String str, String str2, boolean z, String str3, PBOriginDestinationAppModel pBOriginDestinationAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
        this.$fromId = str;
        this.$toId = str2;
        this.$isLoggedIn = z;
        this.$routeId = str3;
        this.$prefilledODPairInfo = pBOriginDestinationAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1 chaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1 = new ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1(this.this$0, this.$fromId, this.$toId, this.$isLoggedIn, this.$routeId, this.$prefilledODPairInfo, continuation);
        chaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1.L$0 = obj;
        return chaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:31:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c A[PHI: r0 r12
      0x014c: PHI (r0v36 java.lang.Object) = (r0v29 java.lang.Object), (r0v43 java.lang.Object) binds: [B:40:0x0148, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r12v8 kotlinx.coroutines.CoroutineScope) = (r12v6 kotlinx.coroutines.CoroutineScope), (r12v9 kotlinx.coroutines.CoroutineScope) binds: [B:40:0x0148, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[PHI: r0 r12
      0x0185: PHI (r0v44 java.lang.Object) = (r0v40 java.lang.Object), (r0v53 java.lang.Object) binds: [B:43:0x0181, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r12v10 kotlinx.coroutines.CoroutineScope) = (r12v8 kotlinx.coroutines.CoroutineScope), (r12v12 kotlinx.coroutines.CoroutineScope) binds: [B:43:0x0181, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d8 A[PHI: r0
      0x01d8: PHI (r0v57 java.lang.Object) = (r0v48 java.lang.Object), (r0v63 java.lang.Object) binds: [B:55:0x01d4, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0204  */
    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:69:0x0264  */
    /* JADX WARN: Code duplicated, block: B:71:0x026a  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b0, code lost:
    
        if (r0 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        if (r0 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0290, code lost:
    
        if (r0 == r8) goto L73;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchProductConfigAndUpdateStateForProductPurchaseNudge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

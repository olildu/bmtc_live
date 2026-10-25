package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1", f = "PbPassPurchaseLandingScreenComponent.kt", l = {1375, 1383, 1421}, m = "invokeSuspend", v = 1)
final class PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $configId;
    final /* synthetic */ String $fromStopId;
    final /* synthetic */ PBOriginDestinationAppModel $originDestinationInfo;
    final /* synthetic */ String $routeId;
    final /* synthetic */ String $toStopId;
    Object L$0;
    int label;
    final /* synthetic */ PbPassPurchaseLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, String str, String str2, String str3, PBOriginDestinationAppModel pBOriginDestinationAppModel, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbPassPurchaseLandingScreenComponent;
        this.$configId = str;
        this.$fromStopId = str2;
        this.$toStopId = str3;
        this.$originDestinationInfo = pBOriginDestinationAppModel;
        this.$routeId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1(this.this$0, this.$configId, this.$fromStopId, this.$toStopId, this.$originDestinationInfo, this.$routeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r1 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014d, code lost:
    
        if (r1.a(r0, r16) == r6) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

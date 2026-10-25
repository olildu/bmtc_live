package app.chalo.home.ui.base;

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
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1", f = "HomeComponent.kt", l = {1941, 1959, 1961, 1969, 1979}, m = "invokeSuspend", v = 1)
final class HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0143 -> B:51:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:43:0x011a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$raiseAnalyticsEventForActivePremiumBusPasses$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

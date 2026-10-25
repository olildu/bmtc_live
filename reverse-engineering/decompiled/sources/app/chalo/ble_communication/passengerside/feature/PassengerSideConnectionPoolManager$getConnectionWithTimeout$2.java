package app.chalo.ble_communication.passengerside.feature;

import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ble_communication/passengerside/model/BLEPassengerSideDuplexConnection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$getConnectionWithTimeout$2", f = "PassengerSideConnectionPoolManager.kt", l = {47, 48, 50}, m = "invokeSuspend", v = 1)
final class PassengerSideConnectionPoolManager$getConnectionWithTimeout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BLEPassengerSideDuplexConnection>, Object> {
    final /* synthetic */ String $connectionId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PassengerSideConnectionPoolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengerSideConnectionPoolManager$getConnectionWithTimeout$2(PassengerSideConnectionPoolManager passengerSideConnectionPoolManager, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = passengerSideConnectionPoolManager;
        this.$connectionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PassengerSideConnectionPoolManager$getConnectionWithTimeout$2 passengerSideConnectionPoolManager$getConnectionWithTimeout$2 = new PassengerSideConnectionPoolManager$getConnectionWithTimeout$2(this.this$0, this.$connectionId, continuation);
        passengerSideConnectionPoolManager$getConnectionWithTimeout$2.L$0 = obj;
        return passengerSideConnectionPoolManager$getConnectionWithTimeout$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassengerSideConnectionPoolManager$getConnectionWithTimeout$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(100, r8) == r0) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:12:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r9)
            return r9
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
        L22:
            r9 = r1
            goto L33
        L24:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L4b
        L2c:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
        L33:
            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.e(r9)
            if (r1 == 0) goto L5a
            app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager r1 = r8.this$0
            java.lang.String r5 = r8.$connectionId
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager.a(r1, r5, r8)
            if (r1 != r0) goto L48
            goto L69
        L48:
            r7 = r1
            r1 = r9
            r9 = r7
        L4b:
            if (r9 != 0) goto L5a
            r8.L$0 = r1
            r8.label = r3
            r5 = 100
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r5, r8)
            if (r9 != r0) goto L22
            goto L69
        L5a:
            app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager r9 = r8.this$0
            java.lang.String r1 = r8.$connectionId
            r3 = 0
            r8.L$0 = r3
            r8.label = r2
            java.lang.Object r9 = app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager.a(r9, r1, r8)
            if (r9 != r0) goto L6a
        L69:
            return r0
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager$getConnectionWithTimeout$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

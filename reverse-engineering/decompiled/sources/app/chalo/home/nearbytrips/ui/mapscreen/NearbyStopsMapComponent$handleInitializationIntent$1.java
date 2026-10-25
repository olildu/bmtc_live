package app.chalo.home.nearbytrips.ui.mapscreen;

import androidx.compose.runtime.ComposerKt;
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
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$handleInitializationIntent$1", f = "NearbyStopsMapComponent.kt", l = {192, 195, ComposerKt.providerKey, 224}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NearbyStopsMapIntent.InitializationIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$handleInitializationIntent$1(NearbyStopsMapComponent nearbyStopsMapComponent, NearbyStopsMapIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyStopsMapComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent.F0(r2, r12, r5, r16) == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

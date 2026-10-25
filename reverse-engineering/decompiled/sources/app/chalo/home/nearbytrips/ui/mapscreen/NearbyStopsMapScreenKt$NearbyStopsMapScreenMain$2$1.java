package app.chalo.home.nearbytrips.ui.mapscreen;

import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.runtime.State;
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
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1", f = "NearbyStopsMapScreen.kt", l = {87, 91}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BottomSheetScaffoldState $bottomScaffoldState;
    final /* synthetic */ State<NearbyStopsMapState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1(BottomSheetScaffoldState bottomSheetScaffoldState, State state, Continuation continuation) {
        super(2, continuation);
        this.$bottomScaffoldState = bottomSheetScaffoldState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1(this.$bottomScaffoldState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r5.expand(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r5.partialExpand(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)
            goto L6a
        L19:
            kotlin.ResultKt.b(r5)
            androidx.compose.runtime.State<app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState> r5 = r4.$state$delegate
            java.lang.Object r5 = r5.getValue()
            app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState r5 = (app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState) r5
            boolean r5 = r5.n
            if (r5 == 0) goto L4f
            androidx.compose.material3.BottomSheetScaffoldState r5 = r4.$bottomScaffoldState
            androidx.compose.material3.SheetState r5 = r5.getBottomSheetState()
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L40
            androidx.compose.runtime.State<app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState> r5 = r4.$state$delegate
            java.lang.Object r5 = r5.getValue()
            app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState r5 = (app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState) r5
            app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel r5 = r5.i
            if (r5 == 0) goto L6a
        L40:
            androidx.compose.material3.BottomSheetScaffoldState r5 = r4.$bottomScaffoldState
            androidx.compose.material3.SheetState r5 = r5.getBottomSheetState()
            r4.label = r3
            java.lang.Object r5 = r5.expand(r4)
            if (r5 != r0) goto L6a
            goto L69
        L4f:
            androidx.compose.material3.BottomSheetScaffoldState r5 = r4.$bottomScaffoldState
            androidx.compose.material3.SheetState r5 = r5.getBottomSheetState()
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L6a
            androidx.compose.material3.BottomSheetScaffoldState r5 = r4.$bottomScaffoldState
            androidx.compose.material3.SheetState r5 = r5.getBottomSheetState()
            r4.label = r2
            java.lang.Object r5 = r5.partialExpand(r4)
            if (r5 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt$NearbyStopsMapScreenMain$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeableState f4454a;

    public SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState swipeableState) {
        this.f4454a = swipeableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo557onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float fM7512getXimpl = Velocity.m7512getXimpl(j2);
            float fM7513getYimpl = Velocity.m7513getYimpl(j2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(fM7512getXimpl)) << 32) | (((long) Float.floatToRawIntBits(fM7513getYimpl)) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0 = j2;
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label = 1;
            if (this.f4454a.f(fIntBitsToFloat, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0;
            ResultKt.b(obj);
        }
        return Velocity.m7503boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo558onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!NestedScrollSource.m5701equalsimpl0(i, NestedScrollSource.INSTANCE.m5709getDragWNlRxjI())) {
            return Offset.INSTANCE.m4381getZeroF1C5BW0();
        }
        return Offset.m4357constructorimpl((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(this.f4454a.e(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)))))) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo559onPreFlingQWom1Mo(long j, Continuation continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float fM7512getXimpl = Velocity.m7512getXimpl(j);
            float fM7513getYimpl = Velocity.m7513getYimpl(j);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(fM7512getXimpl)) << 32) | (((long) Float.floatToRawIntBits(fM7513getYimpl)) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
            if (fIntBitsToFloat < 0.0f) {
                SwipeableState swipeableState = this.f4454a;
                if (((Number) swipeableState.e.getValue()).floatValue() > swipeableState.k) {
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0 = j;
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label = 1;
                    if (swipeableState.f(fIntBitsToFloat, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    j = Velocity.INSTANCE.m7523getZero9UxMQ8M();
                }
            } else {
                j = Velocity.INSTANCE.m7523getZero9UxMQ8M();
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0;
            ResultKt.b(obj);
        }
        return Velocity.m7503boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo560onPreScrollOzD1aCk(long j, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        if (fIntBitsToFloat >= 0.0f || !NestedScrollSource.m5701equalsimpl0(i, NestedScrollSource.INSTANCE.m5709getDragWNlRxjI())) {
            return Offset.INSTANCE.m4381getZeroF1C5BW0();
        }
        float fE = this.f4454a.e(fIntBitsToFloat);
        return Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fE))));
    }
}

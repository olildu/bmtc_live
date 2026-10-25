package app.chalo.mticket.ui.passengerselection;

import androidx.media3.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1", f = "MTicketPassengerSelectionComponent.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketPassengerSelectionIntent.DecrementPassengerCount $intent;
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, MTicketPassengerSelectionIntent.DecrementPassengerCount decrementPassengerCount, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
        this.$intent = decrementPassengerCount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handleDecrementPassengerCount$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2 = ((MTicketPassengerSelectionDataState) this.this$0.f.getValue()).m;
            if (mTicketPassengerSelectionContainer2 != null) {
                String id = this.$intent.f5744a;
                Intrinsics.i(id, "id");
                List<MTicketPassengerItem> list = mTicketPassengerSelectionContainer2.f5741a;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                for (MTicketPassengerItem mTicketPassengerItemA : list) {
                    if (Intrinsics.d(mTicketPassengerItemA.f5734a, id) && mTicketPassengerItemA.f && (i = mTicketPassengerItemA.c) > mTicketPassengerItemA.e) {
                        mTicketPassengerItemA = MTicketPassengerItem.a(mTicketPassengerItemA, i - 1, 59);
                    }
                    arrayList.add(mTicketPassengerItemA);
                }
                mTicketPassengerSelectionContainer = new MTicketPassengerSelectionContainer(arrayList);
            } else {
                mTicketPassengerSelectionContainer = null;
            }
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            this.label = 1;
            if (MTicketPassengerSelectionComponent.S0(mTicketPassengerSelectionComponent, mTicketPassengerSelectionContainer, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}

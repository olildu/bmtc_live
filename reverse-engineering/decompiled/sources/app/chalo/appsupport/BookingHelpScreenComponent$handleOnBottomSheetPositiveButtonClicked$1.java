package app.chalo.appsupport;

import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.BookingCancellationTarget;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appsupport.BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1", f = "BookingHelpScreenComponent.kt", l = {247}, m = "invokeSuspend", v = 1)
final class BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BookingHelpBottomSheetType $bottomSheetType;
    int label;
    final /* synthetic */ BookingHelpScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1(BookingHelpBottomSheetType bookingHelpBottomSheetType, BookingHelpScreenComponent bookingHelpScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetType = bookingHelpBottomSheetType;
        this.this$0 = bookingHelpScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1(this.$bottomSheetType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BookingHelpBottomSheetType bookingHelpBottomSheetType = this.$bottomSheetType;
            if (Intrinsics.d(bookingHelpBottomSheetType, BookingHelpBottomSheetType.CancellationError.f962a) || (bookingHelpBottomSheetType instanceof BookingHelpBottomSheetType.CancellationFailed)) {
                BookingHelpScreenComponent bookingHelpScreenComponent = this.this$0;
                BookingCancellationTarget bookingCancellationTarget = ((BookingHelpScreenDataState) bookingHelpScreenComponent.f.getValue()).b;
                this.label = 1;
                if (BookingHelpScreenComponent.F0(bookingHelpScreenComponent, bookingCancellationTarget, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (Intrinsics.d(bookingHelpBottomSheetType, BookingHelpBottomSheetType.CancellationInitiated.f964a) || Intrinsics.d(bookingHelpBottomSheetType, BookingHelpBottomSheetType.CancellationSuccess.f965a)) {
                ChaloNavigationManagerKt.c(this.this$0.p);
            } else if (!Intrinsics.d(bookingHelpBottomSheetType, BookingHelpBottomSheetType.None.f966a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}

package app.chalo.appsupport;

import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appsupport.BookingHelpScreenComponent$handleOnFaqActionClicked$1", f = "BookingHelpScreenComponent.kt", l = {90}, m = "invokeSuspend", v = 1)
final class BookingHelpScreenComponent$handleOnFaqActionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BookingHelpFaqActionType $faqActionType;
    int label;
    final /* synthetic */ BookingHelpScreenComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f968a;

        static {
            int[] iArr = new int[BookingHelpFaqActionType.values().length];
            try {
                iArr[BookingHelpFaqActionType.CANCEL_BOOKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingHelpFaqActionType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f968a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingHelpScreenComponent$handleOnFaqActionClicked$1(BookingHelpFaqActionType bookingHelpFaqActionType, BookingHelpScreenComponent bookingHelpScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.$faqActionType = bookingHelpFaqActionType;
        this.this$0 = bookingHelpScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BookingHelpScreenComponent$handleOnFaqActionClicked$1(this.$faqActionType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BookingHelpScreenComponent$handleOnFaqActionClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = WhenMappings.f968a[this.$faqActionType.ordinal()];
            if (i2 == 1) {
                BookingHelpScreenComponent bookingHelpScreenComponent = this.this$0;
                BookingCancellationTarget bookingCancellationTarget = ((BookingHelpScreenDataState) bookingHelpScreenComponent.f.getValue()).b;
                this.label = 1;
                if (BookingHelpScreenComponent.F0(bookingHelpScreenComponent, bookingCancellationTarget, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 != 2) {
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

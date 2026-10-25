package app.chalo.bookingsuccess;

import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.scenes.args.BookingSuccessArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.xb;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessDataState;", "Lapp/chalo/bookingsuccess/BookingSuccessViewState;", "Lapp/chalo/bookingsuccess/BookingSuccessEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingSuccessComponent extends ChaloBaseStateMviComponent<BookingSuccessIntent, BookingSuccessDataState, BookingSuccessViewState, BookingSuccessEffect> {
    public final ComponentContext k;
    public final BookingSuccessFlowDelegate l;

    /* JADX INFO: renamed from: app.chalo.bookingsuccess.BookingSuccessComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.bookingsuccess.BookingSuccessComponent$1", f = "BookingSuccessComponent.kt", l = {17}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BookingSuccessComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = BookingSuccessComponent.this.l.getState();
                final BookingSuccessComponent bookingSuccessComponent = BookingSuccessComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.bookingsuccess.BookingSuccessComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        bookingSuccessComponent.E0(new xb((BookingSuccessDataState) obj2, 0));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.bookingsuccess.BookingSuccessComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.bookingsuccess.BookingSuccessComponent$2", f = "BookingSuccessComponent.kt", l = {23}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BookingSuccessComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = BookingSuccessComponent.this.l.getState();
                final BookingSuccessComponent bookingSuccessComponent = BookingSuccessComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.bookingsuccess.BookingSuccessComponent.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        bookingSuccessComponent.E0(new xb((BookingSuccessDataState) obj2, 1));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingSuccessComponent(ComponentContext componentContext, BookingSuccessArgs args, BookingSuccessFlowDelegate bookingSuccessFlowDelegate) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = componentContext;
        this.l = bookingSuccessFlowDelegate;
        F0(BookingSuccessIntent.InitializationIntent.f1150a);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    public final void F0(BookingSuccessIntent bookingSuccessIntent) {
        C0(bookingSuccessIntent);
        boolean z = bookingSuccessIntent instanceof BookingSuccessIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        BookingSuccessFlowDelegate bookingSuccessFlowDelegate = this.l;
        if (z) {
            bookingSuccessFlowDelegate.c(contextScope);
            return;
        }
        if (bookingSuccessIntent instanceof BookingSuccessIntent.OnPositiveBtnClickedIntent) {
            bookingSuccessFlowDelegate.e(contextScope);
        } else if (bookingSuccessIntent instanceof BookingSuccessIntent.OnNegativeBtnClickedIntent) {
            bookingSuccessFlowDelegate.d(contextScope);
        } else {
            if (!(bookingSuccessIntent instanceof BookingSuccessIntent.OnAnimationCompletedIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            bookingSuccessFlowDelegate.b(contextScope);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return this.l.a(this.j, (BookingSuccessDataState) obj);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new BookingSuccessDataState(null, null, 15);
    }
}

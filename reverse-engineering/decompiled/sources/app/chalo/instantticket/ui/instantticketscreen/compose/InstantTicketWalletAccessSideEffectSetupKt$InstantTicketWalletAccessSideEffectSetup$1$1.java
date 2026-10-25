package app.chalo.instantticket.ui.instantticketscreen.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1", f = "InstantTicketWalletAccessSideEffectSetup.kt", l = {22}, m = "invokeSuspend", v = 1)
final class InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstantTicketWalletAccessComponent $instantTicketWalletAccessComponent;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ SheetState $modalBottomSheetState;
    int label;

    /* JADX INFO: renamed from: app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessSideEffect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1$1", f = "InstantTicketWalletAccessSideEffectSetup.kt", l = {24, 28}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<InstantTicketWalletAccessSideEffect, Continuation<? super Unit>, Object> {
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ SheetState $modalBottomSheetState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, SoftwareKeyboardController softwareKeyboardController, Continuation continuation) {
            super(2, continuation);
            this.$modalBottomSheetState = sheetState;
            this.$keyboardController = softwareKeyboardController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$modalBottomSheetState, this.$keyboardController, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((InstantTicketWalletAccessSideEffect) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r5.hide(r4) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        
            if (r5.show(r4) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        
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
                goto L5e
            L19:
                kotlin.ResultKt.b(r5)
                java.lang.Object r5 = r4.L$0
                app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect r5 = (app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect) r5
                app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect$CloseBottomSheet r1 = app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect.CloseBottomSheet.f3957a
                boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
                if (r1 == 0) goto L33
                androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
                r4.label = r3
                java.lang.Object r5 = r5.hide(r4)
                if (r5 != r0) goto L5e
                goto L5d
            L33:
                app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect$HideKeyboard r1 = app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect.HideKeyboard.f3958a
                boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
                if (r1 == 0) goto L43
                androidx.compose.ui.platform.SoftwareKeyboardController r5 = r4.$keyboardController
                if (r5 == 0) goto L5e
                r5.hide()
                goto L5e
            L43:
                app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect$OpenBottomSheet r1 = app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessSideEffect.OpenBottomSheet.f3959a
                boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
                if (r5 == 0) goto L61
                androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
                boolean r5 = r5.isVisible()
                if (r5 != 0) goto L5e
                androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
                r4.label = r2
                java.lang.Object r5 = r5.show(r4)
                if (r5 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r5 = kotlin.Unit.f17538a
                return r5
            L61:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, SheetState sheetState, SoftwareKeyboardController softwareKeyboardController, Continuation continuation) {
        super(2, continuation);
        this.$instantTicketWalletAccessComponent = instantTicketWalletAccessComponent;
        this.$modalBottomSheetState = sheetState;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1(this.$instantTicketWalletAccessComponent, this.$modalBottomSheetState, this.$keyboardController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstantTicketWalletAccessSideEffectSetupKt$InstantTicketWalletAccessSideEffectSetup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.$instantTicketWalletAccessComponent.F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$modalBottomSheetState, this.$keyboardController, null);
            this.label = 1;
            if (FlowKt.j(flow, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
